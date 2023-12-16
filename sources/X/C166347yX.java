package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yX  reason: invalid class name and case insensitive filesystem */
public class C166347yX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163997ui();
    public final C180938ls A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.6yB[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.6yB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.6yC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.6yC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.6yC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.6yC} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C166347yX A00(int r6) {
        /*
            X.6yC r0 = X.C143016yC.LEGACY_RS1
            int r0 = r0.zzb
            if (r6 != r0) goto L_0x000e
            X.6yC r5 = X.C143016yC.RS1
        L_0x0008:
            X.7yX r0 = new X.7yX
            r0.<init>(r5)
            return r0
        L_0x000e:
            X.6yC[] r4 = X.C143016yC.values()
            int r2 = r4.length
            r3 = 0
            r1 = 0
        L_0x0015:
            if (r1 >= r2) goto L_0x0020
            r5 = r4[r1]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0020:
            X.6yB[] r2 = X.C143006yB.values()
            int r1 = r2.length
        L_0x0025:
            if (r3 >= r1) goto L_0x0030
            r5 = r2[r3]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0030:
            X.6yW r0 = new X.6yW
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166347yX.A00(int):X.7yX");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C166347yX) || this.A00.B4M() != ((C166347yX) obj).A00.B4M()) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.B4M());
    }

    public C166347yX(C180938ls r1) {
        C162177rO.A02(r1);
        this.A00 = r1;
    }

    public int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }
}
