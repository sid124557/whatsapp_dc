package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38j  reason: invalid class name and case insensitive filesystem */
public final class C632138j implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38J();
    public final String A00;
    public final String A01;

    public C632138j(String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632138j) {
                C632138j r5 = (C632138j) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + C18270x1.A00(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarProfilePhotoPose(url=");
        A0o.append(this.A01);
        A0o.append(", emojis=");
        return C18260x0.A07(this.A00, A0o);
    }
}
