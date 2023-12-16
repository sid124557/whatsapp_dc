package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;

/* renamed from: X.8HF  reason: invalid class name */
public final class AnonymousClass8HF implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes A00;

    public C129586aY B4i() {
        return this.A00.A01();
    }

    public String B7J() {
        return this.A00.A04("enabled_ts_sec");
    }

    public GraphQLXWA2NewsletterReactionCodesSettingValue BE9() {
        GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue = (GraphQLXWA2NewsletterReactionCodesSettingValue) this.A00.A03(GraphQLXWA2NewsletterReactionCodesSettingValue.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value");
        C162457s7.A0D(graphQLXWA2NewsletterReactionCodesSettingValue);
        return graphQLXWA2NewsletterReactionCodesSettingValue;
    }

    public AnonymousClass8HF(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes) {
        this.A00 = reactionCodes;
    }
}
