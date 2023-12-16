package androidx.car.app.constraints;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IConstraintHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.constraints.IConstraintHost";

    public class Default implements IConstraintHost {
        public IBinder asBinder() {
            return null;
        }

        public boolean isAppDrivenRefreshEnabled() {
            return false;
        }

        public int getContentLimit(int i) {
            return 0;
        }
    }

    public abstract class Stub extends Binder implements IConstraintHost {
        public static final int TRANSACTION_getContentLimit = 2;
        public static final int TRANSACTION_isAppDrivenRefreshEnabled = 3;

        public class Proxy implements IConstraintHost {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IConstraintHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public int getContentLimit(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 2);
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isAppDrivenRefreshEnabled() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IConstraintHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IConstraintHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IConstraintHost)) {
                return new Proxy(iBinder);
            }
            return (IConstraintHost) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int contentLimit;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IConstraintHost.DESCRIPTOR);
                    if (i == 2) {
                        contentLimit = getContentLimit(parcel.readInt());
                    } else if (i == 3) {
                        contentLimit = isAppDrivenRefreshEnabled();
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(contentLimit);
                    return true;
                } else if (i == 1598968902) {
                    parcel2.writeString(IConstraintHost.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IConstraintHost.DESCRIPTOR);
        }
    }

    int getContentLimit(int i);

    boolean isAppDrivenRefreshEnabled();
}
