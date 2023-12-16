package X;

import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.5wi  reason: invalid class name and case insensitive filesystem */
public final class C119275wi extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119275wi(CAGInfoFragment cAGInfoFragment) {
        super(0);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C004805c r3 = (C004805c) this.this$0.A0B.getValue();
        CAGInfoFragment cAGInfoFragment = this.this$0;
        C1223363z r2 = cAGInfoFragment.A06;
        if (r2 != null) {
            Object value = cAGInfoFragment.A0A.getValue();
            C162457s7.A0J(value, 1);
            return C124086Ax.A00(r3, value, r2, 10).A01(C22411Nc.class);
        }
        throw C18270x1.A0S("groupChatInfoViewModelFactory");
    }
}
