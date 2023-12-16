package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;

/* renamed from: X.7wy  reason: invalid class name and case insensitive filesystem */
public final class C165377wy implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WamCallExtendedField[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WamCallExtendedField(C18310x6.A04(parcel), parcel.readString(), parcel.readValue(WamCallExtendedField.class.getClassLoader()));
    }
}
