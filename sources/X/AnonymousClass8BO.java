package X;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: X.8BO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BO implements OnCompleteListener {
    public final Intent A00;
    public final AnonymousClass6CV A01;

    public final void onComplete(Task task) {
        this.A01.A01(this.A00);
    }

    public AnonymousClass8BO(Intent intent, AnonymousClass6CV r2) {
        this.A01 = r2;
        this.A00 = intent;
    }
}
