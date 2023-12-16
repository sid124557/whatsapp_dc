package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.93a  reason: invalid class name and case insensitive filesystem */
public class C1898893a implements AnonymousClass4F2 {
    public Object A00;
    public final int A01;

    public C1898893a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BUB() {
        if (this.A01 != 0) {
            Log.d("RestoreChatConnectionWorker finished successfully!");
            ((RestoreChatConnectionWorker) this.A00).A01.A09(new C01410Ap());
        }
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public void BUF() {
        if (this.A01 == 0) {
            ((CountDownLatch) this.A00).countDown();
        }
    }
}
