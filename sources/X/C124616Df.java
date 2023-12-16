package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.6Df  reason: invalid class name and case insensitive filesystem */
public class C124616Df extends CountDownTimer {
    public final /* synthetic */ s A00;
    public final /* synthetic */ C125126Fq A01;

    public void onFinish() {
        s sVar = this.A00;
        sVar.A0Q().runOnUiThread(new C71303bt(sVar, 12));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124616Df(s sVar, C125126Fq r6) {
        super(60000, 1000);
        this.A00 = sVar;
        this.A01 = r6;
    }

    public void onTick(long j) {
        String string;
        long A0B = C18290x4.A0B(j);
        long j2 = A0B - 15;
        int i = (A0B > 15 ? 1 : (A0B == 15 ? 0 : -1));
        C125126Fq r2 = this.A01;
        if (i > 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(Long.toString(j2));
            string = AnonymousClass000.A0X("s", A0o);
        } else {
            string = C08310eF.A09(this.A00).getString(R.string.f11nameremoved);
        }
        r2.A02(string, true);
    }
}
