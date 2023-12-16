package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6DU  reason: invalid class name */
public abstract class AnonymousClass6DU extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DU(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C128066Uq) {
            C128066Uq r3 = (C128066Uq) this;
            if (i != 2) {
                return false;
            }
            Parcelable A0Q = AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR);
            C161067ow.A00(parcel);
            C127056Ql.A00((Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR), r3.A00, A0Q);
            return true;
        }
        C128076Ur r32 = (C128076Ur) this;
        switch (i) {
            case 1:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                C161067ow.A00(parcel);
                throw C18320x8.A0m();
            case 2:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                AnonymousClass6C7.A0Q(parcel, C128116Uv.CREATOR);
                C161067ow.A00(parcel);
                throw C18320x8.A0m();
            case 3:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                AnonymousClass6C7.A0Q(parcel, C128086Us.CREATOR);
                C161067ow.A00(parcel);
                throw C18320x8.A0m();
            case 4:
                if (r32 instanceof C128036Un) {
                    ((C128036Un) r32).A00.A00.A00((Object) null);
                    return true;
                }
                throw C18320x8.A0m();
            case 5:
                Status status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                C161067ow.A00(parcel);
                if (r32 instanceof C128036Un) {
                    C152017Xf r0 = ((C128036Un) r32).A00.A00;
                    r0.A00.A03(new AnonymousClass6QV(status));
                    return true;
                }
                C152017Xf r02 = ((C128046Uo) r32).A00.A00;
                r02.A00.A03(new AnonymousClass6QV(status));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                C161067ow.A00(parcel);
                if (r32 instanceof C128046Uo) {
                    ((C128046Uo) r32).A01.A00.A00(createByteArray);
                    return true;
                }
                throw C18320x8.A0m();
            case 7:
                AnonymousClass6C7.A0Q(parcel, AnonymousClass6SK.CREATOR);
                C161067ow.A00(parcel);
                throw C18320x8.A0m();
            default:
                return false;
        }
    }
}
