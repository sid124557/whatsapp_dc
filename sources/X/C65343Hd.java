package X;

@Deprecated
/* renamed from: X.3Hd  reason: invalid class name and case insensitive filesystem */
public class C65343Hd implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_participants_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participants_index ON group_participants (gjid, jid)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[6];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r4);
        A00.A02 = "gjid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r4, A0m);
        C54912pU.A0W(A00, r1, "jid", r4, A0m);
        C54912pU.A0B(A00, A01, "admin", r4);
        C54912pU.A0C(A00, A01, "pending", r4);
        C54912pU.A0D(A00, A01, "sent_sender_key", r4);
        r8.A0E("group_participants", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
