package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5Qg  reason: invalid class name and case insensitive filesystem */
public class C104255Qg {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final C86734Lh A04;
    public final Runnable A05;
    public final Runnable A06;

    public final void A00() {
        C86734Lh r2 = this.A04;
        r2.A00 = C18290x4.A0G(this.A03).getColor(R.color.f5nameremoved);
        r2.invalidateSelf();
    }

    public final boolean A01(float f, float f2) {
        View view = this.A03;
        if (f < ((float) view.getLeft()) || f > ((float) view.getRight()) || f2 < ((float) view.getTop()) || f2 > ((float) view.getBottom())) {
            return false;
        }
        return true;
    }

    public C104255Qg(Handler handler, View view, C620633i r7, C620733j r8, C86734Lh r9) {
        this.A03 = view;
        this.A04 = r9;
        this.A01 = handler;
        AnonymousClass0YY.A04(new C131666dx(r9, r8), view);
        this.A06 = new AnonymousClass8MK(view, 0.0f, 1.0f, 0);
        this.A05 = new AnonymousClass8MK(view, 1.0f, 0.0f, 4);
        this.A02 = r7.A0K();
        A00();
    }
}
