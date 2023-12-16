package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7yg  reason: invalid class name and case insensitive filesystem */
public final class C166437yg implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(4);
    public final long A00;
    public final C187338x1[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166437yg.class != obj.getClass()) {
                return false;
            }
            C166437yg r7 = (C166437yg) obj;
            if (!Arrays.equals(this.A01, r7.A01) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(Arrays.hashCode(this.A01) * 31, this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (C187338x1 writeParcelable : this.A01) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.A00);
    }

    public C166437yg(Parcel parcel) {
        this.A01 = new C187338x1[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = C18280x3.A0C(parcel, C187338x1.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public String toString() {
        String A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("entries=");
        C18320x8.A1P(A0o, this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0Z = "";
        } else {
            A0Z = AnonymousClass000.A0Z(", presentationTimeUs=", AnonymousClass001.A0o(), j);
        }
        return AnonymousClass000.A0X(A0Z, A0o);
    }

    public C166437yg(C187338x1... r3) {
        this.A00 = -9223372036854775807L;
        this.A01 = r3;
    }
}
