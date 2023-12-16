package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.0AX  reason: invalid class name */
public class AnonymousClass0AX extends C04820Qu {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public AnonymousClass0AX(Parcel parcel) {
        this(parcel, new AnonymousClass05C(), new AnonymousClass05C(), new AnonymousClass05C(), "", parcel.dataPosition(), parcel.dataSize());
    }

    public C04820Qu A02() {
        Parcel parcel = this.A05;
        int dataPosition = parcel.dataPosition();
        int i = this.A02;
        if (i == this.A04) {
            i = this.A03;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A07);
        return new AnonymousClass0AX(parcel, this.A01, this.A02, this.A00, AnonymousClass000.A0X("  ", A0o), dataPosition, i);
    }

    public void A05(int i) {
        int i2 = this.A00;
        if (i2 >= 0) {
            int i3 = this.A06.get(i2);
            Parcel parcel = this.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.A00 = i;
        SparseIntArray sparseIntArray = this.A06;
        Parcel parcel2 = this.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public boolean A09(int i) {
        while (true) {
            int i2 = this.A02;
            int i3 = this.A03;
            int i4 = this.A01;
            if (i2 < i3) {
                if (i4 == i) {
                    return true;
                }
                if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                Parcel parcel = this.A05;
                parcel.setDataPosition(i2);
                int readInt = parcel.readInt();
                this.A01 = parcel.readInt();
                this.A02 += readInt;
            } else if (i4 != i) {
                return false;
            } else {
                return true;
            }
        }
    }

    public AnonymousClass0AX(Parcel parcel, AnonymousClass05C r3, AnonymousClass05C r4, AnonymousClass05C r5, String str, int i, int i2) {
        super(r3, r4, r5);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
