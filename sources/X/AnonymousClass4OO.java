package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4OO  reason: invalid class name */
public final class AnonymousClass4OO extends ArrayAdapter {
    public final Context A00;
    public final LayoutInflater A01;
    public final AnonymousClass64J A02;
    public final AnonymousClass5UX A03;
    public final C105365Uq A04;
    public final C620733j A05;
    public final AnonymousClass3LP A06;

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass64O r3;
        View view2 = view;
        AnonymousClass64P r2 = (AnonymousClass64P) getItem(i);
        if (r2 != null) {
            if (view == null) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    view2 = this.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
                    C86604Kt.A1F(view2, R.id.contactpicker_row_phone_type, 8);
                    Context context = this.A00;
                    AnonymousClass3LP r9 = this.A06;
                    r3 = new C112095jB(context, view2, this.A02, this.A04, this.A05, r9);
                } else if (itemViewType == 1) {
                    view2 = this.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
                    C86604Kt.A1F(view2, R.id.contactpicker_row_phone_type, 8);
                    r3 = new C112085jA(view2, this.A02, this.A03);
                } else if (itemViewType != 2) {
                    view2 = null;
                } else {
                    view2 = this.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
                    r3 = new C112075j9(view2);
                }
                view2.setTag(r3);
            } else {
                r3 = (AnonymousClass64O) view.getTag();
            }
            r3.BNe(r2);
            return view2;
        }
        return super.getView(i, view2, viewGroup);
    }

    public int getViewTypeCount() {
        return 3;
    }

    public AnonymousClass4OO(Context context, AnonymousClass64J r3, AnonymousClass5UX r4, C105365Uq r5, C620733j r6, AnonymousClass3LP r7, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A00 = context;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = LayoutInflater.from(context);
    }

    public int getItemViewType(int i) {
        AnonymousClass64P r0 = (AnonymousClass64P) getItem(i);
        if (r0 == null) {
            return super.getItemViewType(i);
        }
        return r0.B8l();
    }
}
