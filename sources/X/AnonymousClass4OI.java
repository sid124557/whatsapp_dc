package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.support.faq.SearchFAQ;
import java.util.List;

/* renamed from: X.4OI  reason: invalid class name */
public class AnonymousClass4OI extends ArrayAdapter {
    public final /* synthetic */ SearchFAQ A00;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102235Hz r0;
        LinearLayout linearLayout;
        if (view == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            LayoutInflater A002 = C620633i.A00(getContext());
            C626936e.A06(A002);
            A002.inflate(R.layout.f8nameremoved, linearLayout2, true);
            r0 = new C102235Hz();
            r0.A01 = AnonymousClass002.A09(linearLayout2, R.id.search_faq_row_text);
            r0.A00 = linearLayout2.findViewById(R.id.divider);
            linearLayout2.setTag(r0);
            linearLayout = linearLayout2;
        } else {
            r0 = (C102235Hz) view.getTag();
            linearLayout = view;
        }
        Object item = getItem(i);
        C626936e.A06(item);
        AnonymousClass5JW r3 = (AnonymousClass5JW) item;
        r0.A01.setText(r3.A02);
        View view2 = r0.A00;
        int i2 = 8;
        if (i < getCount() - 1) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        C109495ei.A00(linearLayout, this, r3, 14);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OI(Context context, SearchFAQ searchFAQ, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A00 = searchFAQ;
    }
}
