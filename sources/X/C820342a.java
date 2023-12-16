package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;

/* renamed from: X.42a  reason: invalid class name and case insensitive filesystem */
public final class C820342a extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SupportBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C820342a(SupportBkScreenFragment supportBkScreenFragment) {
        super(1);
        this.this$0 = supportBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewStub viewStub;
        View inflate;
        ViewStub viewStub2;
        SupportBkScreenFragment supportBkScreenFragment = this.this$0;
        C162457s7.A0H(obj);
        if (C162457s7.A0P(obj, C27751ea.A00)) {
            View view = supportBkScreenFragment.A0B;
            if (!(view == null || (viewStub2 = (ViewStub) view.findViewById(R.id.support_bloks_network_error_view)) == null)) {
                viewStub2.inflate();
            }
        } else {
            if (!C162457s7.A0P(obj, AnonymousClass1eZ.A00)) {
                C162457s7.A0P(obj, C27761eb.A00);
            }
            View view2 = supportBkScreenFragment.A0B;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.support_bloks_fails_to_load_error_view)) == null || (inflate = viewStub.inflate()) == null)) {
                View findViewById = inflate.findViewById(R.id.contact_support);
                View findViewById2 = inflate.findViewById(R.id.get_help_in_browser);
                if (findViewById != null) {
                    C635439q.A00(findViewById, supportBkScreenFragment, 39);
                }
                if (findViewById2 != null) {
                    C635439q.A00(findViewById2, supportBkScreenFragment, 40);
                }
            }
        }
        this.this$0.A1N((Exception) null);
        return C59022wD.A00;
    }
}
