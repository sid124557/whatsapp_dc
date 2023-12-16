package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9RT  reason: invalid class name */
public class AnonymousClass9RT {
    public final C202999mx A00;
    public final AtomicBoolean A01 = C18280x3.A0l();
    public final AtomicInteger A02 = new AtomicInteger(2);
    public final String[] A03 = new String[2];

    public AnonymousClass9RT(C202999mx r3) {
        this.A00 = r3;
    }

    public void A00(int i, String str) {
        String[] strArr = this.A03;
        strArr[i] = str;
        if (this.A02.decrementAndGet() == 0 && this.A01.compareAndSet(false, true)) {
            this.A00.BdL(strArr);
        }
    }
}
