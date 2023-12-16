package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2XY  reason: invalid class name */
public final class AnonymousClass2XY {
    public final /* synthetic */ C41182Jg A00;
    public final /* synthetic */ C50292hw A01;

    public AnonymousClass2XY(C41182Jg r1, C50292hw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(boolean z) {
        C18260x0.A1D("acceptDisclaimerV2/onResult/", AnonymousClass001.A0o(), z);
        this.A01.A00.BkS(new C117175rV(this.A00, 25, C57692u3.A04(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, C57692u3.A04("success", Boolean.valueOf(z)))));
    }
}
