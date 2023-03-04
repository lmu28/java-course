package files.io;

import java.io.*;

/**
 * Buffer(Reader|Writer) - намного эффективнее использовать при чтении/записи
 * обычные Reader|Writer для каждого символа обращаются к файлу, buffer же значительно меньшее
 * кол-во раз обращается к файлу(за счет буфера(он сразу заносит нек кол-во символов))
 *
 *
 */
public class BufferReaderWriter {
    public static void main(String[] args) {

//создание файла
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"))){
//            bw.write("qwerty\nasdfgh\nzxcvbn");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.exit(0);



        try(BufferedReader br = new BufferedReader(new FileReader("resources\\files\\test1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("resources\\files\\test2.txt"));
            // try catch with resources - автоматически закроет все что создано (перечисляемые сущности должны impl Autocloseable)
        ) {


//            int character;
//            while((character = br.read())!=-1){
//                bw.write(character);
//            }


            String line;
            while((line = br.readLine()) != null){
                bw.write(line+"\n");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
