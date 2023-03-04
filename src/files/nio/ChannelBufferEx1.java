package files.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ChannelBufferEx1 {
    public static void main(String[] args) {


        try(RandomAccessFile file = new RandomAccessFile("resources\\files\\randomAcessFile.txt","rw");
            FileChannel channel = file.getChannel();){


            ByteBuffer buffer = ByteBuffer.allocate(25);// может содержать только 25 байт, если будет больше, выбросится исключение
            CharBuffer charBuffer = CharBuffer.allocate(25); // для декодирования байтов в символы
            StringBuilder stih = new StringBuilder();
            int byteRead = channel.read(buffer);
            CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();


            while (byteRead > 0){
                System.out.println("Прочитано " + byteRead);
                buffer.flip(); // меняет режим буфера из записи ---> чтение;


                decoder.decode(buffer, charBuffer, false); // декодируем байты в символы
                charBuffer.flip(); // подготавливаем символьный буфер для чтения

                stih.append(charBuffer);

                charBuffer.clear();
                buffer.compact();
                /**
                 * ByteBuffer.compact() - это метод, который перемещает все
                 * не прочитанные байты в начало буфера и сдвигает позицию
                 * на количество прочитанных байтов. Таким образом, он позволяет
                 * избежать проблем с частичным чтением данных и позволяет использовать
                 * буфер повторно для чтения следующих данных.
                 *
                 * для распознавания кириллицы (есть проблема с буфером т.к разные символы
                 * могут занисать 1-4 байт нет гарантии, что некоторые символы корректно запишутся в буфер)
                 *
                 */
//                charBuffer.clear(); // ставим позицию буфера на нулевой элемент(для записи(переходим в режим записи))
                byteRead = channel.read(buffer);
            }
            System.out.println(stih);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
