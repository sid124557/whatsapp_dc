package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ev  reason: invalid class name and case insensitive filesystem */
public final class C132236ev extends C165827xh {
    public static final Parcelable.Creator CREATOR = new C165167wd();
    public final C108815db A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132236ev) {
                C132236ev r5 = (C132236ev) obj;
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
        this.A00.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C132236ev(C108815db r1, String str) {
        C18260x0.A0Q(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ThumbnailOption(value=");
        A0o.append(this.A01);
        A0o.append(", thumbnail=");
        return C18260x0.A04(this.A00, A0o);
    }
}
