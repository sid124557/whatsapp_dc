package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.92C  reason: invalid class name */
public class AnonymousClass92C implements C15830s0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass92C(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public AnonymousClass0XY BMX(View view, AnonymousClass0XY r5) {
        if (this.A02 != 0) {
            HomePlaceholderActivity.HomePlaceholderView.A00(view, (ViewGroup) this.A01, r5, (HomePlaceholderActivity.HomePlaceholderView) this.A00);
            return r5;
        }
        ((C181208mN) this.A01).BMY(view, r5, new C156617gv((C156617gv) this.A00));
        return r5;
    }
}
