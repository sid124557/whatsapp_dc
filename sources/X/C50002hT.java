package X;

/* renamed from: X.2hT  reason: invalid class name and case insensitive filesystem */
public class C50002hT {
    public boolean A00 = false;
    public boolean A01 = true;
    public final C69263Wi A02;
    public final AnonymousClass33p A03;
    public final C40372Fo A04;
    public final AnonymousClass1VX A05;

    public void A00() {
        this.A02.BkS(C69983Zk.A00(this, 16));
    }

    public C50002hT(C69263Wi r2, AnonymousClass33p r3, C40372Fo r4, AnonymousClass1VX r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public boolean A01() {
        A00();
        if (!this.A05.A0Y(C58422vE.A02, 1624)) {
            return true;
        }
        AnonymousClass33p r2 = this.A03;
        if (!AnonymousClass0x2.A0F(r2).contains("tos_2016_opt_out_state") || C18280x3.A1W(AnonymousClass0x2.A0F(r2), "tos_2016_opt_out_state")) {
            return false;
        }
        return true;
    }
}
