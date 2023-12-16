package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TY  reason: invalid class name */
public final class AnonymousClass6TY extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164767vz();
    public final C187328x0 A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    public AnonymousClass6TY(IBinder iBinder, String str, String str2, IntentFilter[] intentFilterArr) {
        C187328x0 r1;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof C187328x0) {
                r1 = (C187328x0) queryLocalInterface;
            } else {
                r1 = new AnonymousClass6YN(iBinder);
            }
            this.A00 = r1;
        } else {
            this.A00 = null;
        }
        this.A03 = intentFilterArr;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C162417s1.A00(parcel);
        C187328x0 r0 = this.A00;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.asBinder();
        }
        C162417s1.A03(asBinder, parcel, 2);
        C162417s1.A0F(parcel, this.A03, 3, i);
        C162417s1.A0B(parcel, this.A01, 4, false);
        C162417s1.A0B(parcel, this.A02, 5, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TY() {
        this.A00 = null;
        throw AnonymousClass001.A0g("zzr");
    }
}
