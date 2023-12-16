package X;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.util.Log;

/* renamed from: X.5fN  reason: invalid class name and case insensitive filesystem */
public class C109905fN implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public C149377Mf A0E;
    public Runnable A0F;
    public boolean A0G;
    public final double A0H;
    public final int A0I = ViewConfiguration.getLongPressTimeout();
    public final /* synthetic */ PipViewContainer A0J;

    public C109905fN(PipViewContainer pipViewContainer) {
        this.A0J = pipViewContainer;
        int i = C86634Kw.A0J().widthPixels;
        int i2 = C86634Kw.A0J().heightPixels;
        this.A0H = Math.sqrt((double) ((i * i) + (i2 * i2)));
        this.A0F = C117695sL.A00(this, 3);
    }

    public final boolean A00() {
        AnonymousClass4Z7 r0 = this.A0J.A04;
        if (r0 == null || !r0.A06() || ((double) this.A08) >= this.A0H / 60.0d) {
            return false;
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        String str;
        boolean z;
        int i2;
        int i3;
        int i4;
        float f;
        float rawX;
        int i5;
        View view2 = view;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view2);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C86634Kw.A1E(C86634Kw.A0P(view2.animate(), 1.0f), 100);
                this.A0G = false;
                if (this.A0E == null) {
                    str = "PipViewContainer/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore";
                } else {
                    view2.removeCallbacks(this.A0F);
                    if (A00()) {
                        PipViewContainer pipViewContainer = this.A0J;
                        pipViewContainer.A04.A0H.performClick();
                        PipViewContainer.A00(pipViewContainer, false);
                        pipViewContainer.A02();
                        return true;
                    }
                    float f2 = this.A04;
                    float f3 = this.A05;
                    float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
                    double d = this.A0H;
                    boolean A1W = AnonymousClass001.A1W((((double) sqrt) > (d / 1.0d) ? 1 : (((double) sqrt) == (d / 1.0d) ? 0 : -1)));
                    float rawX2 = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (A1W) {
                        double d2 = (double) ((this.A04 / sqrt) * 64.0f);
                        double d3 = (double) ((this.A05 / sqrt) * 64.0f);
                        while (rawX2 >= 0.0f && rawX2 <= ((float) this.A07) && rawY >= 0.0f && rawY <= ((float) this.A06)) {
                            rawX2 = (float) (((double) rawX2) + d2);
                            rawY = (float) (((double) rawY) + d3);
                        }
                    }
                    PipViewContainer pipViewContainer2 = this.A0J;
                    C620733j r0 = pipViewContainer2.A07;
                    C620733j r15 = r0;
                    boolean A042 = C620733j.A04(r0);
                    float f4 = (float) (this.A07 / 2);
                    if (!A042 ? rawX2 > f4 : rawX2 < f4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean A1U = AnonymousClass001.A1U((rawY > ((float) (this.A06 / 2)) ? 1 : (rawY == ((float) (this.A06 / 2)) ? 0 : -1)));
                    pipViewContainer2.A02 = AnonymousClass0x9.A0C(Boolean.valueOf(z), Boolean.valueOf(A1U));
                    AnonymousClass7Pi r9 = pipViewContainer2.A06;
                    C626936e.A06(r9);
                    Point point = pipViewContainer2.A01;
                    C626936e.A06(point);
                    C149377Mf A012 = pipViewContainer2.A01(point, new Point(this.A0C, this.A0B), r9);
                    if (z) {
                        i2 = A012.A00;
                    } else {
                        i2 = A012.A02;
                    }
                    if (A1U) {
                        i3 = A012.A01;
                    } else {
                        i3 = A012.A03;
                    }
                    Point point2 = new Point(i2, i3);
                    int i6 = point2.x;
                    if (C620733j.A04(r15)) {
                        i4 = A0T.leftMargin;
                    } else {
                        i4 = A0T.rightMargin;
                    }
                    int i7 = i6 - i4;
                    int i8 = point2.y - A0T.topMargin;
                    double sqrt2 = Math.sqrt((double) ((i7 * i7) + (i8 * i8)));
                    long max = (long) Math.max(200, (int) ((500.0d * sqrt2) / d));
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("PipViewContainer/onTouch ACTION_UP xVelocity: ");
                    A0o.append(this.A04);
                    A0o.append(", yVelocity: ");
                    A0o.append(this.A05);
                    A0o.append(", velocity: ");
                    A0o.append(sqrt);
                    A0o.append(", fling: ");
                    A0o.append(A1W);
                    A0o.append(", finalRawX: ");
                    A0o.append(rawX2);
                    A0o.append(", finalRawY: ");
                    A0o.append(rawY);
                    A0o.append(", screen length: (");
                    A0o.append(d);
                    A0o.append("), container size: ");
                    A0o.append(this.A07);
                    A0o.append("x");
                    A0o.append(this.A06);
                    A0o.append(", pipAtRight: ");
                    A0o.append(z);
                    A0o.append(", pipAtBottom: ");
                    A0o.append(A1U);
                    A0o.append(", moving distance: ");
                    A0o.append(sqrt2);
                    C18260x0.A12(", duration: ", A0o, max);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("PipViewContainer/animatePiPView with duration: ");
                    A0o2.append(max);
                    A0o2.append(", xOffset: ");
                    A0o2.append(i7);
                    C18260x0.A0y(", yOffset: ", A0o2, i8);
                    if (max <= 0 || !pipViewContainer2.A0D) {
                        pipViewContainer2.A03();
                        return true;
                    }
                    float[] A0T2 = AnonymousClass4L0.A0T();
                    // fill-array-data instruction
                    A0T2[0] = 0;
                    A0T2[1] = 1065353216;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T2);
                    pipViewContainer2.A00 = ofFloat;
                    ofFloat.setDuration(max);
                    pipViewContainer2.A00.addUpdateListener(new C107865c1(view2, pipViewContainer2, i7, i8));
                    C86614Ku.A0z(pipViewContainer2.A00, pipViewContainer2, 10);
                    pipViewContainer2.A00.start();
                    return true;
                }
            } else if (action != 2) {
                if (action != 3) {
                    return true;
                }
                C86634Kw.A1E(C86634Kw.A0P(view2.animate(), 1.0f), 100);
                this.A0G = false;
                view2.removeCallbacks(this.A0F);
                return true;
            } else if (this.A0E == null) {
                str = "PipViewContainer/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore";
            } else {
                int i9 = this.A09;
                C620733j r7 = this.A0J.A07;
                if (C620733j.A04(r7)) {
                    f = motionEvent.getRawX();
                    rawX = this.A00;
                } else {
                    f = this.A00;
                    rawX = motionEvent.getRawX();
                }
                int rawY2 = this.A0A + ((int) (motionEvent.getRawY() - this.A01));
                C149377Mf r4 = this.A0E;
                int A0D2 = AnonymousClass001.A0D(r4.A00, i9 + ((int) (f - rawX)), r4.A02);
                int A0D3 = AnonymousClass001.A0D(r4.A01, rawY2, r4.A03);
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                if (C620733j.A04(r7)) {
                    i5 = A0T.rightMargin;
                } else {
                    i5 = A0T.leftMargin;
                }
                View view3 = view2;
                C107555bV.A06(view3, r7, A0D2, A0D3, i5, A0T.bottomMargin);
                this.A08 = Math.max(Math.max(AnonymousClass001.A0A(A0D2, this.A09), AnonymousClass001.A0A(A0D3, this.A0A)), this.A08);
                if (!A00() && !this.A0G) {
                    this.A0G = true;
                    C86634Kw.A1E(C86634Kw.A0P(view2.animate(), 1.1f), 100);
                    view3.removeCallbacks(this.A0F);
                }
                long eventTime = motionEvent.getEventTime() - this.A0D;
                if (eventTime > 0) {
                    float f5 = (float) eventTime;
                    this.A04 = ((motionEvent.getRawX() - this.A02) * 1000.0f) / f5;
                    this.A05 = ((motionEvent.getRawY() - this.A03) * 1000.0f) / f5;
                }
                this.A02 = motionEvent.getRawX();
                this.A03 = motionEvent.getRawY();
                this.A0D = motionEvent.getEventTime();
                return true;
            }
            Log.i(str);
            return true;
        }
        view2.postDelayed(this.A0F, (long) this.A0I);
        PipViewContainer pipViewContainer3 = this.A0J;
        Point point3 = pipViewContainer3.A01;
        C626936e.A06(point3);
        this.A07 = point3.x;
        Point point4 = pipViewContainer3.A01;
        C626936e.A06(point4);
        this.A06 = point4.y;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        if (C620733j.A04(pipViewContainer3.A07)) {
            i = A0T.leftMargin;
        } else {
            i = A0T.rightMargin;
        }
        this.A09 = i;
        this.A0A = A0T.topMargin;
        this.A0C = view2.getWidth();
        this.A0B = view2.getHeight();
        PipViewContainer.A00(pipViewContainer3, true);
        this.A08 = 0;
        ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(pipViewContainer3);
        Point point5 = new Point(A0T3.width, A0T3.height);
        AnonymousClass7Pi r1 = pipViewContainer3.A06;
        C626936e.A06(r1);
        Point point6 = pipViewContainer3.A01;
        C626936e.A06(point6);
        this.A0E = pipViewContainer3.A01(point6, point5, r1);
        this.A05 = 0.0f;
        this.A04 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A0D = 0;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("PipViewContainer/onTouch ACTION_DOWN downX: ");
        A0o3.append(this.A00);
        A0o3.append(", downY: ");
        A0o3.append(this.A01);
        A0o3.append(", leftMargin: ");
        A0o3.append(this.A09);
        A0o3.append(", topMargin: ");
        C18260x0.A1G(A0o3, this.A0A);
        return true;
    }
}
