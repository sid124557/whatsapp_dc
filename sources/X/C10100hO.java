package X;

/* renamed from: X.0hO  reason: invalid class name and case insensitive filesystem */
public class C10100hO implements C181448mm {
    public final /* synthetic */ AnonymousClass0Y5 A00;
    public final /* synthetic */ C181448mm A01;

    public C10100hO(AnonymousClass0Y5 r1, C181448mm r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba8(AnonymousClass7RT r5) {
        AnonymousClass0Y5 r3 = this.A00;
        if (r3.A0B.getAndSet(r5) != r5) {
            try {
                r3.A0A.set(r5.A00());
                r3.A09.set(r3.A07.now());
            } finally {
                this.A01.Ba8(r5);
            }
        }
    }
}
