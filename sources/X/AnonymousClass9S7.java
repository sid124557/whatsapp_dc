package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9S7  reason: invalid class name */
public class AnonymousClass9S7 {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final AnonymousClass31C A04;
    public final C194929Vc A05;
    public final C40602Ha A06;
    public final C620933l A07;
    public final AnonymousClass9U5 A08;
    public final AnonymousClass9VU A09;
    public final C193839Qg A0A;
    public final C194029Rh A0B;

    public void A00(AnonymousClass34V r24, C67993Rl r25) {
        if (r24 == null) {
            C67993Rl r1 = r25;
            if (r25 != null) {
                Log.i("PAY: BrazilDeviceRegistrationAction starts to bind device");
                C67973Rj r5 = (C67973Rj) r1.A00;
                String A002 = this.A0B.A00(5);
                String A082 = this.A07.A08();
                C194929Vc r4 = this.A05;
                String A012 = r4.A01(5);
                String str = null;
                if (!TextUtils.isEmpty(A012)) {
                    byte[] bArr = new byte[0];
                    try {
                        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOO(32, A012.getBytes(C58152un.A0B));
                        bArr = bArr2;
                        if (bArr2 == null) {
                        }
                    } catch (UnsupportedEncodingException e) {
                        Log.e("PAY: BrazilTokenizationHelper/generateDevicePublicKeyPem failed generating public pem key: ", e);
                    }
                    str = new String(bArr).split("\u0000")[0];
                }
                JSONObject A1G = AnonymousClass0x9.A1G();
                try {
                    A1G.put("deviceId", A002).put("devicePublicKey", str).put("walletId", A082);
                } catch (JSONException e2) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilDeviceRegistrationAction payload generation failed :", e2);
                    e2.printStackTrace();
                }
                String A022 = r4.A02(r5, A1G.toString());
                String A023 = AnonymousClass35J.A02(this.A02, this.A03);
                AnonymousClass31C r12 = this.A04;
                String A032 = r12.A03();
                C35351wj A0W = C1899693i.A0W(A032);
                C56052rL A013 = C56052rL.A01();
                C1899593h.A1M(A013);
                C56052rL A0U = C1899593h.A0U();
                C56052rL.A0D(A0U, "action", "br-device-registration");
                C1899593h.A1N(A0U, A023);
                C56052rL A042 = C56052rL.A04("elo");
                if (C1899693i.A10(A022, 1, false)) {
                    C56052rL.A0D(A042, "ciphered_binding_info", A022);
                }
                if (C626836d.A0M(A002, 1, 255, false)) {
                    C56052rL.A0D(A042, "network_device_id", A002);
                }
                C56052rL.A07(A042, A0U);
                r12.A0D(new C203889oT(this.A00, this.A06, this.A01, this, 2), C41032Ir.A03(A0U, A013, A0W), A032, 204, 0);
                return;
            }
        }
        Log.i("PAY: BrazilDeviceRegistrationAction missing key");
        C193839Qg r13 = this.A0A;
        new AnonymousClass34V();
        r13.A00((AnonymousClass9Q0) null);
    }

    public AnonymousClass9S7(Context context, C69263Wi r2, C56972sr r3, C56612sH r4, AnonymousClass31C r5, C194929Vc r6, C40602Ha r7, C620933l r8, AnonymousClass9U5 r9, AnonymousClass9VU r10, C193839Qg r11, C194029Rh r12) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r10;
        this.A0A = r11;
    }
}
