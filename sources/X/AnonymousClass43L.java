package X;

/* renamed from: X.43L  reason: invalid class name */
public final class AnonymousClass43L extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C85284Fq $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43L(C85284Fq r2) {
        super(1);
        this.$session = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C624134x r6 = (C624134x) obj;
        C162457s7.A0J(r6, 0);
        C56862sg r4 = ((AnonymousClass3H0) this.$session).A03;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C624134x.A0Y(r6, A1Y, 0);
        return Integer.valueOf(r4.A07("message", "_id=?", "deleteMessageInBackground/DELETE_MESSAGE", A1Y));
    }
}
