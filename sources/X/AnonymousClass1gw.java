package X;

/* renamed from: X.1gw  reason: invalid class name */
public final class AnonymousClass1gw extends AnonymousClass47C {
    public transient C49552gi A00;
    public C179558jL callback;
    public final String messageSortId;
    public final C95804uY newsletterJid;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public AnonymousClass1gw(C95804uY r2, C179558jL r3, String str) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.messageSortId = str;
        this.callback = r3;
    }
}
