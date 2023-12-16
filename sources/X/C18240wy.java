package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0wy  reason: invalid class name and case insensitive filesystem */
public class C18240wy implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C18240wy(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        AnonymousClass02U r0;
        switch (this.A00) {
            case 0:
                return new C009007d(parcel, classLoader);
            case 1:
                return new C008907c(parcel, classLoader);
            case 2:
                return new C008707a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return C06830Zj.A01;
                }
                throw AnonymousClass001.A0e("superState must be null");
            case 4:
                return new AnonymousClass0ZZ(parcel, classLoader);
            case 5:
                return new C008807b(parcel, classLoader);
            case 6:
                return new C009107e(parcel, classLoader);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return r0;
                }
                r0 = new AnonymousClass02U(parcel);
                return r0;
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C009007d[i];
            case 1:
                return new C008907c[i];
            case 2:
                return new C008707a[i];
            case 3:
                return new C06830Zj[i];
            case 4:
                return new AnonymousClass0ZZ[i];
            case 5:
                return new C008807b[i];
            case 6:
                return new C009107e[i];
            default:
                return new AnonymousClass02U[i];
        }
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass02U r1;
        switch (this.A00) {
            case 0:
                return new C009007d(parcel, (ClassLoader) null);
            case 1:
                return new C008907c(parcel, (ClassLoader) null);
            case 2:
                return new C008707a(parcel, (ClassLoader) null);
            case 3:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return C06830Zj.A01;
                }
                throw AnonymousClass001.A0e("superState must be null");
            case 4:
                return new AnonymousClass0ZZ(parcel, (ClassLoader) null);
            case 5:
                return new C008807b(parcel, (ClassLoader) null);
            case 6:
                return new C009107e(parcel, (ClassLoader) null);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return r1;
                }
                r1 = new AnonymousClass02U(parcel);
                return r1;
        }
    }
}
