package X;

import android.os.IBinder;
import android.os.Parcel;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.8Py  reason: invalid class name and case insensitive filesystem */
public class C173378Py implements CLRemoteService {
    public IBinder A00;

    public void B6F(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.npci.upi.security.services.CLRemoteService");
            obtain.writeString("NPCI");
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeString(str5);
            obtain.writeString(str6);
            obtain.writeString(str7);
            obtain.writeString(str8);
            if (cLResultReceiver != null) {
                iBinder = cLResultReceiver.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            AnonymousClass000.A0w(this.A00, obtain, obtain2, 9);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean Bib(String str, String str2, String str3, String str4, String str5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.npci.upi.security.services.CLRemoteService");
            obtain.writeString("com.whatsapp");
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeString(str5);
            boolean z = false;
            this.A00.transact(2, obtain, obtain2, 0);
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

    public IBinder asBinder() {
        return this.A00;
    }

    public C173378Py(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public void B2r(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.npci.upi.security.services.CLRemoteService");
            obtain.writeString(str);
            AnonymousClass000.A0w(this.A00, obtain, obtain2, 10);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String B5L(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.npci.upi.security.services.CLRemoteService");
            obtain.writeString(str);
            obtain.writeString(str2);
            AnonymousClass000.A0w(this.A00, obtain, obtain2, 1);
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
