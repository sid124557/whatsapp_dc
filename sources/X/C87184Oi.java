package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.4Oi  reason: invalid class name and case insensitive filesystem */
public class C87184Oi extends BaseAdapter implements Filterable {
    public long A00 = 5;
    public Filter A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final /* synthetic */ StatusesFragment A03;

    public C87184Oi(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    public static void A00(StatusesFragment statusesFragment) {
        statusesFragment.A0q.getFilter().filter(statusesFragment.A1I);
    }

    public int getCount() {
        return this.A03.A1K.size();
    }

    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter != null) {
            return filter;
        }
        C87294Ow r1 = new C87294Ow(this.A03);
        this.A01 = r1;
        return r1;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.A1K.get(i);
    }

    public long getItemId(int i) {
        C1226165b r1 = (C1226165b) this.A03.A1K.get(i);
        if (r1 instanceof C115805pG) {
            UserJid userJid = ((C115805pG) r1).A01.A0A;
            Map map = this.A02;
            Number A0q = AnonymousClass0x9.A0q(userJid, map);
            if (A0q == null) {
                long j = this.A00;
                this.A00 = 1 + j;
                A0q = Long.valueOf(j);
                map.put(userJid, A0q);
            }
            return A0q.longValue();
        } else if (r1 instanceof C115795pF) {
            return ((C115795pF) r1).A00;
        } else {
            if (r1 instanceof C115815pH) {
                Objects.requireNonNull(r1);
                return 3;
            }
            throw AnonymousClass002.A0G("Each list item must have an id");
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.A1K.get(i);
        if (obj instanceof C115805pG) {
            return 0;
        }
        if (obj instanceof C115795pF) {
            return 1;
        }
        if (obj instanceof C115815pH) {
            return 2;
        }
        throw AnonymousClass002.A0G("Each list item type must have a itemType");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((C1226165b) statusesFragment.A1K.get(i)).BEK(statusesFragment.A1D(), view, viewGroup, statusesFragment.A0P, statusesFragment.A1Y, statusesFragment.A1Z, statusesFragment.A1X, statusesFragment.A1J, statusesFragment.A1P);
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }
}
