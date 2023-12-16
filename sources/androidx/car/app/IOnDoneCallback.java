package androidx.car.app;

import X.AnonymousClass000;
import X.C06790Zf;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IOnDoneCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IOnDoneCallback";

    public class Default implements IOnDoneCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFailure(C06790Zf r1) {
        }

        public void onSuccess(C06790Zf r1) {
        }
    }

    public abstract class Stub extends Binder implements IOnDoneCallback {
        public static final int TRANSACTION_onFailure = 3;
        public static final int TRANSACTION_onSuccess = 2;

        public class Proxy implements IOnDoneCallback {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnDoneCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onFailure(C06790Zf r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(3, obtain, obtain2, AnonymousClass000.A1V(obtain, r6, IOnDoneCallback.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSuccess(C06790Zf r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(2, obtain, obtain2, AnonymousClass000.A1V(obtain, r6, IOnDoneCallback.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IOnDoneCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnDoneCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnDoneCallback)) {
                return new Proxy(iBinder);
            }
            return (IOnDoneCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnDoneCallback.DESCRIPTOR);
                    if (i == 2) {
                        onSuccess((C06790Zf) AnonymousClass000.A0J(parcel, C06790Zf.CREATOR));
                    } else if (i == 3) {
                        onFailure((C06790Zf) AnonymousClass000.A0J(parcel, C06790Zf.CREATOR));
                    }
                    parcel2.writeNoException();
                    return true;
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnDoneCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IOnDoneCallback.DESCRIPTOR);
        }
    }

    void onFailure(C06790Zf r1);

    void onSuccess(C06790Zf r1);
}
