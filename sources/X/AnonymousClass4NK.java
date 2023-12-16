package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.4NK  reason: invalid class name */
public class AnonymousClass4NK extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(114);
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass4NK(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = AnonymousClass001.A1T(parcel.readInt());
        this.A00 = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }

    public AnonymousClass4NK(Parcelable parcelable, String str, String str2, float f, boolean z) {
        super(parcelable);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = f;
    }
}
