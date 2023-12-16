package X;

import android.os.Build;
import java.nio.ByteBuffer;

/* renamed from: X.71Q  reason: invalid class name */
public final class AnonymousClass71Q {
    public static final AnonymousClass7FX A00(AnonymousClass7FW r7, C153897cC r8) {
        C162457s7.A0J(r7, 0);
        int i = Build.VERSION.SDK_INT;
        AnonymousClass6Mb r4 = r7.A00;
        if (r4 == null) {
            AnonymousClass7PM r0 = r7.A01;
            r4 = new AnonymousClass6Mb(r0.A00, r0.A01, r0.A05);
            r7.A00 = r4;
        }
        int i2 = r7.A01.A02.A00;
        AnonymousClass05z r2 = new AnonymousClass05z(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            r2.Bio(ByteBuffer.allocate(16384));
        }
        if (i >= 26) {
            return new AnonymousClass6Mg(r2, r4, r8);
        }
        return new AnonymousClass6Mf(r2, r4);
    }
}
