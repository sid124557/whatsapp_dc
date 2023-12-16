package X;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.4br  reason: invalid class name and case insensitive filesystem */
public class C89164br extends C89444cz implements C1228566c {
    public AnonymousClass5QT A00;

    public synchronized void A74(ListAdapter listAdapter) {
        this.A00.A01(listAdapter);
    }

    public void A5h() {
        this.A00.A00();
    }

    public void Bdg() {
    }

    public ListView getListView() {
        AnonymousClass5QT r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C626936e.A04(listView);
        return listView;
    }

    public void onDestroy() {
        AnonymousClass5QT r0 = this.A00;
        r0.A04.removeCallbacks(r0.A05);
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass5QT r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        C1228566c r0 = r2.A02;
        C626936e.A06(r0);
        r0.Bdd(bundle);
    }

    public void Bdd(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A02 = this;
    }
}
