package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bM  reason: invalid class name and case insensitive filesystem */
public final class C25961bM extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public C25961bM() {
        super(4112, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(4, this.A09);
        r3.Blb(5, this.A0A);
        r3.Blb(19, this.A03);
        r3.Blb(20, this.A0B);
        r3.Blb(21, this.A0C);
        r3.Blb(6, this.A0D);
        r3.Blb(17, this.A00);
        r3.Blb(7, this.A05);
        r3.Blb(18, this.A0E);
        r3.Blb(8, this.A0F);
        r3.Blb(9, this.A0G);
        r3.Blb(10, this.A0H);
        r3.Blb(23, this.A04);
        r3.Blb(11, this.A0I);
        r3.Blb(16, this.A0J);
        r3.Blb(13, this.A01);
        r3.Blb(14, this.A0K);
        r3.Blb(15, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 22);
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 24);
        A0r.put(C18270x1.A0N(AnonymousClass3ZG.A09(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(AnonymousClass0x2.A0Q(C18270x1.A0J(AnonymousClass0x2.A0P(C18270x1.A0I(AnonymousClass3ZG.A07(AnonymousClass3ZG.A06(AnonymousClass3ZG.A05(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A03, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A00, A0r), this.A05, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A04, A0r), this.A0I);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(16, this.A0J, A0r), this.A01, A0r), this.A0K, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamExtensionScreenProgress {");
        C57292tP.A00(A0o, "bizPlatform", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "businessOwnerJid", this.A07);
        C162457s7.A0J("clickSequenceNumber", 1);
        C57292tP.A00(A0o, "embeddedError", this.A08);
        C57292tP.A00(A0o, "embeddedFlow", this.A09);
        C57292tP.A00(A0o, "embeddedFlowType", this.A0A);
        C57292tP.A00(A0o, "entryPointConversationInitiated", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "entryPointConversionApp", this.A0B);
        C57292tP.A00(A0o, "entryPointConversionSource", this.A0C);
        C57292tP.A00(A0o, "extensionCategory", this.A0D);
        C57292tP.A00(A0o, "extensionRestoredFromCache", this.A00);
        C57292tP.A00(A0o, "extensionScreenLength", this.A05);
        C57292tP.A00(A0o, "extensionStatus", this.A0E);
        C57292tP.A00(A0o, "extensionsFlowId", this.A0F);
        C57292tP.A00(A0o, "extensionsMessageId", this.A0G);
        C57292tP.A00(A0o, "extensionsSessionId", this.A0H);
        C57292tP.A00(A0o, "flowEntryPoint", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "flowStatusExit", this.A0I);
        C57292tP.A00(A0o, "hsmTag", this.A0J);
        C57292tP.A00(A0o, "isTemplate", this.A01);
        C57292tP.A00(A0o, "screenProgress", this.A0K);
        return AnonymousClass3ZG.A0G(this.A06, "sequenceNumber", A0o);
    }
}
