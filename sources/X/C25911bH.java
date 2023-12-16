package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bH  reason: invalid class name and case insensitive filesystem */
public final class C25911bH extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;

    public C25911bH() {
        super(486, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A02);
        r3.Blb(19, this.A0B);
        r3.Blb(5, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A0C);
        r3.Blb(12, this.A03);
        r3.Blb(9, this.A04);
        r3.Blb(22, this.A09);
        r3.Blb(13, this.A05);
        r3.Blb(1, this.A0A);
        r3.Blb(6, this.A0D);
        r3.Blb(7, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(10, this.A08);
        r3.Blb(23, this.A0E);
        r3.Blb(14, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 16);
        A0r.put(C18270x1.A0O(C18270x1.A0F(C18270x1.A0E(C18270x1.A0H(AnonymousClass3ZG.A05(C18310x6.A0e(), this.A02, A0r), this.A0B, A0r), this.A00, A0r), this.A01, A0r), this.A0C, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 20);
        A0r.put(C18270x1.A0D(C18270x1.A0P(AnonymousClass3ZG.A08(C18300x5.A0Y(), this.A04, A0r), this.A09, A0r), this.A05, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(AnonymousClass3ZG.A07(C18270x1.A0M(C18270x1.A0N(C18270x1.A0J(C18290x4.A0d(), this.A0D, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 17);
        A0r.put(C18270x1.A0Q(23, this.A0E, A0r), this.A0F);
        AnonymousClass3ZG.A0I(A0r, 15);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamRestore {");
        C57292tP.A00(A0o, "backupRestoreChatdbSize", this.A02);
        C57292tP.A00(A0o, "backupRestoreEncryptionVersion", this.A0B);
        C57292tP.A00(A0o, "backupRestoreIncludeVideos", this.A00);
        C57292tP.A00(A0o, "backupRestoreIsFull", this.A01);
        C57292tP.A00(A0o, "backupRestoreIsWifi", this.A0C);
        C57292tP.A00(A0o, "backupRestoreMediaFileCount", this.A03);
        C57292tP.A00(A0o, "backupRestoreMediaSize", this.A04);
        C57292tP.A00(A0o, "backupRestoreMode", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "backupRestoreNetworkRequestCount", this.A05);
        C57292tP.A00(A0o, "backupRestoreResult", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "backupRestoreT", this.A0D);
        C57292tP.A00(A0o, "backupRestoreTotalSize", this.A06);
        C57292tP.A00(A0o, "backupRestoreTransferFailedSize", this.A07);
        C57292tP.A00(A0o, "backupRestoreTransferSize", this.A08);
        C57292tP.A00(A0o, "incrementalBackupRestoreFileCount", this.A0E);
        return AnonymousClass3ZG.A0G(this.A0F, "restoreConcurrentReadsCount", A0o);
    }
}
