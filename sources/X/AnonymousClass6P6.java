package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6P6  reason: invalid class name */
public final class AnonymousClass6P6 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(54);
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P6.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P6 r5 = (AnonymousClass6P6) obj;
            if (!this.A00.equals(r5.A00) || !C162387ry.A0D(this.A00, r5.A00) || !C162387ry.A0D(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass6C8.A04(this.A00.hashCode()) + C86624Kv.A04(this.A00)) * 31) + AnonymousClass6CA.A06(this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass6P6(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A002 = AnonymousClass87X.A00(this);
        A002.append(": url=");
        return AnonymousClass000.A0X(this.A01, A002);
    }

    public AnonymousClass6P6(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
