package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iY  reason: invalid class name and case insensitive filesystem */
public final class C134166iY extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;
    public String A0F;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A07);
        r3.Blb(1, this.A08);
        r3.Blb(2, this.A03);
        r3.Blb(11, this.A04);
        r3.Blb(3, this.A09);
        r3.Blb(7, this.A0A);
        r3.Blb(12, this.A0E);
        r3.Blb(13, this.A00);
        r3.Blb(14, this.A01);
        r3.Blb(15, this.A0B);
        r3.Blb(9, this.A0C);
        r3.Blb(10, this.A0D);
        r3.Blb(6, this.A05);
        r3.Blb(16, this.A02);
        r3.Blb(4, this.A06);
        r3.Blb(5, this.A0F);
    }

    public C134166iY() {
        super(3766, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(AnonymousClass0x2.A0O(C18270x1.A0I(C18270x1.A0M(C18270x1.A0L(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0J(C18270x1.A0F(C18270x1.A0N(C18270x1.A0E(C18270x1.A0D(8, this.A07, A0r), this.A08, A0r), this.A03, A0r), this.A04, A0r), this.A09, A0r), this.A0A, A0r), this.A0E, A0r), this.A00, A0r), this.A01, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A05, A0r), this.A02, A0r), this.A06, A0r), this.A0F);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessTemplateMessageReadStats {");
        C57292tP.A00(A0o, "businessMessageSentTs", this.A07);
        C57292tP.A00(A0o, "businessPhoneNumber", this.A08);
        C57292tP.A00(A0o, "chatsFolderType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "contactType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "deltaTime", this.A09);
        C57292tP.A00(A0o, "deltaTimeReceived", this.A0A);
        C57292tP.A00(A0o, "hsmTagStr", this.A0E);
        C57292tP.A00(A0o, "isFromAdsManagerMm", this.A00);
        C57292tP.A00(A0o, "isFromCapi", this.A01);
        C57292tP.A00(A0o, "lastOutgoingTs", this.A0B);
        C57292tP.A00(A0o, "messageDeliveredTs", this.A0C);
        C57292tP.A00(A0o, "messageReadTs", this.A0D);
        C57292tP.A00(A0o, "qbmFlag", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "readReceiptsEnabled", this.A02);
        C57292tP.A00(A0o, "readSource", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(this.A0F, "templateId", A0o);
    }
}
