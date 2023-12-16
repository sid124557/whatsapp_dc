package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Objects;

/* renamed from: X.7mH  reason: invalid class name and case insensitive filesystem */
public class C159677mH implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public C159677mH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final boolean A00(MotionEvent motionEvent, C159677mH r3) {
        C92914nZ r32 = (C92914nZ) r3.A00;
        int action = motionEvent.getAction();
        if (action == 0) {
            r32.A0D = true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            r32.A0D = false;
        }
        C92914nZ.A01(r32, false);
        return false;
    }

    public static final boolean A01(MotionEvent motionEvent, C159677mH r3) {
        C91224j8 r1 = (C91224j8) r3.A00;
        r1.A0B(motionEvent, r1.A0A);
        return false;
    }

    public final void A02() {
        NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A00;
        numberEntryKeyboard.A05 = null;
        if (numberEntryKeyboard.A0E) {
            C149917Ok r1 = (C149917Ok) numberEntryKeyboard.A0D.get(Long.valueOf(numberEntryKeyboard.A02));
            Objects.requireNonNull(r1);
            if (r1.A02.isRunning()) {
                r1.A05 = true;
                return;
            }
            ValueAnimator valueAnimator = r1.A03;
            if (!valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r1.A03.A00(r6);
        r1.A02.onTouchEvent(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r0.setVisibility(r3);
        ((com.whatsapp.components.AnimatingArrowsLayout) r0).A03.start();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A01
            r6 = r23
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0292;
                case 2: goto L_0x02c5;
                case 3: goto L_0x0078;
                case 4: goto L_0x006b;
                case 5: goto L_0x0059;
                case 6: goto L_0x004e;
                case 7: goto L_0x00d7;
                case 8: goto L_0x02c0;
                case 9: goto L_0x00c6;
                case 10: goto L_0x0033;
                case 11: goto L_0x0112;
                case 12: goto L_0x002c;
                case 13: goto L_0x00a3;
                case 14: goto L_0x008c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r3.A00
            X.6Fq r3 = (X.C125126Fq) r3
            X.8kR r0 = r3.A0H
            if (r0 == 0) goto L_0x002a
            int r1 = r6.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x002a
            X.8kR r2 = r3.A0H
            int r1 = r3.A01
            org.npci.upi.security.pinactivitycomponent.w r2 = (org.npci.upi.security.pinactivitycomponent.w) r2
            java.util.ArrayList r0 = r2.A06
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof X.AnonymousClass6FX
            if (r0 != 0) goto L_0x002a
            r2.A03 = r1
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            java.lang.Object r0 = r3.A00
            X.5a4 r0 = (X.C106735a4) r0
            X.5eI r1 = r0.A02
            goto L_0x005f
        L_0x0033:
            java.lang.Object r0 = r3.A00
            X.4LC r0 = (X.AnonymousClass4LC) r0
            X.5TK r4 = r0.A0G
            X.7E7 r0 = r4.A08
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.5Ol r3 = r4.A09
            int r2 = r4.A01
            int r0 = r4.A02
            float r1 = (float) r0
            boolean r0 = r4.A04
            r3.A00(r6, r1, r2, r0)
            goto L_0x0163
        L_0x004e:
            java.lang.Object r0 = r3.A00
            X.0N1 r0 = (X.AnonymousClass0N1) r0
            if (r23 == 0) goto L_0x0163
            r0.A00(r6)
            goto L_0x0163
        L_0x0059:
            java.lang.Object r0 = r3.A00
            X.5ZS r0 = (X.AnonymousClass5ZS) r0
            X.5eI r1 = r0.A0B
        L_0x005f:
            X.0N1 r0 = r1.A03
            r0.A00(r6)
            android.view.ScaleGestureDetector r0 = r1.A02
            r0.onTouchEvent(r6)
            goto L_0x0163
        L_0x006b:
            java.lang.Object r1 = r3.A00
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = (com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator) r1
            int r0 = r6.getAction()
            r1.A02(r0)
            goto L_0x0163
        L_0x0078:
            java.lang.Object r0 = r3.A00
            X.5Ji r0 = (X.C102565Ji) r0
            r22.performClick()
            android.widget.PopupWindow r1 = r0.A01
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0163
            r1.dismiss()
            goto L_0x0163
        L_0x008c:
            java.lang.Object r2 = r3.A00
            com.whatsapp.voipcalling.VoipCallAnswerCallView r2 = (com.whatsapp.voipcalling.VoipCallAnswerCallView) r2
            int r1 = r6.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x009b
            r0 = 5
            if (r1 == r0) goto L_0x009b
            goto L_0x002a
        L_0x009b:
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            goto L_0x00ba
        L_0x00a3:
            java.lang.Object r2 = r3.A00
            com.whatsapp.voipcalling.VoipCallAnswerCallView r2 = (com.whatsapp.voipcalling.VoipCallAnswerCallView) r2
            int r1 = r6.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x00b3
            r0 = 5
            if (r1 == r0) goto L_0x00b3
            goto L_0x002a
        L_0x00b3:
            android.widget.TextView r0 = r2.A07
            r0.setVisibility(r3)
            android.view.View r0 = r2.A01
        L_0x00ba:
            r0.setVisibility(r3)
            com.whatsapp.components.AnimatingArrowsLayout r0 = (com.whatsapp.components.AnimatingArrowsLayout) r0
            android.animation.AnimatorSet r0 = r0.A03
            r0.start()
            goto L_0x002a
        L_0x00c6:
            java.lang.Object r2 = r3.A00
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r1 = r6.getX()
            float r0 = r6.getY()
            r2.set(r1, r0)
            goto L_0x002a
        L_0x00d7:
            java.lang.Object r5 = r3.A00
            X.7UX r5 = (X.AnonymousClass7UX) r5
            r2 = 0
            r0 = 2
            X.C162457s7.A0J(r6, r0)
            int[] r1 = new int[r0]
            android.view.View r4 = r5.A06
            r4.getLocationOnScreen(r1)
            r3 = r1[r2]
            r0 = 1
            r2 = r1[r0]
            int r1 = r4.getWidth()
            int r1 = r1 + r3
            float r0 = r6.getX()
            int r0 = (int) r0
            if (r3 > r0) goto L_0x010a
            if (r0 > r1) goto L_0x010a
            int r1 = r4.getHeight()
            int r1 = r1 + r2
            float r0 = r6.getY()
            int r0 = (int) r0
            if (r2 > r0) goto L_0x010a
            if (r0 > r1) goto L_0x010a
            goto L_0x002a
        L_0x010a:
            X.0bC r0 = r5.A00
            if (r0 == 0) goto L_0x0163
            r0.dismiss()
            goto L_0x0163
        L_0x0112:
            java.lang.Object r2 = r3.A00
            com.whatsapp.numberkeyboard.NumberEntryKeyboard r2 = (com.whatsapp.numberkeyboard.NumberEntryKeyboard) r2
            android.widget.EditText r0 = r2.A06
            if (r0 == 0) goto L_0x02ca
            float r9 = r6.getX()
            float r8 = r6.getY()
            r11 = 0
            r7 = 0
        L_0x0124:
            X.7I2[][] r0 = r2.A0H
            int r0 = r0.length
            r5 = 0
            if (r7 >= r0) goto L_0x0154
            r4 = 0
        L_0x012b:
            X.7I2[][] r1 = r2.A0H
            r0 = r1[r11]
            int r0 = r0.length
            if (r4 >= r0) goto L_0x028e
            r0 = r1[r7]
            r0 = r0[r4]
            if (r0 == 0) goto L_0x028a
            android.graphics.RectF r0 = r0.A01
            boolean r0 = r0.contains(r9, r8)
            if (r0 == 0) goto L_0x028a
            android.view.View[][] r0 = r2.A0G
            r0 = r0[r7]
            r4 = r0[r4]
            int r1 = r4.getId()
            r0 = 2131429249(0x7f0b0781, float:1.8480165E38)
            if (r1 != r0) goto L_0x0153
            X.8rw r0 = r2.A0A
            if (r0 == 0) goto L_0x0154
        L_0x0153:
            r5 = r4
        L_0x0154:
            int r1 = r6.getAction()
            r4 = 1
            if (r1 == 0) goto L_0x022a
            if (r1 == r4) goto L_0x0170
            r0 = 2
            if (r1 == r0) goto L_0x0165
            r0 = 3
            if (r1 == r0) goto L_0x0170
        L_0x0163:
            r0 = 1
            return r0
        L_0x0165:
            android.view.View r0 = r2.A05
            if (r0 == 0) goto L_0x0163
            if (r0 == r5) goto L_0x0163
            r3.A02()
            goto L_0x002a
        L_0x0170:
            android.view.View r0 = r2.A05
            if (r0 == 0) goto L_0x0163
            if (r1 != r4) goto L_0x01ad
            int r1 = r0.getId()
            r0 = 2131429249(0x7f0b0781, float:1.8480165E38)
            if (r1 == r0) goto L_0x0220
            android.view.View r5 = r2.A05
            int r1 = r5.getId()
            r0 = 2131431938(0x7f0b1202, float:1.848562E38)
            if (r1 != r0) goto L_0x01b1
            r12 = 8
        L_0x018c:
            android.widget.EditText r0 = r2.A06
            r7 = 0
            android.view.KeyEvent r6 = new android.view.KeyEvent
            r9 = r7
            r13 = r11
            r6.<init>(r7, r9, r11, r12, r13)
            r0.dispatchKeyEvent(r6)
            android.widget.EditText r0 = r2.A06
            android.view.KeyEvent r13 = new android.view.KeyEvent
            r16 = r7
            r14 = r7
            r18 = r4
            r19 = r12
            r20 = r11
            r13.<init>(r14, r16, r18, r19, r20)
            r0.dispatchKeyEvent(r13)
        L_0x01ad:
            r3.A02()
            goto L_0x0163
        L_0x01b1:
            int r1 = r5.getId()
            r0 = 2131434464(0x7f0b1be0, float:1.8490743E38)
            if (r1 != r0) goto L_0x01bd
            r12 = 9
            goto L_0x018c
        L_0x01bd:
            int r1 = r5.getId()
            r0 = 2131434254(0x7f0b1b0e, float:1.8490317E38)
            if (r1 != r0) goto L_0x01c9
            r12 = 10
            goto L_0x018c
        L_0x01c9:
            int r1 = r5.getId()
            r0 = 2131430245(0x7f0b0b65, float:1.8482186E38)
            if (r1 != r0) goto L_0x01d5
            r12 = 11
            goto L_0x018c
        L_0x01d5:
            int r1 = r5.getId()
            r0 = 2131430163(0x7f0b0b13, float:1.848202E38)
            if (r1 != r0) goto L_0x01e1
            r12 = 12
            goto L_0x018c
        L_0x01e1:
            int r1 = r5.getId()
            r0 = 2131433764(0x7f0b1924, float:1.8489323E38)
            if (r1 != r0) goto L_0x01ed
            r12 = 13
            goto L_0x018c
        L_0x01ed:
            int r1 = r5.getId()
            r0 = 2131433681(0x7f0b18d1, float:1.8489155E38)
            if (r1 != r0) goto L_0x01f9
            r12 = 14
            goto L_0x018c
        L_0x01f9:
            int r1 = r5.getId()
            r0 = 2131429664(0x7f0b0920, float:1.8481007E38)
            if (r1 != r0) goto L_0x0205
            r12 = 15
            goto L_0x018c
        L_0x0205:
            int r1 = r5.getId()
            r0 = 2131431821(0x7f0b118d, float:1.8485382E38)
            if (r1 != r0) goto L_0x0212
            r12 = 16
            goto L_0x018c
        L_0x0212:
            int r1 = r5.getId()
            r0 = 2131434936(0x7f0b1db8, float:1.84917E38)
            r12 = 67
            if (r1 != r0) goto L_0x018c
            r12 = 7
            goto L_0x018c
        L_0x0220:
            X.8rw r1 = r2.A0A
            if (r1 == 0) goto L_0x01ad
            android.widget.EditText r0 = r2.A06
            r1.BYp(r0)
            goto L_0x01ad
        L_0x022a:
            android.view.View r0 = r2.A05
            if (r0 != 0) goto L_0x02ca
            if (r5 == 0) goto L_0x02ca
            r2.A05 = r5
            long r0 = java.lang.System.currentTimeMillis()
            r2.A02 = r0
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0283
            java.util.Map r0 = r2.A0C
            java.lang.Object r0 = r0.get(r5)
            X.7I2 r0 = (X.AnonymousClass7I2) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PointF r0 = r0.A00
            float r3 = r0.x
            float r1 = r0.y
            long r9 = r2.A02
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0283
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r1)
            int r8 = com.whatsapp.numberkeyboard.NumberEntryKeyboard.A0J
            int r0 = r2.A01
            float r6 = (float) r0
            int r0 = r2.A00
            float r7 = (float) r0
            X.7LC r5 = r2.A09
            java.util.Objects.requireNonNull(r5)
            X.7Ok r3 = new X.7Ok
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r2.A0D
            java.util.Objects.requireNonNull(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1.put(r0, r3)
            r3.A05 = r11
            android.animation.ValueAnimator r1 = r3.A02
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L_0x0283
            r1.start()
        L_0x0283:
            X.33i r0 = r2.A07
            X.C106755a7.A04(r0)
            goto L_0x0163
        L_0x028a:
            int r4 = r4 + 1
            goto L_0x012b
        L_0x028e:
            int r7 = r7 + 1
            goto L_0x0124
        L_0x0292:
            java.lang.Object r7 = r3.A00
            X.6ZR r7 = (X.AnonymousClass6ZR) r7
            int r0 = r6.getAction()
            r6 = 1
            r5 = 0
            if (r0 != r6) goto L_0x002a
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02b1
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b3
        L_0x02b1:
            r7.A05 = r5
        L_0x02b3:
            r7.A09()
            r7.A05 = r6
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            goto L_0x002a
        L_0x02c0:
            boolean r0 = A00(r6, r3)
            return r0
        L_0x02c5:
            boolean r0 = A01(r6, r3)
            return r0
        L_0x02ca:
            boolean r0 = r22.performClick()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159677mH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
