package X;

import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.7TQ  reason: invalid class name */
public class AnonymousClass7TQ {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C172668Mf(this, 35);
    public final /* synthetic */ SideSheetBehavior A03;

    public AnonymousClass7TQ(SideSheetBehavior sideSheetBehavior) {
        this.A03 = sideSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0E;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                AnonymousClass0YY.A07(C86664Kz.A0j(weakReference), this.A02);
                this.A01 = true;
            }
        }
    }
}
