package X;

import java.util.Collection;

/* renamed from: X.2AD  reason: invalid class name */
public final class AnonymousClass2AD {
    public static final Object A00(Collection collection, C84814Du r9) {
        if (collection.isEmpty()) {
            return C72023d3.A00;
        }
        C58532vP r8 = new C58532vP((C85464Gi[]) collection.toArray(new C85464Gi[0]));
        AnonymousClass46G A03 = C57702u4.A03(r9);
        C85464Gi[] r6 = r8.A00;
        int length = r6.length;
        C830846b[] r4 = new C830846b[length];
        for (int i = 0; i < length; i++) {
            C85464Gi r0 = r6[i];
            r0.BpV();
            C830846b r1 = new C830846b(r8, A03);
            r1.A00 = r0.BGv(r1);
            r4[i] = r1;
        }
        AnonymousClass465 r2 = new AnonymousClass465(r8, r4);
        for (int i2 = 0; i2 < length; i2++) {
            C830846b.A03.set(r4[i2], r2);
        }
        if (!(AnonymousClass46G.A04.get(A03) instanceof C834548l)) {
            r2.A01();
        } else {
            A03.BGs(r2);
        }
        return A03.A06();
    }
}
