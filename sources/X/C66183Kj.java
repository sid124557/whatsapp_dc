package X;

/* renamed from: X.3Kj  reason: invalid class name and case insensitive filesystem */
public class C66183Kj implements AnonymousClass4ED {
    public static final String[] A00 = {"reaction", "sender_timestamp"};

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_add_on", "message_add_on_reaction", "message_add_on_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A002 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[3];
        A002.A02 = "message_add_on_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A002, r2, r3);
        A002.A02 = "reaction";
        C54912pU.A0b(A002, AnonymousClass220.TEXT, r3, A0o ? 1 : 0);
        C54912pU.A0A(A002, r2, "sender_timestamp", r3);
        r7.A0E("message_add_on_reaction", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
