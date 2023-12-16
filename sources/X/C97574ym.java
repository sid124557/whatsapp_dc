package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.4ym  reason: invalid class name and case insensitive filesystem */
public abstract class C97574ym extends AnonymousClass4TR {
    public C64393Dh A00;
    public C69263Wi A01;

    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
        String stringExtra = getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C162457s7.A0H(stringExtra);
        String replaceAll = stringExtra.replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
        C162457s7.A0D(replaceAll);
        SimpleDateFormat A0u = AnonymousClass0x7.A0u("yyyyMMdd_HHmmss");
        C64393Dh r0 = this.A00;
        if (r0 != null) {
            File file = r0.A08().A0G;
            C64393Dh.A07(file, false);
            StringBuilder A0l = AnonymousClass000.A0l(replaceAll);
            A0l.append(' ');
            A0l.append(A0u.format(new Date()));
            File A0A = C18270x1.A0A(file, ".jpg", A0l);
            if (uri != null) {
                try {
                    String path = uri.getPath();
                    if (path != null) {
                        C64393Dh r1 = this.A00;
                        if (r1 != null) {
                            r1.A0a(AnonymousClass002.A0B(path), A0A);
                            C107655bf.A0Y(this, Uri.fromFile(A0A));
                            C69263Wi r12 = this.A01;
                            if (r12 != null) {
                                r12.A0H(R.string.f11nameremoved, 0);
                                finish();
                                return;
                            }
                            th = C18270x1.A0S("globalUI");
                        } else {
                            th = C18270x1.A0S("fMessageIO");
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("viewprofilephoto/save/failed", e);
                    C69263Wi r2 = this.A01;
                    if (r2 != null) {
                        r2.A0H(R.string.f11nameremoved, 1);
                    } else {
                        throw C18270x1.A0S("globalUI");
                    }
                }
            }
            th = AnonymousClass002.A0C("Invalid Uri");
            throw th;
        }
        throw C18270x1.A0S("fMessageIO");
    }
}
