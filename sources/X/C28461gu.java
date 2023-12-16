package X;

/* renamed from: X.1gu  reason: invalid class name and case insensitive filesystem */
public final class C28461gu extends AnonymousClass47C {
    public transient C55682qk A00;
    public transient C56652sL A01;
    public transient AnonymousClass31C A02;
    public transient C56842se A03;
    public transient C56212rc A04;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final AnonymousClass4GQ callback;
    public final long count;
    public final C95804uY newsletterJid;
    public final long sinceMs;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28461gu(C95804uY r2, Long l, Long l2, String str, AnonymousClass4GQ r6, long j, long j2) {
        super("GetNewsletterMetadataJob");
        C162457s7.A0J(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.sinceMs = j2;
        this.token = str;
        this.callback = r6;
    }
}
