package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.4qw  reason: invalid class name and case insensitive filesystem */
public final class C94314qw extends C52902mE {
    public final WeakReference A00;

    public void A00(int i, String str, boolean z) {
        Typeface A01;
        View A0j = C86664Kz.A0j(this.A00);
        if (A0j != null) {
            TextView textView = (TextView) A0j;
            textView.setText(str);
            textView.setTextColor(i);
            if (z) {
                textView.getContext();
                A01 = C106905aM.A00();
            } else {
                textView.getContext();
                A01 = C106905aM.A01();
            }
            textView.setTypeface(A01);
        }
    }

    public void A01(Drawable drawable, Integer num) {
        View A0j = C86664Kz.A0j(this.A00);
        if (A0j != null) {
            ((TextView) A0j).setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94314qw(C69263Wi r1, AnonymousClass5Y0 r2, AnonymousClass4FS r3, WeakReference weakReference) {
        super(r1, r2, r3, weakReference);
        C18260x0.A0V(r1, r3, r2);
        this.A00 = weakReference;
    }
}
