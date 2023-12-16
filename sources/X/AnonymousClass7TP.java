package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.7TP  reason: invalid class name */
public class AnonymousClass7TP {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C172668Mf(this, 33);
    public final /* synthetic */ BottomSheetBehavior A03;

    public AnonymousClass7TP(BottomSheetBehavior bottomSheetBehavior) {
        this.A03 = bottomSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0X;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                AnonymousClass0YY.A07(C86664Kz.A0j(weakReference), this.A02);
                this.A01 = true;
            }
        }
    }
}
