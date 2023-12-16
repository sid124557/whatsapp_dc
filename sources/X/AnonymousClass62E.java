package X;

import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.62E  reason: invalid class name */
public final class AnonymousClass62E extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62E(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5UY r1;
        int i;
        C100495Bd r3 = (C100495Bd) obj;
        if (r3 instanceof C97534yf) {
            AnonymousClass675 r12 = this.this$0.A05;
            C162457s7.A0K(r12, "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesAdapter");
            C22711Pu r13 = (C22711Pu) r12;
            r13.A00 = ((C97534yf) r3).A00;
            r13.notifyDataSetChanged();
            r1 = (AnonymousClass5UY) this.this$0.A06.getValue();
            i = 8;
        } else {
            if (r3 instanceof C97524ye) {
                r1 = (AnonymousClass5UY) this.this$0.A06.getValue();
                i = 0;
            }
            this.this$0.A77();
            return C59022wD.A00;
        }
        r1.A06(i);
        this.this$0.A77();
        return C59022wD.A00;
    }
}
