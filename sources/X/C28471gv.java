package X;

/* renamed from: X.1gv  reason: invalid class name and case insensitive filesystem */
public final class C28471gv extends AnonymousClass47C {
    public transient C55682qk A00;
    public transient C56982ss A01;
    public transient C56652sL A02;
    public transient AnonymousClass31C A03;
    public transient C56842se A04;
    public transient C56212rc A05;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final C83994Ap callback;
    public final long count;
    public final boolean fetchingForGaps;
    public final C95804uY newsletterJid;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28471gv(C95804uY r2, C83994Ap r3, Long l, Long l2, String str, long j, boolean z) {
        super("GetNewsletterMetadataJob");
        C162457s7.A0J(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.fetchingForGaps = z;
        this.token = str;
        this.callback = r3;
    }
}
