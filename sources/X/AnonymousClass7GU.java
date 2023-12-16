package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.7GU  reason: invalid class name */
public final class AnonymousClass7GU {
    public final Messenger A00;
    public final C165917xq A01;

    public AnonymousClass7GU(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.A01 = new C165917xq(iBinder);
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", AnonymousClass6C7.A0k("Invalid interface descriptor: ", valueOf, valueOf.length()));
            throw new RemoteException();
        }
    }
}
