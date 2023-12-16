package X;

/* renamed from: X.3IA  reason: invalid class name */
public class AnonymousClass3IA implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[13];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        C54912pU.A0U(A00, A02, "chat_row_id", r4, C54912pU.A0o(A00, A02, r4) ? 1 : 0);
        A00.A02 = "latitude";
        AnonymousClass220 r2 = AnonymousClass220.REAL;
        C54912pU.A0Y(A00, r2, r4);
        C54912pU.A0B(A00, r2, "longitude", r4);
        A00.A02 = "place_name";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0a(A00, r1, r4);
        C54912pU.A0D(A00, r1, "place_address", r4);
        C54912pU.A0E(A00, r1, "url", r4);
        C54912pU.A0F(A00, A02, "live_location_share_duration", r4);
        C54912pU.A0G(A00, A02, "live_location_sequence_number", r4);
        C54912pU.A0H(A00, r2, "live_location_final_latitude", r4);
        C54912pU.A0I(A00, r2, "live_location_final_longitude", r4);
        C54912pU.A0J(A00, A02, "live_location_final_timestamp", r4);
        C54912pU.A0K(A00, A02, "map_download_status", r4);
        r8.A0E("message_location", r4);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_location");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
