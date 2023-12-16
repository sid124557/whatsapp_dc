package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bF  reason: invalid class name and case insensitive filesystem */
public final class C25891bF extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public C25891bF() {
        super(976, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(17, this.A05);
        r3.Blb(4, this.A04);
        r3.Blb(1, this.A06);
        r3.Blb(2, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(12, this.A00);
        r3.Blb(10, this.A0C);
        r3.Blb(18, this.A0D);
        r3.Blb(19, this.A0E);
        r3.Blb(13, this.A01);
        r3.Blb(3, this.A09);
        r3.Blb(14, this.A0A);
        r3.Blb(9, this.A0F);
        r3.Blb(15, this.A02);
        r3.Blb(5, this.A0B);
        r3.Blb(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(17, this.A05);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0P(AnonymousClass3ZG.A05(AnonymousClass0x2.A0Q(C18270x1.A0M(C18270x1.A0O(C18270x1.A0I(C18270x1.A0E(C18270x1.A0D(C18290x4.A0b(), this.A04, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(AnonymousClass0x2.A0O(C18270x1.A0H(AnonymousClass0x2.A0N(C18270x1.A0L(C18270x1.A0Q(C18290x4.A0a(), this.A09, A0r), this.A0A, A0r), this.A0F, A0r), this.A02, A0r), this.A0B, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatDatabaseBackupEvent {");
        C57292tP.A00(A0o, "backupType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "compressionRatio", this.A04);
        C57292tP.A00(A0o, "databaseBackupOverallResult", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "databaseBackupVersion", this.A07);
        C57292tP.A00(A0o, "freeDiskSpace", this.A08);
        C57292tP.A00(A0o, "ftsCleaned", this.A00);
        C57292tP.A00(A0o, "genericBackupFailureReason", this.A0C);
        C57292tP.A00(A0o, "incrementalBackupFailedSystemMsgTypes", this.A0D);
        C57292tP.A00(A0o, "incrementalBackupFailedUsrMsgTypes", this.A0E);
        C57292tP.A00(A0o, "indexesCleaned", this.A01);
        C57292tP.A00(A0o, "msgstoreBackupSize", this.A09);
        C57292tP.A00(A0o, "savingsPercentageFromCleaning", this.A0A);
        C57292tP.A00(A0o, "sqliteVersion", this.A0F);
        C57292tP.A00(A0o, "thumbnailsCleaned", this.A02);
        C57292tP.A00(A0o, "totalBackupT", this.A0B);
        return AnonymousClass3ZG.A0G(this.A03, "vacuumed", A0o);
    }
}
