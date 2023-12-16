package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.2xc  reason: invalid class name and case insensitive filesystem */
public class C59862xc {
    public final AnonymousClass1VX A00;

    public static Drawable A00(Resources.Theme theme, Resources resources, C181298mX r4, AnonymousClass1VX r5, int i) {
        if (r5.A0Y(C58422vE.A02, 1257)) {
            return new C86824Lz(theme, resources, r4, i);
        }
        return new AnonymousClass4M0(theme, resources, r4, i);
    }

    public Drawable A01(Resources resources, Bitmap bitmap, C181298mX r6) {
        if (this.A00.A0Y(C58422vE.A02, 1257)) {
            return new C86824Lz(resources, bitmap, r6);
        }
        return new AnonymousClass4M0(resources, bitmap, r6);
    }

    public C59862xc(AnonymousClass1VX r1) {
        this.A00 = r1;
    }
}
