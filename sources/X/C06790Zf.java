package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: X.0Zf  reason: invalid class name and case insensitive filesystem */
public final class C06790Zf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0ZK();
    public final Bundle A00;

    public Object A00() {
        Bundle bundle = this.A00;
        if (Log.isLoggable("CarApp.Bun", 3)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unbundling ");
            String str = (String) AnonymousClass001.A0i(AnonymousClass0YB.A00, bundle.getInt("tag_class_type"));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", AnonymousClass000.A0X(str, A0o));
        }
        return AnonymousClass0YB.A02(bundle, new C10500i2((Object) null, "", new ArrayDeque()));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public C06790Zf(Object obj) {
        String A03 = AnonymousClass0YB.A03(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", AnonymousClass000.A0V("Bundling ", A03, AnonymousClass001.A0o()));
        }
        this.A00 = AnonymousClass0YB.A00(new C10500i2((Object) null, "", new ArrayDeque()), obj, A03);
    }

    public C06790Zf(Bundle bundle) {
        this.A00 = bundle;
    }
}
