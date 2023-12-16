package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.0lt  reason: invalid class name and case insensitive filesystem */
public class C12650lt implements Runnable {
    public final /* synthetic */ AnonymousClass05G A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ C188268yc A02;

    public C12650lt(AnonymousClass05G r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, C188268yc r3) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void run() {
        try {
            this.A02.get();
            this.A00.A07((Object) null);
        } catch (Exception e) {
            this.A00.A06(e);
        }
    }
}
