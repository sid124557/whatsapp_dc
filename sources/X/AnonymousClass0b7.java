package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.0b7  reason: invalid class name */
public class AnonymousClass0b7 implements C16470tS, DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnKeyListener {
    public AnonymousClass043 A00;
    public AnonymousClass0b9 A01;
    public C07890cz A02;

    public void BPH(C07890cz r2, boolean z) {
        AnonymousClass043 r0;
        if ((z || r2 == this.A02) && (r0 = this.A00) != null) {
            r0.dismiss();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C07890cz r3 = this.A02;
        AnonymousClass0b9 r1 = this.A01;
        AnonymousClass032 r0 = r1.A03;
        if (r0 == null) {
            r0 = new AnonymousClass032(r1);
            r1.A03 = r0;
        }
        r3.A0L((C07910d1) r0.getItem(i), (C17050uU) null, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A01.BPH(this.A02, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0G(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }

    public AnonymousClass0b7(C07890cz r1) {
        this.A02 = r1;
    }

    public boolean BXO(C07890cz r2) {
        return false;
    }
}
