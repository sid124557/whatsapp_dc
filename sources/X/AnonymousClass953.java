package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.List;

/* renamed from: X.953  reason: invalid class name */
public class AnonymousClass953 extends AnonymousClass0R6 {
    public final AnonymousClass9NQ A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A02;

    public AnonymousClass953(AnonymousClass9NQ r1, IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, List list) {
        this.A02 = indiaUpiBankAccountPickerActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r12, int i) {
        String str;
        Drawable drawable;
        C1902895d r122 = (C1902895d) r12;
        List list = this.A01;
        AnonymousClass9Q1 r4 = (AnonymousClass9Q1) list.get(i);
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A02;
        if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity.A0S)) {
            indiaUpiBankAccountPickerActivity.A0R.A01(indiaUpiBankAccountPickerActivity.getResources().getDrawable(R.drawable.bank_logo_placeholder_with_circle_bg), (Drawable) null, r122.A00, (C185158tB) null, indiaUpiBankAccountPickerActivity.A0S);
        } else {
            r122.A00.setImageResource(R.drawable.bank_logo_placeholder_with_circle_bg);
        }
        int size = list.size();
        RadioButton radioButton = r122.A01;
        if (size == 1) {
            radioButton.setVisibility(8);
        } else {
            radioButton.setVisibility(0);
        }
        TextView textView = r122.A03;
        boolean equals = "CREDIT".equals(r4.A02);
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = r4.A03;
        A0M[1] = r4.A04;
        if (equals) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        textView.setText(String.format(str, A0M));
        radioButton.setChecked(r4.A00);
        r122.A04.setText(r4.A05);
        boolean z = !r4.A06;
        View view = r122.A0H;
        if (z) {
            AnonymousClass0x2.A0q(view.getContext(), textView, AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            r122.A02.setText(r4.A01);
            radioButton.setEnabled(true);
        } else {
            AnonymousClass0x2.A0q(view.getContext(), textView, R.color.f5nameremoved);
            r122.A02.setText(R.string.f11nameremoved);
            radioButton.setEnabled(false);
        }
        if (indiaUpiBankAccountPickerActivity.A0X || !z) {
            drawable = null;
        } else {
            drawable = AnonymousClass0RP.A00(view.getContext(), R.drawable.selector_orange_gradient);
        }
        view.setBackground(drawable);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C1902895d(AnonymousClass001.A0R(this.A02.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), this.A00);
    }
}
