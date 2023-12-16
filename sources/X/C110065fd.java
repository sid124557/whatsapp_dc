package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.snackbar.WaSnackbar$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5fd  reason: invalid class name and case insensitive filesystem */
public class C110065fd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final AnonymousClass0O9 A00;
    public final C17280vG A01;
    public final C88674aZ A02 = new C1232267p(this, 1);
    public final C88694ab A03;
    public final C620633i A04;
    public final List A05;
    public final boolean A06;

    public void A00() {
        this.A03.A08(3);
        this.A00.A01(this.A01);
    }

    public void A01() {
        if (((AnonymousClass08A) this.A00).A02.A00(AnonymousClass0GC.STARTED)) {
            C88694ab r1 = this.A03;
            C86644Kx.A12(r1.A0J, this);
            r1.A0A(this.A02);
            r1.A05();
        }
    }

    public void A02(int i) {
        C88694ab r1 = this.A03;
        C18300x5.A0G(r1.A0J, R.id.snackbar_action).setTextColor(AnonymousClass0Y8.A04(r1.A0G, i));
    }

    public final void A03(int i) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            View A0H = C86654Ky.A0H(it);
            if (A0H != null) {
                A0H.animate().translationY((float) i).setDuration(250).setInterpolator(new AnonymousClass088()).start();
            }
        }
    }

    public void A04(View.OnClickListener onClickListener, int i) {
        C88694ab r1 = this.A03;
        r1.A0F(r1.A0G.getString(i), onClickListener);
    }

    public void A05(Runnable runnable) {
        this.A03.A0A(new C88664aY(this, runnable));
    }

    public void onGlobalLayout() {
        AnonymousClass6FH r1 = this.A03.A0J;
        C86604Kt.A1G(r1, this);
        A03(-r1.getHeight());
        if (this.A06) {
            C106755a7.A01(r1, this.A04);
        }
    }

    public C110065fd(C15910sA r5, C88694ab r6, C620633i r7, List list, boolean z) {
        WaSnackbar$$ExternalSyntheticLambda0 waSnackbar$$ExternalSyntheticLambda0 = new WaSnackbar$$ExternalSyntheticLambda0(this);
        this.A01 = waSnackbar$$ExternalSyntheticLambda0;
        AnonymousClass0O9 lifecycle = r5.getLifecycle();
        this.A00 = lifecycle;
        C626936e.A0C(C18300x5.A1W(((AnonymousClass08A) lifecycle).A02, AnonymousClass0GC.DESTROYED));
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = list;
        this.A06 = z;
        lifecycle.A00(waSnackbar$$ExternalSyntheticLambda0);
    }
}
