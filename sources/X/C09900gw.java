package X;

import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0gw  reason: invalid class name and case insensitive filesystem */
public class C09900gw implements C15660rj {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C09900gw(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final Object call() {
        C06790Zf r0;
        if (this.A03 != 0) {
            IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.A00;
            Throwable th = (Throwable) this.A01;
            String str = this.A02;
            try {
                iOnDoneCallback.onFailure(new C06790Zf((Object) new FailureResponse(th)));
                return null;
            } catch (AnonymousClass0GR e) {
                Log.e("CarApp.Dispatch", AnonymousClass000.A0V("Serialization failure in ", str, AnonymousClass001.A0o()), e);
                return null;
            }
        } else {
            IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.A00;
            Object obj = this.A01;
            String str2 = this.A02;
            if (obj == null) {
                r0 = null;
            } else {
                try {
                    r0 = new C06790Zf(obj);
                } catch (AnonymousClass0GR e2) {
                    AnonymousClass0WP.A02(iOnDoneCallback2, str2, e2);
                    return null;
                }
            }
            iOnDoneCallback2.onSuccess(r0);
            return null;
        }
    }
}
