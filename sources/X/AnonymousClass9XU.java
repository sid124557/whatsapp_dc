package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9XU  reason: invalid class name */
public class AnonymousClass9XU implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        AnonymousClass99E r0 = new AnonymousClass99E();
        r0.A00 = readBundle;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass99E[i];
    }
}
