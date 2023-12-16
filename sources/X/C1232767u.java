package X;

import com.whatsapp.util.Log;

/* renamed from: X.67u  reason: invalid class name and case insensitive filesystem */
public class C1232767u extends C103045Lg {
    public Object A00;
    public final int A01;

    public C1232767u(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        C69263Wi r2;
        Runnable r1;
        if (this.A01 != 0) {
            Log.i("Settings/onInactiveAccountAddBadge");
            r2 = ((C89654ea) this.A00).A05;
            r1 = new C71283br((Object) this, 43);
        } else {
            Log.i("HomeActivity/onInactiveAccountAddBadge");
            r2 = ((C89654ea) this.A00).A05;
            r1 = new C117645sG((Object) this, 41);
        }
        r2.A0S(r1);
    }
}
