package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.4vP  reason: invalid class name and case insensitive filesystem */
public class C96004vP extends C151207Tv {
    public final C64393Dh A00;
    public final C133846i2 A01;
    public final C55852r1 A02;

    public C96004vP(C64393Dh r7, C54292oU r8, C620733j r9, C133846i2 r10, AnonymousClass5Y0 r11, C55852r1 r12, AnonymousClass33O r13, C989053r r14) {
        super(r8, r9, r11, r13, r14);
        this.A02 = r12;
        this.A01 = r10;
        this.A00 = r7;
    }

    public static File A00(Uri uri, C64393Dh r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C627236i.A04(uri.toString()));
        return C64393Dh.A00(r3, AnonymousClass000.A0X("-crop", A0o));
    }
}
