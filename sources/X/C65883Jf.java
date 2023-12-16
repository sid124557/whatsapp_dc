package X;

/* renamed from: X.3Jf  reason: invalid class name and case insensitive filesystem */
public class C65883Jf implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r3, A0w);
        A00.A02 = "sidecar";
        AnonymousClass220 r1 = AnonymousClass220.BLOB;
        C54912pU.A0b(A00, r1, A0w, A0o ? 1 : 0);
        C54912pU.A0A(A00, r1, "chunk_lengths", A0w);
        C54912pU.A0B(A00, r3, "timestamp", A0w);
        r8.A0E("message_streaming_sidecar", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_streaming_sidecar");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
