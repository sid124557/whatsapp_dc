package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0WP  reason: invalid class name */
public final class AnonymousClass0WP {
    public static void A00(IOnDoneCallback iOnDoneCallback, C15650ri r2, AnonymousClass0O9 r3, String str) {
        AnonymousClass0VH.A01(new C12920mL(iOnDoneCallback, r2, r3, str));
    }

    public static void A01(IOnDoneCallback iOnDoneCallback, C15650ri r2, String str) {
        AnonymousClass0VH.A01(new C12550lj(iOnDoneCallback, r2, str));
    }

    public static void A03(C15660rj r3, String str) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Dispatching call ");
                A0o.append(str);
                Log.d("CarApp", AnonymousClass000.A0X(" to host", A0o));
            }
            r3.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Remote ");
            A0o2.append(str);
            throw new C13810nm(AnonymousClass000.A0X(" call failed", A0o2), e2);
        } catch (RemoteException e3) {
            Log.e("CarApp.Dispatch", AnonymousClass000.A0V("Host unresponsive when dispatching call ", str, AnonymousClass001.A0o()), e3);
        }
    }

    public static void A02(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        A03(new C09900gw(iOnDoneCallback, th, str, 1), AnonymousClass000.A0X(" onFailure", AnonymousClass000.A0l(str)));
    }
}
