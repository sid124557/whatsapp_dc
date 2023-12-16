package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.6De  reason: invalid class name and case insensitive filesystem */
public class C124606De extends Binder implements CLResultReceiver {
    public final /* synthetic */ AnonymousClass6CU A00;

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            BlK(A00(parcel));
        } else if (i == 2) {
            Br8(A00(parcel));
        } else if (i == 3) {
            B3R(A00(parcel));
        } else if (i == 4) {
            Br7(A00(parcel));
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("org.npci.upi.security.services.CLResultReceiver");
            return true;
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C124606De(AnonymousClass6CU r1) {
        this();
        this.A00 = r1;
    }

    public static Bundle A00(Parcel parcel) {
        parcel.enforceInterface("org.npci.upi.security.services.CLResultReceiver");
        if (parcel.readInt() != 0) {
            return (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public static CLResultReceiver A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLResultReceiver");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof CLResultReceiver)) {
            return new C173388Pz(iBinder);
        }
        return (CLResultReceiver) queryLocalInterface;
    }

    public void B3R(Bundle bundle) {
        this.A00.A01.send(3, bundle);
    }

    public void BlK(Bundle bundle) {
        this.A00.A01.send(1, bundle);
    }

    public void Br7(Bundle bundle) {
        this.A00.A01.send(4, bundle);
    }

    public void Br8(Bundle bundle) {
        this.A00.A01.send(2, bundle);
    }

    public IBinder asBinder() {
        return this;
    }

    public C124606De() {
        attachInterface(this, "org.npci.upi.security.services.CLResultReceiver");
    }
}
