package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0l6  reason: invalid class name and case insensitive filesystem */
public class C12160l6 implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C011009e A01;

    public C12160l6(RecyclerView recyclerView, C011009e r2) {
        this.A01 = r2;
        this.A00 = recyclerView;
    }

    public void run() {
        C011009e r5 = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r5.A00 = ofFloat;
        ofFloat.addUpdateListener(new C06680Yt(this.A00, (C12160l6) null, r5.A03));
        r5.A00.setDuration(200);
        r5.A00.start();
        r5.A02 = false;
    }
}
