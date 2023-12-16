package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.4Iu  reason: invalid class name and case insensitive filesystem */
public class C86094Iu implements OnFailureListener {
    public Object A00;
    public final int A01;

    public C86094Iu(AnonymousClass2M7 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void onFailure(Exception exc) {
        int i;
        int i2;
        if (this.A01 != 0) {
            AnonymousClass2M7 r1 = (AnonymousClass2M7) this.A00;
            String message = exc.getMessage();
            if (exc instanceof ApiException) {
                i2 = ((ApiException) exc).mStatus.A01;
            } else {
                i2 = 500;
            }
            r1.A01.A01((String) null, i2, message);
            Log.e("requestAttestation/onError", exc);
            return;
        }
        AnonymousClass2M7 r3 = (AnonymousClass2M7) this.A00;
        Log.e("requestHarmfulApps/onError", exc);
        String message2 = exc.getMessage();
        if (exc instanceof ApiException) {
            i = ((ApiException) exc).mStatus.A01;
        } else {
            i = 500;
        }
        r3.A01.A00(message2, i);
    }
}
