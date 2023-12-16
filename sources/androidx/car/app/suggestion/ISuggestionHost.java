package androidx.car.app.suggestion;

import X.AnonymousClass000;
import X.C06790Zf;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISuggestionHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.suggestion.ISuggestionHost";

    public class Default implements ISuggestionHost {
        public IBinder asBinder() {
            return null;
        }

        public void updateSuggestions(C06790Zf r1) {
        }
    }

    public abstract class Stub extends Binder implements ISuggestionHost {
        public static final int TRANSACTION_updateSuggestions = 2;

        public class Proxy implements ISuggestionHost {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISuggestionHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void updateSuggestions(C06790Zf r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.mRemote.transact(2, obtain, obtain2, AnonymousClass000.A1V(obtain, r6, ISuggestionHost.DESCRIPTOR) ? 1 : 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ISuggestionHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISuggestionHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISuggestionHost)) {
                return new Proxy(iBinder);
            }
            return (ISuggestionHost) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ISuggestionHost.DESCRIPTOR);
                    if (i == 2) {
                        updateSuggestions((C06790Zf) AnonymousClass000.A0J(parcel, C06790Zf.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ISuggestionHost.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, ISuggestionHost.DESCRIPTOR);
        }
    }

    void updateSuggestions(C06790Zf r1);
}
