package X;

import android.view.View;
import java.util.Set;

/* renamed from: X.0mh  reason: invalid class name and case insensitive filesystem */
public final class C13140mh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C05390Td A02;
    public final /* synthetic */ AnonymousClass84O A03;
    public final /* synthetic */ C151767Wf A04;
    public final /* synthetic */ Set A05;

    public C13140mh(View view, C05390Td r2, AnonymousClass84O r3, C151767Wf r4, Set set, int i) {
        this.A04 = r4;
        this.A01 = view;
        this.A05 = set;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void run() {
        this.A04.A00(this.A01, AnonymousClass5Z2.A03);
        this.A05.remove(this.A03);
        this.A02.A01.remove(this.A00);
    }
}
