package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.91a  reason: invalid class name and case insensitive filesystem */
public class C1893691a implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1893691a(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        View view;
        switch (this.A02) {
            case 0:
                C170348Cv r4 = (C170348Cv) this.A00;
                if (r4.A0D && r4.A0B == (view = (View) this.A01)) {
                    view.setTranslationX(AnonymousClass6C9.A03(r4.A09, AnonymousClass4L0.A00(view), r4.A0H ? 1 : 0));
                    view.setTranslationY(AnonymousClass6C9.A03(r4.A0A, C86664Kz.A02(view), r4.A0I ? 1 : 0));
                    if (r4.A0E) {
                        view.setPivotX(AnonymousClass6C9.A03(r4.A02, AnonymousClass4L0.A00(view), r4.A0F ? 1 : 0));
                        view.setPivotY(AnonymousClass6C9.A03(r4.A03, C86664Kz.A02(view), r4.A0G ? 1 : 0));
                    }
                }
                AnonymousClass0x7.A16((View) this.A01, this);
                return true;
            case 1:
                AnonymousClass4ZC r42 = (AnonymousClass4ZC) this.A00;
                AnonymousClass0x7.A16(r42, this);
                r42.A0E = true;
                int height = r42.getHeight();
                r42.getLayoutParams().height = 0;
                r42.requestLayout();
                AnonymousClass6F2 r2 = new AnonymousClass6F2(this, height);
                r2.setAnimationListener(new C188998zp(this, 5));
                r2.setDuration(250);
                r42.startAnimation(r2);
                return false;
            default:
                AnonymousClass0x7.A16((View) this.A00, this);
                ((C08310eF) this.A01).A0R().A5V();
                return true;
        }
    }
}
