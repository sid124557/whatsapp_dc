package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;

/* renamed from: X.42Z  reason: invalid class name */
public final class AnonymousClass42Z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ContextualHelpBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42Z(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        super(1);
        this.this$0 = contextualHelpBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        ViewStub viewStub;
        View inflate;
        View findViewById;
        ViewStub viewStub2;
        ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = this.this$0;
        C162457s7.A0H(obj);
        if (C162457s7.A0P(obj, C27751ea.A00)) {
            View view2 = contextualHelpBkScreenFragment.A0B;
            if (!(view2 == null || (viewStub2 = (ViewStub) view2.findViewById(R.id.contextual_help_bloks_network_error_view)) == null)) {
                viewStub2.inflate();
            }
        } else if (!((!C162457s7.A0P(obj, AnonymousClass1eZ.A00) && !C162457s7.A0P(obj, C27761eb.A00)) || (view = contextualHelpBkScreenFragment.A0B) == null || (viewStub = (ViewStub) view.findViewById(R.id.contextual_help_fails_to_load_error_view)) == null || (inflate = viewStub.inflate()) == null || (findViewById = inflate.findViewById(R.id.get_help_in_browser)) == null)) {
            C635439q.A00(findViewById, contextualHelpBkScreenFragment, 36);
        }
        this.this$0.A1N((Exception) null);
        return C59022wD.A00;
    }
}
