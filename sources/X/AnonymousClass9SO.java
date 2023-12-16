package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9SO  reason: invalid class name */
public abstract class AnonymousClass9SO {
    public final AnonymousClass316 A00;

    public void A00(Intent intent) {
        if (intent != null) {
            long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
            String stringExtra = intent.getStringExtra("perf_origin");
            if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                this.A00.A0F(stringExtra, longExtra);
                return;
            }
        }
        Log.e("Expect to have origin for perf tracking.");
        this.A00.A0F("unknown", -1);
    }

    public AnonymousClass9SO(C56612sH r11, C54292oU r12, AnonymousClass4FV r13, C84084Ay r14, AnonymousClass8JP r15, C186568vZ r16, AnonymousClass4FS r17, String str, int i) {
        AnonymousClass316 r0 = new AnonymousClass316(r11, r12, r13, r14, r15, r16, r17, str, i);
        this.A00 = r0;
        r0.A0A.A05 = true;
    }
}
