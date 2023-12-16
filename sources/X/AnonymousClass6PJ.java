package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6PJ  reason: invalid class name */
public abstract class AnonymousClass6PJ extends C1690587u {
    public Handler A00;
    public C178288hI A01;
    public final HashMap A02 = AnonymousClass001.A0t();

    public void A00() {
        HashMap hashMap = this.A02;
        Iterator A10 = C18290x4.A10(hashMap);
        while (A10.hasNext()) {
            C148627Jc r2 = (C148627Jc) A10.next();
            C186428vI r1 = r2.A01;
            r1.Biy(r2.A00);
            r1.BjA(r2.A02);
        }
        hashMap.clear();
    }

    public void A02(C178288hI r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C161487pm.A01(myLooper);
        this.A00 = new Handler(myLooper, (Handler.Callback) null);
    }

    public final void A03(C186428vI r7, Object obj) {
        HashMap hashMap = this.A02;
        C161487pm.A03(!hashMap.containsKey(obj));
        C1690487t r4 = new C1690487t(this, obj);
        C1690787w r5 = new C1690787w(this, obj);
        hashMap.put(obj, new C148627Jc(r4, r7, r5));
        Handler handler = this.A00;
        handler.getClass();
        C1690587u r3 = (C1690587u) r7;
        r3.A03.A02.add(new AnonymousClass7G4(handler, r5));
        Handler handler2 = this.A00;
        handler2.getClass();
        r3.A02.A02.add(new C147817Fv(handler2, r5));
        r7.BhQ(r4, this.A01);
        if (!(!this.A05.isEmpty())) {
            r7.B1g(r4);
        }
    }

    public void BL3() {
        Iterator A10 = C18290x4.A10(this.A02);
        while (A10.hasNext()) {
            ((C148627Jc) A10.next()).A01.BL3();
        }
    }
}
