package X;

/* renamed from: X.2Yl  reason: invalid class name and case insensitive filesystem */
public class C45042Yl {
    public final AnonymousClass2DO A00;
    public final AnonymousClass4C1 A01;

    public AnonymousClass4DW A00(C31901p2 r5) {
        AnonymousClass39N r3 = r5.A00;
        if (r3 == null) {
            return null;
        }
        int i = r3.A05;
        if (i == 1) {
            return (AnonymousClass4DW) this.A01.get();
        }
        if (i == 2) {
            return new C32031pS(this.A00.A00.A01.AnC(), r3);
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Interactive response message does not support customizations: ", AnonymousClass001.A0o(), i));
    }

    public C45042Yl(AnonymousClass2DO r1, AnonymousClass4C1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
