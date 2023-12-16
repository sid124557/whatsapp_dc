package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipantJid;

/* renamed from: X.2ad  reason: invalid class name and case insensitive filesystem */
public class C45822ad {
    public final C56642sK A00;
    public final C56662sM A01;
    public final AnonymousClass318 A02;
    public final AnonymousClass1VX A03;

    public CallParticipantJid A00(UserJid userJid, String str) {
        PhoneUserJid phoneUserJid;
        byte[] bArr;
        DeviceJid[] deviceJidArr = (DeviceJid[]) this.A02.A0D(userJid).toArray(new DeviceJid[0]);
        if (userJid instanceof C27981fH) {
            phoneUserJid = C56662sM.A00(this.A01, userJid);
        } else {
            phoneUserJid = null;
        }
        AnonymousClass2K8 A04 = this.A00.A04(userJid);
        if (A04 == null) {
            bArr = null;
        } else {
            bArr = A04.A01;
        }
        int length = deviceJidArr.length;
        if (length > 5 && this.A03.A0Y(C58422vE.A02, 1525)) {
            C18260x0.A1L(AnonymousClass000.A0l(str), " calling to primary device only because callee has too many devices");
            int i = 0;
            while (true) {
                DeviceJid deviceJid = deviceJidArr[i];
                if (!AnonymousClass000.A1T(deviceJid.getDevice())) {
                    i++;
                    if (i >= length) {
                        break;
                    }
                } else {
                    deviceJidArr = new DeviceJid[]{deviceJid};
                    break;
                }
            }
        }
        return new CallParticipantJid(userJid, bArr, deviceJidArr, phoneUserJid);
    }

    public C45822ad(C56642sK r1, C56662sM r2, AnonymousClass318 r3, AnonymousClass1VX r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
