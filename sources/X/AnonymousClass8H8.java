package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.8H8  reason: invalid class name */
public final class AnonymousClass8H8 implements NewsletterMetadataFields.ThreadMetadata.Description {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description A00;

    public String BDZ() {
        return this.A00.A04("text");
    }

    public String getId() {
        String optString = this.A00.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C162457s7.A0D(optString);
        return optString;
    }

    public AnonymousClass8H8(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description description) {
        this.A00 = description;
    }
}
