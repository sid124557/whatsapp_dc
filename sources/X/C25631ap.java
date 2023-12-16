package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ap  reason: invalid class name and case insensitive filesystem */
public final class C25631ap extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public C25631ap() {
        super(2494, AnonymousClass0x9.A0T(1, 1000, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(3, this.A04);
        r3.Blb(10, this.A07);
        r3.Blb(1, this.A08);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(2, this.A09);
        r3.Blb(8, this.A03);
        r3.Blb(9, this.A05);
        r3.Blb(4, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0L(C18270x1.A0K(C18270x1.A0E(C18270x1.A0J(C18270x1.A0I(C18270x1.A0D(C18270x1.A0M(C18270x1.A0F(C18290x4.A0c(), this.A00, A0r), this.A04, A0r), this.A07, A0r), this.A08, A0r), this.A01, A0r), this.A02, A0r), this.A09, A0r), this.A03, A0r), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageStanzaReceive {");
        C57292tP.A00(A0o, "hasSenderKeyDistributionMessage", this.A00);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "messageStanzaDecryptQueueSize", this.A07);
        C57292tP.A00(A0o, "messageStanzaDuration", this.A08);
        C57292tP.A00(A0o, "messageStanzaE2eSuccess", this.A01);
        C57292tP.A00(A0o, "messageStanzaIsEphemeral", this.A02);
        C57292tP.A00(A0o, "messageStanzaOfflineCount", this.A09);
        C57292tP.A00(A0o, "messageStanzaRevoke", this.A03);
        C57292tP.A00(A0o, "messageStanzaStage", C18270x1.A0T(this.A05));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A06), "messageType", A0o);
    }
}
