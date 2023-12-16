package X;

import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.5wj  reason: invalid class name and case insensitive filesystem */
public final class C119285wj extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119285wj(CAGInfoFragment cAGInfoFragment) {
        super(0);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C004805c r3 = (C004805c) this.this$0.A0B.getValue();
        CAGInfoFragment cAGInfoFragment = this.this$0;
        AnonymousClass48D r2 = cAGInfoFragment.A05;
        if (r2 != null) {
            return C86624Kv.A0D(r3, ((C89684ei) this.this$0.A0B.getValue()).A00, r2, cAGInfoFragment.A0A.getValue());
        }
        throw C18270x1.A0S("participantsViewModelFactory");
    }
}
