package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bP  reason: invalid class name and case insensitive filesystem */
public final class C25991bP extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;

    public C25991bP() {
        super(4290, AnonymousClass0x9.A0U(1, false), 1, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A0L);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A0M);
        r3.Blb(6, this.A0N);
        r3.Blb(7, this.A0O);
        r3.Blb(8, this.A0A);
        r3.Blb(9, this.A0B);
        r3.Blb(31, this.A06);
        r3.Blb(10, this.A07);
        r3.Blb(11, this.A08);
        r3.Blb(12, this.A09);
        r3.Blb(13, this.A0P);
        r3.Blb(14, this.A00);
        r3.Blb(15, this.A0Q);
        r3.Blb(16, this.A0C);
        r3.Blb(17, this.A0D);
        r3.Blb(18, this.A0E);
        r3.Blb(19, this.A0F);
        r3.Blb(23, this.A0G);
        r3.Blb(24, this.A0H);
        r3.Blb(27, this.A0I);
        r3.Blb(32, this.A0J);
        r3.Blb(30, this.A01);
        r3.Blb(28, this.A0K);
        r3.Blb(29, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A0L, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A0M, A0r), this.A0N, A0r), this.A0O, A0r), this.A0A, A0r), this.A0B);
        A0r.put(AnonymousClass3ZG.A06(AnonymousClass3ZG.A05(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(31, this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0P, A0r), this.A00, A0r), this.A0Q, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 21);
        AnonymousClass0x2.A1H((Object) null, A0r, 22);
        A0r.put(C18290x4.A0f(AnonymousClass3ZG.A0A(23, this.A0G, A0r), this.A0H, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 26);
        A0r.put(27, this.A0I);
        A0r.put(AnonymousClass3ZG.A0E(AnonymousClass3ZG.A0D(AnonymousClass3ZG.A0F(32, this.A0J, A0r), this.A01, A0r), this.A0K, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaFsChatTransfer {");
        C57292tP.A00(A0o, "fpmAttemptId", this.A0L);
        C57292tP.A00(A0o, "fpmCancellationReason", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "fpmDeviceRole", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "fpmDonorAppBuild", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "fpmDonorAppVersion", this.A0M);
        C57292tP.A00(A0o, "fpmDonorDeviceName", this.A0N);
        C57292tP.A00(A0o, "fpmDonorOsVersion", this.A0O);
        C57292tP.A00(A0o, "fpmDonorYearClass2016", this.A0A);
        C57292tP.A00(A0o, "fpmDuration", this.A0B);
        C57292tP.A00(A0o, "fpmEntryPoint", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "fpmErrorCode", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "fpmErrorPhase", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "fpmEvent", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "fpmEventContext", this.A0P);
        C57292tP.A00(A0o, "fpmExportedDbSize", this.A00);
        C57292tP.A00(A0o, "fpmFunnelId", this.A0Q);
        C57292tP.A00(A0o, "fpmImportCntMediaFailed", this.A0C);
        C57292tP.A00(A0o, "fpmImportCntMediaImported", this.A0D);
        C57292tP.A00(A0o, "fpmImportCntMessagesFailed", this.A0E);
        C57292tP.A00(A0o, "fpmImportCntMessagesImported", this.A0F);
        C57292tP.A00(A0o, "fpmNumMediaAttemptToTransferred", this.A0G);
        C57292tP.A00(A0o, "fpmNumMediaTransferred", this.A0H);
        C57292tP.A00(A0o, "fpmProgress", this.A0I);
        C57292tP.A00(A0o, "fpmProtocolVersion", this.A0J);
        C57292tP.A00(A0o, "fpmTotalTransferSize", this.A01);
        C57292tP.A00(A0o, "storageAvailSize", this.A0K);
        return AnonymousClass3ZG.A0G(this.A02, "waDbSize", A0o);
    }
}
