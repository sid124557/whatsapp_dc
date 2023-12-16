package X;

import android.animation.ValueAnimator;
import com.whatsapp.R;

/* renamed from: X.7cj  reason: invalid class name and case insensitive filesystem */
public class C154177cj implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C154177cj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(ValueAnimator valueAnimator, C154177cj r4) {
        AnonymousClass5Y6 r2 = (AnonymousClass5Y6) r4.A00;
        int A012 = (int) (C86664Kz.A01(r2.A09.getResources(), R.dimen.f6nameremoved) / AnonymousClass001.A03(valueAnimator));
        r2.A0I.setPadding(A012, A012, A012, A012);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r1.setTranslationY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b4, code lost:
        r1.setAlpha(r0.intValue());
        r2.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationUpdate(android.animation.ValueAnimator r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x029d;
                case 1: goto L_0x0291;
                case 2: goto L_0x002d;
                case 3: goto L_0x0283;
                case 4: goto L_0x0272;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0265;
                case 8: goto L_0x0254;
                case 9: goto L_0x0246;
                case 10: goto L_0x0238;
                case 11: goto L_0x022a;
                case 12: goto L_0x021e;
                case 13: goto L_0x0209;
                case 14: goto L_0x01fb;
                case 15: goto L_0x0022;
                case 16: goto L_0x01e4;
                case 17: goto L_0x01e0;
                case 18: goto L_0x0014;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01bf;
                case 21: goto L_0x01a8;
                case 22: goto L_0x0197;
                case 23: goto L_0x0189;
                case 24: goto L_0x017b;
                case 25: goto L_0x016d;
                case 26: goto L_0x015f;
                case 27: goto L_0x0151;
                case 28: goto L_0x0143;
                case 29: goto L_0x0135;
                case 30: goto L_0x0117;
                case 31: goto L_0x010b;
                case 32: goto L_0x00fd;
                case 33: goto L_0x00eb;
                case 34: goto L_0x00dc;
                case 35: goto L_0x00b5;
                case 36: goto L_0x0094;
                case 37: goto L_0x0084;
                case 38: goto L_0x006c;
                case 39: goto L_0x005e;
                case 40: goto L_0x004a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = X.C86604Kt.A01(r5)
            java.lang.Object r0 = r4.A00
            X.7l7 r0 = (X.C159097l7) r0
            X.6FH r1 = r0.A0J
            float r0 = (float) r2
        L_0x0010:
            r1.setTranslationY(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r0 = r4.A00
            X.5UD r0 = (X.AnonymousClass5UD) r0
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x0013
            int r0 = X.C86604Kt.A01(r5)
            float r0 = (float) r0
            goto L_0x0010
        L_0x0022:
            java.lang.Object r0 = r4.A00
            X.5Uk r0 = (X.C105315Uk) r0
            android.view.View r1 = r0.A0D
            float r0 = X.AnonymousClass001.A03(r5)
            goto L_0x0010
        L_0x002d:
            float r3 = X.AnonymousClass001.A03(r5)
            java.lang.Object r0 = r4.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            X.6D7 r2 = r0.A0T
            if (r2 == 0) goto L_0x0013
            X.6Cs r1 = r2.A03
            float r0 = r1.A01
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0013
            r1.A01 = r3
            r0 = 1
            r2.A05 = r0
            r2.invalidateSelf()
            return
        L_0x004a:
            java.lang.Object r2 = r5.getAnimatedValue()
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = r4.A00
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r0
            android.graphics.Paint r1 = r0.A0A
            int r0 = r2.intValue()
            r1.setAlpha(r0)
            return
        L_0x005e:
            java.lang.Object r0 = r5.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r2 = r4.A00
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r2 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r2
            android.graphics.Paint r1 = r2.A0A
            goto L_0x01b4
        L_0x006c:
            java.lang.Object r2 = r4.A00
            X.578 r2 = (X.AnonymousClass578) r2
            X.C18260x0.A0O(r2, r5)
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C162457s7.A0K(r1, r0)
            int r0 = X.AnonymousClass001.A0K(r1)
            X.C154177cj.super.setBackgroundColor(r0)
            return
        L_0x0084:
            java.lang.Object r0 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.5Oj r1 = r0.A0q
            float r0 = X.AnonymousClass001.A03(r5)
            r1.A00 = r0
            r1.A00()
            return
        L_0x0094:
            java.lang.Object r3 = r4.A00
            X.4NZ r3 = (X.AnonymousClass4NZ) r3
            float r1 = X.AnonymousClass001.A03(r5)
            int r0 = r3.A0F
            float r0 = (float) r0
            float r0 = r0 * r1
            float r2 = r3.A0A
            float r2 = r2 - r0
            float r1 = r3.A0B
            float r0 = r3.A01
            float r0 = X.AnonymousClass002.A00(r1, r0)
            float r2 = r2 - r0
            r3.A00 = r2
            r3.postInvalidate()
            r3.invalidateOutline()
            return
        L_0x00b5:
            java.lang.Object r3 = r4.A00
            X.4NZ r3 = (X.AnonymousClass4NZ) r3
            float r2 = X.AnonymousClass001.A03(r5)
            r1 = 1075838976(0x40200000, float:2.5)
            float r1 = r1 * r2
            r0 = -1071644672(0xffffffffc0200000, float:-2.5)
            float r1 = r1 + r0
            r3.A03 = r1
            android.graphics.Bitmap r0 = r3.A0T
            int r0 = r0.getHeight()
            float r1 = (float) r0
            r0 = 1053273620(0x3ec7ae14, float:0.39)
            float r1 = r1 * r0
            float r1 = r1 * r2
            float r0 = r3.A0B
            float r0 = r0 - r1
            r3.A01 = r0
            float r0 = r3.A0C
            float r0 = r0 - r1
            r3.A02 = r0
            return
        L_0x00dc:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            return
        L_0x00eb:
            java.lang.Object r0 = r4.A00
            X.563 r0 = (X.AnonymousClass563) r0
            X.5YG r0 = r0.A0I
            android.view.View r1 = r0.A09()
            int r0 = X.C86604Kt.A01(r5)
            r1.setBackgroundColor(r0)
            return
        L_0x00fd:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            int r0 = X.C86604Kt.A01(r5)
            int r0 = r0 << 24
            r1.setBackgroundColor(r0)
            return
        L_0x010b:
            java.lang.Object r1 = r4.A00
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r1 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r1
            int r0 = X.C86604Kt.A01(r5)
            r1.A03(r0)
            return
        L_0x0117:
            java.lang.Object r2 = r4.A00
            com.whatsapp.qrcode.QrEducationView r2 = (com.whatsapp.qrcode.QrEducationView) r2
            float r1 = X.AnonymousClass001.A03(r5)
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
            r0 = 1
            r2.A0D = r0
        L_0x0128:
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x012f
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
        L_0x012f:
            r2.A00 = r1
            r2.invalidate()
            return
        L_0x0135:
            java.lang.Object r0 = r4.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r1 = r0.A03
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setAlpha(r0)
            return
        L_0x0143:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setCloseButtonAlpha(r0)
            return
        L_0x0151:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setMediaSettingsToolX(r0)
            return
        L_0x015f:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setUndoToolX(r0)
            return
        L_0x016d:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setCropToolX(r0)
            return
        L_0x017b:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setTextToolX(r0)
            return
        L_0x0189:
            java.lang.Object r0 = r4.A00
            X.5Uj r0 = (X.C105305Uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setShapeToolX(r0)
            return
        L_0x0197:
            java.lang.Object r2 = r4.A00
            X.7Vx r2 = (X.C151687Vx) r2
            float r1 = X.AnonymousClass001.A03(r5)
            r5.getCurrentPlayTime()
            r0 = 1
            r2.A01 = r0
            r2.A00 = r1
            return
        L_0x01a8:
            java.lang.Object r2 = r4.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r2 = (com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView) r2
            android.graphics.Paint r1 = r2.A0A
            java.lang.Object r0 = r5.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x01b4:
            int r0 = r0.intValue()
            r1.setAlpha(r0)
            r2.invalidate()
            return
        L_0x01bf:
            java.lang.Object r2 = r4.A00
            X.4sy r2 = (X.C95274sy) r2
            int r1 = X.C86604Kt.A01(r5)
            android.graphics.drawable.Drawable r0 = r2.A04
            if (r0 == 0) goto L_0x01ce
            r0.setAlpha(r1)
        L_0x01ce:
            r2.invalidate()
            return
        L_0x01d2:
            java.lang.Object r1 = r4.A00
            com.whatsapp.components.RoundCornerProgressBar r1 = (com.whatsapp.components.RoundCornerProgressBar) r1
            float r0 = X.AnonymousClass001.A03(r5)
            r1.A00 = r0
            r1.postInvalidate()
            return
        L_0x01e0:
            A00(r5, r4)
            return
        L_0x01e4:
            java.lang.Object r1 = r4.A00
            X.5Uk r1 = (X.C105315Uk) r1
            float r2 = X.AnonymousClass001.A03(r5)
            android.view.View r0 = r1.A0D
            r0.setAlpha(r2)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r1.A0M
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            r0 = 0
            r1.A1a(r0, r2)
            return
        L_0x01fb:
            java.lang.Object r1 = r4.A00
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r1
            float r0 = X.AnonymousClass001.A03(r5)
            r1.A00 = r0
            r1.invalidate()
            return
        L_0x0209:
            java.lang.Object r3 = r4.A00
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r3 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r3
            android.graphics.Paint r2 = r3.A08
            float r1 = X.AnonymousClass001.A03(r5)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setAlpha(r0)
            r3.invalidate()
            return
        L_0x021e:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setX(r0)
            return
        L_0x022a:
            java.lang.Object r0 = r4.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.7lI r1 = r0.A16
            float r0 = X.AnonymousClass001.A03(r5)
            r1.A04(r0)
            return
        L_0x0238:
            java.lang.Object r0 = r4.A00
            X.7c0 r0 = (X.C153787c0) r0
            float r1 = X.AnonymousClass001.A03(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setAlpha(r1)
            return
        L_0x0246:
            java.lang.Object r0 = r4.A00
            X.7c0 r0 = (X.C153787c0) r0
            float r1 = X.AnonymousClass001.A03(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setAlpha(r1)
            return
        L_0x0254:
            java.lang.Object r0 = r4.A00
            X.7c0 r0 = (X.C153787c0) r0
            float r1 = X.AnonymousClass001.A03(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0265:
            java.lang.Object r2 = r4.A00
            android.view.View r2 = (android.view.View) r2
            int r1 = X.C86604Kt.A01(r5)
            r0 = 0
            r2.scrollTo(r1, r0)
            return
        L_0x0272:
            float r1 = X.AnonymousClass001.A03(r5)
            java.lang.Object r0 = r4.A00
            X.7l7 r0 = (X.C159097l7) r0
            X.6FH r0 = r0.A0J
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0283:
            java.lang.Object r0 = r4.A00
            X.7l7 r0 = (X.C159097l7) r0
            X.6FH r1 = r0.A0J
            float r0 = X.AnonymousClass001.A03(r5)
            r1.setAlpha(r0)
            return
        L_0x0291:
            java.lang.Object r1 = r4.A00
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            int r0 = X.C86604Kt.A01(r5)
            r1.setScrimAlpha(r0)
            return
        L_0x029d:
            java.lang.Object r0 = r4.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154177cj.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
