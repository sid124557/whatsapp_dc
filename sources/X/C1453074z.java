package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.74z  reason: invalid class name and case insensitive filesystem */
public class C1453074z implements C15860s4 {
    public int A00;
    public Object A01;
    public final int A02;

    public C1453074z(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public boolean Bgj(View view, AnonymousClass0KQ r7) {
        if (this.A02 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A01;
            int i = this.A00;
            WeakReference weakReference = sideSheetBehavior.A0E;
            if (weakReference == null || weakReference.get() == null) {
                sideSheetBehavior.A0L(i);
                return true;
            }
            View A0j = C86664Kz.A0j(weakReference);
            C117705sM r1 = new C117705sM((Object) sideSheetBehavior, i, 5);
            ViewParent parent = A0j.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C06360Xi.A04(A0j)) {
                r1.run();
                return true;
            }
            A0j.post(r1);
            return true;
        }
        ((BottomSheetBehavior) this.A01).A0S(this.A00);
        return true;
    }
}
