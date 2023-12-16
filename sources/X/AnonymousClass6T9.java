package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6T9  reason: invalid class name */
public final class AnonymousClass6T9 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164587vh();
    public final String A00;
    public final List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r1.equals(r0) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x002f
            r2 = 0
            if (r5 == 0) goto L_0x0028
            java.lang.Class<X.6T9> r1 = X.AnonymousClass6T9.class
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0028
            X.6T9 r5 = (X.AnonymousClass6T9) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0028:
            return r2
        L_0x0029:
            if (r0 == 0) goto L_0x001c
            return r2
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A04 = (C86624Kv.A04(this.A00) + 31) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A04 + i;
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(str) + 18 + valueOf.length());
        A0Y.append("CapabilityInfo{");
        A0Y.append(str);
        AnonymousClass001.A1M(A0Y);
        A0Y.append(valueOf);
        return AnonymousClass000.A0g(A0Y);
    }

    public AnonymousClass6T9(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        C162177rO.A02(str);
        C162177rO.A02(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0D(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00));
        C162417s1.A06(parcel, A002);
    }
}
