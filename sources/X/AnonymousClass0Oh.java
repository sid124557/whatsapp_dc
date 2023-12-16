package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: X.0Oh  reason: invalid class name */
public final class AnonymousClass0Oh {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final AnonymousClass0Ki A03;
    public final C153427bI A04;
    public final C142316x0 A05;
    public final boolean A06;

    public AnonymousClass0Oh(Context context, AnonymousClass0Ki r3, C153427bI r4, C142316x0 r5, boolean z) {
        C162457s7.A0J(r5, 6);
        this.A01 = context;
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = z;
        this.A05 = r5;
    }

    public final Button A00(boolean z) {
        C142316x0 r8 = this.A05;
        C153477bO A032 = C161937qr.A03(C141336vP.SECONDARY_BUTTON, r8);
        C166217yK A022 = A032.A02();
        int A002 = A032.A00();
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.A01;
        gradientDrawable.setCornerRadius(AnonymousClass0J7.A00(context, (float) C161937qr.A00(C141476vd.SECONDARY_BUTTON, r8)));
        gradientDrawable.setStroke(A002, A022.A00(z));
        gradientDrawable.setColor(C161937qr.A04(C142186wm.SECONDARY_BUTTON_BACKGROUND, r8).A00(z));
        C153647bi A052 = C161937qr.A05(r8, C142166wk.SECONDARY_BUTTON);
        String A062 = A052.A06();
        float A003 = A052.A00();
        int A042 = A052.A04();
        float A012 = A052.A01();
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(C02450Gf.dialog_cancel);
        float f = (float) A042;
        button.setTextSize(f);
        button.setTextColor(C161937qr.A04(C142186wm.SECONDARY_BUTTON_TEXT, r8).A00(z));
        button.setHeight((int) AnonymousClass0J7.A00(context, (float) C161937qr.A01(r8, C141486ve.SECONDARY_BUTTON_HEIGHT)));
        button.setLineSpacing(0.0f, A012);
        button.setTypeface(C158977kt.A00().A05().A00(context, A062, 0));
        button.setLetterSpacing(A003 / (f / AnonymousClass000.A0B(context).scaledDensity));
        C17760wC.A00(button, this, 5);
        button.setAlpha(0.0f);
        return button;
    }

    public final void A01(FrameLayout frameLayout) {
        Context context = this.A01;
        boolean A012 = C153867c9.A01(context, this.A04);
        C142316x0 r1 = this.A05;
        AnonymousClass01E r0 = new AnonymousClass01E(context, C161937qr.A04(C142186wm.SPINNER, r1).A00(A012), (int) AnonymousClass0J7.A00(context, (float) C161937qr.A01(r1, C141486ve.SPINNER)));
        C125076Fb r7 = new C125076Fb(context);
        r7.A02(r0);
        FrameLayout frameLayout2 = this.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            this.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!this.A06) {
            Button A002 = A00(A012);
            C04830Qv A052 = C06560Yg.A05(A002);
            View A003 = C04830Qv.A00(A052);
            if (A003 != null) {
                A003.animate().setStartDelay(3000);
            }
            A052.A03(1.0f);
            A052.A08(200);
            A052.A09(new LinearInterpolator());
            A052.A02();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) AnonymousClass0J7.A00(context, 20.0f), 0, (int) AnonymousClass0J7.A00(context, 20.0f), (int) AnonymousClass0J7.A00(context, 20.0f));
            layoutParams2.weight = 1.0f;
            linearLayout.addView(A002, layoutParams2);
            frameLayout2.addView(linearLayout);
        }
        frameLayout2.addView(r7, layoutParams);
        frameLayout.addView(frameLayout2);
        r7.A00();
    }
}
