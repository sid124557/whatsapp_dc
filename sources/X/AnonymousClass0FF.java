package X;

import android.util.Log;
import java.io.Writer;

/* renamed from: X.0FF  reason: invalid class name */
public final class AnonymousClass0FF extends Writer {
    public StringBuilder A00 = new StringBuilder(128);
    public final String A01 = "FragmentManager";

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                A00();
            } else {
                this.A00.append(c);
            }
        }
    }

    public final void A00() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            Log.d(this.A01, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        A00();
    }

    public void flush() {
        A00();
    }
}
