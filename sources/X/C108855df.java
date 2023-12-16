package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5df  reason: invalid class name and case insensitive filesystem */
public final class C108855df implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108415cx();
    public final long A00;
    public final C108815db A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C108855df(C108815db r2, String str, String str2, String str3, long j) {
        C18270x1.A11(str, 1, r2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r2;
        this.A04 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108855df) {
                C108855df r8 = (C108855df) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, AnonymousClass000.A00((C18310x6.A09(this.A03) + C18270x1.A00(this.A02)) * 31, this.A00)) + AnonymousClass0x7.A07(this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkedAccountPost(id=");
        A0o.append(this.A03);
        A0o.append(", caption=");
        A0o.append(this.A02);
        A0o.append(", creationTime=");
        A0o.append(this.A00);
        A0o.append(", image=");
        A0o.append(this.A01);
        A0o.append(", postUrl=");
        return C18260x0.A07(this.A04, A0o);
    }
}
