package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wo  reason: invalid class name and case insensitive filesystem */
public final class C165277wo implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        C162457s7.A0J(parcel, 0);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C166047y3.CREATOR.createFromParcel(parcel);
        }
        return new C166297yS((C166047y3) createFromParcel, (C109065e1) C18280x3.A0C(parcel, C166297yS.class), readInt, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166297yS[i];
    }
}
