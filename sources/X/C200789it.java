package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.9it  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200789it implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Intent A01;

    public final void run() {
        this.A00.startActivity(this.A01);
    }

    public /* synthetic */ C200789it(Activity activity, Intent intent) {
        this.A00 = activity;
        this.A01 = intent;
    }
}
