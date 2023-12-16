package X;

import android.net.Uri;
import android.util.Base64;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public final class C09820go implements C185788uF {
    public AnonymousClass6KL A00;

    public Uri BE6() {
        return null;
    }

    public long Bfw(C161387pX r3) {
        return this.A00.Bfw(r3);
    }

    public void cancel() {
    }

    public void close() {
        this.A00.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    public C09820go(String str, String str2) {
        byte[] bArr;
        if (str.isEmpty() || str2.isEmpty()) {
            bArr = new byte[0];
        } else {
            byte[] decode = Base64.decode(str2, 0);
            byte[] decode2 = Base64.decode(str, 0);
            int length = decode2.length;
            int length2 = decode.length;
            bArr = new byte[(length + length2)];
            System.arraycopy(decode2, 0, bArr, 0, length);
            System.arraycopy(decode, 0, bArr, length, length2);
        }
        this.A00 = new AnonymousClass6KL(bArr);
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        this.A00.Awq(r2);
    }
}
