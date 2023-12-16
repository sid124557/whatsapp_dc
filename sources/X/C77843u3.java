package X;

import androidx.core.widget.NestedScrollView;
import com.whatsapp.datasharingdisclosure.ui.DisclosureFragment;

/* renamed from: X.3u3  reason: invalid class name and case insensitive filesystem */
public final class C77843u3 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ DisclosureFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77843u3(DisclosureFragment disclosureFragment) {
        super(0);
        this.this$0 = disclosureFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        DisclosureFragment disclosureFragment = this.this$0;
        NestedScrollView nestedScrollView = disclosureFragment.A01;
        if (nestedScrollView != null) {
            nestedScrollView.requestLayout();
            nestedScrollView.invalidate();
            nestedScrollView.post(C69983Zk.A00(disclosureFragment, 36));
        }
        return C59022wD.A00;
    }
}
