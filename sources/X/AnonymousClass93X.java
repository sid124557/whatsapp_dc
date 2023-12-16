package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.93X  reason: invalid class name */
public class AnonymousClass93X implements OnSuccessListener {
    public Object A00;
    public final int A01;

    public AnonymousClass93X(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onSuccess(Object obj) {
        String str;
        switch (this.A01) {
            case 3:
                Log.i("ChangeNumber/smsretriever/onsuccess");
                ((ChangeNumber) this.A00).A7C(true);
                return;
            case 4:
                AnonymousClass2M7 r1 = (AnonymousClass2M7) this.A00;
                C127236Re r0 = ((AnonymousClass8B9) ((C187748xk) ((C155737fQ) obj).A00)).A01;
                if (r0 == null) {
                    str = null;
                } else {
                    str = r0.A00;
                }
                C48262ec r2 = r1.A01;
                if (str != null) {
                    r2.A01(str, 0, (String) null);
                } else {
                    r2.A01((String) null, 1000, "Attestation API returned NULL as JWS result");
                }
                C18260x0.A0q("requestAttestation/onSuccess/jws=", str, AnonymousClass001.A0o());
                return;
            case 5:
                return;
            default:
                ((AnonymousClass4GQ) this.A00).invoke(obj);
                return;
        }
    }
}
