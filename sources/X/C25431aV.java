package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aV  reason: invalid class name and case insensitive filesystem */
public final class C25431aV extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;

    public C25431aV() {
        super(2574, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A00);
        r3.Blb(7, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(4, this.A01);
        r3.Blb(10, this.A02);
        r3.Blb(8, this.A06);
        r3.Blb(1, this.A07);
        r3.Blb(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(C18270x1.A0G(C18270x1.A0H(C18270x1.A0J(C18300x5.A0Y(), this.A00, A0r), this.A03, A0r), this.A04, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18270x1.A0I(C18270x1.A0D(C18270x1.A0K(AnonymousClass0x7.A0h(), this.A02, A0r), this.A06, A0r), this.A07, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdLinkDevicePrimary {");
        C57292tP.A00(A0o, "mdCompanionPlatformType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdDurationS", this.A03);
        C57292tP.A00(A0o, "mdLinkDevicePrimaryErrorCode", this.A04);
        C57292tP.A00(A0o, "mdLinkDevicePrimaryStage", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mdPairingMethod", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "mdRegAttemptId", this.A06);
        C57292tP.A00(A0o, "mdSessionId", this.A07);
        return AnonymousClass3ZG.A0G(this.A05, "mdTimestampS", A0o);
    }
}
