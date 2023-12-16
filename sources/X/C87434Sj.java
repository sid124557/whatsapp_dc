package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.whatsapp.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4Sj  reason: invalid class name and case insensitive filesystem */
public class C87434Sj extends C05430Th {
    public AnonymousClass5YA A00;
    public C104745Se A01;

    public C87434Sj(Context context, View view, C624134x r14, C109665ez r15, C109665ez r16, C109665ez r17, AnonymousClass5YA r18, C104745Se r19) {
        super(context, view, 0, R.attr.f3nameremoved, 0);
        this.A01 = r19;
        this.A00 = r18;
        C07890cz r3 = this.A04;
        LinkedList A18 = AnonymousClass0x9.A18();
        C18320x8.A1F(Integer.valueOf(R.id.menuitem_delete), context.getString(R.string.f11nameremoved), A18);
        C18320x8.A1F(Integer.valueOf(R.id.menuitem_forward), context.getString(R.string.f11nameremoved), A18);
        C104745Se r1 = this.A01;
        if (r1.A00() && !r1.A02() && AnonymousClass5O0.A00(this.A00, Collections.singletonList(r14), 3)) {
            C18320x8.A1F(Integer.valueOf(R.id.menuitem_share_status_facebook), context.getString(R.string.f11nameremoved), A18);
        }
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.first;
            C626936e.A06(obj);
            Object obj2 = pair.second;
            C626936e.A06(obj2);
            r3.add(0, ((Number) obj).intValue(), 0, (CharSequence) (String) obj2);
        }
        this.A01 = new C110385g9(r16, r17, r15);
    }
}
