package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.4KE  reason: invalid class name */
public class AnonymousClass4KE implements C15800rx {
    public final int A00;

    public AnonymousClass4KE(int i) {
        this.A00 = i;
    }

    public final boolean Bqd(Object obj) {
        Jid jid;
        switch (this.A00) {
            case 2:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || str.startsWith("ab_props:") || str.startsWith("prop_override:") || str.endsWith("_expo_key")) {
                    return true;
                }
                return false;
            case 3:
                jid = (Jid) obj;
                C162457s7.A0J(jid, 0);
                break;
            case 4:
                return AnonymousClass0x9.A1P((DeviceJid) obj);
            default:
                jid = (Jid) obj;
                break;
        }
        return C57372tX.A00(jid);
    }
}
