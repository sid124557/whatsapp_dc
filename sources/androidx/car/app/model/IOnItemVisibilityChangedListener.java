package androidx.car.app.model;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IOnItemVisibilityChangedListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IOnItemVisibilityChangedListener";

    public class Default implements IOnItemVisibilityChangedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IOnItemVisibilityChangedListener {
        public static final int TRANSACTION_onItemVisibilityChanged = 2;

        public class Proxy implements IOnItemVisibilityChangedListener {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnItemVisibilityChangedListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IOnItemVisibilityChangedListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0u(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IOnItemVisibilityChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IOnItemVisibilityChangedListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOnItemVisibilityChangedListener)) {
                return new Proxy(iBinder);
            }
            return (IOnItemVisibilityChangedListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IOnItemVisibilityChangedListener.DESCRIPTOR);
                    if (i == 2) {
                        onItemVisibilityChanged(parcel.readInt(), parcel.readInt(), AnonymousClass000.A0D(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IOnItemVisibilityChangedListener.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IOnItemVisibilityChangedListener.DESCRIPTOR);
        }
    }

    void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback);
}
