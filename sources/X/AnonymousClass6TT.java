package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6TT  reason: invalid class name */
public final class AnonymousClass6TT extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163637u8();
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public AnonymousClass6TT(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0D(parcel, this.A02, 3, C1695389r.A07(parcel, this.A01));
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TT(String str, Map map) {
        ArrayList A0s;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A0s = null;
        } else {
            A0s = AnonymousClass001.A0s();
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                String A0m = AnonymousClass001.A0m(A0i);
                A0s.add(new AnonymousClass6TU((C127856To) map.get(A0m), A0m));
            }
        }
        this.A02 = A0s;
    }
}
