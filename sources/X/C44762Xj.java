package X;

/* renamed from: X.2Xj  reason: invalid class name and case insensitive filesystem */
public class C44762Xj {
    public final C66663Mh A00;
    public final AnonymousClass1VX A01;

    public long A00(C59732xO r6, int i, boolean z) {
        int A03;
        Integer num;
        Integer num2;
        int intValue;
        int A032;
        Integer num3;
        if (i != 2) {
            if (r6 == null || (num3 = r6.A00) == null) {
                intValue = this.A00.A03(C66663Mh.A1I);
            } else {
                intValue = num3.intValue();
            }
            A032 = this.A01.A0O(C58422vE.A02, 2266);
        } else if (r6 == null || (num2 = r6.A02) == null || (intValue = num2.intValue()) <= 0) {
            AnonymousClass1VX r4 = this.A01;
            C58422vE r3 = C58422vE.A02;
            int A0O = r4.A0O(r3, 2645);
            if (z || r6 == null || (num = r6.A03) == null || A0O == -1 || num.intValue() <= A0O) {
                A03 = this.A00.A03(C66663Mh.A1L);
            } else {
                A03 = r4.A0O(r3, 2646);
            }
            return (long) A03;
        } else {
            A032 = this.A00.A03(C66663Mh.A1L);
        }
        A03 = Math.min(intValue, A032);
        return (long) A03;
    }

    public C44762Xj(C66663Mh r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
