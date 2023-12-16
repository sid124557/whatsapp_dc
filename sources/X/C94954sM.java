package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sM  reason: invalid class name and case insensitive filesystem */
public final class C94954sM extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C94954sM() {
        super(4928, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A07);
        r3.Blb(10, this.A08);
        r3.Blb(9, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0M(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A03, A0r), this.A01, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A02, A0r), this.A07, A0r), this.A08, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessSearchRanking {");
        C57292tP.A00(A0o, "actionOnSerp", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "actionOrder", this.A03);
        C57292tP.A00(A0o, "businessSearchFilterType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "businessSearchId", this.A04);
        C57292tP.A00(A0o, "businessSearchMetadata", this.A05);
        C57292tP.A00(A0o, "businessSearchQueryId", this.A06);
        C57292tP.A00(A0o, "businessSearchResultType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "businessSearchSessionId", this.A07);
        C57292tP.A00(A0o, "searchQuery", this.A08);
        return AnonymousClass3ZG.A0G(this.A09, "wabpId", A0o);
    }
}
