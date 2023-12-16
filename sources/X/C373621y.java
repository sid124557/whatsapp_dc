package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.21y  reason: invalid class name and case insensitive filesystem */
public enum C373621y {
    SUCCESS_FLAG("success"),
    SCREEN_DATA("screen_data"),
    ERROR("error"),
    ERROR_CODE("code"),
    ERROR_MESSAGE("message"),
    ERROR_PARAMS("params"),
    ERROR_NAME(PublicKeyCredentialControllerUtility.JSON_KEY_NAME),
    RESUMABLE_DATA("resumable_data");
    
    public final String key;

    /* access modifiers changed from: public */
    static {
        C373621y[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    C373621y(String str) {
        this.key = str;
    }
}
