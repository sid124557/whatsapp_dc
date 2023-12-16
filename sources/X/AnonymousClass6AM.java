package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6AM  reason: invalid class name */
public class AnonymousClass6AM implements ViewTreeObserver.OnPreDrawListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass6AM(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    public boolean onPreDraw() {
        Drawable popupDrawable;
        if (this.A03 != 0) {
            AnonymousClass5RH r5 = (AnonymousClass5RH) this.A01;
            if (!r5.A0F) {
                AnonymousClass4ZC r1 = (AnonymousClass4ZC) this.A02;
                if (!r1.A09.A02 && !r1.A0A.A02) {
                    return false;
                }
                r5.A0F = true;
                r5.A01.requestLayout();
                return false;
            }
            AnonymousClass0x7.A16(r5.A01, this);
            int i = r5.A01.getLayoutParams().height;
            int height = r5.A01.getHeight();
            r5.A01.getLayoutParams().height = this.A00;
            r5.A01.requestLayout();
            int transcriptMode = r5.A02.getTranscriptMode();
            AnonymousClass67U r3 = new AnonymousClass67U(this, i, height, 1);
            C88804ap r2 = new C88804ap(this, transcriptMode);
            r3.setDuration(300);
            r3.setAnimationListener(r2);
            r5.A01.startAnimation(r3);
            return false;
        }
        View view = (View) this.A02;
        AnonymousClass0x7.A16(view, this);
        C93314oJ r22 = (C93314oJ) this.A01;
        int i2 = this.A00;
        if (i2 == 0) {
            popupDrawable = r22.getPopupDrawable();
        } else if (i2 != 1) {
            popupDrawable = r22.getPinAnimDrawable();
        } else {
            popupDrawable = r22.getKeepAnimDrawable();
        }
        AnonymousClass677 r0 = r22.A0m;
        if (r0 == null || popupDrawable == null) {
            return true;
        }
        r0.Awx(popupDrawable, view);
        return true;
    }
}
