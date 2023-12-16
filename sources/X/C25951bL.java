package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bL  reason: invalid class name and case insensitive filesystem */
public final class C25951bL extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
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

    public C25951bL() {
        super(1910, new AnonymousClass5ZC(1, 1, 5, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(8, this.A03);
        r3.Blb(24, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(2, this.A06);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A07);
        r3.Blb(23, this.A08);
        r3.Blb(22, this.A09);
        r3.Blb(21, this.A0A);
        r3.Blb(14, this.A0B);
        r3.Blb(13, this.A0C);
        r3.Blb(12, this.A0D);
        r3.Blb(11, this.A0E);
        r3.Blb(10, this.A0F);
        r3.Blb(9, this.A0G);
        r3.Blb(20, this.A0H);
        r3.Blb(19, this.A0I);
        r3.Blb(18, this.A0J);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18290x4.A0d(), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(AnonymousClass0x2.A0Q(AnonymousClass3ZG.A05(AnonymousClass3ZG.A06(C18270x1.A0L(C18270x1.A0M(C18270x1.A0N(C18270x1.A0O(C18270x1.A0P(C18270x1.A0Q(AnonymousClass3ZG.A07(AnonymousClass3ZG.A08(AnonymousClass3ZG.A09(C18270x1.A0G(C18270x1.A0D(C18270x1.A0E(C18270x1.A0F(AnonymousClass3ZG.A0A(C18310x6.A0e(), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidDatabaseOverallMigrationEvent {");
        C57292tP.A00(A0o, "afterMigrationMsgstoreSize", this.A01);
        C57292tP.A00(A0o, "beforeMigrationMsgstoreSize", this.A02);
        C57292tP.A00(A0o, "freeSpaceAvailable", this.A03);
        C57292tP.A00(A0o, "migrationInitiator", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "migrationProcessedCnt", this.A05);
        C57292tP.A00(A0o, "migrationRegisteredCnt", this.A06);
        C57292tP.A00(A0o, "migrationSucceeded", this.A00);
        C57292tP.A00(A0o, "migrationT", this.A07);
        C57292tP.A00(A0o, "phaseConsistencyFailedCnt", this.A08);
        C57292tP.A00(A0o, "phaseConsistencySkippedCnt", this.A09);
        C57292tP.A00(A0o, "phaseConsistencySuccessCnt", this.A0A);
        C57292tP.A00(A0o, "phaseMigrationFailedCnt", this.A0B);
        C57292tP.A00(A0o, "phaseMigrationSkippedCnt", this.A0C);
        C57292tP.A00(A0o, "phaseMigrationSuccessCnt", this.A0D);
        C57292tP.A00(A0o, "phaseRollbackFailedCnt", this.A0E);
        C57292tP.A00(A0o, "phaseRollbackSkippedCnt", this.A0F);
        C57292tP.A00(A0o, "phaseRollbackSuccessCnt", this.A0G);
        C57292tP.A00(A0o, "phaseVerificationFailedCnt", this.A0H);
        C57292tP.A00(A0o, "phaseVerificationSkippedCnt", this.A0I);
        return AnonymousClass3ZG.A0G(this.A0J, "phaseVerificationSuccessCnt", A0o);
    }
}
