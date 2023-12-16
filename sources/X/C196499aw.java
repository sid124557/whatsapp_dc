package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9aw  reason: invalid class name and case insensitive filesystem */
public class C196499aw implements C85194Fh {
    public static final Parcelable.Creator CREATOR = new C204589pb(15);
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
    }

    public C196499aw(AnonymousClass36K r9, String str) {
        if (str != null) {
            this.A03 = C615531h.A01(str, 0) == 1;
        }
        if (r9 != null) {
            String A0r = r9.A0r("created-ts", (String) null);
            if (A0r != null) {
                this.A00 = C615531h.A04(A0r, 0) * 1000;
            }
            String A0r2 = r9.A0r("updated-ts", (String) null);
            if (A0r2 != null) {
                this.A01 = C615531h.A04(A0r2, 0) * 1000;
            }
            String A0r3 = r9.A0r("complaint-status", (String) null);
            if (!TextUtils.isEmpty(A0r3)) {
                this.A02 = A0r3;
            }
        }
    }

    public String A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("is-complaint-eligible", this.A03);
            long j = this.A00;
            if (j > 0) {
                A1G.put("created-ts", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A1G.put("updated-ts", j2);
            }
            String str = this.A02;
            if (str != null) {
                A1G.put("complaint-status", str);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionComplaintData toJson threw: ", e);
        }
        return A1G.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiTransactionComplaintData{isComplaintEligible='");
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", createdTs='");
        A0o.append(this.A00);
        A0o.append('\'');
        A0o.append(", updatedTs='");
        A0o.append(this.A01);
        A0o.append('\'');
        A0o.append(", complaintStatus='");
        A0o.append(this.A02);
        A0o.append('\'');
        return AnonymousClass000.A0d(A0o);
    }

    public String B5h() {
        return this.A02;
    }

    public long BE5() {
        return this.A01;
    }

    public int describeContents() {
        return 0;
    }

    public C196499aw(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A03 = A1H.optBoolean("is-complaint-eligible", false);
                this.A00 = A1H.optLong("created-ts");
                this.A01 = A1H.optLong("updated-ts");
                this.A02 = A1H.optString("complaint-status");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e);
            }
        }
    }

    public C196499aw(Parcel parcel) {
        this.A03 = AnonymousClass000.A1S(parcel.readByte());
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
    }
}
