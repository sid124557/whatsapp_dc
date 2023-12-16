package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZV  reason: invalid class name */
public final class AnonymousClass1ZV extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public AnonymousClass1ZV() {
        super(3206, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(3, this.A03);
        r3.Blb(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(C18270x1.A0D(C18270x1.A0H(C18290x4.A0b(), this.A04, A0r), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamGraphqlCatalogRequest {");
        C57292tP.A00(A0o, "businessJid", this.A04);
        C57292tP.A00(A0o, "businessType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "graphqlCatalogEndpoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "graphqlErrorCode", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "graphqlRequestResult", A0o);
    }
}
