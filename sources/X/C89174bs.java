package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.4bs  reason: invalid class name and case insensitive filesystem */
public abstract class C89174bs extends C87404Qs implements C1228566c {
    public C08310eF A00;
    public AnonymousClass5QT A01;

    public abstract void setContentView(int i);

    public static void A00(C89174bs r3) {
        AnonymousClass5QT r0 = r3.A01;
        if (r0 == null) {
            C08310eF r2 = r3.A00;
            C162457s7.A0J(r2, 0);
            AnonymousClass29x.A00(AnonymousClass3DZ.class, r2);
            r0 = new AnonymousClass5QT();
            r3.A01 = r0;
        }
        r0.A02 = r3;
    }

    public void Bde() {
    }

    public void Bdf() {
    }

    public C08310eF getHost() {
        C08310eF r0 = this.A00;
        C626936e.A06(r0);
        return r0;
    }

    public ListAdapter getListAdapter() {
        ListAdapter listAdapter;
        AnonymousClass5QT r1 = this.A01;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        return listAdapter;
    }

    public ListView getListView() {
        AnonymousClass5QT r2 = this.A01;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C626936e.A04(listView);
        return listView;
    }

    public C89644eZ getWaBaseActivity() {
        C08310eF r0 = this.A00;
        if (r0 != null) {
            C003203q A0Q = r0.A0Q();
            if (A0Q instanceof C89644eZ) {
                return (C89644eZ) A0Q;
            }
        }
        try {
            return (C89644eZ) C111095hX.A03(getContext(), C89644eZ.class);
        } catch (IllegalStateException e) {
            Log.e("No activity available", e);
            return null;
        }
    }

    public void setListAdapter(ListAdapter listAdapter) {
        this.A01.A01(listAdapter);
    }

    public void setSelection(int i) {
        ListView listView = this.A01.A01;
        C626936e.A04(listView);
        listView.setSelection(i);
    }

    public C89174bs(Context context) {
        super(context);
        A00(this);
    }

    public void BdV() {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        waBaseActivity.A6m();
    }

    public Dialog BdX(int i) {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A6j(i);
    }

    public boolean BdY(Menu menu) {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A72(menu);
    }

    public boolean Bda(int i, KeyEvent keyEvent) {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A71(i, keyEvent);
    }

    public boolean Bdb(int i, KeyEvent keyEvent) {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return C89644eZ.A4I(keyEvent, waBaseActivity, i);
    }

    public boolean Bdc(Menu menu) {
        C89644eZ waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A73(menu);
    }

    public void Bdd(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void Bdg() {
        Objects.requireNonNull(getWaBaseActivity());
    }

    public void setHost(C08310eF r1) {
        this.A00 = r1;
    }
}
