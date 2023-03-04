package files.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferWrite {

    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("resources\\files\\ChannelBufferWtite.txt","rw")){

            FileChannel channel = file.getChannel();
//            ByteBuffer buffer = ByteBuffer.allocate(25);
//            CharBuffer charBuffer = CharBuffer.allocate(25);

            String text = "There are only two ways to live your life.\n"+
                    "One is as though nothing is a miracle.\n"+
                    "The other is as though everything is a miracle\n";

           // String text2 = "АБВГ еёжз\n"+
           //         "аыаы ыдаьыа,  аыва!!!\n";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            //ByteBuffer buffer2 = ByteBuffer.allocate(text.length());
           //buffer2.put(text.getBytes());
           //buffer2.flip();
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
