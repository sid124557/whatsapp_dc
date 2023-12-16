package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6PB  reason: invalid class name */
public final class AnonymousClass6PB extends AnonymousClass87X {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(51);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6PB.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6PB r5 = (AnonymousClass6PB) obj;
            if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && Arrays.equals(this.A03, r5.A03) && Arrays.equals(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6PB(Parcel parcel) {
        super("MLLT");
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.createIntArray();
        this.A04 = parcel.createIntArray();
    }

    public int hashCode() {
        return ((((((((527 + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }

    public AnonymousClass6PB(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }
}
