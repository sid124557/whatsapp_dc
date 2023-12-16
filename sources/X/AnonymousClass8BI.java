package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.8BI  reason: invalid class name */
public final class AnonymousClass8BI implements C181148mE, OnFailureListener, OnSuccessListener {
    public final CountDownLatch A00 = C18290x4.A14();

    public final void BOR() {
        this.A00.countDown();
    }

    public final void onFailure(Exception exc) {
        this.A00.countDown();
    }

    public final void onSuccess(Object obj) {
        this.A00.countDown();
    }

    public /* synthetic */ AnonymousClass8BI(AnonymousClass70L r2) {
    }

    public AnonymousClass8BI() {
    }
}
