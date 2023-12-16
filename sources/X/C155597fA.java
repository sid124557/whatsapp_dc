package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.7fA  reason: invalid class name and case insensitive filesystem */
public final class C155597fA {
    public static final C156367gV A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A03 = Charset.forName("ISO-8859-1");
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C156367gV r2 = new C156367gV(bArr);
        try {
            int i = r2.A00 + r2.A01;
            r2.A00 = i;
            if (i > 0) {
                r2.A01 = i;
                r2.A00 = i - i;
            } else {
                r2.A01 = 0;
            }
            A00 = r2;
        } catch (C140576ty e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object A00(Object obj, Object obj2) {
        C128766Xj r3 = (C128766Xj) ((C187848xu) obj);
        AnonymousClass6XT A012 = C128766Xj.A01(r3);
        AnonymousClass6XT.A00(A012);
        C128766Xj r1 = A012.A00;
        AnonymousClass6C9.A0U(r1).Btg(r1, r3);
        C187848xu r4 = (C187848xu) obj2;
        if (A012.A02.getClass().isInstance(r4)) {
            AnonymousClass6XT.A00(A012);
            C128766Xj r12 = A012.A00;
            AnonymousClass6C9.A0U(r12).Btg(r12, (C128766Xj) ((C169798Ar) r4));
            return A012.Bu1();
        }
        throw AnonymousClass001.A0c("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
