package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.7wY  reason: invalid class name and case insensitive filesystem */
public final class C165117wY implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108695dP[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108695dP(AnonymousClass0x2.A0a(parcel), (BigDecimal) parcel.readSerializable(), AnonymousClass29S.A00(parcel).booleanValue());
    }
}
