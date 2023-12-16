package X;

import android.os.RemoteException;

/* renamed from: X.89x  reason: invalid class name and case insensitive filesystem */
public final class C1695989x implements C183918qs {
    public final /* synthetic */ C158217jc A00;

    public C1695989x(C158217jc r1) {
        this.A00 = r1;
    }

    public final int Bsp() {
        return 5;
    }

    public final void Bsu(C178458hZ r4) {
        try {
            C163177tO r2 = (C163177tO) ((C1695789v) this.A00.A01).A02;
            r2.A02(3, r2.A00());
        } catch (RemoteException e) {
            throw new AnonymousClass8RJ(e);
        }
    }
}
