package X;

/* renamed from: X.74L  reason: invalid class name */
public class AnonymousClass74L implements C181438ml {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass74L(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean BsI(AnonymousClass84O r6) {
        Object obj;
        if (this.A02 != 0) {
            C157997jG r3 = (C157997jG) this.A01;
            C147657Fd r0 = r3.A00;
            if (!(r0 == null || (obj = r0.A01.get(r6)) == null)) {
                r3.A01.A01.put(r6, obj);
            }
            long j = (long) r6.A02;
            Object A002 = r3.A00(j);
            if (A002 == null) {
                return false;
            }
            r3.A01(j, A002);
            return false;
        }
        AnonymousClass7K6 r4 = (AnonymousClass7K6) this.A01;
        AnonymousClass7K6 r32 = (AnonymousClass7K6) this.A00;
        int i = r6.A02;
        Object obj2 = r4.A02.get(i);
        if (obj2 != null) {
            r32.A02.put(i, obj2);
        }
        Object obj3 = r4.A00.get(i);
        if (obj3 != null) {
            r32.A00.put(i, obj3);
        }
        Object obj4 = r4.A01.get(i);
        if (obj4 == null) {
            return false;
        }
        r32.A01.put(i, obj4);
        return false;
    }
}
