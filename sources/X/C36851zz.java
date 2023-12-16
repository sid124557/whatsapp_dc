package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.net.URLConnection;

/* renamed from: X.1zz  reason: invalid class name and case insensitive filesystem */
public class C36851zz extends InputStream {
    public final C56492s4 A00;
    public final InputStream A01;
    public final Integer A02;
    public final Integer A03;

    public static C36851zz A01(C56492s4 r4, URLConnection uRLConnection, int i) {
        return new C36851zz(r4, uRLConnection.getInputStream(), (Integer) null, Integer.valueOf(i));
    }

    public synchronized void reset() {
        Log.w("reset called in MessageInputStream");
    }

    public void A02(int i) {
        Integer num = this.A02;
        if (num != null) {
            C56492s4 r3 = this.A00;
            int intValue = num.intValue();
            C18910yS r1 = r3.A00;
            C626936e.A0C(AnonymousClass000.A1W(r1));
            Message.obtain(r1, 3, intValue, i).sendToTarget();
            r3.A02();
        }
        this.A00.A03(i, this.A03.intValue());
    }

    public void A03(long j) {
        Integer num = this.A02;
        if (num != null) {
            this.A00.A04(j, num.intValue());
        }
        this.A00.A05(j, this.A03.intValue());
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i) {
        Log.w("mark called in MessageInputStream");
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        if (read > 0) {
            A02(read);
        }
        return read;
    }

    public long skip(long j) {
        long skip = this.A01.skip(j);
        A03(skip);
        return skip;
    }

    public C36851zz(C56492s4 r1, InputStream inputStream, Integer num, Integer num2) {
        this.A01 = inputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public static C36851zz A00(C56492s4 r2, Integer num, Integer num2, URLConnection uRLConnection) {
        return new C36851zz(r2, uRLConnection.getInputStream(), num, num2);
    }

    public int read(byte[] bArr) {
        int read = this.A01.read(bArr);
        if (read > 0) {
            A02(read);
        }
        return read;
    }

    public int read() {
        int read = this.A01.read();
        if (read != -1) {
            A02(1);
        }
        return read;
    }
}
