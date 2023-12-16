package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6pQ  reason: invalid class name and case insensitive filesystem */
public class C137886pQ extends AnonymousClass8J3 {
    public View A00;
    public List A01;
    public final int A02;
    public final AnonymousClass33O A03;
    public final AnonymousClass4BP A04;

    public C137886pQ(Context context, LayoutInflater layoutInflater, AnonymousClass1VX r9, AnonymousClass33O r10, AnonymousClass4BP r11, int i, int i2, int i3) {
        super(context, layoutInflater, r9, i2, i3);
        this.A04 = r11;
        this.A03 = r10;
        this.A02 = i;
    }

    public void A03(View view) {
        this.A00 = view.findViewById(R.id.empty);
    }

    public void BQv(View view, ViewGroup viewGroup, int i) {
        super.BQv(view, viewGroup, i);
        this.A00 = null;
    }
}
