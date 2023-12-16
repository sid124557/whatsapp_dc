package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;

/* renamed from: X.5ls  reason: invalid class name and case insensitive filesystem */
public final class C113715ls implements AnonymousClass664 {
    public final WfalManager A00;
    public final AnonymousClass30P A01;
    public final C183538qC A02;

    public String BDW() {
        return "WaffleDailyLogger";
    }

    public void BQV() {
        WfalManager wfalManager = this.A00;
        if (wfalManager.A02()) {
            Boolean A022 = ((C614430u) wfalManager.A06.get()).A02();
            C166557yt A012 = wfalManager.A01(AnonymousClass223.FACEBOOK);
            C166557yt A013 = wfalManager.A01(AnonymousClass223.INSTAGRAM);
            C60492ye A002 = wfalManager.A00();
            AnonymousClass4sA r2 = new AnonymousClass4sA();
            boolean z = true;
            r2.A00 = Boolean.valueOf(AnonymousClass000.A1W(this.A01.A01(AnonymousClass2BX.A00)));
            r2.A01 = A022;
            r2.A04 = Boolean.valueOf(AnonymousClass000.A1W(A012));
            if (A013 == null) {
                z = false;
            }
            r2.A05 = Boolean.valueOf(z);
            r2.A02 = Boolean.valueOf(A002.A00);
            r2.A03 = Boolean.valueOf(A002.A01);
            ((AnonymousClass4FV) this.A02.get()).BhD(r2);
            Log.d("WaffleDailyLogger/ Waffle daily log posted");
            return;
        }
        Log.w("WaffleDailyLogger/ Skip logging as feature is disabled");
    }

    public C113715ls(WfalManager wfalManager, AnonymousClass30P r2, C183538qC r3) {
        C18260x0.A0V(r3, wfalManager, r2);
        this.A02 = r3;
        this.A00 = wfalManager;
        this.A01 = r2;
    }
}
