package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6UC  reason: invalid class name */
public final class AnonymousClass6UC extends C1695389r implements C178438hX {
    public static final Parcelable.Creator CREATOR = new C163587u3();
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public AnonymousClass6UC(ArrayList arrayList, int i) {
        this.A00 = i;
        this.A02 = AnonymousClass001.A0t();
        this.A01 = AnonymousClass6CA.A0I();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass6TS r0 = (AnonymousClass6TS) arrayList.get(i2);
            String str = r0.A02;
            int i3 = r0.A01;
            AnonymousClass0x2.A1I(str, this.A02, i3);
            this.A01.put(i3, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        ArrayList A0s = AnonymousClass001.A0s();
        HashMap hashMap = this.A02;
        Iterator A11 = C18290x4.A11(hashMap);
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            A0s.add(new AnonymousClass6TS(A0m, AnonymousClass6C8.A0D(A0m, hashMap)));
        }
        C162417s1.A0D(parcel, A0s, 2, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6UC() {
        this.A00 = 1;
        this.A02 = AnonymousClass001.A0t();
        this.A01 = AnonymousClass6CA.A0I();
    }
}
