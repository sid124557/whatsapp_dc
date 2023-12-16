package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: X.5it  reason: invalid class name and case insensitive filesystem */
public class C111915it implements C181778nJ {
    public AnonymousClass7P8 A00;
    public final C64393Dh A01;
    public final C989053r A02;
    public final AnonymousClass4FS A03;

    public final void A01() {
        AnonymousClass7P8 r0 = this.A00;
        if (r0 != null) {
            AnonymousClass0x7.A18(r0.A03.A0A);
        }
    }

    public void BVc(Bitmap bitmap, AnonymousClass8EI r4, boolean z) {
        C18290x4.A1M(this.A03, this, bitmap, 6);
    }

    public C111915it(C64393Dh r1, C989053r r2, AnonymousClass4FS r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public static AnonymousClass0PJ A00(Bitmap bitmap, C64393Dh r5) {
        boolean z;
        FileOutputStream A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(UUID.randomUUID());
        File A002 = C64393Dh.A00(r5, AnonymousClass000.A0X(".jpeg", A0o));
        try {
            A0h = AnonymousClass0x9.A0h(A002);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, A0h);
            A0h.close();
            z = true;
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "product-details/send-product/save-to-storage/failed: ", e);
            z = false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return AnonymousClass0x9.A0G(Boolean.valueOf(z), A002);
        throw th;
    }
}
