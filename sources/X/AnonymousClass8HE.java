package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.8HE  reason: invalid class name */
public final class AnonymousClass8HE implements NewsletterMetadataFields.ThreadMetadata.Preview {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview A00;

    public String B75() {
        return this.A00.A04("direct_path");
    }

    public GraphQLXWA2PictureType BDz() {
        return (GraphQLXWA2PictureType) this.A00.A03(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public /* bridge */ /* synthetic */ String BE7() {
        return null;
    }

    public String getId() {
        return this.A00.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public AnonymousClass8HE(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview preview) {
        this.A00 = preview;
    }
}
