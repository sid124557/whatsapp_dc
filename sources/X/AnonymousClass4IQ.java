package X;

import com.whatsapp.util.Log;

/* renamed from: X.4IQ  reason: invalid class name */
public class AnonymousClass4IQ implements AnonymousClass4DB {
    public Object A00;
    public final int A01;

    public AnonymousClass4IQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRy() {
        if (this.A01 != 0) {
            Log.e("fpm/ReceiverConnectionHandler/Failure sending IP address");
            C46762cA r2 = (C46762cA) this.A00;
            Runnable runnable = r2.A01;
            if (runnable != null) {
                r2.A04.BjN(runnable);
            }
            if (r2.A00 != null) {
                Log.i("fpm/ReceiverConnectionHandler/stopping WifiDirect");
                r2.A00.A00();
            }
            r2.A02.A0A(602, "fpm/ReceiverConnectionHandler/Failure sending IP address");
            return;
        }
        Log.e("fpm/DonorConnectionHandler/Unable to get IP");
        ((C61002zX) this.A00).A03.A0A(603, (String) null);
    }
}
