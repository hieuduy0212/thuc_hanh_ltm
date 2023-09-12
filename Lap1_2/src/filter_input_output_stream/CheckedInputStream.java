/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filter_input_output_stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author DELLLTT5521
 */
public class CheckedInputStream extends FilterInputStream {

    private Checksum cksum;

    public CheckedInputStream(InputStream in, Checksum cksum) {
        super(in);
        this.cksum = cksum;
    }

    public int read() throws IOException {
        int b = in.read();
        if (b != -1) {
            cksum.update(b);
        }
        return b;
    }

    public int read(byte[] b) throws IOException {
        int len;
        len = in.read(b, 0, b.length);
        if (len != -1) {
            cksum.update(b, 0, len);
        }
        return len;
    }

    public int read(byte[] b, int off, int len) throws IOException {
        len = in.read(b, off, len);
        if (len != -1) {
            cksum.update(b, off, len);
        }
        return len;
    }

    public Checksum getChecksum() {
        return cksum;
    }

}
