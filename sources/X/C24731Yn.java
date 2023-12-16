package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yn  reason: invalid class name and case insensitive filesystem */
public final class C24731Yn extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public C24731Yn() {
        super(3966, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A00);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(C18270x1.A0D(C18290x4.A0b(), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAutomaticIdentityVerification {");
        C57292tP.A00(A0o, "proofType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "verificationDurationT", this.A02);
        C57292tP.A00(A0o, "verificationErrorCode", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "verificationResult", A0o);
    }
}
