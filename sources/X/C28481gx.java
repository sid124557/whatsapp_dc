package X;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public final class C28481gx extends AnonymousClass47C {
    public transient C56612sH A00;
    public transient C56662sM A01;
    public transient C49552gi A02;
    public transient C50142hh A03;
    public transient C162047r8 A04;
    public C83984Ao callback;
    public final C95804uY newsletterJid;
    public final C371521d typeOfFetch;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public C28481gx(C371521d r2, C95804uY r3, C83984Ao r4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.typeOfFetch = r2;
        this.callback = r4;
    }
}
