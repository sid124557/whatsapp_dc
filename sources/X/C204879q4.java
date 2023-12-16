package X;

import java.io.File;

/* renamed from: X.9q4  reason: invalid class name and case insensitive filesystem */
public class C204879q4 implements C203069n4 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C204879q4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj;
    }

    public void BZ3(AnonymousClass34V r4) {
        if (this.A04 != 0) {
            ((C194179Rw) this.A00).A02.A08.execute(new C199019fr((C193719Ps) this.A01));
            return;
        }
        C196039aC r1 = (C196039aC) this.A01;
        Integer num = (Integer) this.A03;
        r1.BKG(r4, num);
        r1.BS7(r4, num);
    }

    public void BZ4(C67993Rl r5) {
        if (this.A04 != 0) {
            C633138t r1 = (C633138t) this.A03;
            ((C194179Rw) this.A00).A00(r5, (C193719Ps) this.A01, r1, (File) this.A02);
            return;
        }
        C196039aC r3 = (C196039aC) this.A01;
        r3.BKH((Integer) this.A03);
        ((AnonymousClass9VE) this.A00).A01((AnonymousClass0QU) this.A02, r3, new C193849Qh(r5));
    }
}
