package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4wj  reason: invalid class name and case insensitive filesystem */
public class C96664wj extends AnonymousClass6mM {
    public final FrameLayout A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final C105355Up A03;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96344wD r6 = (C96344wD) obj;
        View view = this.A0H;
        Context context = view.getContext();
        this.A02.setText(r6.A02);
        this.A00.setBackground((Drawable) null);
        C107335b8.A0C(context, this.A01, r6.A00, R.color.f5nameremoved);
        view.setOnClickListener(r6.A01);
    }

    public C96664wj(View view, C105355Up r3) {
        super(view);
        this.A03 = r3;
        this.A02 = AnonymousClass0x7.A0L(view, R.id.category_name);
        this.A01 = AnonymousClass0x9.A0L(view, R.id.category_icon);
        this.A00 = C86654Ky.A0L(view, R.id.category_layout);
    }
}
