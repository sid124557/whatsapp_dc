package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.5Uv  reason: invalid class name and case insensitive filesystem */
public class C105415Uv {
    public AnonymousClass7RO A00;
    public final IGoogleMapDelegate A01;

    public final AnonymousClass5RL A00() {
        IProjectionDelegate iProjectionDelegate;
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A01, 26);
            IBinder readStrongBinder = A0e.readStrongBinder();
            if (readStrongBinder == null) {
                iProjectionDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (queryLocalInterface instanceof IProjectionDelegate) {
                    iProjectionDelegate = (IProjectionDelegate) queryLocalInterface;
                } else {
                    iProjectionDelegate = new AnonymousClass6X1(readStrongBinder);
                }
            }
            A0e.recycle();
            return new AnonymousClass5RL(iProjectionDelegate);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final AnonymousClass7RO A01() {
        IUiSettingsDelegate iUiSettingsDelegate;
        try {
            AnonymousClass7RO r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A01, 25);
            IBinder readStrongBinder = A0e.readStrongBinder();
            if (readStrongBinder == null) {
                iUiSettingsDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (queryLocalInterface instanceof IUiSettingsDelegate) {
                    iUiSettingsDelegate = (IUiSettingsDelegate) queryLocalInterface;
                } else {
                    iUiSettingsDelegate = new AnonymousClass6X2(readStrongBinder);
                }
            }
            A0e.recycle();
            AnonymousClass7RO r02 = new AnonymousClass7RO(iUiSettingsDelegate);
            this.A00 = r02;
            return r02;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final CameraPosition A02() {
        Parcelable parcelable;
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A01, 1);
            Parcelable.Creator creator = CameraPosition.CREATOR;
            if (A0e.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A0e);
            }
            CameraPosition cameraPosition = (CameraPosition) parcelable;
            A0e.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final C105345Uo A03(C127776Tg r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, r4);
            Parcel A012 = r2.A01(11, A002);
            C187148wa A003 = AnonymousClass6XE.A00(A012.readStrongBinder());
            A012.recycle();
            if (A003 != null) {
                return new C105345Uo(A003);
            }
            return null;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A04() {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(94, r2.A00());
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A05() {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeFloat(16.0f);
            r2.A02(93, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A06() {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(14, r2.A00());
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A07(int i) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeInt(i);
            r2.A02(16, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A08(int i, int i2, int i3, int i4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeInt(i);
            A002.writeInt(i2);
            A002.writeInt(i3);
            A002.writeInt(i4);
            r2.A02(39, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A09(AnonymousClass7BU r4) {
        try {
            C162177rO.A03(r4, "CameraUpdate must not be null.");
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(5, C86644Kx.A0E(r4.A00, r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0A(AnonymousClass7BU r4) {
        try {
            C162177rO.A03(r4, "CameraUpdate must not be null.");
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(4, C86644Kx.A0E(r4.A00, r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0B(AnonymousClass7BU r4, C183968qx r5) {
        AnonymousClass6X5 r0;
        try {
            C162177rO.A03(r4, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r4.A00;
            if (r5 == null) {
                r0 = null;
            } else {
                r0 = new AnonymousClass6X5(r5);
            }
            C163177tO r2 = (C163177tO) iGoogleMapDelegate;
            Parcel A0E = C86644Kx.A0E(iObjectWrapper, r2);
            C161087oy.A00(r0, A0E);
            r2.A02(6, A0E);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0C(AnonymousClass7BU r5, C183968qx r6) {
        AnonymousClass6X5 r2;
        try {
            C162177rO.A03(r5, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r5.A00;
            if (r6 == null) {
                r2 = null;
            } else {
                r2 = new AnonymousClass6X5(r6);
            }
            C163177tO r3 = (C163177tO) iGoogleMapDelegate;
            Parcel A0E = C86644Kx.A0E(iObjectWrapper, r3);
            A0E.writeInt(400);
            C161087oy.A00(r2, A0E);
            r3.A02(7, A0E);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0D(C181078m6 r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(33, C86644Kx.A0E(new AnonymousClass6X8(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0E(C181088m7 r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(99, C86644Kx.A0E(new AnonymousClass6XC(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0F(AnonymousClass8m8 r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(96, C86644Kx.A0E(new AnonymousClass6XA(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0G(C181098m9 r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(32, C86644Kx.A0E(new AnonymousClass6X7(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0H(C181108mA r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(28, C86644Kx.A0E(new AnonymousClass6XD(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0I(C181118mB r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            r2.A02(30, C86644Kx.A0E(new AnonymousClass6X4(r4), r2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public void A0J(AnonymousClass6TJ r4) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, r4);
            Parcel A012 = r2.A01(91, A002);
            A012.readInt();
            A012.recycle();
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0K(boolean z) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeInt(z ? 1 : 0);
            Parcel A012 = r2.A01(20, A002);
            A012.readInt();
            A012.recycle();
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0L(boolean z) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeInt(z ? 1 : 0);
            r2.A02(22, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final void A0M(boolean z) {
        try {
            C163177tO r2 = (C163177tO) this.A01;
            Parcel A002 = r2.A00();
            A002.writeInt(z ? 1 : 0);
            r2.A02(18, A002);
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final boolean A0N() {
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A01, 17);
            boolean A1S = AnonymousClass000.A1S(A0e.readInt());
            A0e.recycle();
            return A1S;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public C105415Uv(IGoogleMapDelegate iGoogleMapDelegate) {
        C162177rO.A02(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }
}
