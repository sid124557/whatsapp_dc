package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sl  reason: invalid class name and case insensitive filesystem */
public final class C95184sl extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;

    public C95184sl() {
        super(3006, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(14, this.A04);
        r3.Blb(13, this.A00);
        r3.Blb(2, this.A05);
        r3.Blb(11, this.A01);
        r3.Blb(10, this.A0B);
        r3.Blb(3, this.A0C);
        r3.Blb(1, this.A06);
        r3.Blb(15, this.A0D);
        r3.Blb(16, this.A0E);
        r3.Blb(12, this.A07);
        r3.Blb(22, this.A08);
        r3.Blb(20, this.A0F);
        r3.Blb(21, this.A0G);
        r3.Blb(23, this.A02);
        r3.Blb(5, this.A03);
        r3.Blb(4, this.A0H);
        r3.Blb(9, this.A0I);
        r3.Blb(17, this.A0J);
        r3.Blb(6, this.A09);
        r3.Blb(18, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0P(C18320x8.A0W(), this.A04, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 19);
        A0r.put(C18270x1.A0M(C18270x1.A0N(C18280x3.A0S(), this.A05, A0r), this.A01, A0r), this.A0B);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(AnonymousClass3ZG.A09(C86634Kw.A0u(C86634Kw.A0t(AnonymousClass3ZG.A08(C18270x1.A0O(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0D(C18290x4.A0a(), this.A0C, A0r), this.A06, A0r), this.A0D, A0r), this.A0E, A0r), this.A07, A0r), this.A08, A0r), this.A0F, A0r), this.A0G, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(AnonymousClass0x2.A0Q(C18270x1.A0I(AnonymousClass0x2.A0P(C18270x1.A0L(C18270x1.A0G(C18290x4.A0c(), this.A03, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J, A0r), this.A09, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBizCatalogView {");
        C57292tP.A00(A0o, "bizPlatform", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "cartToggle", this.A00);
        C57292tP.A00(A0o, "catalogEntryPoint", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "catalogEventSampled", this.A01);
        C57292tP.A00(A0o, "catalogOwnerJid", this.A0B);
        C57292tP.A00(A0o, "catalogSessionId", this.A0C);
        C57292tP.A00(A0o, "catalogViewAction", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "collectionId", this.A0D);
        C57292tP.A00(A0o, "collectionIndex", this.A0E);
        C57292tP.A00(A0o, "deepLinkOpenFrom", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "entryPointConversationInitiated", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "entryPointConversionApp", this.A0F);
        C57292tP.A00(A0o, "entryPointConversionSource", this.A0G);
        C57292tP.A00(A0o, "hasVariants", this.A02);
        C57292tP.A00(A0o, "isOrderMsgAttached", this.A03);
        C57292tP.A00(A0o, "orderId", this.A0H);
        C57292tP.A00(A0o, "productId", this.A0I);
        C57292tP.A00(A0o, "productIndex", this.A0J);
        C57292tP.A00(A0o, "quantity", this.A09);
        return AnonymousClass3ZG.A0G(this.A0A, "sequenceNumber", A0o);
    }
}
