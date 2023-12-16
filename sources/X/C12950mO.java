package X;

import java.util.List;

/* renamed from: X.0mO  reason: invalid class name and case insensitive filesystem */
public class C12950mO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C05460Tk A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C12950mO(C05460Tk r1, List list, List list2, int i) {
        this.A01 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = i;
    }

    public void run() {
        this.A01.A03.execute(new C11900ke(this, AnonymousClass0SC.A00(new AnonymousClass096(this))));
    }
}
