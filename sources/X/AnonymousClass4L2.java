package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.4L2  reason: invalid class name */
public class AnonymousClass4L2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;
    public final /* synthetic */ float[] A02;

    public AnonymousClass4L2(SegmentedProgressBar segmentedProgressBar, float[] fArr, int i) {
        this.A01 = segmentedProgressBar;
        this.A02 = fArr;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        segmentedProgressBar.A08 = null;
        float[] fArr = this.A02;
        int i = this.A00;
        segmentedProgressBar.A0D = fArr;
        segmentedProgressBar.A02 = i;
    }
}
