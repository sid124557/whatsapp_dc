package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.8HG  reason: invalid class name */
public final class AnonymousClass8HG implements NewsletterMetadataFields.ThreadMetadata.Settings {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BBs() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes.class, "reaction_codes");
        if (reactionCodes != null) {
            return new AnonymousClass8HF(reactionCodes);
        }
        return null;
    }

    public AnonymousClass8HG(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings settings) {
        this.A00 = settings;
    }
}
