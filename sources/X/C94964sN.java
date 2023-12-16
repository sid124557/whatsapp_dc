package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sN  reason: invalid class name and case insensitive filesystem */
public final class C94964sN extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C94964sN() {
        super(3292, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A06);
        r3.Blb(2, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A00);
        r3.Blb(8, this.A09);
        r3.Blb(9, this.A05);
        r3.Blb(10, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A01, A0r), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A09, A0r), this.A05, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCatalogCategoryView {");
        C57292tP.A00(A0o, "catalogCategoryId", this.A06);
        C57292tP.A00(A0o, "catalogOwnerJid", this.A07);
        C57292tP.A00(A0o, "catalogSessionId", this.A08);
        C57292tP.A00(A0o, "categoryBrowsingEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "categoryItemIndex", this.A03);
        C57292tP.A00(A0o, "categoryLevel", this.A04);
        C57292tP.A00(A0o, "isLastLevel", this.A00);
        C57292tP.A00(A0o, "productId", this.A09);
        C57292tP.A00(A0o, "sequenceNumber", this.A05);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "viewAction", A0o);
    }
}
