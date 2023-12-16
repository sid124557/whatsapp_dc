package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.6DZ  reason: invalid class name */
public abstract class AnonymousClass6DZ extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DZ(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IGoogleMapDelegate r1;
        View B8L;
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass6XD) {
            AnonymousClass6XD r3 = (AnonymousClass6XD) this;
            if (i != 1) {
                return false;
            }
            r3.A00.BW0((LatLng) AnonymousClass6C7.A0Q(parcel, LatLng.CREATOR));
        } else if (this instanceof AnonymousClass6XC) {
            AnonymousClass6XC r32 = (AnonymousClass6XC) this;
            if (i != 1) {
                return false;
            }
            r32.A00.BOI();
        } else {
            if (this instanceof AnonymousClass6XB) {
                AnonymousClass6XB r33 = (AnonymousClass6XB) this;
                if (i != 1) {
                    return false;
                }
                directorySetLocationMapActivity = ((AnonymousClass8B4) r33.A00).A00;
            } else if (this instanceof AnonymousClass6XA) {
                AnonymousClass6XA r34 = (AnonymousClass6XA) this;
                if (i != 1) {
                    return false;
                }
                r34.A00.BOM(parcel.readInt());
            } else if (this instanceof AnonymousClass6X9) {
                AnonymousClass6X9 r35 = (AnonymousClass6X9) this;
                if (i != 1) {
                    return false;
                }
                directorySetLocationMapActivity = ((AnonymousClass8B7) r35.A00).A00;
            } else if (this instanceof AnonymousClass6X8) {
                AnonymousClass6X8 r36 = (AnonymousClass6X8) this;
                if (i == 1) {
                    B8L = r36.A00.B8L(new C105345Uo(AnonymousClass6XE.A00(parcel.readStrongBinder())));
                } else if (i != 2) {
                    return false;
                } else {
                    new C105345Uo(AnonymousClass6XE.A00(parcel.readStrongBinder()));
                    B8L = null;
                }
                AnonymousClass6UT r0 = new AnonymousClass6UT(B8L);
                parcel2.writeNoException();
                C161087oy.A00(r0, parcel2);
                return true;
            } else if (this instanceof AnonymousClass6X7) {
                AnonymousClass6X7 r37 = (AnonymousClass6X7) this;
                if (i != 1) {
                    return false;
                }
                r37.A00.BUZ(new C105345Uo(AnonymousClass6XE.A00(parcel.readStrongBinder())));
            } else if (this instanceof AnonymousClass6X6) {
                AnonymousClass6X6 r38 = (AnonymousClass6X6) this;
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (queryLocalInterface instanceof IGoogleMapDelegate) {
                        r1 = (IGoogleMapDelegate) queryLocalInterface;
                    } else {
                        r1 = new C128666Wz(readStrongBinder);
                    }
                }
                r38.A00.BW2(new C105415Uv(r1));
            } else if (this instanceof AnonymousClass6X5) {
                AnonymousClass6X5 r39 = (AnonymousClass6X5) this;
                if (i == 1) {
                    r39.A00.BTW();
                } else if (i != 2) {
                    return false;
                } else {
                    r39.A00.BOO();
                }
            } else {
                AnonymousClass6X4 r310 = (AnonymousClass6X4) this;
                if (i != 1) {
                    return false;
                }
                boolean BW3 = r310.A00.BW3(new C105345Uo(AnonymousClass6XE.A00(parcel.readStrongBinder())));
                parcel2.writeNoException();
                parcel2.writeInt(BW3 ? 1 : 0);
                return true;
            }
            directorySetLocationMapActivity.A75();
        }
        parcel2.writeNoException();
        return true;
    }
}
