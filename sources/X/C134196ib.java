package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6ib  reason: invalid class name and case insensitive filesystem */
public final class C134196ib extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A04);
        r3.Blb(9, this.A05);
        r3.Blb(10, this.A0G);
        r3.Blb(12, this.A0A);
        r3.Blb(13, this.A0H);
        r3.Blb(1, this.A0B);
        r3.Blb(20, this.A06);
        r3.Blb(14, this.A0I);
        r3.Blb(2, this.A0C);
        r3.Blb(7, this.A0D);
        r3.Blb(15, this.A00);
        r3.Blb(21, this.A0J);
        r3.Blb(25, this.A01);
        r3.Blb(26, this.A02);
        r3.Blb(16, this.A03);
        r3.Blb(23, this.A0E);
        r3.Blb(17, this.A0F);
        r3.Blb(6, this.A07);
        r3.Blb(3, this.A0K);
        r3.Blb(19, this.A0L);
        r3.Blb(4, this.A08);
        r3.Blb(5, this.A09);
    }

    public C134196ib() {
        super(3770, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 22);
        A0r.put(C18270x1.A0M(C18270x1.A0L(8, this.A04, A0r), this.A05, A0r), this.A0G);
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(C18290x4.A0f(C86634Kw.A0u(AnonymousClass0x2.A0N(C18270x1.A0J(C18270x1.A0E(C18270x1.A0Q(C86634Kw.A0t(C18270x1.A0D(C18270x1.A0P(12, this.A0A, A0r), this.A0H, A0r), this.A0B, A0r), this.A06, A0r), this.A0I, A0r), this.A0C, A0r), this.A0D, A0r), this.A00, A0r), this.A0J, A0r), this.A01);
        A0r.put(AnonymousClass0x2.A0O(26, this.A02, A0r), this.A03);
        A0r.put(AnonymousClass0x2.A0P(23, this.A0E, A0r), this.A0F);
        AnonymousClass3ZG.A0I(A0r, 18);
        A0r.put(C18270x1.A0G(AnonymousClass6C8.A0a(C18270x1.A0F(C18290x4.A0d(), this.A07, A0r), this.A0K, A0r), this.A0L, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 24);
        A0r.put(C18290x4.A0c(), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessTemplateMessageThreadLevelUserAction {");
        C57292tP.A00(A0o, "blockEntryPoint", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "blockReason", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "businessMessageDeliveredTsList", this.A0G);
        C57292tP.A00(A0o, "businessMessageSentTs", this.A0A);
        C57292tP.A00(A0o, "businessMessageSentTsList", this.A0H);
        C57292tP.A00(A0o, "businessPhoneNumber", this.A0B);
        C57292tP.A00(A0o, "contactType", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "customBlockReasonStr", this.A0I);
        C57292tP.A00(A0o, "deltaTime", this.A0C);
        C57292tP.A00(A0o, "deltaTimeReceived", this.A0D);
        C57292tP.A00(A0o, "didUserReply", this.A00);
        C57292tP.A00(A0o, "hsmTagStr", this.A0J);
        C57292tP.A00(A0o, "isFromAdsManagerMm", this.A01);
        C57292tP.A00(A0o, "isFromCapi", this.A02);
        C57292tP.A00(A0o, "isUnsubBlock", this.A03);
        C57292tP.A00(A0o, "lastOutgoingTs", this.A0E);
        C57292tP.A00(A0o, "messageDeliveredTs", this.A0F);
        C57292tP.A00(A0o, "qbmFlag", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "templateId", this.A0K);
        C57292tP.A00(A0o, "templateIdsList", this.A0L);
        C57292tP.A00(A0o, "threadActionEntryPoint", C18270x1.A0T(this.A08));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A09), "threadLevelAction", A0o);
    }
}
