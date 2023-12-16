package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.0mq  reason: invalid class name and case insensitive filesystem */
public class C13230mq implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final /* synthetic */ RecyclerView A06;

    public C13230mq(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1A;
        this.A02 = interpolator;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        AnonymousClass0YY.A07(recyclerView, this);
    }

    public void A01(Interpolator interpolator, int i, int i2, int i3) {
        int height;
        int i4;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i7);
            boolean z = false;
            if (abs > abs2) {
                z = true;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = this.A06;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i8 = height / 2;
            float f = (float) height;
            float A022 = AnonymousClass001.A02((((float) sqrt2) * 1.0f) / f, i8);
            if (sqrt > 0) {
                i4 = AnonymousClass001.A09(sqrt, A022);
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            i5 = Math.min(i4, 2000);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.A1A;
        }
        if (this.A02 != interpolator) {
            this.A02 = interpolator;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A01 = 0;
        this.A00 = 0;
        this.A06.setScrollState(2);
        this.A03.startScroll(0, 0, i6, i7, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A00();
    }

    public void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.A06;
        if (recyclerView.A0S == null) {
            recyclerView.removeCallbacks(this);
            this.A03.abortAnimation();
            return;
        }
        this.A05 = false;
        this.A04 = true;
        recyclerView.A0J();
        OverScroller overScroller = this.A03;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.A00;
            int i5 = currY - this.A01;
            this.A00 = currX;
            this.A01 = currY;
            int[] iArr = recyclerView.A18;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.A13(iArr, (int[]) null, i4, i5, 1)) {
                i4 -= iArr[0];
                i5 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.A0c(i4, i5);
            }
            if (recyclerView.A0N != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.A0i(i4, iArr, i5);
                i2 = iArr[0];
                i = iArr[1];
                i4 -= i2;
                i5 -= i;
                C04690Qg r6 = recyclerView.A0S.A06;
                if (r6 != null && !r6.A04 && r6.A05) {
                    int A002 = recyclerView.A0y.A00();
                    if (A002 == 0) {
                        r6.A01();
                    } else if (r6.A00 >= A002) {
                        r6.A00 = A002 - 1;
                        r6.A04(i2, i);
                    } else {
                        r6.A04(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!recyclerView.A13.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            recyclerView.A0y((int[]) null, iArr, i2, i, i4, i5, 1);
            int i6 = i4 - iArr[0];
            int i7 = i5 - iArr[1];
            if (!(i2 == 0 && i == 0)) {
                recyclerView.A0e(i2, i);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean A1U = AnonymousClass000.A1U(overScroller.getCurrX(), overScroller.getFinalX());
            boolean A1U2 = AnonymousClass000.A1U(overScroller.getCurrY(), overScroller.getFinalY());
            if (overScroller.isFinished() || ((A1U || i6 != 0) && (A1U2 || i7 != 0))) {
                z = true;
            } else {
                z = false;
            }
            C04690Qg r0 = recyclerView.A0S.A06;
            if ((r0 == null || !r0.A04) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = 0;
                        if (i6 > 0) {
                            i3 = currVelocity;
                        }
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i3 < 0) {
                        recyclerView.A0M();
                        if (recyclerView.A0F.isFinished()) {
                            recyclerView.A0F.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView.A0N();
                        if (recyclerView.A0G.isFinished()) {
                            recyclerView.A0G.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A0O();
                        if (recyclerView.A0H.isFinished()) {
                            recyclerView.A0H.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.A0L();
                        if (recyclerView.A0E.isFinished()) {
                            recyclerView.A0E.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i3 == 0 && currVelocity == 0)) {
                        AnonymousClass0YY.A05(recyclerView);
                    }
                }
                C08540ee r4 = recyclerView.A0L;
                int[] iArr2 = r4.A03;
                if (iArr2 != null) {
                    Arrays.fill(iArr2, -1);
                }
                r4.A00 = 0;
            } else {
                A00();
                C13320mz r7 = recyclerView.A0M;
                if (r7 != null) {
                    if (recyclerView.A0j && r7.A01 == 0) {
                        r7.A01 = System.nanoTime();
                        recyclerView.post(r7);
                    }
                    C08540ee r02 = recyclerView.A0L;
                    r02.A01 = i2;
                    r02.A02 = i;
                }
            }
        }
        C04690Qg r1 = recyclerView.A0S.A06;
        if (r1 != null && r1.A04) {
            r1.A04(0, 0);
        }
        this.A04 = false;
        if (this.A05) {
            recyclerView.removeCallbacks(this);
            AnonymousClass0YY.A07(recyclerView, this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0b(1);
    }
}
