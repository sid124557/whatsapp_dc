package X;

import java.util.Set;

/* renamed from: X.8CQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8CQ implements C181328ma {
    public static final AnonymousClass8CQ A00 = new AnonymousClass8CQ();

    public Object B08(C152817aA r5) {
        Set A03 = r5.A03();
        AnonymousClass7F0 r2 = AnonymousClass7F0.A01;
        if (r2 == null) {
            synchronized (AnonymousClass7F0.class) {
                r2 = AnonymousClass7F0.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass7F0();
                    AnonymousClass7F0.A01 = r2;
                }
            }
        }
        return new C156047fw(r2, A03);
    }
}
