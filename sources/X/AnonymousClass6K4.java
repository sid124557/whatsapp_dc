package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6K4  reason: invalid class name */
public abstract class AnonymousClass6K4 extends AnonymousClass81W {
    public Handler A00;
    public C153737br A01;
    public final HashMap A02 = AnonymousClass001.A0t();

    public void A00() {
        HashMap hashMap = this.A02;
        Iterator A10 = C18290x4.A10(hashMap);
        while (A10.hasNext()) {
            C148547Iu r2 = (C148547Iu) A10.next();
            C185778uE r1 = r2.A01;
            r1.Bix(r2.A00);
            r1.Bj9(r2.A02);
        }
        hashMap.clear();
        this.A01 = null;
    }

    public void A01(C153737br r2, boolean z) {
        this.A01 = r2;
        this.A00 = new Handler();
    }

    public final void A03(C185778uE r6, Object obj) {
        HashMap hashMap = this.A02;
        C159197lM.A01(!hashMap.containsKey(obj));
        AnonymousClass81V r4 = new AnonymousClass81V(this, obj);
        AnonymousClass81Y r3 = new AnonymousClass81Y(this, obj);
        hashMap.put(obj, new C148547Iu(r4, r6, r3));
        Handler handler = this.A00;
        C160767oH r1 = ((AnonymousClass81W) r6).A03;
        C159197lM.A01(AnonymousClass000.A1W(handler));
        r1.A02.add(new AnonymousClass7F9(handler, r3));
        r6.BhR(this.A01, r4, false);
    }

    public void BL3() {
        Iterator A10 = C18290x4.A10(this.A02);
        while (A10.hasNext()) {
            ((C148547Iu) A10.next()).A01.BL3();
        }
    }
}
