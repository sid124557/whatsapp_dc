package X;

import java.util.List;

/* renamed from: X.0Be  reason: invalid class name and case insensitive filesystem */
public class C01520Be extends AnonymousClass0BW {
    public int A0G(C06230Wt r6, float f) {
        Object obj;
        Number number;
        Object obj2 = r6.A0F;
        if (obj2 == null || (obj = r6.A09) == null) {
            throw AnonymousClass001.A0e("Missing values for keyframe.");
        }
        Number number2 = (Number) obj2;
        int intValue = number2.intValue();
        Number number3 = (Number) obj;
        int intValue2 = number3.intValue();
        C05560Tz r0 = this.A03;
        if (r0 == null || (number = (Number) AnonymousClass0BW.A01(this, r6, r0, number2, number3)) == null) {
            return AnonymousClass0VB.A02(AnonymousClass001.A01(1.0f, f, 0.0f), intValue, intValue2);
        }
        return number.intValue();
    }

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r2, float f) {
        return Integer.valueOf(A0G(r2, f));
    }

    public C01520Be(List list) {
        super(list);
    }
}
