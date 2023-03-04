package files.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {

    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("resources\\files\\ChannelBufferWtite.txt","rw"))
        {
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer buffer =ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind(); // указатель в буфере идет на нулевую ячейку
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("-----------------------------------------------");
            /**
             * mark() - стивим отметку на позиции указателя
             * reset() - Возвращаемся на позицию, которую мы пометили mark
             */
            buffer.rewind();
            System.out.println((char)buffer.get());
            buffer.mark();
            //buffer.rewind();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();
            System.out.println((char)buffer.get());






        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
