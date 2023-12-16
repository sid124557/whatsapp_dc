package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99H  reason: invalid class name */
public final class AnonymousClass99H extends C133766hu {
    public static final Parcelable.Creator CREATOR = new C204589pb(14);
    public int A00 = -1;
    public int A01;
    public int A02 = 1;
    public C166557yt A03;
    public C166557yt A04;
    public C166557yt A05;
    public C166557yt A06;
    public C166557yt A07;
    public C166557yt A08;
    public C166557yt A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;

    public static boolean A00(AnonymousClass99H r0) {
        return ((Boolean) r0.A05.A00).booleanValue();
    }

    public void A04(C617332a r16, AnonymousClass36K r17, int i) {
        String str;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        AnonymousClass36K r3 = r17;
        if (i == 2) {
            str = null;
            try {
                this.A01 = C161527pr.A01(r3.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null), "bankName");
                this.A0A = r3.A0r("provider-type", (String) null);
                this.A03 = r3.A0r("image", (String) null);
                this.A0C = r3.A0r("code", (String) null);
                this.A04 = r3.A0r("bank-phone-number", (String) null);
                this.A0K = C1899593h.A1W(r3, "popular-bank", "1");
                String A0r = r3.A0r("psp-routing", (String) null);
                if (!TextUtils.isEmpty(A0r)) {
                    this.A0G = AnonymousClass0x2.A0i(A0r.split(","));
                }
                if (this.A00 == -1) {
                    this.A00 = C615531h.A01(r3.A0r("version", (String) null), -1);
                }
            } catch (Exception e) {
                Log.e("PAY: IndiaUpiMethodData fromNetwork", e);
                return;
            }
        } else {
            str = null;
            this.A0A = r3.A0r("provider", (String) null);
            this.A03 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, r3.A0r("account-name", (String) null), "accountHolderName");
            boolean z = false;
            this.A05 = C1899693i.A0F(AnonymousClass3QD.A00(), Boolean.class, Boolean.valueOf(AnonymousClass000.A1U(C615531h.A01(r3.A0r("is-mpin-set", (String) null), 0), 1)), "isPinSet");
            this.A07 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(C615531h.A01(r3.A0r("otp-length", (String) null), 0)), "otpLength");
            this.A04 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(C615531h.A01(r3.A0r("atm-pin-length", (String) null), 0)), "atmPinLength");
            this.A08 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(C615531h.A01(r3.A0r("mpin-length", (String) null), 0)), "pinLength");
            this.A09 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, r3.A0r("vpa", (String) null), "upiHandle");
            this.A0F = r3.A0r("vpa-id", (String) null);
            this.A0C = r3.A0r("code", (String) null);
            this.A01 = C615531h.A01(r3.A0r("pin-format-version", (String) null), 0);
            this.A06 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, r3.A0r("upi-bank-info", (String) null), "bankInfo");
            this.A03 = r3.A0r("image", (String) null);
            this.A04 = r3.A0r("bank-phone-number", (String) null);
            this.A09 = null;
            this.A01 = C161527pr.A01(r3.A0r("bank-name", (String) null), "bankName");
            this.A06 = r3.A0r("credential-id", (String) null);
            this.A02 = C161527pr.A01(r3.A0r("account-number", (String) null), "bankAccountNumber");
            this.A00 = C615531h.A03(r3.A0r("created", (String) null)) * 1000;
            this.A07 = AnonymousClass000.A1U(C615531h.A01(r3.A0r("default-credit", (String) null), 0), 1);
            this.A08 = AnonymousClass000.A1U(C615531h.A01(r3.A0r("default-debit", (String) null), 0), 1);
            if (C615531h.A01(r3.A0r("default-debit-p2m", (String) null), 0) == 1) {
                z = true;
            }
            this.A0H = z;
            this.A0B = r3.A0r("account-type", (String) null);
        }
        String A0r2 = r3.A0r("transaction-prefix", str);
        if (!TextUtils.isEmpty(A0r2)) {
            this.A0E = A0r2;
        }
        this.A0I = C1899593h.A1W(r3, "is-aadhaar-enabled", "1");
    }

    public void A05(String str) {
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A03 = A1H.optString("bankImageURL", (String) null);
                this.A04 = A1H.optString("bankPhoneNumber", (String) null);
                this.A02 = A1H.optInt("v", 1);
                this.A03 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, A1H.optString("accountHolderName", (String) null), "accountHolderName");
                this.A07 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(A1H.optInt("otpLength", -1)), "otpLength");
                this.A04 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(A1H.optInt("atmPinLength", -1)), "atmPinLength");
                this.A08 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, Integer.valueOf(A1H.optInt("upiPinLength", -1)), "pinLength");
                this.A06 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, A1H.optString("miscBankInfo", (String) null), "bankInfo");
                this.A09 = C1899693i.A0F(AnonymousClass3QD.A00(), cls2, A1H.optString("vpaHandle", (String) null), "upiHandle");
                this.A0F = A1H.optString("vpaId", (String) null);
                this.A0C = A1H.optString("bankCode", (String) null);
                String optString = A1H.optString("accountProvider", "");
                if (!optString.equals(this.A0C)) {
                    this.A0A = optString;
                }
                this.A01 = A1H.optInt("pinFormat", 0);
                this.A05 = C1899693i.A0F(AnonymousClass3QD.A00(), Boolean.class, Boolean.valueOf(A1H.optBoolean("isMpinSet", false)), "isPinSet");
                this.A0B = A1H.optString("accountType", (String) null);
                this.A0I = A1H.optBoolean("isAadhaarEnabled", false);
                this.A0H = A1H.optBoolean("defaultDebitP2m");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e);
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: IndiaUpiMethodData toNetwork is unsupported");
    }

    public C166557yt A08() {
        Object obj;
        if (!C161527pr.A02(this.A03)) {
            return this.A03;
        }
        try {
            C166557yt r0 = this.A06;
            if (r0 == null) {
                obj = null;
            } else {
                obj = r0.A00;
            }
            return C1899693i.A0F(AnonymousClass3QD.A00(), String.class, AnonymousClass0x9.A1H((String) obj).optString("account_name"), "accountHolderName");
        } catch (JSONException unused) {
            return null;
        }
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A05));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r1.equals(r0);
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0E() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0B
            if (r1 == 0) goto L_0x000b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1704036199: goto L_0x0030;
                case -240997565: goto L_0x0026;
                case 358786314: goto L_0x0023;
                case 1844922713: goto L_0x0019;
                case 1996005113: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 2131887753(0x7f120689, float:1.9410122E38)
        L_0x000e:
            return r1
        L_0x000f:
            java.lang.String r0 = "CREDIT"
            boolean r0 = r1.equals(r0)
            r1 = 2131887749(0x7f120685, float:1.9410114E38)
            goto L_0x0039
        L_0x0019:
            java.lang.String r0 = "CURRENT"
            boolean r0 = r1.equals(r0)
            r1 = 2131887750(0x7f120686, float:1.9410116E38)
            goto L_0x0039
        L_0x0023:
            java.lang.String r0 = "OD_UNSECURED"
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = "OD_SECURED"
        L_0x0028:
            boolean r0 = r1.equals(r0)
            r1 = 2131887751(0x7f120687, float:1.9410118E38)
            goto L_0x0039
        L_0x0030:
            java.lang.String r0 = "SAVINGS"
            boolean r0 = r1.equals(r0)
            r1 = 2131887752(0x7f120688, float:1.941012E38)
        L_0x0039:
            if (r0 != 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99H.A0E():int");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0G);
        byte[] bArr = this.A09;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
    }

    public String A03() {
        Object obj;
        Object obj2;
        try {
            JSONObject A0D2 = A0D();
            A0D2.put("v", this.A02);
            String str = this.A0A;
            if (str != null) {
                A0D2.put("accountProvider", str);
            }
            if (!C161527pr.A02(this.A03)) {
                C166557yt r0 = this.A03;
                if (r0 == null) {
                    obj2 = null;
                } else {
                    obj2 = r0.A00;
                }
                A0D2.put("accountHolderName", obj2);
            }
            Object obj3 = this.A07.A00;
            if (AnonymousClass001.A0K(obj3) >= 0) {
                A0D2.put("otpLength", obj3);
            }
            Object obj4 = this.A04.A00;
            if (AnonymousClass001.A0K(obj4) >= 0) {
                A0D2.put("atmPinLength", obj4);
            }
            Object obj5 = this.A08.A00;
            if (AnonymousClass001.A0K(obj5) >= 0) {
                A0D2.put("upiPinLength", obj5);
            }
            C166557yt r3 = this.A06;
            if (!C161527pr.A03(r3)) {
                if (r3 == null) {
                    obj = null;
                } else {
                    obj = r3.A00;
                }
                A0D2.put("miscBankInfo", obj);
            }
            C166557yt r1 = this.A09;
            if (!C161527pr.A03(r1)) {
                C1899693i.A0r(r1, "vpaHandle", A0D2);
            }
            String str2 = this.A0F;
            if (str2 != null) {
                A0D2.put("vpaId", str2);
            }
            String str3 = this.A0C;
            if (str3 != null) {
                A0D2.put("bankCode", str3);
            }
            int i = this.A01;
            if (i >= 0) {
                A0D2.put("pinFormat", i);
            }
            C1899693i.A0r(this.A05, "isMpinSet", A0D2);
            String str4 = this.A0B;
            if (str4 != null) {
                A0D2.put("accountType", str4);
            }
            A0D2.put("isAadhaarEnabled", this.A0I);
            A0D2.put("defaultDebitP2m", this.A0H);
            return A0D2.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e);
            return null;
        }
    }

    public String toString() {
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ accountProvider: ");
        A0o.append(this.A0A);
        A0o.append(" issuerName: ");
        A0o.append(this.A01);
        A0o.append(" bankImageUrl: ");
        A0o.append(this.A03);
        A0o.append(" icon length: ");
        byte[] bArr = this.A09;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        A0o.append(i);
        StringBuilder A0w = C18290x4.A0w(" otpLength: ", A0o);
        A0w.append(this.A07);
        C195009Vm.A04(A0w, A0o);
        StringBuilder A0w2 = C18290x4.A0w(" upiPinLength: ", A0o);
        A0w2.append(this.A08);
        C195009Vm.A04(A0w2, A0o);
        StringBuilder A0w3 = C18290x4.A0w(" atmPinLength: ", A0o);
        A0w3.append(this.A04);
        C195009Vm.A04(A0w3, A0o);
        A0o.append(" vpaHandle: ");
        A0o.append(this.A09);
        A0o.append(" vpaId: ");
        A0o.append(this.A0F);
        A0o.append(" bankPhoneNumber: ");
        A0o.append(this.A04);
        A0o.append(" bankCode: ");
        A0o.append(this.A0C);
        StringBuilder A0w4 = C18290x4.A0w(" pinFormat: ", A0o);
        A0w4.append(this.A01);
        C195009Vm.A04(A0w4, A0o);
        A0o.append(" pspRouting: ");
        A0o.append(this.A0G);
        A0o.append(" supportPhoneNumber: ");
        A0o.append(this.A0D);
        A0o.append(" transactionPrefix: ");
        A0o.append(this.A0E);
        A0o.append(" banksListVersion: ");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public C166587yw A07() {
        return null;
    }

    public int describeContents() {
        return 0;
    }
}
