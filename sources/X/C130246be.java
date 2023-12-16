package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.6be  reason: invalid class name and case insensitive filesystem */
public final class C130246be extends C130256bf {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public C130246be(byte[] bArr, int i, int i2) {
        super(bArr);
        C172548Lq.A00(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    public Object writeReplace() {
        return new C130256bf(A07());
    }
}
