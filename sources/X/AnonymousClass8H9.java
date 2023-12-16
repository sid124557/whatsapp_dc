package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

/* renamed from: X.8H9  reason: invalid class name */
public final class AnonymousClass8H9 implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name A00;

    public String BDZ() {
        return this.A00.A04("text");
    }

    public String getId() {
        String optString = this.A00.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C162457s7.A0D(optString);
        return optString;
    }

    public AnonymousClass8H9(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
