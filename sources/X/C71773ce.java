package X;

/* renamed from: X.3ce  reason: invalid class name and case insensitive filesystem */
public class C71773ce implements Runnable, Comparable, AnonymousClass495 {
    public final Object A00;
    public final Object A01;
    public final Runnable A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ C56482s3 A04;

    public void run() {
        try {
            this.A03 = true;
            this.A02.run();
        } finally {
            this.A04.A05(this, this.A01);
            this.A03 = false;
        }
    }

    public C71773ce(C56482s3 r2, Object obj, Object obj2, Runnable runnable) {
        this.A04 = r2;
        this.A01 = obj;
        this.A02 = runnable;
        this.A00 = obj2;
    }

    public void cancel() {
        Runnable runnable = this.A02;
        if (runnable instanceof AnonymousClass495) {
            ((AnonymousClass495) runnable).cancel();
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C71773ce r3 = (C71773ce) obj;
        Runnable runnable = this.A02;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(r3.A02);
        }
        return 0;
    }
}
