package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6UU  reason: invalid class name */
public class AnonymousClass6UU extends C127206Rb {
    public static final Parcelable.Creator CREATOR = new C163977ug();
    public final int A00;
    public final C142946y4 A01;
    public final String A02;

    public C142946y4 A00() {
        return this.A01;
    }

    public String A01() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6UU) {
            AnonymousClass6UU r4 = (AnonymousClass6UU) obj;
            if (!AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(Integer.valueOf(this.A00), Integer.valueOf(r4.A00))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6UU(int i, String str, int i2) {
        try {
            for (C142946y4 r1 : C142946y4.values()) {
                if (i == r1.zzb) {
                    this.A01 = r1;
                    this.A02 = str;
                    this.A00 = i2;
                    return;
                }
            }
            throw new C143226yX(i);
        } catch (C143226yX e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        A1X[1] = this.A02;
        AnonymousClass000.A1N(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        AnonymousClass7WD r4 = new AnonymousClass7WD(C18310x6.A0n(this));
        String valueOf = String.valueOf(this.A01.zzb);
        AnonymousClass6WP r1 = new AnonymousClass6WP((AnonymousClass70J) null);
        r4.A00.A00 = r1;
        r4.A00 = r1;
        r1.A01 = valueOf;
        r1.A02 = "errorCode";
        String str = this.A02;
        if (str != null) {
            r4.A00(str, "errorMessage");
        }
        return r4.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A01.zzb);
        C162417s1.A0B(parcel, this.A02, 3, false);
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
