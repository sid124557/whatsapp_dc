package X;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1S4  reason: invalid class name */
public abstract class AnonymousClass1S4 extends AnonymousClass38U {
    public AnonymousClass39O A00;
    public AnonymousClass39L A01;
    public AnonymousClass39U A02;
    public Boolean A03;
    public boolean A04;

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract long A0B();

    public abstract String A0K();

    public abstract String A0L();

    public abstract String A0M();

    public abstract String A0N();

    public abstract String A0O();

    public abstract void A0Q(int i);

    public abstract void A0R(int i);

    public abstract void A0S(int i);

    public abstract void A0U(long j);

    public abstract void A0Y(String str);

    public abstract void A0Z(String str);

    public abstract void A0a(String str);

    public void A0T(long j) {
    }

    public void A0W(AnonymousClass1S4 r2) {
        this.A04 = r2.A04;
        AnonymousClass39L r0 = r2.A01;
        if (r0 != null) {
            this.A01 = r0;
        }
        AnonymousClass39O r02 = r2.A00;
        if (r02 != null) {
            this.A00 = r02;
        }
        AnonymousClass39U r03 = r2.A02;
        if (r03 != null) {
            this.A02 = r03;
        }
        Boolean bool = r2.A03;
        if (bool != null) {
            this.A03 = bool;
        }
    }

    public void A0X(String str) {
    }

    public boolean A0e(AnonymousClass1S4 r2) {
        return false;
    }

    public boolean A0f(C624034w r2) {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeSerializable(this.A03);
    }

    public void A05(String str) {
        AnonymousClass39U r0;
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A04 = A1H.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = A1H.optJSONObject("money");
            if (optJSONObject != null) {
                this.A01 = C60042xu.A00(optJSONObject);
            }
            JSONObject optJSONObject2 = A1H.optJSONObject("incentive");
            if (optJSONObject2 != null) {
                this.A00 = new AnonymousClass39O(optJSONObject2);
            }
            JSONObject optJSONObject3 = A1H.optJSONObject("order");
            if (optJSONObject3 != null) {
                r0 = new AnonymousClass39U(optJSONObject3);
            } else {
                String optString = A1H.optString("orderId");
                long optLong = A1H.optLong("orderExpiryTsInSec");
                String optString2 = A1H.optString("orderMessageId");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    r0 = new AnonymousClass39U(optLong, optString, optString2);
                }
                this.A03 = Boolean.valueOf(A1H.optBoolean("isPendingRequestViewed", false));
            }
            this.A02 = r0;
            this.A03 = Boolean.valueOf(A1H.optBoolean("isPendingRequestViewed", false));
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e);
        }
    }

    public long A0A() {
        return 0;
    }

    public C85194Fh A0C() {
        return null;
    }

    public C195319Xg A0D() {
        return null;
    }

    public AnonymousClass39L A0E() {
        return null;
    }

    public C166557yt A0F() {
        return null;
    }

    public C166557yt A0G() {
        return null;
    }

    public C166557yt A0H() {
        return null;
    }

    public C21421Bt A0I() {
        return null;
    }

    public String A0J() {
        return null;
    }

    public JSONObject A0P() {
        JSONArray A1F;
        JSONObject A1G = AnonymousClass0x9.A1G();
        boolean z = this.A04;
        if (z) {
            A1G.put("messageDeleted", z);
        }
        AnonymousClass39L r0 = this.A01;
        if (r0 != null) {
            A1G.put("money", r0.A01());
        }
        AnonymousClass39O r4 = this.A00;
        if (r4 != null) {
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            try {
                A1G2.put("offer-id", r4.A02);
                String str = r4.A01;
                if (str != null) {
                    A1G2.put("offer-claim-id", str);
                }
                String str2 = r4.A03;
                if (str2 != null) {
                    A1G2.put("parent-transaction-id", str2);
                }
                String str3 = r4.A00;
                if (str3 != null) {
                    A1G2.put("incentive-payment-id", str3);
                }
            } catch (JSONException e) {
                Log.w("PAY: PaymentIncentiveData toJson threw: ", e);
            }
            A1G.put("incentive", A1G2);
        }
        AnonymousClass39U r8 = this.A02;
        if (r8 != null) {
            JSONObject A1G3 = AnonymousClass0x9.A1G();
            A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A01);
            A1G3.put("message_id", r8.A02);
            A1G3.put("expiry_ts", r8.A00);
            String str4 = r8.A04;
            if (!TextUtils.isEmpty(str4)) {
                A1G3.put("payment_config_id", str4);
            }
            List<AnonymousClass38Y> list = r8.A05;
            if (list != null && !list.isEmpty()) {
                if (list.isEmpty()) {
                    A1F = null;
                } else {
                    A1F = AnonymousClass0x9.A1F();
                    for (AnonymousClass38Y r2 : list) {
                        JSONObject A1G4 = AnonymousClass0x9.A1G();
                        if (r2 != null) {
                            AnonymousClass38Y.A00(r2, r2.A04, A1F, A1G4);
                        }
                    }
                }
                A1G3.put("beneficiaries", A1F);
            }
            String str5 = r8.A03;
            if (!TextUtils.isEmpty(str5)) {
                A1G3.put("order-type", str5);
            }
            A1G.put("order", A1G3);
        }
        Boolean bool = this.A03;
        if (bool != null) {
            A1G.put("isPendingRequestViewed", bool.booleanValue());
        }
        return A1G;
    }

    public void A0V(Parcel parcel) {
        this.A04 = AnonymousClass001.A1T(parcel.readByte());
        this.A01 = (AnonymousClass39L) C18280x3.A0C(parcel, AnonymousClass39L.class);
        this.A02 = (AnonymousClass39U) C18280x3.A0C(parcel, AnonymousClass39U.class);
        this.A03 = (Boolean) parcel.readSerializable();
    }

    public boolean A0b() {
        return false;
    }

    public boolean A0c() {
        return false;
    }

    public boolean A0d() {
        return false;
    }

    public int describeContents() {
        return 0;
    }
}
