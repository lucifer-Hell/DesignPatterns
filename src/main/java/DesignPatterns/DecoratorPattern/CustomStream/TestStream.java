package DesignPatterns.DecoratorPattern.CustomStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestStream {
    public static void main(String[] args) throws IOException {
        String str= "This is a test ";
        InputStream inputStream=new ByteArrayInputStream(str.getBytes());
        AllToUpper allToUpperStream=new AllToUpper(inputStream);
        int val= allToUpperStream.read();
        while (val!=-1){
            System.out.println("current char "+((char)val));
            val=allToUpperStream.read();
        }
    }
}
