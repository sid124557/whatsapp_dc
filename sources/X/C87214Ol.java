package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Ol  reason: invalid class name and case insensitive filesystem */
public class C87214Ol extends BaseAdapter implements Filterable {
    public String A00;
    public ArrayList A01;
    public List A02 = AnonymousClass001.A0s();
    public List A03 = AnonymousClass001.A0s();
    public final Filter A04 = new C87244Or(this);
    public final AnonymousClass5GI A05;
    public final Map A06 = AnonymousClass001.A0t();
    public final /* synthetic */ GroupChatInfoActivity A07;

    public C87214Ol(AnonymousClass5GI r2, GroupChatInfoActivity groupChatInfoActivity) {
        this.A07 = groupChatInfoActivity;
        this.A05 = r2;
    }

    public void A00(List list) {
        GroupChatInfoActivity groupChatInfoActivity = this.A07;
        if (AnonymousClass4SG.A4A(groupChatInfoActivity) || groupChatInfoActivity.A0P.A00(groupChatInfoActivity.A19)) {
            list = Collections.emptyList();
        }
        this.A02 = list;
        String str = this.A00;
        this.A00 = str;
        if (TextUtils.isEmpty(str)) {
            A01(this.A02);
        } else {
            getFilter().filter(str);
        }
    }

    public final void A01(List list) {
        GroupChatInfoActivity groupChatInfoActivity = this.A07;
        if (groupChatInfoActivity.A1T.A02(groupChatInfoActivity.A19) == 1) {
            this.A03 = Collections.emptyList();
        } else {
            this.A03 = list;
            this.A01 = C107155an.A03(groupChatInfoActivity.A11, this.A00);
        }
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        return this.A03.size();
    }

    public Filter getFilter() {
        return this.A04;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.get(i);
        if (obj instanceof C114535nC) {
            return 0;
        }
        if ((obj instanceof C114525nB) || (obj instanceof C114515nA)) {
            return 1;
        }
        if (obj instanceof C114545nD) {
            return 2;
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5OF r2;
        UserJid A032;
        Object r1;
        AnonymousClass65F r3 = (AnonymousClass65F) this.A03.get(i);
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                GroupChatInfoActivity groupChatInfoActivity = this.A07;
                view = groupChatInfoActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
                r1 = new C95644u1(view, this.A05, groupChatInfoActivity);
            } else if (itemViewType == 1) {
                GroupChatInfoActivity groupChatInfoActivity2 = this.A07;
                view = groupChatInfoActivity2.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
                r1 = new C95624tz(view, groupChatInfoActivity2);
            } else if (itemViewType == 2) {
                GroupChatInfoActivity groupChatInfoActivity3 = this.A07;
                view = groupChatInfoActivity3.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
                r1 = new C95634u0(view, groupChatInfoActivity3);
            } else {
                throw C86604Kt.A0h("Unknown type: ", AnonymousClass001.A0o(), itemViewType);
            }
            view.setTag(r1);
        }
        if (!(r3 instanceof C114535nC) || (A032 = AnonymousClass32Y.A03(((C114535nC) r3).A00.A0H)) == null) {
            r2 = null;
        } else {
            r2 = (AnonymousClass5OF) this.A06.get(A032);
        }
        ((C103225Ma) view.getTag()).A00(r3, r2, this.A01);
        return view;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEnabled(int i) {
        return ((AnonymousClass65F) this.A03.get(i)).isEnabled();
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
