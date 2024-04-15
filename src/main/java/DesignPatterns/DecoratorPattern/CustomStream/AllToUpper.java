package DesignPatterns.DecoratorPattern.CustomStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class AllToUpper extends FilterInputStream {

    protected AllToUpper(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
       int nextByte=in.read();
       if(nextByte==-1) return nextByte;
       char a=(char) nextByte;
       char ua=Character.toUpperCase(a);
//       System.out.println("current char "+a);
//       System.out.println("converting to "+Character.toUpperCase(a));
       return (int)ua;
    }


}
