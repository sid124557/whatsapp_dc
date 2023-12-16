package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import java.util.List;

/* renamed from: X.9Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C191279Eh extends AnonymousClass95U {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09 = AnonymousClass001.A0s();

    public void A07(AnonymousClass9NZ r14, int i) {
        View r3;
        if (this instanceof AnonymousClass9EV) {
            AnonymousClass9FY r142 = (AnonymousClass9FY) r14;
            ImageView imageView = this.A03;
            View view = this.A0H;
            C1899593h.A0i(view.getContext(), imageView, R.color.f5nameremoved);
            String str = r142.A02;
            String str2 = r142.A01;
            View.OnClickListener onClickListener = r142.A00;
            this.A08 = str;
            this.A07 = str2;
            this.A00 = onClickListener;
            List list = this.A09;
            list.clear();
            LinearLayout linearLayout = this.A04;
            linearLayout.removeAllViews();
            list.addAll(r142.A03);
            A08();
            for (int i2 = 0; i2 < Math.min(list.size(), 2); i2++) {
                C624034w r9 = (C624034w) list.get(i2);
                int size = list.size();
                AnonymousClass94F r32 = new AnonymousClass94F(view.getContext());
                C626936e.A06(r9);
                long j = r9.A05;
                if (j > 0) {
                    r32.A01.setText(C107505bQ.A06(r32.A03, r32.A02.A0I(j)));
                }
                r32.A00.setText(r32.A04.A0R(r9));
                int i3 = size - 1;
                View findViewById = r32.findViewById(R.id.divider);
                int i4 = 8;
                if (i2 < i3) {
                    i4 = 0;
                }
                findViewById.setVisibility(i4);
                linearLayout.addView(r32);
            }
            return;
        }
        AnonymousClass9EW r7 = (AnonymousClass9EW) this;
        AnonymousClass9FB r143 = (AnonymousClass9FB) r14;
        r7.A00 = r143.A01;
        String str3 = r143.A04;
        if (str3 != null) {
            TextView textView = r7.A06;
            textView.setText(str3);
            textView.setVisibility(0);
        }
        ImageView imageView2 = r7.A03;
        View view2 = r7.A0H;
        C1899593h.A0i(view2.getContext(), imageView2, R.color.f5nameremoved);
        String str4 = r143.A03;
        String str5 = r143.A02;
        View.OnClickListener onClickListener2 = r143.A00;
        r7.A08 = str4;
        r7.A07 = str5;
        r7.A00 = onClickListener2;
        List list2 = r7.A09;
        list2.clear();
        LinearLayout linearLayout2 = r7.A04;
        linearLayout2.removeAllViews();
        list2.addAll(r143.A05);
        r7.A08();
        for (int i5 = 0; i5 < Math.min(list2.size(), 2); i5++) {
            C624034w r2 = (C624034w) list2.get(i5);
            int size2 = list2.size();
            if (r2.A03 != 1000 || !r2.A0P) {
                r3 = new AnonymousClass9G3(view2.getContext());
            } else {
                r3 = C18280x3.A0D(view2).inflate(R.layout.f8nameremoved, linearLayout2, false);
            }
            if (r3 instanceof AnonymousClass9G3) {
                AnonymousClass9G3 r1 = (AnonymousClass9G3) r3;
                r1.A0X = "mandate_payment_screen";
                r1.A0R = r7.A00;
                C626936e.A06(r2);
                r1.Axw(r2);
            } else if (r3 instanceof PaymentInteropShimmerRow) {
                C626936e.A06(r2);
                ((PaymentInteropShimmerRow) r3).Axw(r2);
            }
            int i6 = size2 - 1;
            View findViewById2 = r3.findViewById(R.id.divider);
            if (i5 < i6) {
                findViewById2.setVisibility(0);
            } else {
                findViewById2.setVisibility(8);
            }
            linearLayout2.addView(r3);
        }
    }

    public void A08() {
        ViewGroup viewGroup;
        View.OnClickListener onClickListener;
        List list = this.A09;
        int i = 0;
        if (list.size() > 2) {
            viewGroup = this.A01;
            viewGroup.setVisibility(0);
            this.A05.setText(this.A08);
            onClickListener = this.A00;
        } else {
            if (!list.isEmpty()) {
                i = 8;
                this.A01.setVisibility(8);
            } else if (this.A02.getChildCount() <= 0) {
                viewGroup = this.A01;
                viewGroup.setVisibility(0);
                this.A05.setText(this.A07);
                onClickListener = null;
            }
            this.A02.setVisibility(i);
            return;
        }
        viewGroup.setOnClickListener(onClickListener);
    }

    public C191279Eh(View view) {
        super(view);
        View view2 = this.A0H;
        this.A06 = C18300x5.A0G(view2, R.id.header);
        this.A01 = C86644Kx.A0I(view2, R.id.see_more_container);
        this.A03 = AnonymousClass0x9.A0E(view2, R.id.see_more_icon);
        this.A05 = C18300x5.A0G(view2, R.id.see_more_text);
        this.A02 = C86654Ky.A0L(view2, R.id.custom_empty_view_container);
        this.A04 = C86654Ky.A0N(view2, R.id.list_item_container);
    }
}
