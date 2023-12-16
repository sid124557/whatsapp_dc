package X;

import java.util.ArrayList;

/* renamed from: X.0ka  reason: invalid class name and case insensitive filesystem */
public class C11860ka implements Runnable {
    public final /* synthetic */ AnonymousClass0QW A00;
    public final /* synthetic */ AnonymousClass0UN A01;

    public C11860ka(AnonymousClass0QW r1, AnonymousClass0UN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        ArrayList arrayList = this.A01.A03;
        AnonymousClass0QW r2 = this.A00;
        if (arrayList.contains(r2)) {
            r2.A01.A02(r2.A04.A0B);
        }
    }
}
