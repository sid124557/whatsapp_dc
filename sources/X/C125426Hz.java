package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.6Hz  reason: invalid class name and case insensitive filesystem */
public final class C125426Hz extends AnonymousClass0O5 {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public final /* synthetic */ C158927km A03;

    public C125426Hz(Context context, C158927km r4) {
        this.A03 = r4;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.A01 + i2;
        this.A01 = i3;
        this.A03.A08.setAlpha(Math.min(1.0f, ((float) i3) / ((float) this.A00)));
    }

    public void A05(RecyclerView recyclerView, int i) {
        AnonymousClass7XM r0;
        int i2 = this.A02;
        if (!(i2 != 0 || i == i2 || (r0 = this.A03.A0N) == null)) {
            r0.A0A.clearFocus();
        }
        this.A02 = i;
    }
}
