package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6P8  reason: invalid class name */
public final class AnonymousClass6P8 extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(50);
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6P8.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6P8 r5 = (AnonymousClass6P8) obj;
            if (!C162387ry.A0D(this.A00, r5.A00) || !C162387ry.A0D(this.A01, r5.A01) || !C162387ry.A0D(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6P8(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public int hashCode() {
        return ((AnonymousClass6C8.A04(C86624Kv.A04(this.A01)) + C86624Kv.A04(this.A00)) * 31) + AnonymousClass6CA.A06(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public String toString() {
        StringBuilder A002 = AnonymousClass87X.A00(this);
        A002.append(": domain=");
        AnonymousClass6C8.A1E(A002, this.A01);
        return AnonymousClass000.A0X(this.A00, A002);
    }

    public AnonymousClass6P8(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
