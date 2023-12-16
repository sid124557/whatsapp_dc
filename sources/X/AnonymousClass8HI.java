package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

/* renamed from: X.8HI  reason: invalid class name */
public final class AnonymousClass8HI implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata A00;

    public /* bridge */ /* synthetic */ String B6D() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description B6w() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description description = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new AnonymousClass8H8(description);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ String B7z() {
        return null;
    }

    public /* bridge */ /* synthetic */ String B8T() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name B9u() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name name = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new AnonymousClass8HA(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BBK() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture picture = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture.class, "picture");
        if (picture != null) {
            return new AnonymousClass8HC(picture);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BBd() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview preview = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new AnonymousClass8HE(preview);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings BCu() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings settings = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings) this.A00.A00(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.class, "settings");
        if (settings != null) {
            return new AnonymousClass8HG(settings);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ String BDN() {
        return null;
    }

    public GraphQLXWA2NewsletterVerifyState BEE() {
        return (GraphQLXWA2NewsletterVerifyState) this.A00.A03(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
    }

    public AnonymousClass8HI(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }
}
