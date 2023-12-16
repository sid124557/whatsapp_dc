package X;

/* renamed from: X.3Qv  reason: invalid class name and case insensitive filesystem */
public class C67833Qv implements AnonymousClass4FM {
    public final /* synthetic */ C618432m A00;

    public C67833Qv(C618432m r1) {
        this.A00 = r1;
    }

    public void BOS() {
        C618432m.A00(this.A00, 2);
    }

    public void BOT() {
        C618432m.A00(this.A00, 7);
    }

    public void BPU(boolean z) {
        if (z) {
            C618432m.A00(this.A00, 5);
        }
    }

    public void BUS() {
        C618432m.A00(this.A00, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4 == 101) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYh(int r4) {
        /*
            r3 = this;
            r0 = 301(0x12d, float:4.22E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 101(0x65, float:1.42E-43)
            r2 = 0
            if (r4 != r0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            X.32m r1 = r3.A00
            r0 = 3
            if (r2 == 0) goto L_0x0015
            r0 = 18
        L_0x0015:
            X.C618432m.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67833Qv.BYh(int):void");
    }

    public void BYi() {
        C618432m.A00(this.A00, 17);
    }

    public void BYz(int i) {
        C618432m r1 = this.A00;
        C618432m.A00(r1, 3);
        synchronized (r1) {
            r1.A00 = i;
        }
    }

    public void onError(int i) {
        C618432m.A00(this.A00, C384327n.A00(i));
    }
}
