package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ICarHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ICarHost";

    public class Default implements ICarHost {
        public IBinder asBinder() {
            return null;
        }

        public void finish() {
        }

        public IBinder getHost(String str) {
            return null;
        }

        public void startCarApp(Intent intent) {
        }
    }

    public abstract class Stub extends Binder implements ICarHost {
        public static final int TRANSACTION_finish = 4;
        public static final int TRANSACTION_getHost = 3;
        public static final int TRANSACTION_startCarApp = 2;

        public class Proxy implements ICarHost {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void finish() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder getHost(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    obtain.writeString(str);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 3);
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startCarApp(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHost.DESCRIPTOR);
                    if (intent != null) {
                        AnonymousClass001.A15(obtain, intent, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICarHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHost)) {
                return new Proxy(iBinder);
            }
            return (ICarHost) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ICarHost.DESCRIPTOR);
                    if (i == 2) {
                        startCarApp((Intent) AnonymousClass000.A0J(parcel, Intent.CREATOR));
                    } else if (i == 3) {
                        IBinder host = getHost(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(host);
                        return true;
                    } else if (i == 4) {
                        finish();
                    }
                    parcel2.writeNoException();
                    return true;
                } else if (i == 1598968902) {
                    parcel2.writeString(ICarHost.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, ICarHost.DESCRIPTOR);
        }
    }

    void finish();

    IBinder getHost(String str);

    void startCarApp(Intent intent);
}
