package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iS  reason: invalid class name and case insensitive filesystem */
public final class C134106iS extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A05);
        r3.Blb(1, this.A06);
        r3.Blb(10, this.A02);
        r3.Blb(2, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(11, this.A0B);
        r3.Blb(12, this.A00);
        r3.Blb(13, this.A01);
        r3.Blb(14, this.A09);
        r3.Blb(8, this.A0A);
        r3.Blb(3, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(4, this.A0C);
    }

    public C134106iS() {
        super(3772, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0I(C18270x1.A0E(C18270x1.A0M(C18270x1.A0D(AnonymousClass0x7.A0g(), this.A05, A0r), this.A06, A0r), this.A02, A0r), this.A07, A0r), this.A08, A0r), this.A0B, A0r), this.A00, A0r), this.A01, A0r), this.A09, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 15);
        A0r.put(C18290x4.A0a(), this.A03);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0G(C18290x4.A0c(), this.A04, A0r), this.A0C);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessTemplateMessageUserAction {");
        C57292tP.A00(A0o, "businessMessageSentTs", this.A05);
        C57292tP.A00(A0o, "businessPhoneNumber", this.A06);
        C57292tP.A00(A0o, "contactType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "deltaTime", this.A07);
        C57292tP.A00(A0o, "deltaTimeReceived", this.A08);
        C57292tP.A00(A0o, "hsmTagStr", this.A0B);
        C57292tP.A00(A0o, "isFromAdsManagerMm", this.A00);
        C57292tP.A00(A0o, "isFromCapi", this.A01);
        C57292tP.A00(A0o, "lastOutgoingTs", this.A09);
        C57292tP.A00(A0o, "messageDeliveredTs", this.A0A);
        C57292tP.A00(A0o, "messageLevelAction", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "qbmFlag", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A0C, "templateId", A0o);
    }
}
