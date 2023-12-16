package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* renamed from: X.7RO  reason: invalid class name */
public final class AnonymousClass7RO {
    public final IUiSettingsDelegate A00;

    public void A00() {
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A002 = r2.A00();
            A002.writeInt(0);
            r2.A02(3, A002);
        } catch (RemoteException e) {
            throw new AnonymousClass8RJ(e);
        }
    }

    public AnonymousClass7RO(IUiSettingsDelegate iUiSettingsDelegate) {
        this.A00 = iUiSettingsDelegate;
    }
}
