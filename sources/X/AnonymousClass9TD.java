package X;

import java.util.Random;

/* renamed from: X.9TD  reason: invalid class name */
public class AnonymousClass9TD {
    public long A00;
    public C56612sH A01;
    public String A02;
    public Random A03 = new Random();
    public final C160757oG A04 = C160757oG.A00("PaymentFieldStats", "notification", "COMMON");

    public void A01() {
        this.A02 = null;
        this.A00 = 0;
    }

    public String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[8];
        this.A03.nextBytes(bArr);
        String A06 = C627236i.A06(bArr);
        this.A02 = A06;
        return A06;
    }

    public void A02() {
        this.A04.A06("PaymentWamEvent timer reset.");
        this.A00 = this.A01.A0H();
    }

    public AnonymousClass9TD(C56612sH r4) {
        this.A01 = r4;
    }
}
