package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xy  reason: invalid class name and case insensitive filesystem */
public final class C165997xy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165347wv();
    public final C108775dX A00;
    public final C108775dX A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C165997xy) {
                C165997xy r5 = (C165997xy) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        C108775dX r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C108775dX r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A00) * 31) + C18310x6.A07(this.A01);
    }

    public C165997xy(C108775dX r1, C108775dX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkedAccounts:{'facebookPage'='");
        C108775dX r0 = this.A00;
        String str2 = null;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        A0o.append(str);
        A0o.append("', 'instagramPage'='");
        C108775dX r02 = this.A01;
        if (r02 != null) {
            str2 = r02.toString();
        }
        A0o.append(str2);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
