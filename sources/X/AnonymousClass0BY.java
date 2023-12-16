package X;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0BY  reason: invalid class name */
public class AnonymousClass0BY extends C04850Qx {
    public C05560Tz A00;
    public C05560Tz A01;
    public final PointF A02 = new PointF();
    public final PointF A03 = new PointF();
    public final C04850Qx A04;
    public final C04850Qx A05;

    public void A0E(float f) {
        C04850Qx r1 = this.A04;
        r1.A0E(f);
        C04850Qx r0 = this.A05;
        r0.A0E(f);
        this.A02.set(C04850Qx.A02(r1), C04850Qx.A02(r0));
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

    /* renamed from: A0G */
    public PointF A0A() {
        Number number;
        float floatValue;
        float floatValue2;
        C04850Qx r0;
        C06230Wt A002;
        C04850Qx r02;
        C06230Wt A003;
        Number number2 = null;
        if (this.A00 == null || (A003 = AnonymousClass0K1.A00(r02)) == null) {
            number = null;
        } else {
            (r02 = this.A04).A08();
            Float f = A003.A08;
            C05560Tz r4 = this.A00;
            if (f != null) {
                f.floatValue();
            }
            Object obj = A003.A0F;
            Object obj2 = A003.A09;
            AnonymousClass0LM r03 = r4.A02;
            r03.A01 = obj;
            r03.A00 = obj2;
            number = (Number) r4.A00(r03);
        }
        if (!(this.A01 == null || (A002 = AnonymousClass0K1.A00(r0)) == null)) {
            (r0 = this.A05).A08();
            Float f2 = A002.A08;
            C05560Tz r3 = this.A01;
            if (f2 != null) {
                f2.floatValue();
            }
            Object obj3 = A002.A0F;
            Object obj4 = A002.A09;
            AnonymousClass0LM r04 = r3.A02;
            r04.A01 = obj3;
            r04.A00 = obj4;
            number2 = (Number) r3.A00(r04);
        }
        PointF pointF = this.A03;
        if (number == null) {
            floatValue = this.A02.x;
        } else {
            floatValue = number.floatValue();
        }
        pointF.set(floatValue, 0.0f);
        float f3 = pointF.x;
        if (number2 == null) {
            floatValue2 = this.A02.y;
        } else {
            floatValue2 = number2.floatValue();
        }
        pointF.set(f3, floatValue2);
        return pointF;
    }

    public AnonymousClass0BY(C04850Qx r2, C04850Qx r3) {
        super(Collections.emptyList());
        this.A04 = r2;
        this.A05 = r3;
        A0E(this.A02);
    }

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r2, float f) {
        return A0A();
    }
}
