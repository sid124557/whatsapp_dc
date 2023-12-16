package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.2aX  reason: invalid class name and case insensitive filesystem */
public class C45762aX {
    public final Handler A00;
    public final Runnable A01;
    public final WeakReference A02;
    public final /* synthetic */ C64293Cx A03;

    public C45762aX(AnonymousClass66T r5, C64293Cx r6, String str) {
        this.A03 = r6;
        Handler handler = new Handler();
        this.A00 = handler;
        this.A02 = AnonymousClass0x9.A14(r5);
        C71323bv r2 = new C71323bv(5, str, this);
        this.A01 = r2;
        handler.postDelayed(r2, C625635p.A0L);
    }

    public final void A00(String str) {
        this.A00.removeCallbacks(this.A01);
        Map map = this.A03.A01.A01;
        if (map.containsKey(str)) {
            ((C54162oH) map.get(str)).A00.remove(this);
        }
    }
}
