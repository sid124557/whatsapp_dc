package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.8HA  reason: invalid class name */
public final class AnonymousClass8HA implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name A00;

    public String BDZ() {
        return this.A00.A04("text");
    }

    public String getId() {
        String optString = this.A00.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C162457s7.A0D(optString);
        return optString;
    }

    public AnonymousClass8HA(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
