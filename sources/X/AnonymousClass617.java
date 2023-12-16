package X;

import com.whatsapp.R;

/* renamed from: X.617  reason: invalid class name */
public final class AnonymousClass617 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92284mO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass617(C92284mO r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0e;
        int i;
        C92284mO r2 = this.this$0;
        AnonymousClass21F r1 = ((C104605Rq) obj).A01;
        if (r2.A04) {
            r2.A04 = false;
        } else {
            int ordinal = r1.ordinal();
            if (ordinal == 2) {
                A0e = C18300x5.A0e(r2.A01, C104595Rp.A00(r2.A0A).A0H, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
                i = 1;
            } else if (ordinal == 0) {
                A0e = C18290x4.A0l(r2.A01, R.string.f11nameremoved);
                i = 2;
            } else if (ordinal == 1) {
                A0e = C18290x4.A0l(r2.A01, R.string.f11nameremoved);
                i = 3;
            }
            AnonymousClass5AQ r12 = new AnonymousClass5AQ(r2, i);
            C009707r r6 = r2.A01;
            String A0l = C18290x4.A0l(r6, R.string.f11nameremoved);
            C109345eT r3 = new C109345eT(r12, 5);
            if (r6.A06.A02 != AnonymousClass0GC.DESTROYED) {
                C88694ab A02 = C88694ab.A02(r6.findViewById(16908298), A0e, 0);
                A02.A0F(A0l, r3);
                A02.A0D(C18300x5.A03(r6, R.attr.f3nameremoved, R.color.f5nameremoved));
                C110065fd r5 = new C110065fd(r6, A02, r2.A05, AnonymousClass8UF.A0p(r6.findViewById(R.id.next_important_message), r6.findViewById(R.id.scroll_bottom)), false);
                r5.A05(C117085rM.A00(r2, 20));
                r5.A01();
                r2.A02 = r5;
            }
        }
        return C59022wD.A00;
    }
}
