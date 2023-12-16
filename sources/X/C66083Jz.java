package X;

import java.util.Collections;

/* renamed from: X.3Jz  reason: invalid class name and case insensitive filesystem */
public final class C66083Jz implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("status_crossposting_v3_state_idx", "CREATE INDEX IF NOT EXISTS status_crossposting_v3_state_idx ON status_crossposting_v3 (state)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r4 = new C59422wt[7];
        A01.A02 = "status_message_row_id";
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        C54912pU.A0b(A01, r3, r4, 0);
        A01.A02 = "crossposting_session_id";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        r4[1] = C54912pU.A02(A01, r2);
        C54912pU.A0A(A01, r2, "crossposting_status_unique_id", r4);
        C54912pU.A0B(A01, r3, "state", r4);
        C54912pU.A0C(A01, r2, "media_file_path", r4);
        C54912pU.A0D(A01, r2, "direct_url_path", r4);
        C54912pU.A0E(A01, r3, "destination", r4);
        r8.A0D("status_crossposting_v3", AnonymousClass8UF.A0o(r4), Collections.singletonList("PRIMARY KEY (status_message_row_id, destination)"));
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A03(r6, "message", "status_crossposting_v3", "status_message_row_id=old._id");
    }
}
