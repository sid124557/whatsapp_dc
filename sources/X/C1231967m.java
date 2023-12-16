package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;

/* renamed from: X.67m  reason: invalid class name and case insensitive filesystem */
public class C1231967m extends AnonymousClass0P5 {
    public Object A00;
    public final int A01;

    public C1231967m(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(Drawable drawable) {
        switch (this.A01) {
            case 0:
                C103055Lj r0 = ((FingerprintView) this.A00).A00;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                return;
            case 1:
                return;
            default:
                ((StorageUsageDeleteCompleteDialogFragment) this.A00).A00.A0T(new C117635sF(this, 36), 500);
                return;
        }
    }
}
