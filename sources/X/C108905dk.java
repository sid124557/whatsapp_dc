package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dk  reason: invalid class name and case insensitive filesystem */
public class C108905dk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(120);
    public int A00;
    public int A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Intent A07;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        int i3 = -1;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        Integer num2 = this.A03;
        if (num2 != null) {
            i3 = num2.intValue();
        }
        parcel.writeInt(i3);
    }

    @Deprecated
    public C108905dk(int i, int i2, Intent intent) {
        this.A07 = intent;
        this.A06 = i;
        this.A05 = i2;
    }

    public C108905dk(Parcel parcel) {
        Integer num;
        Parcelable A0C = C18280x3.A0C(parcel, Intent.class);
        C626936e.A06(A0C);
        this.A07 = (Intent) A0C;
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = AnonymousClass000.A1S(parcel.readByte());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        Integer num2 = null;
        if (readInt != -1) {
            num = Integer.valueOf(readInt);
        } else {
            num = null;
        }
        this.A02 = num;
        int readInt2 = parcel.readInt();
        this.A03 = readInt2 != -1 ? Integer.valueOf(readInt2) : num2;
    }
}
