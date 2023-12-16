package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6JB  reason: invalid class name */
public class AnonymousClass6JB extends AnonymousClass063 {
    public final /* synthetic */ AnonymousClass6J9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6JB(RecyclerView recyclerView, AnonymousClass6J9 r2) {
        super(recyclerView);
        this.A00 = r2;
    }

    public void A0D(View view, C05650Ui r4) {
        AnonymousClass0WH r0 = this.A00.A00;
        if (r0 != null) {
            r0.A0D(view, r4);
        }
        r4.A08(C06220Ws.A0d);
        r4.A08(C06220Ws.A0Y);
        r4.A08(C06220Ws.A0a);
        r4.A08(C06220Ws.A0b);
        r4.A08(C06220Ws.A0Z);
        r4.A08(C06220Ws.A0X);
        r4.A01.setScrollable(false);
    }
}
