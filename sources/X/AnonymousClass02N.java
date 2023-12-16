package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

/* renamed from: X.02N  reason: invalid class name */
public class AnonymousClass02N extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final AnonymousClass0NT A05;
    public final C153427bI A06;
    public final AnonymousClass84O A07;
    public final AnonymousClass84O A08;
    public final Map A09 = new AnonymousClass05C(2);

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (AnonymousClass001.A1W((Math.abs(y) > Math.abs(x) ? 1 : (Math.abs(y) == Math.abs(x) ? 0 : -1)))) {
            i = 42;
            if (y > 0.0f) {
                i = 38;
            }
        } else {
            i = 40;
            if (x > 0.0f) {
                i = 41;
            }
        }
        C835248t A022 = A02(i);
        if (A022 == null) {
            return false;
        }
        AnonymousClass84O r3 = this.A08;
        C152057Xj r2 = new C152057Xj();
        r2.A04(this.A07, 0);
        C153427bI r1 = this.A06;
        r2.A04(r1, 1);
        C159377lj.A01(r1, r3, r2.A03(), A022);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.A01 = true;
        C835248t A022 = A02(35);
        C835248t A023 = A02(61);
        if (A022 != null) {
            AnonymousClass84O r3 = this.A08;
            C152057Xj r2 = new C152057Xj();
            r2.A04(this.A07, 0);
            C153427bI r1 = this.A06;
            r2.A04(r1, 1);
            C159377lj.A01(r1, r3, r2.A03(), A022);
        }
        if (A023 != null) {
            AnonymousClass84O r4 = this.A08;
            C152057Xj r6 = new C152057Xj();
            r6.A04(this.A07, 0);
            C153427bI r32 = this.A06;
            r6.A04(r32, 1);
            r6.A04(r4, 2);
            r6.A04("detected", 3);
            float x = motionEvent.getX();
            View view = this.A04;
            r6.A04(Float.valueOf(x - view.getX()), 4);
            r6.A04(A00(motionEvent, view), 5);
            C159377lj.A01(r32, r4, r6.A03(), A023);
        }
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    public static Float A01(View view, float f) {
        return Float.valueOf((f * 100.0f) / ((float) view.getHeight()));
    }

    public C835248t A02(int i) {
        Map map = this.A09;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C835248t) map.get(valueOf);
        }
        C835248t A0L = this.A08.A0L(i);
        map.put(valueOf, A0L);
        return A0L;
    }

    public void A03(MotionEvent motionEvent) {
        C835248t A022 = A02(61);
        if (this.A01 && A022 != null) {
            AnonymousClass84O r4 = this.A08;
            C152057Xj r7 = new C152057Xj();
            r7.A04(this.A07, 0);
            C153427bI r3 = this.A06;
            r7.A04(r3, 1);
            r7.A04(r4, 2);
            r7.A04("cancelled", 3);
            float x = motionEvent.getX();
            View view = this.A04;
            r7.A04(Float.valueOf(x - view.getX()), 4);
            r7.A04(A00(motionEvent, view), 5);
            C159377lj.A01(r3, r4, r7.A03(), A022);
        }
        this.A01 = false;
    }

    public void A04(MotionEvent motionEvent) {
        if (this.A01) {
            A05(motionEvent);
            this.A01 = false;
        }
        C835248t A022 = A02(50);
        if (A022 != null) {
            PointF A002 = this.A05.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
            AnonymousClass84O r5 = this.A08;
            C152057Xj r6 = new C152057Xj();
            r6.A04(this.A07, 0);
            C153427bI r3 = this.A06;
            r6.A04(r3, 1);
            View view = this.A04;
            r6.A04(Float.valueOf(AnonymousClass001.A04(view, A002.x * 100.0f)), 2);
            r6.A04(A01(view, A002.y), 3);
            C159377lj.A01(r3, r5, r6.A03(), A022);
        }
    }

    public final void A05(MotionEvent motionEvent) {
        C835248t A022 = A02(53);
        C835248t A023 = A02(61);
        if (A022 != null) {
            AnonymousClass84O r5 = this.A08;
            C152057Xj r11 = new C152057Xj();
            r11.A04(this.A07, 0);
            C153427bI r4 = this.A06;
            r11.A04(r4, 1);
            float x = motionEvent.getX();
            View view = this.A04;
            r11.A04(Float.valueOf(x - view.getX()), 2);
            r11.A04(A00(motionEvent, view), 3);
            C159377lj.A01(r4, r5, r11.A03(), A022);
        }
        if (A023 != null) {
            AnonymousClass84O r52 = this.A08;
            C152057Xj r42 = new C152057Xj();
            r42.A04(this.A07, 0);
            C153427bI r3 = this.A06;
            r42.A04(r3, 1);
            r42.A04(r52, 2);
            r42.A04("released", 3);
            float x2 = motionEvent.getX();
            View view2 = this.A04;
            r42.A04(Float.valueOf(x2 - view2.getX()), 4);
            r42.A04(A00(motionEvent, view2), 5);
            C159377lj.A01(r3, r52, r42.A03(), A023);
        }
    }

    public final boolean A06() {
        if (A02(36) == null && A02(45) == null) {
            return false;
        }
        return true;
    }

    public final boolean A07(MotionEvent motionEvent) {
        boolean z;
        C835248t A022 = A02(43);
        C835248t A023 = A02(54);
        C835248t A024 = A02(62);
        if (A022 != null) {
            AnonymousClass84O r4 = this.A08;
            C152057Xj r2 = new C152057Xj();
            r2.A04(this.A07, 0);
            C153427bI r1 = this.A06;
            r2.A04(r1, 1);
            C159377lj.A01(r1, r4, r2.A03(), A022);
            z = true;
        } else {
            z = false;
        }
        if (A023 != null) {
            AnonymousClass84O r5 = this.A08;
            C152057Xj r11 = new C152057Xj();
            r11.A04(this.A07, 0);
            C153427bI r42 = this.A06;
            r11.A04(r42, 1);
            float x = motionEvent.getX();
            View view = this.A04;
            r11.A04(Float.valueOf(x - view.getX()), 2);
            r11.A04(A00(motionEvent, view), 3);
            C159377lj.A01(r42, r5, r11.A03(), A023);
            z = true;
        }
        if (A024 == null) {
            return z;
        }
        AnonymousClass84O r52 = this.A08;
        C152057Xj r43 = new C152057Xj();
        r43.A04(this.A07, 0);
        C153427bI r3 = this.A06;
        r43.A04(r3, 1);
        r43.A04(r52, 2);
        float x2 = motionEvent.getX();
        View view2 = this.A04;
        r43.A04(Float.valueOf(x2 - view2.getX()), 3);
        r43.A04(A00(motionEvent, view2), 4);
        C159377lj.A01(r3, r52, r43.A03(), A024);
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C835248t A022 = A02(45);
        if (A022 == null) {
            A022 = A02(36);
        }
        if (A022 == null) {
            return false;
        }
        PointF A002 = this.A05.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
        AnonymousClass84O r4 = this.A08;
        C152057Xj r7 = new C152057Xj();
        r7.A04(this.A07, 0);
        C153427bI r3 = this.A06;
        r7.A04(r3, 1);
        View view = this.A04;
        r7.A04(Float.valueOf(AnonymousClass001.A04(view, A002.x * 100.0f)), 2);
        r7.A04(A01(view, A002.y), 3);
        C159377lj.A01(r3, r4, r7.A03(), A022);
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C835248t A022 = A02(49);
        if (A022 != null) {
            PointF A002 = this.A05.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
            AnonymousClass84O r4 = this.A08;
            C152057Xj r7 = new C152057Xj();
            r7.A04(this.A07, 0);
            C153427bI r3 = this.A06;
            r7.A04(r3, 1);
            View view = this.A04;
            r7.A04(Float.valueOf(AnonymousClass001.A04(view, A002.x * 100.0f)), 2);
            r7.A04(A01(view, A002.y), 3);
            C159377lj.A01(r3, r4, r7.A03(), A022);
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C835248t A022;
        if (this.A00 == null || (A022 = A02(44)) == null) {
            return false;
        }
        AnonymousClass84O r5 = this.A08;
        C152057Xj r7 = new C152057Xj();
        r7.A04(this.A07, 0);
        C153427bI r4 = this.A06;
        r7.A04(r4, 1);
        r7.A04(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        View view = this.A04;
        r7.A04(Float.valueOf(AnonymousClass001.A04(view, this.A00.x * 100.0f)), 3);
        r7.A04(A01(view, this.A00.y), 4);
        C159377lj.A01(r4, r5, r7.A03(), A022);
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C835248t A022 = A02(48);
        if (A022 != null) {
            AnonymousClass84O r6 = this.A08;
            C152057Xj r8 = new C152057Xj();
            r8.A04(this.A07, 0);
            C153427bI r5 = this.A06;
            r8.A04(r5, 1);
            View view = this.A04;
            r8.A04(Float.valueOf(AnonymousClass001.A04(view, f * 100.0f)), 2);
            r8.A04(A01(view, f2), 3);
            Object A012 = C159377lj.A01(r5, r6, r8.A03(), A022);
            if (!(A012 instanceof Boolean)) {
                C159737mN.A01("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean A1Z = AnonymousClass001.A1Z(A012);
                if (A1Z) {
                    this.A03 = true;
                }
                this.A02 = true;
                return A1Z;
            }
        }
        return false;
    }

    public AnonymousClass02N(View view, AnonymousClass0NT r4, C153427bI r5, AnonymousClass84O r6, AnonymousClass84O r7) {
        this.A06 = r5;
        this.A08 = r6;
        this.A07 = r7;
        this.A04 = view;
        this.A05 = r4;
    }

    public static Float A00(MotionEvent motionEvent, View view) {
        return Float.valueOf(motionEvent.getY() - view.getY());
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = this.A05.A00(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!A06() || !A07(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A06() || !A07(motionEvent)) {
            return false;
        }
        return true;
    }
}
