package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ar  reason: invalid class name and case insensitive filesystem */
public final class C25651ar extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A00);
        r3.Blb(10, this.A01);
        r3.Blb(8, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A08);
        r3.Blb(4, this.A09);
        r3.Blb(5, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(1, this.A06);
        r3.Blb(2, this.A07);
    }

    public C25651ar() {
        super(2978, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0F(C18270x1.A0H(C18270x1.A0G(C18270x1.A0J(C18270x1.A0I(C18270x1.A0K(C18270x1.A0M(C18300x5.A0Y(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A08, A0r), this.A09, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusMute {");
        C57292tP.A00(A0o, "isPosterBiz", this.A00);
        C57292tP.A00(A0o, "isPosterInAddressBook", this.A01);
        C57292tP.A00(A0o, "muteAction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "muteOrigin", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "psaCampaignId", this.A08);
        C57292tP.A00(A0o, "psaCampaignIds", this.A09);
        C57292tP.A00(A0o, "psaCampaignItemIndex", this.A04);
        C57292tP.A00(A0o, "statusItemIndex", this.A05);
        C57292tP.A00(A0o, "statusSessionId", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "statusViewerSessionId", A0o);
    }
}
