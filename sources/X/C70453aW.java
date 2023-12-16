package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.3aW  reason: invalid class name and case insensitive filesystem */
public class C70453aW implements Runnable {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public final int A04;

    public C70453aW(Object obj, int i, int i2, int i3, long j) {
        this.A04 = i3;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public void run() {
        C55682qk r1;
        String str;
        int i = this.A04;
        Object obj = this.A03;
        if (i != 0) {
            C55112po r4 = (C55112po) obj;
            int i2 = this.A00;
            int i3 = this.A01;
            long j = this.A02;
            C25991bP A002 = r4.A00(1);
            A002.A08 = Integer.valueOf(i2);
            A002.A07 = Integer.valueOf(i3);
            String str2 = r4.A00;
            if (str2 != null) {
                A002.A0P = str2;
            }
            if (j != 0) {
                A002.A0I = Long.valueOf(j);
            }
            r4.A03(A002);
            if (i3 == 1) {
                C18260x0.A0x("fpm/LoggingManager/critical event logged for errorCode: ", C55682qk.A03(r4.A01, "fpm/failed to set server flag", (String) null, true), i3);
            } else {
                if (i3 == 3) {
                    r1 = r4.A01;
                    str = "fpm/failed to parse qr code";
                } else if (i3 == 5) {
                    r1 = r4.A01;
                    str = "fpm/donor device can't connect to receiver device after reading QR code from receiver";
                }
                r1.A0A(str, true, (String) null);
            }
            r4.A00 = null;
            return;
        }
        Execution.executeAfterWithPriorityInternal((C172568Lu) obj, this.A00, this.A01, this.A02);
    }
}
