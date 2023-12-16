package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.5fI  reason: invalid class name and case insensitive filesystem */
public class C109855fI implements View.OnTouchListener {
    public final /* synthetic */ CreationModeBottomBar A00;

    public C109855fI(CreationModeBottomBar creationModeBottomBar) {
        this.A00 = creationModeBottomBar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            r15 = this;
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = r15.A00
            X.8ja r0 = r2.A0E
            r3 = 0
            if (r0 == 0) goto L_0x0016
            int r1 = r17.getAction()
            if (r1 == 0) goto L_0x01fd
            r0 = 1
            if (r1 == r0) goto L_0x017e
            r0 = 2
            if (r1 == r0) goto L_0x0017
            r0 = 3
            if (r1 == r0) goto L_0x017e
        L_0x0016:
            return r3
        L_0x0017:
            X.8ja r4 = r2.A0E
            float r7 = r17.getRawX()
            r17.getRawY()
            float r6 = X.AnonymousClass4L0.A00(r2)
            X.5po r4 = (X.C116145po) r4
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0016
            float r0 = r4.A02
            float r5 = r7 - r0
            X.7VK r2 = r4.A05
            X.58Q r1 = r2.A00
            X.58Q r0 = X.AnonymousClass58Q.RECORDING
            if (r1 != r0) goto L_0x003b
            r4.A00 = r5
            r2.A00()
        L_0x003b:
            r4.A01 = r7
            float r0 = r4.A00
            float r5 = java.lang.Math.abs(r0)
            float r5 = r5 / r6
            X.33j r0 = r4.A0G
            boolean r1 = X.C620733j.A04(r0)
            r10 = 0
            r2 = 1
            float r0 = r4.A00
            if (r1 == 0) goto L_0x0178
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
        L_0x0054:
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0016
            X.8uV r6 = r4.A0L
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r6 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r6
            android.widget.ImageButton r1 = r6.A04
            X.33i r0 = r6.A0B
            X.C106755a7.A02(r1, r0)
            r6.A01()
            android.animation.AnimatorSet r5 = X.C86664Kz.A0O()
            android.animation.AnimatorSet r7 = X.C86664Kz.A0O()
            float r9 = r6.A00
            X.33j r0 = r6.A0C
            boolean r8 = X.C102805Ki.A00(r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = X.AnonymousClass4L0.A00(r6)
            float r0 = r0 * r1
            if (r8 == 0) goto L_0x0175
            float r9 = r9 + r0
        L_0x0088:
            float[] r1 = X.AnonymousClass4L0.A0T()
            android.widget.ImageButton r0 = r6.A04
            float r0 = r0.getTranslationX()
            r1[r3] = r0
            android.animation.ValueAnimator r9 = X.C86664Kz.A0P(r1, r9)
            r0 = 23
            X.C100295Aj.A03(r9, r6, r0)
            android.widget.ImageButton r1 = r6.A04
            float[] r0 = new float[r2]
            r0[r3] = r10
            java.lang.String r12 = "alpha"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r12, r0)
            com.whatsapp.WaTextView r1 = r6.A0A
            float[] r0 = new float[r2]
            r0[r3] = r10
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r12, r0)
            android.animation.AnimatorSet$Builder r0 = r7.play(r9)
            android.animation.AnimatorSet$Builder r0 = r0.with(r8)
            r0.with(r1)
            r0 = 200(0xc8, double:9.9E-322)
            r7.setDuration(r0)
            android.animation.AnimatorSet r9 = X.C86664Kz.A0O()
            r11 = 3
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r11]
            r8 = 2
            float[] r13 = new float[r8]
            r13 = {0, 1065353216} // fill-array
            java.lang.String r0 = "scaleX"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r13)
            r1[r3] = r0
            float[] r13 = new float[r8]
            r13 = {0, 1065353216} // fill-array
            java.lang.String r0 = "scaleY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r13)
            r1[r2] = r0
            float[] r0 = new float[r8]
            r0 = {0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r12, r0)
            r1[r8] = r0
            android.widget.ImageButton r0 = r6.A04
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r1)
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0172
            com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView r0 = r6.A0D
        L_0x00fc:
            r0.setVisibility(r3)
            r0.setAlpha(r10)
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r1)
            android.widget.ImageButton r10 = r6.A04
            float[] r1 = new float[r8]
            r1 = {0, 0} // fill-array
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r10, r0, r1)
            r0 = 0
            r12.setDuration(r0)
            int[] r10 = new int[r8]
            r10 = {0, 0} // fill-array
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r10)
            r10.setDuration(r0)
            r0 = 31
            X.C86604Kt.A0w(r10, r6, r0)
            r0 = 4
            android.animation.Animator[] r0 = X.C86664Kz.A1b(r12, r10, r0, r3)
            r0[r8] = r14
            r0[r11] = r13
            r9.playTogether(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r9.setDuration(r0)
            android.animation.Animator[] r0 = X.C86664Kz.A1b(r7, r9, r8, r3)
            r5.playSequentially(r0)
            r0 = 27
            X.AnonymousClass67L.A00(r5, r6, r0)
            r4.A0A = r2
            X.8jb r1 = r4.A06
            if (r1 == 0) goto L_0x015c
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r1.A0m
            if (r0 == 0) goto L_0x015c
            X.5pp r0 = r1.A0n
            if (r0 == 0) goto L_0x015c
            r0.A05(r2)
            r1.A76()
        L_0x015c:
            X.5mK r0 = r4.A0K
            X.5Z9 r2 = r0.A0C
            X.2X0 r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0016
            X.4sW r1 = r2.A01()
            r0 = 28
            X.C95044sW.A00(r1, r2, r0)
            return r3
        L_0x0172:
            android.view.View r0 = r6.A03
            goto L_0x00fc
        L_0x0175:
            float r9 = r9 - r0
            goto L_0x0088
        L_0x0178:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            goto L_0x0054
        L_0x017e:
            X.8ja r6 = r2.A0E
            X.5po r6 = (X.C116145po) r6
            X.7VK r0 = r6.A05
            X.58Q r1 = r0.A00
            X.58Q r0 = X.AnonymousClass58Q.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x01ba
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0016
            X.8uV r5 = r6.A0L
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r5 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r5
            X.7b2 r0 = r5.A07
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            X.7b2 r2 = r5.A07
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A02(r0)
            X.7b2 r4 = r5.A07
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.4aA r0 = new X.4aA
            r0.<init>(r5, r2, r1)
            r4.A03(r0)
            r6.A09 = r3
            X.8jb r0 = r6.A06
            if (r0 == 0) goto L_0x0016
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            r0.A7C()
            return r3
        L_0x01ba:
            X.58Q r0 = X.AnonymousClass58Q.RECORDING
            if (r1 != r0) goto L_0x0016
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x0016
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A04
            long r4 = r4 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x027f
            X.8jb r5 = r6.A06
            if (r5 == 0) goto L_0x01ed
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r5.A0m
            if (r0 == 0) goto L_0x01ed
            X.5pp r4 = r5.A0n
            if (r4 == 0) goto L_0x01ed
            X.4Me r2 = r4.A07
            if (r2 == 0) goto L_0x01ea
            android.os.Handler r1 = r2.A03
            r0 = 3
            X.C117095rN.A00(r1, r2, r0)
            r4.A05(r3)
        L_0x01ea:
            r5.A74()
        L_0x01ed:
            X.8uV r0 = r6.A0L
            r0.Awy()
            r0.BFf()
            X.52Z r0 = new X.52Z
            r0.<init>(r6)
            r6.A05 = r0
            return r3
        L_0x01fd:
            X.8ja r4 = r2.A0E
            float r0 = r17.getRawX()
            r17.getRawY()
            X.5po r4 = (X.C116145po) r4
            r4.A02 = r0
            r4.A01 = r0
            X.2qd r1 = r4.A0J
            X.4ea r0 = r4.A0D
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0016
            X.7VK r0 = r4.A05
            X.58Q r1 = r0.A00
            X.58Q r0 = X.AnonymousClass58Q.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x0263
            X.8uV r5 = r4.A0L
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r5 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r5
            X.5Nf r0 = r5.A0F
            if (r0 != 0) goto L_0x0236
            android.app.Activity r2 = X.C111095hX.A04(r5)
            X.5M0 r1 = r5.A09
            X.36r r0 = X.C86664Kz.A1B()
            X.5Nf r0 = r1.A00(r2, r0)
            r5.A0F = r0
        L_0x0236:
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0263
            X.33i r0 = r5.A0B
            X.AnonymousClass29U.A00(r0)
            X.7b2 r0 = r5.A07
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            X.7b2 r2 = r5.A07
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A01(r0)
            X.7b2 r2 = r5.A07
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2.A02(r0)
            X.7b2 r1 = r5.A07
            X.52V r0 = new X.52V
            r0.<init>(r5)
            r1.A03(r0)
            r0 = 1
            r4.A09 = r0
        L_0x0263:
            X.8jb r2 = r4.A06
            if (r2 == 0) goto L_0x0016
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            android.view.View r0 = r2.A07
            if (r0 == 0) goto L_0x0277
            r1 = 8
            r0.clearAnimation()
            android.view.View r0 = r2.A07
            r0.setVisibility(r1)
        L_0x0277:
            X.3Wi r1 = r2.A05
            java.lang.Runnable r0 = r2.A18
            r1.A0R(r0)
            return r3
        L_0x027f:
            X.8jb r2 = r6.A06
            if (r2 == 0) goto L_0x0294
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r2.A0m
            if (r0 == 0) goto L_0x0294
            X.5pp r1 = r2.A0n
            if (r1 == 0) goto L_0x0294
            r0 = 1
            r1.A05(r0)
            r2.A76()
        L_0x0294:
            r6.A00()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109855fI.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
