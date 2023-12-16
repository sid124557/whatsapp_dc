package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.7f9  reason: invalid class name and case insensitive filesystem */
public final class C155587f9 {
    public static final C156347gT A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C156347gT r2 = new C156347gT(bArr);
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
        } catch (C140566tx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object A00(Object obj, Object obj2) {
        C128166Va r3 = (C128166Va) ((C187818xr) obj);
        C128176Vb r2 = (C128176Vb) r3.A06(5);
        r2.A00();
        C128166Va r1 = r2.A00;
        AnonymousClass6C8.A0Y(r1).Btq(r1, r3);
        C187818xr r4 = (C187818xr) obj2;
        if (r2.A02.getClass().isInstance(r4)) {
            r2.A00();
            C128166Va r12 = r2.A00;
            AnonymousClass6C8.A0Y(r12).Btq(r12, (C128166Va) ((AnonymousClass8AX) r4));
            return r2.Btk();
        }
        throw AnonymousClass001.A0c("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
