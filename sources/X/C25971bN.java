package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bN  reason: invalid class name and case insensitive filesystem */
public final class C25971bN extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
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
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public String A0K;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(23, this.A00);
        r3.Blb(25, this.A01);
        r3.Blb(4, this.A05);
        r3.Blb(17, this.A0K);
        r3.Blb(18, this.A0A);
        r3.Blb(19, this.A02);
        r3.Blb(22, this.A03);
        r3.Blb(14, this.A0B);
        r3.Blb(16, this.A0C);
        r3.Blb(7, this.A0D);
        r3.Blb(5, this.A0E);
        r3.Blb(8, this.A0F);
        r3.Blb(9, this.A04);
        r3.Blb(10, this.A0G);
        r3.Blb(3, this.A06);
        r3.Blb(6, this.A0H);
        r3.Blb(2, this.A0I);
        r3.Blb(11, this.A07);
        r3.Blb(1, this.A0J);
        r3.Blb(26, this.A08);
        r3.Blb(27, this.A09);
    }

    public C25971bN() {
        super(1658, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A0B(C18270x1.A0D(C18270x1.A0N(C18270x1.A0E(C18270x1.A0I(C18270x1.A0F(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0H(C18270x1.A0J(AnonymousClass0x2.A0O(C18270x1.A0Q(AnonymousClass3ZG.A06(AnonymousClass3ZG.A07(AnonymousClass3ZG.A08(AnonymousClass3ZG.A05(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(C18270x1.A0G(C18290x4.A0f(23, this.A00, A0r), this.A01, A0r), this.A05, A0r), this.A0K, A0r), this.A0A, A0r), this.A02, A0r), this.A03, A0r), (Object) null, A0r), (Object) null, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), this.A04, A0r), this.A0G, A0r), this.A06, A0r), this.A0H, A0r), this.A0I, A0r), this.A07, A0r), this.A0J, A0r), this.A08, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusItemView {");
        C57292tP.A00(A0o, "isPosterBiz", this.A00);
        C57292tP.A00(A0o, "isPosterInAddressBook", this.A01);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "psaCampaignId", this.A0K);
        C57292tP.A00(A0o, "psaCampaignItemIndex", this.A0A);
        C57292tP.A00(A0o, "psaLinkAvailable", this.A02);
        C57292tP.A00(A0o, "psaLinkClick", this.A03);
        C57292tP.A00(A0o, "statusItemImpressionCount", this.A0B);
        C57292tP.A00(A0o, "statusItemIndex", this.A0C);
        C57292tP.A00(A0o, "statusItemLength", this.A0D);
        C57292tP.A00(A0o, "statusItemLoadTime", this.A0E);
        C57292tP.A00(A0o, "statusItemReplied", this.A0F);
        C57292tP.A00(A0o, "statusItemUnread", this.A04);
        C57292tP.A00(A0o, "statusItemViewCount", this.A0G);
        C57292tP.A00(A0o, "statusItemViewResult", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "statusItemViewTime", this.A0H);
        C57292tP.A00(A0o, "statusRowIndex", this.A0I);
        C57292tP.A00(A0o, "statusRowSection", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "statusViewerSessionId", this.A0J);
        C57292tP.A00(A0o, "urlStatusClicked", C18270x1.A0T(this.A08));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A09), "urlStatusType", A0o);
    }
}
