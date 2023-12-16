package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6TA  reason: invalid class name */
public final class AnonymousClass6TA extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163447tp();
    public final long A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6TA) {
                AnonymousClass6TA r8 = (AnonymousClass6TA) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A0A = C18330xA.A0A("CollectForDebugParcelable[skipPersistentStorage: ");
        A0A.append(this.A02);
        A0A.append(",collectForDebugStartTimeMillis: ");
        A0A.append(this.A00);
        A0A.append(",collectForDebugExpiryTimeMillis: ");
        A0A.append(this.A01);
        return AnonymousClass000.A0f(A0A);
    }

    public AnonymousClass6TA(long j, long j2, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass001.A1R(A1X, this.A02);
        AnonymousClass001.A1Q(A1X, this.A00);
        AnonymousClass0x2.A1U(A1X, this.A01);
        return Arrays.hashCode(A1X);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A02);
        C162417s1.A08(parcel, 2, this.A01);
        C162417s1.A08(parcel, 3, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
