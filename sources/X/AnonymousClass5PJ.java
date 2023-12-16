package X;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.5PJ  reason: invalid class name */
public final class AnonymousClass5PJ {
    public final C187138wZ A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5PJ)) {
            return false;
        }
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A01 = r2.A01(17, C86644Kx.A0E(((AnonymousClass5PJ) obj).A00, r2));
            boolean A1S = AnonymousClass000.A1S(A01.readInt());
            A01.recycle();
            return A1S;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public final int hashCode() {
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 18);
            int readInt = A0e.readInt();
            A0e.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public AnonymousClass5PJ(C187138wZ r1) {
        C162177rO.A02(r1);
        this.A00 = r1;
    }
}
