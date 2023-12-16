package X;

import android.content.Intent;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;

/* renamed from: X.43Z  reason: invalid class name */
public final class AnonymousClass43Z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ boolean $shouldLaunchHomeActivityPostBlock;
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43Z(BlockReasonListFragment blockReasonListFragment, boolean z) {
        super(1);
        this.this$0 = blockReasonListFragment;
        this.$shouldLaunchHomeActivityPostBlock = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A0R().setResult(-1);
        if (this.$shouldLaunchHomeActivityPostBlock) {
            BlockReasonListFragment blockReasonListFragment = this.this$0;
            Intent A00 = C627736r.A00(blockReasonListFragment.A1D());
            C162457s7.A0D(A00);
            blockReasonListFragment.A0m(A00);
        }
        C18310x6.A1A(this.this$0);
        return C59022wD.A00;
    }
}
