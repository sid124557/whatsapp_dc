package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Arrays;

/* renamed from: X.4wo  reason: invalid class name and case insensitive filesystem */
public final class C96714wo extends AnonymousClass6mM {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final C620733j A05;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        int i;
        C96404wJ r8 = (C96404wJ) obj;
        C162457s7.A0J(r8, 0);
        TextView textView = this.A04;
        textView.setText(r8.A01);
        Integer num = r8.A00;
        if (num == null || num.intValue() == 0) {
            this.A03.setVisibility(8);
        } else {
            TextView textView2 = this.A03;
            textView2.setVisibility(0);
            textView2.setText(C86654Ky.A0n(C620733j.A02(this.A05), "%,d", Arrays.copyOf(new Object[]{num}, 1)));
        }
        r8.A04.invoke(this.A02, r8.A02);
        C18290x4.A1H(this.A00, r8, 19);
        boolean A002 = C102805Ki.A00(this.A05);
        ImageView imageView = this.A01;
        if (A002) {
            imageView.setScaleX(-1.0f);
            i = 5;
        } else {
            imageView.setScaleY(1.0f);
            i = 3;
        }
        textView.setGravity(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96714wo(View view, C620733j r3) {
        super(view);
        C18260x0.A0Q(view, r3);
        this.A00 = view;
        this.A05 = r3;
        this.A02 = C86604Kt.A0J(view, R.id.category_icon);
        this.A04 = AnonymousClass0x2.A0I(view, R.id.category_name);
        this.A03 = AnonymousClass0x2.A0I(view, R.id.biz_number);
        this.A01 = C86604Kt.A0J(view, R.id.chevron_category_row);
    }
}
