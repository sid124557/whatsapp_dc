package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.8zS  reason: invalid class name and case insensitive filesystem */
public class C188768zS extends AnonymousClass0WH {
    public Object A00;
    public Object A01;
    public final int A02;

    public C188768zS(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A0D(View view, C05650Ui r5) {
        switch (this.A02) {
            case 0:
                super.A0D(view, r5);
                r5.A07(new C06220Ws(16, (CharSequence) ((View) this.A01).getContext().getString(R.string.f11nameremoved)));
                return;
            case 1:
                super.A0D(view, r5);
                r5.A0H(false);
                r5.A01.setLongClickable(false);
                r5.A08(C06220Ws.A08);
                Context context = ((View) this.A00).getContext();
                boolean z = ((AnonymousClass4VH) this.A01).A01.A06;
                int i = R.string.f11nameremoved;
                if (z) {
                    i = R.string.f11nameremoved;
                }
                r5.A09(context.getString(i));
                return;
            default:
                super.A0D(view, r5);
                r5.A05((View) this.A01);
                return;
        }
    }
}
