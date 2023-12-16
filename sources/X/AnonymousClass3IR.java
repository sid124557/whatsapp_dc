package X;

/* renamed from: X.3IR  reason: invalid class name */
public class AnonymousClass3IR implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[7];
        boolean A0o = C54912pU.A0o(A00, AnonymousClass220.A02(A00), r3);
        A00.A02 = "latitude";
        AnonymousClass220 r1 = AnonymousClass220.REAL;
        C54912pU.A0b(A00, r1, r3, A0o ? 1 : 0);
        C54912pU.A0A(A00, r1, "longitude", r3);
        A00.A02 = "place_name";
        AnonymousClass220 r12 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r12, r3);
        C54912pU.A0C(A00, r12, "place_address", r3);
        C54912pU.A0D(A00, r12, "url", r3);
        r3[6] = AnonymousClass220.A00(A00, "thumbnail");
        r7.A0E("message_quoted_location", r3);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A01(r4, "message_quoted_location");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
