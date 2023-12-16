package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.3Q5  reason: invalid class name */
public final class AnonymousClass3Q5 implements NewsletterMetadataFields {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BDd() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata threadMetadata = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new AnonymousClass8HI(threadMetadata);
        }
        return null;
    }

    public AnonymousClass3Q5(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate xwa2NotifyNewsletterOnMetadataUpdate) {
        this.A00 = xwa2NotifyNewsletterOnMetadataUpdate;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BDI() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BEO() {
        return null;
    }
}
