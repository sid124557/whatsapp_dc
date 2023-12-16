package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Yt  reason: invalid class name and case insensitive filesystem */
public class C06680Yt implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C125396Hw A01;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A05(AnonymousClass001.A03(valueAnimator));
        this.A00.invalidate();
    }

    public /* synthetic */ C06680Yt(RecyclerView recyclerView, C12160l6 r2, C125396Hw r3) {
        this(recyclerView, r3);
    }

    public C06680Yt(RecyclerView recyclerView, C125396Hw r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }
}
