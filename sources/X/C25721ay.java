package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ay  reason: invalid class name and case insensitive filesystem */
public final class C25721ay extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A00);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(9, this.A0A);
        r3.Blb(2, this.A04);
        r3.Blb(1, this.A05);
        r3.Blb(5, this.A06);
        r3.Blb(4, this.A07);
        r3.Blb(8, this.A0B);
        r3.Blb(12, this.A08);
        r3.Blb(3, this.A03);
        r3.Blb(11, this.A09);
    }

    public C25721ay() {
        super(2636, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0F(C18270x1.A0O(C18270x1.A0K(C18270x1.A0G(C18270x1.A0H(C18270x1.A0D(C18270x1.A0E(C18270x1.A0L(C18270x1.A0J(C18270x1.A0I(AnonymousClass0x7.A0h(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A0A, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A0B, A0r), this.A08, A0r), this.A03, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAckKickReceived {");
        C57292tP.A00(A0o, "callStanzaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A01));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A02), A0o);
        C57292tP.A00(A0o, "notificationStanzaType", this.A0A);
        C57292tP.A00(A0o, "numOfflineStanzasProcessing", this.A04);
        C57292tP.A00(A0o, "numStanzasProcessing", this.A05);
        C57292tP.A00(A0o, "numStanzasProcessingForType", this.A06);
        C57292tP.A00(A0o, "numStanzasWithSameId", this.A07);
        C57292tP.A00(A0o, "receiptStanzaType", this.A0B);
        C57292tP.A00(A0o, "stanzaOfflineCount", this.A08);
        C57292tP.A00(A0o, "stanzaType", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A09, "timeToAckKickInMs", A0o);
    }
}
