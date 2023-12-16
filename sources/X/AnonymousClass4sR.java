package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sR  reason: invalid class name */
public final class AnonymousClass4sR extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public AnonymousClass4sR() {
        super(2100, new AnonymousClass5ZC(1, 10, 1000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(12, this.A06);
        r3.Blb(10, this.A09);
        r3.Blb(8, this.A07);
        r3.Blb(7, this.A08);
        r3.Blb(6, this.A00);
        r3.Blb(11, this.A0A);
        r3.Blb(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0H(C18270x1.A0N(C18270x1.A0I(C18270x1.A0J(C18270x1.A0K(C18270x1.A0M(C18270x1.A0O(C18270x1.A0F(C18270x1.A0G(C18270x1.A0D(C18280x3.A0S(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A09, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A0A, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidBatteryUsage {");
        C57292tP.A00(A0o, "networkMobileBytesRx", this.A02);
        C57292tP.A00(A0o, "networkMobileBytesTx", this.A03);
        C57292tP.A00(A0o, "networkWifiBytesRx", this.A04);
        C57292tP.A00(A0o, "networkWifiBytesTx", this.A05);
        C57292tP.A00(A0o, "numberPushNotifications", this.A06);
        C57292tP.A00(A0o, "sessionName", this.A09);
        C57292tP.A00(A0o, "sessionUpT", this.A07);
        C57292tP.A00(A0o, "sessionWallclockT", this.A08);
        C57292tP.A00(A0o, "systemCpuTime", this.A00);
        C57292tP.A00(A0o, "tags", this.A0A);
        return AnonymousClass3ZG.A0G(this.A01, "userCpuTime", A0o);
    }
}
