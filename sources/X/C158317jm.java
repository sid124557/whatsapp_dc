package X;

/* renamed from: X.7jm  reason: invalid class name and case insensitive filesystem */
public class C158317jm {
    public final C185988uZ A00;

    public static C158317jm A00() {
        try {
            return new C158317jm((C185988uZ) Class.forName(AnonymousClass000.A0V("org.whispersystems.curve25519.", "OpportunisticCurve25519Provider", AnonymousClass001.A0o())).newInstance());
        } catch (InstantiationException e) {
            throw new AnonymousClass8RS(e);
        } catch (IllegalAccessException e2) {
            throw new AnonymousClass8RS(e2);
        } catch (ClassNotFoundException e3) {
            throw new AnonymousClass8RS(e3);
        }
    }

    public boolean A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw AnonymousClass001.A0c("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw AnonymousClass001.A0c("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.A00.calculateAgreement(bArr2, bArr);
        } else {
            throw AnonymousClass001.A0c("Keys must be 32 bytes!");
        }
    }

    public byte[] A03(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw AnonymousClass001.A0c("Invalid private key length!");
        }
        C185988uZ r1 = this.A00;
        return r1.calculateSignature(r1.BBq(64), bArr, bArr2);
    }

    public C158317jm(C185988uZ r1) {
        this.A00 = r1;
    }
}
