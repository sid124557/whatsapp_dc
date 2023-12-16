package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.38Z  reason: invalid class name */
public class AnonymousClass38Z implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(6);
    public final C42392Nx A00;

    public String toString() {
        JSONObject A05 = AnonymousClass36S.A05(this.A00, true);
        if (A05 != null) {
            return A05.toString();
        }
        return "<json serialization failed>";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Object obj;
        C42392Nx r2 = this.A00;
        C166587yw r1 = r2.A01;
        parcel.writeInt(r1.A08());
        parcel.writeString((String) null);
        parcel.writeString(r1.A07.A03);
        parcel.writeString(r1.A0A);
        C166557yt r0 = r1.A09;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        parcel.writeString((String) obj);
        if (r1 instanceof C133736hr) {
            parcel.writeInt(((C133736hr) r1).A01);
        }
        BigDecimal bigDecimal = r2.A02.A00;
        parcel.writeInt(bigDecimal.scale());
        parcel.writeString(bigDecimal.toString());
        parcel.writeInt(r2.A00);
    }

    public AnonymousClass38Z(C42392Nx r1) {
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }
}
