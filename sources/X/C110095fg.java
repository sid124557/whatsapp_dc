package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.5fg  reason: invalid class name and case insensitive filesystem */
public class C110095fg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C91924lo A00;
    public final /* synthetic */ AnonymousClass5LP A01;
    public final /* synthetic */ boolean A02;

    public C110095fg(C91924lo r1, AnonymousClass5LP r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A01.A0F;
        AnonymousClass0x7.A16(selectionCheckView, this);
        selectionCheckView.A06(this.A02, true);
        return false;
    }
}
