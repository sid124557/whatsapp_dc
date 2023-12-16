package androidx.car.app;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IAppManager extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IAppManager";

    public class Default implements IAppManager {
        public IBinder asBinder() {
            return null;
        }

        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        }

        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        }

        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }

        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IAppManager {
        public static final int TRANSACTION_getTemplate = 2;
        public static final int TRANSACTION_onBackPressed = 3;
        public static final int TRANSACTION_startLocationUpdates = 4;
        public static final int TRANSACTION_stopLocationUpdates = 5;

        public class Proxy implements IAppManager {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAppManager.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void getTemplate(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0u(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0v(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IAppManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppManager.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppManager)) {
                return new Proxy(iBinder);
            }
            return (IAppManager) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IAppManager.DESCRIPTOR);
                    if (i == 2) {
                        getTemplate(AnonymousClass000.A0D(parcel));
                        return true;
                    } else if (i == 3) {
                        onBackPressed(AnonymousClass000.A0D(parcel));
                        return true;
                    } else if (i == 4) {
                        startLocationUpdates(AnonymousClass000.A0D(parcel));
                        return true;
                    } else if (i == 5) {
                        stopLocationUpdates(AnonymousClass000.A0D(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IAppManager.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IAppManager.DESCRIPTOR);
        }
    }

    void getTemplate(IOnDoneCallback iOnDoneCallback);

    void onBackPressed(IOnDoneCallback iOnDoneCallback);

    void startLocationUpdates(IOnDoneCallback iOnDoneCallback);

    void stopLocationUpdates(IOnDoneCallback iOnDoneCallback);
}
