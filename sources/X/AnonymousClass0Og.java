package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.0Og  reason: invalid class name */
public final class AnonymousClass0Og {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final AnonymousClass0Ki A03;
    public final AnonymousClass0Kj A04;
    public final C153427bI A05;
    public final C142316x0 A06;

    public final ImageView A00(boolean z) {
        ImageView imageView = new ImageView(this.A01);
        imageView.setImageResource(C02430Gd.company_layer_icons_close_outline_24);
        imageView.setColorFilter(C161937qr.A04(C142186wm.CLOSE_BUTTON, this.A06).A00(z));
        C17760wC.A00(imageView, this, 4);
        return imageView;
    }

    public final void A01(FrameLayout frameLayout, AnonymousClass0Kj r15) {
        FrameLayout frameLayout2;
        FrameLayout frameLayout3 = this.A00;
        if (frameLayout3 == null) {
            this.A00 = new FrameLayout(this.A01);
        } else if (!(frameLayout3.getParent() == null || (frameLayout2 = this.A00) == null)) {
            ViewParent parent = frameLayout2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A00);
            }
            this.A00.removeAllViews();
        }
        Context context = this.A01;
        boolean A012 = C153867c9.A01(context, this.A05);
        C142316x0 r4 = this.A06;
        int A022 = C161937qr.A02(r4, C141746w4.SCREEN_GUTTER);
        AnonymousClass0AQ A032 = AnonymousClass0AQ.A03((Resources.Theme) null, context.getResources(), R.drawable.ic_error_outline_96_rev);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(A032);
        imageView.setPadding(0, 0, 0, (int) AnonymousClass0J7.A00(context, (float) C161937qr.A02(r4, C141746w4.SECTION)));
        imageView.setColorFilter(C161937qr.A04(C142186wm.ERROR_ICON, r4).A00(A012));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        float f = (float) A022;
        linearLayout.setPadding((int) AnonymousClass0J7.A00(context, f), 0, (int) AnonymousClass0J7.A00(context, f), 0);
        linearLayout.addView(imageView, layoutParams);
        C153647bi A052 = C161937qr.A05(r4, C142166wk.HEADLINE_1);
        TextView textView = new TextView(context);
        textView.setText(C02450Gf.__external__failed_loading_title);
        textView.setTextColor(C161937qr.A04(C142186wm.HEADLINE_TEXT, r4).A00(A012));
        float A053 = (float) A052.A05();
        textView.setTextSize(A053);
        textView.setLineSpacing(0.0f, A052.A03());
        textView.setLetterSpacing(A052.A02() / (A053 / AnonymousClass000.A0B(context).scaledDensity));
        textView.setTypeface(C158977kt.A00().A05().A00(context, A052.A07(), 0));
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) AnonymousClass0J7.A00(context, (float) C161937qr.A02(r4, C141746w4.HEADLINE_BODY)));
        C153647bi A054 = C161937qr.A05(r4, C142166wk.BODY);
        TextView textView2 = new TextView(context);
        textView2.setText(C02450Gf.__external__failed_loading_message);
        textView2.setTextColor(C161937qr.A04(C142186wm.BODY_TEXT, r4).A00(A012));
        float A055 = (float) A054.A05();
        textView2.setTextSize(A055);
        textView2.setLineSpacing(0.0f, A054.A03());
        textView.setTypeface(C158977kt.A00().A05().A00(context, A054.A07(), 0));
        textView2.setLetterSpacing(A054.A02() / (A055 / AnonymousClass000.A0B(context).scaledDensity));
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        C153477bO A033 = C161937qr.A03(C141336vP.PRIMARY_BUTTON, r4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AnonymousClass0J7.A00(context, (float) C161937qr.A00(C141476vd.PRIMARY_BUTTON, r4)));
        gradientDrawable.setColor(C161937qr.A04(C142186wm.PRIMARY_BUTTON_BACKGROUND, r4).A00(A012));
        gradientDrawable.setStroke(A033.A01(), A033.A03().A00(A012));
        C153647bi A056 = C161937qr.A05(r4, C142166wk.PRIMARY_BUTTON);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(C02450Gf.__external__failed_loading_refresh);
        float A057 = (float) A056.A05();
        button.setTextSize(A057);
        button.setTextColor(C161937qr.A04(C142186wm.PRIMARY_BUTTON_TEXT, r4).A00(A012));
        button.setHeight((int) AnonymousClass0J7.A00(context, (float) C161937qr.A01(r4, C141486ve.PRIMARY_BUTTON_HEIGHT)));
        button.setLineSpacing(0.0f, A056.A03());
        button.setTypeface(C158977kt.A00().A05().A00(context, A056.A07(), 0));
        button.setLetterSpacing(A056.A02() / (A057 / AnonymousClass000.A0B(context).scaledDensity));
        int A023 = C161937qr.A02(r4, C141746w4.BUTTON_PADDING_HORIZONTAL);
        button.setPadding(A023, 0, A023, 0);
        button.setOnClickListener(new C17810wH(r15, 2, this));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) AnonymousClass0J7.A00(context, 20.0f), 0, (int) AnonymousClass0J7.A00(context, 20.0f), (int) AnonymousClass0J7.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        FrameLayout frameLayout4 = this.A00;
        ImageView A002 = A00(A012);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) AnonymousClass0J7.A00(context, 24.0f), (int) AnonymousClass0J7.A00(context, 24.0f));
        layoutParams3.setMargins((int) AnonymousClass0J7.A00(context, 20.0f), (int) AnonymousClass0J7.A00(context, 30.0f), 0, 0);
        layoutParams3.gravity = 51;
        frameLayout4.addView(A002, layoutParams3);
        this.A00.addView(linearLayout);
        this.A00.addView(linearLayout2);
        frameLayout.addView(this.A00);
    }

    public AnonymousClass0Og(Context context, AnonymousClass0Ki r3, AnonymousClass0Kj r4, C153427bI r5, C142316x0 r6) {
        this.A01 = context;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
    }
}
