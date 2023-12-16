package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.4L3  reason: invalid class name */
public class AnonymousClass4L3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SizeTickerView A02;

    public AnonymousClass4L3(SizeTickerView sizeTickerView, int i, long j) {
        this.A02 = sizeTickerView;
        this.A01 = j;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        SizeTickerView sizeTickerView = this.A02;
        sizeTickerView.A06 = null;
        long j = this.A01;
        int i = this.A00;
        sizeTickerView.A05 = j;
        sizeTickerView.A02 = i;
        sizeTickerView.setTextColor(i);
        sizeTickerView.A0D();
    }
}
