package X;

import java.util.ArrayList;

/* renamed from: X.0kb  reason: invalid class name and case insensitive filesystem */
public class C11870kb implements Runnable {
    public final /* synthetic */ AnonymousClass0QW A00;
    public final /* synthetic */ AnonymousClass0UN A01;

    public C11870kb(AnonymousClass0QW r1, AnonymousClass0UN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0UN r2 = this.A01;
        ArrayList arrayList = r2.A03;
        AnonymousClass0QW r1 = this.A00;
        arrayList.remove(r1);
        r2.A04.remove(r1);
    }
}
