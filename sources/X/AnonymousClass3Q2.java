package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.3Q2  reason: invalid class name */
public final class AnonymousClass3Q2 implements NewsletterMetadataFields.State {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State A00;

    public GraphQLXWA2NewsletterStateType BDy() {
        return (GraphQLXWA2NewsletterStateType) this.A00.A03(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public AnonymousClass3Q2(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state) {
        this.A00 = state;
    }
}
