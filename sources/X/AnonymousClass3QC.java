package X;

import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.3QC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3QC implements AnonymousClass65H {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public final void BPQ(C368620a r4) {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        C18260x0.A1P(AnonymousClass001.A0o(), "idverification/onverificationresult Identity verification on identity verification page for contact and self: ", r4);
        C18260x0.A1P(AnonymousClass001.A0o(), "idverification/updateui Updating UI based off of key transparency verification result: ", r4);
        identityVerificationActivity.runOnUiThread(new C70103Zx(identityVerificationActivity, 42, r4));
    }

    public /* synthetic */ AnonymousClass3QC(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }
}
