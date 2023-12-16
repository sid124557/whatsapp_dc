package X;

import android.os.Message;

/* renamed from: X.2gD  reason: invalid class name and case insensitive filesystem */
public class C49242gD {
    public C18890yQ A00;
    public final C54292oU A01;
    public final C48092eK A02;

    public void A01(int i, int i2) {
        C18890yQ r1;
        if (((long) i) >= 0 && (r1 = this.A00) != null) {
            C626936e.A0C(true);
            Message.obtain(r1, 2, i2, i).sendToTarget();
            A00();
        }
    }

    public final void A00() {
        C18890yQ r0 = this.A00;
        if (r0 != null) {
            C626936e.A06(r0);
            this.A00.removeMessages(1);
            this.A00.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public C49242gD(C54292oU r1, C48092eK r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
