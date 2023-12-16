package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Jr  reason: invalid class name and case insensitive filesystem */
public class C86324Jr implements AnonymousClass4EJ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86324Jr(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BQp() {
        if (this.A02 != 0) {
            ((C84964Ek) this.A01).BQp();
        } else {
            Log.e("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onDeliveryFailure");
        }
    }

    public void BSB(Exception exc) {
        if (this.A02 != 0) {
            C162457s7.A0J(exc, 0);
            ((C84964Ek) this.A01).BSC(exc, 485);
            return;
        }
        C18260x0.A0x("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass001.A0o(), 1);
    }

    public void Bd3(C60272yH r10) {
        if (this.A02 != 0) {
            ((C70363aN) this.A00).run();
            return;
        }
        C43312Rq r4 = (C43312Rq) this.A01;
        Object obj = this.A00;
        AnonymousClass4AM r3 = r4.A01;
        if (r3 != null) {
            C50912iy r2 = AnonymousClass2BX.A00;
            C86534Km r1 = new C86534Km(r4, 1);
            C162457s7.A0J(r2, 1);
            C67313Ou B0i = r3.B0i(r2, (AnonymousClass27A) null, r1);
            B0i.Bh4(new C86414Ka(r4, B0i, C54662p5.A00(), obj, 2));
            return;
        }
        throw C18270x1.A0S("autoTokenRefreshFactory");
    }
}
