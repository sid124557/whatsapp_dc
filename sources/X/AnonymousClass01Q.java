package X;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.01Q  reason: invalid class name */
public class AnonymousClass01Q extends AsyncTask {
    public final /* synthetic */ AnonymousClass0OY A00;
    public final /* synthetic */ C15950sE A01;

    public AnonymousClass01Q(AnonymousClass0OY r1, C15950sE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A01.BTt((AnonymousClass0TJ) obj);
    }
}
