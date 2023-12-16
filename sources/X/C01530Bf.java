package X;

import java.util.List;

/* renamed from: X.0Bf  reason: invalid class name and case insensitive filesystem */
public class C01530Bf extends AnonymousClass0BW {
    public int A0G(C06230Wt r5, float f) {
        Object obj;
        Number number;
        Object obj2 = r5.A0F;
        if (obj2 == null || (obj = r5.A09) == null) {
            throw AnonymousClass001.A0e("Missing values for keyframe.");
        }
        C05560Tz r0 = this.A03;
        if (r0 != null && (number = (Number) AnonymousClass0BW.A01(this, r5, r0, obj2, obj)) != null) {
            return number.intValue();
        }
        int i = r5.A05;
        if (i == 784923401) {
            i = AnonymousClass001.A0K(obj2);
            r5.A05 = i;
        }
        int i2 = r5.A04;
        if (i2 == 784923401) {
            i2 = AnonymousClass001.A0K(r5.A09);
            r5.A04 = i2;
        }
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r2, float f) {
        return Integer.valueOf(A0G(r2, f));
    }

    public C01530Bf(List list) {
        super(list);
    }
}
