package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
public final class C25261aE extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C25261aE() {
        super(3548, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A04);
        r3.Blb(2, this.A05);
        r3.Blb(3, this.A06);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A02, A0r), this.A01, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamProductSearch {");
        C57292tP.A00(A0o, "catalogOwnerJid", this.A04);
        C57292tP.A00(A0o, "catalogSessionId", this.A05);
        C57292tP.A00(A0o, "productId", this.A06);
        C57292tP.A00(A0o, "searchEntryPoint", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "searchResultIndex", this.A02);
        C57292tP.A00(A0o, "searchViewAction", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A03, "sequenceNumber", A0o);
    }
}
