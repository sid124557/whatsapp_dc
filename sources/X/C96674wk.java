package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4wk  reason: invalid class name and case insensitive filesystem */
public class C96674wk extends AnonymousClass6mM {
    public final TextView A00;
    public final TextView A01;
    public final WaImageView A02;
    public final WaImageView A03;
    public final C44702Xd A04;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96374wG r6 = (C96374wG) obj;
        String str = r6.A02;
        if (!TextUtils.isEmpty(str)) {
            this.A04.A00(this.A03, str);
        } else {
            this.A03.setImageResource(R.drawable.ic_action_search);
        }
        this.A00.setText(r6.A01);
        String str2 = r6.A03;
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i = 0;
        TextView textView = this.A01;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(str2);
        } else {
            textView.setVisibility(8);
        }
        WaImageView waImageView = this.A02;
        if (!r6.A04) {
            i = 8;
        }
        waImageView.setVisibility(i);
        this.A0H.setOnClickListener(r6.A00);
    }

    public C96674wk(View view, C44702Xd r3) {
        super(view);
        this.A04 = r3;
        this.A00 = C18300x5.A0G(view, R.id.category_text);
        this.A01 = C18300x5.A0G(view, R.id.parent_category);
        this.A03 = AnonymousClass0x9.A0L(view, R.id.search_icon);
        this.A02 = AnonymousClass0x9.A0L(view, R.id.nav_root);
    }
}
