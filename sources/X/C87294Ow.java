package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.status.StatusesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ow  reason: invalid class name and case insensitive filesystem */
public class C87294Ow extends Filter {
    public final /* synthetic */ StatusesFragment A00;

    public C87294Ow(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(charSequence)) {
            StatusesFragment statusesFragment = this.A00;
            C623534r r6 = statusesFragment.A10.A00;
            C623534r r7 = r6;
            if (r6 == null) {
                r7 = new C623534r(statusesFragment.A0W, AnonymousClass1fY.A00, 0, 0, -1, -1, -1, -1, -1, 0);
            }
            A0s.add(new C115805pG(r7));
            if (r6 != null) {
                statusesFragment.A1E.get();
                if (statusesFragment.A0z.A02()) {
                    A0s.add(new C115815pH(statusesFragment));
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = C107155an.A03(this.A00.A0a, charSequence.toString());
        }
        StatusesFragment statusesFragment2 = this.A00;
        List A002 = A00(arrayList, statusesFragment2.A10.A02);
        List A003 = A00(arrayList, statusesFragment2.A10.A03);
        List A004 = A00(arrayList, statusesFragment2.A10.A01);
        if (!A002.isEmpty()) {
            A0s.add(new C115795pF(statusesFragment2, 0));
            A0s.addAll(A002);
        }
        if (!A003.isEmpty()) {
            A0s.add(new C115795pF(statusesFragment2, 1));
            A0s.addAll(A003);
        }
        filterResults.values = new C102175Ht(A0s, A004);
        filterResults.count = A0s.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        String charSequence2;
        Object obj = filterResults.values;
        if (obj != null) {
            C102175Ht r1 = (C102175Ht) obj;
            StatusesFragment statusesFragment = this.A00;
            statusesFragment.A1K = r1.A00;
            List list = r1.A01;
            statusesFragment.A1L = list;
            if (!list.isEmpty()) {
                statusesFragment.A1K.add(new C115795pF(statusesFragment, 2));
                if (!statusesFragment.A1Q || statusesFragment.A1O || !statusesFragment.A1N) {
                    statusesFragment.A1K.addAll(statusesFragment.A1L);
                }
            }
        }
        StatusesFragment statusesFragment2 = this.A00;
        statusesFragment2.A1I = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        statusesFragment2.A1J = C107155an.A03(statusesFragment2.A0a, charSequence2);
        statusesFragment2.A1M();
        AnimatorSet animatorSet = statusesFragment2.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
            statusesFragment2.A00 = null;
        }
        statusesFragment2.A0q.notifyDataSetChanged();
    }

    public List A00(ArrayList arrayList, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C623534r A19 = C86664Kz.A19(it);
            StatusesFragment statusesFragment = this.A00;
            if (AnonymousClass5ZU.A04(statusesFragment.A0O, statusesFragment.A0M.A0A(A19.A0A), arrayList)) {
                A0s.add(new C115805pG(A19));
            }
        }
        return A0s;
    }
}
