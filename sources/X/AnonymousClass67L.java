package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;

/* renamed from: X.67L  reason: invalid class name */
public class AnonymousClass67L extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public AnonymousClass67L(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new AnonymousClass67L(obj, i));
        animator.start();
    }

    public static void A01(Animator animator, Object obj, int i) {
        animator.addListener(new AnonymousClass67L(obj, i));
    }

    public static void A02(AnonymousClass67L r2) {
        int i;
        C88464Yv r22 = (C88464Yv) r2.A00;
        r22.A02 = null;
        boolean z = r22.A03;
        WaImageView waImageView = r22.A09;
        if (z) {
            waImageView.setAlpha(1.0f);
        } else {
            waImageView.setAlpha(0.0f);
            waImageView.setVisibility(8);
        }
        WaTextView waTextView = r22.A0A;
        if (r22.A03) {
            i = r22.A04;
        } else {
            i = r22.A05;
        }
        waTextView.setTextColor(i);
    }

    public static void A03(AnonymousClass67L r8) {
        C159097l7 r0 = (C159097l7) r8.A00;
        C178908iI r82 = r0.A0K;
        int i = r0.A0C;
        int i2 = r0.A0A;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) r82;
        snackbarContentLayout.A02.setAlpha(0.0f);
        long j = (long) i2;
        ViewPropertyAnimator duration = snackbarContentLayout.A02.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.A03;
        long j2 = (long) (i - i2);
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.A01.getVisibility() == 0) {
            snackbarContentLayout.A01.setAlpha(0.0f);
            snackbarContentLayout.A01.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 6:
                super.onAnimationCancel(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
                callDetailsLayout.A00 = 0;
                callDetailsLayout.clearAnimation();
                return;
            case 19:
                super.onAnimationCancel(animator);
                ((AnonymousClass55U) this.A00).A05.setImageDrawable((Drawable) null);
                return;
            case 20:
                animator.removeListener(this);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018d, code lost:
        r1.height = r0;
        r2.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0192, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a4, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b2, code lost:
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x02b7;
                case 1: goto L_0x00f4;
                case 2: goto L_0x02a9;
                case 3: goto L_0x0296;
                case 4: goto L_0x0289;
                case 5: goto L_0x026f;
                case 6: goto L_0x022e;
                case 7: goto L_0x021d;
                case 8: goto L_0x0214;
                case 9: goto L_0x020a;
                case 10: goto L_0x0005;
                case 11: goto L_0x01fe;
                case 12: goto L_0x0005;
                case 13: goto L_0x01f6;
                case 14: goto L_0x00b7;
                case 15: goto L_0x01ec;
                case 16: goto L_0x00ad;
                case 17: goto L_0x0086;
                case 18: goto L_0x01dc;
                case 19: goto L_0x01ce;
                case 20: goto L_0x01ba;
                case 21: goto L_0x01ae;
                case 22: goto L_0x0193;
                case 23: goto L_0x017c;
                case 24: goto L_0x0193;
                case 25: goto L_0x016a;
                case 26: goto L_0x0166;
                case 27: goto L_0x0064;
                case 28: goto L_0x015b;
                case 29: goto L_0x0009;
                case 30: goto L_0x0193;
                case 31: goto L_0x0149;
                case 32: goto L_0x013a;
                case 33: goto L_0x0123;
                case 34: goto L_0x0005;
                case 35: goto L_0x0193;
                case 36: goto L_0x0111;
                case 37: goto L_0x0193;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r6)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r5.A00
            X.560 r2 = (X.AnonymousClass560) r2
            android.view.View r1 = r2.A0F
            if (r1 == 0) goto L_0x0008
            r0 = 0
            r2.A0O = r0
            int r0 = r1.getMeasuredWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            r1.setPivotX(r0)
            android.view.View r1 = r2.A0F
            int r0 = r1.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r1.setPivotY(r0)
            X.8ji r0 = r2.A0M
            if (r0 == 0) goto L_0x0008
            X.8Jz r0 = (X.C172198Jz) r0
            X.5qO r4 = r0.A00
            X.1VX r1 = r4.A0V
            r0 = 1052(0x41c, float:1.474E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0008
            android.graphics.Rect r3 = X.AnonymousClass001.A0N()
            android.graphics.Point r1 = X.AnonymousClass4L0.A07()
            android.widget.FrameLayout r0 = r4.A08
            r0.getGlobalVisibleRect(r3, r1)
            int r2 = r1.x
            int r0 = r3.left
            int r2 = r2 - r0
            int r1 = r1.y
            int r0 = r3.top
            int r1 = r1 - r0
            r3.offset(r2, r1)
            android.graphics.Rect r0 = r4.A0L
            r0.set(r3)
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x02bf
            r0 = 0
            r4.B2u(r0)
            return
        L_0x0064:
            java.lang.Object r2 = r5.A00
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r2
            com.whatsapp.WaTextView r1 = r2.A0A
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            com.whatsapp.WaTextView r1 = r2.A0A
            r0 = 4
            r1.setVisibility(r0)
            X.8ja r1 = r2.A0E
            if (r1 == 0) goto L_0x0008
            X.5po r1 = (X.C116145po) r1
            X.52a r0 = new X.52a
            r0.<init>(r1)
            r1.A05 = r0
            r0 = 0
            r1.A09 = r0
            return
        L_0x0086:
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            X.5Ub r2 = (X.C105225Ub) r2
            androidx.appcompat.widget.SearchView r0 = r2.A02
            r0.A09()
            androidx.appcompat.widget.Toolbar r1 = r2.A06
            r0 = 4
            r1.setVisibility(r0)
            boolean r0 = r2 instanceof X.C97904zS
            if (r0 == 0) goto L_0x0008
            X.4zS r2 = (X.C97904zS) r2
            android.view.View r0 = r2.A04
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 != 0) goto L_0x0008
            androidx.appcompat.widget.Toolbar r1 = r2.A0B
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x00ad:
            java.lang.Object r0 = r5.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x00b7:
            java.lang.Object r0 = r5.A00
            X.5Uj r0 = (X.C105305Uj) r0
            X.5nf r3 = r0.A06
            X.5Uj r0 = r3.A0V
            X.5Us r2 = r0.A0G
            X.08M r0 = r2.A05
            int r1 = X.C86604Kt.A05(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00dc
            X.4LC r0 = r3.A07
            if (r0 == 0) goto L_0x00dc
            X.03q r0 = r3.A04
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x00dc
            X.4LC r0 = r3.A07
        L_0x00d8:
            r0.show()
            return
        L_0x00dc:
            X.08M r0 = r2.A05
            int r1 = X.C86604Kt.A05(r0)
            r0 = 3
            if (r1 != r0) goto L_0x0008
            X.4LE r0 = r3.A08
            if (r0 == 0) goto L_0x0008
            X.03q r0 = r3.A04
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0008
            X.4LE r0 = r3.A08
            goto L_0x00d8
        L_0x00f4:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.691 r0 = (X.AnonymousClass691) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            android.view.ViewGroup r1 = r2.A0L
            if (r1 == 0) goto L_0x0008
            android.view.View$OnLayoutChangeListener r0 = r2.A2J
            r1.removeOnLayoutChangeListener(r0)
            android.animation.AnimatorSet r0 = r2.A0B
            r0.removeAllListeners()
            r0 = 0
            r2.A0B = r0
            return
        L_0x0111:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C102875Kp.A08
            goto L_0x018d
        L_0x0123:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            com.whatsapp.wds.components.search.WDSSearchBar r2 = (com.whatsapp.wds.components.search.WDSSearchBar) r2
            androidx.appcompat.widget.Toolbar r1 = r2.A06
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.wds.components.search.WDSSearchView r0 = r2.A07
            r0.requestFocus()
            return
        L_0x013a:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            goto L_0x02a4
        L_0x0149:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.AnonymousClass5X4.A04
            goto L_0x018d
        L_0x015b:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.util.FloatingChildLayout r0 = (com.whatsapp.util.FloatingChildLayout) r0
            android.view.View r1 = r0.A09
            goto L_0x02a4
        L_0x0166:
            A02(r5)
            return
        L_0x016a:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C103375Mq.A01
            goto L_0x018d
        L_0x017c:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.AnonymousClass5RX.A01
        L_0x018d:
            r1.height = r0
            r2.requestLayout()
            return
        L_0x0193:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
            r0 = 8
            r2.setVisibility(r0)
            r2.requestLayout()
            return
        L_0x01ae:
            java.lang.Object r0 = r5.A00
            X.6AE r0 = (X.AnonymousClass6AE) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x01ba:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            java.util.List r1 = r2.A1K
            java.util.List r0 = r2.A1L
            r1.removeAll(r0)
            X.4Oi r0 = r2.A0q
            r0.notifyDataSetChanged()
            r0 = 0
            r2.A00 = r0
            return
        L_0x01ce:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.55U r0 = (X.AnonymousClass55U) r0
            com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview r1 = r0.A05
            r0 = 0
            r1.setImageDrawable(r0)
            return
        L_0x01dc:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            X.5Ub r1 = (X.C105225Ub) r1
            androidx.appcompat.widget.SearchView r0 = r1.A02
            r0.A08()
            android.view.View r1 = r1.A04
            goto L_0x02a4
        L_0x01ec:
            java.lang.Object r0 = r5.A00
            X.4vU r0 = (X.C96014vU) r0
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = r0.A06
            r0.A1O()
            return
        L_0x01f6:
            java.lang.Object r0 = r5.A00
            X.4pr r0 = (X.C94084pr) r0
            r0.A76()
            return
        L_0x01fe:
            java.lang.Object r0 = r5.A00
            X.5O7 r0 = (X.AnonymousClass5O7) r0
            com.whatsapp.TextEmojiLabel r1 = r0.A03
            java.lang.CharSequence r0 = r0.A04
            r1.setText(r0)
            return
        L_0x020a:
            java.lang.Object r0 = r5.A00
            X.5J9 r0 = (X.AnonymousClass5J9) r0
            X.4oI r0 = r0.A03
            android.view.ViewGroup r1 = r0.A08
            goto L_0x02b2
        L_0x0214:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.C86634Kw.A1R(r0)
            return
        L_0x021d:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setTranslationY(r0)
            return
        L_0x022e:
            super.onAnimationCancel(r6)
            java.lang.Object r4 = r5.A00
            com.whatsapp.calling.CallDetailsLayout r4 = (com.whatsapp.calling.CallDetailsLayout) r4
            r0 = 2
            r4.A00 = r0
            r3 = 8
            X.0A8 r2 = new X.0A8
            r2.<init>()
            r0 = 400(0x190, double:1.976E-321)
            r2.A07(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.A08(r0)
            android.view.ViewGroup r0 = X.C86664Kz.A0l(r4)
            X.AnonymousClass0XC.A02(r0, r2)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A08
            r0.setVisibility(r3)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166854(0x7f070686, float:1.7947965E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            com.whatsapp.calling.CallDetailsLayout.A00(r4, r1, r0)
            r4.clearAnimation()
            return
        L_0x026f:
            super.onAnimationEnd(r6)
            java.lang.Object r2 = r5.A00
            X.4zS r2 = (X.C97904zS) r2
            androidx.appcompat.widget.SearchView r1 = r2.A06
            java.lang.String r0 = X.C97904zS.A0H
            r1.setQueryHint(r0)
            android.widget.TextView r0 = r2.A04
            X.C86634Kw.A1I(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x0289:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            X.4zS r0 = (X.C97904zS) r0
            android.widget.TextView r0 = r0.A05
            X.C86634Kw.A1I(r0)
            return
        L_0x0296:
            super.onAnimationEnd(r6)
            java.lang.Object r1 = r5.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            androidx.appcompat.widget.SearchView r0 = r1.A0O
            r0.A08()
            android.view.View r1 = r1.A0J
        L_0x02a4:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x02a9:
            super.onAnimationEnd(r6)
            java.lang.Object r0 = r5.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            android.view.View r1 = r0.A0F
        L_0x02b2:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x02b7:
            java.lang.Object r0 = r5.A00
            X.7l7 r0 = (X.C159097l7) r0
            r0.A04()
            return
        L_0x02bf:
            r4.B2a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67L.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass4UC r1;
        Object obj;
        switch (this.A01) {
            case 0:
                A03(this);
                return;
            case 4:
                super.onAnimationStart(animator);
                C97904zS r2 = (C97904zS) this.A00;
                r2.A05.setAlpha(1.0f);
                r2.A05.setText(C97904zS.A0F);
                r2.A06.setQueryHint("");
                return;
            case 5:
                super.onAnimationStart(animator);
                ((C97904zS) this.A00).A04.setText(C97904zS.A0H);
                return;
            case 7:
                super.onAnimationStart(animator);
                InCallBannerViewModel inCallBannerViewModel = ((VoipInCallNotifBanner) this.A00).A05;
                if (inCallBannerViewModel != null) {
                    C18320x8.A18(inCallBannerViewModel.A0E, false);
                    C118285tI r22 = inCallBannerViewModel.A04;
                    if (r22.size() <= 1) {
                        r22.clear();
                        r1 = inCallBannerViewModel.A0D;
                        obj = null;
                    } else {
                        r22.remove(0);
                        r1 = inCallBannerViewModel.A0D;
                        obj = r22.get(0);
                    }
                    r1.A0H(obj);
                    return;
                }
                return;
            case 10:
                C94024pj r3 = (C94024pj) this.A00;
                r3.setAlpha(0.0f);
                for (int i = 0; i < r3.getChildCount(); i++) {
                    r3.A0H[i] = r3.getChildAt(i).getMeasuredWidth();
                }
                for (int i2 = 0; i2 < r3.getChildCount(); i2++) {
                    r3.getChildAt(i2).setVisibility(8);
                }
                return;
            case 12:
                C162457s7.A0J(animator, 0);
                super.onAnimationStart(animator);
                View view = (View) this.A00;
                view.setAlpha(0.0f);
                view.setVisibility(0);
                return;
            case 23:
            case 25:
            case 31:
            case 36:
                C162457s7.A0J(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A00).setVisibility(0);
                return;
            case 34:
                C162457s7.A0J(animator, 0);
                super.onAnimationStart(animator);
                View view2 = (View) this.A00;
                view2.setVisibility(0);
                view2.setAlpha(0.0f);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
