package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ga  reason: invalid class name and case insensitive filesystem */
public class C125166Ga extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(7);
    public final C06290Wz A00;

    public C125166Ga(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new C06290Wz(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "ExtendableSavedState{", this);
        A0o.append(" states=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r10, int r11) {
        /*
            r9 = this;
            super.writeToParcel(r10, r11)
            X.0Wz r8 = r9.A00
            int r7 = r8.size()
            r10.writeInt(r7)
            java.lang.String[] r6 = new java.lang.String[r7]
            android.os.Bundle[] r5 = new android.os.Bundle[r7]
            r4 = 0
            r3 = 0
        L_0x0012:
            if (r3 >= r7) goto L_0x0025
            java.lang.Object[] r2 = r8.A02
            int r1 = r3 << 1
            r0 = r2[r1]
            r6[r3] = r0
            int r0 = r1 + 1
            r0 = r2[r0]
            r5[r3] = r0
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0025:
            r10.writeStringArray(r6)
            r10.writeTypedArray(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125166Ga.writeToParcel(android.os.Parcel, int):void");
    }

    public C125166Ga(Parcelable parcelable) {
        super(parcelable);
        this.A00 = new C06290Wz();
    }
}
