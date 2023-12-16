package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sK  reason: invalid class name and case insensitive filesystem */
public final class C94934sK extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C94934sK() {
        super(494, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A03);
        r3.Blb(14, this.A00);
        r3.Blb(9, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(5, this.A02);
        r3.Blb(2, this.A06);
        r3.Blb(6, this.A01);
        r3.Blb(15, this.A07);
        r3.Blb(13, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0P(AnonymousClass0x2.A0N(C18270x1.A0I(C18270x1.A0E(C18270x1.A0H(C18270x1.A0F(C18270x1.A0L(C18270x1.A0Q(C18310x6.A0e(), this.A03, A0r), this.A00, A0r), this.A04, A0r), this.A05, A0r), this.A02, A0r), this.A06, A0r), this.A01, A0r), this.A07, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCrashLog {");
        C57292tP.A00(A0o, "androidAppStateMetadata", this.A03);
        C57292tP.A00(A0o, "androidApplicationState", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "androidCrashedBuildVersion", this.A04);
        C57292tP.A00(A0o, "crashContext", this.A05);
        C57292tP.A00(A0o, "crashCount", this.A02);
        C57292tP.A00(A0o, "crashReason", this.A06);
        C57292tP.A00(A0o, "crashType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "lastSurface", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "secondaryProcessName", A0o);
    }
}
