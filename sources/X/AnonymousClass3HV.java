package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3HV  reason: invalid class name */
public final class AnonymousClass3HV implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_event_name_index", "CREATE INDEX IF NOT EXISTS message_event_name_index ON message_event (name)");
        r5.A0B("message_event_chat_row_id_and_start_time_index", "CREATE INDEX IF NOT EXISTS message_event_chat_row_id_and_start_time_index ON message_event (chat_row_id, start_time)");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean] */
    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[11];
        AnonymousClass220 A02 = AnonymousClass220.A02(A01);
        ? A0n = C54912pU.A0n(A01, A02, r3);
        r3[A0n] = C54912pU.A04(A01, A02, "is_canceled", 0);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        AnonymousClass220 r5 = AnonymousClass220.TEXT;
        C54912pU.A0e(A01, r5, r3, A0n);
        C54912pU.A0B(A01, r5, "description", r3);
        A01.A02 = "location_latitude";
        AnonymousClass220 r1 = AnonymousClass220.REAL;
        C54912pU.A0a(A01, r1, r3);
        C54912pU.A0D(A01, r1, "location_longitude", r3);
        C54912pU.A0E(A01, r5, "location_name", r3);
        C54912pU.A0F(A01, r5, "location_address", r3);
        C54912pU.A0G(A01, r5, "join_link", r3);
        A01.A02 = "start_time";
        A01.A00 = AnonymousClass220.DATETIME;
        A01.A04 = A0n;
        r3[9] = A01.A0x();
        C54912pU.A0I(A01, A02, "chat_row_id", r3);
        r9.A0E("message_event", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C162457s7.A0J(r4, 0);
        C56622sI.A00(r4, "message_event");
    }
}
