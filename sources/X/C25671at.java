package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1at  reason: invalid class name and case insensitive filesystem */
public final class C25671at extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C25671at() {
        super(2872, AnonymousClass0x9.A0U(1, false), 1, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A06);
        r3.Blb(7, this.A00);
        r3.Blb(8, this.A01);
        r3.Blb(10, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(1, this.A05);
        r3.Blb(11, this.A07);
        r3.Blb(12, this.A08);
        r3.Blb(6, this.A02);
        r3.Blb(2, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0K(C18270x1.A0J(C18300x5.A0Y(), this.A06, A0r), this.A00, A0r), this.A01, A0r), (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 15);
        A0r.put(C18270x1.A0E(C18270x1.A0I(C18270x1.A0O(C18270x1.A0N(C18270x1.A0D(C18270x1.A0H(C18270x1.A0F(AnonymousClass0x2.A0P(C18270x1.A0M(16, (Object) null, A0r), this.A03, A0r), (Object) null, A0r), (Object) null, A0r), this.A04, A0r), this.A05, A0r), this.A07, A0r), this.A08, A0r), this.A02, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamXplatformMigrationExport {");
        C57292tP.A00(A0o, "storageAvailSize", this.A06);
        C57292tP.A00(A0o, "waDbSize", this.A00);
        C57292tP.A00(A0o, "waMediaSize", this.A01);
        C57292tP.A00(A0o, "xpmDonorPlatform", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "xpmError", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "xpmEvent", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "xpmExportDuration", this.A07);
        C57292tP.A00(A0o, "xpmExportProgress", this.A08);
        C57292tP.A00(A0o, "xpmExportedDbSize", this.A02);
        return AnonymousClass3ZG.A0G(this.A09, "xpmFunnelId", A0o);
    }
}
