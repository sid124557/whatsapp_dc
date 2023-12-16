package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl;
import org.npci.upi.security.pinactivitycomponent.GetCredential;
import org.npci.upi.security.pinactivitycomponent.w;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.6Dd  reason: invalid class name and case insensitive filesystem */
public class C124596Dd extends Binder implements CLRemoteService {
    public Context A00;
    public final /* synthetic */ CLRemoteServiceImpl A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C124596Dd(Context context, CLRemoteServiceImpl cLRemoteServiceImpl) {
        this();
        this.A01 = cLRemoteServiceImpl;
        this.A00 = context;
    }

    public void B2r(String str) {
        String string;
        GetCredential getCredential = GetCredential.A0L;
        if (getCredential != null) {
            w wVar = (w) getCredential.A08;
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                if (!A1H.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !A1H.has("data") || A1H.getJSONObject("data").getInt("status") != -1) {
                    ((C1230466w) wVar.A06.get(wVar.A03)).Avv(C08310eF.A09(wVar).getString(R.string.f11nameremoved));
                    return;
                }
                if (A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_OTP_RESPONSE")) {
                    wVar.A06.get(wVar.A03);
                    string = C08310eF.A09(wVar).getString(R.string.f11nameremoved);
                } else if (A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_AADHAAR_OTP_RESPONSE")) {
                    wVar.A06.get(wVar.A03);
                    string = C08310eF.A09(wVar).getString(R.string.f11nameremoved);
                } else {
                    return;
                }
                wVar.A1I(string);
            } catch (Exception unused) {
            }
        }
    }

    public String B5L(String str, String str2) {
        String str3;
        String str4;
        PublicKey publicKey;
        byte[] bArr;
        C19350zK r5 = this.A01.A01;
        String str5 = "";
        String format = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
        try {
            str3 = AnonymousClass36B.A02(AnonymousClass6C8.A0n().getEncoded());
        } catch (Exception unused) {
            str3 = null;
        }
        try {
            r5.A01 = str3;
            try {
                str4 = AnonymousClass36B.A02(AnonymousClass6C8.A0n().getEncoded());
            } catch (Exception unused2) {
                str4 = null;
            }
        } catch (Exception unused3) {
            str4 = str5;
        }
        try {
            new AnonymousClass36B();
            if (str.equalsIgnoreCase("initial")) {
                C48812fW r6 = r5.A04;
                SharedPreferences.Editor edit = r6.A01.edit();
                edit.clear();
                edit.commit();
                if (r6.A00().size() <= 0) {
                    r6.A01(new C156647gy(str4, r5.A01, format));
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass001.A1K(r5.A01, "|", str4, A0o);
                A0o.append("|");
                A0o.append(str2);
                str5 = A0o.toString();
                Certificate certificate = AnonymousClass782.A00;
                if (certificate != null) {
                    publicKey = certificate.getPublicKey();
                } else {
                    publicKey = null;
                }
                try {
                    bArr = AnonymousClass6C8.A1V(publicKey, str5.getBytes());
                } catch (Exception unused4) {
                    bArr = null;
                }
                str5 = Base64.encodeToString(bArr, 2);
            } else {
                C48812fW r62 = r5.A04;
                String str6 = ((C156647gy) C18290x4.A0k(r62.A00())).A02;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass001.A1K(r5.A01, "|", str4, A0o2);
                A0o2.append("|");
                A0o2.append(str2);
                String obj = A0o2.toString();
                byte[] A1U = AnonymousClass6C9.A1U("AES/GCM/NoPadding", new SecureRandom());
                String encodeToString = Base64.encodeToString(A1U, 2);
                int length = str6.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    AnonymousClass6C9.A16(str6, bArr2, i);
                }
                String encodeToString2 = Base64.encodeToString(AnonymousClass36B.A05(obj.getBytes(), bArr2, A1U), 2);
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass001.A1K(encodeToString2, "|", encodeToString, A0o3);
                str5 = A0o3.toString();
                SharedPreferences.Editor edit2 = r62.A01.edit();
                edit2.clear();
                edit2.commit();
                r62.A01(new C156647gy(str4, r5.A01, format));
            }
        } catch (Exception unused5) {
        }
        return AnonymousClass000.A0V("2.3-v1.8|", str5, AnonymousClass001.A0o());
    }

    public void B6F(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
        Context context = this.A00;
        SharedPreferences.Editor edit = new C147587Ew(context).A00.edit();
        edit.putString("org.npci.upi.language.pref", str8);
        edit.commit();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("keyCode", str);
        A08.putString("keyXmlPayload", str2);
        A08.putString("controls", str3);
        A08.putString("configuration", str4);
        A08.putString("salt", str5);
        A08.putString("payInfo", str6);
        A08.putString("trust", str7);
        A08.putString("languagePref", str8);
        AnonymousClass7Q1.A0B = new AnonymousClass6E6(cLResultReceiver);
        Intent intent = new Intent(context, GetCredential.class);
        intent.setFlags(268435456);
        intent.putExtras(A08);
        context.startActivity(intent);
    }

    public boolean Bib(String str, String str2, String str3, String str4, String str5) {
        try {
            String str6 = ((C156647gy) this.A01.A01.A04.A00().get(0)).A01;
            int length = str6.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass6C9.A16(str6, bArr, i);
            }
            String encodeToString = Base64.encodeToString(AnonymousClass36B.A06(Base64.decode(str4, 0), bArr, Base64.decode(str5, 2)), 0);
            String A0U = AnonymousClass000.A0U(str2, "|", str3, AnonymousClass000.A0m(str, "|"));
            byte[] decode = Base64.decode(str5, 2);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(decode);
            if (!Base64.encodeToString(instance.digest(A0U.getBytes(DefaultCrypto.UTF_8)), 0).equalsIgnoreCase(encodeToString)) {
                return false;
            }
            return true;
        } catch (Exception | NoSuchAlgorithmException e) {
            e.getLocalizedMessage();
        }
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0161, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x028a, code lost:
        r1.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x028d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r24, android.os.Parcel r25, android.os.Parcel r26, int r27) {
        /*
            r23 = this;
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r0 = 1
            java.lang.String r3 = "org.npci.upi.security.services.CLRemoteService"
            r4 = r24
            r1 = r26
            if (r4 == r2) goto L_0x0302
            r13 = r23
            r2 = r25
            switch(r24) {
                case 1: goto L_0x023b;
                case 2: goto L_0x001a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0040;
                case 5: goto L_0x0165;
                case 6: goto L_0x0088;
                case 7: goto L_0x010c;
                case 8: goto L_0x0183;
                case 9: goto L_0x0251;
                case 10: goto L_0x0280;
                case 11: goto L_0x028e;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = r27
            boolean r0 = super.onTransact(r4, r2, r1, r0)
            return r0
        L_0x001a:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            boolean r2 = r13.Bib(r14, r15, r16, r17, r18)
            goto L_0x017c
        L_0x0037:
            r2.enforceInterface(r3)
            boolean r2 = X.C19350zK.A0C()
            goto L_0x017c
        L_0x0040:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.0zK r5 = r2.A01
            java.lang.String r2 = X.C18260x0.A06(r4, r6, r3)
            byte[] r2 = X.AnonymousClass36B.A04(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r4 = X.C18290x4.A0t(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r2)     // Catch:{ Exception -> 0x0163 }
            r2 = 0
            r3.load(r2)     // Catch:{ Exception -> 0x0163 }
            java.security.cert.Certificate r2 = r3.getCertificate(r4)     // Catch:{ Exception -> 0x0163 }
            r2.getPublicKey()     // Catch:{ Exception -> 0x0163 }
            android.content.Context r2 = r5.A00     // Catch:{ Exception -> 0x0163 }
            X.2z8 r3 = X.C60772z8.A00(r2, r4)     // Catch:{ Exception -> 0x0163 }
            r5.A05 = r3     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = ""
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0163 }
            if (r2 != 0) goto L_0x0163
            goto L_0x0161
        L_0x0088:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.0zK r8 = r2.A01
            X.7VO r2 = new X.7VO
            r2.<init>()
            boolean r2 = r2.A01(r3)     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x0163
            X.8g2 r2 = new X.8g2     // Catch:{ Exception -> 0x0163 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0163 }
            java.util.List r7 = X.C177538g2.A04     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = X.C18260x0.A06(r5, r6, r4)     // Catch:{ Exception -> 0x0163 }
            byte[] r2 = X.AnonymousClass36B.A04(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r3 = X.C18290x4.A0t(r2)     // Catch:{ Exception -> 0x0163 }
            android.content.Context r2 = r8.A00     // Catch:{ Exception -> 0x0163 }
            X.2z8 r3 = X.C60772z8.A00(r2, r3)     // Catch:{ Exception -> 0x0163 }
            r8.A05 = r3     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "AES"
            java.lang.String r6 = r3.A01(r2)     // Catch:{ Exception -> 0x0163 }
            int r2 = r7.size()     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x0163
            r5 = 0
        L_0x00d2:
            int r2 = r7.size()     // Catch:{ Exception -> 0x0163 }
            if (r5 >= r2) goto L_0x0161
            java.lang.Object r4 = r7.get(r5)     // Catch:{ Exception -> 0x0163 }
            X.7Ic r4 = (X.C148367Ic) r4     // Catch:{ Exception -> 0x0163 }
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "STATE"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x00f2
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = X.AnonymousClass36B.A01(r2, r6)     // Catch:{ Exception -> 0x0163 }
            r8.A5q(r2)     // Catch:{ Exception -> 0x0163 }
            goto L_0x0109
        L_0x00f2:
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "DEVICE-CERT"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x0109
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x0163 }
            java.lang.String r4 = X.AnonymousClass36B.A01(r2, r6)     // Catch:{ Exception -> 0x0163 }
            X.2z8 r3 = r8.A05     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "DeviceCertificate"
            r3.A03(r4, r2)     // Catch:{ Exception -> 0x0163 }
        L_0x0109:
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x010c:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r8 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.0zK r7 = r2.A01
            java.lang.String r2 = X.C18260x0.A06(r5, r6, r4)
            byte[] r2 = X.AnonymousClass36B.A04(r2)
            java.lang.String r3 = X.C18290x4.A0t(r2)
            android.content.Context r2 = r7.A00     // Catch:{ Exception -> 0x0163 }
            X.2z8 r3 = X.C60772z8.A00(r2, r3)     // Catch:{ Exception -> 0x0163 }
            r7.A05 = r3     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "AES"
            java.lang.String r2 = r3.A01(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r3 = X.AnonymousClass36B.A01(r8, r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.Boolean r2 = r7.A5p(r3)     // Catch:{ Exception -> 0x0163 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x0163
            r7.A5q(r3)     // Catch:{ Exception -> 0x0163 }
            org.json.JSONObject r3 = r7.A02     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "ACSTATUS"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r2 = "DA"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0163 }
            if (r2 == 0) goto L_0x0161
            r7.A5r(r6, r5, r4)     // Catch:{ Exception -> 0x0163 }
        L_0x0161:
            r2 = 1
            goto L_0x017c
        L_0x0163:
            r2 = 0
            goto L_0x017c
        L_0x0165:
            r2.enforceInterface(r3)
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.0zK r2 = r2.A01
            boolean r2 = r2.A5r(r5, r4, r3)
        L_0x017c:
            r1.writeNoException()
            r1.writeInt(r2)
            return r0
        L_0x0183:
            r2.enforceInterface(r3)
            java.lang.String r7 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.0zK r5 = r2.A01
            java.lang.String r6 = ""
            java.lang.String r2 = X.C18260x0.A06(r4, r7, r3)
            byte[] r2 = X.AnonymousClass36B.A04(r2)
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r2, r4)
            android.content.Context r2 = r5.A00     // Catch:{ Exception -> 0x024a }
            X.2z8 r3 = X.C60772z8.A00(r2, r3)     // Catch:{ Exception -> 0x024a }
            r5.A05 = r3     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x024a }
            java.lang.Boolean r2 = r5.A5p(r3)     // Catch:{ Exception -> 0x024a }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x024a }
            if (r2 == 0) goto L_0x024a
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "riskRules"
            java.lang.String r2 = r3.getString(r2)     // Catch:{ Exception -> 0x024a }
            byte[] r4 = android.util.Base64.decode(r2, r4)     // Catch:{ Exception -> 0x024a }
            java.lang.String r3 = "UTF-8"
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x024a }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x024a }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r2)     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "BAL"
            java.lang.String r10 = r3.optString(r2, r6)     // Catch:{ Exception -> 0x024a }
            X.2z8 r3 = r5.A05     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "PendingTxn"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x024a }
            boolean r2 = r3.equals(r6)     // Catch:{ Exception -> 0x024a }
            java.lang.String r5 = "%.2f"
            r4 = 0
            if (r2 == 0) goto L_0x01fb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x024a }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x024a }
            X.AnonymousClass001.A1P(r3, r2, r4)     // Catch:{ Exception -> 0x024a }
            java.lang.String r6 = java.lang.String.format(r5, r3)     // Catch:{ Exception -> 0x024a }
            goto L_0x024a
        L_0x01fb:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x024a }
            r8.<init>(r3)     // Catch:{ Exception -> 0x024a }
            r9 = 0
            r7 = 0
        L_0x0202:
            int r2 = r8.length()     // Catch:{ Exception -> 0x024a }
            if (r7 >= r2) goto L_0x022c
            org.json.JSONObject r3 = r8.getJSONObject(r7)     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "isCredit"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "false"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x024a }
            if (r2 == 0) goto L_0x0229
            org.json.JSONObject r3 = r8.getJSONObject(r7)     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = "txnAmount"
            java.lang.String r2 = r3.getString(r2)     // Catch:{ Exception -> 0x024a }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ Exception -> 0x024a }
            float r9 = r9 + r2
        L_0x0229:
            int r7 = r7 + 1
            goto L_0x0202
        L_0x022c:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x024a }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x024a }
            float r2 = r2 - r9
            X.AnonymousClass001.A1P(r3, r2, r4)     // Catch:{ Exception -> 0x024a }
            java.lang.String r6 = java.lang.String.format(r5, r3)     // Catch:{ Exception -> 0x024a }
            goto L_0x024a
        L_0x023b:
            r2.enforceInterface(r3)
            java.lang.String r3 = r2.readString()
            java.lang.String r2 = r2.readString()
            java.lang.String r6 = r13.B5L(r3, r2)
        L_0x024a:
            r1.writeNoException()
            r1.writeString(r6)
            return r0
        L_0x0251:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            java.lang.String r19 = r2.readString()
            java.lang.String r20 = r2.readString()
            java.lang.String r21 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r22 = X.C124606De.A01(r2)
            r13.B6F(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x028a
        L_0x0280:
            r2.enforceInterface(r3)
            java.lang.String r2 = r2.readString()
            r13.B2r(r2)
        L_0x028a:
            r1.writeNoException()
            return r0
        L_0x028e:
            r2.enforceInterface(r3)
            java.lang.String r12 = r2.readString()
            java.lang.String r11 = r2.readString()
            java.lang.String r10 = r2.readString()
            java.lang.String r9 = r2.readString()
            java.lang.String r8 = r2.readString()
            java.lang.String r7 = r2.readString()
            java.lang.String r6 = r2.readString()
            java.lang.String r4 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r3 = X.C124606De.A01(r2)
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r2 = "keyCode"
            r5.putString(r2, r12)
            java.lang.String r2 = "keyXmlPayload"
            r5.putString(r2, r11)
            java.lang.String r2 = "controls"
            r5.putString(r2, r10)
            java.lang.String r2 = "configuration"
            r5.putString(r2, r9)
            java.lang.String r2 = "salt"
            r5.putString(r2, r8)
            java.lang.String r2 = "payInfo"
            r5.putString(r2, r7)
            java.lang.String r2 = "trust"
            r5.putString(r2, r6)
            java.lang.String r2 = "languagePref"
            r5.putString(r2, r4)
            X.6E6 r2 = new X.6E6
            r2.<init>(r3)
            X.AnonymousClass7Q1.A0B = r2
            android.content.Context r4 = r13.A00
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.GetCredential> r3 = org.npci.upi.security.pinactivitycomponent.GetCredential.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r3)
            r2.putExtras(r5)
            r1.writeNoException()
            r1.writeInt(r0)
            r2.writeToParcel(r1, r0)
            return r0
        L_0x0302:
            r1.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124596Dd.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public C124596Dd() {
        attachInterface(this, "org.npci.upi.security.services.CLRemoteService");
    }
}
