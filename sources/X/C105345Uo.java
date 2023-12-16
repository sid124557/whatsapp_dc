package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.5Uo  reason: invalid class name and case insensitive filesystem */
public final class C105345Uo {
    public final C187148wa A00;

    public LatLng A00() {
        Parcelable parcelable;
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 4);
            Parcelable.Creator creator = LatLng.CREATOR;
            if (A0e.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A0e);
            }
            LatLng latLng = (LatLng) parcelable;
            A0e.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public Object A01() {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            return AnonymousClass6UT.A01(C86604Kt.A0M(r2.A00(), r2, 30));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public String A02() {
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 2);
            String readString = A0e.readString();
            A0e.recycle();
            return readString;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A03() {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            r2.A02(12, r2.A00());
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A04() {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            r2.A02(11, r2.A00());
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A05(AnonymousClass7BV r4) {
        C163177tO r2;
        Parcel parcel;
        if (r4 == null) {
            try {
                r2 = (C163177tO) this.A00;
                parcel = r2.A00();
                parcel.writeStrongBinder((IBinder) null);
            } catch (RemoteException e) {
                throw AnonymousClass4L0.A0I(e);
            }
        } else {
            IObjectWrapper iObjectWrapper = r4.A00;
            r2 = (C163177tO) this.A00;
            parcel = C86644Kx.A0E(iObjectWrapper, r2);
        }
        r2.A02(18, parcel);
    }

    public void A06(LatLng latLng) {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, latLng);
            r2.A02(3, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A07(Object obj) {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            r2.A02(29, C86644Kx.A0E(new AnonymousClass6UT(obj), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A08(String str) {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A002 = r2.A00();
            A002.writeString(str);
            r2.A02(5, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A09(boolean z) {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A002 = r2.A00();
            A002.writeInt(z ? 1 : 0);
            r2.A02(14, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public boolean A0A() {
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 15);
            boolean A1S = AnonymousClass000.A1S(A0e.readInt());
            A0e.recycle();
            return A1S;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C105345Uo)) {
            return false;
        }
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A01 = r2.A01(16, C86644Kx.A0E(((C105345Uo) obj).A00, r2));
            boolean A1S = AnonymousClass000.A1S(A01.readInt());
            A01.recycle();
            return A1S;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public int hashCode() {
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 17);
            int readInt = A0e.readInt();
            A0e.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public C105345Uo(C187148wa r1) {
        C162177rO.A02(r1);
        this.A00 = r1;
    }
}
