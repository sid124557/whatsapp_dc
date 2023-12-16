package X;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.5wG  reason: invalid class name and case insensitive filesystem */
public final class C118995wG extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118995wG(AnonymousClass5ZL r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass5ZL r0 = this.this$0;
        C111515iD r4 = r0.A0A;
        int A05 = C86644Kx.A05(r0.A0E);
        String A02 = this.this$0.A02();
        AnonymousClass1VX r2 = r4.A01;
        C162457s7.A0J(r2, 0);
        if (r2.A0X(5957)) {
            C94924sJ r5 = new C94924sJ();
            r5.A00 = 48;
            r5.A01 = 0;
            r4.A01(r5);
            r4.A02(r5, Integer.valueOf(A05), (Integer) null, (Integer) null, (Integer) null, (Integer) null, A02, (List) null);
            r4.A02.BhD(r5);
        }
        this.this$0.A09.A02.A05();
        AnonymousClass5ZL r02 = this.this$0;
        AnonymousClass4GQ r3 = r02.A0I;
        for (C108875dh r1 : r02.A0B.A00()) {
            if (r1.A01 == 0) {
                r3.invoke(r1);
                return C59022wD.A00;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
