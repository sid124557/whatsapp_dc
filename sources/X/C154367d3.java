package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

/* renamed from: X.7d3  reason: invalid class name and case insensitive filesystem */
public class C154367d3 {
    public static void A00(View view, C620733j r3) {
        int i;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (r3.A0T()) {
            layoutParams.addRule(0, 0);
            i = 11;
        } else {
            layoutParams.addRule(1, 0);
            i = 9;
        }
        layoutParams.addRule(i);
    }

    public static void A01(View view, C620733j r3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i = 0;
        if (r3.A0T()) {
            layoutParams.addRule(11, 0);
        } else {
            layoutParams.addRule(9, 0);
            i = 1;
        }
        layoutParams.addRule(i, R.id.send);
    }
}
