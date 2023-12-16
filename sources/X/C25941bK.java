package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bK  reason: invalid class name and case insensitive filesystem */
public final class C25941bK extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A09);
        r3.Blb(12, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(13, this.A00);
        r3.Blb(14, this.A01);
        r3.Blb(15, this.A02);
        r3.Blb(11, this.A0A);
        r3.Blb(20, this.A0C);
        r3.Blb(5, this.A06);
        r3.Blb(6, this.A07);
        r3.Blb(16, this.A0D);
        r3.Blb(21, this.A0B);
        r3.Blb(7, this.A08);
        r3.Blb(22, this.A0E);
        r3.Blb(8, this.A0F);
        r3.Blb(18, this.A0G);
        r3.Blb(17, this.A0H);
        r3.Blb(9, this.A0I);
    }

    public C25941bK() {
        super(3468, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A09);
        AnonymousClass3ZG.A0I(A0r, 19);
        A0r.put(C18270x1.A0L(AnonymousClass0x2.A0P(AnonymousClass0x2.A0Q(C18270x1.A0K(AnonymousClass3ZG.A08(C18270x1.A0J(AnonymousClass3ZG.A07(AnonymousClass0x2.A0O(C18270x1.A0I(C18270x1.A0H(AnonymousClass3ZG.A06(C18270x1.A0N(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0F(C18270x1.A0E(12, this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A0A, A0r), this.A0C, A0r), this.A06, A0r), this.A07, A0r), this.A0D, A0r), this.A0B, A0r), this.A08, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A0I);
        AnonymousClass3ZG.A0I(A0r, 10);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamOtpRetriever {");
        C57292tP.A00(A0o, "businessPhoneNumber", this.A09);
        C57292tP.A00(A0o, "chatsFolderType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "ctaFallbackReason", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "ctaType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "isKeepChatsArchivedEnabled", this.A00);
        C57292tP.A00(A0o, "isMessageNotificationEnabled", this.A01);
        C57292tP.A00(A0o, "isNotificationEnabled", this.A02);
        C57292tP.A00(A0o, "messageReceivedElapsedTimeSeconds", this.A0A);
        C57292tP.A00(A0o, "otpCorrelationId", this.A0C);
        C57292tP.A00(A0o, "otpEventSource", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "otpEventType", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "otpFailureReason", this.A0D);
        C57292tP.A00(A0o, "otpHandshakeElapsedTimeMs", this.A0B);
        C57292tP.A00(A0o, "otpProductType", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "otpSdkVersion", this.A0E);
        C57292tP.A00(A0o, "otpSessionId", this.A0F);
        C57292tP.A00(A0o, "receiverCountryCode", this.A0G);
        C57292tP.A00(A0o, "templateId", this.A0H);
        return AnonymousClass3ZG.A0G(this.A0I, "thirdPartyPackageNameFromIntent", A0o);
    }
}
