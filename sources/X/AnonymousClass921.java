package X;

import java.util.Map;

/* renamed from: X.921  reason: invalid class name */
public class AnonymousClass921 implements C15630rg {
    public Object A00;
    public final int A01;

    public final Object apply(Object obj) {
        String str;
        Object obj2 = obj;
        int i = this.A01;
        Object obj3 = this.A00;
        switch (i) {
            case 0:
                C106025Xi r2 = (C106025Xi) obj2;
                boolean z = r2.A07;
                int i2 = r2.A00;
                int i3 = r2.A01;
                AnonymousClass5TN r0 = ((AnonymousClass4VH) obj3).A01;
                return new C152567Zj(i2, i3, z, r0.A06, r0.A09, r0.A0A);
            case 1:
                AnonymousClass4UA r02 = (AnonymousClass4UA) obj3;
                C66513Ls r22 = (C66513Ls) obj2;
                if (r22 == null || (str = r22.A0Z) == null || !str.equals(r02.A07)) {
                    return null;
                }
                return r22;
            default:
                return ((Map) obj2).get(obj3);
        }
    }

    public AnonymousClass921(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
