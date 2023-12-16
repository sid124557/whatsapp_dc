package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.89v  reason: invalid class name and case insensitive filesystem */
public final class C1695789v implements C178458hZ {
    public View A00;
    public final ViewGroup A01;
    public final IMapViewDelegate A02;

    public final void A00(C181128mC r4) {
        try {
            IMapViewDelegate iMapViewDelegate = this.A02;
            AnonymousClass6X6 r0 = new AnonymousClass6X6(r4);
            C163177tO r2 = (C163177tO) iMapViewDelegate;
            Parcel A002 = r2.A00();
            C161087oy.A00(r0, A002);
            r2.A02(9, A002);
        } catch (RemoteException e) {
            throw new AnonymousClass8RJ(e);
        }
    }

    public C1695789v(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.A02 = iMapViewDelegate;
        C162177rO.A02(viewGroup);
        this.A01 = viewGroup;
    }
}
