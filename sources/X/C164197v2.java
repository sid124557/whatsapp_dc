package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: X.7v2  reason: invalid class name and case insensitive filesystem */
public final class C164197v2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SM[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        ArrayList arrayList = null;
        AnonymousClass6SD r1 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C162447s6.A0G(parcel, LocationRequest.CREATOR, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c != 5) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r1 = (AnonymousClass6SD) C162447s6.A0A(parcel, AnonymousClass6SD.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SM(r1, arrayList, z, z2);
    }
}
