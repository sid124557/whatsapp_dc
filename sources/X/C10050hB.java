package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;

/* renamed from: X.0hB  reason: invalid class name and case insensitive filesystem */
public class C10050hB implements IAppDataReaderService {
    public IBinder A00;

    public IBinder asBinder() {
        return this.A00;
    }

    public C10050hB(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public ParcelFileDescriptor B7e() {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
            AnonymousClass000.A0w(this.A00, obtain, obtain2, 1);
            Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            return (ParcelFileDescriptor) obj;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
