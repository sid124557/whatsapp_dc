package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2ec  reason: invalid class name and case insensitive filesystem */
public class C48262ec {
    public final AnonymousClass31C A00;

    public C48262ec(AnonymousClass31C r1) {
        this.A00 = r1;
    }

    public void A00(String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        A0o.append("null");
        A0o.append(" errorCode=");
        A0o.append(i);
        C18260x0.A0s(" errorMessage=", str, A0o);
        AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
        AnonymousClass39V.A04("code", Integer.toString(i), A1V);
        AnonymousClass36K r1 = new AnonymousClass36K("error", str, A1V);
        C56052rL A04 = C56052rL.A04("verify_apps");
        A04.A0H(r1);
        AnonymousClass36K A0F = A04.A0F();
        C56052rL A042 = C56052rL.A04("ib");
        A042.A0H(A0F);
        this.A00.A0G(A042.A0F(), 273);
    }

    public void A01(String str, int i, String str2) {
        AnonymousClass36K r1;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmethods/sendAttestationResult jws=");
        A0o.append(str);
        A0o.append(" errorCode=");
        A0o.append(i);
        C18260x0.A0s(" errorMessage=", str2, A0o);
        if (str == null) {
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            AnonymousClass39V.A04("code", Integer.toString(i), A1V);
            r1 = new AnonymousClass36K("error", str2, A1V);
        } else {
            r1 = new AnonymousClass36K("jws", str, (AnonymousClass39V[]) null);
        }
        this.A00.A0G(AnonymousClass36K.A0F(AnonymousClass36K.A0F(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, (AnonymousClass39V[]) null), "ib", (AnonymousClass39V[]) null), 194);
    }
}
