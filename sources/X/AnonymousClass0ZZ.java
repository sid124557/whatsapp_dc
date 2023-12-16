package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ZZ  reason: invalid class name */
public class AnonymousClass0ZZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18240wy(4);
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public AnonymousClass0ZZ(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A00 = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    public AnonymousClass0ZZ(Bundle bundle) {
        this.A00 = bundle;
    }
}
