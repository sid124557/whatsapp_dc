package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99F  reason: invalid class name */
public class AnonymousClass99F extends C133756ht {
    public static final Parcelable.Creator CREATOR = new C204589pb(20);

    public void A04(C617332a r7, AnonymousClass36K r8, int i) {
        if (r8 == null) {
            C1899593h.A1Q("BrazilCustomPaymentMethodData", "fromNetwork: the customPaymentNode is null");
            return;
        }
        try {
            this.A00 = r8.A0q("country");
            this.A01 = r8.A0q("credential-id");
            this.A02 = r8.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            AnonymousClass36K A0l = r8.A0l("metadata_info");
            if (A0l != null) {
                this.A03 = AnonymousClass001.A0t();
                Iterator A0M = AnonymousClass36K.A0M(A0l, "metadata");
                while (A0M.hasNext()) {
                    AnonymousClass36K r1 = (AnonymousClass36K) A0M.next();
                    String A0q = r1.A0q("key");
                    this.A03.put(A0q, new C166257yO(A0q, r1.A0q("value")));
                }
            }
        } catch (AnonymousClass24Y e) {
            C1899593h.A1Q("BrazilCustomPaymentMethodData", AnonymousClass000.A0a("Error creating an instance of BrazilCustomPaymentMethodData. Exception = ", AnonymousClass001.A0o(), e));
        }
    }

    public void A05(String str) {
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                try {
                    Iterator<String> keys = A1H.keys();
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        this.A03.put(A0m, new C166257yO(A0m, A1H.getString(A0m)));
                    }
                } catch (JSONException e) {
                    C1899593h.A1Q("BrazilCustomPaymentMethodData", AnonymousClass000.A0P(e, "fromJSONObject threw: ", AnonymousClass001.A0o()));
                }
            } catch (JSONException e2) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "BrazilCustomPaymentMethodData fromDBString threw: ", e2);
            }
        }
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A04));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03.size());
        Iterator A0u = AnonymousClass001.A0u(this.A03);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            parcel.writeString(C18310x6.A0q(A0w));
            parcel.writeString(((C166257yO) A0w.getValue()).A01);
        }
    }

    public String A03() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                Iterator A0u = AnonymousClass001.A0u(this.A03);
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    A1G.put(C18310x6.A0q(A0w), ((C166257yO) A0w.getValue()).A01);
                }
            } catch (Exception e) {
                C1899593h.A1Q("BrazilCustomPaymentMethodData", AnonymousClass000.A0P(e, "toJSONObject threw an exception : ", AnonymousClass001.A0o()));
            }
            return A1G.toString();
        } catch (Exception e2) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "BrazilCustomPaymentMethodData: toDBString threw ", e2);
            return null;
        }
    }

    public void A06(List list, int i) {
    }

    public C166587yw A07() {
        return null;
    }

    public C166557yt A08() {
        return null;
    }

    public String A09() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass99F(String str, String str2, String str3, HashMap hashMap) {
        super(str, str2, str3, hashMap);
    }

    public AnonymousClass99F() {
        super("BR", "", "", AnonymousClass001.A0t());
    }
}
