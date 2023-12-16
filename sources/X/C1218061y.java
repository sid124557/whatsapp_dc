package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl;

/* renamed from: X.61y  reason: invalid class name and case insensitive filesystem */
public final class C1218061y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C182808p1 $callback;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C129586aY A02;
        C153197aq r0;
        C162457s7.A0J(obj, 0);
        C153197aq A00 = ((C153197aq) obj).A00(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.class, "xwa2_newsletter_message_integrity");
        if (A00 == null || (A02 = A00.A02(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.UrlPreviews.class, "url_previews")) == null || (r0 = (C153197aq) C73723fy.A03(A02)) == null || !r0.A00.optBoolean("is_previewable")) {
            this.$callback.BJi();
        } else {
            C115075o4 r4 = (C115075o4) this.$callback;
            r4.A00.A0I.A0S(new C71323bv(35, r4.A01, r4));
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1218061y(C182808p1 r2) {
        super(1);
        this.$callback = r2;
    }
}
