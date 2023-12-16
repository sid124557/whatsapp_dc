package X;

import java.util.Iterator;

/* renamed from: X.8MZ  reason: invalid class name */
public class AnonymousClass8MZ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass85C A01;
    public final /* synthetic */ C166427yf A02;
    public final /* synthetic */ C166537yr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public AnonymousClass8MZ(AnonymousClass85C r1, C166427yf r2, C166537yr r3, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
    }

    public void run() {
        Iterator it = this.A01.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            C166537yr r4 = this.A03;
            C166427yf r3 = this.A02;
            boolean z = this.A0A;
            boolean z2 = this.A09;
            A0K.BfT(r3, r4, this.A08, this.A04, this.A05, this.A06, this.A07, this.A00, z, z2);
        }
    }
}
