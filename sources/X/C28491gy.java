package X;

/* renamed from: X.1gy  reason: invalid class name and case insensitive filesystem */
public final class C28491gy extends AnonymousClass47C {
    public transient C56652sL A00;
    public transient AnonymousClass1VX A01;
    public transient C49552gi A02;
    public transient C56182rZ A03;
    public transient C51022j9 A04;
    public transient C49152g4 A05;
    public AnonymousClass4DG callback;
    public final boolean includeMessageEnforcements;
    public final boolean includePendingAdmins;
    public final boolean includeThreadMetadata;
    public final C95804uY newsletterJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28491gy(C95804uY r2, AnonymousClass4DG r3, boolean z, boolean z2, boolean z3) {
        super("GetNewsletterMetadataJob");
        C162457s7.A0J(r2, 1);
        this.newsletterJid = r2;
        this.includeThreadMetadata = z;
        this.includeMessageEnforcements = z2;
        this.includePendingAdmins = z3;
        this.callback = r3;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }
}
