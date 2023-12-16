package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.5pS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C115925pS implements C183098pU {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C114085mT A01;
    public final /* synthetic */ C115975pX A02;

    public final void Bca(Drawable drawable) {
        C114085mT r6 = this.A01;
        Resources resources = this.A00;
        C115975pX r4 = this.A02;
        if (drawable instanceof AnonymousClass6D5) {
            try {
                Bitmap A0Y = C86664Kz.A0Y(C86644Kx.A01(drawable), C86654Ky.A03(drawable));
                if (A0Y != null) {
                    ((AnonymousClass6D5) drawable).A00(AnonymousClass4L0.A06(A0Y));
                    C87624Ua r1 = r6.A08;
                    C626936e.A06(r1);
                    r1.A0D(new BitmapDrawable(resources, A0Y), 0);
                }
            } catch (OutOfMemoryError unused) {
            }
            C87624Ua r2 = r6.A08;
            C626936e.A06(r2);
            r2.A0D((Drawable) null, 3);
            return;
        }
        C87624Ua r0 = r6.A08;
        C626936e.A06(r0);
        r0.A0D(drawable, 0);
        r4.A04(false);
        r6.A05.A09();
    }

    public /* synthetic */ C115925pS(Resources resources, C114085mT r2, C115975pX r3) {
        this.A01 = r2;
        this.A00 = resources;
        this.A02 = r3;
    }
}
