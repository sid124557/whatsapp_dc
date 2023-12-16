package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.7fF  reason: invalid class name and case insensitive filesystem */
public final class C155647fF {
    public static final C153797c2 A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C130276bh r0 = new C130276bh(bArr, 0, 0);
        try {
            r0.A0B(0);
            A00 = r0;
        } catch (AnonymousClass6u5 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
