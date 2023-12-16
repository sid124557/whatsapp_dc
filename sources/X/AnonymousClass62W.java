package X;

import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.62W  reason: invalid class name */
public final class AnonymousClass62W extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62W(UpdatesAdapter updatesAdapter) {
        super(1);
        this.this$0 = updatesAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Z6 r1;
        AnonymousClass588 r0;
        C987052x r4 = (C987052x) obj;
        C162457s7.A0J(r4, 0);
        AnonymousClass5T1 r2 = this.this$0.A0N;
        AnonymousClass5RK r12 = r4.A00;
        if (r12 instanceof C987953g) {
            r2.A00(1);
            r1 = r2.A04;
            r0 = AnonymousClass588.ARCHIVE;
        } else {
            if (r12 instanceof C988153i) {
                r1 = r2.A04;
                r0 = AnonymousClass588.UPDATES;
            }
            return C59022wD.A00;
        }
        r1.A02(r0);
        return C59022wD.A00;
    }
}
