package X;

/* renamed from: X.3HG  reason: invalid class name */
public class AnonymousClass3HG implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r3, A0t);
        A00.A02 = "session_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        A00.A00 = r1;
        A00.A06 = A0m;
        A00.A04 = A0m;
        C54912pU.A0i(A00, A0t, A0m ? 1 : 0);
        C54912pU.A0W(A00, r3, "media_type", A0t, A0m);
        C54912pU.A0B(A00, r1, "caption", A0t);
        A00.A02 = "master_key";
        C54912pU.A0g(A00, AnonymousClass220.BLOB, A0t, A0m);
        r8.A0E("bcall_session", A0t);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
