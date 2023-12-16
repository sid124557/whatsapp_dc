package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Da  reason: invalid class name and case insensitive filesystem */
public abstract class C124566Da extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C124566Da(String str) {
        attachInterface(this, str);
    }

    public static UnsupportedOperationException A00(Parcel parcel, Parcelable.Creator creator) {
        C159687mI.A00(parcel, creator);
        return new UnsupportedOperationException();
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C128956Yc r3;
        Object obj;
        AnonymousClass6YL r1;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass6YP) {
            AnonymousClass6YP r32 = (AnonymousClass6YP) this;
            if (i != 13) {
                switch (i) {
                    case 1:
                        r32.Bte((DataHolder) AnonymousClass6C7.A0Q(parcel, DataHolder.CREATOR));
                        return true;
                    case 2:
                        r32.Bto((AnonymousClass6SZ) AnonymousClass6C7.A0Q(parcel, AnonymousClass6SZ.CREATOR));
                        return true;
                    case 3:
                        r32.Btx((AnonymousClass6TE) AnonymousClass6C7.A0Q(parcel, AnonymousClass6TE.CREATOR));
                        return true;
                    case 4:
                        r32.Bu2((AnonymousClass6TE) AnonymousClass6C7.A0Q(parcel, AnonymousClass6TE.CREATOR));
                        return true;
                    case 5:
                        r32.Bu5(parcel.createTypedArrayList(AnonymousClass6TE.CREATOR));
                        return true;
                    case 6:
                        r32.BuA((AnonymousClass6TH) AnonymousClass6C7.A0Q(parcel, AnonymousClass6TH.CREATOR));
                        return true;
                    case 7:
                        r32.BuE((AnonymousClass6T0) AnonymousClass6C7.A0Q(parcel, AnonymousClass6T0.CREATOR));
                        return true;
                    case 8:
                        r32.Bu7((AnonymousClass6T9) AnonymousClass6C7.A0Q(parcel, AnonymousClass6T9.CREATOR));
                        return true;
                    case 9:
                        r32.BuD((AnonymousClass6TB) AnonymousClass6C7.A0Q(parcel, AnonymousClass6TB.CREATOR));
                        return true;
                    default:
                        return false;
                }
            } else {
                AnonymousClass6SZ r4 = (AnonymousClass6SZ) AnonymousClass6C7.A0Q(parcel, AnonymousClass6SZ.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    if (queryLocalInterface instanceof AnonymousClass6YL) {
                        r1 = (AnonymousClass6YL) queryLocalInterface;
                    } else {
                        r1 = new AnonymousClass6YL(readStrongBinder);
                    }
                }
                r32.BuF(r1, r4);
                return true;
            }
        } else {
            AnonymousClass6YO r33 = (AnonymousClass6YO) this;
            switch (i) {
                case 2:
                    throw A00(parcel, AnonymousClass6S0.CREATOR);
                case 3:
                    throw A00(parcel, AnonymousClass6S9.CREATOR);
                case 4:
                    throw A00(parcel, AnonymousClass6S3.CREATOR);
                case 5:
                    throw A00(parcel, DataHolder.CREATOR);
                case 6:
                    throw A00(parcel, C127376Rs.CREATOR);
                case 7:
                    AnonymousClass6SA r2 = (AnonymousClass6SA) AnonymousClass6C7.A0Q(parcel, AnonymousClass6SA.CREATOR);
                    if (r33 instanceof C128946Yb) {
                        r3 = (C128956Yc) r33;
                        obj = new C169918Bd(C1446172g.A00(r2.A00), r2.A01);
                        break;
                    } else {
                        throw C18320x8.A0m();
                    }
                case 8:
                    throw A00(parcel, AnonymousClass6S5.CREATOR);
                case 9:
                    throw A00(parcel, AnonymousClass6S6.CREATOR);
                case 10:
                    AnonymousClass6S2 r22 = (AnonymousClass6S2) AnonymousClass6C7.A0Q(parcel, AnonymousClass6S2.CREATOR);
                    if (r33 instanceof C128936Ya) {
                        r3 = (C128956Yc) r33;
                        ArrayList A0s = AnonymousClass001.A0s();
                        List list = r22.A01;
                        if (list != null) {
                            A0s.addAll(list);
                        }
                        obj = new AnonymousClass3B2(C1446172g.A00(r22.A00), A0s);
                        break;
                    } else {
                        throw C18320x8.A0m();
                    }
                case 11:
                    AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                    if (!(r33 instanceof AnonymousClass6YY)) {
                        throw C18320x8.A0m();
                    }
                    break;
                case 12:
                    throw A00(parcel, AnonymousClass6SJ.CREATOR);
                case 13:
                    throw A00(parcel, AnonymousClass6S1.CREATOR);
                case 14:
                    throw A00(parcel, AnonymousClass6S7.CREATOR);
                case 15:
                    throw A00(parcel, C127276Ri.CREATOR);
                case 16:
                    throw A00(parcel, C127276Ri.CREATOR);
                case 17:
                    throw A00(parcel, C127406Rv.CREATOR);
                case 18:
                    throw A00(parcel, C127416Rw.CREATOR);
                case 19:
                    throw A00(parcel, C127256Rg.CREATOR);
                case 20:
                    throw A00(parcel, C127266Rh.CREATOR);
                case 22:
                    throw A00(parcel, C127396Ru.CREATOR);
                case 23:
                    throw A00(parcel, C127386Rt.CREATOR);
                case 26:
                    throw A00(parcel, C127286Rj.CREATOR);
                case 27:
                    throw A00(parcel, C127296Rk.CREATOR);
                case 28:
                    throw A00(parcel, C127426Rx.CREATOR);
                case 29:
                    throw A00(parcel, C127436Ry.CREATOR);
                case 30:
                    throw A00(parcel, AnonymousClass6SG.CREATOR);
                case 34:
                    throw A00(parcel, AnonymousClass6SI.CREATOR);
                case 35:
                    throw A00(parcel, AnonymousClass6S4.CREATOR);
                case 36:
                    throw A00(parcel, AnonymousClass6S8.CREATOR);
                case 37:
                    throw A00(parcel, C127446Rz.CREATOR);
                default:
                    return false;
            }
            C180848lj r0 = r3.A00;
            if (r0 != null) {
                r0.BnG(obj);
                r3.A00 = null;
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
