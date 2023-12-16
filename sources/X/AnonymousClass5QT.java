package X;

import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.Log;

/* renamed from: X.5QT  reason: invalid class name */
public class AnonymousClass5QT {
    public ListAdapter A00;
    public ListView A01;
    public C1228566c A02;
    public boolean A03 = false;
    public final Handler A04 = AnonymousClass000.A0A();
    public final Runnable A05 = new C70043Zq(this, 18);

    public synchronized void A01(ListAdapter listAdapter) {
        if (this.A01 == null) {
            this.A02.setContentView(17367060);
        }
        this.A00 = listAdapter;
        ListView listView = this.A01;
        C626936e.A04(listView);
        listView.setAdapter(listAdapter);
    }

    public void A00() {
        Log.d("WaBaseListActivity/onSupportContentChanged");
        this.A02.Bdg();
        View findViewById = this.A02.findViewById(16908292);
        C1228566c r1 = this.A02;
        C626936e.A06(r1);
        ListView listView = (ListView) r1.findViewById(16908298);
        this.A01 = listView;
        if (listView != null) {
            if (findViewById != null) {
                listView.setEmptyView(findViewById);
            }
            if (this.A03) {
                A01(this.A00);
            }
            this.A04.post(this.A05);
            this.A03 = true;
            return;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
    }
}
