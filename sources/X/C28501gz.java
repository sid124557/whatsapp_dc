package X;

/* renamed from: X.1gz  reason: invalid class name and case insensitive filesystem */
public final class C28501gz extends AnonymousClass47C {
    public transient C64773Ex A00;
    public transient C56332ro A01;
    public transient C56982ss A02;
    public transient C56652sL A03;
    public transient C49552gi A04;
    public transient C56842se A05;
    public transient C162047r8 A06;
    public AnonymousClass4DF callback;
    public final String description;
    public final String name;
    public final C95804uY newsletterJid;
    public final C372921r newsletterReactionSettings;
    public final byte[] picture;
    public final boolean updateDescription;
    public final boolean updateName;
    public final boolean updatePicture;
    public final boolean updateReactionSetting;

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public C28501gz(C372921r r2, C95804uY r3, AnonymousClass4DF r4, String str, String str2, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.name = str;
        this.description = str2;
        this.picture = bArr;
        this.newsletterReactionSettings = r2;
        this.updateName = z;
        this.updateDescription = z2;
        this.updatePicture = z3;
        this.updateReactionSetting = z4;
        this.callback = r4;
    }
}
