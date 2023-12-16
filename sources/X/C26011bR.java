package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bR  reason: invalid class name and case insensitive filesystem */
public final class C26011bR extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Long A0X;

    public C26011bR() {
        super(2318, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(7, this.A01);
        r3.Blb(29, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(36, this.A04);
        r3.Blb(28, this.A05);
        r3.Blb(27, this.A06);
        r3.Blb(19, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(14, this.A09);
        r3.Blb(6, this.A0A);
        r3.Blb(5, this.A0B);
        r3.Blb(10, this.A0C);
        r3.Blb(32, this.A0D);
        r3.Blb(11, this.A0E);
        r3.Blb(20, this.A0F);
        r3.Blb(25, this.A0G);
        r3.Blb(17, this.A0H);
        r3.Blb(2, this.A0I);
        r3.Blb(30, this.A0J);
        r3.Blb(24, this.A0K);
        r3.Blb(22, this.A0L);
        r3.Blb(15, this.A0M);
        r3.Blb(33, this.A0N);
        r3.Blb(8, this.A0O);
        r3.Blb(9, this.A0P);
        r3.Blb(35, this.A0Q);
        r3.Blb(18, this.A0R);
        r3.Blb(23, this.A0S);
        r3.Blb(16, this.A0T);
        r3.Blb(12, this.A0U);
        r3.Blb(21, this.A0V);
        r3.Blb(13, this.A0W);
        r3.Blb(26, this.A0X);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(AnonymousClass3ZG.A0E(C18270x1.A0J(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        A0r.put(C18270x1.A0M(C18270x1.A0H(C18270x1.A0I(C18270x1.A0Q(C18270x1.A0F(AnonymousClass3ZG.A05(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A0D(36, this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C);
        A0r.put(AnonymousClass0x2.A0N(AnonymousClass3ZG.A08(AnonymousClass3ZG.A0A(AnonymousClass3ZG.A0F(C18270x1.A0E(AnonymousClass0x2.A0P(C18290x4.A0f(AnonymousClass3ZG.A06(C18270x1.A0N(32, this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J, A0r), this.A0K, A0r), this.A0L, A0r), this.A0M);
        AnonymousClass3ZG.A0I(A0r, 31);
        A0r.put(33, this.A0N);
        AnonymousClass3ZG.A0I(A0r, 34);
        A0r.put(C18270x1.A0L(C18310x6.A0e(), this.A0O, A0r), this.A0P);
        A0r.put(AnonymousClass3ZG.A0B(C18270x1.A0P(AnonymousClass3ZG.A07(C18270x1.A0O(AnonymousClass0x2.A0O(AnonymousClass3ZG.A09(AnonymousClass0x2.A0Q(35, this.A0Q, A0r), this.A0R, A0r), this.A0S, A0r), this.A0T, A0r), this.A0U, A0r), this.A0V, A0r), this.A0W, A0r), this.A0X);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidDatabaseMigrationDailyStatus {");
        C57292tP.A00(A0o, "dbMigrationBlankMeJid", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "dbMigrationBroadcastMeJid", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "dbMigrationCallLog", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "dbMigrationChat", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "dbMigrationDropDeprecatedTables", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "dbMigrationEphemeral", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "dbMigrationEphemeralSetting", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "dbMigrationFrequent", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "dbMigrationFts", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "dbMigrationFuture", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "dbMigrationGroupParticipant", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "dbMigrationJid", C18270x1.A0T(this.A0B));
        C57292tP.A00(A0o, "dbMigrationLabelJid", C18270x1.A0T(this.A0C));
        C57292tP.A00(A0o, "dbMigrationLegacyQuotedOrderMessage", C18270x1.A0T(this.A0D));
        C57292tP.A00(A0o, "dbMigrationLink", C18270x1.A0T(this.A0E));
        C57292tP.A00(A0o, "dbMigrationLocation", C18270x1.A0T(this.A0F));
        C57292tP.A00(A0o, "dbMigrationMainMessage", C18270x1.A0T(this.A0G));
        C57292tP.A00(A0o, "dbMigrationMention", C18270x1.A0T(this.A0H));
        C57292tP.A00(A0o, "dbMigrationMessageMedia", C18270x1.A0T(this.A0I));
        C57292tP.A00(A0o, "dbMigrationMessageMediaFixer", C18270x1.A0T(this.A0J));
        C57292tP.A00(A0o, "dbMigrationMissedCall", C18270x1.A0T(this.A0K));
        C57292tP.A00(A0o, "dbMigrationPayment", C18270x1.A0T(this.A0L));
        C57292tP.A00(A0o, "dbMigrationQuoted", C18270x1.A0T(this.A0M));
        C57292tP.A00(A0o, "dbMigrationQuotedOrderMessageV2", C18270x1.A0T(this.A0N));
        C57292tP.A00(A0o, "dbMigrationReceiptDevice", C18270x1.A0T(this.A0O));
        C57292tP.A00(A0o, "dbMigrationReceiptUser", C18270x1.A0T(this.A0P));
        C57292tP.A00(A0o, "dbMigrationRenameDeprecatedTables", C18270x1.A0T(this.A0Q));
        C57292tP.A00(A0o, "dbMigrationRevoked", C18270x1.A0T(this.A0R));
        C57292tP.A00(A0o, "dbMigrationSendCount", C18270x1.A0T(this.A0S));
        C57292tP.A00(A0o, "dbMigrationSystem", C18270x1.A0T(this.A0T));
        C57292tP.A00(A0o, "dbMigrationText", C18270x1.A0T(this.A0U));
        C57292tP.A00(A0o, "dbMigrationThumbnail", C18270x1.A0T(this.A0V));
        C57292tP.A00(A0o, "dbMigrationVcard", C18270x1.A0T(this.A0W));
        return AnonymousClass3ZG.A0G(this.A0X, "timeSinceLastMigrationAtemptT", A0o);
    }
}
