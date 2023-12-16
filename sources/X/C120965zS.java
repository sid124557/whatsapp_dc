package X;

import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.5zS  reason: invalid class name and case insensitive filesystem */
public final class C120965zS extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $code;
    public final /* synthetic */ boolean $forceFetchViewerMetadata;
    public final /* synthetic */ C114985nv $newsletterCallback;
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ NewsletterLinkLauncher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120965zS(C95804uY r2, C114985nv r3, NewsletterLinkLauncher newsletterLinkLauncher, String str, boolean z) {
        super(0);
        this.this$0 = newsletterLinkLauncher;
        this.$code = str;
        this.$newsletterJid = r2;
        this.$forceFetchViewerMetadata = z;
        this.$newsletterCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterLinkLauncher newsletterLinkLauncher = this.this$0;
        C56842se r2 = newsletterLinkLauncher.A0A;
        String str = this.$code;
        newsletterLinkLauncher.A00 = r2.A00(this.$newsletterJid, this.$newsletterCallback, str, false, this.$forceFetchViewerMetadata);
        return C59022wD.A00;
    }
}
