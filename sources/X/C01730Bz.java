package X;

import android.view.View;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Bz  reason: invalid class name and case insensitive filesystem */
public class C01730Bz extends ViewDragHelper$Callback {
    public final /* synthetic */ C002202q A00;

    public C01730Bz(C002202q r1) {
        this.A00 = r1;
    }

    public int A00(View view) {
        return this.A00.getHeight();
    }

    public int A01(View view, int i, int i2) {
        if (this.A00.A03 != null) {
            return (int) (((float) i2) * 0.15f);
        }
        return i2;
    }

    public int A02(View view, int i, int i2) {
        int BBV;
        int BBV2;
        C002202q r1 = this.A00;
        if (r1.A0G == null) {
            return i;
        }
        int height = r1.getHeight();
        C16290sm r5 = null;
        C16290sm r4 = null;
        for (C16290sm r2 : r1.A0G) {
            if (r5 == null) {
                r5 = r2;
            } else {
                int BBV3 = r2.BBV(view, height);
                if (BBV3 >= r4.BBV(view, height)) {
                    if (BBV3 > r5.BBV(view, height)) {
                        r5 = r2;
                    }
                }
            }
            r4 = r2;
        }
        if (r5 == null) {
            BBV = i;
        } else {
            BBV = r5.BBV(view, height);
        }
        if (r4 == null) {
            BBV2 = i;
        } else {
            BBV2 = r4.BBV(view, height);
        }
        return height - AnonymousClass001.A0D(BBV, height - i, BBV2);
    }

    public void A03(int i) {
        C16290sm r2;
        C002202q r4 = this.A00;
        View view = r4.A02;
        if (view != null && C06360Xi.A05(view) && r4.A05 != null && i == 0) {
            List emptyList = Collections.emptyList();
            View view2 = r4.A02;
            if (view2 == null || !C06360Xi.A05(view2)) {
                r2 = null;
            } else {
                int height = r4.getHeight();
                r2 = r4.A01(view2, emptyList, height - view2.getTop(), height);
            }
            r4.A06 = r2;
            AnonymousClass00P r1 = r4.A05.A00;
            r1.A09.A07.A02();
            if (r2 == AnonymousClass00P.A0H) {
                if (!r1.A0D) {
                    r1.A03(AnonymousClass0FG.SWIPE_AWAY);
                }
                r1.A00();
            }
        }
    }

    public void A04(View view, float f, float f2) {
        if (view != null) {
            C002202q r4 = this.A00;
            int height = r4.getHeight();
            AnonymousClass0UZ r2 = r4.A07;
            r2.A0A.abortAnimation();
            r2.A0A.fling(0, 0, 0, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = r2.A0A.getFinalY();
            r2.A0A.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = r4.A08;
            if (list == null) {
                list = Collections.emptyList();
            }
            C16290sm A01 = r4.A01(view, list, top, height);
            if (A01 != null) {
                r4.A06 = A01;
                int BBV = height - A01.BBV(view, height);
                try {
                    int i = r4.A00;
                    if (r2.A0B) {
                        r2.A07.getXVelocity(r2.A02);
                        r2.A09(BBV, (int) r2.A07.getYVelocity(r2.A02), i);
                        AnonymousClass0YY.A05(r4);
                        return;
                    }
                    throw AnonymousClass001.A0e("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }

    public void A05(View view, int i, int i2, int i3, int i4) {
        C002202q r0 = this.A00;
        AnonymousClass0OC r1 = r0.A05;
        if (r1 != null) {
            r1.A00(view, r0.getHeight());
        }
    }
}
