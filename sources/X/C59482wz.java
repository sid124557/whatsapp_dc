package X;

import android.graphics.Bitmap;
import java.io.File;
import java.lang.ref.Reference;

/* renamed from: X.2wz  reason: invalid class name and case insensitive filesystem */
public final class C59482wz {
    public static final String A03;
    public final C04840Qw A00 = new C04840Qw(50);
    public final C54292oU A01;
    public final AnonymousClass4FS A02;

    public final void A00(AnonymousClass4CQ r5, String str) {
        Bitmap bitmap;
        C162457s7.A0J(str, 0);
        C04840Qw r3 = this.A00;
        Reference reference = (Reference) r3.A04(str);
        if (reference == null || (bitmap = (Bitmap) reference.get()) == null) {
            AnonymousClass0x7.A1B(new AnonymousClass1t6(r3, r5, this.A01, str), this.A02);
            return;
        }
        r5.Bcz(bitmap);
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("downloadable");
        String str = File.separator;
        A0o.append(str);
        A0o.append("bloks_pay");
        A0o.append(str);
        A03 = AnonymousClass000.A0X("image", A0o);
    }

    public C59482wz(C54292oU r3, AnonymousClass4FS r4) {
        C18260x0.A0Q(r3, r4);
        this.A01 = r3;
        this.A02 = r4;
    }
}
