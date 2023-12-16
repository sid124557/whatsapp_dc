package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.5cm  reason: invalid class name and case insensitive filesystem */
public final class C108305cm implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString = parcel.readString();
        if (readString != null) {
            return new C108745dU(new C160617ny(readString), bigDecimal, (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }
        throw C18300x5.A0X();
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108745dU[i];
    }
}
