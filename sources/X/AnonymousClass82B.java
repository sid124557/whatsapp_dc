package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.82B  reason: invalid class name */
public abstract class AnonymousClass82B implements C186598vd {
    public static final C158417jw A02 = new C158417jw(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    public static AnonymousClass7J0 A00(InputStream inputStream, boolean z) {
        C158417jw r6 = A02;
        AnonymousClass7J0 r7 = (AnonymousClass7J0) r6.A00();
        if (r7 == null) {
            r7 = new AnonymousClass7J0(new byte[AnonymousClass35S.A0F], 0);
        }
        byte[] bArr = r7.A02;
        byte[] bArr2 = bArr;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr.length;
                if (i >= length) {
                    byte[] bArr3 = new byte[(length << 1)];
                    System.arraycopy(bArr, 0, bArr3, 0, length);
                    bArr = bArr3;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    r6.A02(r7);
                    if (z) {
                        C158827kc.A0J.A01();
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (bArr2 != bArr) {
            r6.A02(r7);
            return new AnonymousClass7J0(bArr, i);
        }
        r7.A00 = i;
        return r7;
    }

    public static void A01(AnonymousClass7J0 r2) {
        if (r2.A02.length == 131072) {
            r2.A01 = null;
            A02.A02(r2);
        }
    }

    public AnonymousClass82B(int i) {
        this.A00 = i;
    }
}
