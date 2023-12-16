package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3Qc  reason: invalid class name and case insensitive filesystem */
public class C67643Qc implements AnonymousClass4DA {
    public final C64743Et A00;
    public final C55892r5 A01;

    public boolean BFA(Message message, int i) {
        if (i != 212) {
            return false;
        }
        Object obj = message.obj;
        C626936e.A06(obj);
        AnonymousClass39T r4 = (AnonymousClass39T) obj;
        C56202rb A012 = this.A01.A01(1, r4.A00);
        if (A012 != null) {
            A012.A03(3);
        }
        C64743Et r2 = this.A00;
        DeviceJid of = DeviceJid.of(r4.A02);
        String str = r4.A07;
        if (of == null || TextUtils.isEmpty(str)) {
            return true;
        }
        r2.A0K.BkM(new C71603cN(r2, of, r4, str, 9));
        return true;
    }

    public C67643Qc(C64743Et r1, C55892r5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 212;
        return A0E;
    }
}
