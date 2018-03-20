package patterns.structural.decorator.inbuilt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(final InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        final int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        final int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
