package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.29c  reason: invalid class name and case insensitive filesystem */
public final class C387629c {
    public static final C56052rL A00(String str, int i, boolean z) {
        String str2;
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0B(A01, "smax_id", i);
        C56052rL.A0D(A01, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        C56052rL.A0D(A01, "xmlns", "waffle");
        if (z) {
            str2 = "get";
        } else {
            str2 = "set";
        }
        C56052rL.A0E(A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        return A01;
    }
}
