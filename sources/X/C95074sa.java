package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sa  reason: invalid class name and case insensitive filesystem */
public final class C95074sa extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public C95074sa() {
        super(3734, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A0A);
        r3.Blb(9, this.A0B);
        r3.Blb(10, this.A05);
        r3.Blb(4, this.A06);
        r3.Blb(14, this.A07);
        r3.Blb(5, this.A08);
        r3.Blb(12, this.A03);
        r3.Blb(13, this.A0C);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A09);
        r3.Blb(8, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0Q(C18270x1.A0G(C18270x1.A0M(C18270x1.A0L(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A0A, A0r), this.A0B, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0P(12, this.A03, A0r), this.A0C, A0r), this.A04, A0r), this.A09, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBizSearchConsumerEvents {");
        C57292tP.A00(A0o, "bizSearchConsumerEventType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "bizSearchSessionEntrypoint", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "bizSearchSessionid", this.A0A);
        C57292tP.A00(A0o, "category", this.A0B);
        C57292tP.A00(A0o, "categoryRank", this.A05);
        C57292tP.A00(A0o, "cntBusinesses", this.A06);
        C57292tP.A00(A0o, "cntCategories", this.A07);
        C57292tP.A00(A0o, "cntObaBusinesses", this.A08);
        C57292tP.A00(A0o, "eventSource", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "listOfModules", this.A0C);
        C57292tP.A00(A0o, "resultImpressionSource", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "resultRank", this.A09);
        return AnonymousClass3ZG.A0G(this.A00, "wasClicked", A0o);
    }
}
