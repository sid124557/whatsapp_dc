package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: X.8BN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BN implements OnCompleteListener {
    public final /* synthetic */ C152017Xf A00;
    public final /* synthetic */ C158887ki A01;

    public final void onComplete(Task task) {
        C158887ki r0 = this.A01;
        C152017Xf r2 = this.A00;
        synchronized (r0.A08) {
            r0.A0C.remove(r2);
        }
    }

    public /* synthetic */ AnonymousClass8BN(C152017Xf r1, C158887ki r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
