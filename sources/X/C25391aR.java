package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aR  reason: invalid class name and case insensitive filesystem */
public final class C25391aR extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C25391aR() {
        super(2444, AnonymousClass0x9.A0T(1, 20, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A03);
        r3.Blb(7, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(5, this.A04);
        r3.Blb(2, this.A07);
        r3.Blb(1, this.A05);
        r3.Blb(4, this.A02);
        r3.Blb(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0G(C18270x1.A0D(C18270x1.A0E(C18270x1.A0H(C18270x1.A0F(C18270x1.A0J(C18300x5.A0Y(), this.A03, A0r), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A07, A0r), this.A05, A0r), this.A02, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 6);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamExitReasonEvent {");
        C57292tP.A00(A0o, "exitImportance", this.A03);
        C57292tP.A00(A0o, "exitLowMemorySupported", this.A00);
        C57292tP.A00(A0o, "exitPss", this.A01);
        C57292tP.A00(A0o, "exitReason", this.A04);
        C57292tP.A00(A0o, "exitReasonDescription", this.A07);
        C57292tP.A00(A0o, "exitReasonTimestamp", this.A05);
        C57292tP.A00(A0o, "exitRss", this.A02);
        return AnonymousClass3ZG.A0G(this.A06, "exitStatus", A0o);
    }
}
