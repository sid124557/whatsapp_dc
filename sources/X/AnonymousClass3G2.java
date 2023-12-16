package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3G2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G2 implements C836749i {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C67733Ql A02;

    public final void BF5(byte[] bArr) {
        StringBuilder sb;
        C67733Ql r5 = this.A02;
        UserJid userJid = this.A01;
        long j = this.A00;
        byte[] A022 = C615231c.A02((C25811b7) null, (AnonymousClass1gS) null, bArr);
        if (A022 != null) {
            try {
                AnonymousClass1EU A002 = AnonymousClass1EU.A00(A022);
                if ((A002.bitField0_ & 65536) != 0) {
                    C621233o r7 = r5.A03;
                    C18260x0.A1R(AnonymousClass001.A0o(), "LocationSharingManager/onReceiveLocation; location.jid=", userJid);
                    long A08 = C56612sH.A08(r7);
                    C54942pX A003 = C621233o.A00(userJid, A002, (C30801n8) null);
                    A003.A05 = A08 - (j * 1000);
                    if (r7.A0f(A003)) {
                        for (AnonymousClass4EU BZX : r7.A0W) {
                            BZX.BZX(A003);
                        }
                        return;
                    }
                    sb = AnonymousClass001.A0o();
                    sb.append("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource=");
                    sb.append(A003.A06);
                } else {
                    sb = AnonymousClass001.A0o();
                    sb.append("axolotl e2eMessage is missing live location message; jid=");
                    sb.append(userJid);
                }
                AnonymousClass0x2.A19(sb);
            } catch (AnonymousClass6u5 e) {
                Log.w(AnonymousClass000.A0P(userJid, "axolotl derived plaintext does not represent valid protocol buffer; jid=", AnonymousClass001.A0o()), e);
            }
        }
    }

    public /* synthetic */ AnonymousClass3G2(UserJid userJid, C67733Ql r2, long j) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = j;
    }
}
