package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9RB  reason: invalid class name */
public class AnonymousClass9RB {
    public final /* synthetic */ ARModelMetadataRequest A00;
    public final /* synthetic */ C195499Yd A01;
    public final /* synthetic */ CountDownLatch A02;

    public AnonymousClass9RB(ARModelMetadataRequest aRModelMetadataRequest, C195499Yd r2, CountDownLatch countDownLatch) {
        this.A01 = r2;
        this.A00 = aRModelMetadataRequest;
        this.A02 = countDownLatch;
    }

    public void A00(AnonymousClass9KQ r6) {
        C195499Yd r1 = this.A01;
        if (r6 != null) {
            r1.A05.set(r6);
            r1.A02.A04.A00(this.A00, r6, r1.A04, false);
        } else {
            r1.A02.A04.A00(this.A00, (AnonymousClass9KQ) null, r1.A04, true);
        }
        this.A02.countDown();
    }
}
