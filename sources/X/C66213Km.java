package X;

/* renamed from: X.3Km  reason: invalid class name and case insensitive filesystem */
public class C66213Km implements AnonymousClass4ED {
    public static final String[] A00 = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("vname_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A002 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[15];
        AnonymousClass220 A01 = AnonymousClass220.A01(A002);
        A002.A00 = A01;
        boolean A0q = C54912pU.A0q(A002, r2);
        A002.A02 = "jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A002, r1, r2, true);
        C54912pU.A0W(A002, A01, "serial", r2, true);
        C54912pU.A0X(A002, r1, "issuer", r2, true);
        C54912pU.A0C(A002, A01, "expires", r2);
        A002.A02 = "verified_name";
        C54912pU.A0h(A002, r1, r2, true);
        C54912pU.A0E(A002, r1, "industry", r2);
        C54912pU.A0F(A002, r1, "city", r2);
        C54912pU.A0G(A002, r1, "country", r2);
        C54912pU.A0H(A002, A01, "verified_level", r2);
        C54912pU.A0I(A002, A01, "identity_unconfirmed_since", r2);
        r2[11] = AnonymousClass220.A00(A002, "cert_blob");
        r2[12] = C54912pU.A04(A002, A01, "host_storage", A0q ? 1 : 0);
        r2[13] = C54912pU.A04(A002, A01, "actual_actors", A0q);
        r2[14] = C54912pU.A04(A002, A01, "privacy_mode_ts", A0q);
        r9.A0E("wa_vnames", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
