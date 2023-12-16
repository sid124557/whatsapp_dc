package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.5lQ  reason: invalid class name and case insensitive filesystem */
public class C113435lQ implements C1230266t {
    public final /* synthetic */ SearchViewModel A00;

    public C113435lQ(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public void Ayr() {
    }

    public C95814uZ B86() {
        return null;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BA9() {
        return null;
    }

    public List BBO() {
        return this.A00.A13.A0K.A04();
    }

    public void BP6(ViewHolder viewHolder, C95814uZ r3, int i) {
        this.A00.A0a(r3);
    }

    public void BP7(View view, ViewHolder viewHolder, ViewHolder viewHolder2, C95814uZ r7, int i, int i2) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0f.A0H(Boolean.FALSE);
        if (r7 != null) {
            searchViewModel.A1B.A0H(r7);
        }
    }

    public void BP8(ViewHolder viewHolder, C624134x r3) {
        this.A00.A0c(r3);
    }

    public void BPA(C28001fK r2) {
        Log.e("SearchViewModel/pending group in search results");
    }

    public boolean BVx(ViewHolder viewHolder, ViewHolder viewHolder2, C95814uZ r4, int i) {
        this.A00.A1A.A0H(r4);
        return true;
    }

    public Set BCh() {
        return AnonymousClass002.A0K();
    }

    public boolean Bj7(Jid jid) {
        return false;
    }
}
