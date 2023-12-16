package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: X.04F  reason: invalid class name */
public class AnonymousClass04F extends C07280ac {
    public final /* synthetic */ AnonymousClass040 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04F(Window.Callback callback, AnonymousClass040 r2) {
        super(callback);
        this.A00 = r2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A0X(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void onContentChanged() {
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C07890cz)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
        /*
            r3 = this;
            boolean r0 = r6 instanceof X.C07890cz
            if (r0 == 0) goto L_0x000d
            r2 = r6
            X.0cz r2 = (X.C07890cz) r2
        L_0x0007:
            r1 = 0
            if (r4 != 0) goto L_0x000f
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x000d:
            r2 = 0
            goto L_0x0007
        L_0x000f:
            if (r2 == 0) goto L_0x0014
        L_0x0011:
            r0 = 1
            r2.A0I = r0
        L_0x0014:
            boolean r0 = super.onPreparePanel(r4, r5, r6)
            if (r2 == 0) goto L_0x001c
            r2.A0I = r1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04F.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C07890cz r0 = this.A00.A0M(0).A0A;
        if (r0 != null) {
            super.onProvideKeyboardShortcuts(list, r0, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        AnonymousClass040 r2 = this.A00;
        C07490ay r1 = new C07490ay(r2.A0i, callback);
        AnonymousClass0R2 A06 = r2.A06(r1);
        if (A06 != null) {
            return r1.A00(A06);
        }
        return null;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C07890cz r0;
        C07890cz r02;
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        AnonymousClass040 r6 = this.A00;
        int keyCode = keyEvent.getKeyCode();
        r6.A0P();
        AnonymousClass0R8 r03 = r6.A0B;
        if (r03 != null && r03.A0W(keyCode, keyEvent)) {
            return true;
        }
        C04040Mo r2 = r6.A0G;
        if (r2 != null) {
            int keyCode2 = keyEvent.getKeyCode();
            if (!keyEvent.isSystem() && ((r2.A0D || r6.A0Y(keyEvent, r2)) && (r02 = r2.A0A) != null && r02.performShortcut(keyCode2, keyEvent, 1))) {
                C04040Mo r04 = r6.A0G;
                if (r04 == null) {
                    return true;
                }
                r04.A0B = true;
                return true;
            }
        }
        if (r6.A0G != null) {
            return false;
        }
        C04040Mo A0M = r6.A0M(0);
        r6.A0Y(keyEvent, A0M);
        int keyCode3 = keyEvent.getKeyCode();
        boolean z = false;
        if (!keyEvent.isSystem() && ((A0M.A0D || r6.A0Y(keyEvent, A0M)) && (r0 = A0M.A0A) != null)) {
            z = r0.performShortcut(keyCode3, keyEvent, 1);
        }
        A0M.A0D = false;
        if (z) {
            return true;
        }
        return false;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        AnonymousClass040 r1 = this.A00;
        if (i != 108) {
            return true;
        }
        r1.A0P();
        AnonymousClass0R8 r12 = r1.A0B;
        if (r12 == null) {
            return true;
        }
        r12.A0L(true);
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        AnonymousClass040 r3 = this.A00;
        if (i == 108) {
            r3.A0P();
            AnonymousClass0R8 r0 = r3.A0B;
            if (r0 != null) {
                r0.A0L(false);
            }
        } else if (i == 0) {
            C04040Mo A0M = r3.A0M(i);
            if (A0M.A0C) {
                r3.A0U(A0M, false);
            }
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AnonymousClass040 r2 = this.A00;
        C07490ay r1 = new C07490ay(r2.A0i, callback);
        AnonymousClass0R2 A06 = r2.A06(r1);
        if (A06 != null) {
            return r1.A00(A06);
        }
        return null;
    }
}
