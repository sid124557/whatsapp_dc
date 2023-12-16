package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7RQ  reason: invalid class name */
public final class AnonymousClass7RQ {
    public final Map A00 = AnonymousClass001.A0t();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new AnonymousClass6YY();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0w.getValue();
                try {
                    new AnonymousClass6TY();
                    throw AnonymousClass000.A0L();
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(A0w.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 32, valueOf2);
                    A0o.append("onPostInitHandler: Didn't add: ");
                    A0o.append(valueOf);
                    AnonymousClass6C7.A1F("/", valueOf2, "WearableClient", A0o);
                }
            }
        }
    }
}
