package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xk  reason: invalid class name and case insensitive filesystem */
public class C165857xk implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(75);
    public final C181518mt A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C181518mt r3 = this.A00;
        int incrementAndGet = AnonymousClass0K2.A02.incrementAndGet();
        synchronized (AnonymousClass0K2.A01) {
            AnonymousClass0K2.A00.append(incrementAndGet, r3);
        }
        parcel.writeInt(incrementAndGet);
    }

    public C165857xk(C181518mt r1) {
        this.A00 = r1;
    }
}
