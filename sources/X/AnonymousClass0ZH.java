package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0ZH  reason: invalid class name */
public abstract class AnonymousClass0ZH implements IInterface {
    public final String mDescriptor;
    public final IBinder mRemote;

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void transactOneway(int i, Parcel parcel) {
        try {
            this.mRemote.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public AnonymousClass0ZH(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public Parcel transactAndReadException(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.mRemote, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public void transactAndReadExceptionReturnVoid(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.mRemote, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
