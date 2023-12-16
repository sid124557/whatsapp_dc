package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* renamed from: X.0Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C04850Qx {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public C05560Tz A03;
    public Object A04 = null;
    public boolean A05 = false;
    public final C17000uO A06;
    public final List A07 = AnonymousClass002.A0I(1);

    public abstract Object A0B(C06230Wt r1, float f);

    public void A0D() {
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((C16230sg) list.get(i)).BfC();
                i++;
            } else {
                return;
            }
        }
    }

    public static void A05(C04850Qx r1, C09320g0 r2, Object obj) {
        r1.A07.add(obj);
        r2.A08(r1);
    }

    public static void A06(C04850Qx r0, Object obj) {
        r0.A07.add(obj);
    }

    public float A07() {
        float f = this.A00;
        if (f != -1.0f) {
            return f;
        }
        float B7M = this.A06.B7M();
        this.A00 = B7M;
        return B7M;
    }

    public float A09() {
        if (this.A05) {
            return 0.0f;
        }
        C06230Wt A002 = AnonymousClass0K1.A00(this);
        if (!A002.A03()) {
            return (this.A02 - A002.A02()) / (A002.A01() - A002.A02());
        }
        return 0.0f;
    }

    public Object A0C(C06230Wt r2, float f, float f2, float f3) {
        throw AnonymousClass002.A0G("This animation does not support split dimensions!");
    }

    public void A0E(float f) {
        C17000uO r3 = this.A06;
        if (!r3.isEmpty()) {
            float f2 = this.A01;
            if (f2 == -1.0f) {
                f2 = r3.BDF();
                this.A01 = f2;
            }
            if (f < f2) {
                if (f2 == -1.0f) {
                    f2 = r3.BDF();
                    this.A01 = f2;
                }
                f = f2;
            } else if (f > A07()) {
                f = A07();
            }
            if (f != this.A02) {
                this.A02 = f;
                if (r3.BJK(f)) {
                    A0D();
                }
            }
        }
    }

    public void A0F(C05560Tz r3) {
        C05560Tz r1 = this.A03;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A03 = r3;
        if (r3 != null) {
            r3.A00 = this;
        }
    }

    public C04850Qx(List list) {
        C17000uO r0;
        if (list.isEmpty()) {
            r0 = new C09330g1();
        } else if (list.size() == 1) {
            r0 = new C09340g2(list);
        } else {
            r0 = new C09350g3(list);
        }
        this.A06 = r0;
    }

    public static float A02(C04850Qx r0) {
        return ((Number) r0.A0A()).floatValue();
    }

    public static int A03(C04850Qx r0) {
        return ((Number) r0.A0A()).intValue();
    }

    public static PointF A04(C04850Qx r0) {
        return (PointF) r0.A0A();
    }

    public float A08() {
        C06230Wt A002 = AnonymousClass0K1.A00(this);
        if (A002.A03()) {
            return 0.0f;
        }
        return A002.A0B.getInterpolation(A09());
    }

    public Object A0A() {
        Object A0B;
        Interpolator interpolator;
        float A09 = A09();
        if (this.A03 == null && this.A06.BHA(A09)) {
            return this.A04;
        }
        C06230Wt A002 = AnonymousClass0K1.A00(this);
        Interpolator interpolator2 = A002.A0C;
        if (interpolator2 == null || (interpolator = A002.A0D) == null) {
            A0B = A0B(A002, A08());
        } else {
            A0B = A0C(A002, A09, interpolator2.getInterpolation(A09), interpolator.getInterpolation(A09));
        }
        this.A04 = A0B;
        return A0B;
    }
}
