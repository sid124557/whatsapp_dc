package X;

import android.os.Message;
import java.io.OutputStream;
import java.net.URLConnection;

/* renamed from: X.203  reason: invalid class name */
public class AnonymousClass203 extends OutputStream {
    public final C56492s4 A00;
    public final OutputStream A01;
    public final Integer A02;
    public final Integer A03;

    public void A01(int i) {
        Integer num = this.A02;
        if (num != null) {
            C56492s4 r3 = this.A00;
            int intValue = num.intValue();
            C18910yS r1 = r3.A00;
            C626936e.A0C(AnonymousClass000.A1W(r1));
            if (i >= 0) {
                Message.obtain(r1, 2, intValue, i).sendToTarget();
                r3.A02();
            }
        }
        C56492s4 r2 = this.A00;
        r2.A05.A01(i, this.A03.intValue());
    }

    public void close() {
        this.A01.close();
    }

    public void flush() {
        this.A01.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
        A01(i2);
    }

    public AnonymousClass203(C56492s4 r1, OutputStream outputStream, Integer num, Integer num2) {
        this.A01 = outputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public static AnonymousClass203 A00(C56492s4 r2, Integer num, Integer num2, URLConnection uRLConnection) {
        return new AnonymousClass203(r2, uRLConnection.getOutputStream(), num, num2);
    }

    public void write(int i) {
        this.A01.write(i);
        A01(1);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
        A01(bArr.length);
    }
}
