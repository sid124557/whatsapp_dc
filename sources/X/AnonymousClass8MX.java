package X;

import java.util.Iterator;

/* renamed from: X.8MX  reason: invalid class name */
public class AnonymousClass8MX implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass85C A01;
    public final /* synthetic */ C166427yf A02;
    public final /* synthetic */ C166537yr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public AnonymousClass8MX(AnonymousClass85C r1, C166427yf r2, C166537yr r3, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
    }

    public void run() {
        Iterator it = this.A01.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r4 = this.A03;
            A0K.BfE(this.A02, r4, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
