package com.robonco.javatutorial.basic_io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;

public class FindInt {
    private static final String filename = "C:\\Users\\rlrek\\Documents\\projects\\java-tutorials\\basic_io\\src\\main\\data\\datafile";

    public static void main(String[] args) {

        Path infile = Paths.get(filename);

        try (FileChannel fc = FileChannel.open(infile, READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
            System.out.println("Reading offset");
            int nread = fc.read(buffer);
            System.out.println("     Read " + nread + " bytes.");
            if (nread < 8) {
                throw new RuntimeException("Unable to read offset value.");
            }

            long offset = buffer.flip().getLong();

            System.out.printf("Get value at offset = %X%n", offset);

            fc.position(offset);

            buffer = ByteBuffer.allocate(Integer.BYTES);

            nread = fc.read(buffer);
            if (nread < 4) {
                throw new RuntimeException("Unable to read int at offset " + offset);
            }

            int value = buffer.flip().getInt();
            System.out.printf("Read value %x at offset %x%n", value, offset);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
