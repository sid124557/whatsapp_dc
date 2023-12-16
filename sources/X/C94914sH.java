package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sH  reason: invalid class name and case insensitive filesystem */
public final class C94914sH extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A07);
        r3.Blb(5, this.A00);
        r3.Blb(4, this.A02);
        r3.Blb(3, this.A01);
        r3.Blb(7, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(1, this.A05);
        r3.Blb(2, this.A06);
    }

    public C94914sH() {
        super(1656, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0I(C18270x1.A0J(C18270x1.A0F(C18270x1.A0G(C18270x1.A0H(C18310x6.A0e(), this.A07, A0r), this.A00, A0r), this.A02, A0r), this.A01, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusRowView {");
        C57292tP.A00(A0o, "psaCampaigns", this.A07);
        C57292tP.A00(A0o, "statusRowEntryMethod", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "statusRowIndex", this.A02);
        C57292tP.A00(A0o, "statusRowSection", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "statusRowUnreadItemCount", this.A03);
        C57292tP.A00(A0o, "statusRowViewCount", this.A04);
        C57292tP.A00(A0o, "statusSessionId", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "statusViewerSessionId", A0o);
    }
}
