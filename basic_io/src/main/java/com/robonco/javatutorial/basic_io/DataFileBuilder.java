package com.robonco.javatutorial.basic_io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import static java.nio.file.StandardOpenOption.*;

public class DataFileBuilder {
    private static final String filename = "C:\\Users\\rlrek\\Documents\\projects\\java-tutorials\\basic_io\\src\\main\\data\\datafile";

    public static void main(String[] args) {
        final int targetValue = 0xCAFEBABE;
        final int numValues = 100;
        final int targetIndex = 50;
        final long targetOffset = Long.BYTES + (targetIndex * Integer.BYTES);
        System.out.println("targetOffset = " + targetOffset);

        Path outfile = Paths.get(filename);

        Set<OpenOption> options = new HashSet<OpenOption>();
        options.add(TRUNCATE_EXISTING);
        options.add(WRITE);

        try (SeekableByteChannel sbc = Files.newByteChannel(outfile, options)) {
            ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES).putLong(targetOffset).flip();
            sbc.write(buffer);

            for (int i=0; i<numValues; i++) {
                buffer = ByteBuffer.allocate(Integer.BYTES);

                if (i == targetIndex) {
                    System.out.printf("Printing value[%d] = %x at offset %X%n", i, targetValue, sbc.position());
                    buffer.putInt(targetValue).flip();
                } else {
                    System.out.printf("Printing value[%d] = %x at offset %X%n", i, i, sbc.position());
                    buffer.putInt(i).flip();
                }
                sbc.write(buffer);
            }

        } catch (IOException e) {
            System.err.println(e);
            System.exit(666);
        }
    }
}
