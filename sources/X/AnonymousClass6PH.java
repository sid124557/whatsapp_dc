package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6PH  reason: invalid class name */
public final class AnonymousClass6PH extends AnonymousClass87W {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(59);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C148617Jb r2 = (C148617Jb) list.get(i2);
            parcel.writeInt(r2.A00);
            parcel.writeLong(r2.A02);
            parcel.writeLong(r2.A01);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public AnonymousClass6PH(Parcel parcel) {
        this.A06 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A09 = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0A = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0C = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i < readInt; i++) {
            A0I.add(new C148617Jb(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.A07 = Collections.unmodifiableList(A0I);
        this.A08 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public AnonymousClass6PH(List list, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
