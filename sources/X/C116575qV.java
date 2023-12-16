package X;

import android.view.View;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.5qV  reason: invalid class name and case insensitive filesystem */
public final class C116575qV implements C183388px {
    public final /* synthetic */ SupportVideoActivity A00;

    public C116575qV(SupportVideoActivity supportVideoActivity) {
        this.A00 = supportVideoActivity;
    }

    public void BfZ(int i) {
        SupportVideoActivity supportVideoActivity = this.A00;
        View A0Q = AnonymousClass001.A0Q(supportVideoActivity);
        if (i == 0) {
            A0Q.setSystemUiVisibility(0);
            AnonymousClass0R8 supportActionBar = supportVideoActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A07();
                return;
            }
            return;
        }
        A0Q.setSystemUiVisibility(4358);
        AnonymousClass0R8 supportActionBar2 = supportVideoActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A06();
        }
    }
}
