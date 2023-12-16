package X;

/* renamed from: X.8ML  reason: invalid class name */
public class AnonymousClass8ML implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public String A03;
    public final int A04;

    public AnonymousClass8ML(Object obj, String str, int i, long j, long j2) {
        this.A04 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        String str;
        AnonymousClass85L r3;
        long j;
        boolean z;
        int i = this.A04;
        Object obj = this.A02;
        switch (i) {
            case 0:
                str = this.A03;
                j = this.A01;
                r3 = ((C150677Rt) obj).A01.A01.A0o;
                z = false;
                break;
            case 1:
                str = this.A03;
                j = this.A01;
                r3 = ((AnonymousClass7FE) obj).A01.A01.A0o;
                z = true;
                break;
            case 2:
                String str2 = this.A03;
                ((AnonymousClass7VZ) obj).A01.BMm(this.A00, str2, this.A01);
                return;
            default:
                String str3 = this.A03;
                ((AnonymousClass7GH) obj).A01.BfH(this.A00, str3, this.A01);
                return;
        }
        r3.BQi(j, str, z);
    }
}
