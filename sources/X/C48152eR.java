package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Set;

/* renamed from: X.2eR  reason: invalid class name and case insensitive filesystem */
public class C48152eR {
    public final Context A00;

    public File A00(String str) {
        Context context = this.A00;
        AnonymousClass002.A0A(context.getFilesDir(), "migration/export/sandbox").mkdirs();
        return File.createTempFile("sandbox", str, AnonymousClass002.A0A(context.getFilesDir(), "migration/export/sandbox"));
    }

    public void A01() {
        Log.d("ExportFlowSandbox/reset");
        C627536m.A0G(AnonymousClass002.A0A(this.A00.getFilesDir(), "migration/export/sandbox"), (Set) null);
    }

    public C48152eR(Context context) {
        this.A00 = context;
    }
}
