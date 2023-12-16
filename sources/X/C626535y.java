package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.35y  reason: invalid class name and case insensitive filesystem */
public final class C626535y {
    public static AnonymousClass39G A01(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        long j = jSONObject.getLong("value");
        int i = jSONObject.getInt("offset");
        String optString = jSONObject.optString("description");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        return new AnonymousClass39G(j, i, str);
    }

    public static AnonymousClass39S A02(C617332a r29, String str, byte[] bArr, boolean z) {
        AnonymousClass390 r10;
        AnonymousClass39L r8;
        ArrayList arrayList;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            Log.e("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str2);
            String string = A1H.getString("reference_id");
            String optString = A1H.optString("order_request_id", (String) null);
            String optString2 = A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C85204Fi A01 = r29.A01(A1H.optString("currency"));
            AnonymousClass39G A012 = A01(A1H.optJSONObject("total_amount"));
            String optString3 = A1H.optString("payment_configuration");
            String optString4 = A1H.optString("payment_type");
            JSONObject optJSONObject = A1H.optJSONObject("installment");
            if (optJSONObject == null) {
                r10 = null;
            } else {
                r10 = new AnonymousClass390(optJSONObject.getInt("max_installment_count"));
            }
            AnonymousClass39H A00 = A00(A1H.getJSONObject("order"));
            List A04 = A04(A1H.optJSONArray("beneficiaries"));
            List A05 = A05(A1H.optJSONArray("external_payment_configurations"));
            String optString5 = A1H.optString("transaction_id");
            String optString6 = A1H.optString("payment_method");
            String optString7 = A1H.optString("payment_status", (String) null);
            String optString8 = A1H.optString("additional_note");
            long optLong = A1H.optLong("payment_timestamp");
            List A06 = A06(A1H.optJSONArray("payment_settings"));
            JSONObject optJSONObject2 = A1H.optJSONObject("paid_amount");
            if (optJSONObject2 == null) {
                r8 = null;
            } else {
                r8 = C60042xu.A00(optJSONObject2);
            }
            JSONArray optJSONArray = A1H.optJSONArray("native_payment_methods");
            if (optJSONArray == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass001.A0s();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            return new AnonymousClass39S(A01, r8, A00, r10, A012, A00.A01(), string, optString, optString2, optString3, optString4, optString5, optString7, optString6, optString8, A04, A05, A06, arrayList, bArr, optLong, z, false);
        } catch (JSONException unused) {
            C18260x0.A0r("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid paramsJson=", str2, AnonymousClass001.A0o());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.formatCase_ == 5) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0 = r4.templateMessage_;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = X.AnonymousClass1EI.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r0.formatCase_ != 5) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r2 = X.AnonymousClass1EI.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r2.formatCase_ != 5) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = (X.AnonymousClass1ER) r2.format_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        return X.C18300x5.A0j(r0.A0N());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r2 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        r0 = r4.interactiveMessage_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.AnonymousClass1EU r4) {
        /*
            int r3 = r4.bitField1_
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0014
            X.1Df r1 = r4.buttonsMessage_
            if (r1 != 0) goto L_0x000c
            X.1Df r1 = X.C21801Df.DEFAULT_INSTANCE
        L_0x000c:
            r0 = 0
            X.1BB r0 = X.C18310x6.A0U(r1, r0)
            java.lang.String r0 = r0.paramsJson_
            return r0
        L_0x0014:
            boolean r2 = r4.A0M()
            if (r2 == 0) goto L_0x0046
            X.1EI r0 = r4.templateMessage_
            if (r0 != 0) goto L_0x0020
            X.1EI r0 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x0020:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0046
        L_0x0025:
            X.1EI r0 = r4.templateMessage_
            r2 = r0
            if (r0 != 0) goto L_0x002c
            X.1EI r0 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x002c:
            int r0 = r0.formatCase_
            r1 = 5
            if (r0 != r1) goto L_0x004d
            if (r2 != 0) goto L_0x0035
            X.1EI r2 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x0035:
            int r0 = r2.formatCase_
            if (r0 != r1) goto L_0x0051
            java.lang.Object r0 = r2.format_
            X.1ER r0 = (X.AnonymousClass1ER) r0
        L_0x003d:
            X.1C7 r0 = r0.A0N()
            java.lang.String r0 = X.C18300x5.A0j(r0)
            return r0
        L_0x0046:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x0054
            if (r2 == 0) goto L_0x004d
            goto L_0x0025
        L_0x004d:
            X.1ER r0 = r4.interactiveMessage_
            if (r0 != 0) goto L_0x003d
        L_0x0051:
            X.1ER r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE
            goto L_0x003d
        L_0x0054:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C626535y.A03(X.1EU):java.lang.String");
    }

    public static List A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            A0s.add(new AnonymousClass38Y(jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.optString("address_line1"), jSONObject.optString("address_line2"), jSONObject.optString("city"), jSONObject.optString("state"), jSONObject.optString("country"), jSONObject.optString("postal_code")));
        }
        return A0s;
    }

    public static AnonymousClass39H A00(JSONObject jSONObject) {
        String str;
        AnonymousClass393 r8;
        String optString;
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("status");
        String optString2 = jSONObject2.optString("description");
        AnonymousClass39G A01 = A01(jSONObject2.optJSONObject("subtotal"));
        AnonymousClass39G A012 = A01(jSONObject2.optJSONObject("tax"));
        JSONObject optJSONObject = jSONObject2.optJSONObject("discount");
        AnonymousClass39G A013 = A01(optJSONObject);
        if (optJSONObject != null) {
            str = optJSONObject.optString("discount_program_name");
        } else {
            str = null;
        }
        AnonymousClass39G A014 = A01(jSONObject2.optJSONObject("shipping"));
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray optJSONArray = jSONObject2.optJSONArray("items");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("amount");
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("sale_amount");
                String optString3 = jSONObject3.optString("product_id");
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = null;
                }
                A0s.add(new AnonymousClass39F(A01(jSONObject4), A01(optJSONObject2), jSONObject3.getString("retailer_id"), optString3, jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject3.getInt("quantity")));
            }
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("expiration");
        if (optJSONObject3 != null) {
            long j = optJSONObject3.getLong("timestamp");
            String optString4 = optJSONObject3.optString("description");
            if (TextUtils.isEmpty(optString4)) {
                optString4 = null;
            }
            r8 = new AnonymousClass393(j, optString4);
        } else {
            r8 = null;
        }
        String optString5 = jSONObject2.optString("order_type");
        if (!TextUtils.isEmpty(optString5)) {
            optString = "PAYMENT_REQUEST";
            if (!optString.equals(optString5)) {
                optString = "quick_pay";
                if (!optString.equals(optString5)) {
                    optString = "ORDER";
                }
            }
        } else {
            optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return new AnonymousClass39H(r8, A01, A012, A013, A014, string, optString2, str, optString, A0s);
    }

    public static List A05(JSONArray jSONArray) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                A0s.add(new AnonymousClass399(jSONObject.optString("uri"), jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), jSONObject.optString("payment_instruction")));
            }
        }
        return A0s;
    }

    public static List A06(JSONArray jSONArray) {
        C85184Fg r1;
        AnonymousClass394 r0;
        AnonymousClass3SP r02;
        C85184Fg r2;
        ArrayList A0s = AnonymousClass001.A0s();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (optString.equals("payment_gateway")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("payment_gateway");
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        r2 = new AnonymousClass3SO(optString2, optJSONObject.optString("configuration_name"), optJSONObject.optJSONObject(optString2));
                    }
                } else {
                    if (optString.equals("payment_link")) {
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("payment_link");
                        if (optJSONObject2 != null) {
                            r2 = new AnonymousClass3SP(optJSONObject2.optString("uri"), optJSONObject2.optString("cancel_url"), optJSONObject2.optString("success_url"));
                        }
                    } else {
                        String str = "pix_static_code";
                        if (optString.equals(str) || optString.equals("pix_dynamic_code")) {
                            if (optString.equals("pix_dynamic_code")) {
                                str = "pix_dynamic_code";
                            }
                            JSONObject optJSONObject3 = jSONObject.optJSONObject(str);
                            if (optJSONObject3 != null) {
                                r1 = new AnonymousClass3SR(optJSONObject3.optString("code"), optJSONObject3.optString("key"), optJSONObject3.optString("key_type"), optJSONObject3.optString("merchant_name"));
                            }
                        } else if (optString.equals("upi_merchant_configuration")) {
                            JSONObject optJSONObject4 = jSONObject.optJSONObject("upi_merchant_configuration");
                            String optString3 = optJSONObject4.optString("configuration_name");
                            String optString4 = optJSONObject4.optString("tr");
                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("payment_link");
                            if (optJSONObject5 != null) {
                                r02 = new AnonymousClass3SP(optJSONObject5.optString("uri"), optJSONObject5.optString("cancel_url"), optJSONObject5.optString("success_url"));
                            } else {
                                r02 = null;
                            }
                            r1 = new AnonymousClass3SQ(r02, optString4, optString3);
                        }
                        r0 = new AnonymousClass394(r1, optString);
                        A0s.add(r0);
                    }
                }
                r0 = new AnonymousClass394(r2, optString);
                A0s.add(r0);
            }
        }
        return A0s;
    }
}
