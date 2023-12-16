package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.0lx  reason: invalid class name and case insensitive filesystem */
public class C12690lx implements Runnable {
    public final /* synthetic */ AnonymousClass05G A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ Runnable A02;

    public C12690lx(AnonymousClass05G r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, Runnable runnable) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r1;
        this.A02 = runnable;
    }

    public void run() {
        AnonymousClass05G r1 = this.A00;
        if (!r1.isCancelled()) {
            try {
                this.A02.run();
                r1.A07((Object) null);
            } catch (Exception e) {
                r1.A06(e);
            }
        }
    }
}
