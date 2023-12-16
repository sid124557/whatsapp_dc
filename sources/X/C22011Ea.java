package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

/* renamed from: X.1Ea  reason: invalid class name and case insensitive filesystem */
public class C22011Ea extends C167047zg {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C71723cZ A01;
    public final /* synthetic */ String A02;

    public C22011Ea(TextView textView, C71723cZ r2, String str) {
        this.A01 = r2;
        this.A00 = textView;
        this.A02 = str;
    }

    public void onAnimationEnd(Animation animation) {
        TextView textView = this.A00;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
        textView.setText(this.A02);
        textView.clearAnimation();
        ((C89884fR) this.A01.A02).A0S = true;
    }
}
