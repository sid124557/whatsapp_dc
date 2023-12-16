package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54d  reason: invalid class name and case insensitive filesystem */
public class C990254d extends AnonymousClass5ZM {
    public final ArrayList A00;
    public final List A01;
    public final /* synthetic */ C89104bW A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C990254d(C89104bW r2, List list, List list2) {
        super(r2, true);
        ArrayList arrayList;
        this.A02 = r2;
        if (list != null) {
            arrayList = AnonymousClass002.A0J(list);
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        this.A01 = list2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String A0F;
        C89104bW r5 = this.A02;
        r5.A04 = null;
        AnonymousClass4OZ r2 = r5.A0O;
        r2.A00 = (List) obj;
        r2.notifyDataSetChanged();
        View findViewById = r5.findViewById(16908292);
        if (r2.isEmpty()) {
            findViewById.setVisibility(0);
            if (TextUtils.isEmpty(r5.A0I)) {
                A0F = r5.getString(R.string.f11nameremoved);
            } else {
                A0F = AnonymousClass002.A0F(r5, r5.A0I, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            }
            TextView A0L = C18310x6.A0L(r5, R.id.search_no_matches);
            A0L.setText(A0F);
            A0L.setVisibility(0);
            findViewById = r5.findViewById(R.id.init_contacts_progress);
        }
        findViewById.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (AnonymousClass5ZU.A04(this.A02.A0C, A0R, this.A00)) {
                A0s.add(A0R);
            }
        }
        return A0s;
    }
}
