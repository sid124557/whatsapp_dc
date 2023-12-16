package X;

import android.os.Handler;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.2aY  reason: invalid class name and case insensitive filesystem */
public class C45772aY {
    public int A00 = 0;
    public long A01;
    public C34151uJ A02;
    public final C620633i A03;

    public final synchronized void A00(AnonymousClass2JL r6, String str, String str2, int i) {
        Handler handler;
        C70043Zq r1;
        if (this.A02.A02 == this.A01) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.A00 = 0;
                        Log.d("SigquitBasedANRDetector/On max checks reached before error");
                    } else if (i != 3) {
                        this.A00 = 0;
                        Log.e("SigquitBasedANRDetector/onCheckFailed");
                    } else {
                        this.A00 = 0;
                        Log.d("SigquitBasedANRDetector/On monitoring stop");
                    }
                    SigquitBasedANRDetector sigquitBasedANRDetector = r6.A01;
                    if (sigquitBasedANRDetector.A08 != null) {
                        handler = sigquitBasedANRDetector.A08;
                        r1 = new C70043Zq(r6, 41);
                    }
                } else {
                    this.A00 = 2;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SigquitBasedANRDetector/On error detected ");
                    A0o.append(str);
                    C18260x0.A0s(" ", str2, A0o);
                    SigquitBasedANRDetector sigquitBasedANRDetector2 = r6.A01;
                    if (sigquitBasedANRDetector2.A08 != null) {
                        handler = sigquitBasedANRDetector2.A08;
                        r1 = new C70043Zq(r6, 40);
                    }
                }
                handler.post(r1);
            } else {
                Log.i("SigquitBasedANRDetector/Started monitoring");
            }
        }
    }

    public C45772aY(C620633i r2) {
        this.A03 = r2;
    }
}
