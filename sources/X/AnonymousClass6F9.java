package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.6F9  reason: invalid class name */
public final class AnonymousClass6F9 extends BaseAdapter {
    public Long A00;
    public final Context A01;
    public final C620733j A02;
    public final List A03;

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public long getItemId(int i) {
        return ((AnonymousClass7ZI) this.A03.get(i)).A01;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        Drawable drawable;
        Drawable drawable2;
        AnonymousClass3Z6 A022;
        AnonymousClass7ZI r3 = (AnonymousClass7ZI) this.A03.get(i);
        Object obj = null;
        if (view instanceof WaTextView) {
            textView = (TextView) view;
            if (textView != null) {
                obj = textView.getTag();
            }
        } else {
            textView = null;
        }
        C141536vj r4 = r3.A02;
        if (obj != r4) {
            Context context = this.A01;
            C141536vj r0 = C141536vj.TITLE;
            int i2 = R.style.f12nameremoved;
            if (r4 == r0) {
                i2 = R.style.f12nameremoved;
            }
            textView = new WaTextView(new ContextThemeWrapper(context, i2));
            textView.setTag(r4);
        }
        C162457s7.A0J(textView, 0);
        Integer num = r3.A03;
        if (num == null || (drawable = AnonymousClass0RP.A00(this.A01, num.intValue())) == null) {
            drawable = null;
        } else {
            drawable.mutate().setTint(textView.getCurrentTextColor());
        }
        long j = r3.A01;
        Long l = this.A00;
        if (l == null || j != l.longValue() || (drawable2 = AnonymousClass0RP.A00(this.A01, R.drawable.ic_checkmark_selected_wds)) == null) {
            drawable2 = null;
        } else {
            drawable2.mutate().setTint(textView.getCurrentTextColor());
        }
        if (this.A02.A0T()) {
            A022 = AnonymousClass3Z6.A02(drawable, drawable2);
        } else {
            A022 = AnonymousClass3Z6.A02(drawable2, drawable);
        }
        textView.setText(r3.A00);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) A022.first, (Drawable) null, (Drawable) A022.second, (Drawable) null);
        textView.setCompoundDrawablePadding(C18290x4.A0G(textView).getDimensionPixelSize(R.dimen.f6nameremoved));
        return textView;
    }

    public AnonymousClass6F9(Context context, C620733j r2, List list) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = list;
    }
}
