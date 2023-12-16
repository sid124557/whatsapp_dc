package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6AN  reason: invalid class name */
public class AnonymousClass6AN implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6AN(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                AnonymousClass0x7.A16(view, this);
                C110775h1 r0 = (C110775h1) this.A00;
                view.post(new C172708Mj(this, r0.A00, r0.A03, 14));
                return true;
            case 1:
                AnonymousClass0x7.A16((View) this.A01, this);
                ((C89654ea) this.A00).A05.A0S(new C117645sG((Object) this, 37));
                return true;
            case 2:
                AnonymousClass5JR r2 = (AnonymousClass5JR) this.A00;
                C626936e.A01();
                if (r2.A01) {
                    AnonymousClass0x7.A16((View) this.A01, this);
                    return true;
                }
                r2.A00 = SystemClock.elapsedRealtime();
                return true;
            case 3:
                UpdatesFragment updatesFragment = (UpdatesFragment) this.A01;
                ObservableRecyclerView observableRecyclerView = updatesFragment.A0H;
                if (!(observableRecyclerView == null || (viewTreeObserver = observableRecyclerView.getViewTreeObserver()) == null)) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                Iterable iterable = (Iterable) this.A00;
                if (iterable == null) {
                    return false;
                }
                AnonymousClass4L4 r6 = updatesFragment.A0o;
                if (r6 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        View A0H = C86654Ky.A0H(it);
                        A0H.measure(0, 0);
                        int measuredHeight = A0H.getMeasuredHeight();
                        int[] A1Z = C86664Kz.A1Z();
                        A1Z[0] = 0;
                        ValueAnimator A0Q = C86664Kz.A0Q(A1Z, measuredHeight);
                        A0Q.addListener(new AnonymousClass67F(A0H, measuredHeight, 5));
                        C100295Aj.A03(A0Q, A0H, 24);
                        A0s.add(A0Q);
                    }
                    AnimatorSet animatorSet = r6.A00;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet A0O = C86664Kz.A0O();
                    C86614Ku.A0y(A0O);
                    A0O.setDuration(250);
                    A0O.playTogether(A0s);
                    A0O.addListener(r6);
                    A0O.start();
                    r6.A00 = A0O;
                    return false;
                }
                throw C18270x1.A0S("collapseSublistAnimator");
            default:
                AnonymousClass0x7.A16((View) this.A01, this);
                AnonymousClass0x9.A1K(this.A00);
                return true;
        }
    }
}
