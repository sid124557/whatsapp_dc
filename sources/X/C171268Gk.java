package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.8Gk  reason: invalid class name and case insensitive filesystem */
public class C171268Gk implements AnonymousClass4EM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C84584Cx A01;
    public final /* synthetic */ C137716p9 A02;
    public final /* synthetic */ String A03;

    public C171268Gk(Context context, C84584Cx r2, C137716p9 r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    public void Axi() {
    }

    public /* synthetic */ void BSk() {
    }

    public void Bd0(Bitmap bitmap, boolean z) {
        C137716p9 r2 = this.A02;
        C125106Fl r3 = r2.A05;
        if (r3.getTag() == this.A01 && bitmap != C1457877h.A00) {
            r2.A01 = true;
            r3.A00(new BitmapDrawable(this.A00.getResources(), bitmap), (Drawable) null, this.A03);
        }
    }
}
