package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.7fE  reason: invalid class name and case insensitive filesystem */
public final class C155637fE {
    public static final C148827Jw A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C148827Jw r2 = new C148827Jw(bArr);
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
        } catch (AnonymousClass6u4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object A00(Object obj, Object obj2) {
        AnonymousClass6VF r1 = new AnonymousClass6VF((AnonymousClass70I) null);
        r1.A01((AnonymousClass6V4) ((C187798xp) obj));
        C187798xp r3 = (C187798xp) obj2;
        if (r1.A02.getClass().isInstance(r3)) {
            r1.A01((AnonymousClass6V4) ((AnonymousClass8AG) r3));
            AnonymousClass6V3.A00(r1);
            return r1.A00;
        }
        throw AnonymousClass001.A0c("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
