package X;

import android.os.AsyncTask;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.01P  reason: invalid class name */
public class AnonymousClass01P extends AsyncTask {
    public final /* synthetic */ SVGImageView A00;

    public AnonymousClass01P(SVGImageView sVGImageView) {
        this.A00 = sVGImageView;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        InputStream[] inputStreamArr = (InputStream[]) objArr;
        try {
            AnonymousClass0QT A0R = new C06530Yb().A0R(inputStreamArr[0]);
            try {
                inputStreamArr[0].close();
                return A0R;
            } catch (IOException unused) {
                return A0R;
            }
        } catch (C14450pi e) {
            Log.e("SVGImageView", AnonymousClass000.A0a("Parse error loading URI: ", AnonymousClass001.A0o(), e));
            try {
                inputStreamArr[0].close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStreamArr[0].close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.A00;
        sVGImageView.A01 = (AnonymousClass0QT) obj;
        sVGImageView.A00();
    }
}
