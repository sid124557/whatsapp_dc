package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2te  reason: invalid class name and case insensitive filesystem */
public final class C57442te {
    public static final AnonymousClass39V[] A00(String str, String str2) {
        AnonymousClass39V r6 = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        AnonymousClass39V r5 = new AnonymousClass39V("value", "contact_blacklist");
        if (str2 == null) {
            return new AnonymousClass39V[]{r6, r5};
        }
        AnonymousClass39V[] r1 = new AnonymousClass39V[3];
        r1[0] = r6;
        r1[1] = r5;
        AnonymousClass39V.A0B("dhash", str2, r1, 2);
        return r1;
    }
}
