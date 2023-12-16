package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.5ff  reason: invalid class name and case insensitive filesystem */
public class C110085ff implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass5LA A00;
    public final /* synthetic */ boolean A01;

    public C110085ff(AnonymousClass5LA r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A00.A08;
        AnonymousClass0x7.A16(selectionCheckView, this);
        selectionCheckView.A06(this.A01, true);
        return false;
    }
}
