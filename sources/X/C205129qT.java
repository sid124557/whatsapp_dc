package X;

/* renamed from: X.9qT  reason: invalid class name and case insensitive filesystem */
public class C205129qT implements C202589mG {
    public Object A00;
    public Object A01;
    public final int A02;

    public C205129qT(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BaJ(AnonymousClass34V r5) {
        AnonymousClass4FS r1;
        Runnable r0;
        int i = this.A02;
        C1902094n r3 = (C1902094n) this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass99L r2 = (AnonymousClass99L) obj;
            if (r5 == null) {
                r1 = r3.A0M;
                r0 = new C200559iW(r2, r3);
            }
            C1902094n.A00(r5, r3);
            return;
        }
        C624034w r22 = (C624034w) obj;
        if (r5 != null) {
            AnonymousClass9OX.A01(r3.A01);
            C1902094n.A00(r5, r3);
            return;
        }
        AnonymousClass99L r12 = (AnonymousClass99L) r22.A0A;
        C626936e.A06(r12);
        C626936e.A06(r12.A0G);
        C195109Vz r13 = r12.A0G.A0C;
        r13.A08 = "ACCEPT";
        r13.A09 = "PENDING";
        r1 = r3.A0M;
        r0 = new C200579iY(r22, r3);
        r1.BkM(r0);
    }
}
