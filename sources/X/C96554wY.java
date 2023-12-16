package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4wY  reason: invalid class name and case insensitive filesystem */
public class C96554wY extends AnonymousClass6mM {
    public final WaImageView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C136006lh r6 = (C136006lh) obj;
        WaTextView waTextView = this.A01;
        View view = this.A0H;
        Context context = view.getContext();
        AnonymousClass5ZO r1 = r6.A00;
        waTextView.setText(C106445Za.A01(context, r1));
        WaImageView waImageView = this.A00;
        Context context2 = view.getContext();
        boolean equals = "device".equals(r1.A09);
        int i = R.drawable.business_directory_ic_location;
        if (equals) {
            i = R.drawable.ic_location_nearby;
        }
        C18290x4.A1A(context2, waImageView, i);
        view.setOnClickListener(r6.A01);
    }

    public C96554wY(View view) {
        super(view);
        this.A00 = AnonymousClass0x9.A0L(view, R.id.location_icon);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.search_location_address);
    }
}
