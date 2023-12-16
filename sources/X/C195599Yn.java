package X;

/* renamed from: X.9Yn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195599Yn implements C202289li {
    public final /* synthetic */ AnonymousClass9VA A00;

    public final void BYq(AnonymousClass9U3 r8) {
        AnonymousClass9VA r6 = this.A00;
        if (r6.A08) {
            Object obj = r6.A06;
            synchronized (obj) {
                if (r6.A07) {
                    AnonymousClass9PE r4 = r6.A02;
                    byte[] bArr = r8.A0A;
                    C203269nP[] r2 = r8.A0C;
                    int i = r8.A03;
                    int i2 = r8.A00;
                    r4.A02 = bArr;
                    r4.A03 = r2;
                    r4.A01 = i;
                    r4.A00 = i2;
                    r6.A09 = true;
                    obj.notify();
                    while (r6.A07 && r6.A08) {
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    r6.A09 = false;
                }
            }
        }
    }

    public /* synthetic */ C195599Yn(AnonymousClass9VA r1) {
        this.A00 = r1;
    }
}
