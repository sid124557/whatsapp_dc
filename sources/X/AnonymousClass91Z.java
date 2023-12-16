package X;

import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.91Z  reason: invalid class name */
public class AnonymousClass91Z implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public AnonymousClass91Z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss() {
        AnonymousClass4VH r1;
        switch (this.A01) {
            case 0:
                ((AnonymousClass4GP) this.A00).invoke();
                return;
            case 1:
                AnonymousClass7UX r2 = (AnonymousClass7UX) this.A00;
                C148867Ka r0 = (C148867Ka) r2.A09.getValue();
                r0.A01.removeView((View) r0.A02.getValue());
                C147157Da r02 = r2.A01;
                if (r02 != null && (r1 = r02.A00.A03) != null) {
                    r1.A0H(false);
                    return;
                }
                return;
            default:
                ((TextStatusComposerActivity) this.A00).A0A.setImageResource(R.drawable.ic_emoji_solid);
                return;
        }
    }
}
