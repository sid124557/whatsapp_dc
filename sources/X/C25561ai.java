package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ai  reason: invalid class name and case insensitive filesystem */
public final class C25561ai extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public C25561ai() {
        super(2110, AnonymousClass0x9.A0T(1, 1000, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A04);
        r3.Blb(4, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(8, this.A02);
        r3.Blb(6, this.A05);
        r3.Blb(1, this.A07);
        r3.Blb(5, this.A06);
        r3.Blb(2, this.A08);
        r3.Blb(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0E(C18270x1.A0H(C18270x1.A0D(C18270x1.A0I(C18270x1.A0K(C18270x1.A0F(C18270x1.A0G(AnonymousClass0x7.A0g(), this.A04, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A05, A0r), this.A07, A0r), this.A06, A0r), this.A08, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPushLatency {");
        C57292tP.A00(A0o, "deliveredPriority", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "fbnsAvailable", this.A00);
        C57292tP.A00(A0o, "gcmAvailable", this.A01);
        C57292tP.A00(A0o, "hasSessionId", this.A02);
        C57292tP.A00(A0o, "originalPriority", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "pushDelayT", this.A07);
        C57292tP.A00(A0o, "pushTransport", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "serverTimestampT", this.A08);
        return AnonymousClass3ZG.A0G(this.A03, "wasSessionDozed", A0o);
    }
}
