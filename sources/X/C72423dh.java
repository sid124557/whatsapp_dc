package X;

import javax.security.auth.Destroyable;

/* renamed from: X.3dh  reason: invalid class name and case insensitive filesystem */
public class C72423dh implements Destroyable {
    public boolean A00;
    public final C72403df A01;
    public final C72413dg A02;

    public byte[] A01() {
        byte[][] bArr = new byte[2][];
        bArr[0] = this.A01.A01;
        return AnonymousClass36A.A04(this.A02.A01, bArr, 1);
    }

    public void destroy() {
        if (!this.A00) {
            this.A01.destroy();
            this.A02.destroy();
            this.A00 = true;
        }
    }

    public C72423dh(C72403df r1, C72413dg r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static C72423dh A00() {
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        return new C72423dh(new C72403df(B3i), new C72413dg(r0.generatePublicKey(B3i)));
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
