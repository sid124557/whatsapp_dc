package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.6Ee  reason: invalid class name and case insensitive filesystem */
public class C124866Ee extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(80);
    public long A00;
    public long A01;
    public boolean A02;

    public C124866Ee(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = AnonymousClass001.A1T(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public C124866Ee(Parcelable parcelable) {
        super(parcelable);
    }
}
