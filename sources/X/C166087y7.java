package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y7  reason: invalid class name and case insensitive filesystem */
public final class C166087y7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165367wx();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166087y7) {
                C166087y7 r5 = (C166087y7) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00)) {
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
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, AnonymousClass0x2.A01(C18310x6.A09(this.A01), this.A02));
    }

    public C166087y7(String str, boolean z, String str2) {
        C18260x0.A0R(str, str2);
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShareSheetData(text=");
        A0o.append(this.A01);
        A0o.append(", isVideo=");
        A0o.append(this.A02);
        A0o.append(", emailSubject=");
        return C18260x0.A07(this.A00, A0o);
    }
}
