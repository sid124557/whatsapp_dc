package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3G3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G3 implements C836749i {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ AnonymousClass1gL A03;
    public final /* synthetic */ String A04;

    public final void BF5(byte[] bArr) {
        C54942pX r0;
        AnonymousClass1gL r7 = this.A03;
        DeviceJid deviceJid = this.A02;
        C95814uZ r10 = this.A01;
        String str = this.A04;
        long j = this.A00;
        byte[] A022 = C615231c.A02((C25811b7) null, (AnonymousClass1gS) null, bArr);
        if (A022 != null) {
            try {
                AnonymousClass1EU A002 = AnonymousClass1EU.A00(A022);
                if ((A002.bitField0_ & 65536) != 0) {
                    C621233o r8 = r7.A06;
                    UserJid userJid = deviceJid.userJid;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("LocationSharingManager/onReceiveFinalLocation/jid=");
                    A0o.append(r10);
                    A0o.append("; senderJid=");
                    A0o.append(userJid);
                    C18260x0.A0s("; msgId=", str, A0o);
                    C30801n8 A08 = r8.A08(AnonymousClass2z0.A03(r10, str));
                    if (A08 == null) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("LocationSharingManager/onReceiveFinalLocation/Live location message not found; jid=");
                        A0o2.append(r10);
                        C18260x0.A0s("; msgId=", str, A0o2);
                        return;
                    }
                    C54942pX A003 = C621233o.A00(userJid, A002, A08);
                    if (j > 0) {
                        A003.A05 = j;
                    }
                    synchronized (r8.A0Q) {
                        C54942pX r02 = (C54942pX) r8.A0b.get(userJid);
                        if (r02 != null && r02.A05 < A003.A05) {
                            r8.A0f(A003);
                        }
                        Map A1B = AnonymousClass0x9.A1B(r10, r8.A0B());
                        if ((A1B == null || !A1B.containsKey(userJid)) && ((r0 = A08.A02) == null || r0.A05 < A003.A05)) {
                            r8.A0W(A003, A08);
                        }
                    }
                    return;
                }
                C18260x0.A1S(AnonymousClass001.A0o(), "LocationNotificationHandler/onFinalLocationNotification/axolotl e2eMessage is missing live location message; senderJid=", deviceJid);
            } catch (AnonymousClass6u5 e) {
                Log.w(AnonymousClass000.A0P(deviceJid, "LocationNotificationHandler/onFinalLocationNotification/axolotl derived plaintext does not represent valid protocol buffer; senderJid=", AnonymousClass001.A0o()), e);
            }
        }
    }

    public /* synthetic */ AnonymousClass3G3(C95814uZ r1, DeviceJid deviceJid, AnonymousClass1gL r3, String str, long j) {
        this.A03 = r3;
        this.A02 = deviceJid;
        this.A01 = r1;
        this.A04 = str;
        this.A00 = j;
    }
}
