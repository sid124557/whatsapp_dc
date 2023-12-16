package X;

import android.content.Context;
import android.os.AsyncTask;
import com.caverock.androidsvg.SVGImageView;

/* renamed from: X.01R  reason: invalid class name */
public class AnonymousClass01R extends AsyncTask {
    public int A00;
    public Context A01;
    public final /* synthetic */ SVGImageView A02;

    public AnonymousClass01R(Context context, SVGImageView sVGImageView, int i) {
        this.A02 = sVGImageView;
        this.A01 = context;
        this.A00 = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.A01     // Catch:{ 0pi -> 0x001e }
            int r2 = r4.A00     // Catch:{ 0pi -> 0x001e }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ 0pi -> 0x001e }
            X.0Yb r0 = new X.0Yb     // Catch:{ 0pi -> 0x001e }
            r0.<init>()     // Catch:{ 0pi -> 0x001e }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ 0pi -> 0x001e }
            X.0QT r0 = r0.A0R(r1)     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x003b }
            return r0
        L_0x0019:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            throw r0     // Catch:{ 0pi -> 0x001e }
        L_0x001e:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            int r0 = r4.A00
            X.AnonymousClass000.A1L(r2, r0)
            r1 = 1
            java.lang.String r0 = r3.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "Error loading resource 0x%x: %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.String r0 = "SVGImageView"
            android.util.Log.e(r0, r1)
            r0 = 0
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01R.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.A02;
        sVGImageView.A01 = (AnonymousClass0QT) obj;
        sVGImageView.A00();
    }
}
