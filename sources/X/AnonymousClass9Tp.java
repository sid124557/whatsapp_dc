package X;

/* renamed from: X.9Tp  reason: invalid class name */
public class AnonymousClass9Tp {
    public final C116985rC A00;
    public final C111095hX A01;
    public final C66663Mh A02;
    public final C56422rx A03;
    public final AnonymousClass1VX A04;

    public void A00() {
        this.A04.A0X(1107);
    }

    public void A01() {
        this.A00.A04();
        throw AnonymousClass001.A0g("getCreateOrderActivity");
    }

    public void A02() {
        this.A00.A04();
        throw AnonymousClass001.A0g("getOrderDetailsActivity");
    }

    public void A04(AnonymousClass4FV r3) {
        if (this.A04.A0X(1345)) {
            C94454rM r1 = new C94454rM();
            r1.A00 = C18290x4.A0c();
            r1.A01 = "order_details_creation";
            r1.A02 = "merchant_initiated";
            r3.BhD(r1);
        }
    }

    public boolean A05() {
        return this.A04.A0X(4893);
    }

    public boolean A06() {
        return this.A04.A0X(1107);
    }

    public AnonymousClass9Tp(C116985rC r1, C111095hX r2, C66663Mh r3, C56422rx r4, AnonymousClass1VX r5) {
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void A03(C56972sr r2) {
        if (C56972sr.A04(r2) != null) {
            this.A00.A04();
            r2.A0P();
            throw AnonymousClass001.A0g("getCreateOrderActivity");
        }
    }
}
