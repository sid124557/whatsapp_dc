package X;

/* renamed from: X.92q  reason: invalid class name and case insensitive filesystem */
public class C1897892q implements C180638lO {
    public Object A00;
    public final int A01;

    public C1897892q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bit(AnonymousClass6OV r6) {
        if (2 - this.A01 != 0) {
            AnonymousClass86D r4 = (AnonymousClass86D) this.A00;
            Object obj = r4.A07;
            synchronized (obj) {
                r6.clear();
                AnonymousClass6OV[] r2 = r4.A0C;
                int i = r4.A01;
                r4.A01 = i + 1;
                r2[i] = r6;
                if (!r4.A09.isEmpty() && r4.A01 > 0) {
                    obj.notify();
                }
            }
            return;
        }
        r6.clear();
        ((AnonymousClass88O) this.A00).A04.add(r6);
    }
}
