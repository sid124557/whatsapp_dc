package X;

/* renamed from: X.0lu  reason: invalid class name and case insensitive filesystem */
public class C12660lu implements Runnable {
    public final /* synthetic */ C12670lv A00;
    public final /* synthetic */ C188268yc A01;
    public final /* synthetic */ String A02;

    public C12660lu(C12670lv r1, C188268yc r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void run() {
        C12670lv r2 = this.A00;
        r2.A01.A03.remove(this.A02);
        C188268yc r1 = this.A01;
        if (!r1.isCancelled()) {
            try {
                r1.get();
            } catch (Exception e) {
                r2.A00.A06(e);
            }
        }
    }
}
