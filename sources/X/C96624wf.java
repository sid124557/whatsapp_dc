package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wf  reason: invalid class name and case insensitive filesystem */
public class C96624wf extends AnonymousClass6mM {
    public final ImageView A00;
    public final WaTextView A01;
    public final C44702Xd A02;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96354wE r5 = (C96354wE) obj;
        String str = r5.A02;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            C44702Xd r1 = this.A02;
            ImageView imageView = this.A00;
            r1.A00(imageView, str);
            imageView.setVisibility(0);
        } else {
            this.A00.setVisibility(8);
        }
        this.A01.setText(r5.A01);
        View view = this.A0H;
        view.setOnClickListener(r5.A00);
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (r5.A03) {
            i = C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        A0T.bottomMargin = i;
    }

    public C96624wf(View view, C44702Xd r3) {
        super(view);
        this.A02 = r3;
        this.A00 = AnonymousClass0x9.A0E(view, R.id.category_icon);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.category_name);
    }
}
