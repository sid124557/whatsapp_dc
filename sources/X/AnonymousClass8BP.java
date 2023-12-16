package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.util.Log;

/* renamed from: X.8BP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BP implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass7VT A00;
    public final /* synthetic */ AnonymousClass7UW A01;

    public final void onComplete(Task task) {
        AnonymousClass7VT r2 = this.A00;
        AnonymousClass7UW r1 = this.A01;
        if (task.isSuccessful()) {
            r2.A00();
        }
        if (task.getException() != null) {
            Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Async cronet engine install failed");
        }
        r1.A00(AnonymousClass7VT.A01);
    }

    public /* synthetic */ AnonymousClass8BP(AnonymousClass7VT r1, AnonymousClass7UW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
