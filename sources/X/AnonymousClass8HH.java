package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

/* renamed from: X.8HH  reason: invalid class name */
public final class AnonymousClass8HH implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata A00;

    public String B6D() {
        return this.A00.A04("creation_time");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description B6w() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description description = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new AnonymousClass8H7(description);
        }
        return null;
    }

    public String B7z() {
        return this.A00.A04("handle");
    }

    public String B8T() {
        return this.A00.A04("invite");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name B9u() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new AnonymousClass8H9(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BBK() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image image = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image.class, "image");
        if (image != null) {
            return new AnonymousClass8HB(image);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BBd() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview preview = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview) this.A00.A00(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new AnonymousClass8HD(preview);
        }
        return null;
    }

    public NewsletterMetadataFields.ThreadMetadata.Settings BCu() {
        return null;
    }

    public String BDN() {
        return this.A00.A04("subscribers_count");
    }

    public GraphQLXWA2NewsletterVerifyState BEE() {
        return (GraphQLXWA2NewsletterVerifyState) this.A00.A03(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
    }

    public AnonymousClass8HH(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }
}
