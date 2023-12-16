package X;

import java.util.Iterator;

/* renamed from: X.8MR  reason: invalid class name */
public class AnonymousClass8MR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass85C A01;
    public final /* synthetic */ C166427yf A02;
    public final /* synthetic */ C166537yr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass8MR(AnonymousClass85C r1, C166427yf r2, C166537yr r3, String str, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    public void run() {
        Iterator it = this.A01.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r4 = this.A03;
            C166427yf r3 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            A0K.BcA(r3, r4, this.A04, this.A00, z, z2);
        }
    }
}
