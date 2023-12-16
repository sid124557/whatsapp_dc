package X;

import java.util.Iterator;

/* renamed from: X.8MM  reason: invalid class name */
public class AnonymousClass8MM implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass8MM(Object obj, String str, int i, long j, boolean z) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
    }

    public void run() {
        int i = this.A04;
        Object obj = this.A01;
        if (i != 0) {
            String str = this.A02;
            boolean z = this.A03;
            ((C126436Nw) obj).A00.BQi(this.A00, str, z);
            return;
        }
        Iterator A002 = AnonymousClass85C.A00(obj);
        while (A002.hasNext()) {
            AnonymousClass6CA.A0K(A002).BQi(this.A00, this.A02, this.A03);
        }
    }
}
