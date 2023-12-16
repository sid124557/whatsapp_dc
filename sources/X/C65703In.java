package X;

/* renamed from: X.3In  reason: invalid class name and case insensitive filesystem */
public class C65703In implements AnonymousClass4ED {
    public void B3j(C41492Kl r5, C56622sI r6) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        boolean A0o = C54912pU.A0o(A00, AnonymousClass220.INTEGER, A0w);
        A00.A02 = "new_photo_id";
        C54912pU.A0b(A00, AnonymousClass220.TEXT, A0w, A0o ? 1 : 0);
        A00.A02 = "old_photo";
        AnonymousClass220 r1 = AnonymousClass220.BLOB;
        C54912pU.A0Y(A00, r1, A0w);
        C54912pU.A0B(A00, r1, "new_photo", A0w);
        r6.A0E("message_system_photo_change", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_photo_change");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
