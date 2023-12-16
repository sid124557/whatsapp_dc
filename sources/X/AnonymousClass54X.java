package X;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;

/* renamed from: X.54X  reason: invalid class name */
public class AnonymousClass54X extends AnonymousClass5ZM {
    public final WeakReference A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Uri uri;
        Context A0U;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length <= 0 || (uri = uriArr[0]) == null || (A0U = C86664Kz.A0U(this.A00)) == null) {
            return null;
        }
        return RingtoneManager.getRingtone(A0U, uri);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Ringtone ringtone = (Ringtone) obj;
        AnonymousClass5ZK r2 = ((AnonymousClass7DI) this.A01.get()).A00;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.callState == CallState.RECEIVED_CALL && r2.A02 != null) {
            Ringtone ringtone2 = r2.A01;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            r2.A01 = ringtone;
            if (ringtone != null) {
                try {
                    r2.A04();
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    try {
                        r2.A01.stop();
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                    }
                    r2.A01 = null;
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voip/ringtone/no-ringtone found for ");
                C18260x0.A0n(r2.A02, A0o);
            }
        }
    }

    public AnonymousClass54X(Context context, AnonymousClass7DI r3) {
        this.A01 = AnonymousClass0x9.A14(r3);
        this.A00 = AnonymousClass0x9.A14(context);
    }
}
