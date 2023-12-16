package X;

import java.util.Iterator;

/* renamed from: X.8MQ  reason: invalid class name */
public class AnonymousClass8MQ implements Runnable {
    public final /* synthetic */ AnonymousClass85C A00;
    public final /* synthetic */ C147697Fh A01;
    public final /* synthetic */ C160117n4 A02;
    public final /* synthetic */ C166427yf A03;
    public final /* synthetic */ C166537yr A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AnonymousClass8MQ(AnonymousClass85C r1, C147697Fh r2, C160117n4 r3, C166427yf r4, C166537yr r5, String str, String str2) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = str;
        this.A06 = str2;
    }

    public void run() {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r6 = this.A04;
            A0K.BYD(this.A01, this.A02, this.A03, r6, this.A05, this.A06);
        }
    }
}
