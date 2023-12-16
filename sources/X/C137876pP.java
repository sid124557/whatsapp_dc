package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6pP  reason: invalid class name and case insensitive filesystem */
public class C137876pP extends AnonymousClass8J3 {
    public final AnonymousClass33O A00;
    public final AnonymousClass4BP A01;
    public final AnonymousClass10k A02;

    public C137876pP(Context context, LayoutInflater layoutInflater, AnonymousClass1VX r9, AnonymousClass33O r10, AnonymousClass4BP r11, AnonymousClass10k r12, int i, int i2) {
        super(context, layoutInflater, r9, i, i2);
        this.A00 = r10;
        this.A01 = r11;
        this.A02 = r12;
    }

    public void A03(View view) {
        AnonymousClass08M r1 = this.A02.A03;
        if (r1.A07() != null && !((List) r1.A07()).isEmpty()) {
            C06560Yg.A02(view, R.id.empty).setVisibility(8);
            view.findViewById(R.id.empty_text).setVisibility(8);
        }
    }
}
