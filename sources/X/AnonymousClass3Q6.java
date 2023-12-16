package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;

/* renamed from: X.3Q6  reason: invalid class name */
public final class AnonymousClass3Q6 implements NewsletterMetadataFields {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BDI() {
        NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state = (NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) this.A00.A00(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class, "state");
        if (state != null) {
            return new AnonymousClass3Q2(state);
        }
        return null;
    }

    public AnonymousClass3Q6(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange xwa2NotifyNewsletterOnStateChange) {
        this.A00 = xwa2NotifyNewsletterOnStateChange;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BDd() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BEO() {
        return null;
    }
}
