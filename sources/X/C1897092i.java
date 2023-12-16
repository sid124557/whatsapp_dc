package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.92i  reason: invalid class name and case insensitive filesystem */
public class C1897092i implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C1897092i(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass6GY(parcel, classLoader);
            case 1:
                return new AnonymousClass6GZ(parcel, classLoader);
            case 2:
                return new AnonymousClass6GU(parcel, classLoader);
            case 3:
                return new AnonymousClass6GV(parcel, classLoader);
            case 4:
                return new AnonymousClass6EM(parcel, classLoader);
            case 5:
                return new AnonymousClass6GW(parcel, classLoader);
            case 6:
                return new AnonymousClass6GX(parcel, classLoader);
            case 7:
                return new C125166Ga(parcel, classLoader);
            default:
                return new AnonymousClass6Gb(parcel, classLoader);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass6GY[i];
            case 1:
                return new AnonymousClass6GZ[i];
            case 2:
                return new AnonymousClass6GU[i];
            case 3:
                return new AnonymousClass6GV[i];
            case 4:
                return new AnonymousClass6EM[i];
            case 5:
                return new AnonymousClass6GW[i];
            case 6:
                return new AnonymousClass6GX[i];
            case 7:
                return new C125166Ga[i];
            default:
                return new AnonymousClass6Gb[i];
        }
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass6GY(parcel, (ClassLoader) null);
            case 1:
                return new AnonymousClass6GZ(parcel, (ClassLoader) null);
            case 2:
                return new AnonymousClass6GU(parcel, (ClassLoader) null);
            case 3:
                return new AnonymousClass6GV(parcel, (ClassLoader) null);
            case 4:
                return new AnonymousClass6EM(parcel, (ClassLoader) null);
            case 5:
                return new AnonymousClass6GW(parcel, (ClassLoader) null);
            case 6:
                return new AnonymousClass6GX(parcel, (ClassLoader) null);
            case 7:
                return new C125166Ga(parcel, (ClassLoader) null);
            default:
                return new AnonymousClass6Gb(parcel, (ClassLoader) null);
        }
    }
}
