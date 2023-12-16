package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6Io  reason: invalid class name and case insensitive filesystem */
public final class C125576Io extends C05570Ua {
    public final View.OnClickListener A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass4GQ A04;

    public C125576Io(View view, AnonymousClass4GQ r7) {
        super(view);
        this.A04 = r7;
        this.A03 = AnonymousClass002.A09(view, R.id.text_options_value);
        this.A02 = AnonymousClass002.A09(view, R.id.text_options_availability);
        this.A01 = view.findViewById(R.id.text_options_selection_mark);
        C109685f1 r4 = new C109685f1((Object) this, 38);
        this.A00 = r4;
        View view2 = this.A0H;
        C06560Yg.A0R(view2, C06220Ws.A08, (C15860s4) null, view.getResources().getString(R.string.f11nameremoved));
        view2.setOnClickListener(r4);
    }
}
