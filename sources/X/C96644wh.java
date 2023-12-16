package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.4wh  reason: invalid class name and case insensitive filesystem */
public final class C96644wh extends AnonymousClass6mM {
    public final View A00;
    public final TextView A01;
    public final ChipGroup A02;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96394wI r7 = (C96394wI) obj;
        C162457s7.A0J(r7, 0);
        this.A01.setText(R.string.f11nameremoved);
        ChipGroup chipGroup = this.A02;
        chipGroup.removeAllViews();
        Iterator it = r7.A00.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            View A0R = AnonymousClass001.A0R(LayoutInflater.from(C18290x4.A0F(this.A00)), chipGroup, R.layout.f8nameremoved);
            C162457s7.A0K(A0R, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            TextView textView = (TextView) A0R;
            textView.setText(A0m);
            textView.setOnClickListener(new C109455ee(2, A0m, r7));
            chipGroup.addView(textView);
        }
    }

    public C96644wh(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ChipGroup) C18280x3.A0E(view, R.id.suggestion_chip_group);
        this.A01 = AnonymousClass0x2.A0I(view, R.id.title);
    }
}
