package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7WR  reason: invalid class name */
public class AnonymousClass7WR {
    public C151807Wj A00;
    public String A01;
    public C48812fW A02;

    public C172378Kt A00(Boolean bool, String str, String str2, String str3, JSONObject jSONObject) {
        C172398Kv r5;
        StringBuilder A0o;
        C172378Kt r0 = null;
        try {
            jSONObject.getString("credType");
            String string = jSONObject.getString("txnId");
            String string2 = jSONObject.getString("credential");
            jSONObject.getString("appId");
            jSONObject.getString("deviceId");
            jSONObject.getString("mobileNumber");
            C48812fW r1 = this.A02;
            if (r1 != null) {
                r1.toString();
            }
            String str4 = ((C156647gy) C18290x4.A0k(r1.A00())).A02;
            Matcher matcher = Pattern.compile("\\{([^}]*)\\}").matcher(str);
            StringBuffer A0X = AnonymousClass6CA.A0X();
            if (matcher.find()) {
                String group = matcher.group();
                String substring = group.substring(1, group.length() - 1);
                r0 = null;
                try {
                    if (bool.booleanValue()) {
                        r0 = this.A00.A00(Boolean.TRUE, "NPCI-LITE", string, string2, substring, str4);
                        r0.type = str2;
                        r0.subType = str3;
                        r5 = r0.data;
                        A0o = AnonymousClass001.A0o();
                        A0o.append("2.3.lite-v1.8|");
                        A0o.append(r5.encryptedBase64String);
                    } else {
                        r0 = this.A00.A00(Boolean.FALSE, this.A01, string, string2, substring, str4);
                        r0.type = str2;
                        r0.subType = str3;
                        r5 = r0.data;
                        A0o = AnonymousClass001.A0o();
                        A0o.append("2.3-v1.8|");
                        A0o.append(r5.encryptedBase64String);
                    }
                    r5.encryptedBase64String = A0o.toString();
                } catch (Exception unused) {
                }
                matcher.appendReplacement(A0X, Matcher.quoteReplacement(r0.data.encryptedBase64String.replaceAll("\n", "")));
            }
            if (A0X.length() > 0) {
                matcher.appendTail(A0X);
            }
            if (r0 != null) {
                r0.data.encryptedBase64String = A0X.toString();
            }
            return r0;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(24:1|2|3|(1:5)|6|7|8|9|10|(1:12)|35|13|14|15|18|19|(1:21)(1:23)|22|(2:24|25)|28|29|30|31|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r0 = "appId"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r0 = "deviceId"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r0 = "mobileNumber"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00b1 }
            X.2fW r0 = r11.A02
            if (r0 == 0) goto L_0x0016
            r0.toString()
        L_0x0016:
            java.util.List r0 = r0.A00()
            java.lang.Object r0 = X.C18290x4.A0k(r0)
            X.7gy r0 = (X.C156647gy) r0
            java.lang.String r10 = r0.A02
            r6 = 0
            java.lang.String r8 = "|"
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00b0 }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x009c }
            r1.<init>()     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            byte[] r4 = X.AnonymousClass6C9.A1U(r0, r1)     // Catch:{ Exception -> 0x009c }
            r9 = 2
            java.lang.String r5 = X.C154487dF.A00(r4, r9)     // Catch:{ Exception -> 0x009c }
            byte[] r3 = X.C161257pJ.A00(r12, r5)     // Catch:{ Exception -> 0x009c }
            int r0 = r10.length()     // Catch:{ Exception -> 0x009c }
            int r2 = r0 / 2
            byte[] r1 = new byte[r2]     // Catch:{ Exception -> 0x009c }
            r0 = 0
        L_0x0046:
            if (r0 >= r2) goto L_0x004e
            X.AnonymousClass6C9.A16(r10, r1, r0)     // Catch:{ Exception -> 0x009c }
            int r0 = r0 + 1
            goto L_0x0046
        L_0x004e:
            byte[] r0 = X.C161257pJ.A01(r3, r1, r4)     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = X.C154487dF.A00(r0, r9)     // Catch:{ Exception -> 0x009c }
            javax.crypto.SecretKey r10 = X.AnonymousClass6C8.A0n()     // Catch:{ NoSuchAlgorithmException -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            byte[] r2 = r12.getBytes()     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "AES"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x009c }
            r0 = 1
            r1.init(r0, r10)     // Catch:{ Exception -> 0x009c }
            byte[] r0 = r1.doFinal(r2)     // Catch:{ Exception -> 0x009c }
            java.lang.String r3 = X.C154487dF.A00(r0, r9)     // Catch:{ Exception -> 0x009c }
            byte[] r0 = r10.getEncoded()     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = X.C154487dF.A00(r0, r9)     // Catch:{ Exception -> 0x009c }
            java.security.cert.Certificate r0 = X.AnonymousClass782.A00     // Catch:{ Exception -> 0x009c }
            if (r0 == 0) goto L_0x0087
            java.security.PublicKey r1 = r0.getPublicKey()     // Catch:{ Exception -> 0x009c }
        L_0x0082:
            byte[] r0 = r2.getBytes()     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x0087:
            r1 = 0
            goto L_0x0082
        L_0x0089:
            byte[] r0 = X.AnonymousClass6C8.A1V(r1, r0)     // Catch:{ Exception -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            java.lang.String r0 = X.C154487dF.A00(r0, r9)     // Catch:{ Exception -> 0x009c }
            X.AnonymousClass001.A1K(r4, r8, r3, r7)     // Catch:{ Exception -> 0x009c }
            r7.append(r8)     // Catch:{ Exception -> 0x009c }
            X.AnonymousClass001.A1K(r0, r8, r5, r7)     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r0 = "2.3-v1.8|"
            r1.append(r0)     // Catch:{ Exception -> 0x00b0 }
            r1.append(r6)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00b0 }
        L_0x00b0:
            return r6
        L_0x00b1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WR.A01(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    public AnonymousClass7WR(C151807Wj r1, String str, C48812fW r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }
}
