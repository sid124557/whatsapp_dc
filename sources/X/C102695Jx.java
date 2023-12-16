package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.5Jx  reason: invalid class name and case insensitive filesystem */
public class C102695Jx {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final AnonymousClass1VX A04;

    public C102695Jx(View view, View view2, View view3, View view4, FrameLayout frameLayout, C54292oU r10, AnonymousClass1VX r11) {
        this.A04 = r11;
        this.A02 = view;
        this.A00 = view2;
        this.A03 = view3;
        this.A01 = view4;
        C86624Kv.A0s(view4);
        view4.setAlpha(1.0f);
        C86624Kv.A13(view4, view3);
        frameLayout.removeAllViews();
        C86654Ky.A17(view3, frameLayout, -2, 17);
        C107235av.A01(view);
        Context context = r10.A00;
        int color = context.getResources().getColor(AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        view.setBackgroundColor(color);
        view4.setBackgroundColor(color);
    }
}
