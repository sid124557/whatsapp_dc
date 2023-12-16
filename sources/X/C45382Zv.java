package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterQueryMessageDeliveryUpdatesQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterQueryMessageDeliveryUpdatesResponseImpl;

/* renamed from: X.2Zv  reason: invalid class name and case insensitive filesystem */
public final class C45382Zv {
    public final C49552gi A00;
    public final C56182rZ A01;
    public final C49152g4 A02;

    public final void A00(C95804uY r5) {
        C162457s7.A0J(r5, 0);
        NewsletterQueryMessageDeliveryUpdatesQueryImpl$Builder newsletterQueryMessageDeliveryUpdatesQueryImpl$Builder = new NewsletterQueryMessageDeliveryUpdatesQueryImpl$Builder();
        String obj = r5.toString();
        C50712ie r3 = newsletterQueryMessageDeliveryUpdatesQueryImpl$Builder.A00;
        r3.A02("jid", obj);
        C162187rP.A06(AnonymousClass000.A1W(obj));
        this.A00.A01(new AnonymousClass7J9(r3, NewsletterQueryMessageDeliveryUpdatesResponseImpl.class, "NewsletterQueryMessageDeliveryUpdates")).A01(new C824343o(r5, this));
    }

    public C45382Zv(C49552gi r1, C56182rZ r2, C49152g4 r3) {
        C18260x0.A0S(r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
