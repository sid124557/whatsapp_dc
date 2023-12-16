package X;

import android.graphics.BitmapFactory;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* renamed from: X.0nP  reason: invalid class name and case insensitive filesystem */
public class C13580nP implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ C03740Lj A01;

    public C13580nP(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, C03740Lj r2) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return BitmapFactory.decodeFile(this.A01.A01);
    }
}
