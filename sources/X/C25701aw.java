package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aw  reason: invalid class name and case insensitive filesystem */
public final class C25701aw extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public C25701aw() {
        super(2296, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(15, this.A03);
        r3.Blb(14, this.A04);
        r3.Blb(13, this.A00);
        r3.Blb(4, this.A05);
        r3.Blb(2, this.A01);
        r3.Blb(7, this.A06);
        r3.Blb(8, this.A02);
        r3.Blb(1, this.A0A);
        r3.Blb(9, this.A07);
        r3.Blb(10, this.A08);
        r3.Blb(3, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0Q(AnonymousClass0x9.A0j(), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(13, this.A00);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0F(C18270x1.A0M(C18270x1.A0L(C18270x1.A0D(C18270x1.A0O(C18270x1.A0N(C18270x1.A0K(C18270x1.A0J(C18270x1.A0E(C18290x4.A0b(), this.A05, A0r), this.A01, A0r), this.A06, A0r), this.A02, A0r), (Object) null, A0r), (Object) null, A0r), this.A0A, A0r), this.A07, A0r), this.A08, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapHistoryDataDownloaded {");
        C57292tP.A00(A0o, "historySyncChunkOrder", this.A03);
        C57292tP.A00(A0o, "historySyncStageProgress", this.A04);
        C57292tP.A00(A0o, "mdBootstrapHistoryPayloadType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdBootstrapPayloadSize", this.A05);
        C57292tP.A00(A0o, "mdBootstrapPayloadType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mdBootstrapStepDuration", this.A06);
        C57292tP.A00(A0o, "mdBootstrapStepResult", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "mdSessionId", this.A0A);
        C57292tP.A00(A0o, "mdStorageQuotaBytes", this.A07);
        C57292tP.A00(A0o, "mdStorageQuotaUsedBytes", this.A08);
        return AnonymousClass3ZG.A0G(this.A09, "mdTimestamp", A0o);
    }
}
