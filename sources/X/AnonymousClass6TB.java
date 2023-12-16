package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TB  reason: invalid class name */
public final class AnonymousClass6TB extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164947wH();
    public final byte A00;
    public final byte A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AnonymousClass6TB.class == obj.getClass()) {
                AnonymousClass6TB r5 = (AnonymousClass6TB) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02.equals(r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0x7.A08(this.A02, (((this.A00 + 31) * 31) + this.A01) * 31);
    }

    public final String toString() {
        byte b = this.A00;
        byte b2 = this.A01;
        String str = this.A02;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(str) + 73);
        A0Y.append("AmsEntityUpdateParcelable{, mEntityId=");
        A0Y.append(b);
        A0Y.append(", mAttributeId=");
        A0Y.append(b2);
        A0Y.append(", mValue='");
        A0Y.append(str);
        return AnonymousClass000.A0X("'}", A0Y);
    }

    public AnonymousClass6TB(String str, byte b, byte b2) {
        this.A00 = b;
        this.A01 = b2;
        this.A02 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A04(parcel, this.A00, 2);
        C162417s1.A04(parcel, this.A01, 3);
        C162417s1.A0B(parcel, this.A02, 4, false);
        C162417s1.A06(parcel, A002);
    }
}
