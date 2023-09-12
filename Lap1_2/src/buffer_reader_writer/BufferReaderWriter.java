/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffer_reader_writer;

/**
 *
 * @author DELLLTT5521
 */
public class BufferReaderWriter {

    public static void main(String[] args) {

        String a0, a1, a2;
        if (args.length != 3) {
            a0 = "words.txt";
            a1 = "wordsout.txt";
            a2 = "3";
        } else {
            a0 = args[0];
            a1 = args[1];
            a2 = args[2];
        }
        SimpleEncryption se = new SimpleEncryption();
        se.encrypt(a0, a1, Integer.parseInt(a2));/* print content of encrypted file */
        System.out.println("Displaying encrypted words from words.txt...");
        se.viewFileContent(a1);
        System.out.println("----------------------deencrypt-------");
        se.viewOrigin(a1, 3);
    }

}
