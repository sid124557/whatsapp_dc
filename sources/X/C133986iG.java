package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iG  reason: invalid class name and case insensitive filesystem */
public final class C133986iG extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C133986iG() {
        super(3248, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A01);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A06);
        r3.Blb(9, this.A07);
        r3.Blb(8, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0K(C18270x1.A0L(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A03, A0r), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDirectoryServerRequests {");
        C57292tP.A00(A0o, "directorySessionId", this.A03);
        C57292tP.A00(A0o, "endResponseTime", this.A00);
        C57292tP.A00(A0o, "httpProtocolVersion", this.A04);
        C57292tP.A00(A0o, "httpResponseCode", this.A01);
        C57292tP.A00(A0o, "networkEngineVersion", this.A05);
        C57292tP.A00(A0o, "neworkLibraryType", this.A06);
        C57292tP.A00(A0o, "requestEndpoint", this.A07);
        return AnonymousClass3ZG.A0G(this.A02, "startResponseTime", A0o);
    }
}
