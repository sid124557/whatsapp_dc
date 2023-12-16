package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.87Z  reason: invalid class name */
public final class AnonymousClass87Z implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(41);
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass87Z.class != obj.getClass()) {
                return false;
            }
            AnonymousClass87Z r5 = (AnonymousClass87Z) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass6C8.A04(this.A00.hashCode()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass87Z(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VC: ");
        A0o.append(this.A00);
        A0o.append("=");
        return AnonymousClass000.A0X(this.A01, A0o);
    }

    public AnonymousClass87Z(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
