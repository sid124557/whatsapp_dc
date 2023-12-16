package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b1  reason: invalid class name and case insensitive filesystem */
public final class C25751b1 extends AnonymousClass3ZG {
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
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A06);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A00);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(9, this.A09);
        r3.Blb(10, this.A0A);
        r3.Blb(11, this.A0B);
        r3.Blb(12, this.A0C);
        r3.Blb(13, this.A01);
    }

    public C25751b1() {
        super(4592, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A06, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A05, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamLogout {");
        C57292tP.A00(A0o, "appStandbyBucket", this.A06);
        C57292tP.A00(A0o, "loginDnsResolver", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "loginIpSource", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "loginPort", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "logoutIsBatterySaver", this.A00);
        C57292tP.A00(A0o, "logoutReason", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "logoutSessionBackgroundMs", this.A07);
        C57292tP.A00(A0o, "logoutSessionForegroundMs", this.A08);
        C57292tP.A00(A0o, "logoutSessionId", this.A09);
        C57292tP.A00(A0o, "logoutSessionLengthMs", this.A0A);
        C57292tP.A00(A0o, "logoutSessionTotalBytesIn", this.A0B);
        C57292tP.A00(A0o, "logoutSessionTotalBytesOut", this.A0C);
        return AnonymousClass3ZG.A0G(this.A01, "passive", A0o);
    }
}
