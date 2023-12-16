package X;

import java.util.Iterator;

/* renamed from: X.8MN  reason: invalid class name */
public class AnonymousClass8MN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass85C A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass8MN(AnonymousClass85C r1, long j, long j2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A04 = z2;
    }

    public void run() {
        Iterator it = this.A02.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass6CA.A0K(it).Bco(this.A01, this.A00, this.A03, this.A04);
        }
    }
}
