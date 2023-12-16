package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: X.6GX  reason: invalid class name */
public class AnonymousClass6GX extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(6);
    public final int A00;

    public AnonymousClass6GX(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass6GX(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.A00 = sideSheetBehavior.A06;
    }
}
