package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5cq  reason: invalid class name and case insensitive filesystem */
public final class C108345cq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        double readDouble = parcel.readDouble();
        int readInt = parcel.readInt();
        float readFloat = parcel.readFloat();
        ArrayList A0s = AnonymousClass001.A0s();
        C18320x8.A12(parcel, C155207eS.A00.getClass(), A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        C18320x8.A12(parcel, C108825dc.CREATOR.getClass(), A0s2);
        return new C108965dr(A0s, A0s2, readDouble, readFloat, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108965dr[i];
    }
}
