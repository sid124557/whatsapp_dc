package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass06X;
import X.AnonymousClass071;
import X.AnonymousClass072;
import X.AnonymousClass078;
import X.AnonymousClass07A;
import X.AnonymousClass07C;
import X.AnonymousClass07E;
import X.AnonymousClass07F;
import X.AnonymousClass07K;
import X.AnonymousClass07M;
import X.AnonymousClass07O;
import X.AnonymousClass07R;
import X.AnonymousClass07S;
import X.AnonymousClass0GP;
import X.AnonymousClass0GQ;
import X.AnonymousClass0KV;
import X.AnonymousClass2A3;
import X.AnonymousClass6T6;
import X.AnonymousClass6TC;
import X.AnonymousClass6TI;
import X.AnonymousClass6UU;
import X.AnonymousClass6UV;
import X.AnonymousClass6UW;
import X.AnonymousClass6UX;
import X.AnonymousClass7Xw;
import X.C006606f;
import X.C007106k;
import X.C007906s;
import X.C008506y;
import X.C008606z;
import X.C127206Rb;
import X.C127466Sb;
import X.C127476Sc;
import X.C127486Sd;
import X.C127576Sm;
import X.C127596So;
import X.C127636Ss;
import X.C127656Su;
import X.C127676Sw;
import X.C127696Sy;
import X.C127836Tm;
import X.C142946y4;
import X.C142966y6;
import X.C142976y7;
import X.C142996y9;
import X.C143186yT;
import X.C152897aL;
import X.C152907aM;
import X.C152917aN;
import X.C153637bh;
import X.C162457s7;
import X.C166347yX;
import X.C175728Zm;
import X.C378924l;
import X.C73813g7;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Companion();
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final LinkedHashMap orderedErrorCodeToExceptions = C73813g7.A09(AnonymousClass2A3.A00(C142946y4.UNKNOWN_ERR, new AnonymousClass07O()), AnonymousClass2A3.A00(C142946y4.ABORT_ERR, new C008506y()), AnonymousClass2A3.A00(C142946y4.ATTESTATION_NOT_PRIVATE_ERR, new AnonymousClass07E()), AnonymousClass2A3.A00(C142946y4.CONSTRAINT_ERR, new C008606z()), AnonymousClass2A3.A00(C142946y4.DATA_ERR, new AnonymousClass071()), AnonymousClass2A3.A00(C142946y4.INVALID_STATE_ERR, new AnonymousClass078()), AnonymousClass2A3.A00(C142946y4.ENCODING_ERR, new AnonymousClass072()), AnonymousClass2A3.A00(C142946y4.NETWORK_ERR, new AnonymousClass07A()), AnonymousClass2A3.A00(C142946y4.NOT_ALLOWED_ERR, new AnonymousClass07C()), AnonymousClass2A3.A00(C142946y4.NOT_SUPPORTED_ERR, new AnonymousClass07F()), AnonymousClass2A3.A00(C142946y4.SECURITY_ERR, new AnonymousClass07K()), AnonymousClass2A3.A00(C142946y4.TIMEOUT_ERR, new AnonymousClass07M()));

    public final class Companion {
        public final byte[] b64Decode(String str) {
            C162457s7.A0J(str, 0);
            byte[] decode = Base64.decode(str, 11);
            C162457s7.A0D(decode);
            return decode;
        }

        public final String b64Encode(byte[] bArr) {
            C162457s7.A0J(bArr, 0);
            String encodeToString = Base64.encodeToString(bArr, 11);
            C162457s7.A0D(encodeToString);
            return encodeToString;
        }

        public final void beginSignInAssertionResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, JSONObject jSONObject, String str, byte[] bArr5, String str2, String str3, boolean z, Boolean bool) {
            C162457s7.A0J(bArr, 0);
            C162457s7.A0J(bArr2, 1);
            C162457s7.A0J(bArr3, 2);
            C162457s7.A0J(jSONObject, 4);
            C162457s7.A0J(str, 5);
            C162457s7.A0J(bArr5, 6);
            C162457s7.A0J(str2, 7);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA, b64Encode(bArr));
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, b64Encode(bArr2));
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, b64Encode(bArr3));
            if (bArr4 != null) {
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE, PublicKeyCredentialControllerUtility.Companion.b64Encode(bArr4));
            }
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, jSONObject2);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID, b64Encode(bArr5));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            addOptionalAuthenticatorAttachmentAndRequiredExtensions(str3, z, bool, jSONObject);
        }

        public final AnonymousClass0GQ beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(C142946y4 r4, String str) {
            C162457s7.A0J(r4, 0);
            AnonymousClass0KV r2 = (AnonymousClass0KV) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(r4);
            if (r2 == null) {
                return new AnonymousClass07S(new AnonymousClass07O(), AnonymousClass000.A0V("unknown fido gms exception - ", str, AnonymousClass001.A0o()));
            }
            if (r4 == C142946y4.CONSTRAINT_ERR && str != null && C175728Zm.A0S(str, "Unable to get sync account", false)) {
                return new C007906s("Passkey retrieval was cancelled by the user.");
            }
            return new AnonymousClass07S(r2, str);
        }

        public final AnonymousClass6UX convert(AnonymousClass06X r3) {
            C162457s7.A0J(r3, 0);
            JSONObject jSONObject = new JSONObject(r3.A00);
            C153637bh r0 = new C153637bh();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, r0);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, r0);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, r0);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, r0);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, r0);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, r0);
            return r0.A00();
        }

        public final C127576Sm convertToPlayAuthPasskeyJsonRequest(C006606f r3) {
            C162457s7.A0J(r3, 0);
            AnonymousClass7Xw r1 = new AnonymousClass7Xw();
            r1.A01();
            r1.A02(r3.A00);
            return r1.A00();
        }

        public final C127636Ss convertToPlayAuthPasskeyRequest(C006606f r5) {
            C162457s7.A0J(r5, 0);
            JSONObject jSONObject = new JSONObject(r5.A00);
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            C162457s7.A0D(optString);
            if (optString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            byte[] challenge = getChallenge(jSONObject);
            C152897aL r0 = new C152897aL();
            r0.A01();
            r0.A02(optString);
            r0.A03(challenge);
            return r0.A00();
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r8) {
            C142996y9 r1;
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r8, 1);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                C152917aN r4 = new C152917aN();
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, false);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                C162457s7.A0D(optString);
                if (optString.length() > 0) {
                    r1 = C142996y9.A00(optString);
                } else {
                    r1 = null;
                }
                r4.A03(Boolean.valueOf(optBoolean));
                r4.A02(r1);
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                C162457s7.A0D(optString2);
                if (optString2.length() > 0) {
                    r4.A01(C142966y6.A00(optString2));
                }
                r8.A03(r4.A00());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r8) {
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r8, 1);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                C152907aM r2 = new C152907aM();
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                C162457s7.A0D(optString);
                if (optString.length() > 0) {
                    r2.A01(new C127466Sb(optString));
                }
                if (jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    r2.A02(new C127476Sc(true));
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    r2.A03(new C127486Sd(true));
                }
                r8.A02(r2.A00());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r6) {
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r6, 1);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            if (jSONObject.has(str)) {
                r6.A06(Double.valueOf(((double) jSONObject.getLong(str)) / ((double) 1000)));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r13) {
            ArrayList arrayList;
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r13, 1);
            ArrayList A0s = AnonymousClass001.A0s();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C162457s7.A0D(string);
                    byte[] b64Decode = b64Decode(string);
                    String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    C162457s7.A0D(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    } else if (b64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    } else {
                        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                        if (jSONObject2.has(str2)) {
                            arrayList = AnonymousClass001.A0s();
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                            int length2 = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length2) {
                                try {
                                    Transport A00 = Transport.A00(jSONArray2.getString(i2));
                                    C162457s7.A0D(A00);
                                    arrayList.add(A00);
                                    i2++;
                                } catch (C143186yT e) {
                                    throw new AnonymousClass07R(new AnonymousClass072(), e.getMessage());
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        A0s.add(new C127676Sw(string2, arrayList, b64Decode));
                        i++;
                    }
                }
            }
            r13.A07(A0s);
            String str3 = "none";
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, str3);
            C162457s7.A0D(optString);
            if (optString.length() != 0) {
                str3 = optString;
            }
            r13.A01(C142976y7.A00(str3));
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r8) {
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r8, 1);
            r8.A09(getChallenge(jSONObject));
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C162457s7.A0D(string);
            byte[] b64Decode = b64Decode(string);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            C162457s7.A0D(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            } else if (b64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            } else {
                C162457s7.A0D(string2);
                if (string2.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
                }
                r8.A05(new C127696Sy(string2, optString, string3, b64Decode));
            }
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, C153637bh r11) {
            C162457s7.A0J(jSONObject, 0);
            C162457s7.A0J(r11, 1);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            C162457s7.A0H(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            C162457s7.A0D(optString);
            if (optString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            C162457s7.A0D(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            r11.A04(new C127656Su(string, optString, optString2));
            JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
            ArrayList A0s = AnonymousClass001.A0s();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                C162457s7.A0D(optString3);
                if (optString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    A0s.add(new C127596So(optString3, i2));
                }
            }
            r11.A08(A0s);
        }

        public final AnonymousClass0GP publicKeyCredentialResponseContainsError(C127836Tm r5) {
            C162457s7.A0J(r5, 0);
            C127206Rb A02 = r5.A02();
            if (!(A02 instanceof AnonymousClass6UU)) {
                return null;
            }
            AnonymousClass6UU r3 = (AnonymousClass6UU) A02;
            C142946y4 A00 = r3.A00();
            C162457s7.A0D(A00);
            AnonymousClass0KV r2 = (AnonymousClass0KV) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(A00);
            String A01 = r3.A01();
            if (r2 == null) {
                return new AnonymousClass07R(new AnonymousClass07O(), AnonymousClass000.A0V("unknown fido gms exception - ", A01, AnonymousClass001.A0o()));
            }
            if (A00 == C142946y4.CONSTRAINT_ERR && A01 != null && C175728Zm.A0S(A01, "Unable to get sync account", false)) {
                return new C007106k("Passkey registration was cancelled by the user.");
            }
            return new AnonymousClass07R(r2, A01);
        }

        public final String toAssertPasskeyResponse(AnonymousClass6TI r16) {
            C127206Rb r2;
            AnonymousClass6TI r1 = r16;
            C162457s7.A0J(r1, 0);
            JSONObject jSONObject = new JSONObject();
            C127836Tm A01 = r1.A01();
            Boolean bool = null;
            if (A01 != null) {
                r2 = A01.A02();
            } else {
                r2 = null;
            }
            C162457s7.A0H(r2);
            if (!(r2 instanceof AnonymousClass6UU)) {
                if (r2 instanceof AnonymousClass6UW) {
                    AnonymousClass6UW r22 = (AnonymousClass6UW) r2;
                    byte[] A012 = r22.A01();
                    C162457s7.A0D(A012);
                    byte[] A00 = r22.A00();
                    C162457s7.A0D(A00);
                    byte[] A02 = r22.A02();
                    C162457s7.A0D(A02);
                    byte[] A03 = r22.A03();
                    String A04 = A01.A04();
                    C162457s7.A0D(A04);
                    byte[] A06 = A01.A06();
                    C162457s7.A0D(A06);
                    String A05 = A01.A05();
                    C162457s7.A0D(A05);
                    String A032 = A01.A03();
                    AnonymousClass6TC A013 = A01.A01();
                    boolean z = false;
                    if (A013 != null) {
                        z = true;
                        AnonymousClass6T6 A002 = A013.A00();
                        if (A002 != null) {
                            bool = Boolean.valueOf(A002.A00());
                        }
                    }
                    beginSignInAssertionResponse$credentials_play_services_auth_release(A012, A00, A02, A03, jSONObject, A04, A06, A05, A032, z, bool);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("AuthenticatorResponse expected assertion response but got: ");
                    Log.e(PublicKeyCredentialControllerUtility.TAG, AnonymousClass000.A0X(AnonymousClass000.A0O(r2), A0o));
                }
                String obj = jSONObject.toString();
                C162457s7.A0D(obj);
                return obj;
            }
            AnonymousClass6UU r23 = (AnonymousClass6UU) r2;
            C142946y4 A003 = r23.A00();
            C162457s7.A0D(A003);
            throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(A003, r23.A01());
        }

        public final String toCreatePasskeyResponseJson(C127836Tm r6) {
            Boolean bool;
            C162457s7.A0J(r6, 0);
            JSONObject jSONObject = new JSONObject();
            C127206Rb A02 = r6.A02();
            if (A02 instanceof AnonymousClass6UV) {
                JSONObject jSONObject2 = new JSONObject();
                String str = PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
                AnonymousClass6UV r4 = (AnonymousClass6UV) A02;
                byte[] A01 = r4.A01();
                C162457s7.A0D(A01);
                jSONObject2.put(str, b64Encode(A01));
                String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
                byte[] A00 = r4.A00();
                C162457s7.A0D(A00);
                jSONObject2.put(str2, b64Encode(A00));
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(convertToProperNamingScheme(r4)));
                jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, jSONObject2);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Authenticator response expected registration response but got: ");
                Log.e(PublicKeyCredentialControllerUtility.TAG, AnonymousClass000.A0X(AnonymousClass000.A0O(A02), A0o));
            }
            String A03 = r6.A03();
            AnonymousClass6TC A012 = r6.A01();
            boolean z = false;
            if (A012 != null) {
                z = true;
                AnonymousClass6T6 A002 = A012.A00();
                if (A002 != null) {
                    bool = Boolean.valueOf(A002.A00());
                    addOptionalAuthenticatorAttachmentAndRequiredExtensions(A03, z, bool, jSONObject);
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A04());
                    String str3 = PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
                    byte[] A06 = r6.A06();
                    C162457s7.A0D(A06);
                    jSONObject.put(str3, b64Encode(A06));
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.A05());
                    String obj = jSONObject.toString();
                    C162457s7.A0D(obj);
                    return obj;
                }
            }
            bool = null;
            addOptionalAuthenticatorAttachmentAndRequiredExtensions(A03, z, bool, jSONObject);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A04());
            String str32 = PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
            byte[] A062 = r6.A06();
            C162457s7.A0D(A062);
            jSONObject.put(str32, b64Encode(A062));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.A05());
            String obj2 = jSONObject.toString();
            C162457s7.A0D(obj2);
            return obj2;
        }

        private final void addOptionalAuthenticatorAttachmentAndRequiredExtensions(String str, boolean z, Boolean bool, JSONObject jSONObject) {
            if (str != null) {
                jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (z && bool != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_RK, bool.booleanValue());
                    jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS, jSONObject3);
                } catch (Throwable th) {
                    Log.e(PublicKeyCredentialControllerUtility.TAG, AnonymousClass000.A0P(th, "ClientExtensionResults faced possible implementation inconsistency in uvmEntries - ", AnonymousClass001.A0o()));
                }
            }
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS, jSONObject2);
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            C162457s7.A0D(optString);
            if (optString.length() != 0) {
                return b64Decode(optString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        private final String[] convertToProperNamingScheme(AnonymousClass6UV r7) {
            String[] A02 = r7.A02();
            C162457s7.A0D(A02);
            int i = 0;
            for (String A0P : A02) {
                if (C162457s7.A0P(A0P, "cable")) {
                    A02[i] = "hybrid";
                }
                i++;
            }
            return A02;
        }

        public final boolean checkAlgSupported(int i) {
            try {
                C166347yX.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(C378924l r1) {
        }

        public Companion() {
        }
    }

    public static final AnonymousClass6UX convert(AnonymousClass06X r1) {
        return Companion.convert(r1);
    }
}
