package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.5q2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116285q2 implements C1227065k {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C89894fS A02;

    public final void BTS(File file) {
        C633138t r8;
        C89894fS r2 = this.A02;
        Intent intent = this.A01;
        int i = this.A00;
        try {
            AnonymousClass5Ul r5 = r2.A0A;
            C95814uZ r4 = r2.A0W;
            if (r4 instanceof C95804uY) {
                r8 = C633138t.A0O;
            } else {
                r8 = C633138t.A05;
            }
            boolean booleanExtra = intent.getBooleanExtra("has_preview", true);
            C185428td r3 = r2.A0K;
            C624134x quotedMessage = r3.getQuotedMessage();
            boolean z = r2.A0k;
            File file2 = file;
            if (r5.A0A.A0X(6760)) {
                r5.A0L.BkM(new C117435rv(r5, r4, quotedMessage, r8, file2, i, booleanExtra, z));
            } else {
                r5.A0A((C108845de) null, quotedMessage, r8, file2, (String) null, Collections.singletonList(r4), i, false, booleanExtra, z);
            }
            r3.AxU(6);
        } catch (IOException e) {
            r2.A07.A0H(R.string.f11nameremoved, 0);
            Log.e((Throwable) e);
        }
    }

    public /* synthetic */ C116285q2(Intent intent, C89894fS r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }
}
