package X;

import android.os.AsyncTask;

/* renamed from: X.01S  reason: invalid class name */
public final class AnonymousClass01S extends AsyncTask {
    public final /* synthetic */ AnonymousClass00W A00;

    public AnonymousClass01S(AnonymousClass00W r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            AnonymousClass00W r2 = this.A00;
            C16540tZ A04 = r2.A04();
            if (A04 == null) {
                return null;
            }
            r2.A08(A04.getIntent());
            A04.AzG();
        }
    }

    public /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.A00.A05();
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A00.A05();
    }
}
