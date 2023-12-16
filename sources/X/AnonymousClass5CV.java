package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.5CV  reason: invalid class name */
public final class AnonymousClass5CV {
    public static C187128wY A00;

    public static AnonymousClass7BV A00(Bitmap bitmap) {
        C162177rO.A03(bitmap, "image must not be null");
        try {
            C187128wY r2 = A00;
            C162177rO.A03(r2, "IBitmapDescriptorFactory is not initialized");
            C163177tO r22 = (C163177tO) r2;
            Parcel A002 = r22.A00();
            C161087oy.A01(A002, bitmap);
            return new AnonymousClass7BV(C86604Kt.A0M(A002, r22, 6));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }
}
