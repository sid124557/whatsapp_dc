package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.7bW  reason: invalid class name and case insensitive filesystem */
public class C153547bW {
    public float A00;
    public Activity A01;
    public KeyguardManager A02;
    public Context A03;
    public Boolean A04 = Boolean.FALSE;
    public String A05;
    public String A06;
    public String A07 = null;
    public String A08;
    public String A09;
    public HashMap A0A = AnonymousClass001.A0t();
    public JSONArray A0B;
    public JSONObject A0C;
    public JSONObject A0D;
    public JSONObject A0E;
    public JSONObject A0F;
    public AnonymousClass7XH A0G;
    public AnonymousClass36B A0H;
    public C60772z8 A0I;

    public final String A01(String str, String str2, int i) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Signature instance2 = Signature.getInstance("SHA512withRSA/PSS");
            instance2.initSign((PrivateKey) instance.getKey(str2, (char[]) null));
            instance2.update(str.getBytes("UTF8"));
            return C18290x4.A0t(instance2.sign());
        } catch (UserNotAuthenticatedException unused) {
            KeyguardManager keyguardManager = (KeyguardManager) this.A03.getSystemService("keyguard");
            this.A02 = keyguardManager;
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent((CharSequence) null, (CharSequence) null);
            if (createConfirmDeviceCredentialIntent != null) {
                this.A01.startActivityForResult(createConfirmDeviceCredentialIntent, i);
            }
            return null;
        }
    }

    public void A02() {
        String A002 = A00(1);
        if (A002 != null) {
            A03();
            if (this.A04.booleanValue()) {
                String encodeToString = Base64.encodeToString(this.A0F.toString().getBytes(DefaultCrypto.UTF_8), 2);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(this.A08);
                String A0V = AnonymousClass000.A0V("|", encodeToString, A0o);
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A01(A0V, this.A09, 1));
                A1G.put("dynamicData", A0V);
                this.A07 = Base64.encodeToString(AnonymousClass0x9.A0y(this.A06, "deviceCert", A1G).getBytes("UTF8"), 2);
            }
            A05("false");
            A06(C18270x1.A1b(A002));
        }
    }

    public void A06(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            JSONArray jSONArray = this.A0B;
            String optString = ((JSONObject) jSONArray.get(i)).optString("subtype", "");
            String optString2 = ((JSONObject) jSONArray.get(i)).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
            Boolean bool = Boolean.TRUE;
            if (optString.equals("MPIN")) {
                bool = Boolean.FALSE;
            }
            JSONObject jSONObject = this.A0C;
            JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass0x9.A0y(strArr[i], "credential", jSONObject));
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONArray A1F = AnonymousClass0x9.A1F();
            JSONArray jSONArray2 = jSONObject.getJSONArray("credType");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                A1H.put("txnId", jSONObject.getJSONArray("txnId").get(i2));
                A1H.put("credType", jSONObject.getJSONArray("credType").get(i2));
                AnonymousClass7XH r0 = ((GetCredential) this.A03).A0G.A0G;
                this.A0G = r0;
                A1F.put(r0.A0A.A00(A1H));
                C172378Kt A002 = this.A0G.A01().A00(bool, A1F.getString(i2), optString2, optString, A1H);
                if (this.A04.booleanValue()) {
                    A002.data.oda = this.A07;
                }
                String string = jSONArray2.getString(i2);
                StringBuilder A0o = AnonymousClass001.A0o();
                C1454075o.A00(A002, A0o);
                A1G.put(string, A0o.toString());
            }
            this.A0A.put(optString, A1G.toString());
        }
        Boolean bool2 = Boolean.FALSE;
        JSONObject jSONObject2 = this.A0D;
        if (jSONObject2 != null) {
            bool2 = Boolean.valueOf(Boolean.parseBoolean(jSONObject2.optString("getDeviceDetails", "false")));
        }
        if (bool2.booleanValue()) {
            this.A0A.put("det", this.A0G.A01().A01(new C48312eh(this.A03).A00(), this.A0C));
        }
        Bundle A082 = AnonymousClass002.A08();
        A082.putSerializable("credBlocks", this.A0A);
        AnonymousClass7Q1.A0B.send(1, A082);
        ((Activity) this.A03).finish();
    }

    public final String A00(int i) {
        JSONObject jSONObject = this.A0C;
        String string = jSONObject.getString("txnAmount");
        String string2 = jSONObject.getString("txnTimestamp");
        String string3 = jSONObject.getString("payerLiteAccNumber");
        String string4 = jSONObject.getString("payeeAddr");
        String string5 = jSONObject.getString("appId");
        String string6 = jSONObject.getString("mobileNumber");
        String string7 = jSONObject.getString("deviceId");
        String A012 = this.A0I.A01("AES");
        byte[] bytes = AnonymousClass0x9.A0y(C18290x4.A0t(this.A0E.toString().getBytes(DefaultCrypto.UTF_8)), "clientRiskRules", AnonymousClass0x9.A1H(this.A0F.toString())).getBytes();
        byte[] decode = Base64.decode(A012, 2);
        byte[] A1U = AnonymousClass6C9.A1U("AES/GCM/NoPadding", new SecureRandom());
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, new SecretKeySpec(decode, "AES"), new GCMParameterSpec(128, A1U));
        byte[] doFinal = instance.doFinal(bytes);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(Base64.encodeToString(doFinal, 2));
        A0o.append("|");
        String A0X = AnonymousClass000.A0X(Base64.encodeToString(A1U, 2), A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A0p("1.0|", string, "|", (String) jSONObject.getJSONArray("txnId").get(0), A0o2);
        A0o2.append("|");
        A0o2.append(string2);
        A0o2.append("|");
        AnonymousClass001.A1K(string3, "|", string4, A0o2);
        A0o2.append("|");
        A0o2.append(string5);
        A0o2.append("|");
        String A0U = AnonymousClass000.A0U(string6, "|", string7, A0o2);
        this.A08 = A0U;
        String A013 = A01(Base64.encodeToString(C18260x0.A06(A0U, "|", A0X).getBytes(DefaultCrypto.UTF_8), 2), this.A09, i);
        if (A013 == null) {
            return A013;
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("riskParams", A0X);
        return Base64.encodeToString(AnonymousClass0x9.A0y(A013, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A1G).getBytes(DefaultCrypto.UTF_8), 2);
    }

    public final void A03() {
        boolean booleanValue = this.A04.booleanValue();
        String str = "ATC";
        JSONObject jSONObject = this.A0E;
        String valueOf = String.valueOf(Integer.parseInt(jSONObject.getString(str)) + 1);
        if (booleanValue) {
            jSONObject.put(str, valueOf);
            JSONObject jSONObject2 = this.A0E;
            jSONObject2.put("OTC", String.valueOf(Integer.parseInt(jSONObject2.getString("OTC")) + 1));
            jSONObject = this.A0E;
            str = "COTA";
            valueOf = String.format("%.2f", new Object[]{Float.valueOf(Float.parseFloat(jSONObject.getString(str)) + this.A00)});
        }
        jSONObject.put(str, valueOf);
        this.A0I.A03(this.A0E.toString(), "ClientRiskRules");
    }

    public void A04(String str) {
        try {
            this.A05 = str;
            String A002 = A00(0);
            if (A002 != null) {
                A03();
                A05("true");
                String[] strArr = new String[2];
                AnonymousClass000.A16(str, A002, strArr);
                A06(strArr);
            }
        } catch (Exception unused) {
            ((GetCredential) this.A03).A5p("TECHNICAL_ERROR");
        }
    }

    public boolean A07(Integer num) {
        Boolean bool;
        boolean A1T;
        boolean equals;
        JSONObject jSONObject = this.A0D;
        if (jSONObject != null) {
            this.A04 = Boolean.valueOf(Boolean.parseBoolean(jSONObject.optString("isAuthOffline", "false")));
        }
        JSONObject jSONObject2 = this.A0C;
        String A0t = C18290x4.A0t(AnonymousClass36B.A04(C18260x0.A06(jSONObject2.getString("deviceId"), jSONObject2.getString("mobileNumber"), jSONObject2.getString("accountRef"))));
        this.A09 = A0t;
        C60772z8 A002 = C60772z8.A00(this.A03, A0t);
        this.A0I = A002;
        if (A002.A01("PendingTxn").equals("")) {
            this.A0E = AnonymousClass0x9.A1H(this.A0I.A01("ClientRiskRules"));
            this.A0F = AnonymousClass0x9.A1H(this.A0I.A01("ServerRiskParams"));
            try {
                String A012 = this.A0I.A01("DeviceCertificate");
                this.A06 = A012;
                try {
                    ByteArrayInputStream A0d = AnonymousClass0x9.A0d(A012.getBytes());
                    try {
                        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(A0d);
                        A0d.close();
                        x509Certificate.checkValidity();
                        if (!num.equals(C1461178s.A01)) {
                            JSONObject jSONObject3 = this.A0F;
                            try {
                                String string = jSONObject3.getString("riskRules");
                                String string2 = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                                PublicKey publicKey = C154497dG.A00(new String(Base64.decode("c2lnbmVyLmNydA==", 2))).getPublicKey();
                                byte[] bytes = string.getBytes("UTF8");
                                byte[] decode = Base64.decode(string2, 2);
                                Signature instance = Signature.getInstance("SHA512withRSA/PSS");
                                instance.initVerify(publicKey);
                                instance.update(bytes);
                                bool = Boolean.valueOf(instance.verify(decode));
                            } catch (Exception unused) {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                JSONObject A1H = AnonymousClass0x9.A1H(new String(Base64.decode(this.A0F.getString("riskRules"), 2), DefaultCrypto.UTF_8));
                                this.A00 = Float.parseFloat(jSONObject2.getString("txnAmount"));
                                float parseFloat = Float.parseFloat(A1H.getString("LTL"));
                                float parseFloat2 = Float.parseFloat(A1H.getString("BAL"));
                                String string3 = A1H.getString("ACSTATUS");
                                if (this.A04.booleanValue()) {
                                    boolean parseBoolean = Boolean.parseBoolean(A1H.getString("EOT"));
                                    float parseFloat3 = Float.parseFloat(A1H.getString("OTL"));
                                    int parseInt = Integer.parseInt(this.A0E.getString("OTC"));
                                    int parseInt2 = Integer.parseInt(A1H.getString("MOTC"));
                                    float parseFloat4 = Float.parseFloat(this.A0E.getString("COTA"));
                                    float parseFloat5 = Float.parseFloat(A1H.getString("COTAL"));
                                    float f = this.A00;
                                    A1T = AnonymousClass0x7.A1P(((parseFloat4 + f) > parseFloat5 ? 1 : ((parseFloat4 + f) == parseFloat5 ? 0 : -1))) & AnonymousClass0x7.A1P((f > parseFloat ? 1 : (f == parseFloat ? 0 : -1))) & AnonymousClass0x7.A1P((f > parseFloat2 ? 1 : (f == parseFloat2 ? 0 : -1))) & AnonymousClass0x7.A1P((f > parseFloat3 ? 1 : (f == parseFloat3 ? 0 : -1))) & AnonymousClass001.A1Y(parseInt, parseInt2) & parseBoolean;
                                    equals = string3.equals("A");
                                } else {
                                    float f2 = this.A00;
                                    boolean A1P = AnonymousClass0x7.A1P((f2 > parseFloat ? 1 : (f2 == parseFloat ? 0 : -1))) & AnonymousClass0x7.A1P((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1)));
                                    boolean equals2 = string3.equals("A");
                                    if (!A1P || !equals2) {
                                        A1T = AnonymousClass000.A1T((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1))) & equals2;
                                        equals = jSONObject2.getString("payerAddr").equals(jSONObject2.getString("payeeAddr"));
                                    }
                                }
                                if (A1T && equals) {
                                    return true;
                                }
                            }
                            throw AnonymousClass001.A0c("Lite validation Failed");
                        }
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        A0d.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Exception unused2) {
                throw new CertificateException("Device Certificate Expired");
            }
        } else {
            throw AnonymousClass001.A0e("Pending transaction for Sync");
        }
    }

    public C153547bW(Context context, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A03 = context;
        this.A0C = jSONObject;
        this.A0B = jSONArray;
        this.A0D = jSONObject2;
        this.A01 = (Activity) context;
        this.A0H = new AnonymousClass36B();
    }

    public final void A05(String str) {
        JSONArray jSONArray;
        JSONObject A1G = AnonymousClass0x9.A1G();
        JSONObject jSONObject = this.A0C;
        A1G.put("txnId", jSONObject.getJSONArray("txnId").get(0));
        A1G.put("txnAmount", jSONObject.getString("txnAmount"));
        A1G.put("isCredit", str);
        try {
            jSONArray = new JSONArray(this.A0I.A01("PendingTxn"));
        } catch (Exception unused) {
            jSONArray = AnonymousClass0x9.A1F();
        }
        jSONArray.put(A1G);
        this.A0I.A03(jSONArray.toString(), "PendingTxn");
    }
}
