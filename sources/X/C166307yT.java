package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.R;

/* renamed from: X.7yT  reason: invalid class name and case insensitive filesystem */
public class C166307yT implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(85);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05);
    }

    public C166307yT(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = R.string.f11nameremoved;
        this.A02 = i2;
        this.A04 = R.string.f11nameremoved;
        this.A03 = i3;
        this.A05 = R.array.f2nameremoved;
    }

    public C166307yT(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = parcel.readInt();
    }
}
