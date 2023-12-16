package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.4Ip  reason: invalid class name and case insensitive filesystem */
public class C86044Ip implements Executor {
    public Object A00;
    public final int A01;

    public C86044Ip(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void execute(Runnable runnable) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((AnonymousClass4FS) obj).BkM(runnable);
                return;
            default:
                ((C69263Wi) obj).BkS(runnable);
                return;
        }
    }
}
