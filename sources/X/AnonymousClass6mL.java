package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6mL  reason: invalid class name */
public abstract class AnonymousClass6mL extends AnonymousClass6mM {
    public AnonymousClass4W2 A00;
    public final WaTextView A01;
    public final WaTextView A02;

    public void A0A(C135846lL r4) {
        String str;
        WaTextView waTextView;
        int i;
        if (this instanceof AnonymousClass6mK) {
            str = this.A0H.getContext().getString(R.string.f11nameremoved);
        } else if (this instanceof C136246mJ) {
            C136246mJ r1 = (C136246mJ) this;
            boolean A09 = r1.A01.A09();
            Context context = r1.A0H.getContext();
            int i2 = R.string.f11nameremoved;
            if (A09) {
                i2 = R.string.f11nameremoved;
            }
            str = C18290x4.A0l(context, i2);
        } else if (this instanceof AnonymousClass6mI) {
            str = C18290x4.A0l(this.A0H.getContext(), R.string.f11nameremoved);
        } else {
            C135826lJ r12 = (C135826lJ) r4;
            C162457s7.A0J(r12, 0);
            str = r12.A00;
        }
        if (str != null) {
            WaTextView waTextView2 = this.A02;
            waTextView2.setText(str);
            waTextView2.setOnClickListener(new C109375eW(r4, 5));
            waTextView = this.A01;
            i = 0;
        } else {
            waTextView = this.A01;
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(R.string.f11nameremoved);
        waTextView.setOnClickListener(new C109375eW(r4, 6));
        waTextView.setVisibility(0);
        AnonymousClass4W2 r13 = this.A00;
        r13.A00 = r4.A00;
        r13.A0L(r4.A01);
    }

    public void A07() {
        this.A00.A0L(AnonymousClass001.A0s());
    }

    public AnonymousClass6mL(ViewGroup viewGroup, AnonymousClass4W2 r5, int i) {
        super(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        View view = this.A0H;
        this.A02 = AnonymousClass0x7.A0L(view, R.id.title_view);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.action_label);
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view, R.id.recycler_view);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(i));
        this.A00 = r5;
        recyclerView.setAdapter(r5);
    }
}
