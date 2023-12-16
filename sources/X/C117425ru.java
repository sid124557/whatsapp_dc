package X;

/* renamed from: X.5ru  reason: invalid class name and case insensitive filesystem */
public class C117425ru implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C94244qc A05;
    public final /* synthetic */ Runnable A06;

    public C117425ru(C94244qc r1, Runnable runnable, float f, float f2, float f3, float f4, long j) {
        this.A05 = r1;
        this.A04 = j;
        this.A03 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A06 = runnable;
    }

    public void run() {
        float min = Math.min(300.0f, (float) (System.currentTimeMillis() - this.A04));
        C94244qc r2 = this.A05;
        r2.A02(this.A03 + (this.A02 * min), this.A00, this.A01);
        this.A06.run();
        if (min < 300.0f) {
            r2.A09.post(this);
        }
    }
}
