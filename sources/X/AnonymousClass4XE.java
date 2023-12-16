package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4XE  reason: invalid class name */
public final class AnonymousClass4XE extends AnonymousClass0R6 implements Filterable {
    public List A00;
    public final List A01;
    public final AnonymousClass4GQ A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass6IX(C18300x5.A0F(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved));
    }

    public Filter getFilter() {
        return new AnonymousClass67V(this, 1);
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        AnonymousClass6IX r32 = (AnonymousClass6IX) r3;
        C162457s7.A0J(r32, 0);
        r32.A01.setText(((C149077Kv) this.A00.get(i)).A02);
        r32.A00.setText(((C149077Kv) this.A00.get(i)).A01);
        C109695f2.A00(r32.A0H, this, i, 11);
    }

    public AnonymousClass4XE(List list, AnonymousClass4GQ r3) {
        this.A01 = list;
        this.A02 = r3;
        this.A00 = AnonymousClass002.A0J(list);
    }
}
