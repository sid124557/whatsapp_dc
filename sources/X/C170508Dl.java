package X;

import java.util.List;

/* renamed from: X.8Dl  reason: invalid class name and case insensitive filesystem */
public abstract class C170508Dl implements C181488mq {
    public void A00(Number number) {
        if (this instanceof C131526dj) {
            C131526dj r4 = (C131526dj) this;
            r4.A00 = Double.valueOf(r4.A00.doubleValue() + number.doubleValue());
        } else if (this instanceof C131546dl) {
            C131546dl r6 = (C131546dl) this;
            r6.A01 = Double.valueOf(r6.A01.doubleValue() + number.doubleValue());
            r6.A02 = Double.valueOf(r6.A02.doubleValue() + (number.doubleValue() * number.doubleValue()));
            r6.A00 = Double.valueOf(r6.A00.doubleValue() + 1.0d);
        } else if (this instanceof C131516di) {
            C131516di r5 = (C131516di) this;
            if (r5.A00.doubleValue() > number.doubleValue()) {
                r5.A00 = Double.valueOf(number.doubleValue());
            }
        } else if (this instanceof C131506dh) {
            C131506dh r52 = (C131506dh) this;
            if (r52.A00.doubleValue() < number.doubleValue()) {
                r52.A00 = Double.valueOf(number.doubleValue());
            }
        } else {
            C131536dk r42 = (C131536dk) this;
            r42.A00 = Double.valueOf(r42.A00.doubleValue() + 1.0d);
            r42.A01 = Double.valueOf(r42.A01.doubleValue() + number.doubleValue());
        }
    }

    public Object BGp(C172478Lh r8, C158627kI r9, Object obj, String str, List list) {
        C187038wL r1 = r9.A01.A00;
        int i = 0;
        if (obj instanceof List) {
            for (Object next : r1.Bqo(obj)) {
                if (next instanceof Number) {
                    i++;
                    A00((Number) next);
                }
            }
        }
        if (list != null) {
            for (Number A00 : C161297pO.A00(r9, Number.class, list)) {
                i++;
                A00(A00);
            }
        }
        if (i != 0) {
            if (this instanceof C131526dj) {
                return ((C131526dj) this).A00;
            }
            if (this instanceof C131546dl) {
                C131546dl r6 = (C131546dl) this;
                double doubleValue = r6.A02.doubleValue();
                double doubleValue2 = r6.A00.doubleValue();
                double doubleValue3 = r6.A01.doubleValue();
                return Double.valueOf(Math.sqrt((doubleValue / doubleValue2) - (((doubleValue3 * doubleValue3) / doubleValue2) / doubleValue2)));
            } else if (this instanceof C131516di) {
                return ((C131516di) this).A00;
            } else {
                if (this instanceof C131506dh) {
                    return ((C131506dh) this).A00;
                }
                C131536dk r62 = (C131536dk) this;
                double doubleValue4 = r62.A00.doubleValue();
                if (doubleValue4 != 0.0d) {
                    return Double.valueOf(r62.A01.doubleValue() / doubleValue4);
                }
                return Double.valueOf(0.0d);
            }
        } else {
            throw new C173678Re("Aggregation function attempted to calculate value using empty array");
        }
    }
}
