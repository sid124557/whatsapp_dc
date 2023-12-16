package X;

/* renamed from: X.3xE  reason: invalid class name and case insensitive filesystem */
public final class C79813xE extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $userAccessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79813xE(C108895dj r2) {
        super(0);
        this.$userAccessToken = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessToken.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_TOKEN_XCHANGE_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C18290x4.A0Y();
    }
}
