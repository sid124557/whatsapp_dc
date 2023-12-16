package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94A  reason: invalid class name */
public class AnonymousClass94A extends BaseAdapter {
    public final Context A00;
    public final AnonymousClass9FP A01;

    public int getCount() {
        return this.A01.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C193729Pt r5 = (C193729Pt) this.A01.A00.get(i);
        ImageView A0E = AnonymousClass0x9.A0E(inflate, R.id.status_icon);
        A0E.setColorFilter(context.getResources().getColor(r5.A00), PorterDuff.Mode.SRC_IN);
        A0E.setImageResource(r5.A01);
        TextView A0G = C18300x5.A0G(inflate, R.id.transaction_status);
        A0G.setText(r5.A05);
        int i2 = r5.A03;
        if (i2 == R.color.f5nameremoved) {
            i2 = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        C18320x8.A11(context.getResources(), A0G, i2);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.status_subtitle);
        A0G2.setText(r5.A04);
        C18320x8.A11(context.getResources(), A0G2, r5.A02);
        View A02 = C06560Yg.A02(inflate, R.id.line);
        if (i == getCount() - 1) {
            A02.setVisibility(8);
        }
        return inflate;
    }

    public AnonymousClass94A(Context context, AnonymousClass9FP r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
