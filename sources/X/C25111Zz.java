package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zz  reason: invalid class name and case insensitive filesystem */
public final class C25111Zz extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C25111Zz() {
        super(1094, AnonymousClass0x9.A0T(1, 200, 1000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(7, this.A00);
        r3.Blb(1, this.A03);
        r3.Blb(5, this.A01);
        r3.Blb(10, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0M(C18270x1.A0H(C18270x1.A0D(C18270x1.A0G(C18270x1.A0F(C18270x1.A0J(C18280x3.A0S(), this.A02, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A03, A0r), this.A01, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAppLaunch {");
        C57292tP.A00(A0o, "appLaunchCpuT", this.A02);
        C57292tP.A00(A0o, "appLaunchDestination", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "appLaunchT", this.A03);
        C57292tP.A00(A0o, "appLaunchTypeT", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "dbMainThreadCount", this.A04);
        C57292tP.A00(A0o, "dbReadsCount", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "dbWritesCount", A0o);
    }
}
