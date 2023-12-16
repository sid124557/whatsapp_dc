package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hl  reason: invalid class name and case insensitive filesystem */
public class C133676hl extends AnonymousClass38U {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(101);
    public int A00;
    public long A01 = -1;
    public C156097g1 A02;
    public C156107g2 A03;
    public C166227yL A04;
    public UserJid A05;
    public String A06;
    public boolean A07;

    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 116014:
                    if (str.equals("upi")) {
                        return 3;
                    }
                    break;
                case 3387444:
                    if (str.equals("novi")) {
                        return 2;
                    }
                    break;
                case 97229420:
                    if (str.equals("fbpay")) {
                        return 1;
                    }
                    break;
            }
        }
        return 0;
    }

    public static String A02(int i) {
        if (i == 1) {
            return "fbpay";
        }
        if (i == 3) {
            return "upi";
        }
        throw AnonymousClass0x9.A0i(AnonymousClass000.A0Y("PAY: getPaymentServiceEnumName/invalid service enum: ", AnonymousClass001.A0o(), i));
    }

    public void A05(String str) {
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                C156097g1 A08 = A08();
                JSONObject optJSONObject = A1H.optJSONObject("consumer_status");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        int A002 = A00(A0m);
                        if (A002 != 0) {
                            AnonymousClass6C9.A12(optJSONObject.optString(A0m), A08.A01, A002);
                        }
                    }
                }
                C166227yL r9 = this.A04;
                if (r9 == null) {
                    r9 = new C166227yL();
                    this.A04 = r9;
                }
                JSONObject optJSONObject2 = A1H.optJSONObject("incentive");
                if (optJSONObject2 != null) {
                    try {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String A0m2 = AnonymousClass001.A0m(keys2);
                            JSONArray optJSONArray = optJSONObject2.optJSONArray(A0m2);
                            if (optJSONArray != null) {
                                HashSet A0K = AnonymousClass002.A0K();
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    AnonymousClass0x2.A1Q(A0K, optJSONArray.getLong(i));
                                }
                                r9.A00.put(A0m2, A0K);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/setIdTransactionMapfromJSON/failed to parse idJSON array", e);
                    }
                }
                C156107g2 r5 = this.A03;
                if (r5 == null) {
                    r5 = new C156107g2();
                    this.A03 = r5;
                }
                JSONObject optJSONObject3 = A1H.optJSONObject("eligible_offers");
                if (optJSONObject3 != null) {
                    try {
                        JSONObject jSONObject = optJSONObject3.getJSONObject("dhash");
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String A0m3 = AnonymousClass001.A0m(keys3);
                            int A003 = A00(A0m3);
                            if (A003 != 0) {
                                AnonymousClass6C9.A12(jSONObject.optString(A0m3), r5.A01, A003);
                            }
                        }
                        JSONObject jSONObject2 = optJSONObject3.getJSONObject("offers");
                        Iterator<String> keys4 = jSONObject2.keys();
                        while (keys4.hasNext()) {
                            String A0m4 = AnonymousClass001.A0m(keys4);
                            int A004 = A00(A0m4);
                            if (A004 != 0) {
                                AnonymousClass6C9.A12(jSONObject2.optString(A0m4), r5.A00, A004);
                            }
                        }
                    } catch (JSONException e2) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", e2);
                    }
                }
            } catch (JSONException e3) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", e3);
            }
        }
    }

    public int A07() {
        return this.A00;
    }

    public final C156097g1 A08() {
        C156097g1 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C156097g1 r02 = new C156097g1();
        this.A02 = r02;
        return r02;
    }

    public String A09() {
        return "";
    }

    public void A0A(int i) {
        this.A00 = i;
    }

    public void A0B(String str) {
    }

    public void A0C(boolean z) {
        this.A07 = z;
    }

    public boolean A0D() {
        return this.A07;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C627336j.A07(this.A05));
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        C156097g1 A08 = A08();
        parcel.writeLong(A08.A00);
        Map map = A08.A01;
        parcel.writeInt(map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            parcel.writeInt(C18280x3.A06(A0w));
            parcel.writeString(AnonymousClass0x9.A12(A0w));
        }
        parcel.writeParcelable(this.A04, i);
        C156107g2 r3 = this.A03;
        if (r3 == null) {
            r3 = new C156107g2();
            this.A03 = r3;
        }
        Map map2 = r3.A01;
        parcel.writeInt(map2.size());
        Iterator A0q2 = AnonymousClass000.A0q(map2);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            parcel.writeInt(C18280x3.A06(A0w2));
            parcel.writeString(AnonymousClass0x9.A12(A0w2));
        }
        Map map3 = r3.A00;
        parcel.writeInt(map3.size());
        Iterator A0q3 = AnonymousClass000.A0q(map3);
        while (A0q3.hasNext()) {
            Map.Entry A0w3 = AnonymousClass001.A0w(A0q3);
            parcel.writeInt(C18280x3.A06(A0w3));
            parcel.writeString(AnonymousClass0x9.A12(A0w3));
        }
    }

    public C133676hl(Parcel parcel) {
        this.A05 = UserJid.Companion.A0E(parcel.readString());
        this.A07 = AnonymousClass001.A1T(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = new C156097g1(parcel);
        this.A04 = (C166227yL) C18280x3.A0C(parcel, C166227yL.class);
        this.A03 = new C156107g2(parcel);
    }

    public static int A01(String str) {
        switch (str.hashCode()) {
            case -1422950650:
                if (str.equals("active")) {
                    return 3;
                }
                break;
            case -309833220:
                if (str.equals("ineligible")) {
                    return 1;
                }
                break;
            case 100743639:
                if (str.equals("eligible")) {
                    return 2;
                }
                break;
        }
        return 0;
    }

    public String A03() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            C156097g1 A08 = A08();
            HashMap A0t = AnonymousClass001.A0t();
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            Iterator A0q = AnonymousClass000.A0q(A08.A01);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0t.put(A02(C18280x3.A06(A0w)), A0w.getValue());
                try {
                    A1G2.putOpt(A02(C18280x3.A06(A0w)), A0w.getValue());
                } catch (JSONException e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: ConsumerStatusData/getDataHashesDbString/exception: ", e);
                }
            }
            A1G.putOpt("consumer_status", new JSONObject(A0t));
            C166227yL r0 = this.A04;
            if (r0 == null) {
                r0 = new C166227yL();
                this.A04 = r0;
            }
            JSONObject A1G3 = AnonymousClass0x9.A1G();
            try {
                HashMap hashMap = r0.A00;
                Iterator A11 = C18290x4.A11(hashMap);
                while (A11.hasNext()) {
                    String A0m = AnonymousClass001.A0m(A11);
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(A0m);
                    if (abstractCollection != null) {
                        JSONArray A1F = AnonymousClass0x9.A1F();
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass0x7.A1L(it, A1F);
                        }
                        A1G3.put(A0m, A1F);
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/toJson/ failed to build json");
            }
            A1G.putOpt("incentive", A1G3);
            C156107g2 r9 = this.A03;
            if (r9 == null) {
                r9 = new C156107g2();
                this.A03 = r9;
            }
            JSONObject A1G4 = AnonymousClass0x9.A1G();
            try {
                HashMap A0t2 = AnonymousClass001.A0t();
                JSONObject A1G5 = AnonymousClass0x9.A1G();
                Iterator A0q2 = AnonymousClass000.A0q(r9.A01);
                while (A0q2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                    A0t2.put(A02(C18280x3.A06(A0w2)), A0w2.getValue());
                    try {
                        A1G5.putOpt(A02(C18280x3.A06(A0w2)), A0w2.getValue());
                    } catch (JSONException e2) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", e2);
                    }
                }
                A1G4.putOpt("dhash", new JSONObject(A0t2));
                HashMap A0t3 = AnonymousClass001.A0t();
                JSONObject A1G6 = AnonymousClass0x9.A1G();
                Iterator A0q3 = AnonymousClass000.A0q(r9.A00);
                while (A0q3.hasNext()) {
                    Map.Entry A0w3 = AnonymousClass001.A0w(A0q3);
                    A0t3.put(A02(C18280x3.A06(A0w3)), A0w3.getValue());
                    try {
                        A1G6.putOpt(A02(C18280x3.A06(A0w3)), A0w3.getValue());
                    } catch (JSONException e3) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", e3);
                    }
                }
                A1G4.putOpt("offers", new JSONObject(A0t3));
            } catch (JSONException e4) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", e4);
            }
            A1G.putOpt("eligible_offers", A1G4);
            return A1G.toString();
        } catch (JSONException e5) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentContactInfoCountryData/toDBString/exception: ", e5);
            return null;
        }
    }

    public void A06(List list, int i) {
    }

    public void A04(C617332a r1, AnonymousClass36K r2, int i) {
    }

    public C133676hl() {
    }
}
