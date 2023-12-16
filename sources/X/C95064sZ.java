package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sZ  reason: invalid class name and case insensitive filesystem */
public final class C95064sZ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public C95064sZ() {
        super(1722, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(13, this.A00);
        r3.Blb(1, this.A02);
        r3.Blb(7, this.A03);
        r3.Blb(3, this.A06);
        r3.Blb(14, this.A07);
        r3.Blb(15, this.A08);
        r3.Blb(8, this.A04);
        r3.Blb(10, this.A01);
        r3.Blb(9, this.A09);
        r3.Blb(2, this.A0A);
        r3.Blb(16, this.A0B);
        r3.Blb(11, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(13, this.A00);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0F(C18270x1.A0J(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 18);
        A0r.put(C18270x1.A0K(AnonymousClass0x2.A0N(C18320x8.A0W(), this.A07, A0r), this.A08, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0L(AnonymousClass0x7.A0h(), this.A01, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18280x3.A0S(), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18270x1.A0N(16, this.A0B, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCatalogBiz {");
        C57292tP.A00(A0o, "cartToggle", this.A00);
        C57292tP.A00(A0o, "catalogBizAction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "catalogEntryPoint", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "catalogSessionId", this.A06);
        C57292tP.A00(A0o, "collectionId", this.A07);
        C57292tP.A00(A0o, "collectionIndex", this.A08);
        C57292tP.A00(A0o, "deepLinkOpenFrom", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "isOrderMsgAttached", this.A01);
        C57292tP.A00(A0o, "orderId", this.A09);
        C57292tP.A00(A0o, "productId", this.A0A);
        C57292tP.A00(A0o, "productIndex", this.A0B);
        return AnonymousClass3ZG.A0G(this.A05, "quantity", A0o);
    }
}
