package X;

import java.util.List;

/* renamed from: X.0Bg  reason: invalid class name and case insensitive filesystem */
public class C01540Bg extends AnonymousClass0BW {
    public float A0H(C06230Wt r6, float f) {
        Object obj;
        Number number;
        Object obj2 = r6.A0F;
        if (obj2 == null || (obj = r6.A09) == null) {
            throw AnonymousClass001.A0e("Missing values for keyframe.");
        }
        C05560Tz r0 = this.A03;
        if (r0 != null && (number = (Number) AnonymousClass0BW.A01(this, r6, r0, obj2, obj)) != null) {
            return number.floatValue();
        }
        float f2 = r6.A03;
        if (f2 == -3987645.8f) {
            f2 = AnonymousClass001.A05(obj2);
            r6.A03 = f2;
        }
        float f3 = r6.A01;
        if (f3 == -3987645.8f) {
            f3 = AnonymousClass001.A05(r6.A09);
            r6.A01 = f3;
        }
        return AnonymousClass001.A00(f3, f2, f);
    }

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r2, float f) {
        return Float.valueOf(A0H(r2, f));
    }

    public float A0G() {
        return A0H(AnonymousClass0K1.A00(this), A08());
    }

    public C01540Bg(List list) {
        super(list);
    }
}
