package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.89y  reason: invalid class name and case insensitive filesystem */
public final class C1696089y implements C183918qs {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C158217jc A01;

    public C1696089y(Bundle bundle, C158217jc r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final int Bsp() {
        return 1;
    }

    public final void Bsu(C178458hZ r7) {
        C178458hZ r5 = this.A01.A01;
        Bundle bundle = this.A00;
        C1695789v r52 = (C1695789v) r5;
        try {
            Bundle A08 = AnonymousClass002.A08();
            C160897ob.A01(bundle, A08);
            C163177tO r2 = (C163177tO) r52.A02;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, A08);
            r2.A02(2, A002);
            C160897ob.A01(A08, bundle);
            Parcel A012 = r2.A01(8, r2.A00());
            IObjectWrapper A02 = AnonymousClass6WL.A02(A012.readStrongBinder());
            A012.recycle();
            r52.A00 = (View) AnonymousClass6UT.A01(A02);
            ViewGroup viewGroup = r52.A01;
            viewGroup.removeAllViews();
            viewGroup.addView(r52.A00);
        } catch (RemoteException e) {
            throw new AnonymousClass8RJ(e);
        }
    }
}
