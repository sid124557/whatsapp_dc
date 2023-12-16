package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iV  reason: invalid class name and case insensitive filesystem */
public final class C134136iV extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(5, this.A08);
        r3.Blb(13, this.A04);
        r3.Blb(14, this.A05);
        r3.Blb(15, this.A06);
        r3.Blb(1, this.A07);
        r3.Blb(3, this.A09);
        r3.Blb(4, this.A00);
        r3.Blb(16, this.A0A);
        r3.Blb(8, this.A01);
        r3.Blb(2, this.A0B);
        r3.Blb(7, this.A0C);
        r3.Blb(9, this.A0D);
    }

    public C134136iV() {
        super(460, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(10, this.A02, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(C18290x4.A0c(), this.A08);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18270x1.A0L(C18270x1.A0J(C18270x1.A0E(C18270x1.A0K(AnonymousClass0x2.A0O(C18270x1.A0G(C18270x1.A0F(C18270x1.A0D(AnonymousClass0x2.A0N(C18270x1.A0Q(13, this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A09, A0r), this.A00, A0r), this.A0A, A0r), this.A01, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamLogin {");
        C57292tP.A00(A0o, "androidKeystoreState", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "connectionOrigin", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "connectionT", this.A08);
        C57292tP.A00(A0o, "loginDnsResolver", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "loginIpSource", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "loginPort", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "loginResult", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "loginT", this.A09);
        C57292tP.A00(A0o, "longConnect", this.A00);
        C57292tP.A00(A0o, "noiseProtocolVersion", this.A0A);
        C57292tP.A00(A0o, "passive", this.A01);
        C57292tP.A00(A0o, "retryCount", this.A0B);
        C57292tP.A00(A0o, "sequenceStep", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0D, "serverErrorCode", A0o);
    }
}
