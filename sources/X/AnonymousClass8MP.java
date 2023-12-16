package X;

import java.util.Iterator;

/* renamed from: X.8MP  reason: invalid class name */
public class AnonymousClass8MP implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass85C A01;
    public final /* synthetic */ C160117n4 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public AnonymousClass8MP(AnonymousClass85C r1, C160117n4 r2, String str, String str2, String str3, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public void run() {
        Iterator it = this.A01.A01.iterator();
        while (it.hasNext()) {
            C186538vW A0K = AnonymousClass6CA.A0K(it);
            long j = this.A00;
            A0K.BSU(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
