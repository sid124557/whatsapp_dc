package X;

/* renamed from: X.1h0  reason: invalid class name */
public class AnonymousClass1h0 extends AnonymousClass47C {
    public transient C56982ss A00;
    public transient C56652sL A01;
    public transient C49552gi A02;
    public transient C53942nv A03;
    public transient C56842se A04;
    public transient C162047r8 A05;
    public AnonymousClass4DF callback;
    public final String handlerType;
    public final C157007hZ metadataRequestFields;
    public final String newsletterHandle;
    public final C95804uY newsletterJid;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public AnonymousClass1h0(C95804uY r4, AnonymousClass4DF r5, C157007hZ r6) {
        super("GetNewsletterMetadataJob");
        this.newsletterHandle = null;
        this.newsletterJid = r4;
        this.handlerType = "JID";
        this.metadataRequestFields = r6;
        this.callback = r5;
    }

    public AnonymousClass1h0() {
        this((C95804uY) null, (AnonymousClass4DF) null, new C157007hZ(true, true, true, true, true, true, true, true, true, true, true, true));
    }
}
