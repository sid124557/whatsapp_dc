package X;

import android.widget.Filter;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4Ou  reason: invalid class name and case insensitive filesystem */
public class C87274Ou extends Filter {
    public int A00 = 0;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C87274Ou(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Comparator r2;
        if (charSequence != null) {
            arrayList = C107155an.A03(this.A01.A0I, charSequence.toString());
        } else {
            arrayList = null;
        }
        int i = this.A00;
        DocumentPickerActivity documentPickerActivity = this.A01;
        int i2 = documentPickerActivity.A00;
        if (i != i2) {
            this.A00 = i2;
            C620733j r1 = documentPickerActivity.A0I;
            List list = documentPickerActivity.A0T;
            if (i2 == 0) {
                Collator A0w = C86614Ku.A0w(r1);
                A0w.setDecomposition(1);
                r2 = new AnonymousClass6A5(A0w, 5);
            } else if (i2 == 1) {
                r2 = new AnonymousClass6A6(1);
            }
            Collections.sort(list, r2);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList2 = documentPickerActivity.A0T;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass5QG r3 : documentPickerActivity.A0T) {
                if (C107155an.A05(documentPickerActivity.A0I, r3.A03, arrayList, true)) {
                    A0s.add(r3);
                }
            }
            arrayList2 = A0s;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList2;
        filterResults.count = arrayList2.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            this.A01.A0U = (ArrayList) filterResults.values;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0J.notifyDataSetChanged();
        documentPickerActivity.A78();
    }
}
