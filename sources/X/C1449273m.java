package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.73m  reason: invalid class name and case insensitive filesystem */
public class C1449273m {
    public static void A00(View view, C153427bI r7, AnonymousClass84O r8, C186518vU r9) {
        TextView A0G = C18300x5.A0G(view, R.id.text);
        String str = (String) AnonymousClass84O.A05(r8, 38);
        if (str != null) {
            A0G.setText(str);
        }
        View A02 = C06560Yg.A02(view, R.id.checkbox);
        View A022 = C06560Yg.A02(view, R.id.wabloks_checkbox);
        if (r8.A0E(41, 0) > 0) {
            float x = A022.getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x, C86664Kz.A01(A022.getResources(), R.dimen.f6nameremoved) + x});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C86604Kt.A0w(ofFloat, A022, 12);
            ofFloat.addListener(new C188628zE(A022, x, 1));
            ofFloat.start();
            r9.BqH();
        }
        A022.setOnClickListener(new C109725f5((Object) A02, (Object) r8, (Object) r7, 6));
    }
}
