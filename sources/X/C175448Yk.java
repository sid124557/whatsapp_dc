package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Yk  reason: invalid class name and case insensitive filesystem */
public final class C175448Yk extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C141526vi $requestType;
    public final /* synthetic */ C103555Nl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175448Yk(C141526vi r2, C103555Nl r3) {
        super(1);
        this.this$0 = r3;
        this.$requestType = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C103555Nl r4;
        Object obj2;
        Object obj3;
        C141526vi r1;
        AnonymousClass74D r0;
        AnonymousClass74B r8 = (AnonymousClass74B) obj;
        if (r8 instanceof C133076ge) {
            r4 = this.this$0;
            C141526vi r6 = this.$requestType;
            C133076ge r82 = (C133076ge) r8;
            C162457s7.A0J(r82, 0);
            List<C109015dw> list = r82.A00.A02;
            ArrayList A0s = AnonymousClass001.A0s();
            for (C109015dw r12 : list) {
                C162457s7.A0H(r12);
                A0s.add(new C133136gk(r12));
            }
            obj2 = new C133226gt(A0s);
            obj3 = new C133216gs(A0s);
            int ordinal = r6.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw C73153f1.A00();
                }
            }
            AnonymousClass6CA.A0J(r4.A03).A0H(obj2);
            return C59022wD.A00;
        }
        if (r8 instanceof C133106gh) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = C133166gn.A00;
        } else if (C162457s7.A0P(r8, C133096gg.A00)) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = C133156gm.A00;
        } else {
            if (!C162457s7.A0P(r8, C133086gf.A00)) {
                if (!C162457s7.A0P(r8, C133116gi.A00)) {
                    C162457s7.A0P(r8, C133126gj.A00);
                    return C59022wD.A00;
                } else if (this.$requestType == C141526vi.START) {
                    r4 = this.this$0;
                    obj2 = C133246gv.A00;
                    AnonymousClass6CA.A0J(r4.A03).A0H(obj2);
                    return C59022wD.A00;
                }
            }
            r4 = this.this$0;
            obj2 = C133236gu.A00;
            AnonymousClass6CA.A0J(r4.A03).A0H(obj2);
            return C59022wD.A00;
        }
        obj2 = new C133186gp(r0);
        obj3 = new C133176go(r0);
        int ordinal2 = r1.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                throw C73153f1.A00();
            }
        }
        AnonymousClass6CA.A0J(r4.A03).A0H(obj2);
        return C59022wD.A00;
        obj2 = obj3;
        AnonymousClass6CA.A0J(r4.A03).A0H(obj2);
        return C59022wD.A00;
    }
}
