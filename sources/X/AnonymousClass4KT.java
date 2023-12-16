package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4KT  reason: invalid class name */
public class AnonymousClass4KT implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4KT(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass4KT r3) {
        ((C06270Wx) r3.A01).A0G(new AnonymousClass2KO((Boolean) null, false));
    }

    public void BQs(String str) {
        Object r0;
        StringBuilder sb;
        String str2;
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                C162457s7.A0J(str, 0);
                ((C72183dJ) this.A00).BQr(new AnonymousClass249(str));
                return;
            case 2:
                Log.e("Delivery failure on fetching non admin GJRs");
                return;
            case 4:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((AnonymousClass4EH) this.A01).BQp();
                return;
            case 5:
                ((AnonymousClass4EK) this.A01).BQr(new AnonymousClass249(str));
                return;
            case 7:
                sb = AnonymousClass001.A0o();
                str2 = "LocationSubscriptionSendMethods/subscribe/onDeliveryFailure; iqId=";
                break;
            case 8:
                ((C46742c8) this.A01).A00();
                return;
            case 9:
                C18260x0.A0r("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onDeliveryFailure id=", str, AnonymousClass001.A0o());
                ((AnonymousClass4DC) this.A01).BRy();
                return;
            case 10:
                C162457s7.A0J(str, 0);
                C18260x0.A0s("GetNewsletterMessagesJob/onDeliveryFailure iqId = ", str, AnonymousClass001.A0o());
                C28471gv r02 = ((AnonymousClass2HK) this.A01).A00;
                C83994Ap r1 = r02.callback;
                if (r1 != null) {
                    r1.Bjl(r02.token);
                    return;
                }
                return;
            case 11:
                sb = C18270x1.A0X(str);
                str2 = "GetNewsletterMessagesUpdatesJob/onDeliveryFailure iqId = ";
                break;
            case 12:
                sb = C18270x1.A0X(str);
                str2 = "GetNewsletterMyAddOnsMessagesJob/onDeliveryFailure iqId = ";
                break;
            case 13:
                AnonymousClass0x9.A1I((C06270Wx) this.A00);
                return;
            case 14:
                Log.e("DisclosureResultSendWorker/onDeliveryFailure");
                int i = ((AnonymousClass0QH) this.A00).A01.A00;
                AnonymousClass0Pc r12 = (AnonymousClass0Pc) this.A01;
                if (i > 4) {
                    r0 = new C01400Ao();
                } else {
                    r0 = new C01390An();
                }
                r12.A01(r0);
                return;
            case 15:
                ((AnonymousClass3TP) this.A00).BQs(str);
                ((AnonymousClass4EZ) this.A01).BQs(str);
                return;
            case 16:
                Log.i("PushXmppMethod/SetClientConfig delivery fail");
                AnonymousClass4DX r03 = (AnonymousClass4DX) this.A00;
                if (r03 != null) {
                    r03.BSk();
                    return;
                }
                return;
            case 17:
                AnonymousClass11N r13 = ((AnonymousClass3UN) ((AnonymousClass48V) this.A01)).A00;
                AnonymousClass3ZH r04 = r13.A02;
                if (r04 != null) {
                    C06270Wx.A05(r13.A0D, r04.A0q);
                }
                C18290x4.A1C(C66493Lq.A1H, (Object) null, 3012);
                return;
            case 18:
                C18260x0.A0s("TwoFactorXmppMethods/sendGetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "Delivery failure: iqId=", str, AnonymousClass001.A0o());
                return;
            default:
                return;
        }
        C18260x0.A0s(str2, str, sb);
    }

    public void BSN(AnonymousClass36K r6, String str) {
        int i;
        Object r0;
        String str2;
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                C18260x0.A0O(str, r6);
                ((C72183dJ) this.A00).BQr(new AnonymousClass24F(r6, str));
                return;
            case 2:
                str2 = "Error fetching non admin GJRs";
                break;
            case 3:
                int A012 = C57492tj.A01(r6);
                Iterator A0q = C18320x8.A0q(this.A01);
                while (A0q.hasNext()) {
                    C66463Ln.A00((C66463Ln) this.A00, AnonymousClass0x7.A0R(A0q), A012);
                }
                return;
            case 4:
                Log.e("EncryptionProtocolHelper failed with a server error");
                ((AnonymousClass4EH) this.A01).BS9(new AnonymousClass24F(r6, str));
                return;
            case 5:
                ((C52922mG) this.A00).A01.A0A("BaseFetchCertificateProtocolHelper failed with a server error", false, (String) null);
                ((AnonymousClass4EK) this.A01).BSB(new AnonymousClass24F(r6, str));
                return;
            case 6:
                ((AtomicInteger) this.A01).set(C57492tj.A01(r6));
                return;
            case 7:
                int A013 = C57492tj.A01(r6);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSubscriptionSendMethods/subscribe/onError; iqId=");
                A0o.append(str);
                C18260x0.A0y(", error=", A0o, A013);
                str2 = AnonymousClass000.A0Y("locationssubscriberesponsehandler/error ", AnonymousClass001.A0o(), A013);
                break;
            case 8:
                ((C46742c8) this.A01).A00();
                return;
            case 9:
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onError id=");
                A0o2.append(str);
                C18260x0.A1Q(A0o2, ", node=", r6);
                ((AnonymousClass4DC) this.A01).BRy();
                return;
            case 10:
                C162457s7.A0J(r6, 1);
                A01((AnonymousClass2HK) this.A01, r6, (C35711xJ) this.A00);
                return;
            case 11:
                C162457s7.A0J(r6, 1);
                A02((AnonymousClass2HL) this.A01, r6, (C35721xK) this.A00);
                return;
            case 12:
                C162457s7.A0J(r6, 1);
                A03((AnonymousClass2HM) this.A01, r6, (C35711xJ) this.A00);
                return;
            case 13:
                AnonymousClass0x9.A1I((C06270Wx) this.A00);
                return;
            case 14:
                Pair A022 = C57492tj.A02(r6);
                C18260x0.A1Q(AnonymousClass001.A0o(), "disclosureresultsendWorker/onError ", A022);
                if (A022 != null && C18280x3.A03(A022) == 400) {
                    Log.i("disclosusreresultsendworker/onError invalid stanza");
                }
                int i2 = ((AnonymousClass0QH) this.A00).A01.A00;
                AnonymousClass0Pc r1 = (AnonymousClass0Pc) this.A01;
                if (i2 > 4) {
                    r0 = new C01400Ao();
                } else {
                    r0 = new C01390An();
                }
                r1.A01(r0);
                return;
            case 15:
                ((AnonymousClass3TP) this.A00).BSN(r6, str);
                ((AnonymousClass4EZ) this.A01).BSN(r6, str);
                return;
            case 16:
                int A002 = C57492tj.A00(r6);
                C18260x0.A0x("PushXmppMethod/clientConfigSetError/", AnonymousClass001.A0o(), A002);
                if (A002 == 409) {
                    Context context = ((C45472a4) this.A01).A00.A00;
                    Log.i("GCM: force replacing gcm token");
                    Class<RegistrationIntentService> cls = RegistrationIntentService.class;
                    AnonymousClass00W.A00(context, new Intent("com.whatsapp.action.FORCE_REPLACE", (Uri) null, context, cls), cls, 4);
                }
                AnonymousClass4DX r02 = (AnonymousClass4DX) this.A00;
                if (r02 != null) {
                    r02.BSk();
                    return;
                }
                return;
            case 17:
                C162457s7.A0J(r6, 1);
                int A003 = AnonymousClass36K.A00(r6);
                AnonymousClass11N r12 = ((AnonymousClass3UN) ((AnonymousClass48V) this.A01)).A00;
                AnonymousClass3ZH r03 = r12.A02;
                if (r03 != null) {
                    C06270Wx.A05(r12.A0D, r03.A0q);
                }
                if (!(A003 == -2 || A003 == -1 || A003 == 400)) {
                    if (A003 == 401) {
                        i = 3010;
                    } else if (A003 == 403) {
                        i = 3011;
                    } else if (!(A003 == 404 || A003 == 500)) {
                        return;
                    }
                    C18290x4.A1C(C66493Lq.A1H, (Object) null, i);
                    return;
                }
                i = 3012;
                C18290x4.A1C(C66493Lq.A1H, (Object) null, i);
                return;
            default:
                C18260x0.A0s("TwoFactorXmppMethods/sendGetTwoFactorAuth/onError; iq=", str, AnonymousClass001.A0o());
                ((C130076bL) this.A01).A06(new AnonymousClass24F(r6, str));
                return;
        }
        Log.e(str2);
    }

    public void BdM(AnonymousClass36K r22, String str) {
        C06270Wx r3;
        AnonymousClass2KO r2;
        String str2;
        AnonymousClass24Y r1;
        String str3;
        Integer num;
        String A0n;
        int i;
        long j;
        AnonymousClass36K r23 = r22;
        String str4 = str;
        switch (this.A02) {
            case 0:
                try {
                    if ("result".equals(AnonymousClass36K.A0L(r23, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                        r3 = (C06270Wx) this.A01;
                        AnonymousClass36K A0l = r23.A0l("accept");
                        if (A0l != null) {
                            str2 = AnonymousClass36K.A0L(A0l, "optout");
                        } else {
                            str2 = null;
                        }
                        r2 = new AnonymousClass2KO(Boolean.valueOf("true".equals(str2)), true);
                    } else {
                        r3 = (C06270Wx) this.A01;
                        r2 = new AnonymousClass2KO((Boolean) null, false);
                    }
                    r3.A0G(r2);
                    return;
                } catch (AnonymousClass24Y unused) {
                    A00(this);
                    return;
                }
            case 1:
                C162457s7.A0J(r23, 1);
                C27991fJ r7 = (C27991fJ) r23.A0h(C27991fJ.class, "from");
                List A0s = r23.A0m("membership_approval_requests").A0s("membership_approval_request");
                C162457s7.A0D(A0s);
                ArrayList A0c = C73783g4.A0c(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(it);
                    String A0q = A0Y.A0q("request_method");
                    String A012 = C31601oY.A01(A0q);
                    if (A012 != null) {
                        A0c.add(new C53382n0(r7, (C27991fJ) null, (UserJid) A0Y.A0h(UserJid.class, "jid"), (UserJid) null, A012, AnonymousClass36K.A05(A0Y, "request_time")));
                    } else {
                        throw AnonymousClass24Y.A02("GetAllGroupMembershipApprovalRequestsApiHandler/onSuccess/incorrect membership_approval_request.requestMethod=", A0q, AnonymousClass001.A0o());
                    }
                }
                C54442oj r0 = (C54442oj) this.A01;
                r0.A01(r7);
                r0.A03(A0c);
                ((C72183dJ) this.A00).BQt((Object) null);
                return;
            case 2:
                C162457s7.A0J(r23, 1);
                List A0s2 = r23.A0m("membership_approval_requests").A0s("membership_approval_request");
                C162457s7.A0D(A0s2);
                C27991fJ r6 = (C27991fJ) this.A00;
                ArrayList A0c2 = C73783g4.A0c(A0s2);
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass36K A0Y2 = C18310x6.A0Y(it2);
                    Class<UserJid> cls = UserJid.class;
                    A0c2.add(new C52752lz(r6, (UserJid) A0Y2.A0h(cls, "requestor"), (UserJid) A0Y2.A0h(cls, "jid"), AnonymousClass36K.A05(A0Y2, "request_time")));
                }
                C46682c2 r24 = (C46682c2) this.A01;
                C70343aL.A01(r24.A05, r24, r6, A0c2, 9);
                return;
            case 3:
                List A0s3 = r23.A0m("list").A0s(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                AnonymousClass4IU.A00(A0s3, 34);
                Iterator it3 = A0s3.iterator();
                while (it3.hasNext()) {
                    AnonymousClass36K A0Y3 = C18310x6.A0Y(it3);
                    DeviceJid deviceJid = (DeviceJid) A0Y3.A0h(DeviceJid.class, "jid");
                    AnonymousClass36K A0l2 = A0Y3.A0l("error");
                    if (A0l2 != null) {
                        C66463Ln.A00((C66463Ln) this.A00, deviceJid, AnonymousClass36K.A02(A0l2, "code"));
                    } else {
                        AnonymousClass36K A0m = A0Y3.A0m("identity");
                        AnonymousClass36K A0m2 = A0Y3.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        AnonymousClass36K A0l3 = A0Y3.A0l("device-identity");
                        byte[] bArr = A0m2.A01;
                        if (bArr == null || bArr.length != 1) {
                            throw AnonymousClass24Y.A01("type node should contain exactly 1 byte");
                        }
                        C66463Ln r12 = (C66463Ln) this.A00;
                        if (((C621133n) r12.A07.get()).A0X()) {
                            r12.A02.BkM(new C71453c8(this, deviceJid, A0m, A0m2, A0l3, 8));
                        } else {
                            C48972fm.A02((C48972fm) r12.A08.get(), new C71453c8(this, deviceJid, A0m, A0m2, A0l3, 9));
                        }
                    }
                }
                return;
            case 4:
                AnonymousClass2Q4 A002 = AnonymousClass3MN.A00(r23);
                AnonymousClass36K A0l4 = r23.A0l("tos_id");
                Integer num2 = null;
                if (!(A0l4 == null || (A0n = A0l4.A0n()) == null)) {
                    num2 = Integer.valueOf(Integer.parseInt(A0n));
                }
                ((AnonymousClass4EH) this.A01).BdS(A002, num2);
                return;
            case 5:
                try {
                    C52922mG r13 = (C52922mG) this.A00;
                    AnonymousClass4EK r32 = (AnonymousClass4EK) this.A01;
                    AnonymousClass36K A0m3 = r23.A0m("reply");
                    if ((r13 instanceof AnonymousClass1V2) || (r13 instanceof AnonymousClass1V3) || (r13 instanceof AnonymousClass1V1) || (r13 instanceof AnonymousClass1V0)) {
                        A0m3.A0m("password_pem");
                    }
                    String str5 = null;
                    String A0r = A0m3.A0r("algorithm", (String) null);
                    if (A0r == null) {
                        A0r = "rsa2048";
                    }
                    AnonymousClass36K A0m4 = A0m3.A0m("encryption_pem");
                    AnonymousClass36K A0m5 = A0m3.A0m("signature_pem");
                    String A0n2 = A0m4.A0n();
                    if (A0n2 != null) {
                        String A0n3 = A0m5.A0n();
                        if (A0n3 != null) {
                            AnonymousClass36K A0l5 = A0m3.A0l("password_pem");
                            if (A0l5 != null) {
                                str5 = A0l5.A0n();
                                if (!TextUtils.isEmpty(str5)) {
                                    str3 = A0l5.A0q("key_id");
                                    try {
                                        num = Integer.valueOf(A0l5.A0q("ttl"));
                                    } catch (NumberFormatException e) {
                                        r1 = new AnonymousClass24Y((Throwable) e);
                                    }
                                } else {
                                    r1 = AnonymousClass24Y.A01("empty key");
                                }
                            } else {
                                num = null;
                                str3 = null;
                            }
                            r32.BdU(num, A0r, A0n2, A0n3, str5, str3);
                            return;
                        }
                        r1 = AnonymousClass24Y.A01("missing sig");
                    } else {
                        r1 = AnonymousClass24Y.A01("missing cert");
                    }
                    throw r1;
                } catch (AnonymousClass24Y e2) {
                    ((AnonymousClass4EK) this.A01).BSB(e2);
                    throw e2;
                }
            case 6:
                return;
            case 7:
                C18260x0.A0s("LocationSubscriptionSendMethods/subscribe/onSuccess; iqId=", str4, AnonymousClass001.A0o());
                int i2 = 0;
                AnonymousClass36K A0k = r23.A0k(0);
                if (A0k != null) {
                    String A0L = AnonymousClass36K.A0L(A0k, "duration");
                    if (A0L != null) {
                        i = Integer.parseInt(A0L);
                    } else {
                        i = 0;
                    }
                    AnonymousClass36K A0k2 = A0k.A0k(0);
                    if (A0k2 != null) {
                        List A0s4 = A0k2.A0s("participant");
                        ArrayList A0p = AnonymousClass000.A0p(A0s4);
                        Iterator it4 = A0s4.iterator();
                        while (it4.hasNext()) {
                            A0p.add(C18310x6.A0Y(it4).A0g(UserJid.class, "jid"));
                        }
                        C61222zu r62 = (C61222zu) this.A00;
                        C621233o r8 = (C621233o) r62.A03.get();
                        C95814uZ r9 = ((AnonymousClass2YN) this.A01).A00;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("LocationSharingManager/onReceiveServerSharingList; jid=");
                        A0o.append(r9);
                        C18260x0.A1B("; participants.size=", A0o, A0p);
                        HashSet A0K = AnonymousClass002.A0K();
                        synchronized (r8.A0Q) {
                            Map A0B = r8.A0B();
                            Map A1B = AnonymousClass0x9.A1B(r9, A0B);
                            if (A1B != null) {
                                A0K.addAll(A1B.keySet());
                                A0K.removeAll(AnonymousClass0x9.A15(A0p));
                                HashSet A0K2 = AnonymousClass002.A0K();
                                Iterator it5 = A0K.iterator();
                                while (it5.hasNext()) {
                                    UserJid A0T = C18310x6.A0T(it5);
                                    AnonymousClass2OP r02 = (AnonymousClass2OP) A1B.remove(A0T);
                                    if (r02 != null) {
                                        C621233o.A01(r8, r02.A02);
                                    }
                                    A0K2.add(A0T);
                                }
                                r8.A0J.A02(r9, A0K2, false);
                                if (A1B.isEmpty()) {
                                    A0B.remove(r9);
                                }
                                if (!A0K.isEmpty()) {
                                    r8.A0Z(A0B);
                                }
                            }
                        }
                        Iterator it6 = A0K.iterator();
                        while (it6.hasNext()) {
                            UserJid A0T2 = C18310x6.A0T(it6);
                            for (AnonymousClass4EU BZa : r8.A0W) {
                                BZa.BZa(r9, A0T2);
                            }
                        }
                        if (!A0K.isEmpty()) {
                            r8.A0N();
                        }
                        Log.i("locationssubscriberesponsehandler/subscription list updated");
                        Iterator it7 = A0s4.iterator();
                        while (it7.hasNext()) {
                            AnonymousClass36K A0Y4 = C18310x6.A0Y(it7);
                            UserJid A0A = AnonymousClass36K.A0A(A0Y4, UserJid.class, "jid");
                            AnonymousClass36K A0k3 = A0Y4.A0k(0);
                            if (A0k3 != null) {
                                C18260x0.A1R(AnonymousClass001.A0o(), "LocationSubscriptionSendMethods/subscribe/handleLocationUpdate; from=", A0A);
                                AnonymousClass36K A0k4 = A0k3.A0k(0);
                                if (A0k4 == null || !"enc".equals(A0k4.A00)) {
                                    throw AnonymousClass24Y.A01("invalid location node");
                                }
                                C45442a1 A003 = AnonymousClass28S.A00(A0k4);
                                String A0L2 = AnonymousClass36K.A0L(A0k3, "elapsed");
                                if (A0L2 != null) {
                                    j = (long) Integer.parseInt(A0L2);
                                } else {
                                    j = 0;
                                }
                                ((C67733Ql) r62.A04.get()).A00(A0A, A003, j);
                            }
                        }
                    }
                    i2 = i;
                }
                ((AnonymousClass2YN) this.A01).A00(i2 * 1000);
                return;
            case 8:
                C46742c8 r25 = (C46742c8) this.A01;
                r25.A02.A08((C52562lg) this.A00);
                r25.A00();
                return;
            case 9:
                C18260x0.A0s("fpm/ChatTransferProtocolHelper/sendSetFirstPartyMigrationIntentIq/onSuccess id=", str4, AnonymousClass001.A0o());
                ((AnonymousClass4DC) this.A01).onSuccess();
                return;
            case 10:
                C162457s7.A0J(r23, 1);
                A01((AnonymousClass2HK) this.A01, r23, (C35711xJ) this.A00);
                return;
            case 11:
                C162457s7.A0J(r23, 1);
                A02((AnonymousClass2HL) this.A01, r23, (C35721xK) this.A00);
                return;
            case 12:
                C162457s7.A0J(r23, 1);
                A03((AnonymousClass2HM) this.A01, r23, (C35711xJ) this.A00);
                return;
            case 13:
                C162457s7.A0J(r23, 1);
                C55822qy r63 = (C55822qy) this.A01;
                AnonymousClass36K A0l6 = r23.A0m("privacy").A0l("list");
                if (A0l6 != null) {
                    HashSet A0K3 = AnonymousClass002.A0K();
                    String A0L3 = AnonymousClass36K.A0L(A0l6, "dhash");
                    Iterator A0M = AnonymousClass36K.A0M(A0l6, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    while (A0M.hasNext()) {
                        A0K3.add(C18310x6.A0Y(A0M).A0h(UserJid.class, "jid"));
                    }
                    C51902kZ r03 = new C51902kZ(A0L3, A0K3);
                    r63.A04(r03.A00, r03.A01, false);
                }
                AnonymousClass0x7.A18((C06270Wx) this.A00);
                return;
            case 14:
                Log.i("disclosuresendworker/onsuccess");
                AnonymousClass36K A0l7 = r23.A0l("trackable");
                if (A0l7 != null) {
                    AnonymousClass36K.A02(A0l7, "result");
                }
                ((AnonymousClass0Pc) this.A01).A01(new C01410Ap());
                return;
            case 15:
                ((AnonymousClass3TP) this.A00).BdM(r23, str4);
                ((AnonymousClass4EZ) this.A01).BdM(r23, str4);
                return;
            case 16:
                Log.i("PushXmppMethod/read/client_config_set");
                AnonymousClass4DX r04 = (AnonymousClass4DX) this.A00;
                if (r04 != null) {
                    r04.onSuccess();
                    return;
                }
                return;
            case 17:
                C162457s7.A0J(r23, 1);
                ((AnonymousClass4GQ) this.A00).invoke(r23);
                return;
            default:
                C18260x0.A0s("TwoFactorXmppMethods/sendGetTwoFactorAuth/onSuccess; iq=", str4, AnonymousClass001.A0o());
                AnonymousClass36K A0l8 = r23.A0l("2fa");
                C626936e.A06(A0l8);
                C613130e r4 = (C613130e) ((AnonymousClass2P5) this.A00).A02.get();
                boolean z = true;
                boolean A1W = AnonymousClass000.A1W(A0l8.A0l("code"));
                if (A0l8.A0l("email") == null) {
                    z = false;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("TwoFactorAuthManager/onAuthSettingsReceived code [");
                A0o2.append(A1W);
                A0o2.append("] email [");
                A0o2.append(z);
                C18260x0.A1J(A0o2, "]");
                C18270x1.A0h(r4.A00().edit(), "two_factor_auth_email_set", C18280x3.A01(z ? 1 : 0));
                C18310x6.A1H(this.A01);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r11.fetchingForGaps != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass2HK r20, X.AnonymousClass36K r21, X.C35711xJ r22) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r0 = 2
            r4 = r20
            r6 = r21
            r5 = r22
            X.6sZ r7 = new X.6sZ     // Catch:{ 24Y -> 0x00ec }
            r7.<init>(r6, r5, r0)     // Catch:{ 24Y -> 0x00ec }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00ec }
            java.lang.String r0 = "GetNewsletterMessagesJob/success "
            X.C18260x0.A1P(r1, r0, r7)     // Catch:{ 24Y -> 0x00ec }
            X.1gv r11 = r4.A00     // Catch:{ 24Y -> 0x00ec }
            java.lang.Long r0 = r11.afterServerId     // Catch:{ 24Y -> 0x00ec }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r11.fetchingForGaps     // Catch:{ 24Y -> 0x00ec }
            r17 = 1
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r17 = 0
        L_0x0027:
            X.2rc r10 = r11.A05     // Catch:{ 24Y -> 0x00ec }
            if (r10 != 0) goto L_0x0033
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x00ec }
            throw r0     // Catch:{ 24Y -> 0x00ec }
        L_0x0033:
            X.4uY r9 = r11.newsletterJid     // Catch:{ 24Y -> 0x00ec }
            long r1 = r11.count     // Catch:{ 24Y -> 0x00ec }
            boolean r0 = r11.fetchingForGaps     // Catch:{ 24Y -> 0x00ec }
            r16 = r0
            java.lang.Object r13 = r7.A01     // Catch:{ 24Y -> 0x00ec }
            X.6qs r13 = (X.C138716qs) r13     // Catch:{ 24Y -> 0x00ec }
            X.C162457s7.A0D(r13)     // Catch:{ 24Y -> 0x00ec }
            r12 = 0
            X.C162457s7.A0J(r9, r12)     // Catch:{ 24Y -> 0x00ec }
            java.lang.Object r0 = r13.A01     // Catch:{ 24Y -> 0x00ec }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ 24Y -> 0x00ec }
            int r14 = r0.size()     // Catch:{ 24Y -> 0x00ec }
            long r7 = (long) r14     // Catch:{ 24Y -> 0x00ec }
            int r15 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r15 >= 0) goto L_0x0077
            if (r17 == 0) goto L_0x0077
            X.2sL r15 = r10.A04     // Catch:{ 24Y -> 0x00ec }
            X.2ss r1 = r15.A02     // Catch:{ 24Y -> 0x00ec }
            X.31A r8 = r1.A0A(r9, r12)     // Catch:{ 24Y -> 0x00ec }
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo"
            X.C162457s7.A0K(r8, r1)     // Catch:{ 24Y -> 0x00ec }
            X.1RL r8 = (X.AnonymousClass1RL) r8     // Catch:{ 24Y -> 0x00ec }
            r1 = 1
            r8.A0M = r1     // Catch:{ 24Y -> 0x00ec }
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ 24Y -> 0x00ec }
            java.lang.String r2 = "oldest_message_retrieved"
            boolean r1 = r8.A0M     // Catch:{ 24Y -> 0x00ec }
            X.C382326g.A00(r7, r2, r1)     // Catch:{ 24Y -> 0x00ec }
            r15.A01(r7, r8)     // Catch:{ 24Y -> 0x00ec }
        L_0x0077:
            if (r14 == 0) goto L_0x00d7
            X.2ss r1 = r10.A02     // Catch:{ 24Y -> 0x00ec }
            X.31A r7 = r1.A0A(r9, r12)     // Catch:{ 24Y -> 0x00ec }
            X.1RL r7 = (X.AnonymousClass1RL) r7     // Catch:{ 24Y -> 0x00ec }
            if (r7 == 0) goto L_0x00d7
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00ec }
            java.lang.String r1 = "NewsletterMessageManager/processHistoricalMessages endReached = "
            r2.append(r1)     // Catch:{ 24Y -> 0x00ec }
            boolean r1 = r7.A0M     // Catch:{ 24Y -> 0x00ec }
            X.C18260x0.A1U(r2, r1)     // Catch:{ 24Y -> 0x00ec }
            java.lang.Object r1 = r13.A02     // Catch:{ 24Y -> 0x00ec }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 24Y -> 0x00ec }
            if (r1 != 0) goto L_0x009d
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 24Y -> 0x00ec }
        L_0x009d:
            long r20 = r1.longValue()     // Catch:{ 24Y -> 0x00ec }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 24Y -> 0x00ec }
        L_0x00a5:
            boolean r0 = r2.hasNext()     // Catch:{ 24Y -> 0x00ec }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.next()     // Catch:{ 24Y -> 0x00ec }
            X.6qn r1 = (X.C138666qn) r1     // Catch:{ 24Y -> 0x00ec }
            X.2nm r0 = r10.A0B     // Catch:{ 24Y -> 0x00ec }
            X.C162457s7.A0H(r1)     // Catch:{ 24Y -> 0x00ec }
            r22 = r12
            r17 = r0
            r18 = r9
            r19 = r1
            r17.A01(r18, r19, r20, r22)     // Catch:{ 24Y -> 0x00ec }
            goto L_0x00a5
        L_0x00c2:
            X.2Zx r8 = r10.A0C     // Catch:{ 24Y -> 0x00ec }
            if (r16 != 0) goto L_0x00e1
            boolean r7 = r7.A0M     // Catch:{ 24Y -> 0x00ec }
            X.3Wh r2 = r8.A02     // Catch:{ 24Y -> 0x00ec }
            r0 = 37
            X.5sI r1 = new X.5sI     // Catch:{ 24Y -> 0x00ec }
            r1.<init>(r8, r9, r0, r7)     // Catch:{ 24Y -> 0x00ec }
        L_0x00d1:
            X.C69253Wh.A01(r2, r1)     // Catch:{ 24Y -> 0x00ec }
            r10.A02(r9)     // Catch:{ 24Y -> 0x00ec }
        L_0x00d7:
            X.4Ap r1 = r11.callback     // Catch:{ 24Y -> 0x00ec }
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = r11.token     // Catch:{ 24Y -> 0x00ec }
            r1.Bjl(r0)     // Catch:{ 24Y -> 0x00ec }
            goto L_0x00eb
        L_0x00e1:
            X.3Wh r2 = r8.A02     // Catch:{ 24Y -> 0x00ec }
            r0 = 17
            X.3Zz r1 = new X.3Zz     // Catch:{ 24Y -> 0x00ec }
            r1.<init>(r8, r0, r9)     // Catch:{ 24Y -> 0x00ec }
            goto L_0x00d1
        L_0x00eb:
            return
        L_0x00ec:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessagesResponseSuccess: "
            X.C18260x0.A18(r0, r1, r2, r3)
            r0 = 4
            X.6sY r2 = new X.6sY     // Catch:{ 24Y -> 0x013c }
            r2.<init>((X.AnonymousClass36K) r6, (X.C35711xJ) r5, (int) r0)     // Catch:{ 24Y -> 0x013c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x013c }
            java.lang.String r0 = "GetNewsletterMessagesJob/error "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ 24Y -> 0x013c }
            java.lang.Object r9 = r2.A00     // Catch:{ 24Y -> 0x013c }
            X.4Bs r9 = (X.C84274Bs) r9     // Catch:{ 24Y -> 0x013c }
            X.1gv r8 = r4.A00     // Catch:{ 24Y -> 0x013c }
            X.4uY r7 = r8.newsletterJid     // Catch:{ 24Y -> 0x013c }
            X.2sL r2 = r8.A02     // Catch:{ 24Y -> 0x013c }
            if (r2 != 0) goto L_0x0119
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x013c }
        L_0x0118:
            throw r0     // Catch:{ 24Y -> 0x013c }
        L_0x0119:
            X.2se r0 = r8.A04     // Catch:{ 24Y -> 0x013c }
            if (r0 != 0) goto L_0x0125
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x013c }
            goto L_0x0118
        L_0x0125:
            X.2g3 r1 = new X.2g3     // Catch:{ 24Y -> 0x013c }
            r1.<init>(r2, r7, r0)     // Catch:{ 24Y -> 0x013c }
            X.2HJ r0 = new X.2HJ     // Catch:{ 24Y -> 0x013c }
            r0.<init>(r1)     // Catch:{ 24Y -> 0x013c }
            r9.Aw5(r0)     // Catch:{ 24Y -> 0x013c }
            X.4Ap r1 = r8.callback     // Catch:{ 24Y -> 0x013c }
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = r8.token     // Catch:{ 24Y -> 0x013c }
            r1.Bjl(r0)     // Catch:{ 24Y -> 0x013c }
            return
        L_0x013c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessagesResponseClientError: "
            X.C18260x0.A18(r0, r1, r2, r3)
            r0 = 1
            X.6sZ r2 = new X.6sZ     // Catch:{ 24Y -> 0x0161 }
            r2.<init>(r6, r5, r0)     // Catch:{ 24Y -> 0x0161 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0161 }
            java.lang.String r0 = "GetNewsletterMessagesJob/server error "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ 24Y -> 0x0161 }
            X.1gv r0 = r4.A00     // Catch:{ 24Y -> 0x0161 }
            X.4Ap r1 = r0.callback     // Catch:{ 24Y -> 0x0161 }
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = r0.token     // Catch:{ 24Y -> 0x0161 }
            r1.Bjl(r0)     // Catch:{ 24Y -> 0x0161 }
        L_0x0160:
            return
        L_0x0161:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessagesResponseServerError: "
            X.24Y r0 = X.AnonymousClass24Y.A03(r0, r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KT.A01(X.2HK, X.36K, X.1xJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd A[Catch:{ 24Y -> 0x00e4, 24Y -> 0x0134 }, LOOP:0: B:43:0x00b7->B:45:0x00bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00de A[Catch:{ 24Y -> 0x00e4, 24Y -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[Catch:{ 24Y -> 0x0159 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass2HL r23, X.AnonymousClass36K r24, X.C35721xK r25) {
        /*
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r0 = 10
            r9 = r23
            r8 = r24
            r7 = r25
            X.6sb r2 = new X.6sb     // Catch:{ 24Y -> 0x00e4 }
            r2.<init>((X.AnonymousClass36K) r8, (X.C35721xK) r7, (int) r0)     // Catch:{ 24Y -> 0x00e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00e4 }
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/success "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ 24Y -> 0x00e4 }
            X.1gu r5 = r9.A00     // Catch:{ 24Y -> 0x00e4 }
            boolean r0 = r5.isCancelled     // Catch:{ 24Y -> 0x00e4 }
            if (r0 != 0) goto L_0x0158
            X.2rc r4 = r5.A04     // Catch:{ 24Y -> 0x00e4 }
            if (r4 != 0) goto L_0x002c
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x00e4 }
            throw r0     // Catch:{ 24Y -> 0x00e4 }
        L_0x002c:
            X.4uY r3 = r5.newsletterJid     // Catch:{ 24Y -> 0x00e4 }
            long r15 = r5.count     // Catch:{ 24Y -> 0x00e4 }
            java.lang.Long r0 = r5.beforeServerId     // Catch:{ 24Y -> 0x00e4 }
            r21 = r0
            java.lang.Long r0 = r5.afterServerId     // Catch:{ 24Y -> 0x00e4 }
            r22 = r0
            java.lang.Object r11 = r2.A01     // Catch:{ 24Y -> 0x00e4 }
            X.6qs r11 = (X.C138716qs) r11     // Catch:{ 24Y -> 0x00e4 }
            X.C162457s7.A0D(r11)     // Catch:{ 24Y -> 0x00e4 }
            r0 = 0
            X.C162457s7.A0J(r3, r0)     // Catch:{ 24Y -> 0x00e4 }
            java.lang.Object r0 = r11.A02     // Catch:{ 24Y -> 0x00e4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 24Y -> 0x00e4 }
            if (r0 == 0) goto L_0x00da
            long r0 = r0.longValue()     // Catch:{ 24Y -> 0x00e4 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00e4 }
            java.lang.String r2 = "NewsletterMessageManager/processFetchedMessagesUpdates new last update ts = "
            X.C18260x0.A10(r2, r10, r0)     // Catch:{ 24Y -> 0x00e4 }
            X.2rZ r13 = r4.A08     // Catch:{ 24Y -> 0x00e4 }
            X.3dV r2 = r13.A05     // Catch:{ SQLNonTransientException -> 0x00a9, IllegalArgumentException -> 0x00a5 }
            X.4Fq r10 = r2.A04()     // Catch:{ SQLNonTransientException -> 0x00a9, IllegalArgumentException -> 0x00a5 }
            X.3Yo r12 = r10.Axl()     // Catch:{ all -> 0x009e }
            r2 = r10
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0097 }
            X.2sg r2 = r2.A03     // Catch:{ all -> 0x0097 }
            r25 = r2
            java.lang.String r17 = "newsletter_message"
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0097 }
            java.lang.String r14 = "extra_table_last_update_ts"
            X.C18270x1.A0c(r2, r14, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r18 = "chat_row_id = ? AND server_message_id < ? AND server_message_id > ?"
            r23 = r15
            r19 = r13
            r20 = r3
            java.lang.String[] r20 = r19.A06(r20, r21, r22, r23)     // Catch:{ all -> 0x0097 }
            java.lang.String r19 = "UPDATE_NEWSLETTER_MESSAGE_TABLE_MESSAGE_UPDATES_REQUEST"
            r15 = r25
            r16 = r2
            r15.A05(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0097 }
            r12.A00()     // Catch:{ all -> 0x0097 }
            r12.close()     // Catch:{ all -> 0x009e }
            r10.close()     // Catch:{ SQLNonTransientException -> 0x00a9, IllegalArgumentException -> 0x00a5 }
            goto L_0x00af
        L_0x0097:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r2 = move-exception
            X.AnonymousClass2A8.A00(r12, r13)     // Catch:{ all -> 0x009e }
            throw r2     // Catch:{ all -> 0x009e }
        L_0x009e:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r2 = move-exception
            X.AnonymousClass2A8.A00(r10, r12)     // Catch:{ SQLNonTransientException -> 0x00a9, IllegalArgumentException -> 0x00a5 }
            throw r2     // Catch:{ SQLNonTransientException -> 0x00a9, IllegalArgumentException -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            java.lang.String r2 = "NewsletterMessageStore/failed to update the message due to message constraints"
            goto L_0x00ac
        L_0x00a9:
            r10 = move-exception
            java.lang.String r2 = "NewsletterMessageStore/failed to update the message"
        L_0x00ac:
            com.whatsapp.util.Log.e(r2, r10)     // Catch:{ 24Y -> 0x00e4 }
        L_0x00af:
            java.lang.Object r2 = r11.A01     // Catch:{ 24Y -> 0x00e4 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ 24Y -> 0x00e4 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ 24Y -> 0x00e4 }
        L_0x00b7:
            boolean r2 = r10.hasNext()     // Catch:{ 24Y -> 0x00e4 }
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r10.next()     // Catch:{ 24Y -> 0x00e4 }
            X.6qn r2 = (X.C138666qn) r2     // Catch:{ 24Y -> 0x00e4 }
            X.2nm r11 = r4.A0B     // Catch:{ 24Y -> 0x00e4 }
            X.C162457s7.A0H(r2)     // Catch:{ 24Y -> 0x00e4 }
            r16 = 0
            r12 = r3
            r13 = r2
            r14 = r0
            r11.A01(r12, r13, r14, r16)     // Catch:{ 24Y -> 0x00e4 }
            goto L_0x00b7
        L_0x00d1:
            X.2Zx r2 = r4.A0C     // Catch:{ 24Y -> 0x00e4 }
            X.3Wh r1 = r2.A02     // Catch:{ 24Y -> 0x00e4 }
            r0 = 13
            X.C69253Wh.A00(r1, r2, r3, r0)     // Catch:{ 24Y -> 0x00e4 }
        L_0x00da:
            X.4GQ r1 = r5.callback     // Catch:{ 24Y -> 0x00e4 }
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = r5.token     // Catch:{ 24Y -> 0x00e4 }
            r1.invoke(r0)     // Catch:{ 24Y -> 0x00e4 }
            return
        L_0x00e4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseSuccess: "
            X.C18260x0.A18(r0, r1, r2, r6)
            r0 = 2
            X.6sY r2 = new X.6sY     // Catch:{ 24Y -> 0x0134 }
            r2.<init>((X.AnonymousClass36K) r8, (X.C35721xK) r7, (int) r0)     // Catch:{ 24Y -> 0x0134 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0134 }
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/error "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ 24Y -> 0x0134 }
            java.lang.Object r5 = r2.A00     // Catch:{ 24Y -> 0x0134 }
            X.4Br r5 = (X.C84264Br) r5     // Catch:{ 24Y -> 0x0134 }
            X.1gu r4 = r9.A00     // Catch:{ 24Y -> 0x0134 }
            X.4uY r3 = r4.newsletterJid     // Catch:{ 24Y -> 0x0134 }
            X.2sL r2 = r4.A01     // Catch:{ 24Y -> 0x0134 }
            if (r2 != 0) goto L_0x0111
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x0134 }
        L_0x0110:
            throw r0     // Catch:{ 24Y -> 0x0134 }
        L_0x0111:
            X.2se r0 = r4.A03     // Catch:{ 24Y -> 0x0134 }
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 24Y -> 0x0134 }
            goto L_0x0110
        L_0x011d:
            X.2g3 r1 = new X.2g3     // Catch:{ 24Y -> 0x0134 }
            r1.<init>(r2, r3, r0)     // Catch:{ 24Y -> 0x0134 }
            X.2HI r0 = new X.2HI     // Catch:{ 24Y -> 0x0134 }
            r0.<init>(r1)     // Catch:{ 24Y -> 0x0134 }
            r5.Aw4(r0)     // Catch:{ 24Y -> 0x0134 }
            X.4GQ r1 = r4.callback     // Catch:{ 24Y -> 0x0134 }
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = r4.token     // Catch:{ 24Y -> 0x0134 }
            r1.invoke(r0)     // Catch:{ 24Y -> 0x0134 }
            return
        L_0x0134:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseClientError: "
            X.C18260x0.A18(r0, r1, r2, r6)
            r0 = 3
            X.6sY r2 = new X.6sY     // Catch:{ 24Y -> 0x0159 }
            r2.<init>((X.AnonymousClass36K) r8, (X.C35721xK) r7, (int) r0)     // Catch:{ 24Y -> 0x0159 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0159 }
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/server error "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ 24Y -> 0x0159 }
            X.1gu r0 = r9.A00     // Catch:{ 24Y -> 0x0159 }
            X.4GQ r1 = r0.callback     // Catch:{ 24Y -> 0x0159 }
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = r0.token     // Catch:{ 24Y -> 0x0159 }
            r1.invoke(r0)     // Catch:{ 24Y -> 0x0159 }
        L_0x0158:
            return
        L_0x0159:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseServerError: "
            X.24Y r0 = X.AnonymousClass24Y.A03(r0, r1, r2, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KT.A02(X.2HL, X.36K, X.1xK):void");
    }

    public static void A03(AnonymousClass2HM r15, AnonymousClass36K r16, C35711xJ r17) {
        RuntimeException A0S;
        RuntimeException A0S2;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K r4 = r16;
        C35711xJ r1 = r17;
        AnonymousClass2HM r2 = r15;
        try {
            C139776sb r7 = new C139776sb(r4, r1, 11);
            C18260x0.A1P(AnonymousClass001.A0o(), "GetNewsletterMyAddOnsMessagesJob/success ", r7);
            C28451gt r0 = r15.A00;
            AnonymousClass33p r5 = r0.A00;
            if (r5 == null) {
                A0S2 = C18270x1.A0S("waSharedPreferences");
            } else {
                C18270x1.A0f(C18270x1.A03(r5), "newsletter_my_reactions_fetched");
                loop0:
                for (C138956rH r52 : (Iterable) r7.A01) {
                    C95804uY r12 = (C95804uY) r52.A00;
                    C162457s7.A0D(r12);
                    Iterator it = ((Iterable) r52.A01).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C138666qn r53 = (C138666qn) it.next();
                            C162457s7.A0H(r53);
                            C138716qs r6 = (C138716qs) r53.A00;
                            C162457s7.A0D(r6);
                            long A03 = C18320x8.A03((Number) r6.A02);
                            AnonymousClass56S r54 = (AnonymousClass56S) r6.A01;
                            if (r54 != null) {
                                String str = r54.A02;
                                C162457s7.A0D(str);
                                long A032 = C18320x8.A03((Number) r54.A01);
                                C50462iD r11 = r0.A04;
                                if (r11 == null) {
                                    A0S2 = C18270x1.A0S("newsletterIncomingMessageManager");
                                    break loop0;
                                }
                                r11.A00(r12, str, A03, A032);
                            }
                            C138716qs r72 = (C138716qs) r6.A00;
                            if (r72 != null) {
                                HashSet A0K = AnonymousClass002.A0K();
                                Iterator A0q = C18320x8.A0q(r72.A02);
                                while (A0q.hasNext()) {
                                    String A0t = C18290x4.A0t((byte[]) ((C138666qn) A0q.next()).A00);
                                    C162457s7.A0D(A0t);
                                    A0K.add(A0t);
                                }
                                long A033 = C18320x8.A03((Number) r72.A01);
                                C50462iD r112 = r0.A04;
                                if (r112 == null) {
                                    A0S2 = C18270x1.A0S("newsletterIncomingMessageManager");
                                    break loop0;
                                }
                                r112.A01(r12, A0K, A03, A033);
                            }
                        }
                    }
                }
                return;
            }
            throw A0S2;
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("MyAddOnsResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            C139746sY r62 = new C139746sY(r4, r1, 5);
            C18260x0.A1P(AnonymousClass001.A0o(), "GetNewsletterMyAddOnsMessagesJob/error ", r62);
            C28451gt r02 = r2.A00;
            C95804uY r73 = r02.newsletterJid;
            if (r73 != null) {
                C84284Bt r63 = (C84284Bt) r62.A00;
                C56652sL r55 = r02.A01;
                if (r55 == null) {
                    A0S = C18270x1.A0S("newsletterStore");
                } else {
                    C56842se r03 = r02.A03;
                    if (r03 == null) {
                        A0S = C18270x1.A0S("newsletterManager");
                    } else {
                        r63.Aw6(new AnonymousClass2HN(new C49142g3(r55, r73, r03)));
                        return;
                    }
                }
                throw A0S;
            }
        } catch (AnonymousClass24Y e2) {
            C18260x0.A18("MyAddOnsResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
            try {
                C18260x0.A1P(AnonymousClass001.A0o(), "GetNewsletterMyAddOnsMessagesJob/server error ", new C139746sY(r4, r1, 6));
            } catch (AnonymousClass24Y e3) {
                throw AnonymousClass24Y.A03("MyAddOnsResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
            }
        }
    }

    public AnonymousClass4KT(C28451gt r2, C35711xJ r3) {
        this.A02 = 12;
        this.A00 = r3;
        this.A01 = new AnonymousClass2HM(r2);
    }

    public AnonymousClass4KT(C28461gu r2, C35721xK r3) {
        this.A02 = 11;
        this.A00 = r3;
        this.A01 = new AnonymousClass2HL(r2);
    }

    public AnonymousClass4KT(C28471gv r2, C35711xJ r3) {
        this.A02 = 10;
        this.A00 = r3;
        this.A01 = new AnonymousClass2HK(r2);
    }
}
