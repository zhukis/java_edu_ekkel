package io.nio.getprimitives;

import java.nio.ByteBuffer;

public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i = 0;

        while (i++ < bb.limit())
            if (bb.get() != 0)
                System.out.println("nonzero");

        System.out.println("i = " + i);
        bb.rewind();

        // Save and read symbolic array
        bb.asCharBuffer().put("Howdy!");
        char c;
        while ((c = bb.getChar()) != 0)
            System.out.print(c + " ");
        System.out.println();
        bb.rewind();

        // Save and read short
        bb.asShortBuffer().put((short) 471142);
        System.out.println(bb.getShort());
        bb.rewind();

        // Save and read int
        bb.asIntBuffer().put(99471142);
        System.out.println(bb.getInt());
        bb.rewind();

        // Save and read long
        bb.asLongBuffer().put(99471142);
        System.out.println(bb.getLong());
        bb.rewind();

        // Save and read float
        bb.asFloatBuffer().put(99471142);
        System.out.println(bb.getFloat());
        bb.rewind();

        // Double
        bb.asDoubleBuffer().put(99471142);
        System.out.println(bb.getDouble());
        bb.rewind();
    }
}
