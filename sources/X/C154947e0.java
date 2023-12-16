package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

/* renamed from: X.7e0  reason: invalid class name and case insensitive filesystem */
public final class C154947e0 {
    public static boolean A00;

    public static synchronized int A00(Context context) {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate;
        C187128wY r1;
        synchronized (C154947e0.class) {
            C162177rO.A03(context, "Context is null");
            if (!A00) {
                try {
                    try {
                        AnonymousClass6X3 r4 = (AnonymousClass6X3) C155377el.A01(context);
                        Parcel A01 = r4.A01(4, r4.A00());
                        IBinder readStrongBinder = A01.readStrongBinder();
                        if (readStrongBinder == null) {
                            iCameraUpdateFactoryDelegate = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                                iCameraUpdateFactoryDelegate = (ICameraUpdateFactoryDelegate) queryLocalInterface;
                            } else {
                                iCameraUpdateFactoryDelegate = new C128656Wy(readStrongBinder);
                            }
                        }
                        A01.recycle();
                        C162177rO.A02(iCameraUpdateFactoryDelegate);
                        C106555Zl.A00 = iCameraUpdateFactoryDelegate;
                        Parcel A012 = r4.A01(5, r4.A00());
                        IBinder readStrongBinder2 = A012.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            r1 = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                            if (queryLocalInterface2 instanceof C187128wY) {
                                r1 = (C187128wY) queryLocalInterface2;
                            } else {
                                r1 = new C128626Wv(readStrongBinder2);
                            }
                        }
                        A012.recycle();
                        if (AnonymousClass5CV.A00 == null) {
                            C162177rO.A03(r1, "delegate must not be null");
                            AnonymousClass5CV.A00 = r1;
                        }
                        A00 = true;
                    } catch (RemoteException e) {
                        throw new AnonymousClass8RJ(e);
                    }
                } catch (C143476yw e2) {
                    return e2.errorCode;
                }
            }
        }
        return 0;
    }
}
