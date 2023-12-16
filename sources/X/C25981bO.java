package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bO  reason: invalid class name and case insensitive filesystem */
public final class C25981bO extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public String A0L;

    public C25981bO() {
        super(932, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(14, this.A0D);
        r3.Blb(26, this.A0A);
        r3.Blb(11, this.A0B);
        r3.Blb(22, this.A00);
        r3.Blb(2, this.A0E);
        r3.Blb(10, this.A0F);
        r3.Blb(5, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(1, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(12, this.A0C);
        r3.Blb(6, this.A06);
        r3.Blb(9, this.A07);
        r3.Blb(20, this.A0L);
        r3.Blb(7, this.A08);
        r3.Blb(23, this.A0G);
        r3.Blb(27, this.A0H);
        r3.Blb(28, this.A0I);
        r3.Blb(24, this.A0J);
        r3.Blb(13, this.A0K);
        r3.Blb(25, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 16);
        A0r.put(C18270x1.A0N(AnonymousClass3ZG.A0B(C18320x8.A0W(), this.A0D, A0r), this.A0A, A0r), this.A0B);
        AnonymousClass3ZG.A0I(A0r, 17);
        A0r.put(22, this.A00);
        AnonymousClass3ZG.A0I(A0r, 19);
        A0r.put(C18270x1.A0J(AnonymousClass3ZG.A06(C18270x1.A0L(C18270x1.A0I(C18270x1.A0O(C18270x1.A0K(C18270x1.A0D(C18270x1.A0F(C18270x1.A0G(C18270x1.A0H(C18270x1.A0M(C18280x3.A0S(), this.A0E, A0r), this.A0F, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A0C, A0r), this.A06, A0r), this.A07, A0r), this.A0L, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 18);
        A0r.put(C18270x1.A0P(AnonymousClass3ZG.A0A(AnonymousClass3ZG.A0D(AnonymousClass3ZG.A0C(23, this.A0G, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J, A0r), this.A0K);
        AnonymousClass3ZG.A0I(A0r, 15);
        A0r.put(25, this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatDatabaseRestoreEvent {");
        C57292tP.A00(A0o, "backupFileIndex", this.A0D);
        C57292tP.A00(A0o, "backupRestoreMode", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "backupRestoreStatusOfBackupFoundAtRestoreTime", C18270x1.A0T(this.A0B));
        C57292tP.A00(A0o, "cleanedBackup", this.A00);
        C57292tP.A00(A0o, "databaseBackupVersion", this.A0E);
        C57292tP.A00(A0o, "databaseDumpAndRestoreRecoveryPercentage", this.A0F);
        C57292tP.A00(A0o, "databaseRepairEnabled", this.A01);
        C57292tP.A00(A0o, "databaseRestoreCorrectJid", this.A02);
        C57292tP.A00(A0o, "databaseRestoreFileIntegrityCheck", this.A03);
        C57292tP.A00(A0o, "databaseRestoreOverallResult", this.A04);
        C57292tP.A00(A0o, "databaseRestoreReindexingResult", this.A05);
        C57292tP.A00(A0o, "databaseRestoreResultDetails", C18270x1.A0T(this.A0C));
        C57292tP.A00(A0o, "databaseRestoreSqliteIntegrityCheckResult", this.A06);
        C57292tP.A00(A0o, "dbDumpAndRestoreResult", this.A07);
        C57292tP.A00(A0o, "genericFailureReason", this.A0L);
        C57292tP.A00(A0o, "hasOnlyIndexErrors", this.A08);
        C57292tP.A00(A0o, "restoreChatDbTimeSec", this.A0G);
        C57292tP.A00(A0o, "restoreIncrementFileCount", this.A0H);
        C57292tP.A00(A0o, "restoreIncrementsTimeSec", this.A0I);
        C57292tP.A00(A0o, "restoreIndexesTimeSec", this.A0J);
        C57292tP.A00(A0o, "restoreTimeBackupFilesCount", this.A0K);
        return AnonymousClass3ZG.A0G(this.A09, "restoredIndexes", A0o);
    }
}
