package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.8Cg  reason: invalid class name and case insensitive filesystem */
public abstract class C170198Cg implements C187928y2 {
    public int memoizedHashCode = 0;

    public int A0D(C186358vA r6) {
        int i;
        C130786cX r4 = (C130786cX) this;
        if (r4.A0L()) {
            if (r6 == null) {
                r6 = AnonymousClass6C7.A0R(r4);
            }
            i = r6.BCq(r4);
            if (i < 0) {
                throw C86604Kt.A0h("serialized size must be non-negative, was ", AnonymousClass001.A0o(), i);
            }
        } else {
            i = r4.memoizedSerializedSize & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                if (r6 == null) {
                    r6 = AnonymousClass6C7.A0R(r4);
                }
                int BCq = r6.BCq(r4);
                if (BCq >= 0) {
                    r4.memoizedSerializedSize = (BCq & Integer.MAX_VALUE) | (r4.memoizedSerializedSize & Integer.MIN_VALUE);
                    return BCq;
                }
                throw C86604Kt.A0h("serialized size must be non-negative, was ", AnonymousClass001.A0o(), BCq);
            }
        }
        return i;
    }

    public void A0E(OutputStream outputStream) {
        int A0D = A0D((C186358vA) null);
        int A00 = AnonymousClass6C7.A00(A0D) + A0D;
        if (A00 > 4096) {
            A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        C130306bk r1 = new C130306bk(outputStream, A00);
        r1.A07(A0D);
        Bsj(r1);
        if (r1.A00 > 0) {
            r1.A0L();
        }
    }

    public byte[] A0F() {
        try {
            int A0D = A0D((C186358vA) null);
            byte[] bArr = new byte[A0D];
            C130296bj r0 = new C130296bj(bArr, A0D);
            Bsj(r0);
            r0.A04();
            return bArr;
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "Serializing ", this);
            throw AnonymousClass6C7.A0f("byte array", A0o, e);
        }
    }

    public C172548Lq Bql() {
        try {
            int A0D = A0D((C186358vA) null);
            byte[] bArr = new byte[A0D];
            C130296bj r0 = new C130296bj(bArr, A0D);
            Bsj(r0);
            r0.A04();
            return new C130256bf(bArr);
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "Serializing ", this);
            throw AnonymousClass6C7.A0f("ByteString", A0o, e);
        }
    }
}
