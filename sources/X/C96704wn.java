package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4wn  reason: invalid class name and case insensitive filesystem */
public class C96704wn extends AnonymousClass6mM {
    public final LinearLayout A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C136156lw r6 = (C136156lw) obj;
        int i = 0;
        if (r6.A03) {
            this.A02.setText(r6.A02);
            String str = r6.A01;
            boolean isEmpty = TextUtils.isEmpty(str);
            WaTextView waTextView = this.A03;
            if (isEmpty) {
                waTextView.setVisibility(8);
            } else {
                waTextView.setVisibility(0);
                waTextView.setText(str);
            }
            this.A00.setVisibility(0);
            this.A04.setVisibility(8);
        } else {
            WaTextView waTextView2 = this.A04;
            waTextView2.setText(r6.A02);
            this.A00.setVisibility(8);
            waTextView2.setVisibility(0);
        }
        WaImageView waImageView = this.A01;
        if (!r6.A04) {
            i = 8;
        }
        waImageView.setVisibility(i);
        C18300x5.A18(this.A0H, r6, 14);
        C18300x5.A18(waImageView, r6, 15);
    }

    public C96704wn(View view) {
        super(view);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.search_query);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.category_text);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.parent_category);
        this.A01 = AnonymousClass0x9.A0L(view, R.id.delete_button);
        this.A00 = C86654Ky.A0N(view, R.id.category_layout);
    }
}
