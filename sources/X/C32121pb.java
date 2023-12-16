package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1pb  reason: invalid class name and case insensitive filesystem */
public class C32121pb extends C53272mp {
    public final C60592yo A00;
    public final C52542le A01;
    public final C44662Wz A02;
    public final List A03;

    public C32121pb(C55682qk r7, AnonymousClass1VX r8, AnonymousClass4FV r9, C60592yo r10, C52542le r11, C44662Wz r12, List list, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r11;
        this.A02 = r12;
        this.A03 = list;
        this.A00 = r10;
    }

    public void A00(AnonymousClass36K r13) {
        C83904Ag r4;
        C42572Or r3;
        int i;
        Message A0J;
        long j;
        C42572Or r32;
        Long l;
        AnonymousClass36K[] r33;
        int i2 = 0;
        AnonymousClass36K A0k = r13.A0k(0);
        if (AnonymousClass36K.A0W(A0k, "offline_preview")) {
            int A0b = A0k.A0b("message", 0);
            int A0b2 = A0k.A0b("receipt", 0);
            int A0b3 = A0k.A0b("notification", 0);
            C60592yo r2 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ConnectionThreadRequestsImpl/offline-preview messages=");
            A0o.append(A0b);
            A0o.append("; receipts = ");
            A0o.append(A0b2);
            C18260x0.A0y("; notifications = ", A0o, A0b3);
            r4 = r2.A01;
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("messageCount", A0b);
            A08.putInt("receiptCount", A0b2);
            A08.putInt("notificationCount", A0b3);
            A0J = C18290x4.A0J(259, A08);
        } else if (AnonymousClass36K.A0W(A0k, "offline")) {
            String A0L = AnonymousClass36K.A0L(A0k, "count");
            if (A0L != null) {
                try {
                    C60592yo r22 = this.A00;
                    int parseInt = Integer.parseInt(A0L);
                    C18260x0.A0y("ConnectionThreadRequestsImpl/offline-complete count=", AnonymousClass001.A0o(), parseInt);
                    C83904Ag r23 = r22.A01;
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putInt("messageCount", parseInt);
                    AnonymousClass0x2.A16(r23, A082, 15);
                    Iterator it = this.A03.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0g("onOfflineCompleteReceived");
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (AnonymousClass36K.A0W(A0k, "dirty")) {
                C60592yo r42 = this.A00;
                AnonymousClass36K[] r1 = r13.A03;
                C626936e.A06(r1);
                C626936e.A0B(AnonymousClass001.A1T(r1.length));
                AnonymousClass36K r12 = r1[0];
                C626936e.A0B(AnonymousClass36K.A0W(r12, "dirty"));
                String A0L2 = AnonymousClass36K.A0L(r12, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                C626936e.A06(A0L2);
                if ("account_sync".equals(A0L2) && (r33 = r12.A03) != null) {
                    HashSet A0K = AnonymousClass002.A0K();
                    for (AnonymousClass36K r0 : r33) {
                        A0K.add(r0.A00);
                    }
                    r32 = new C42572Or((Long) null, A0L2, A0K);
                } else if ("syncd_app_state".equals(A0L2)) {
                    String A0L3 = AnonymousClass36K.A0L(r12, "timestamp");
                    if (A0L3 != null) {
                        try {
                            l = C18290x4.A0h(A0L3);
                        } catch (Exception unused2) {
                            C18260x0.A0r("Timestamp is not a number: ", A0L3, AnonymousClass001.A0o());
                        }
                        r32 = new C42572Or(l, A0L2, Collections.emptySet());
                    }
                    l = null;
                    r32 = new C42572Or(l, A0L2, Collections.emptySet());
                } else {
                    r32 = new C42572Or((Long) null, A0L2, Collections.emptySet());
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("onDirty/category=");
                C18260x0.A1L(A0o2, r32.A01);
                r4 = r42.A01;
                i = 8;
                r3 = r32;
            } else if (AnonymousClass36K.A0W(A0k, "streamdebug")) {
                String A0r = A0k.A0r("ip", (String) null);
                String A0r2 = A0k.A0r("reconnect", (String) null);
                String A0r3 = A0k.A0r("stanzalogcount", (String) null);
                if (A0r3 != null) {
                    i2 = Integer.parseInt(A0r3);
                }
                boolean equals = "1".equals(A0r2);
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("ConnectionThreadRequestsImpl/stream/debug host=");
                A0o3.append(A0r);
                A0o3.append(" reconnect=");
                A0o3.append(equals);
                C18260x0.A0y(" size=", A0o3, i2);
                return;
            } else if (AnonymousClass36K.A0W(A0k, "location")) {
                Jid A0g = r13.A0g(UserJid.class, "from");
                if (A0k != null) {
                    AnonymousClass36K A0k2 = A0k.A0k(0);
                    if (A0k2 == null || !"enc".equals(A0k2.A00)) {
                        throw AnonymousClass24Y.A01("invalid location node");
                    }
                    C45442a1 A002 = AnonymousClass28S.A00(A0k2);
                    String A0L4 = AnonymousClass36K.A0L(A0k, "elapsed");
                    if (A0L4 != null) {
                        j = (long) Integer.parseInt(A0L4);
                    } else {
                        j = 0;
                    }
                    C60592yo r24 = this.A00;
                    C18260x0.A1R(AnonymousClass001.A0o(), "ConnectionThreadRequestsImpl/on-location-update jid=", A0g);
                    C83904Ag r5 = r24.A01;
                    Message A0J2 = C18290x4.A0J(117, A002);
                    Bundle data = A0J2.getData();
                    C384027k.A00(data, A0g, "jid");
                    data.putLong("elapsed", j);
                    r5.Bfr(A0J2);
                    return;
                }
                throw AnonymousClass24Y.A01("Missing location node");
            } else if (AnonymousClass36K.A0W(A0k, "sonar")) {
                String A0q = A0k.A0q("url");
                C60592yo r25 = this.A00;
                C18260x0.A0s("ConnectionThreadRequestsImpl/sonar url=", A0q, AnonymousClass001.A0o());
                r4 = r25.A01;
                i = 101;
                r3 = A0q;
            } else if (AnonymousClass36K.A0W(A0k, "edge_routing")) {
                AnonymousClass36K A0l = A0k.A0l("routing_info");
                if (A0l != null && !TextUtils.isEmpty(A0l.A0n())) {
                    C44662Wz r34 = this.A02;
                    byte[] bArr = A0l.A01;
                    if (bArr.length <= 256) {
                        C18270x1.A0j(C18270x1.A03(r34.A00), "routing_info", C18320x8.A0i(bArr));
                        return;
                    }
                    throw AnonymousClass001.A0c("The routing info should be smaller than 256 bytes.");
                }
                return;
            } else if (AnonymousClass36K.A0W(A0k, "fbip")) {
                String A0n = A0k.A0n();
                if (A0n != null) {
                    this.A01.A02(C18320x8.A1b(A0n));
                    return;
                }
                return;
            } else if (AnonymousClass36K.A0W(A0k, "client_expiration")) {
                long A0e = A0k.A0e("t", -1);
                C60592yo r43 = this.A00;
                if (A0e != -1) {
                    A0e *= 1000;
                }
                Log.i("ConnectionThreadRequestsImpl/on-expiration-change");
                C83904Ag r44 = r43.A01;
                Bundle A083 = AnonymousClass002.A08();
                A083.putLong("timestampMs", A0e);
                AnonymousClass0x2.A16(r44, A083, 159);
                return;
            } else if (AnonymousClass36K.A0W(A0k, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
                this.A00.A02(A0k.A0q("nonce"), A0k.A0q("key"));
                return;
            } else if (AnonymousClass36K.A0W(A0k, "gpia")) {
                AnonymousClass36K[] r52 = A0k.A03;
                if (r52 != null) {
                    int length = r52.length;
                    while (i2 < length) {
                        AnonymousClass36K r14 = r52[i2];
                        if (AnonymousClass36K.A0W(r14, "request")) {
                            AnonymousClass0x2.A16(this.A00.A01, r14.A0q("nonce"), 254);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (AnonymousClass36K.A0W(A0k, "safetynet")) {
                AnonymousClass36K[] r11 = A0k.A03;
                if (r11 != null) {
                    int length2 = r11.length;
                    while (i2 < length2) {
                        AnonymousClass36K r15 = r11[i2];
                        if (AnonymousClass36K.A0W(r15, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
                            this.A00.A02(r15.A0q("nonce"), r15.A0q("key"));
                        } else if (AnonymousClass36K.A0W(r15, "verify_apps")) {
                            int A022 = AnonymousClass36K.A02(r15, "count");
                            C60592yo r16 = this.A00;
                            Log.i("ConnectionThreadRequestsImpl/on-safetynet-verifyapps-request");
                            C83904Ag r45 = r16.A01;
                            Message A0G = AnonymousClass0x7.A0G(223);
                            A0G.getData().putInt("maxAppsCount", A022);
                            r45.Bfr(A0G);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (AnonymousClass36K.A0W(A0k, "peer_device_presence")) {
                C60592yo r46 = this.A00;
                boolean equalsIgnoreCase = "true".equalsIgnoreCase(A0k.A0q("presence"));
                C18260x0.A1E("ConnectionThreadRequestsImpl/on-peer-device-presence=", AnonymousClass001.A0o(), equalsIgnoreCase);
                r4 = r46.A01;
                A0J = Message.obtain((Handler) null, 0, 215, equalsIgnoreCase ? 1 : 0);
            } else if (AnonymousClass36K.A0W(A0k, "thread_metadata")) {
                this.A00.A01(r13, (AnonymousClass39T) null, 257);
                return;
            } else {
                AnonymousClass1VX r6 = this.A02;
                C58422vE r26 = C58422vE.A02;
                if (!r6.A0Y(r26, 366) && AnonymousClass36K.A0W(A0k, "notice")) {
                    List A0s = r13.A0s("notice");
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass36K A0Y = C18310x6.A0Y(it2);
                        int A023 = AnonymousClass36K.A02(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A024 = AnonymousClass36K.A02(A0Y, "stage");
                        long A032 = AnonymousClass36K.A03(A0Y);
                        int A025 = AnonymousClass36K.A02(A0Y, "version");
                        int A0b4 = A0Y.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
                        if (A0b4 < 0 || A0b4 > 2 || A024 <= -1 || A024 >= 1000) {
                            C18260x0.A0z("ibstanzahandler/parseusernoticemetadatalist invalid user notice meta data id = ", AnonymousClass001.A0o(), A023);
                        } else {
                            A0s2.add(new C622234e(A023, A024, A025, A032, A0b4));
                        }
                    }
                    C60592yo r17 = this.A00;
                    Log.i("ConnectionThreadRequestsImpl/on-user-notice-received");
                    AnonymousClass0x7.A19(r17.A01, A0s2, 216);
                    return;
                } else if (r6.A0Y(r26, 877) && AnonymousClass36K.A0W(A0k, "tos")) {
                    this.A00.A01(A0k, (AnonymousClass39T) null, 249);
                    return;
                } else {
                    return;
                }
            }
            A0J = C18290x4.A0J(i, r3);
        }
        r4.Bfr(A0J);
    }
}
