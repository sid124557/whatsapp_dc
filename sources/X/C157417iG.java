package X;

import java.io.File;
import java.util.List;

/* renamed from: X.7iG  reason: invalid class name and case insensitive filesystem */
public class C157417iG {
    public static final File A03 = AnonymousClass002.A0B("/sys/kernel/debug/tracing/trace");
    public boolean A00;
    public final Object A01 = AnonymousClass4L0.A0U();
    public final List A02 = AnonymousClass001.A0s();

    public void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            int i = 0;
            while (true) {
                List list = this.A02;
                if (i < list.size()) {
                    list.get(i);
                    C159267lX.A00();
                    i++;
                }
            }
        }
    }
}
