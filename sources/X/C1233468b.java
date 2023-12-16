package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.68b  reason: invalid class name and case insensitive filesystem */
public class C1233468b implements AnonymousClass65Z {
    public Object A00;
    public final int A01;

    public C1233468b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZy() {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((DialogFragment) obj).A1K();
                return;
            case 1:
                ((AnonymousClass4GP) obj).invoke();
                return;
            default:
                ((MediaViewBaseFragment) obj).A1O();
                return;
        }
    }
}
