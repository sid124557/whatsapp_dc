package X;

import android.os.BaseBundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3Qj  reason: invalid class name and case insensitive filesystem */
public class C67713Qj implements AnonymousClass4DA {
    public final C66663Mh A00;
    public final AnonymousClass5Z4 A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass4FV A05;
    public final C55352qD A06;
    public final C64173Cl A07;
    public final AnonymousClass33S A08;
    public final C60232yD A09;
    public final AnonymousClass4FS A0A;

    public int[] B81() {
        return new int[]{6, 27, 250, 159, 174, 18};
    }

    public boolean BFA(Message message, int i) {
        int i2;
        int i3;
        Message message2 = message;
        int i4 = i;
        if (i4 == 6) {
            BaseBundle baseBundle = (BaseBundle) message2.obj;
            String string = baseBundle.getString("gcmToken");
            String string2 = baseBundle.getString("fbnsToken");
            String string3 = baseBundle.getString("mutedChatsHash");
            String string4 = baseBundle.getString("appMuteConfig");
            String string5 = baseBundle.getString("num_acc");
            String string6 = baseBundle.getString("pkey");
            String string7 = baseBundle.getString("voip_payload_type");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AppMessagingXmppHandler/received client config from server; gcmToken=");
            boolean z = false;
            if (string != null) {
                i2 = string.length();
            } else {
                i2 = 0;
            }
            A0o.append(i2);
            A0o.append(" bytes; fbnsToken=");
            if (string2 != null) {
                i3 = string2.length();
            } else {
                i3 = 0;
            }
            A0o.append(i3);
            A0o.append(" bytes: mutedChatsHash=");
            A0o.append(string3);
            A0o.append(" appMuteConfig:");
            A0o.append(string4);
            A0o.append(" numberOfAccounts: ");
            A0o.append(string5);
            A0o.append(" has pKeyHash:");
            if (string6 != null) {
                z = true;
            }
            A0o.append(z);
            C18260x0.A0s(" voipPayloadType:", string7, A0o);
            RegistrationIntentService.A03(this.A03.A00, string, string3, string4, string5, string6, string7);
            C60232yD r2 = this.A09;
            if (r2.A01()) {
                r2.A00(string2);
                return true;
            } else if (!TextUtils.isEmpty(string2)) {
                AnonymousClass33S r1 = this.A08;
                Log.d("SendMethods/Sending clear fbns token");
                r1.A04.A0J(AnonymousClass0x7.A0G(263));
                return true;
            }
        } else if (i4 == 18) {
            C18260x0.A1P(AnonymousClass001.A0o(), "AppMessagingXmppHandler/service_pricing ", message2.obj);
            return true;
        } else if (i4 == 27) {
            int i5 = message2.arg2;
            C18260x0.A0x("AppMessagingXmppHandler/clientConfigError/", AnonymousClass001.A0o(), i5);
            if (i5 == 404) {
                RegistrationIntentService.A03(this.A03.A00, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                C60232yD r12 = this.A09;
                if (r12.A01()) {
                    r12.A00((String) null);
                    return true;
                }
            }
        } else if (i4 == 159) {
            this.A01.A02(((BaseBundle) message2.obj).getLong("timestampMs"));
            return true;
        } else if (i4 != 174) {
            return false;
        } else {
            AnonymousClass36K r22 = (AnonymousClass36K) message2.obj;
            int A012 = C615531h.A01(r22.A0r("version", (String) null), 0);
            int A013 = C615531h.A01(r22.A0r("protocol", (String) null), 1);
            HashMap A0t = AnonymousClass001.A0t();
            Iterator A0M = AnonymousClass36K.A0M(r22, "prop");
            while (A0M.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
                A0t.put(A0Y.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), A0Y.A0r("value", (String) null));
            }
            if (A013 == 2) {
                this.A00.A07(this.A02, r22.A0r("hash", (String) null), r22.A0r("key", (String) null), A0t, A012, A013, C615531h.A04(r22.A0r("refresh", (String) null), 86400) * 1000);
            } else {
                this.A00.A07(this.A02, (String) null, (String) null, A0t, A012, 1, 86400000);
            }
            this.A0A.BkM(new C71273bq((Object) this, 15));
        }
        return true;
    }

    public C67713Qj(C66663Mh r1, AnonymousClass5Z4 r2, C56612sH r3, C54292oU r4, AnonymousClass33p r5, AnonymousClass4FV r6, C55352qD r7, C64173Cl r8, AnonymousClass33S r9, C60232yD r10, AnonymousClass4FS r11) {
        this.A03 = r4;
        this.A02 = r3;
        this.A0A = r11;
        this.A05 = r6;
        this.A08 = r9;
        this.A00 = r1;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
    }
}
