package X;

/* renamed from: X.32G  reason: invalid class name */
public class AnonymousClass32G {
    public long A00;
    public long A01;
    public Object A02;
    public boolean A03;

    public AnonymousClass32G(Object obj, long j, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = obj;
        this.A01 = j;
        this.A00 = currentTimeMillis;
        this.A03 = z;
    }

    public AnonymousClass32G(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = obj;
        this.A01 = -1;
        this.A00 = currentTimeMillis;
        this.A03 = false;
    }

    public AnonymousClass32G(Object obj, long j, long j2) {
        this.A02 = obj;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = false;
    }
}
