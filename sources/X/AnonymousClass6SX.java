package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6SX  reason: invalid class name */
public final class AnonymousClass6SX extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163627u7();
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public AnonymousClass6SX(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        HashMap A0t = AnonymousClass001.A0t();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass6TT r7 = (AnonymousClass6TT) arrayList.get(i2);
            String str2 = r7.A01;
            HashMap A0t2 = AnonymousClass001.A0t();
            ArrayList arrayList2 = r7.A02;
            C162177rO.A02(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnonymousClass6TU r0 = (AnonymousClass6TU) r7.A02.get(i3);
                A0t2.put(r0.A02, r0.A01);
            }
            A0t.put(str2, A0t2);
        }
        this.A02 = A0t;
        C162177rO.A02(str);
        this.A01 = str;
        Iterator A11 = C18290x4.A11(A0t);
        while (A11.hasNext()) {
            Map map = (Map) A0t.get(A11.next());
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                ((C127856To) map.get(A0i.next())).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        HashMap hashMap = this.A02;
        Iterator A11 = C18290x4.A11(hashMap);
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            A0o.append(A0m);
            A0o.append(":\n");
            Map map = (Map) hashMap.get(A0m);
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                String A0m2 = AnonymousClass001.A0m(A0i);
                A0o.append("  ");
                A0o.append(A0m2);
                A0o.append(": ");
                A0o.append(map.get(A0m2));
            }
        }
        return A0o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        ArrayList A0s = AnonymousClass001.A0s();
        HashMap hashMap = this.A02;
        Iterator A11 = C18290x4.A11(hashMap);
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            A0s.add(new AnonymousClass6TT(A0m, (Map) hashMap.get(A0m)));
        }
        C162417s1.A0D(parcel, A0s, 2, false);
        C162417s1.A0B(parcel, this.A01, 3, false);
        C162417s1.A06(parcel, A002);
    }
}
