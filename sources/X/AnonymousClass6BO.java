package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.6BO  reason: invalid class name */
public class AnonymousClass6BO implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6BO(View view, Runnable runnable, int i) {
        this.A02 = i;
        if (3 - i != 0) {
            this.A00 = runnable;
            this.A01 = view;
        } else {
            this.A01 = view;
            this.A00 = runnable;
        }
    }

    public void onGlobalLayout() {
        View view;
        switch (this.A02) {
            case 0:
                C86604Kt.A1G((View) this.A01, this);
                ((AnonymousClass4GP) this.A00).invoke();
                return;
            case 1:
                RegisterPhone registerPhone = (RegisterPhone) this.A00;
                View view2 = (View) this.A01;
                int A0D = C86664Kz.A0D(registerPhone.A08, registerPhone.A08.getRootView().getHeight());
                if (A0D > registerPhone.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)) {
                    registerPhone.A08.smoothScrollTo(0, view2.getTop());
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("RegisterPhone/layout heightDiff:");
                    A0o.append(A0D);
                    C18260x0.A1L(A0o, "scroll view");
                    return;
                }
                return;
            case 2:
                View view3 = (View) this.A00;
                C86604Kt.A1G(view3, this);
                ViewParent parent = view3.getParent();
                while ((parent instanceof View) && (view = (View) parent) != null) {
                    if (view instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) view;
                        if (scrollView != null) {
                            scrollView.smoothScrollTo(0, view3.getTop());
                            return;
                        }
                        return;
                    }
                    parent = view.getParent();
                }
                return;
            case 3:
                C86624Kv.A16((View) this.A01, this);
                AnonymousClass0x9.A1K(this.A00);
                return;
            case 4:
                View view4 = (View) this.A01;
                C86604Kt.A1G(view4, this);
                view4.animate().translationY(-((Context) this.A00).getResources().getDimension(R.dimen.f6nameremoved)).setDuration(250).setInterpolator(new AnonymousClass088()).start();
                return;
            default:
                AnonymousClass0x9.A1K(this.A00);
                C86604Kt.A1G((View) this.A01, this);
                return;
        }
    }

    public AnonymousClass6BO(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
