package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.5fb  reason: invalid class name and case insensitive filesystem */
public final class C110045fb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ Toolbar A04;
    public final /* synthetic */ AnonymousClass676 A05;
    public final /* synthetic */ AnonymousClass5JF A06;
    public final /* synthetic */ AnonymousClass59J A07;

    public C110045fb(View view, ViewGroup viewGroup, TextView textView, Toolbar toolbar, AnonymousClass676 r5, AnonymousClass5JF r6, AnonymousClass59J r7, int i) {
        this.A05 = r5;
        this.A07 = r7;
        this.A06 = r6;
        this.A03 = textView;
        this.A02 = viewGroup;
        this.A00 = i;
        this.A04 = toolbar;
        this.A01 = view;
    }

    public void onGlobalLayout() {
        int i;
        int measuredWidth;
        ValueAnimator duration;
        AnonymousClass676 r7 = this.A05;
        AnonymousClass59J r9 = this.A07;
        View findViewById = r7.findViewById(r9.tooltipMenuItemId);
        if (findViewById != null) {
            AnonymousClass5JF r6 = this.A06;
            TextView textView = this.A03;
            C620733j r15 = r6.A02;
            textView.setBackground(AnonymousClass0x7.A0J(r7.getActivity(), r15, R.drawable.tooltip_ptt_reversed));
            textView.setText(r9.tooltipText);
            textView.setVisibility(0);
            C107295b4.A00(r7.getWAContext().A00, r7.getSystemServices(), r7.getString(r9.tooltipText));
            ViewGroup viewGroup = this.A02;
            int i2 = this.A00;
            Toolbar toolbar = this.A04;
            Context context = r7.getWAContext().A00;
            C162457s7.A0D(context);
            int A042 = AnonymousClass5YI.A04(context, 30.0f);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            textView.measure(0, 0);
            if (toolbar != null) {
                i = toolbar.getMeasuredHeight();
            } else {
                i = 0;
            }
            int A043 = (i2 + i) - AnonymousClass5YI.A04(r7.getWAContext().A00, 20.0f);
            int A012 = AnonymousClass4L0.A01(context.getResources(), r9.tooltipMaxWidth);
            int measuredWidth2 = findViewById.getMeasuredWidth() / 2;
            if (C620733j.A04(r15)) {
                measuredWidth = iArr[0] + measuredWidth2;
            } else {
                measuredWidth = viewGroup.getMeasuredWidth() - (iArr[0] + measuredWidth2);
            }
            int i3 = measuredWidth + A042;
            int min = Math.min(A012, textView.getMeasuredWidth());
            int i4 = i3;
            if (i3 > min) {
                i4 = min;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i4;
                textView.setLayoutParams(layoutParams);
                C107555bV.A06(textView, r15, i3 - i4, A043, 0, 0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f});
                r6.A00 = ofFloat;
                if (!(ofFloat == null || (duration = ofFloat.setDuration(320)) == null)) {
                    duration.start();
                }
                r7.getGlobalUI().A0T(r6.A03, 10000);
                C86604Kt.A1G(this.A01, this);
                return;
            }
            throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
