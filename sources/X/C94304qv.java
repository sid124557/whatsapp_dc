package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;

/* renamed from: X.4qv  reason: invalid class name and case insensitive filesystem */
public final class C94304qv extends C52902mE {
    public final WeakReference A00;

    public void A00(int i, String str, boolean z) {
        View A0j = C86664Kz.A0j(this.A00);
        if (A0j != null) {
            TextView textView = (TextView) A0j;
            textView.setText(str);
            textView.setTextColor(i);
        }
    }

    public void A01(Drawable drawable, Integer num) {
        View A0j = C86664Kz.A0j(this.A00);
        if (A0j != null) {
            Chip chip = (Chip) A0j;
            chip.setChipIcon(drawable);
            if (num != null) {
                chip.setChipIconTintResource(num.intValue());
            } else {
                chip.setChipIconTint((ColorStateList) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94304qv(C69263Wi r1, AnonymousClass5Y0 r2, AnonymousClass4FS r3, WeakReference weakReference) {
        super(r1, r2, r3, weakReference);
        C18260x0.A0V(r1, r3, r2);
        this.A00 = weakReference;
    }
}
