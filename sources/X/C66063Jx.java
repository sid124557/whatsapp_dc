package X;

/* renamed from: X.3Jx  reason: invalid class name and case insensitive filesystem */
public class C66063Jx implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_vcard_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_index ON message_vcard (message_row_id, vcard)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_row_id", A0r, C54912pU.A0m(A00, r2, A0r) ? 1 : 0);
        A00.A02 = "vcard";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, A0r);
        r7.A0E("message_vcard", A0r);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_vcard");
    }
}
