package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MM  reason: invalid class name */
public class AnonymousClass4MM extends Handler {
    public final /* synthetic */ C116095pj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MM(Looper looper, C116095pj r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C116095pj r7 = this.A00;
        AnonymousClass5ZQ r0 = r7.A0P;
        if (r0 == null) {
            return;
        }
        if (r0.A0F()) {
            int A01 = r7.A01();
            r7.A04 = A01;
            C1229466l r02 = r7.A0J;
            if (r02 != null && C86634Kw.A1Z(r02, r7)) {
                r7.A0J.BYz(A01);
            }
            if (r7.A0Z) {
                AnonymousClass5TT r8 = r7.A0o;
                if (r8.A0C.A00 == r7) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - r8.A00 >= 1000) {
                        r8.A02(r7);
                        r8.A00 = currentTimeMillis;
                    }
                }
            }
            C182288oA r82 = r7.A0K;
            if (r82 != null && r7.A0H == null) {
                int i = r7.A07 + 1;
                r7.A07 = i;
                byte[] bArr = C116095pj.A14;
                if (bArr == null) {
                    bArr = new byte[128];
                    C116095pj.A14 = bArr;
                    int i2 = 0;
                    do {
                        double d = ((double) i2) * 3.141592653589793d;
                        double d2 = (double) 128;
                        bArr[i2] = (byte) ((int) ((Math.sin((32.0d * d) / d2) * Math.abs(Math.sin((4.0d * d) / d2)) * Math.abs(Math.sin((d * 1.0d) / d2)) * 64.0d) + 128.0d));
                        i2++;
                    } while (i2 < 128);
                }
                if (i % 4 == 0) {
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        bArr[i3] = (byte) (256 - bArr[i3]);
                    }
                }
                r82.Bfj(bArr);
            }
            sendEmptyMessageDelayed(0, 50);
        } else if (!r7.A0V) {
            r7.A0H(true, false);
        }
    }
}
