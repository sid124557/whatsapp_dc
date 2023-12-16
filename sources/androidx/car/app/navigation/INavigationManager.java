package androidx.car.app.navigation;

import X.AnonymousClass000;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface INavigationManager extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.navigation.INavigationManager";

    public class Default implements INavigationManager {
        public IBinder asBinder() {
            return null;
        }

        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements INavigationManager {
        public static final int TRANSACTION_onStopNavigation = 2;

        public class Proxy implements INavigationManager {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INavigationManager.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INavigationManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0u(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static INavigationManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INavigationManager.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INavigationManager)) {
                return new Proxy(iBinder);
            }
            return (INavigationManager) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(INavigationManager.DESCRIPTOR);
                    if (i == 2) {
                        onStopNavigation(AnonymousClass000.A0D(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(INavigationManager.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, INavigationManager.DESCRIPTOR);
        }
    }

    void onStopNavigation(IOnDoneCallback iOnDoneCallback);
}
