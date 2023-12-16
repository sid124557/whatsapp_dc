package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: X.6CJ  reason: invalid class name */
public class AnonymousClass6CJ extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ C153557bX A04;

    public AnonymousClass6CJ(TextView textView, TextView textView2, C153557bX r3, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A02 = textView;
        this.A00 = i2;
        this.A03 = textView2;
    }

    public void onAnimationEnd(Animator animator) {
        TextView textView;
        C153557bX r3 = this.A04;
        r3.A00 = this.A01;
        r3.A06 = null;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.A00 == 1 && (textView = r3.A0C) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.A03;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            textView3.setAlpha(1.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
