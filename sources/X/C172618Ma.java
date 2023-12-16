package X;

import java.util.Iterator;

/* renamed from: X.8Ma  reason: invalid class name and case insensitive filesystem */
public class C172618Ma implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass85C A02;
    public final /* synthetic */ C147697Fh A03;
    public final /* synthetic */ C142486xH A04;
    public final /* synthetic */ C166427yf A05;
    public final /* synthetic */ C166537yr A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public C172618Ma(AnonymousClass85C r1, C147697Fh r2, C142486xH r3, C166427yf r4, C166537yr r5, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A02 = r1;
        this.A06 = r5;
        this.A05 = r4;
        this.A03 = r2;
        this.A01 = j;
        this.A04 = r3;
        this.A00 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A0A = z;
        this.A09 = str3;
    }

    public void run() {
        Iterator it = this.A02.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r6 = this.A06;
            C166427yf r5 = this.A05;
            C147697Fh r3 = this.A03;
            long j = this.A01;
            C142486xH r4 = this.A04;
            long j2 = this.A00;
            A0K.BfO(r3, r4, r5, r6, this.A07, this.A08, this.A09, j, j2, this.A0A);
        }
    }
}
