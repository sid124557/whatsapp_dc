package X;

import java.util.Iterator;

/* renamed from: X.8MW  reason: invalid class name */
public class AnonymousClass8MW implements Runnable {
    public final /* synthetic */ AnonymousClass85C A00;
    public final /* synthetic */ C147697Fh A01;
    public final /* synthetic */ C142486xH A02;
    public final /* synthetic */ C166427yf A03;
    public final /* synthetic */ C166537yr A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass8MW(AnonymousClass85C r1, C147697Fh r2, C142486xH r3, C166427yf r4, C166537yr r5, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
    }

    public void run() {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r6 = this.A04;
            C166427yf r5 = this.A03;
            A0K.BfG(this.A01, this.A02, r5, r6, this.A05, this.A07, this.A06);
        }
    }
}
