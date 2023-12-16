package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5wS  reason: invalid class name and case insensitive filesystem */
public final class C119115wS extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C91454jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119115wS(C91454jw r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C91454jw r4 = this.this$0;
        C29201iR r3 = r4.A00;
        if (r3 != null) {
            UserJid A74 = r4.A74();
            C91454jw r0 = this.this$0;
            C181798nL r1 = r0.A04;
            if (r1 != null) {
                return AnonymousClass4L0.A0F(new AnonymousClass80P(r3, r1.Azv(r0.A74()), A74), r4).A01(AnonymousClass6H0.class);
            }
            throw C18270x1.A0S("catalogListRepositoryFactory");
        }
        throw C18270x1.A0S("cartObservers");
    }
}
