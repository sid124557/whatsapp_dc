package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6SM  reason: invalid class name */
public final class AnonymousClass6SM extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164197v2();
    public AnonymousClass6SD A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass6SM(AnonymousClass6SD r1, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = r1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0D(parcel, Collections.unmodifiableList(this.A01), 1, false);
        C162417s1.A09(parcel, 2, this.A02);
        C162417s1.A09(parcel, 3, this.A03);
        C162417s1.A0A(parcel, this.A00, 5, i, false);
        C162417s1.A06(parcel, A002);
    }
}
