package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aH  reason: invalid class name and case insensitive filesystem */
public final class C25291aH extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C25291aH() {
        super(2242, new AnonymousClass5ZC(1, 1, 100, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A01);
        r3.Blb(4, this.A04);
        r3.Blb(7, this.A02);
        r3.Blb(2, this.A05);
        r3.Blb(1, this.A03);
        r3.Blb(3, this.A06);
        r3.Blb(5, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18290x4.A0d(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0H(C18270x1.A0F(C18270x1.A0D(C18270x1.A0E(C18270x1.A0J(C18290x4.A0b(), this.A04, A0r), this.A02, A0r), this.A05, A0r), this.A03, A0r), this.A06, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSignCredential {");
        C57292tP.A00(A0o, "applicationState", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "overallT", this.A04);
        C57292tP.A00(A0o, "projectCode", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "retryCount", this.A05);
        C57292tP.A00(A0o, "signCredentialResult", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "signCredentialT", this.A06);
        return AnonymousClass3ZG.A0G(this.A00, "waConnectedToChatd", A0o);
    }
}
