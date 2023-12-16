package X;

import java.util.List;

/* renamed from: X.7b1  reason: invalid class name and case insensitive filesystem */
public final class C153307b1 {
    public int A00;
    public AnonymousClass6T2 A01 = new AnonymousClass6T2((String) null, (String) null, (String) null, (List) null, false, true, false);
    public C127576Sm A02;
    public C127636Ss A03;
    public C127456Sa A04 = new C127456Sa(false);
    public String A05;
    public boolean A06;

    public AnonymousClass6T3 A00() {
        C127456Sa r4 = this.A04;
        AnonymousClass6T2 r1 = this.A01;
        String str = this.A05;
        boolean z = this.A06;
        int i = this.A00;
        return new AnonymousClass6T3(r1, this.A02, this.A03, r4, str, i, z);
    }

    public void A04(boolean z) {
        this.A06 = z;
    }

    public C153307b1() {
        new AnonymousClass7VE().A00 = false;
        C152897aL r0 = new C152897aL();
        r0.A01 = false;
        this.A03 = r0.A00();
        AnonymousClass7Xw r02 = new AnonymousClass7Xw();
        r02.A01 = false;
        this.A02 = r02.A00();
    }

    public void A01(C127576Sm r1) {
        C162177rO.A02(r1);
        this.A02 = r1;
    }

    @Deprecated
    public void A02(C127636Ss r1) {
        C162177rO.A02(r1);
        this.A03 = r1;
    }

    public void A03(C127456Sa r1) {
        C162177rO.A02(r1);
        this.A04 = r1;
    }
}
