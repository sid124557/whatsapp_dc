package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.3bO  reason: invalid class name and case insensitive filesystem */
public class C70993bO implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;

    public final void run() {
        C621133n r3;
        String str;
        C48472ex A042;
        AnonymousClass1gL r10 = (AnonymousClass1gL) this.A02;
        AnonymousClass39T r11 = (AnonymousClass39T) this.A03;
        String str2 = this.A08;
        C45442a1 r6 = (C45442a1) this.A04;
        int i = this.A00;
        long j = this.A01;
        C95814uZ r8 = (C95814uZ) this.A05;
        DeviceJid deviceJid = (DeviceJid) this.A06;
        C836749i r5 = (C836749i) this.A07;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationNotificationHandler/onFinalLocationNotification/axolotl received a location notification; jid=");
        A0o.append(r8);
        A0o.append("senderJid=");
        A0o.append(deviceJid);
        C18260x0.A0y("; retryCount=", A0o, i);
        C54562ov A022 = AnonymousClass36G.A02(deviceJid);
        int i2 = r6.A00;
        if (i2 == 3) {
            C54422oh A002 = C54422oh.A00(A022, C135156kD.A00);
            r3 = r10.A03;
            int i3 = r3.A05(r5, A002, r6.A02).A00;
            if (i3 != 0) {
                C18260x0.A0z("axolotl error while decrypt-group-using-fast-fatchet; status=", AnonymousClass001.A0o(), i3);
                if (i3 == -1001) {
                    if (j != 0) {
                        return;
                    }
                } else if (i3 == -1005 || i3 == -1203 || i3 == -1202 || i3 == -1204 || i3 == -1205 || i3 == -1206 || i3 == -1008) {
                    str = "axolotl|should try to send retry";
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (i2 == 0) {
                r3 = r10.A03;
                A042 = r3.A03(r5, A022, r6.A02);
            } else if (i2 == 1) {
                r3 = r10.A03;
                A042 = r3.A04(r5, A022, r6.A02);
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("LocationNotificationHandler/onFinalLocationNotification/axolotl unrecognized ciphertext type; stanzaKey=");
                A0o2.append(r11);
                C18260x0.A0z("; type=", A0o2, i2);
                return;
            }
            if (A042 != null) {
                int i4 = A042.A00;
                if (i4 != 0) {
                    C18260x0.A0z("axolotl error; status=", AnonymousClass001.A0o(), i4);
                }
                if (A042.A01()) {
                    str = AnonymousClass000.A0Y("axolotl|should try to send retry; status=", AnonymousClass001.A0o(), i4);
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r10.A00.A0S(new C70843b9(r8, deviceJid, r10, r11, str2, i, r3.A07.A01()));
    }

    public C70993bO(C836749i r1, C95814uZ r2, DeviceJid deviceJid, AnonymousClass1gL r4, C45442a1 r5, AnonymousClass39T r6, String str, int i, long j) {
        this.A02 = r4;
        this.A03 = r6;
        this.A08 = str;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = j;
        this.A05 = r2;
        this.A06 = deviceJid;
        this.A07 = r1;
    }
}
