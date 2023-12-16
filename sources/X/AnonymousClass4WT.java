package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.4WT  reason: invalid class name */
public final class AnonymousClass4WT extends AnonymousClass0R6 {
    public int A00 = -1;
    public final C114835ng A01;
    public final ArrayList A02;

    public AnonymousClass4WT(C114835ng r2, ArrayList arrayList) {
        C162457s7.A0J(r2, 2);
        this.A02 = arrayList;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new C125506Ih(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this);
    }

    public int A0G() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        int i2;
        C125506Ih r72 = (C125506Ih) r7;
        C162457s7.A0J(r72, 0);
        ArrayList arrayList = this.A02;
        int i3 = ((C148317Hx) arrayList.get(r72.A01())).A00;
        if (((C148317Hx) arrayList.get(r72.A01())).A01 && this.A00 == -1) {
            this.A00 = r72.A01();
        }
        View view = r72.A01;
        view.setTag(Integer.valueOf(i3));
        view.setOnClickListener(new C109725f5((Object) this, (Object) view, (Object) r72, 49));
        view.setSelected(AnonymousClass000.A1U(r72.A01(), this.A00));
        Context A0F = C18290x4.A0F(view);
        TextView textView = r72.A00;
        if (i3 == 2) {
            i2 = A0F.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        textView.setTypeface(AnonymousClass5BF.A00(A0F, i3));
        textView.setPadding(0, i2, i2, 0);
    }
}
