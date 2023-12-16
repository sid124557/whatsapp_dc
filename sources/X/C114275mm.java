package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.5mm  reason: invalid class name and case insensitive filesystem */
public class C114275mm implements AnonymousClass4EM {
    public Context A00;
    public C95274sy A01;
    public final int A02;
    public final Drawable A03;
    public final C33131sU A04;
    public final C114255mk A05;

    public void Axi() {
        C95274sy r1 = this.A01;
        r1.setBackgroundColor(this.A02);
        r1.setImageDrawable((Drawable) null);
    }

    public /* synthetic */ void BSk() {
    }

    public void Bd0(Bitmap bitmap, boolean z) {
        C95274sy r4 = this.A01;
        Object tag = r4.getTag();
        C114255mk r3 = this.A05;
        if (tag == r3) {
            if (bitmap == C1457877h.A00) {
                C86664Kz.A1R(r4);
                r4.setBackgroundColor(this.A02);
                r4.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else {
                C86644Kx.A1A(r4);
                r4.setBackgroundResource(0);
                if (!z) {
                    Drawable[] drawableArr = new Drawable[2];
                    drawableArr[0] = this.A03;
                    C86614Ku.A1L(r4, C86654Ky.A0E(this.A00, bitmap), drawableArr);
                } else {
                    r4.setImageBitmap(bitmap);
                }
            }
            this.A04.A09(r3.BDW(), bitmap);
        }
    }

    public C114275mm(C33131sU r3, C114255mk r4, C95274sy r5) {
        Context context = r5.getContext();
        this.A00 = context;
        this.A05 = r4;
        this.A01 = r5;
        this.A04 = r3;
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A02 = A042;
        this.A03 = new ColorDrawable(A042);
    }
}
