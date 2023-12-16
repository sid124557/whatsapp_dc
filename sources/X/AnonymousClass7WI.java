package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.7WI  reason: invalid class name */
public class AnonymousClass7WI {
    public final AnonymousClass5QW A00;
    public final Comparator A01 = new AnonymousClass6A6(0);
    public volatile List A02;

    public List A00() {
        List list;
        synchronized (this) {
            if (this.A02 == null) {
                A01();
            }
            list = this.A02;
        }
        return list;
    }

    public void A01() {
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = this.A00.A00();
            }
        }
    }

    public AnonymousClass7WI(AnonymousClass5QW r3) {
        this.A00 = r3;
    }
}
