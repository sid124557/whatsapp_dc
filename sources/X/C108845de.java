package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5de  reason: invalid class name and case insensitive filesystem */
public final class C108845de implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108395cv();
    public final int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public C108845de(List list, List list2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
        this.A03 = z;
        this.A04 = z2;
        C626936e.A0D(AnonymousClass001.A1X(i, 3), "Only set a valid status distribution mode");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C108845de.class)) {
                return false;
            }
            C108845de r4 = (C108845de) obj;
            if (!(this.A00 == r4.A00 && this.A03 == r4.A03 && this.A04 == r4.A04 && C162457s7.A0P(this.A01, r4.A01) && C162457s7.A0P(this.A02, r4.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        objArr[3] = Boolean.valueOf(this.A03);
        return C18310x6.A08(Boolean.valueOf(this.A04), objArr, 4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A01);
        while (A0w.hasNext()) {
            parcel.writeParcelable((Parcelable) A0w.next(), i);
        }
        Iterator A0w2 = AnonymousClass0x7.A0w(parcel, this.A02);
        while (A0w2.hasNext()) {
            parcel.writeParcelable((Parcelable) A0w2.next(), i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusDistributionInfo(statusDistributionMode=");
        A0o.append(this.A00);
        A0o.append(", allowList=");
        A0o.append(this.A01);
        A0o.append(", denyList=");
        A0o.append(this.A02);
        A0o.append(", isCrosspostingToFbEnabled=");
        A0o.append(this.A03);
        A0o.append(", isCrosspostingToIgEnabled=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
