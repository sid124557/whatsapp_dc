package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8P1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8P1 implements AnonymousClass4C1 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C133306h7 A02;
    public final /* synthetic */ C620733j A03;
    public final /* synthetic */ AnonymousClass8P2 A04;

    public final Object get() {
        float left;
        C133306h7 r7 = this.A02;
        TextView textView = this.A01;
        C620733j r6 = this.A03;
        View view = this.A00;
        AnonymousClass8P2 r4 = this.A04;
        float left2 = (float) textView.getLeft();
        int dimensionPixelSize = r7.A03.getDimensionPixelSize(R.dimen.f6nameremoved);
        if (r6.A0U()) {
            left = ((((float) view.getRight()) - AnonymousClass8P2.A00(r7.A0A)) - ((float) dimensionPixelSize)) - AnonymousClass8P2.A00(r4);
        } else {
            left = ((float) view.getLeft()) + AnonymousClass8P2.A00(r7.A0A) + ((float) dimensionPixelSize);
        }
        return Float.valueOf(left - left2);
    }

    public /* synthetic */ AnonymousClass8P1(View view, TextView textView, C133306h7 r3, C620733j r4, AnonymousClass8P2 r5) {
        this.A02 = r3;
        this.A01 = textView;
        this.A03 = r4;
        this.A00 = view;
        this.A04 = r5;
    }
}
