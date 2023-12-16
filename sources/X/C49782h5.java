package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: X.2h5  reason: invalid class name and case insensitive filesystem */
public final class C49782h5 {
    public final C620633i A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final SecureRandom A04;

    public final Integer A00() {
        ActivityManager A06 = this.A00.A06();
        if (A06 == null) {
            Log.e("UnfinishedCallEventUploader/getProcessExitReason: could not get activity manager");
            return null;
        }
        List historicalProcessExitReasons = A06.getHistoricalProcessExitReasons((String) null, 0, 1);
        C162457s7.A0D(historicalProcessExitReasons);
        if (historicalProcessExitReasons.isEmpty()) {
            return null;
        }
        return Integer.valueOf(((ApplicationExitInfo) C73723fy.A03(historicalProcessExitReasons)).getReason());
    }

    public final void A01(boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        int i;
        if (this.A02.A0O(C58422vE.A02, 6454) > 0 && !z) {
            C183538qC r4 = this.A01.A01;
            SharedPreferences A0B = C18300x5.A0B(r4);
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(A0B.getString("voip_call_id", (String) null), A0B.getString("session_id_for_voip_call_id", (String) null));
            if (A0G.A00 != null && !TextUtils.equals(C106965aS.A08, (CharSequence) A0G.A01)) {
                WamCall wamCall = new WamCall();
                wamCall.callTestBucket = C18280x3.A0Z(C18300x5.A0B(r4), "voip_call_ab_test_bucket");
                byte[] bArr = new byte[16];
                this.A04.nextBytes(bArr);
                C827244r r6 = C827244r.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("");
                int i2 = 0;
                int i3 = 0;
                do {
                    byte b = bArr[i2];
                    i3++;
                    if (i3 > 1) {
                        A0o.append("");
                    }
                    A0o.append((CharSequence) r6.invoke(Byte.valueOf(b)));
                    i2++;
                } while (i2 < 16);
                A0o.append("");
                wamCall.callRandomId = C18290x4.A0o(A0o);
                if (Build.VERSION.SDK_INT < 30 || (num = A00()) == null) {
                    if (z2) {
                        i = 4;
                    } else if (z3) {
                        i = 5;
                    } else {
                        i = 0;
                        if (z4) {
                            i = 6;
                        }
                    }
                    num = Integer.valueOf(i);
                }
                wamCall.appExitReason = num;
                this.A03.BhE(wamCall, 1);
            }
        }
    }

    public C49782h5(C620633i r1, AnonymousClass33p r2, AnonymousClass1VX r3, AnonymousClass4FV r4, SecureRandom secureRandom) {
        C18260x0.A0f(r3, r4, secureRandom, r1, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = secureRandom;
        this.A00 = r1;
        this.A01 = r2;
    }
}
