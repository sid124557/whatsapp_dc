package X;

import android.content.Intent;

/* renamed from: X.0cv  reason: invalid class name and case insensitive filesystem */
public final class C07850cv implements C16540tZ {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ AnonymousClass00W A02;

    public C07850cv(Intent intent, AnonymousClass00W r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public void AzG() {
        this.A02.stopSelf(this.A00);
    }

    public Intent getIntent() {
        return this.A01;
    }
}
