package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T5  reason: invalid class name */
public class AnonymousClass6T5 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163347tf();
    public final PendingIntent A00;

    public PendingIntent A00() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6T5)) {
            return false;
        }
        return AnonymousClass72K.A00(this.A00, ((AnonymousClass6T5) obj).A00);
    }

    public AnonymousClass6T5(PendingIntent pendingIntent) {
        C162177rO.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    public int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 1, i, false);
        C162417s1.A06(parcel, A002);
    }
}
