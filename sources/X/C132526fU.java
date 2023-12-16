package X;

/* renamed from: X.6fU  reason: invalid class name and case insensitive filesystem */
public class C132526fU extends AnonymousClass7H7 {
    public final int A00;

    public C132526fU(int i) {
        super("frequently_contacted_biz");
        this.A00 = 0;
        if (i > 0) {
            this.A00 = i;
            return;
        }
        throw AnonymousClass001.A0c("FrequentlyContactedBizWidget max list size cannot be zero or negative");
    }
}
