package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.38N  reason: invalid class name */
public final class AnonymousClass38N implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C631638e[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A04 = C18310x6.A04(parcel);
        ArrayList A0I = AnonymousClass002.A0I(A04);
        for (int i = 0; i != A04; i++) {
            A0I.add(C18280x3.A0C(parcel, C631638e.class));
        }
        return new C631638e(A0I);
    }
}
