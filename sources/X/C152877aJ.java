package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7aJ  reason: invalid class name and case insensitive filesystem */
public final class C152877aJ {
    public MessageDigest A00;
    public MessageDigest A01 = null;

    public void A00(byte[] bArr) {
        if (bArr != null) {
            try {
                MessageDigest messageDigest = this.A00;
                this.A01 = (MessageDigest) messageDigest.clone();
                messageDigest.update(bArr);
            } catch (CloneNotSupportedException e) {
                throw C143806zV.A03(e);
            }
        } else {
            throw C143806zV.A01("Cannot add null transcript.", (byte) 80);
        }
    }

    public byte[] A01() {
        try {
            return ((MessageDigest) this.A00.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw C143806zV.A04(e);
        }
    }

    public byte[] A02() {
        try {
            return ((MessageDigest) this.A01.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw C143806zV.A04(e);
        }
    }

    public C152877aJ(String str) {
        try {
            this.A00 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw C143806zV.A04(e);
        }
    }
}
