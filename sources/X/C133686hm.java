package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6hm  reason: invalid class name and case insensitive filesystem */
public final class C133686hm extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(99);

    public int describeContents() {
        return 0;
    }

    public C133686hm(Parcel parcel) {
        A0C(parcel);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ BANK:");
        A0o.append(super.toString());
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public C133686hm(C161357pU r1, int i, int i2, long j, long j2) {
        C626936e.A06(r1);
        this.A07 = r1;
        this.A05 = j;
        this.A06 = j2;
        this.A00 = i2;
        this.A01 = i;
    }
}
