package X;

import java.util.List;

/* renamed from: X.9hL  reason: invalid class name and case insensitive filesystem */
public class C199829hL implements Runnable {
    public final /* synthetic */ AnonymousClass9RS A00;
    public final /* synthetic */ List A01;

    public C199829hL(AnonymousClass9RS r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void run() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass9QW) list.get(i)).A00();
        }
    }
}
