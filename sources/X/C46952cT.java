package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2cT  reason: invalid class name and case insensitive filesystem */
public class C46952cT {
    public final C56972sr A00;
    public final C49712gy A01;
    public final C47862dx A02;
    public final C56612sH A03;
    public final C56302rl A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass35J A06;

    public void A00(DeviceJid deviceJid, Set set) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonMessageDataRequestSendMethod/sendDataRequestMessage type=");
        A0o.append(0);
        A0o.append("; size=");
        C18260x0.A1G(A0o, set.size());
        if (set.isEmpty()) {
            return;
        }
        if (!this.A05.A0Y(C58422vE.A02, 2155)) {
            Log.w("NonMessageDataRequestSendMethod/sendDataRequestMessage gate is not enabled");
            return;
        }
        PhoneUserJid A042 = C56972sr.A04(this.A00);
        AnonymousClass35J r2 = this.A06;
        C30891nN r6 = new C30891nN(AnonymousClass35J.A01(A042, r2), this.A03.A0H());
        r6.A00 = deviceJid;
        r6.A00 = 0;
        r6.A01 = set;
        if (this.A04.A00(r6) < 0) {
            Log.e("NonMessageDataRequestSendMethod/sendDataRequestMessage unable to add peer message");
            return;
        }
        C49712gy.A00(this.A01, deviceJid, r6);
        C47862dx r4 = this.A02;
        int size = set.size();
        String str = r6.A1J.A01;
        AnonymousClass1YR r1 = new AnonymousClass1YR();
        r1.A00 = 0;
        r1.A01 = AnonymousClass0x9.A0m(size);
        r1.A02 = str;
        r4.A00.BhD(r1);
    }

    public C46952cT(C56972sr r1, C49712gy r2, C47862dx r3, C56612sH r4, C56302rl r5, AnonymousClass1VX r6, AnonymousClass35J r7) {
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }
}
