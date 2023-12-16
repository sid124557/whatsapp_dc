package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.6T1  reason: invalid class name */
public final class AnonymousClass6T1 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163537ty();
    public final int A00;
    public final IBinder A01;
    public final C127866Tp A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof AnonymousClass6T1) {
                    AnonymousClass6T1 r5 = (AnonymousClass6T1) obj;
                    if (!this.A02.equals(r5.A02) || !AnonymousClass72K.A00(A00(), r5.A00())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final IAccountAccessor A00() {
        IBinder iBinder = this.A01;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new AnonymousClass6WH(iBinder);
    }

    public AnonymousClass6T1(IBinder iBinder, C127866Tp r2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = r2;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A03(this.A01, parcel, 2);
        C162417s1.A0A(parcel, this.A02, 3, i, false);
        C162417s1.A09(parcel, 4, this.A03);
        C162417s1.A09(parcel, 5, this.A04);
        C162417s1.A06(parcel, A002);
    }
}
