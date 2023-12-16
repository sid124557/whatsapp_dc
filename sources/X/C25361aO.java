package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aO  reason: invalid class name and case insensitive filesystem */
public final class C25361aO extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;

    public C25361aO() {
        super(3582, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(4, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(10, this.A01);
        r3.Blb(9, this.A07);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0L(C18270x1.A0M(C18270x1.A0K(C18270x1.A0G(C18280x3.A0S(), this.A00, A0r), this.A05, A0r), this.A06, A0r), this.A01, A0r), this.A07, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatPsaRemove {");
        C57292tP.A00(A0o, "lastReceivedMediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "lastReceivedMessageTs", this.A05);
        C57292tP.A00(A0o, "lastReceivedMsgId", this.A06);
        C57292tP.A00(A0o, "psaBlockReason", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "psaCampaignId", this.A07);
        C57292tP.A00(A0o, "psaMessageRemoveAction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "psaMessageRemoveEntryPoint", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "waOfficialAccountName", A0o);
    }
}
