package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.8EF  reason: invalid class name */
public class AnonymousClass8EF implements C185398ta {
    public final Drawable A00;
    public final Drawable A01;

    public /* bridge */ /* synthetic */ void BMf(C186038ue r3) {
        AnonymousClass8EH r32 = (AnonymousClass8EH) r3;
        ImageView B8H = r32.B8H();
        if (B8H != null && A00(r32)) {
            Drawable drawable = r32.A03;
            if (drawable == null) {
                drawable = this.A01;
            }
            B8H.setImageDrawable(drawable);
        }
    }

    public /* bridge */ /* synthetic */ void BVP(C186038ue r3) {
        AnonymousClass8EH r32 = (AnonymousClass8EH) r3;
        ImageView B8H = r32.B8H();
        if (B8H != null && A00(r32)) {
            Drawable drawable = r32.A02;
            if (drawable == null) {
                drawable = this.A00;
            }
            B8H.setImageDrawable(drawable);
        }
        C185158tB r0 = r32.A04;
        if (r0 != null) {
            r0.BVO();
        }
    }

    public /* bridge */ /* synthetic */ void BVY(C186038ue r4) {
        AnonymousClass8EH r42 = (AnonymousClass8EH) r4;
        ImageView B8H = r42.B8H();
        if (B8H != null) {
            B8H.setTag(R.id.loaded_image_id, r42.A06);
        }
        C185158tB r0 = r42.A04;
        if (r0 != null) {
            r0.Be1();
        }
    }

    public /* bridge */ /* synthetic */ void BVd(Bitmap bitmap, C186038ue r7, boolean z) {
        Drawable drawable;
        AnonymousClass8EH r72 = (AnonymousClass8EH) r7;
        ImageView B8H = r72.B8H();
        if (B8H != null && A00(r72)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("simplethumbloader/display ");
            C18260x0.A1J(A0o, r72.A06);
            if ((B8H.getDrawable() == null || (B8H.getDrawable() instanceof ColorDrawable)) && !z) {
                Drawable[] drawableArr = new Drawable[2];
                if (B8H.getDrawable() == null) {
                    drawable = new ColorDrawable(0);
                } else {
                    drawable = B8H.getDrawable();
                }
                drawableArr[0] = drawable;
                drawableArr[1] = new BitmapDrawable(B8H.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                B8H.setImageDrawable(transitionDrawable);
            } else {
                B8H.setImageBitmap(bitmap);
            }
            C185158tB r0 = r72.A04;
            if (r0 != null) {
                r0.Be2(bitmap);
            }
        }
    }

    public AnonymousClass8EF(Drawable drawable, Drawable drawable2) {
        this.A00 = drawable2;
        this.A01 = drawable;
    }

    public static final boolean A00(AnonymousClass8EH r3) {
        ImageView B8H = r3.B8H();
        if (B8H == null || B8H.getTag(R.id.loaded_image_id) == null || !B8H.getTag(R.id.loaded_image_id).equals(r3.A06)) {
            return false;
        }
        return true;
    }
}
