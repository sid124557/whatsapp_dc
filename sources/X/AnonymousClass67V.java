package X;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.67V  reason: invalid class name */
public class AnonymousClass67V extends Filter {
    public Object A00;
    public final int A01;

    public AnonymousClass67V(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A0s;
        if (this.A01 != 0) {
            AnonymousClass4XE r6 = (AnonymousClass4XE) this.A00;
            if (AnonymousClass2AB.A00(String.valueOf(charSequence)).length() == 0) {
                A0s = C86624Kv.A0d(r6.A01);
            } else {
                A0s = AnonymousClass001.A0s();
                String A002 = AnonymousClass2AB.A00(String.valueOf(charSequence));
                Locale locale = Locale.ROOT;
                String A0g = C18320x8.A0g(locale, A002);
                List list = r6.A01;
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (Object next : list) {
                    C149077Kv r3 = (C149077Kv) next;
                    if (C175728Zm.A0S(C18320x8.A0g(locale, r3.A01), A0g, false) || C175728Zm.A0S(C18320x8.A0g(locale, r3.A02), A0g, false)) {
                        A0s2.add(next);
                    }
                }
                Iterator it = A0s2.iterator();
                while (it.hasNext()) {
                    A0s.add(it.next());
                }
            }
            r6.A00 = A0s;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = r6.A00;
            return filterResults;
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        if (TextUtils.isEmpty(charSequence)) {
            A0s3.addAll(((AnonymousClass4WG) this.A00).A02);
        } else {
            String trim = charSequence.toString().toLowerCase(Locale.ROOT).trim();
            for (C148977Kl r2 : ((AnonymousClass4WG) this.A00).A02) {
                if (r2.A01.toLowerCase(Locale.ROOT).contains(trim)) {
                    A0s3.add(r2);
                }
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = A0s3;
        return filterResults2;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (this.A01 != 0) {
            if (filterResults != null && filterResults.count > 0) {
                Object obj = filterResults.values;
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.whatsapp.inappbugreporting.data.BugCategoryFactory.BugCategory>");
                List A012 = AnonymousClass360.A01(obj);
                C162457s7.A0J(A012, 0);
                ((AnonymousClass4XE) this.A00).A00 = A012;
            }
            ((AnonymousClass0R6) this.A00).A05();
        } else if (filterResults != null) {
            AnonymousClass4WG r1 = (AnonymousClass4WG) this.A00;
            List list = (List) filterResults.values;
            r1.A01 = list;
            r1.A0L(list);
        }
    }
}
