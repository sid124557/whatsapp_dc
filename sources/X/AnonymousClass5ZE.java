package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

/* renamed from: X.5ZE  reason: invalid class name */
public class AnonymousClass5ZE {
    public int A00 = 1;
    public TextView A01;
    public AnonymousClass58N A02 = AnonymousClass58N.UNDEFINED;
    public boolean A03;
    public final ViewStub A04;
    public final ImageView A05;
    public final ImageView A06;
    public final MaterialButton A07;
    public final C56612sH A08;
    public final AnonymousClass33p A09;
    public final C620733j A0A;
    public final AnonymousClass5SY A0B;
    public final C69253Wh A0C;

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable == null || Build.VERSION.SDK_INT < 23) {
            return drawable2;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(50);
        A01(drawable, transitionDrawable, 0);
        A01(drawable2, transitionDrawable, 1);
        return transitionDrawable;
    }

    public void A02() {
        TextView textView = this.A01;
        if (textView != null && textView.getVisibility() != 8) {
            AnonymousClass33p r4 = this.A09;
            C18270x1.A0i(C18270x1.A03(r4), "create_group_tool_tip_nudge_last_impression_time", AnonymousClass0x9.A05(AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r4), "create_group_tool_tip_nudge_show_time")));
            AlphaAnimation A0G = C86604Kt.A0G();
            A0G.setDuration(100);
            this.A0C.BkS(new C70173a4(A0G, 12, this));
        }
    }

    public void A05(C1229666n r5, boolean z) {
        MaterialButton materialButton = this.A07;
        if (materialButton != null && r5 != null) {
            AnonymousClass0A8 r2 = new AnonymousClass0A8();
            r2.A09(materialButton);
            r2.A07(300);
            if (z) {
                r2.A0B(new AnonymousClass4ZQ(r5, this));
            }
            AnonymousClass0XC.A02(C86664Kz.A0l(materialButton), r2);
            C86614Ku.A15(C18290x4.A0G(materialButton), materialButton, R.dimen.f6nameremoved);
            materialButton.setIconPadding(0);
            C86634Kw.A1I(materialButton);
        }
    }

    public AnonymousClass5ZE(ViewStub viewStub, ImageView imageView, ImageView imageView2, MaterialButton materialButton, C56612sH r8, AnonymousClass33p r9, C620733j r10, AnonymousClass1VX r11, AnonymousClass5SY r12, C69253Wh r13) {
        this.A08 = r8;
        this.A0B = r12;
        this.A0A = r10;
        this.A0C = r13;
        this.A09 = r9;
        C626936e.A04(imageView);
        this.A05 = imageView;
        C626936e.A04(imageView2);
        this.A06 = imageView2;
        this.A07 = materialButton;
        this.A04 = viewStub;
        if (materialButton != null && !C106545Zk.A04(r11, (C58422vE) null, 4997)) {
            Context context = materialButton.getContext();
            materialButton.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) / 2);
            materialButton.setBackgroundTintList(AnonymousClass0Y8.A07(context, AnonymousClass5Yj.A00(context)));
            materialButton.setTextColor(AnonymousClass0Y8.A07(context, R.color.f5nameremoved));
            materialButton.setIconTint(AnonymousClass0Y8.A07(context, R.color.f5nameremoved));
        }
    }

    public static void A01(Drawable drawable, TransitionDrawable transitionDrawable, int i) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(i, drawable.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(i, intrinsicHeight);
        transitionDrawable.setLayerGravity(i, 17);
    }

    public void A03(C1229666n r5) {
        ViewStub viewStub;
        if (r5.BDl() != null && (viewStub = this.A04) != null && !this.A0B.A00()) {
            TextView textView = this.A01;
            if (textView == null) {
                textView = (TextView) viewStub.inflate();
                this.A01 = textView;
            }
            textView.setText(r5.BDl());
            TextView textView2 = this.A01;
            textView2.setBackground(AnonymousClass0x7.A0J(textView2.getContext(), this.A0A, R.drawable.tooltip_ptt));
            this.A01.setVisibility(0);
            C86644Kx.A13(this.A01, C86604Kt.A0H());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r5 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r11 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C1229666n r15) {
        /*
            r14 = this;
            android.graphics.drawable.Drawable r11 = r15.B9J()
            java.lang.String r1 = r15.B9I()
            android.graphics.drawable.Drawable r5 = r15.BCZ()
            java.lang.String r4 = r15.BCY()
            android.widget.ImageView r6 = r14.A05
            r0 = 0
            X.C18320x8.A16(r6, r15, r14, r0)
            android.widget.ImageView r3 = r14.A06
            r0 = 1
            X.C18320x8.A16(r3, r15, r14, r0)
            if (r1 == 0) goto L_0x0021
            r6.setContentDescription(r1)
        L_0x0021:
            if (r11 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            android.graphics.drawable.Drawable r0 = A00(r0, r11)
            r6.setImageDrawable(r0)
        L_0x002e:
            boolean r0 = r14.A03
            r2 = 0
            r10 = 8
            if (r0 != 0) goto L_0x0038
            r7 = 0
            if (r11 != 0) goto L_0x003a
        L_0x0038:
            r7 = 8
        L_0x003a:
            X.58N r1 = r14.A02
            X.58N r0 = X.AnonymousClass58N.RAIL
            if (r1 == r0) goto L_0x00e9
            com.google.android.material.button.MaterialButton r9 = r14.A07
            if (r9 == 0) goto L_0x00e9
            java.lang.String r8 = r15.B9K()
            if (r8 == 0) goto L_0x00e9
            r0 = 2
            X.C18320x8.A16(r9, r15, r14, r0)
            r6.setVisibility(r10)
            r9.setVisibility(r7)
            if (r7 != 0) goto L_0x0072
            r9.setIcon(r11)
            java.lang.String r0 = X.C86614Ku.A0u(r9)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0072
            X.3Wh r6 = r14.A0C
            r0 = 3
            X.3bv r7 = new X.3bv
            r7.<init>(r0, r8, r14)
            r0 = 3000(0xbb8, double:1.482E-320)
            android.os.Handler r6 = r6.A00
            r6.postDelayed(r7, r0)
        L_0x0072:
            r9.setContentDescription(r8)
        L_0x0075:
            if (r5 == 0) goto L_0x0082
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            android.graphics.drawable.Drawable r0 = A00(r0, r5)
            r3.setImageDrawable(r0)
        L_0x0082:
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x0089
            r1 = 0
            if (r5 != 0) goto L_0x008b
        L_0x0089:
            r1 = 8
        L_0x008b:
            int r0 = r3.getVisibility()
            if (r1 == r0) goto L_0x00b1
            r3.setVisibility(r1)
            r6 = 1
            r7 = 0
            int r0 = r14.A00
            float r0 = (float) r0
            if (r1 != 0) goto L_0x00d5
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            float r11 = r11 * r0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r10 = r6
            r12 = r6
            r13 = r7
            r8 = r6
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 100
            r5.setDuration(r0)
        L_0x00ae:
            r3.startAnimation(r5)
        L_0x00b1:
            if (r4 == 0) goto L_0x00b6
            r3.setContentDescription(r4)
        L_0x00b6:
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = r15.BDl()
            if (r0 != 0) goto L_0x00c2
        L_0x00c0:
            r2 = 8
        L_0x00c2:
            android.widget.TextView r0 = r14.A01
            if (r0 != 0) goto L_0x00d0
            r0 = 8
        L_0x00c8:
            if (r2 == r0) goto L_0x00cf
            if (r2 != 0) goto L_0x010a
            r14.A03(r15)
        L_0x00cf:
            return
        L_0x00d0:
            int r0 = r0.getVisibility()
            goto L_0x00c8
        L_0x00d5:
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            float r13 = r13 * r0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r10 = r6
            r11 = r7
            r12 = r6
            r8 = r6
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 100
            r5.setDuration(r0)
            goto L_0x00ae
        L_0x00e9:
            com.google.android.material.button.MaterialButton r0 = r14.A07
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r10)
        L_0x00f0:
            int r0 = r6.getVisibility()
            if (r7 == r0) goto L_0x0075
            r6.setVisibility(r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            if (r7 != 0) goto L_0x0101
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0101:
            android.view.animation.AlphaAnimation r0 = X.AnonymousClass4L0.A0C(r1, r0)
            X.C86644Kx.A13(r6, r0)
            goto L_0x0075
        L_0x010a:
            r14.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZE.A04(X.66n):void");
    }
}
