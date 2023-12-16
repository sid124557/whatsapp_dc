package X;

/* renamed from: X.5zP  reason: invalid class name and case insensitive filesystem */
public final class C120935zP extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C182798p0 $callback;
    public final /* synthetic */ int $messageType;
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ long $serverMessageId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120935zP(C95804uY r2, C182798p0 r3, int i, long j) {
        super(0);
        this.$callback = r3;
        this.$newsletterJid = r2;
        this.$serverMessageId = j;
        this.$messageType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$callback.BdR(this.$newsletterJid, this.$messageType, this.$serverMessageId);
        return C59022wD.A00;
    }
}
