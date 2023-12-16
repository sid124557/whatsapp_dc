package X;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* renamed from: X.0eT  reason: invalid class name and case insensitive filesystem */
public class C08430eT implements C15980sH {
    public final /* synthetic */ PreferenceGroup A00;
    public final /* synthetic */ AnonymousClass09H A01;

    public C08430eT(PreferenceGroup preferenceGroup, AnonymousClass09H r2) {
        this.A01 = r2;
        this.A00 = preferenceGroup;
    }

    public boolean BYe(Preference preference) {
        this.A00.A01 = Integer.MAX_VALUE;
        AnonymousClass09H r0 = this.A01;
        Handler handler = r0.A00;
        Runnable runnable = r0.A02;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
        return true;
    }
}
