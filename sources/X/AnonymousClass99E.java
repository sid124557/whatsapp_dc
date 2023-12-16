package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.99E  reason: invalid class name */
public final class AnonymousClass99E extends AnonymousClass38U {
    public static final HashSet A01 = C18280x3.A0h(new String[]{"vpa", "keys", "vpaName", "balance", "usableBalance", "updatedSenderVpa", "sufficientBalance"});
    public static final Parcelable.Creator CREATOR = new AnonymousClass9XU();
    public Bundle A00;

    public void A04(C617332a r16, AnonymousClass36K r17, int i) {
        ArrayList A0s;
        ArrayList A0s2;
        String str;
        String A0r;
        Bundle bundle;
        AnonymousClass36K r3 = r17;
        int i2 = i;
        if (i2 == 4) {
            String A0L = AnonymousClass36K.A0L(r3, "credential-id");
            if (A0L != null) {
                Bundle A08 = AnonymousClass002.A08();
                this.A00 = A08;
                A08.putString("credentialId", A0L);
                return;
            }
            return;
        }
        if (i2 == 5) {
            str = "keys";
            A0r = AnonymousClass36K.A0L(r3, str);
            if (A0r != null) {
                bundle = AnonymousClass002.A08();
                this.A00 = bundle;
            } else {
                return;
            }
        } else {
            if (i2 == 6) {
                this.A00 = AnonymousClass002.A08();
                String A0r2 = r3.A0r("vpa-mismatch", (String) null);
                if (A0r2 != null) {
                    this.A00.putString("updatedVpaFor", A0r2);
                    if (C1899593h.A1W(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0r("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0r("vpa-id", (String) null));
                        return;
                    }
                    return;
                }
                String A0r3 = r3.A0r("valid", (String) null);
                if (A0r3 != null) {
                    this.A00.putString("valid", A0r3);
                }
                String A002 = A00(r3, "balance");
                if (A002 != null) {
                    this.A00.putString("balance", A002);
                }
                this.A00.putString("sufficientBalance", r3.A0r("sufficient-balance", (String) null));
            } else if (i2 == 8) {
                this.A00 = AnonymousClass002.A08();
                String A0r4 = r3.A0r("vpa-mismatch", (String) null);
                if (A0r4 != null) {
                    this.A00.putString("updatedVpaFor", A0r4);
                    if (C1899593h.A1W(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0r("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0r("vpa-id", (String) null));
                    }
                    String A003 = A00(r3, "balance");
                    if (A003 != null) {
                        this.A00.putString("balance", A003);
                    }
                } else {
                    return;
                }
            } else if (i2 == 7) {
                this.A00 = AnonymousClass002.A08();
                this.A00.putString("vpa", r3.A0r("vpa", (String) null));
                this.A00.putString("vpaId", r3.A0r("vpa-id", (String) null));
                this.A00.putString("vpaName", r3.A0r("vpa-name", (String) null));
                this.A00.putString("vpaValid", r3.A0r("valid", (String) null));
                this.A00.putString("jid", r3.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER, (String) null));
                this.A00.putString("blocked", r3.A0r("blocked", (String) null));
                this.A00.putString("token", r3.A0r("token", (String) null));
                this.A00.putString("merchant", r3.A0r("merchant", (String) null));
                this.A00.putString("verifiedMerchant", r3.A0r("verified-merchant", (String) null));
                str = "mcc";
                A0r = r3.A0r(str, (String) null);
                bundle = this.A00;
            } else if (i2 == 2) {
                Bundle A082 = AnonymousClass002.A08();
                this.A00 = A082;
                String str2 = r3.A00;
                if ("psp".equals(str2)) {
                    A082.putString("providerType", r3.A0r("provider-type", (String) null));
                    Bundle bundle2 = this.A00;
                    String A0r5 = r3.A0r("sms-gateways", (String) null);
                    if (!TextUtils.isEmpty(A0r5)) {
                        A0s2 = AnonymousClass0x2.A0i(A0r5.split(","));
                    } else {
                        A0s2 = AnonymousClass001.A0s();
                    }
                    bundle2.putStringArrayList("smsGateways", A0s2);
                    this.A00.putString("smsPrefix", r3.A0r("sms-prefix", (String) null));
                    this.A00.putString("transactionPrefix", r3.A0r("transaction-prefix", (String) null));
                    return;
                } else if ("psp-routing".equals(str2)) {
                    String A0L2 = AnonymousClass36K.A0L(r3, "providers");
                    if (!TextUtils.isEmpty(A0L2)) {
                        A0s = AnonymousClass0x2.A0i(A0L2.split(","));
                    } else {
                        A0s = AnonymousClass001.A0s();
                    }
                    A082.putStringArrayList("pspRouting", A0s);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            String A004 = A00(r3, "usable-balance");
            if (A004 != null) {
                this.A00.putString("usableBalance", A004);
                return;
            }
            return;
        }
        bundle.putString(str, A0r);
    }

    public String A03() {
        throw AnonymousClass002.A0G("PAY: IndiaUpiPaymentData does not support toDBString");
    }

    public void A05(String str) {
        throw AnonymousClass002.A0G("PAY: IndiaUpiPaymentData does not support fromDBString");
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: IndiaUpiPaymentData does not support toNetwork");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public static final String A00(AnonymousClass36K r6, String str) {
        AnonymousClass36K A0l = r6.A0l(str);
        if (A0l == null) {
            return AnonymousClass36K.A0L(r6, str);
        }
        try {
            AnonymousClass36K A0m = A0l.A0m("money");
            return String.valueOf(((double) ((long) A0m.A0a("value"))) / ((double) ((long) A0m.A0a("offset"))));
        } catch (AnonymousClass24Y unused) {
            Log.e("PAY: IndiaUpiPaymentData parseBalance failure");
            return null;
        }
    }

    public String toString() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<String> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            boolean contains = A01.contains(A0m);
            StringBuilder A0o = AnonymousClass001.A0o();
            if (!contains) {
                A0o.append(A0m);
                A0o.append("=");
                A0o.append(this.A00.get(A0m));
            } else {
                A0o.append(A0m);
                A0o.append("=SCRUBBED");
            }
            A0s.add(A0o.toString());
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(" [ bundle: {");
        A0o2.append(TextUtils.join(", ", A0s));
        return AnonymousClass000.A0X("}]", A0o2);
    }

    public int describeContents() {
        return 0;
    }
}
