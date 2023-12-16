package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2XD  reason: invalid class name */
public class AnonymousClass2XD {
    public final C55682qk A00;

    public static void A00(Exception exc) {
        JniBridge.INSTANCE.jniBridgeExceptionHandler.A01(exc);
    }

    public AnonymousClass2XD(C55682qk r1) {
        this.A00 = r1;
    }

    public void A01(Exception exc) {
        Log.e("wamsysJniBridge/caught exception", exc);
        C55682qk.A04(this.A00, "wamsysJniBridge/caught exception", exc);
    }
}
