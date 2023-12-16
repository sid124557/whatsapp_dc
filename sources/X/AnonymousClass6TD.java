package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6TD  reason: invalid class name */
public final class AnonymousClass6TD extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164217v5();
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass0x2.A1U(objArr, this.A03);
        AnonymousClass0x2.A1V(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6TD) {
            AnonymousClass6TD r7 = (AnonymousClass6TD) obj;
            if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A03 == r7.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A0A = C18330xA.A0A("NetworkLocationStatus:");
        A0A.append(" Wifi status: ");
        A0A.append(this.A00);
        A0A.append(" Cell status: ");
        A0A.append(this.A01);
        A0A.append(" elapsed time NS: ");
        A0A.append(this.A03);
        A0A.append(" system time ms: ");
        return AnonymousClass001.A0k(A0A, this.A02);
    }

    public AnonymousClass6TD(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A07(parcel, 2, this.A01);
        C162417s1.A08(parcel, 3, this.A02);
        C162417s1.A08(parcel, 4, this.A03);
        C162417s1.A06(parcel, A002);
    }
}
