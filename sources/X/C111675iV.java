package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.crash.upload.ExceptionsUploadService;

/* renamed from: X.5iV  reason: invalid class name and case insensitive filesystem */
public class C111675iV implements AnonymousClass66U, C1226865i {
    public boolean A00 = false;
    public final Context A01;

    public void BMW() {
        this.A00 = true;
    }

    public String BDW() {
        return "ExceptionsUploadAsyncInit";
    }

    public void BMd() {
        Context context = this.A01;
        boolean z = this.A00;
        Class<ExceptionsUploadService> cls = ExceptionsUploadService.class;
        Intent A08 = AnonymousClass0x9.A08(context, cls);
        A08.putExtra("app_version_changed", z);
        AnonymousClass00W.A00(context, A08, cls, 1);
    }

    public /* synthetic */ void BMe() {
    }

    public C111675iV(Context context) {
        this.A01 = context;
    }
}
