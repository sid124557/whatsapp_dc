package X;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.5fm  reason: invalid class name and case insensitive filesystem */
public class C110155fm implements Animation.AnimationListener {
    public final int A00;
    public final /* synthetic */ PhoneContactsSelector A01;

    public C110155fm(PhoneContactsSelector phoneContactsSelector, int i) {
        this.A01 = phoneContactsSelector;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        PhoneContactsSelector phoneContactsSelector = this.A01;
        phoneContactsSelector.A04.clearAnimation();
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(phoneContactsSelector.A04);
        A0r.setMargins(A0r.leftMargin, this.A00, A0r.rightMargin, A0r.bottomMargin);
        phoneContactsSelector.A04.setLayoutParams(A0r);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
