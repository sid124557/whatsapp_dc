package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.5sh  reason: invalid class name and case insensitive filesystem */
public final class C117915sh implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;

    public C117915sh(SharedPreferences sharedPreferences, Long l, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = l;
    }

    public final /* synthetic */ Object call() {
        return C86614Ku.A0q(this.A00, this.A02, this.A01.longValue());
    }
}
