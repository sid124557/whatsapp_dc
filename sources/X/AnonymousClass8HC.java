package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.8HC  reason: invalid class name */
public final class AnonymousClass8HC implements NewsletterMetadataFields.ThreadMetadata.Picture {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture A00;

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

    public AnonymousClass8HC(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture picture) {
        this.A00 = picture;
    }
}
