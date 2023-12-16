package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.39P  reason: invalid class name */
public class AnonymousClass39P implements Parcelable {
    public static final Parcelable.Creator A05 = AnonymousClass4IW.A00(23);
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(24);
    public AnonymousClass391 A00;
    public final int A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public boolean A00() {
        String str = this.A02;
        if (C107575bX.A0F(str)) {
            return false;
        }
        try {
            return AnonymousClass0x9.A1H(str).has("limited_time_offer");
        } catch (JSONException e) {
            C18260x0.A0u("InteractiveMessageContent/isLimitedTimeOffer/invalid json=", str, AnonymousClass001.A0o(), e);
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeTypedList(this.A04);
        parcel.writeParcelable(this.A00, 0);
    }

    public AnonymousClass39P(AnonymousClass391 r1, String str, List list, List list2, int i) {
        this.A03 = list;
        this.A01 = i;
        this.A02 = str;
        this.A04 = list2;
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39P(Parcel parcel) {
        int i;
        String str;
        this.A03 = parcel.createTypedArrayList(AnonymousClass395.CREATOR);
        if (parcel.dataAvail() > 0) {
            i = parcel.readInt();
        } else {
            i = 0;
        }
        this.A01 = i;
        if (parcel.dataAvail() > 0) {
            str = parcel.readString();
        } else {
            str = "{}";
        }
        this.A02 = str;
        this.A04 = parcel.createTypedArrayList(A05);
        this.A00 = (AnonymousClass391) C18280x3.A0C(parcel, AnonymousClass391.class);
    }

    @Deprecated
    public AnonymousClass39P(List list) {
        this((AnonymousClass391) null, "{}", list, (List) null, 0);
    }
}
