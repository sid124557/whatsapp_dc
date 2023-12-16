package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7wj  reason: invalid class name and case insensitive filesystem */
public final class C165227wj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt = parcel.readInt();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, C165987xx.CREATOR.getClass().getClassLoader());
        return new C108825dc(A0s, readFloat, readFloat2, readInt, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108825dc[i];
    }
}
