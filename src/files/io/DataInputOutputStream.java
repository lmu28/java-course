package files.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * позволяют работать с примитивными типами данных
 *
 *
 */
public class DataInputOutputStream {
    public static void main(String[] args) {

        try(DataInputStream inputStream = new DataInputStream(new FileInputStream("resources\\files\\test1.bin"));
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("resources\\files\\test1.bin"))

        ) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeDouble(5.6);
            outputStream.writeChars("dadaasdas");
            outputStream.writeChar('d');

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readDouble());


            int length = inputStream.available(); // получить количество байт в потоке
            char[] characters = new char[length/2]; //каждый символ занимает 2 байта
            byte[] bytes = new byte[length];
            inputStream.readFully(bytes);
            ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asCharBuffer().get(characters); // конвертировать байты в символы
            for(char c: characters){
                System.out.println(c);
            }



           // System.out.println(inputStream.readChar());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
