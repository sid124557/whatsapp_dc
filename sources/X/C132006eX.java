package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6eX  reason: invalid class name and case insensitive filesystem */
public final class C132006eX extends C165777xc {
    public static final Parcelable.Creator CREATOR = new C165057wS();
    public final int A00;
    public final AnonymousClass59G A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132006eX) {
                C132006eX r5 = (C132006eX) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        C18290x4.A1D(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, C18310x6.A09(this.A02)) + this.A00;
    }

    public C132006eX(AnonymousClass59G r1, String str, int i) {
        C18260x0.A0Q(str, r1);
        this.A02 = str;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PromoteStatusParams(id=");
        A0o.append(this.A02);
        A0o.append(", entryPointSource=");
        A0o.append(this.A01);
        A0o.append(", lwiEntryPoint=");
        return C18260x0.A09(A0o, this.A00);
    }
}
