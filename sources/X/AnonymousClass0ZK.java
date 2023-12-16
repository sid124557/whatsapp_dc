package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.0ZK  reason: invalid class name */
public class AnonymousClass0ZK implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        Objects.requireNonNull(readBundle);
        return new C06790Zf(readBundle);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C06790Zf[i];
    }
}
