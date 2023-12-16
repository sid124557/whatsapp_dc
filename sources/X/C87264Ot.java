package X;

import android.widget.Filter;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ot  reason: invalid class name and case insensitive filesystem */
public final class C87264Ot extends Filter {
    public final /* synthetic */ C87204Ok A00;

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        C162457s7.A0J(charSequence, 0);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (C175728Zm.A0I(charSequence).length() > 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            String obj = charSequence.toString();
            C87204Ok r9 = this.A00;
            C620733j r8 = r9.A0A;
            ArrayList A03 = C107155an.A03(r8, obj);
            C162457s7.A0D(A03);
            String A07 = C107575bX.A07(charSequence);
            C162457s7.A0D(A07);
            String A072 = C107575bX.A07(r9.A0C.getString(R.string.f11nameremoved));
            C162457s7.A0D(A072);
            boolean A0S = C175728Zm.A0S(A07, A072, false);
            List list = r9.A0D;
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object next : list) {
                if (next instanceof C115005nx) {
                    A0s2.add(next);
                }
            }
            Iterator it = A0s2.iterator();
            while (it.hasNext()) {
                C115005nx r3 = (C115005nx) it.next();
                AnonymousClass3ZH r2 = r3.A00.A00;
                if (r9.A08.A0f(r2, A03, true) || C107155an.A05(r8, r2.A0b, A03, true) || A0S) {
                    A0s.add(r3);
                }
            }
            boolean isEmpty = A0s.isEmpty();
            arrayList = A0s;
            if (isEmpty) {
                A0s.add(0, new C115015ny(charSequence.toString()));
                arrayList = A0s;
            }
        } else {
            arrayList = this.A00.A0D;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Collection collection;
        C162457s7.A0J(filterResults, 1);
        Object obj = filterResults.values;
        if (!(obj instanceof List) || (collection = (Collection) obj) == null) {
            collection = this.A00.A0D;
        }
        C87204Ok r2 = this.A00;
        List list = r2.A0E;
        list.clear();
        list.addAll(collection);
        ArrayList A03 = C107155an.A03(r2.A0A, r2.A01);
        C162457s7.A0D(A03);
        r2.A02 = A03;
        r2.notifyDataSetChanged();
    }

    public C87264Ot(C87204Ok r1) {
        this.A00 = r1;
    }
}
