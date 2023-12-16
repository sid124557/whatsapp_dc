package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3So  reason: invalid class name and case insensitive filesystem */
public class C68283So implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final C44812Xo A01;
    public final AnonymousClass31C A02;
    public final Map A03;

    public void BQs(String str) {
        C44812Xo r1 = this.A01;
        Log.w("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice delivery failure");
        r1.A01.BQt(Boolean.FALSE);
    }

    public C68283So(C55682qk r1, C44812Xo r2, AnonymousClass31C r3, Map map) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = map;
        this.A01 = r2;
    }

    public void BSN(AnonymousClass36K r6, String str) {
        Pair A022 = C57492tj.A02(r6);
        C44812Xo r4 = this.A01;
        if (A022 != null) {
            int A032 = C18280x3.A03(A022);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
            A0o.append(A032);
            C18260x0.A0t("; text=", (String) A022.second, A0o);
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
            A0o2.append(0);
            C18260x0.A0t("; text=", (String) null, A0o2);
        }
        r4.A01.BQt(Boolean.FALSE);
    }

    public void BdM(AnonymousClass36K r28, String str) {
        AnonymousClass36K[] r12;
        byte b;
        C42612Ov r0;
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K A0l = r28.A0l("list");
        if (!(A0l == null || (r12 = A0l.A03) == null)) {
            for (AnonymousClass36K r2 : r12) {
                UserJid userJid = (UserJid) AnonymousClass36K.A06(r2);
                if (userJid != null) {
                    AnonymousClass36K A0l2 = r2.A0l("error");
                    if (A0l2 != null) {
                        AnonymousClass0x2.A1I(userJid, A0t, AnonymousClass36K.A02(A0l2, "code"));
                    } else {
                        AnonymousClass36K[] r9 = r2.A03;
                        if (r9 != null) {
                            Arrays.sort(r9, new AnonymousClass4IU(7));
                            for (AnonymousClass36K r7 : r9) {
                                byte[] bArr = null;
                                try {
                                    DeviceJid A012 = DeviceJid.Companion.A01(userJid, AnonymousClass36K.A02(r7, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    AnonymousClass36K A0m = r7.A0m("identity");
                                    AnonymousClass36K A0l3 = r7.A0l("device-identity");
                                    AnonymousClass36K A0m2 = r7.A0m("registration");
                                    AnonymousClass36K A0l4 = r7.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                    if (A0l4 == null) {
                                        b = 5;
                                    } else {
                                        byte[] bArr2 = A0l4.A01;
                                        if (bArr2 == null || bArr2.length != 1) {
                                            throw AnonymousClass24Y.A01("type node should contain exactly 1 byte");
                                        }
                                        b = bArr2[0];
                                    }
                                    AnonymousClass36K A0l5 = r7.A0l("key");
                                    if (A0l5 != null) {
                                        r0 = new C42612Ov(A0l5.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0l5.A0m("value").A01, (byte[]) null);
                                    } else {
                                        r0 = null;
                                    }
                                    AnonymousClass36K A0m3 = r7.A0m("skey");
                                    AnonymousClass36K A0m4 = A0m3.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    AnonymousClass36K A0m5 = A0m3.A0m("value");
                                    AnonymousClass36K A0m6 = A0m3.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                                    byte[] bArr3 = A0m.A01;
                                    byte[] bArr4 = A0m2.A01;
                                    if (A0l3 != null) {
                                        bArr = A0l3.A01;
                                    }
                                    A0s.add(new AnonymousClass2T8(A012, r0, new C42612Ov(A0m4.A01, A0m5.A01, A0m6.A01), bArr3, bArr4, bArr, b));
                                } catch (AnonymousClass24P unused) {
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        C44812Xo r4 = this.A01;
        C18260x0.A1A("FetchPrekeyForMissingDeviceManager/onSuccess success list=", AnonymousClass001.A0o(), A0s);
        if (!A0s.isEmpty()) {
            C43542Sn r1 = r4.A00;
            if (r1.A01.A0X()) {
                C70323aJ.A00(r1.A06, r4, A0s, r4.A01, 48);
            } else {
                C48972fm.A02(r1.A02, new C70323aJ(r4, A0s, r4.A01, 49));
            }
        } else {
            r4.A01.BQt(Boolean.TRUE);
        }
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FetchPrekeyForMissingDeviceManager/onSuccess error jid=");
            A0o.append(A0w.getKey());
            A0o.append("; code=");
            C18260x0.A0n(A0w.getValue(), A0o);
        }
    }
}
