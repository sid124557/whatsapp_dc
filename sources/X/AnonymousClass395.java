package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.395  reason: invalid class name */
public class AnonymousClass395 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(26);
    public boolean A00;
    public final AnonymousClass398 A01;

    public static boolean A00(Object obj, Object obj2) {
        return C162457s7.A0P(((AnonymousClass395) obj).A01.A00, obj2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public AnonymousClass395(Parcel parcel) {
        this.A01 = (AnonymousClass398) C18280x3.A0C(parcel, AnonymousClass398.class);
        this.A00 = AnonymousClass000.A1S(parcel.readByte());
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass395(AnonymousClass398 r1, boolean z) {
        this.A00 = z;
        this.A01 = r1;
    }
}
