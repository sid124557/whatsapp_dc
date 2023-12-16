package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.425  reason: invalid class name */
public final class AnonymousClass425 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass425(ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer) {
        super(1);
        this.this$0 = extensionsBottomsheetBaseContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View findViewById;
        int i;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        this.this$0.A13(!A1Z);
        this.this$0.A0R().invalidateOptionsMenu();
        Toolbar toolbar = this.this$0.A03;
        if (A1Z) {
            if (!(toolbar == null || (findViewById = toolbar.findViewById(R.id.bk_toolbar_loading)) == null)) {
                i = 0;
            }
            return C59022wD.A00;
        }
        if (!(toolbar == null || (findViewById = toolbar.findViewById(R.id.bk_toolbar_loading)) == null)) {
            i = 8;
        }
        return C59022wD.A00;
        findViewById.setVisibility(i);
        return C59022wD.A00;
    }
}
