package X;

/* renamed from: X.3xH  reason: invalid class name and case insensitive filesystem */
public final class C79843xH extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $userAccessTokenEnforced;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79843xH(C108895dj r2) {
        super(0);
        this.$userAccessTokenEnforced = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessTokenEnforced.A00("XFAM_CROSSPOSTING_REQUEST_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C18290x4.A0Y();
    }
}
