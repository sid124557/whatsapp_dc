package X;

import java.util.Set;

/* renamed from: X.54K  reason: invalid class name */
public class AnonymousClass54K extends AnonymousClass3ZZ {
    public final /* synthetic */ C69423Wy A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Set A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54K(C69423Wy r1, Runnable runnable, String str, String str2, Set set) {
        super(str);
        this.A00 = r1;
        this.A01 = runnable;
        this.A03 = set;
        this.A02 = str2;
    }

    public void run() {
        try {
            this.A01.run();
            Set set = this.A03;
            synchronized (set) {
                set.remove(this.A02);
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
