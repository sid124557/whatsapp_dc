package X;

import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.3GO  reason: invalid class name */
public class AnonymousClass3GO implements AnonymousClass4FI {
    public final AnonymousClass2OK A00;
    public final C52972mL A01;

    public void BQA(C95814uZ r6) {
        if (AnonymousClass2OK.A00(this.A00) && (r6 instanceof C27991fJ)) {
            Log.d("InstrumentationObserverImpl/onConversationAdded with groupJid");
            for (C56262rh r1 : this.A01.A00()) {
                if (r1 instanceof AnonymousClass1f1) {
                    AnonymousClass1f1 r12 = (AnonymousClass1f1) r1;
                    Handler handler = r12.A00;
                    handler.removeCallbacksAndMessages((Object) null);
                    handler.postDelayed(C70003Zm.A00(r12, 43), 2000);
                }
            }
        }
    }

    public /* synthetic */ void BQB(C95814uZ r1) {
    }

    public /* synthetic */ void BQD(C95814uZ r1) {
    }

    public /* synthetic */ void BQE(C95814uZ r1) {
    }

    public /* synthetic */ void BQH(int i) {
    }

    public AnonymousClass3GO(AnonymousClass2OK r1, C52972mL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ void BQI() {
    }

    public /* synthetic */ void BQC(C95814uZ r1, boolean z) {
    }
}
