package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.5fl  reason: invalid class name and case insensitive filesystem */
public class C110145fl implements Window.Callback {
    public Window.Callback A00;
    public C111155hd A01;
    public final C54112oC A02;

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.A01.A00();
        return this.A00.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.A00.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.A00.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.A00.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.A00.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.A00.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.A00.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.A00.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.A00.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.A00.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.A00.onPreparePanel(i, view, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.A00.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A00.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A00.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.A00.onWindowStartingActionMode(callback);
    }

    public C110145fl(Window.Callback callback, C111155hd r2, C54112oC r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = callback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return r6.A00.dispatchTouchEvent(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r5 != 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r5 == 1) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r6.A01.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r5 = r7.getAction()
            r4 = 1
            if (r5 == 0) goto L_0x000c
            if (r5 == r4) goto L_0x000c
            r0 = 3
            if (r5 != r0) goto L_0x001c
        L_0x000c:
            X.2oC r3 = r6.A02
            X.3dI r2 = r3.A0B
            r1 = 16
            X.3cJ r0 = new X.3cJ
            r0.<init>((java.lang.Object) r3, (int) r5, (int) r1)
            r2.execute(r0)
            if (r5 == 0) goto L_0x001e
        L_0x001c:
            if (r5 != r4) goto L_0x0023
        L_0x001e:
            X.5hd r0 = r6.A01
            r0.A00()
        L_0x0023:
            android.view.Window$Callback r0 = r6.A00
            boolean r0 = r0.dispatchTouchEvent(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110145fl.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onSearchRequested() {
        return this.A00.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.A00.onWindowStartingActionMode(callback, i);
    }
}
