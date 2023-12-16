package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Bd  reason: invalid class name and case insensitive filesystem */
public class C124146Bd implements View.OnCreateContextMenuListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C124146Bd(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(ContextMenu contextMenu, C124146Bd r7) {
        MenuItem menuItem;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        MenuItem menuItem2;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener2;
        C102895Kr r3 = (C102895Kr) r7.A00;
        AnonymousClass5QZ r0 = (AnonymousClass5QZ) r7.A01;
        UserJid userJid = r0.A04;
        int i = r0.A01;
        if (userJid != null && !r3.A02.A0a(userJid)) {
            AnonymousClass3ZH A0A = r3.A06.A0A(userJid);
            AnonymousClass5XA r1 = r3.A01;
            C89644eZ r02 = r3.A03;
            r1.A01(contextMenu, r02, A0A);
            AnonymousClass5XA.A00(contextMenu, r02, userJid);
        }
        if (r3.A00) {
            if (i == 0) {
                menuItem = contextMenu.add(R.string.f11nameremoved);
                onMenuItemClickListener = new AnonymousClass4IB(r3, userJid, 0);
                menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
            } else if (i == 1) {
                menuItem = contextMenu.add(R.string.f11nameremoved);
                onMenuItemClickListener = new C1237369o((Object) r3, 4, (Object) userJid);
                menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
            } else if (i != 2) {
                C18260x0.A0x("admin-context-menu/Unsupported community participant rank: ", AnonymousClass001.A0o(), i);
                if (i == 2) {
                    return;
                }
            } else if (r3.A02.A0a(userJid)) {
                menuItem2 = contextMenu.add(R.string.f11nameremoved);
                onMenuItemClickListener2 = new AnonymousClass4IB(r3, userJid, 1);
                menuItem2.setOnMenuItemClickListener(onMenuItemClickListener2);
            } else {
                return;
            }
            if (!r3.A02.A0a(userJid)) {
                String A0h = C18300x5.A0h(r3.A07, r3.A06.A0A(userJid));
                C89644eZ r5 = r3.A03;
                menuItem2 = contextMenu.add(C107345b9.A05(r5, r3.A08, r5.getResources().getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0h))));
                onMenuItemClickListener2 = new C1237369o((Object) r3, 3, (Object) userJid);
                menuItem2.setOnMenuItemClickListener(onMenuItemClickListener2);
            }
        }
    }

    public static final void A01(ContextMenu contextMenu, C124146Bd r7) {
        AnonymousClass3ZH r5 = (AnonymousClass3ZH) r7.A01;
        AnonymousClass5OB r3 = (AnonymousClass5OB) ((AnonymousClass4X3) r7.A00).A06.getValue();
        if (r3 != null) {
            C372821q r2 = C372821q.OWNER;
            C102295Ih r0 = new C102295Ih(C372821q.GUEST, r5, true);
            C162457s7.A0H(contextMenu);
            r3.A00(contextMenu, r2, r0);
        }
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        switch (this.A02) {
            case 0:
                A00(contextMenu, this);
                return;
            case 1:
                C87204Ok r3 = (C87204Ok) this.A00;
                C102295Ih r2 = (C102295Ih) this.A01;
                AnonymousClass5OB r1 = (AnonymousClass5OB) r3.A0H.getValue();
                if (r1 != null) {
                    C372821q r0 = r3.A00;
                    C162457s7.A0H(contextMenu);
                    r1.A00(contextMenu, r0, r2);
                    return;
                }
                return;
            default:
                A01(contextMenu, this);
                return;
        }
    }
}
