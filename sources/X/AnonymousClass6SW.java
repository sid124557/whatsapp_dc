package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SW  reason: invalid class name */
public final class AnonymousClass6SW extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163287tZ();
    public final PendingIntent A00;

    public PendingIntent A00() {
        return this.A00;
    }

    public AnonymousClass6SW(PendingIntent pendingIntent) {
        C162177rO.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 1, i, false);
        C162417s1.A06(parcel, A002);
    }
}
