package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0D5  reason: invalid class name */
public final class AnonymousClass0D5 extends AnonymousClass6NB {
    public SeekBar.OnSeekBarChangeListener A00;
    public AnonymousClass04T A01;

    public static FrameLayout A00(Context context) {
        C162457s7.A0J(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new AnonymousClass04T(context));
        return frameLayout;
    }

    public static void A03(FrameLayout frameLayout) {
        C162457s7.A0J(frameLayout, 0);
        if (frameLayout.getChildCount() > 0) {
            View A002 = C04990Rl.A00(frameLayout);
            C162457s7.A0K(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
            ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0P(android.widget.FrameLayout r13, X.C153427bI r14, X.AnonymousClass84O r15) {
        /*
            r12 = this;
            r1 = 0
            X.C162457s7.A0J(r13, r1)
            r0 = 1
            X.C162457s7.A0J(r14, r0)
            r0 = 2
            X.C162457s7.A0J(r15, r0)
            java.lang.Object r2 = X.C162377rs.A05(r14, r15)
            X.0Ls r2 = (X.C03830Ls) r2
            r0 = 41
            java.lang.String r8 = r15.A0O(r0)
            r3 = 43
            r0 = 0
            float r0 = r15.A0B(r3, r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r0 = 40
            java.util.List r9 = r15.A0S(r0)
            r0 = 46
            java.util.List r10 = r15.A0S(r0)
            X.C162457s7.A0D(r10)
            r0 = 45
            boolean r11 = r15.A0W(r0, r1)
            r5 = 0
            X.0Pr r6 = new X.0Pr
            r6.<init>(r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x004b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A01
            if (r0 != 0) goto L_0x0056
            X.0wt r0 = new X.0wt
            r0.<init>(r12, r2, r13, r1)
            r2.A01 = r0
        L_0x004b:
            android.view.ViewTreeObserver r1 = r13.getViewTreeObserver()
            if (r2 == 0) goto L_0x008b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A01
        L_0x0053:
            r1.addOnGlobalLayoutListener(r0)
        L_0x0056:
            int r0 = r13.getChildCount()
            if (r0 <= 0) goto L_0x00cd
            android.view.View r1 = X.C04990Rl.A00(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.C162457s7.A0K(r1, r0)
            X.04T r1 = (X.AnonymousClass04T) r1
            r12.A01 = r1
            java.util.List r1 = r6.A04
            if (r2 == 0) goto L_0x0089
            X.0Pr r0 = r2.A02
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = r0.A04
        L_0x0073:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r3 = "parametricSlider"
            if (r2 == 0) goto L_0x0094
            X.04T r1 = r12.A01
            if (r1 != 0) goto L_0x008d
            X.C162457s7.A0M(r3)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x0089:
            r0 = r5
            goto L_0x0073
        L_0x008b:
            r0 = r5
            goto L_0x0053
        L_0x008d:
            int r0 = r13.getHeight()
            r1.A02(r2, r0)
        L_0x0094:
            java.lang.Float r4 = r6.A01
            if (r4 == 0) goto L_0x00b0
            float r1 = r4.floatValue()
            r0 = 100
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = (int) r1
            X.04T r0 = r12.A01
            if (r0 != 0) goto L_0x00ad
            X.C162457s7.A0M(r3)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x00ad:
            r0.setProgress(r1)
        L_0x00b0:
            java.util.List r3 = r6.A03
            if (r4 == 0) goto L_0x00ce
            float r1 = r4.floatValue()
            r0 = 100
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00ce
            r12.A0S(r3)
        L_0x00c6:
            r12.A0R(r14, r15)
            if (r2 == 0) goto L_0x00cd
            r2.A02 = r6
        L_0x00cd:
            return r5
        L_0x00ce:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0D5.A0P(android.widget.FrameLayout, X.7bI, X.84O):java.lang.Object");
    }

    public void A0Q(FrameLayout frameLayout, C153427bI r5, AnonymousClass84O r6) {
        C162457s7.A0J(frameLayout, 0);
        C162457s7.A0J(r5, 1);
        C162457s7.A0J(r6, 2);
        if (frameLayout.getChildCount() > 0) {
            View A002 = C04990Rl.A00(frameLayout);
            C162457s7.A0K(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
            ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        }
        C03830Ls r0 = (C03830Ls) C162377rs.A05(r5, r6);
        if (r0 != null) {
            r0.A02 = null;
            r0.A01 = null;
            r0.A00 = null;
        }
    }

    public static final AnonymousClass2XK A02() {
        AnonymousClass2XK r0 = AnonymousClass2XK.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2XK r02 = new AnonymousClass2XK();
        AnonymousClass2XK.A01 = r02;
        return r02;
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        return A0P((FrameLayout) view, r3, r4);
    }

    public /* bridge */ /* synthetic */ void A0N(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A0Q((FrameLayout) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A03((FrameLayout) view);
    }

    public final void A0R(C153427bI r3, AnonymousClass84O r4) {
        C07420aq r1 = new C07420aq(this, r3, r4);
        this.A00 = r1;
        AnonymousClass04T r0 = this.A01;
        if (r0 == null) {
            C162457s7.A0M("parametricSlider");
            throw AnonymousClass000.A0L();
        } else {
            r0.setOnSeekBarChangeListener(r1);
        }
    }

    public final void A0S(List list) {
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m != null) {
                A0I.add(C175728Zm.A0K("/value", A0m));
            } else {
                throw AnonymousClass001.A0e("Required value was null.");
            }
        }
        A02().A00();
    }

    public AnonymousClass0D5(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return A00(context);
    }
}
