package X;

import android.animation.ValueAnimator;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.util.ArrayList;

/* renamed from: X.5Aj  reason: invalid class name and case insensitive filesystem */
public class C100295Aj implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C100295Aj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AnonymousClass6BG A00(VoiceStatusContentView voiceStatusContentView) {
        voiceStatusContentView.A0F = new ArrayList();
        voiceStatusContentView.A00 = new C100295Aj(voiceStatusContentView, 19);
        return new AnonymousClass6BG((Object) voiceStatusContentView, 34);
    }

    public static final void A01(ValueAnimator valueAnimator, C100295Aj r3) {
        ((C88464Yv) r3.A00).A09.setAlpha(AnonymousClass001.A03(valueAnimator));
    }

    public static final void A02(ValueAnimator valueAnimator, C100295Aj r3) {
        ((C88464Yv) r3.A00).A0A.setTextColor(C86604Kt.A01(valueAnimator));
    }

    public static void A03(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C100295Aj(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.components.RoundCornerProgressBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.components.SegmentedProgressBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: com.whatsapp.components.RoundCornerProgressBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: com.whatsapp.components.RoundCornerProgressBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: android.widget.FrameLayout$LayoutParams} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020f, code lost:
        r1.setBackgroundColor(X.C86604Kt.A01(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0216, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022f, code lost:
        r2.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0232, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0261, code lost:
        r0 = r1.getLayoutParams();
        r0.height = r2;
        r1.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029e, code lost:
        r1.postInvalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00db, code lost:
        r0 = r2.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        r0.height = r1;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        r2.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r4.A0U != false) goto L_0x003d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x02bb;
                case 1: goto L_0x02af;
                case 2: goto L_0x00e7;
                case 3: goto L_0x02a2;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00cf;
                case 6: goto L_0x0294;
                case 7: goto L_0x0289;
                case 8: goto L_0x026b;
                case 9: goto L_0x00c0;
                case 10: goto L_0x0253;
                case 11: goto L_0x0242;
                case 12: goto L_0x0233;
                case 13: goto L_0x0227;
                case 14: goto L_0x001d;
                case 15: goto L_0x0013;
                case 16: goto L_0x0217;
                case 17: goto L_0x020b;
                case 18: goto L_0x0204;
                case 19: goto L_0x01bf;
                case 20: goto L_0x01b1;
                case 21: goto L_0x01ad;
                case 22: goto L_0x01a9;
                case 23: goto L_0x019d;
                case 24: goto L_0x0180;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0165;
                case 28: goto L_0x012c;
                case 29: goto L_0x010d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A00
            android.view.View r1 = (android.view.View) r1
            int r0 = X.C86604Kt.A01(r10)
            int r0 = r0 << 24
            r1.setBackgroundColor(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            int r1 = X.C86604Kt.A01(r10)
            goto L_0x00db
        L_0x001d:
            java.lang.Object r0 = r9.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = r0.A0I
            X.5Us r0 = r0.A0G
            X.08M r0 = r0.A05
            int r8 = X.C86604Kt.A05(r0)
            float r5 = X.AnonymousClass001.A03(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            boolean r0 = r4.A0U
            r3 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r3 = r5
        L_0x003e:
            java.lang.String r7 = "textTool"
            java.lang.String r6 = "shapeTool"
            java.lang.String r2 = "cropTool"
            if (r8 == r1) goto L_0x0094
            r0 = 2
            java.lang.String r1 = "penTool"
            if (r8 == r0) goto L_0x0073
            r0 = 3
            if (r8 == r0) goto L_0x0052
            r0 = 5
            if (r8 == r0) goto L_0x0073
            return
        L_0x0052:
            android.widget.ImageView r0 = r4.A06
            if (r0 != 0) goto L_0x005b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x005b:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A07
            if (r0 != 0) goto L_0x0067
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0067:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0073:
            android.widget.ImageView r0 = r4.A06
            if (r0 != 0) goto L_0x007c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x007c:
            r0.setAlpha(r5)
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x0088
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0088:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0094:
            android.widget.ImageView r0 = r4.A07
            if (r0 != 0) goto L_0x009d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x009d:
            r0.setAlpha(r5)
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x00a9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x00a9:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x00b5:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A05
            if (r0 == 0) goto L_0x0012
            r0.setAlpha(r3)
            return
        L_0x00c0:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            int r1 = X.C86604Kt.A01(r10)
            android.widget.FrameLayout$LayoutParams r0 = X.C86664Kz.A0r(r2)
            r0.height = r1
            goto L_0x00e3
        L_0x00cf:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            int r1 = X.C86614Ku.A02(r10)
        L_0x00db:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0012
            r0.height = r1
        L_0x00e3:
            r2.setLayoutParams(r0)
            return
        L_0x00e7:
            java.lang.Object r3 = r9.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            com.whatsapp.PagerSlidingTabStrip r1 = r3.A05
            if (r1 == 0) goto L_0x00f6
            int r0 = X.C86604Kt.A01(r10)
            r1.setBackgroundColor(r0)
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            X.4Tb r1 = r3.A0l
            int r0 = r1.A00
            if (r2 >= r0) goto L_0x0012
            X.5KQ r0 = r1.A0I(r2)
            android.widget.TextView r1 = r0.A05
            int r0 = X.C86604Kt.A01(r10)
            r1.setTextColor(r0)
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x010d:
            java.lang.Object r0 = r9.A00
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            float r4 = X.AnonymousClass001.A03(r10)
            com.facebook.shimmer.ShimmerFrameLayout r3 = r0.A0J
            X.6NL r2 = new X.6NL
            r2.<init>()
            r1 = 0
            X.7QQ r0 = r2.A00
            r0.A0G = r1
            r2.A02(r4)
            X.7QQ r0 = r2.A01()
            r3.A05(r0)
            return
        L_0x012c:
            java.lang.Object r3 = r9.A00
            X.4NZ r3 = (X.AnonymousClass4NZ) r3
            float r2 = X.AnonymousClass001.A03(r10)
            float r1 = r3.A06
            float r0 = r3.A0A
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A00 = r1
            float r1 = r3.A08
            float r0 = r3.A0D
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A04 = r1
            float r1 = r3.A07
            float r0 = r3.A0C
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A02 = r1
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r2)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.A0K = r0
            r3.postInvalidate()
            r3.invalidateOutline()
            return
        L_0x0165:
            java.lang.Object r4 = r9.A00
            X.4NZ r4 = (X.AnonymousClass4NZ) r4
            int r3 = X.C86604Kt.A01(r10)
            android.graphics.Paint r2 = r4.A0Y
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r1)
            r2.setColorFilter(r0)
            r4.postInvalidate()
            r4.invalidateOutline()
            return
        L_0x0180:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 2
            X.C162457s7.A0J(r10, r0)
            int r1 = X.C86614Ku.A02(r10)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0197
            r0.height = r1
            r2.setLayoutParams(r0)
        L_0x0197:
            float r0 = r10.getAnimatedFraction()
            goto L_0x022f
        L_0x019d:
            java.lang.Object r1 = r9.A00
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r1 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r1
            float r0 = X.AnonymousClass001.A03(r10)
            r1.A02(r0)
            return
        L_0x01a9:
            A02(r10, r9)
            return
        L_0x01ad:
            A01(r10, r9)
            return
        L_0x01b1:
            java.lang.Object r1 = r9.A00
            com.whatsapp.storage.SizeTickerView r1 = (com.whatsapp.storage.SizeTickerView) r1
            int r0 = X.C86604Kt.A01(r10)
            r1.A02 = r0
            r1.setTextColor(r0)
            return
        L_0x01bf:
            java.lang.Object r7 = r9.A00
            com.whatsapp.status.playback.widget.VoiceStatusContentView r7 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r7
            float r6 = X.AnonymousClass001.A03(r10)
            java.util.List r5 = r7.A0J
            java.util.List r4 = r7.A0I
            java.util.List r3 = r7.A0F
            r3.clear()
            r2 = 0
        L_0x01d1:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x01fc
            java.lang.Object r0 = r4.get(r2)
            float r1 = X.AnonymousClass001.A05(r0)
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x01fa
            java.lang.Object r0 = r5.get(r2)
            float r0 = X.AnonymousClass001.A05(r0)
        L_0x01ed:
            float r1 = r1 - r0
            float r1 = r1 * r6
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x01d1
        L_0x01fa:
            r0 = 0
            goto L_0x01ed
        L_0x01fc:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r1 = r7.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A02(r3, r0)
            return
        L_0x0204:
            java.lang.Object r0 = r9.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            android.view.ViewGroup r1 = r0.A07
            goto L_0x020f
        L_0x020b:
            java.lang.Object r1 = r9.A00
            android.view.View r1 = (android.view.View) r1
        L_0x020f:
            int r0 = X.C86604Kt.A01(r10)
            r1.setBackgroundColor(r0)
            return
        L_0x0217:
            java.lang.Object r1 = r9.A00
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            int r0 = X.C86604Kt.A01(r10)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setChipBackgroundColor(r0)
            return
        L_0x0227:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            float r0 = X.AnonymousClass001.A03(r10)
        L_0x022f:
            r2.setAlpha(r0)
            return
        L_0x0233:
            java.lang.Object r1 = r9.A00
            X.5J9 r1 = (X.AnonymousClass5J9) r1
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            int r2 = X.C86614Ku.A02(r10)
            X.4oI r1 = r1.A03
            goto L_0x0261
        L_0x0242:
            java.lang.Object r0 = r9.A00
            X.4nZ r0 = (X.C92914nZ) r0
            float r1 = X.AnonymousClass001.A03(r10)
            android.view.ViewGroup r0 = r0.A0N
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0253:
            java.lang.Object r1 = r9.A00
            X.5J8 r1 = (X.AnonymousClass5J8) r1
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            int r2 = X.C86614Ku.A02(r10)
            X.4nt r1 = r1.A01
        L_0x0261:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
        L_0x026b:
            java.lang.Object r0 = r9.A00
            X.5KV r0 = (X.AnonymousClass5KV) r0
            android.view.View r2 = r0.A02
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0287
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = X.C06060Wb.A02(r1)
        L_0x027f:
            int r0 = X.C86614Ku.A02(r10)
            X.C107555bV.A03(r2, r1, r0)
            return
        L_0x0287:
            r1 = 0
            goto L_0x027f
        L_0x0289:
            java.lang.Object r1 = r9.A00
            com.whatsapp.components.SegmentedProgressBar r1 = (com.whatsapp.components.SegmentedProgressBar) r1
            int r0 = X.C86604Kt.A01(r10)
            r1.A02 = r0
            goto L_0x029e
        L_0x0294:
            java.lang.Object r1 = r9.A00
            com.whatsapp.components.RoundCornerProgressBar r1 = (com.whatsapp.components.RoundCornerProgressBar) r1
            float r0 = X.AnonymousClass001.A03(r10)
            r1.A00 = r0
        L_0x029e:
            r1.postInvalidate()
            return
        L_0x02a2:
            java.lang.Object r1 = r9.A00
            android.view.View r1 = (android.view.View) r1
            int r0 = X.C86604Kt.A01(r10)
            float r0 = (float) r0
            r1.setTranslationY(r0)
            return
        L_0x02af:
            java.lang.Object r1 = r9.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass001.A03(r10)
            r1.setX(r0)
            return
        L_0x02bb:
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            java.lang.Object r1 = r10.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C162457s7.A0K(r1, r0)
            float r5 = X.AnonymousClass001.A05(r1)
            java.lang.Object r4 = r9.A00
            X.4NO r4 = (X.AnonymousClass4NO) r4
            android.graphics.Paint r3 = r4.A02
            float[] r2 = X.AnonymousClass4L0.A0T()
            float r1 = r4.A00
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            float r5 = r5 * r1
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e5
            r5 = 0
        L_0x02e5:
            float r1 = r1 - r5
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r2, r1)
            r3.setPathEffect(r0)
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100295Aj.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
