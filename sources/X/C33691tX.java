package X;

import android.os.SystemClock;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

/* renamed from: X.1tX  reason: invalid class name and case insensitive filesystem */
public class C33691tX extends AnonymousClass5ZM {
    public final /* synthetic */ Main A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Main main;
        int i = 0;
        while (true) {
            main = this.A00;
            if (main.A06.A01) {
                if (i >= 45000) {
                    break;
                }
                i += 200;
                SystemClock.sleep(200);
            } else if (i < 45000) {
                return null;
            }
        }
        if (!main.A06.A01) {
            return null;
        }
        ((C66493Lq) main.A0C.get()).A0A(3);
        return null;
    }

    public C33691tX(Main main) {
        this.A00 = main;
    }

    public void A0A() {
        C621433s.A01(this.A00, 104);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Main main = this.A00;
        C621433s.A00(main, 104);
        Log.i("main/gotoActivity");
        main.A7A();
    }
}
