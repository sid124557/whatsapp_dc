package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.5eJ  reason: invalid class name and case insensitive filesystem */
public class C109245eJ implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector.OnGestureListener A00;
    public final AnonymousClass0N1 A01;
    public final C188048yE A02;
    public final DoodleView A03;
    public final C103705Ob A04;
    public final AnonymousClass5WF A05;
    public final AnonymousClass7N2 A06 = new AnonymousClass7N2(this);
    public final AnonymousClass6ES A07;
    public final AnonymousClass7EA A08;
    public final AnonymousClass5US A09;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r5.A01 != 2) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        if (r5.A01 != 0) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.graphics.PointF r18, android.graphics.PointF r19) {
        /*
            r17 = this;
            r4 = r18
            r0 = r17
            X.5Ob r6 = r0.A04
            X.5Uw r0 = r6.A01
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0 instanceof X.C95954vE
            if (r0 != 0) goto L_0x001b
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            r6.A00()
            X.5Q2 r3 = r6.A04
            X.5Uw r0 = r6.A01
            android.graphics.RectF r0 = r0.A02
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r1, r0)
            android.graphics.PointF r14 = r3.A01(r0)
            X.5Qy r0 = r6.A03
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x019c
            X.5Qx r13 = r6.A05
            X.5Uw r12 = r6.A01
            X.5Uw r0 = r13.A04
            if (r0 == r12) goto L_0x004c
            r13.A04 = r12
            r13.A01()
        L_0x004c:
            float r11 = r4.x
            float r15 = r4.y
            android.graphics.RectF r0 = r13.A02
            r16 = r0
            float r1 = r16.centerX()
            float r0 = r16.centerY()
            android.graphics.PointF r10 = X.AnonymousClass4L0.A08(r1, r0)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0197
            float r1 = r13.A00
        L_0x0066:
            float r1 = r1 + r11
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0193
            float r0 = r13.A01
        L_0x006d:
            float r0 = r0 + r15
            android.graphics.PointF r9 = X.AnonymousClass4L0.A08(r1, r0)
            boolean r0 = r13.A07
            r8 = 1
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L_0x016f
            float r1 = r16.centerY()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0163
            float r1 = r16.centerY()
            float r1 = r1 - r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            float r0 = r13.A01
            float r0 = r0 + r15
            r13.A01 = r0
            r15 = 0
        L_0x0097:
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x013f
            float r1 = r16.centerX()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            float r1 = r16.centerX()
            float r1 = r1 - r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            float r0 = r13.A00
            float r0 = r0 + r11
            r13.A00 = r0
            r11 = 0
        L_0x00b9:
            android.graphics.PointF r2 = X.AnonymousClass4L0.A08(r11, r15)
            float r5 = r14.x
            float r0 = r2.x
            float r5 = r5 + r0
            float r1 = r14.y
            float r0 = r2.y
            float r1 = r1 + r0
            android.graphics.PointF r1 = X.AnonymousClass4L0.A08(r5, r1)
            java.util.Map r10 = r13.A05
            r0 = 3
            java.lang.Object r5 = X.AnonymousClass001.A0i(r10, r0)
            X.4v4 r5 = (X.C95914v4) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00db
            r13.A00(r1, r12, r7)
        L_0x00db:
            float r1 = r4.x
            float r1 = r1 * r1
            float r0 = r4.y
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r0 = (double) r1
            double r11 = java.lang.Math.sqrt(r0)
            r7 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            boolean r9 = X.AnonymousClass001.A1W(r0)
            java.util.Iterator r8 = X.AnonymousClass001.A0v(r10)
        L_0x00f3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r7 = r8.next()
            X.5UA r7 = (X.AnonymousClass5UA) r7
            boolean r0 = r7 instanceof X.C95914v4
            if (r0 != 0) goto L_0x00f3
            r0 = r7
            X.4v3 r0 = (X.AnonymousClass4v3) r0
            int r4 = r0.A00
            r0 = 1
            if (r4 == r0) goto L_0x0120
            r1 = 2
            if (r4 != r1) goto L_0x00f3
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x012f
            if (r9 != 0) goto L_0x012f
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x011c
            int r0 = r5.A01
            if (r0 == r1) goto L_0x012f
        L_0x011c:
            r7.A03()
            goto L_0x00f3
        L_0x0120:
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x012f
            if (r9 != 0) goto L_0x012f
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x011c
            int r0 = r5.A01
            if (r0 == 0) goto L_0x012f
            goto L_0x011c
        L_0x012f:
            r7.A02()
            goto L_0x00f3
        L_0x0133:
            r13.A06 = r5
            float r1 = r13.A00
            float r0 = r14.x
            float r1 = r1 - r0
            float r11 = r11 + r1
            r13.A00 = r7
            goto L_0x00b9
        L_0x013f:
            float r1 = r14.x
            float r2 = r10.x
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x014e
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0159
        L_0x014e:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00b9
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b9
        L_0x0159:
            r13.A06 = r8
            float r0 = r9.x
            r13.A00 = r0
            float r11 = r2 - r1
            goto L_0x00b9
        L_0x0163:
            r13.A07 = r5
            float r1 = r13.A01
            float r0 = r14.y
            float r1 = r1 - r0
            float r15 = r15 + r1
            r13.A01 = r7
            goto L_0x0097
        L_0x016f:
            float r2 = r14.y
            float r1 = r10.y
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x017e
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0189
        L_0x017e:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0097
        L_0x0189:
            r13.A07 = r8
            float r0 = r9.y
            r13.A01 = r0
            float r15 = r1 - r2
            goto L_0x0097
        L_0x0193:
            float r0 = r14.y
            goto L_0x006d
        L_0x0197:
            float r1 = r14.x
            goto L_0x0066
        L_0x019b:
            r4 = r2
        L_0x019c:
            X.5Qg r7 = r6.A06
            r0 = r19
            float r1 = r0.x
            float r0 = r0.y
            boolean r5 = r7.A01(r1, r0)
            boolean r0 = r7.A00
            if (r5 == 0) goto L_0x01cc
            if (r0 != 0) goto L_0x01d8
            X.4Lh r2 = r7.A04
            android.view.View r0 = r7.A03
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131102583(0x7f060b77, float:1.7817608E38)
            int r0 = r1.getColor(r0)
            r2.A00 = r0
            r2.invalidateSelf()
            android.os.Vibrator r2 = r7.A02
            if (r2 == 0) goto L_0x01d8
            r0 = 3
            r2.vibrate(r0)     // Catch:{ NullPointerException -> 0x01d2 }
            goto L_0x01d8
        L_0x01cc:
            if (r0 == 0) goto L_0x01d8
            r7.A00()
            goto L_0x01d8
        L_0x01d2:
            r1 = move-exception
            java.lang.String r0 = "Vibrator is broken on this device."
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01d8:
            r7.A00 = r5
            float r1 = r4.x
            float r0 = r4.y
            float[] r5 = r3.A02
            r2 = 0
            r5[r2] = r1
            r4 = 1
            r5[r4] = r0
            android.graphics.Matrix r1 = r3.A00
            r1.reset()
            X.5Qy r3 = r3.A01
            int r0 = r3.A02
            int r0 = -r0
            float r0 = (float) r0
            r1.setRotate(r0)
            r1.mapPoints(r5)
            r2 = r5[r2]
            float r1 = r3.A00
            float r0 = r3.A01
            float r1 = r1 * r0
            float r2 = r2 / r1
            r0 = r5[r4]
            float r0 = r0 / r1
            android.graphics.PointF r1 = X.AnonymousClass4L0.A08(r2, r0)
            X.5Uw r0 = r6.A01
            float r2 = r1.x
            float r1 = r1.y
            android.graphics.RectF r0 = r0.A02
            r0.offset(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109245eJ.A00(android.graphics.PointF, android.graphics.PointF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (((r1 * r1) + (r0 * r0)) <= (r2 * r2)) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(float r8, float r9) {
        /*
            r7 = this;
            X.5US r1 = r7.A09
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            X.5Uw r4 = r1.A01
            X.8yE r0 = r7.A02
            X.5nd r0 = (X.C114805nd) r0
            X.5nf r5 = r0.A01
            X.5UO r6 = r5.A05
            boolean r0 = r6 instanceof X.AnonymousClass68B
            if (r0 == 0) goto L_0x0049
            X.68B r6 = (X.AnonymousClass68B) r6
            int r0 = r6.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0049
            if (r4 == 0) goto L_0x0040
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            android.view.View r3 = r0.A0C
            float r2 = X.C86664Kz.A02(r3)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r3.getX()
            float r1 = r1 + r2
            float r0 = r3.getY()
            float r0 = r0 + r2
            float r1 = r1 - r8
            float r0 = r0 - r9
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            float r2 = r2 * r2
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
        L_0x0040:
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            r0.A1X()
        L_0x0047:
            r1 = 1
        L_0x0048:
            return r1
        L_0x0049:
            boolean r0 = r4 instanceof X.C95964vF
            if (r0 == 0) goto L_0x0068
            X.5Uj r1 = r5.A0V
            r0 = 3
            r1.A07(r0)
            r0 = r4
            X.4vF r0 = (X.C95964vF) r0
            r5.A09(r0)
        L_0x0059:
            r1 = 0
            if (r4 == 0) goto L_0x0048
            boolean r0 = r4.A0W()
            if (r0 == 0) goto L_0x0048
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            r0.invalidate()
            goto L_0x0047
        L_0x0068:
            if (r4 == 0) goto L_0x0059
            boolean r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0059
            X.5Uj r1 = r5.A0V
            android.graphics.Paint r0 = r4.A01
            int r0 = r0.getColor()
            r1.A01 = r0
            r0 = 2
            r1.A07(r0)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r5.A0J
            r0.A00()
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109245eJ.A01(float, float):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.5US r4 = r5.A09
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            X.5Uw r0 = r4.A01
            if (r0 == 0) goto L_0x0053
            java.util.List r3 = r4.A04
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0053
            X.5Uw r0 = r4.A01
            if (r0 != 0) goto L_0x004e
            r2 = -1
        L_0x001a:
            int r1 = r3.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x0053
            X.5Uw r2 = r4.A01
            if (r2 != 0) goto L_0x0049
            r0 = -1
        L_0x0027:
            X.6l6 r1 = new X.6l6
            r1.<init>(r2, r0)
            X.5PR r0 = r4.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            X.5Uw r0 = r4.A01
            r3.remove(r0)
            X.5Uw r0 = r4.A01
            r3.add(r0)
            r0 = 1
        L_0x003e:
            r1 = 1
            if (r0 == 0) goto L_0x0055
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r5.A03
            X.5Xo r0 = r0.A0F
            r0.A01()
            return r1
        L_0x0049:
            int r0 = r3.indexOf(r2)
            goto L_0x0027
        L_0x004e:
            int r2 = r3.indexOf(r0)
            goto L_0x001a
        L_0x0053:
            r0 = 0
            goto L_0x003e
        L_0x0055:
            android.view.GestureDetector$OnGestureListener r0 = r5.A00
            if (r0 == 0) goto L_0x0062
            android.view.GestureDetector$OnDoubleTapListener r0 = (android.view.GestureDetector.OnDoubleTapListener) r0
            boolean r0 = r0.onDoubleTap(r6)
            if (r0 == 0) goto L_0x0062
            return r1
        L_0x0062:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109245eJ.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((GestureDetector.OnDoubleTapListener) onGestureListener).onDoubleTapEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onDown(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onFling(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onLongPress(motionEvent);
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass7EA r1 = this.A08;
        C105425Uw r0 = this.A09.A01;
        r1.A00 = r0;
        if (r0 != null) {
            return true;
        }
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleBegin(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A08.A00 = null;
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleEnd(scaleGestureDetector);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onScroll(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int indexOf;
        GestureDetector.OnGestureListener onGestureListener;
        AnonymousClass5US r1 = this.A09;
        List list = r1.A04;
        if (list.size() == 1) {
            return false;
        }
        C105425Uw r0 = r1.A01;
        if (r0 == null) {
            indexOf = -1;
        } else {
            indexOf = list.indexOf(r0);
        }
        if (indexOf == AnonymousClass002.A04(list, 1)) {
            return false;
        }
        if (A01(motionEvent.getX(), motionEvent.getY()) || ((onGestureListener = this.A00) != null && ((GestureDetector.OnDoubleTapListener) onGestureListener).onSingleTapConfirmed(motionEvent))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 == X.AnonymousClass002.A04(r2, 1)) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapUp(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.5Uw r0 = r0.A00(r5)
            X.5US r1 = r4.A09
            r1.A01 = r0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r2 = r1.A04
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0020
            X.5Uw r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            r1 = -1
        L_0x001a:
            int r0 = X.AnonymousClass002.A04(r2, r3)
            if (r1 != r0) goto L_0x0032
        L_0x0020:
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r0 = r4.A01(r1, r0)
            return r0
        L_0x002d:
            int r1 = r2.indexOf(r0)
            goto L_0x001a
        L_0x0032:
            android.view.GestureDetector$OnGestureListener r0 = r4.A00
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.onSingleTapUp(r5)
            if (r0 == 0) goto L_0x003d
            return r3
        L_0x003d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109245eJ.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public C109245eJ(GestureDetector.OnGestureListener onGestureListener, C188048yE r4, DoodleView doodleView, C103705Ob r6, AnonymousClass7EA r7, AnonymousClass5US r8) {
        this.A03 = doodleView;
        this.A04 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r4;
        this.A00 = onGestureListener;
        this.A01 = new AnonymousClass0N1(doodleView.getContext(), this);
        AnonymousClass6ES r1 = new AnonymousClass6ES(doodleView.getContext(), this);
        this.A07 = r1;
        AnonymousClass0I7.A00(r1, false);
        this.A05 = new AnonymousClass5WF(doodleView.getContext(), this);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = ((AnonymousClass6ES) scaleGestureDetector).A00;
        C105425Uw r6 = this.A08.A00;
        if (r6 == null) {
            GestureDetector.OnGestureListener onGestureListener = this.A00;
            if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScale(scaleGestureDetector)) {
                return false;
            }
            return true;
        } else if (r6 instanceof AnonymousClass4vD) {
            r6.A0H(scaleFactor, AnonymousClass001.A1V((Math.abs(f) > 1.0f ? 1 : (Math.abs(f) == 1.0f ? 0 : -1))) ^ true ? 1 : 0);
            return true;
        } else if (r6 instanceof C95944vB) {
            r6.A0H(scaleFactor, true ^ AnonymousClass001.A1V((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) == 1.0d ? 0 : -1))) ? 1 : 0);
            return true;
        } else if (r6 instanceof AnonymousClass4vA) {
            r6.A0H(scaleFactor, true ^ AnonymousClass001.A1V((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) == 1.0d ? 0 : -1))) ? 1 : 0);
            return true;
        } else {
            r6.A0F(scaleFactor);
            return true;
        }
    }
}
