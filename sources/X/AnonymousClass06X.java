package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.06X  reason: invalid class name */
public final class AnonymousClass06X extends C03710Lg {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass06X(java.lang.String r9) {
        /*
            r8 = this;
            r7 = 0
            r0 = 1
            X.C162457s7.A0J(r9, r0)
            X.0L8 r6 = A00(r9)
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r4 = "androidx.credentials.BUNDLE_KEY_SUBTYPE"
            java.lang.String r3 = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST"
            r5.putString(r4, r3)
            java.lang.String r2 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            r5.putString(r2, r9)
            java.lang.String r1 = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"
            r5.putByteArray(r1, r7)
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            r0.putString(r4, r3)
            r0.putString(r2, r9)
            r0.putByteArray(r1, r7)
            r8.<init>(r5, r0, r6)
            r8.A00 = r9
            boolean r0 = X.AnonymousClass0IM.A00(r9)
            if (r0 == 0) goto L_0x0037
            return
        L_0x0037:
            java.lang.String r0 = "requestJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06X.<init>(java.lang.String):void");
    }

    public static final AnonymousClass0L8 A00(String str) {
        String str2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (!jSONObject.isNull(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
                str2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            }
            C162457s7.A0D(string);
            return new AnonymousClass0L8(string, str2);
        } catch (Exception unused) {
            throw AnonymousClass001.A0c("user.name must be defined in requestJson");
        }
    }
}
