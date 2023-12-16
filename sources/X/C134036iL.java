package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iL  reason: invalid class name and case insensitive filesystem */
public final class C134036iL extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A06);
        r3.Blb(11, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A07);
        r3.Blb(7, this.A00);
        r3.Blb(8, this.A01);
        r3.Blb(9, this.A08);
        r3.Blb(10, this.A09);
    }

    public C134036iL() {
        super(4356, AnonymousClass3ZG.A04(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(11, this.A04, A0r), this.A05, A0r), this.A07, A0r), this.A00, A0r), this.A01, A0r), this.A08, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsProxyLogin {");
        C57292tP.A00(A0o, "androidKeystoreState", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "connectionOrigin", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "connectionT", this.A06);
        C57292tP.A00(A0o, "loginDnsResolver", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "loginResult", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "loginT", this.A07);
        C57292tP.A00(A0o, "longConnect", this.A00);
        C57292tP.A00(A0o, "psPassive", this.A01);
        C57292tP.A00(A0o, "retryCount", this.A08);
        return AnonymousClass3ZG.A0G(this.A09, "serverErrorCode", A0o);
    }
}
