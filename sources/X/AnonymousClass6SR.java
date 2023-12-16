package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SR  reason: invalid class name */
public final class AnonymousClass6SR extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164127uv();
    public final int A00;
    public final PendingIntent A01;
    public final C187278wt A02;
    public final AnonymousClass6TG A03;
    public final C187178wd A04;
    public final C187188we A05;

    public AnonymousClass6SR(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, AnonymousClass6TG r8, int i) {
        C187188we r1;
        C187178wd r12;
        this.A00 = i;
        this.A03 = r8;
        C187278wt r2 = null;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof C187188we) {
                r1 = (C187188we) queryLocalInterface;
            } else {
                r1 = new C128526Wl(iBinder);
            }
        }
        this.A05 = r1;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            r12 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof C187178wd) {
                r12 = (C187178wd) queryLocalInterface2;
            } else {
                r12 = new C128516Wk(iBinder2);
            }
        }
        this.A04 = r12;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof C187278wt) {
                r2 = (C187278wt) queryLocalInterface3;
            } else {
                r2 = new C128496Wi(iBinder3);
            }
        }
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        boolean A06 = C1695389r.A06(parcel, this.A03, i);
        C187188we r0 = this.A05;
        IBinder iBinder = null;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.asBinder();
        }
        C162417s1.A03(asBinder, parcel, 3);
        C162417s1.A0A(parcel, this.A01, 4, i, A06);
        C187178wd r02 = this.A04;
        if (r02 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = r02.asBinder();
        }
        C162417s1.A03(asBinder2, parcel, 5);
        C187278wt r03 = this.A02;
        if (r03 != null) {
            iBinder = r03.asBinder();
        }
        C162417s1.A03(iBinder, parcel, 6);
        C162417s1.A06(parcel, A002);
    }
}
