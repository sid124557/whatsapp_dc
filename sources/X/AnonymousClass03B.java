package X;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: X.03B  reason: invalid class name */
public class AnonymousClass03B extends Filter {
    public AnonymousClass0u6 A00;

    public CharSequence convertResultToString(Object obj) {
        return this.A00.Azk((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor BkU = this.A00.BkU(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (BkU != null) {
            filterResults.count = BkU.getCount();
        } else {
            filterResults.count = 0;
            BkU = null;
        }
        filterResults.values = BkU;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AnonymousClass0u6 r2 = this.A00;
        Cursor cursor = ((AnonymousClass034) r2).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            r2.Ayj((Cursor) obj);
        }
    }

    public AnonymousClass03B(AnonymousClass0u6 r1) {
        this.A00 = r1;
    }
}
