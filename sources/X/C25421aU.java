package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aU  reason: invalid class name and case insensitive filesystem */
public final class C25421aU extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C25421aU() {
        super(2294, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A01);
        r3.Blb(1, this.A07);
        r3.Blb(8, this.A04);
        r3.Blb(9, this.A05);
        r3.Blb(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0E(C18270x1.A0G(C18270x1.A0N(C18290x4.A0c(), (Object) null, A0r), (Object) null, A0r), this.A02, A0r), this.A00, A0r), this.A03, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0F(C18270x1.A0L(C18270x1.A0K(AnonymousClass001.A0f(), this.A07, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapAppStateDataDownloaded {");
        C57292tP.A00(A0o, "mdBootstrapPayloadSize", this.A02);
        C57292tP.A00(A0o, "mdBootstrapPayloadType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdBootstrapStepDuration", this.A03);
        C57292tP.A00(A0o, "mdBootstrapStepResult", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mdSessionId", this.A07);
        C57292tP.A00(A0o, "mdStorageQuotaBytes", this.A04);
        C57292tP.A00(A0o, "mdStorageQuotaUsedBytes", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "mdTimestamp", A0o);
    }
}
