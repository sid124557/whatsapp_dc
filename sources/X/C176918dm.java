package X;

import java.util.Iterator;

/* renamed from: X.8dm  reason: invalid class name and case insensitive filesystem */
public class C176918dm extends C176958dq {
    public byte[] A00;

    public synchronized C177088e3 A0O() {
        A0X();
        return super.A0O();
    }

    public synchronized int hashCode() {
        A0X();
        return super.hashCode();
    }

    public synchronized Iterator iterator() {
        A0X();
        return super.iterator();
    }

    public final void A0X() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            C161377pW r2 = new C161377pW();
            C172858Nc r1 = new C172858Nc(bArr);
            while (r1.hasMoreElements()) {
                r2.A03((AnonymousClass8Q0) r1.nextElement());
            }
            this.A00 = r2.A04();
            this.A00 = null;
        }
    }

    public C176918dm(byte[] bArr) {
        this.A00 = bArr;
    }
}
