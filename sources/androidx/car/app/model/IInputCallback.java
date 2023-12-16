package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

public interface IInputCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.model.IInputCallback";

    public class Default implements IInputCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements IInputCallback {
        public static final int TRANSACTION_onInputSubmitted = 3;
        public static final int TRANSACTION_onInputTextChanged = 2;

        public class Proxy implements IInputCallback {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IInputCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    AnonymousClass001.A14(iOnDoneCallback, obtain, IInputCallback.DESCRIPTOR, str);
                    AnonymousClass000.A0v(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    AnonymousClass001.A14(iOnDoneCallback, obtain, IInputCallback.DESCRIPTOR, str);
                    AnonymousClass000.A0u(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IInputCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IInputCallback.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IInputCallback)) {
                return new Proxy(iBinder);
            }
            return (IInputCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(IInputCallback.DESCRIPTOR);
                    if (i == 2) {
                        onInputTextChanged(parcel.readString(), AnonymousClass000.A0D(parcel));
                        return true;
                    } else if (i == 3) {
                        onInputSubmitted(parcel.readString(), AnonymousClass000.A0D(parcel));
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(IInputCallback.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, IInputCallback.DESCRIPTOR);
        }
    }

    void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback);

    void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback);
}
