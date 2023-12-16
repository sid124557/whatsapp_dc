package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7Sv  reason: invalid class name and case insensitive filesystem */
public class C150947Sv {
    public final TextView A00;
    public final C620733j A01;
    public final String A02;

    public void A00() {
        TextView textView = this.A00;
        textView.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(320);
        textView.startAnimation(alphaAnimation);
    }

    public C150947Sv(View view, C620733j r3, String str) {
        this.A01 = r3;
        this.A00 = C18300x5.A0G(view, R.id.update_postcode_tip);
        this.A02 = str;
    }
}
