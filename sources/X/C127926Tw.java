package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6Tw  reason: invalid class name and case insensitive filesystem */
public final class C127926Tw extends C1695389r implements C180828lh {
    public static final Parcelable.Creator CREATOR = new C164377vM();
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status BDK() {
        if (this.A00 == 0) {
            return Status.A09;
        }
        return Status.A05;
    }

    public C127926Tw(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A02);
        C162417s1.A07(parcel, 2, this.A00);
        C1695389r.A03(parcel, this.A01, i, A002);
    }

    public C127926Tw() {
        this(2, 0, (Intent) null);
    }
}
