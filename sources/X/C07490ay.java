package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0ay  reason: invalid class name and case insensitive filesystem */
public class C07490ay implements C16910uE {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final C06290Wz A02 = new C06290Wz();
    public final ArrayList A03 = AnonymousClass001.A0s();

    public ActionMode A00(AnonymousClass0R2 r6) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass02K r1 = (AnonymousClass02K) arrayList.get(i);
            if (r1 != null && r1.A01 == r6) {
                return r1;
            }
        }
        AnonymousClass02K r0 = new AnonymousClass02K(this.A00, r6);
        arrayList.add(r0);
        return r0;
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r6) {
        return this.A01.onActionItemClicked(A00(r6), new AnonymousClass04I(this.A00, (C17230vB) menuItem));
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r8) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r8);
        C06290Wz r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass04H(this.A00, (C17220vA) menu);
            r3.put(menu, menu2);
        }
        return callback.onCreateActionMode(A002, menu2);
    }

    public void BQw(AnonymousClass0R2 r3) {
        this.A01.onDestroyActionMode(A00(r3));
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r8) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r8);
        C06290Wz r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass04H(this.A00, (C17220vA) menu);
            r3.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A002, menu2);
    }

    public C07490ay(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }
}
