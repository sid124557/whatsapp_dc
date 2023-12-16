package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: X.6DX  reason: invalid class name */
public class AnonymousClass6DX extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DX(String str) {
        attachInterface(this, str);
    }

    public static Parcel A00(AnonymousClass6DX r2, C163167tN r3) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r2.asBinder());
        return obtain;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass6SP r2;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass6WK) {
            AnonymousClass6WK r5 = (AnonymousClass6WK) this;
            if (i == 1) {
                AnonymousClass6UT r0 = new AnonymousClass6UT(((AnonymousClass6UJ) r5).A02());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(r0.asBinder());
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = ((AnonymousClass6UJ) r5).A00;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            }
        } else if (!(this instanceof AnonymousClass6WJ)) {
            return false;
        } else {
            AnonymousClass6WJ r52 = (AnonymousClass6WJ) this;
            if (i == 1) {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C159647mE.A00(parcel);
                C162177rO.A03(r52.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                r52.A00.A05((Bundle) AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR), readStrongBinder, readInt, r52.A01);
            } else if (i == 2) {
                parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                C159647mE.A00(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                parcel2.writeNoException();
                return true;
            } else if (i != 3) {
                return false;
            } else {
                int readInt2 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                AnonymousClass6TW r7 = (AnonymousClass6TW) AnonymousClass6C7.A0Q(parcel, AnonymousClass6TW.CREATOR);
                C159647mE.A00(parcel);
                C160847oP r1 = r52.A00;
                C162177rO.A03(r1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                C162177rO.A02(r7);
                r1.A0Q = r7;
                if (r1.A07()) {
                    AnonymousClass6SQ r02 = r7.A02;
                    C160017mt A00 = C160017mt.A00();
                    if (r02 == null) {
                        r2 = null;
                    } else {
                        r2 = r02.A01;
                    }
                    synchronized (A00) {
                        if (r2 == null) {
                            r2 = C160017mt.A02;
                        } else {
                            AnonymousClass6SP r03 = A00.A00;
                            if (r03 != null) {
                                if (r03.A00 < r2.A00) {
                                }
                            }
                        }
                        A00.A00 = r2;
                    }
                }
                Bundle bundle = r7.A01;
                C162177rO.A03(r52.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                r52.A00.A05(bundle, readStrongBinder2, readInt2, r52.A01);
            }
            r52.A00 = null;
            parcel2.writeNoException();
            return true;
        }
    }
}
