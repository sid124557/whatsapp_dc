package X;

import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.41D  reason: invalid class name */
public final class AnonymousClass41D extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41D(BlockReasonListFragment blockReasonListFragment) {
        super(1);
        this.this$0 = blockReasonListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WDSButton wDSButton = this.this$0.A0C;
        if (wDSButton == null) {
            throw C18270x1.A0S("blockButton");
        }
        wDSButton.setEnabled(true);
        return C59022wD.A00;
    }
}
