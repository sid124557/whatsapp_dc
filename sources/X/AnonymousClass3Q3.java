package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;

/* renamed from: X.3Q3  reason: invalid class name */
public final class AnonymousClass3Q3 implements NewsletterMetadataFields.ViewerMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata A00;

    public GraphQLXWA2NewsletterMuteSetting B9s() {
        return (GraphQLXWA2NewsletterMuteSetting) this.A00.A03(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
    }

    public GraphQLXWA2NewsletterRole BCK() {
        return (GraphQLXWA2NewsletterRole) this.A00.A03(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
    }

    public AnonymousClass3Q3(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata) {
        this.A00 = viewerMetadata;
    }
}
