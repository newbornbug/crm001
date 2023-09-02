package com.cyn.io;

import org.junit.Test;

import java.io.*;

/**
 * @author 程亚宁
 * @version 1.0
 */
public class output {

    @Test
    public void writeFile(){
        String srcPath = "C:\\Users\\ASUS\\Desktop\\1.txt";
        String outPath = "C:\\Users\\ASUS\\Desktop\\2.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String s= null;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcPath));
            bufferedWriter = new BufferedWriter(new FileWriter(outPath));
            while ((s = bufferedReader.readLine()) != null){
            bufferedWriter.write(s.replace("sqeyesights","chengyn"));
                System.out.println(s.replace("sqeyesights","chengyn"));
            bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println(s);
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
@Test
    public void data(){
        String srcfilePath = "D:\\Test.txt";
        FileInputStream fileInputStream = null;
        char[] bytes = new char[11];

    try {
            int redData = 0;
            int i = 0;
            fileInputStream =new FileInputStream(srcfilePath);
            while ((redData = fileInputStream.read()) != -1){
                if(i==11){
                i=0;
                }
                bytes[i]=(char)redData;
                i++;
                System.out.println(bytes);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
