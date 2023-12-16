package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sS  reason: invalid class name and case insensitive filesystem */
public final class C95004sS extends AnonymousClass3ZG {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public C95004sS() {
        super(3634, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(10, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A00);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(5, this.A08);
        r3.Blb(6, this.A02);
        r3.Blb(12, this.A09);
        r3.Blb(7, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0F(C18270x1.A0E(C18270x1.A0M(AnonymousClass001.A0f(), this.A01, A0r), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A05, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0J(C18270x1.A0O(C18270x1.A0I(C18270x1.A0H(C18300x5.A0Z(), this.A07, A0r), this.A08, A0r), this.A02, A0r), this.A09, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDirectorySearchRanking {");
        C57292tP.A00(A0o, "actionOnBusiness", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "actionOrd", this.A03);
        C57292tP.A00(A0o, "businessRankingPosition", this.A04);
        C57292tP.A00(A0o, "finalRankingScore", this.A00);
        C57292tP.A00(A0o, "nextBizRankingResultId", this.A05);
        C57292tP.A00(A0o, "prevBizRankingResultId", this.A06);
        C57292tP.A00(A0o, "queryId", this.A07);
        C57292tP.A00(A0o, "rankingResultId", this.A08);
        C57292tP.A00(A0o, "searchEndpoint", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "searchId", this.A09);
        return AnonymousClass3ZG.A0G(this.A0A, "searchSessionId", A0o);
    }
}
