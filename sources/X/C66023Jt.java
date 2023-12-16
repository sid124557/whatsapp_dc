package X;

/* renamed from: X.3Jt  reason: invalid class name and case insensitive filesystem */
public class C66023Jt implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("messages_thumbnail_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS messages_thumbnail_key_index ON message_thumbnails (key_remote_jid, key_from_me, key_id)");
    }

    public void B3j(C41492Kl r10, C56622sI r11) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[2];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        A00.A00 = A02;
        boolean A0p = C54912pU.A0p(A00, r2);
        A00.A02 = "thumbnail";
        AnonymousClass220 r1 = AnonymousClass220.BLOB;
        C54912pU.A0b(A00, r1, r2, 1);
        r11.A0E("message_thumbnail", r2);
        C59422wt[] r22 = new C59422wt[5];
        C54912pU.A0U(A00, r1, "thumbnail", r22, A0p ? 1 : 0);
        A00.A02 = "timestamp";
        C54912pU.A0b(A00, AnonymousClass220.DATETIME, r22, 1);
        A00.A02 = "key_remote_jid";
        AnonymousClass220 r12 = AnonymousClass220.TEXT;
        A00.A00 = r12;
        A00.A04 = true;
        C54912pU.A0i(A00, r22, 2);
        C54912pU.A0B(A00, A02, "key_from_me", r22);
        A00.A02 = "key_id";
        C54912pU.A0g(A00, r12, r22, true);
        r11.A0E("message_thumbnails", r22);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_thumbnail");
    }
}
