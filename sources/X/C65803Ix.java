package X;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
public class C65803Ix implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_view_once_media_state_index", "CREATE INDEX IF NOT EXISTS message_view_once_media_state_index ON message_view_once_media (state)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0u = C54912pU.A0u(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A00, r2, "state", A0u, C54912pU.A0o(A00, r2, A0u));
        r7.A0E("message_view_once_media", A0u);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_view_once_media");
    }
}
