package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38k  reason: invalid class name and case insensitive filesystem */
public final class C632238k implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38P();
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632238k) {
                C632238k r5 = (C632238k) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return AnonymousClass0x9.A04(this.A01) + this.A00;
    }

    public C632238k(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusArchiveSettingsViewState(isEnabled=");
        A0o.append(this.A01);
        A0o.append(", archiveDurationInDays=");
        return C18260x0.A09(A0o, this.A00);
    }
}
