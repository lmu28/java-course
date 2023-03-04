package files.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * RandomAccessFileEx - позволяет читать/записывать в файл в любом месте файлы
 * RandomAccessFileEx(path,mode); mode - что можно делать с файлом (rw - read,write)
 *
 *
 */
public class RandomAccessFileEx {

    public static void main(String[] args) {



        try(RandomAccessFile file = new RandomAccessFile("resources\\files\\randomAcessFile.txt","rw"))
        {

//            int a = file.read(); // читает 1 байт с позиции, где в данный момент находится указатель(вначале)
//            System.out.println((char)a);
//            String s1 = file.readLine();
//            System.out.println(s1);
//            file.seek(101); // переводит поинтер на 101 позицию
//            String s2 = file.readLine();
//            System.out.println(s2);
//            System.out.println(file.getFilePointer()); // получаем позицию указателя
//            file.seek(0);
//            file.writeBytes("Privet");
//            file.seek(file.length()-1);
//            file.writeBytes("\n\t\t\t\t end");


            file.seek(1);
            String line  = file.readLine();
            byte[] buffer2 = new byte[line.length()];
            buffer2 = line.getBytes("UTF-8");

            //byte[] buffer = new byte[(int) file.length()];
            //file.readFully(buffer); // читает с позиции поинтера и до конца
            //String content = new String(buffer, "UTF-8");
            //System.out.println(content);

            System.out.println(new String(buffer2,"UTF-8"));

            //file.write("Привет".getBytes("UTF-8")); // для записи кириллицы


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
