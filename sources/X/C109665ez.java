package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;

/* renamed from: X.5ez  reason: invalid class name and case insensitive filesystem */
public abstract class C109665ez implements View.OnClickListener {
    public long A00;

    public abstract void A07(View view);

    public static Intent A06(Context context, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", z);
        return className;
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A07(view);
        }
    }
}
