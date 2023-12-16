package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

/* renamed from: X.8Oy  reason: invalid class name and case insensitive filesystem */
public class C173268Oy implements PBEKey, Destroyable {
    public String algorithm;
    public int digest;
    public final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    public final int iterationCount;
    public int ivSize;
    public int keySize;
    public C176768dX oid;
    public final C834748n param;
    public final char[] password;
    public final byte[] salt;
    public boolean tryWrong = false;
    public int type;

    public void destroy() {
        if (!this.hasBeenDestroyed.getAndSet(true)) {
            char[] cArr = this.password;
            if (cArr != null) {
                Arrays.fill(cArr, 0);
            }
            byte[] bArr = this.salt;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    public String getFormat() {
        return "RAW";
    }

    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public C173268Oy(String str, PBEKeySpec pBEKeySpec, C176768dX r5, C834748n r6, int i, int i2, int i3, int i4) {
        this.algorithm = str;
        this.oid = r5;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = r6;
    }

    public static void A00(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw AnonymousClass001.A0e("key has been destroyed");
        }
    }

    public String getAlgorithm() {
        A00(this);
        return this.algorithm;
    }

    public byte[] getEncoded() {
        A00(this);
        C834748n r1 = this.param;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass8QP) {
                r1 = ((AnonymousClass8QP) r1).A00;
            }
            return ((AnonymousClass8QN) r1).A00;
        }
        int i = this.type;
        if (i == 2) {
            return C158467k1.A00(this.password);
        }
        char[] cArr = this.password;
        if (i != 5) {
            if (cArr == null) {
                return new byte[0];
            }
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 != length; i2 = AnonymousClass6CA.A0A(bArr, cArr[i2], i2)) {
            }
            return bArr;
        } else if (cArr != null) {
            return C162077rB.A04(cArr);
        } else {
            return new byte[0];
        }
    }

    public int getIterationCount() {
        A00(this);
        return this.iterationCount;
    }

    public char[] getPassword() {
        A00(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return C161007oo.A03(cArr);
        }
        throw AnonymousClass001.A0e("no password available");
    }

    public byte[] getSalt() {
        A00(this);
        return C161007oo.A02(this.salt);
    }
}
