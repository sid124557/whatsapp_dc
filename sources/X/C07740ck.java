package X;

import android.content.Intent;
import androidx.car.app.IStartCarApp;

/* renamed from: X.0ck  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07740ck implements C15660rj {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ IStartCarApp A01;

    public final Object call() {
        this.A01.startCarApp(this.A00);
        return null;
    }

    public /* synthetic */ C07740ck(Intent intent, IStartCarApp iStartCarApp) {
        this.A01 = iStartCarApp;
        this.A00 = intent;
    }
}
