package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;

/* renamed from: X.5xm  reason: invalid class name and case insensitive filesystem */
public final class C119935xm extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ InviteNewsletterAdminSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119935xm(InviteNewsletterAdminSelector inviteNewsletterAdminSelector) {
        super(0);
        this.this$0 = inviteNewsletterAdminSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra = this.this$0.getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }
}
