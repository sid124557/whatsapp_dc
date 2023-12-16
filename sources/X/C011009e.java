package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.09e  reason: invalid class name and case insensitive filesystem */
public class C011009e extends AnonymousClass0O5 {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final C125396Hw A03;
    public final boolean A04;

    public void A05(RecyclerView recyclerView, int i) {
        if (this.A04) {
            return;
        }
        if (i == 0) {
            C12160l6 r2 = new C12160l6(recyclerView, this);
            this.A01 = r2;
            recyclerView.postDelayed(r2, 1500);
            return;
        }
        A06(recyclerView);
    }

    public final void A06(RecyclerView recyclerView) {
        recyclerView.removeCallbacks(this.A01);
        if (!this.A02) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A00.cancel();
            }
            C125396Hw r4 = this.A03;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{r4.A04(), 1.0f});
            ofFloat.addUpdateListener(new C06680Yt(recyclerView, (C12160l6) null, r4));
            ofFloat.setDuration(200);
            ofFloat.start();
            this.A02 = true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C011009e r4 = (C011009e) obj;
            if (this.A04 == r4.A04) {
                return this.A03.equals(r4.A03);
            }
        }
        return false;
    }

    public C011009e(C125396Hw r3, boolean z) {
        this.A03 = r3;
        r3.A06(this);
        this.A02 = AnonymousClass000.A1S((r3.A04() > 0.0f ? 1 : (r3.A04() == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            r3.A05(1.0f);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A03;
        AnonymousClass000.A1R(A0M, this.A04);
        return Objects.hash(A0M);
    }
}
