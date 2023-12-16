package X;

import java.util.Iterator;

/* renamed from: X.8MI  reason: invalid class name */
public class AnonymousClass8MI implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass85C A02;
    public final /* synthetic */ C166537yr A03;

    public AnonymousClass8MI(AnonymousClass85C r1, C166537yr r2, float f, long j) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = j;
        this.A03 = r2;
    }

    public void run() {
        Iterator it = this.A02.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass6CA.A0K(it).BYG(this.A03, this.A00, this.A01);
        }
    }
}
