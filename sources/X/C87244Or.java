package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Or  reason: invalid class name and case insensitive filesystem */
public class C87244Or extends Filter {
    public final /* synthetic */ C87214Ol A00;

    public C87244Or(C87214Ol r1) {
        this.A00 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList A0s = AnonymousClass001.A0s();
            String charSequence2 = charSequence.toString();
            C87214Ol r2 = this.A00;
            GroupChatInfoActivity groupChatInfoActivity = r2.A07;
            ArrayList A03 = C107155an.A03(groupChatInfoActivity.A11, charSequence2);
            boolean contains = C107575bX.A07(charSequence).contains(C107575bX.A07(groupChatInfoActivity.getString(R.string.f11nameremoved)));
            for (AnonymousClass65F r5 : r2.A02) {
                if (r5 instanceof C114535nC) {
                    AnonymousClass3ZH r8 = ((C114535nC) r5).A00;
                    if (!groupChatInfoActivity.A0t.A0f(r8, A03, true)) {
                        if (!C107155an.A05(groupChatInfoActivity.A11, r8.A0b, A03, true)) {
                            if (contains) {
                                if (!groupChatInfoActivity.A0O.A0I(groupChatInfoActivity.A1h, C86604Kt.A0d(r8))) {
                                }
                            }
                        }
                    }
                    A0s.add(r5);
                }
            }
            boolean isEmpty = A0s.isEmpty();
            arrayList = A0s;
            if (isEmpty) {
                A0s.add(0, new C114545nD(charSequence.toString()));
                arrayList = A0s;
            }
        } else {
            arrayList = this.A00.A02;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        Object obj = filterResults.values;
        if (obj == null) {
            list = this.A00.A02;
        } else {
            list = (ArrayList) obj;
        }
        this.A00.A01(list);
    }
}
