package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6PC  reason: invalid class name */
public final class AnonymousClass6PC extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(46);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final AnonymousClass87X[] A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6PC.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6PC r7 = (AnonymousClass6PC) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A02 == r7.A02 && C162387ry.A0D(this.A04, r7.A04) && Arrays.equals(this.A05, r7.A05))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6PC(String str, AnonymousClass87X[] r3, int i, int i2, long j, long j2) {
        super("CHAP");
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = r3;
    }

    public int hashCode() {
        return ((((((((527 + this.A01) * 31) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + C86624Kv.A04(this.A04);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(r3);
        for (AnonymousClass87X writeParcelable : this.A05) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public AnonymousClass6PC(Parcel parcel) {
        super("CHAP");
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new AnonymousClass87X[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A05[i] = C18280x3.A0C(parcel, AnonymousClass87X.class);
        }
    }
}
