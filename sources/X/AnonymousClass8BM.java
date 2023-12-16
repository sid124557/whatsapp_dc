package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: X.8BM  reason: invalid class name */
public final class AnonymousClass8BM implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass7S7 A00;
    public final /* synthetic */ C152017Xf A01;

    public AnonymousClass8BM(AnonymousClass7S7 r1, C152017Xf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onComplete(Task task) {
        this.A00.A01.remove(this.A01);
    }
}
