package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T8  reason: invalid class name */
public class AnonymousClass6T8 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164277vC();
    public final int A00;
    public final Float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6T8) {
                AnonymousClass6T8 r5 = (AnonymousClass6T8) obj;
                if (this.A00 != r5.A00 || !AnonymousClass72K.A00(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf.length() + 39);
        A0Y.append("[PatternItem: type=");
        A0Y.append(i);
        A0Y.append(" length=");
        return AnonymousClass000.A0W(valueOf, A0Y);
    }

    public AnonymousClass6T8(Float f, int i) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf.length() + 45);
        A0Y.append("Invalid PatternItem: type=");
        A0Y.append(i);
        String A0V = AnonymousClass000.A0V(" length=", valueOf, A0Y);
        if (z) {
            this.A00 = i;
            this.A01 = f;
            return;
        }
        throw AnonymousClass6C7.A0U(A0V);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        Float f = this.A01;
        if (f != null) {
            parcel.writeInt(262147);
            parcel.writeFloat(f.floatValue());
        }
        C162417s1.A06(parcel, A002);
    }
}
