package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4WI  reason: invalid class name */
public final class AnonymousClass4WI extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass6I9(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        int i2;
        int i3;
        AnonymousClass6I9 r82 = (AnonymousClass6I9) r8;
        C162457s7.A0J(r82, 0);
        TextView textView = r82.A00;
        List list = this.A00;
        textView.setText(((C108835dd) list.get(i)).A02);
        float applyDimension = TypedValue.applyDimension(1, 24.0f, C86614Ku.A0E(textView));
        if (((C108835dd) list.get(i)).A04) {
            i2 = R.drawable.ic_check;
            i3 = AnonymousClass5Yj.A00(textView.getContext());
        } else {
            i2 = R.drawable.ic_spam_block;
            i3 = R.color.f5nameremoved;
        }
        Drawable A0G = C18310x6.A0G(textView.getContext(), i2);
        C162457s7.A0D(A0G);
        int i4 = (int) applyDimension;
        A0G.setBounds(0, 0, i4, i4);
        textView.setCompoundDrawables(A0G, (Drawable) null, (Drawable) null, (Drawable) null);
        AnonymousClass0Y9.A01(ColorStateList.valueOf(C86624Kv.A02(textView, i3)), textView);
    }
}
