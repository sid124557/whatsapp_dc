package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.7zc  reason: invalid class name and case insensitive filesystem */
public class C167007zc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass4OZ A00;
    public final /* synthetic */ AnonymousClass7MT A01;
    public final /* synthetic */ boolean A02;

    public C167007zc(AnonymousClass4OZ r1, AnonymousClass7MT r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public boolean onPreDraw() {
        AnonymousClass7MT r3 = this.A01;
        AnonymousClass0x7.A16(r3.A02, this);
        SelectionCheckView selectionCheckView = r3.A02;
        boolean z = this.A02;
        selectionCheckView.A06(z, true);
        this.A00.A00(r3.A02, z);
        return false;
    }
}
