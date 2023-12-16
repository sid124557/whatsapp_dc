package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7en  reason: invalid class name and case insensitive filesystem */
public final class C155387en {
    public static final Map A00;
    public static final Map A01;

    public static String A00(int i) {
        Map map = A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        Map map2 = A01;
        if (!map2.containsKey(valueOf)) {
            return "";
        }
        String A0o = C18310x6.A0o(valueOf, map);
        String A0o2 = C18310x6.A0o(valueOf, map2);
        StringBuilder A0l = AnonymousClass000.A0l(A0o);
        A0l.append(" (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#");
        A0l.append(A0o2);
        return AnonymousClass000.A0e(A0l);
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        HashMap A0t2 = AnonymousClass001.A0t();
        A01 = A0t2;
        Integer A0f = AnonymousClass0x7.A0f();
        A0t.put(A0f, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
        A0t.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        A0t.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        A0t.put(-4, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
        A0t.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A0t.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        A0t.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        A0t.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        A0t.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        A0t.put(-10, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
        A0t.put(-11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
        A0t.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A0t.put(-13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
        A0t.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        A0t.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        A0t.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        A0t.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        A0t.put(-17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        A0t2.put(A0f, "API_NOT_AVAILABLE");
        A0t2.put(-3, "NETWORK_ERROR");
        A0t2.put(-2, "PLAY_STORE_NOT_FOUND");
        A0t2.put(-4, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        A0t2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        A0t2.put(-5, "APP_NOT_INSTALLED");
        A0t2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        A0t2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        A0t2.put(-7, "APP_UID_MISMATCH");
        A0t2.put(-8, "TOO_MANY_REQUESTS");
        A0t2.put(-9, "CANNOT_BIND_TO_SERVICE");
        A0t2.put(-10, "NONCE_TOO_SHORT");
        A0t2.put(-11, "NONCE_TOO_LONG");
        A0t2.put(-13, "NONCE_IS_NOT_BASE64");
        A0t2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        A0t2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        A0t2.put(-100, "INTERNAL_ERROR");
        A0t2.put(-17, "CLIENT_TRANSIENT_ERROR");
    }
}
