package X;

import com.whatsapp.util.Log;
import java.io.Writer;

/* renamed from: X.205  reason: invalid class name */
public class AnonymousClass205 extends Writer {
    public StringBuilder A00 = new StringBuilder(16384);

    public void close() {
        if (this.A00 != null) {
            try {
                flush();
            } finally {
                this.A00 = null;
            }
        }
    }

    public void flush() {
        StringBuilder sb = this.A00;
        if (sb != null) {
            int i = Log.level;
            if (sb.length() >= 262144) {
                sb.append("...");
            }
            C18310x6.A1L("LL_D ", sb.toString(), i, 4);
            this.A00 = AnonymousClass001.A0o();
            return;
        }
        throw AnonymousClass002.A0C("Stream closed");
    }

    public void write(String str, int i, int i2) {
        StringBuilder sb = this.A00;
        if (sb == null) {
            throw AnonymousClass002.A0C("Stream closed");
        } else if (sb.length() < 262144) {
            sb.append(str, i, i2);
        }
    }

    public void write(int i) {
        StringBuilder sb = this.A00;
        if (sb == null) {
            throw AnonymousClass002.A0C("Stream closed");
        } else if (sb.length() < 262144) {
            sb.append((char) i);
        }
    }

    public void write(char[] cArr, int i, int i2) {
        StringBuilder sb = this.A00;
        if (sb == null) {
            throw AnonymousClass002.A0C("Stream closed");
        } else if (sb.length() < 262144) {
            sb.append(cArr, i, i2);
        }
    }
}
