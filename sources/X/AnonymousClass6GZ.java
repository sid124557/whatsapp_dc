package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.6GZ  reason: invalid class name */
public class AnonymousClass6GZ extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(1);
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass6GZ(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A04 = parcel.readInt();
        this.A00 = parcel.readInt();
        boolean z = false;
        this.A01 = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A02 = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A03 = parcel.readInt() == 1 ? true : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public AnonymousClass6GZ(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.A04 = bottomSheetBehavior.A0O;
        this.A00 = bottomSheetBehavior.A0J;
        this.A01 = bottomSheetBehavior.A0b;
        this.A02 = bottomSheetBehavior.A0d;
        this.A03 = bottomSheetBehavior.A0p;
    }
}
