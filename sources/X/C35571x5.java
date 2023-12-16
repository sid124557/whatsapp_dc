package X;

import com.whatsapp.R;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBotsSerializer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.UsernameViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1x5  reason: invalid class name and case insensitive filesystem */
public class C35571x5 extends C41042Is implements AnonymousClass4EZ, AnonymousClass4GD {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35571x5(C35201wU r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A02(C41222Jk r1) {
        AnonymousClass2ZO r12 = r1.A00;
        Log.d("BotProfileSyncManager/fetchBotProfileList failure");
        r12.A00.A05(Boolean.FALSE);
    }

    public void BQs(String str) {
        switch (this.A01) {
            case 0:
            case 4:
                return;
            case 1:
                C162457s7.A0J(str, 0);
                Log.d("addtowaitlistprotocolhelper/delivery failure");
                ((C40172Eu) this.A00).A00.A00();
                return;
            case 2:
                Log.w("GetChatbotListProtocolHelper/onDeliveryFailure");
                A02((C41222Jk) this.A00);
                return;
            case 3:
                C162457s7.A0J(str, 0);
                Log.d("getwaitliststateprotocolhelper/delivery failure");
                ((C40212Ey) this.A00).A00.A00.BSk();
                return;
            case 6:
                ((AnonymousClass2IL) this.A00).A00.A0E(C33011sI.A00);
                return;
            case 8:
                C162457s7.A0J(str, 0);
                Log.d("bottosgetprotocolhelper/delivery failure");
                ((AnonymousClass2F2) this.A00).A00.BSk();
                return;
            case 9:
                C162457s7.A0J(str, 0);
                Log.d("bottosacceptprotocolhelper/delivery failure");
                ((AnonymousClass2F0) this.A00).A00.BSk();
                return;
            default:
                ((AnonymousClass2IM) this.A00).A00.A0F(C33031sK.A00);
                return;
        }
    }

    public void BSN(AnonymousClass36K r3, String str) {
        int i = this.A01;
        C35201wU r1 = this.A00;
        switch (i) {
            case 0:
                A00((C41132Jb) this.A00, r3, (C35701xI) r1);
                return;
            case 1:
                A01((C40172Eu) this.A00, r3, (C35721xK) r1);
                return;
            case 2:
                A03((C41222Jk) this.A00, r3, (C35641xC) r1);
                return;
            case 3:
                A04((C40212Ey) this.A00, r3, (C35721xK) r1);
                return;
            case 4:
                A07(r3, (AnonymousClass2I7) this.A00, (C35721xK) r1);
                return;
            case 5:
                A09(r3, (AnonymousClass2IM) this.A00, (C35711xJ) r1);
                return;
            case 6:
                A08(r3, (AnonymousClass2IL) this.A00, (C35711xJ) r1);
                return;
            case 7:
                A0A(r3, (AnonymousClass2IM) this.A00, (C35711xJ) r1);
                return;
            case 8:
                A06((AnonymousClass2F2) this.A00, r3, (C35711xJ) r1);
                return;
            default:
                A05((AnonymousClass2F0) this.A00, r3, (C35711xJ) r1);
                return;
        }
    }

    public void BdM(AnonymousClass36K r3, String str) {
        int i = this.A01;
        C35201wU r1 = this.A00;
        switch (i) {
            case 0:
                A00((C41132Jb) this.A00, r3, (C35701xI) r1);
                return;
            case 1:
                A01((C40172Eu) this.A00, r3, (C35721xK) r1);
                return;
            case 2:
                A03((C41222Jk) this.A00, r3, (C35641xC) r1);
                return;
            case 3:
                A04((C40212Ey) this.A00, r3, (C35721xK) r1);
                return;
            case 4:
                A07(r3, (AnonymousClass2I7) this.A00, (C35721xK) r1);
                return;
            case 5:
                A09(r3, (AnonymousClass2IM) this.A00, (C35711xJ) r1);
                return;
            case 6:
                A08(r3, (AnonymousClass2IL) this.A00, (C35711xJ) r1);
                return;
            case 7:
                A0A(r3, (AnonymousClass2IM) this.A00, (C35711xJ) r1);
                return;
            case 8:
                A06((AnonymousClass2F2) this.A00, r3, (C35711xJ) r1);
                return;
            default:
                A05((AnonymousClass2F0) this.A00, r3, (C35711xJ) r1);
                return;
        }
    }

    public static void A00(C41132Jb r11, AnonymousClass36K r12, C35701xI r13) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C35751xN r6 = new C35751xN(r12, r13);
            Log.i("UpdateOptOutListResponseSuccessWithMatch");
            C58182uq r4 = r11.A00;
            AnonymousClass2N8 r8 = r11.A01;
            C35011wB r0 = r6.A02;
            C162457s7.A0D(r0);
            C69903Yy r3 = new C69903Yy();
            r0.A00.Aw1(new AnonymousClass2N7(r4, r0.A01, r3));
            Object obj = r3.element;
            String str = r6.A03;
            C162457s7.A0D(str);
            if (obj != null) {
                C61012zY r42 = r8.A01;
                int i = r8.A00;
                UserJid userJid = r8.A02;
                C61012zY.A00(new C41142Jc(new C41122Ja(userJid, (String) null), i), r42, str, C18290x4.A12(obj));
                C69263Wi.A09(r42.A00, r42, userJid, 13);
            }
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("UpdateOptOutListResponseSuccessWithMatch: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C35761xO r1 = new C35761xO(r12, r13);
                Log.i("UpdateOptOutListResponseSuccessWithMismatch");
                C58182uq r9 = r11.A00;
                AnonymousClass2N8 r82 = r11.A01;
                ArrayList A0s2 = AnonymousClass001.A0s();
                List<C138626qj> list = r1.A03;
                String str2 = r1.A02;
                C162457s7.A0D(str2);
                for (C138626qj r02 : list) {
                    C35011wB r03 = (C35011wB) r02.A00;
                    C162457s7.A0D(r03);
                    C69903Yy r32 = new C69903Yy();
                    r03.A00.Aw1(new AnonymousClass2N7(r9, r03.A01, r32));
                    Object obj2 = r32.element;
                    if (obj2 != null) {
                        A0s2.add(obj2);
                    }
                    C61012zY r43 = r82.A01;
                    int i2 = r82.A00;
                    UserJid userJid2 = r82.A02;
                    C61012zY.A00(new C41142Jc(new C41122Ja(userJid2, (String) null), i2), r43, str2, A0s2);
                    C69263Wi.A09(r43.A00, r43, userJid2, 13);
                }
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("UpdateOptOutListResponseSuccessWithMismatch: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    new C139776sb(r12, r13, 0);
                    Log.e("UpdateOptOutListResponseInvalidRequest");
                    AnonymousClass2N8 r44 = r11.A01;
                    C61012zY r33 = r44.A01;
                    C69263Wi r2 = r33.A00;
                    r2.A0I(R.string.f11nameremoved, 1);
                    C69263Wi.A09(r2, r33, r44.A02, 13);
                } catch (AnonymousClass24Y e3) {
                    C18260x0.A18("UpdateOptOutListResponseInvalidRequest: ", AnonymousClass001.A0o(), e3, A0s);
                    try {
                        new C139776sb(r12, r13, 1);
                        Log.e("UpdateOptOutListResponseServerError");
                        AnonymousClass2N8 r14 = r11.A01;
                        C61012zY r34 = r14.A01;
                        C69263Wi r22 = r34.A00;
                        r22.A0I(R.string.f11nameremoved, 1);
                        C69263Wi.A09(r22, r34, r14.A02, 13);
                    } catch (AnonymousClass24Y e4) {
                        throw AnonymousClass24Y.A03("UpdateOptOutListResponseServerError: ", AnonymousClass001.A0o(), e4, A0s);
                    }
                }
            }
        }
    }

    public static void A01(C40172Eu r10, AnonymousClass36K r11, C35721xK r12) {
        C372121j r6;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            String str = new C35791xR(r11, r12).A01;
            int hashCode = str.hashCode();
            if (hashCode != -960387887) {
                if (hashCode == -362366888 ? str.equals("Added to waitlist") : !(hashCode != 66974734 || !str.equals("In waitlist"))) {
                    r6 = C372121j.IN_WAITLIST;
                }
                C18260x0.A0q("addtowaitlistprotocolhelper/failure, unknown state ", str, AnonymousClass001.A0o());
                r10.A00.A00();
                return;
            }
            if (str.equals("AI available")) {
                r6 = C372121j.AI_AVAILABLE;
            }
            C18260x0.A0q("addtowaitlistprotocolhelper/failure, unknown state ", str, AnonymousClass001.A0o());
            r10.A00.A00();
            return;
            C18260x0.A1P(AnonymousClass001.A0o(), "addtowaitlistprotocolhelper/success/state=", r6);
            AnonymousClass2ZP r1 = r10.A00;
            C162457s7.A0J(r6, 0);
            C59702xL r5 = r1.A02;
            r5.A06.BkM(new C71593cM((Object) r5, (Object) r6, (Object) r1.A00, (Object) r1.A01, 20));
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("AddToWaitlistResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C139776sb r13 = new C139776sb(r11, r12, 2);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("addtowaitlistprotocolhelper/failure, code=");
                String A002 = ((C34911w1) r13.A00).A00();
                A0o.append(A002);
                C18260x0.A0q(" text=", A002, A0o);
                r10.A00.A00();
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("AddToWaitlistResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public static void A03(C41222Jk r14, AnonymousClass36K r15, C35641xC r16) {
        long j;
        C72183dJ r10;
        ArrayList A0s = AnonymousClass001.A0s();
        C35641xC r5 = r16;
        AnonymousClass36K r6 = r15;
        C41222Jk r4 = r14;
        try {
            new C35811xT(r15, r5);
            Log.e("GetChatbotListProtocolHelper/v1 not implemented, deprecated");
            A02(r14);
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("BotListResponseSuccessV1: ", AnonymousClass001.A0o(), e, A0s);
            try {
                DiscoveryBots A002 = DiscoveryBotsSerializer.A00.B3b(AnonymousClass3Z6.A02(new C35821xU(r15, r5), C56612sH.A09(r14.A01.A00)));
                if (A002 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("GetChatbotListProtocolHelper/get a list of chatbot, sections=");
                    List list = A002.A02;
                    C18260x0.A1F(A0o, list.size());
                    AnonymousClass2ZO r7 = r14.A00;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass000.A1H("BotProfileSyncManager/fetchBotProfileList received ", A0o2, list);
                    C18260x0.A1J(A0o2, " bots sections");
                    C44672Xa r9 = r7.A02.A00;
                    JSONObject A0l = AnonymousClass0x2.A0l(A002);
                    A0l.put("default_bot", AnonymousClass3EN.A00(A002.A01));
                    A0l.put("sections", AnonymousClass31K.A02(AnonymousClass3EL.A00, list));
                    A0l.put("timestamp_ms", A002.A00);
                    String obj = A0l.toString();
                    C162457s7.A0H(obj);
                    AnonymousClass7KQ r0 = r9.A00;
                    C162457s7.A0J(obj, 0);
                    AnonymousClass33p r2 = r0.A00;
                    C18270x1.A0j(C18270x1.A03(r2), "bonsai_bots_response", obj);
                    C18260x0.A0K(r2, "bonsai_last_bots_update_ms");
                    r9.A01 = A002;
                    C40192Ew r102 = r7.A01;
                    AnonymousClass3XA r92 = new AnonymousClass3XA();
                    Collection<C52822m6> A003 = AnonymousClass25B.A00(A002);
                    LinkedHashSet A17 = AnonymousClass0x9.A17();
                    for (C52822m6 r02 : A003) {
                        A17.add(r02.A01);
                    }
                    Log.d("BotProfileSyncManager/requestSyncBotProfiles");
                    AnonymousClass3XA r22 = new AnonymousClass3XA();
                    C47082cg r1 = r102.A00;
                    C64223Cq r11 = r1.A03;
                    C116985rC r103 = r11.A00;
                    if (!r103.A07() || !((C56722sS) r103.A04()).A01.A00()) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C18260x0.A19("contactsyncmethods/requestSyncBotWithRetry/bonsai disabled, size=", A0o3, A17);
                        AnonymousClass0x2.A19(A0o3);
                        AnonymousClass304 r03 = AnonymousClass304.A03;
                        r10 = new C72183dJ();
                        r10.BQt(r03);
                    } else {
                        C18260x0.A1A("contactsyncmethods/requestSyncBotWithRetry/start sync user bot size=", AnonymousClass001.A0o(), A17);
                        r10 = r11.A02(C59812xW.A0E, AnonymousClass227.A05, AnonymousClass0x9.A15(A17), true, true);
                    }
                    AnonymousClass4FS r112 = r1.A07;
                    C18290x4.A1M(r112, r10, r22, 36);
                    Log.d("BotProfileSyncManager/requestSyncProfilePictures");
                    AnonymousClass3XA r104 = new AnonymousClass3XA();
                    C70323aJ.A00(r112, A17, r1, r104, 3);
                    AnonymousClass3XA[] r04 = new AnonymousClass3XA[2];
                    C18280x3.A19(r22, r104, r04);
                    AnonymousClass3XA.A01(new AnonymousClass1I2(Arrays.asList(r04)), r92, 1);
                    AnonymousClass3XA.A01(r92, r7.A00, 2);
                    return;
                }
                Log.d("GetChatbotListProtocolHelper/failed to parse bots");
                A02(r14);
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("BotListResponseSuccessV2: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    C139776sb r12 = new C139776sb(r6, r5);
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("GetChatbotListProtocolHelper/get list error code=");
                    switch (((C34911w1) r12.A00).A00) {
                        case 0:
                            j = 400;
                            break;
                        case 1:
                            j = 403;
                            break;
                        case 2:
                            j = 500;
                            break;
                        default:
                            j = 405;
                            break;
                    }
                    A0o4.append(Long.valueOf(j).longValue());
                    C18280x3.A13(A0o4);
                    A02(r4);
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("BotListResponseError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }

    public static void A04(C40212Ey r6, AnonymousClass36K r7, C35721xK r8) {
        C372121j r5;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            String str = new C35801xS(r7, r8).A01;
            int hashCode = str.hashCode();
            if (hashCode != -960387887) {
                if (hashCode == 66974734 && str.equals("In waitlist")) {
                    r5 = C372121j.IN_WAITLIST;
                }
                C18260x0.A0q("getwaitliststateprotocolhelper/failure, unknown state ", str, AnonymousClass001.A0o());
                r6.A00.A00.BSk();
                return;
            }
            if (str.equals("AI available")) {
                r5 = C372121j.AI_AVAILABLE;
            }
            C18260x0.A0q("getwaitliststateprotocolhelper/failure, unknown state ", str, AnonymousClass001.A0o());
            r6.A00.A00.BSk();
            return;
            C18260x0.A1P(AnonymousClass001.A0o(), "getwaitliststateprotocolhelper/success/state=", r5);
            C41262Jo r1 = r6.A00;
            C162457s7.A0J(r5, 0);
            C59702xL r4 = r1.A01;
            C70323aJ.A00(r4.A06, r4, r5, r1.A00, 5);
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("UserStateResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C139776sb r12 = new C139776sb(r7, r8, 4);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("getwaitliststateprotocolhelper/failure, code=");
                String A002 = ((C34911w1) r12.A00).A00();
                A0o.append(A002);
                C18260x0.A0q(" text=", A002, A0o);
                r6.A00.A00.BSk();
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("UserStateResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public static void A05(AnonymousClass2F0 r4, AnonymousClass36K r5, C35711xJ r6) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            new C139776sb(r5, r6, 21);
            Log.d("bottosacceptprotocolhelper/success");
            r4.A00.onSuccess();
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("SetResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                new C139776sb(r5, r6, 19);
                Log.d("bottosacceptprotocolhelper/client error");
                r4.A00.BSk();
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("SetResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    new C139776sb(r5, r6, 20);
                    Log.d("bottosacceptprotocolhelper/server error");
                    r4.A00.BSk();
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("SetResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }

    public static void A06(AnonymousClass2F2 r11, AnonymousClass36K r12, C35711xJ r13) {
        boolean z;
        boolean z2;
        AnonymousClass21Y r0;
        AnonymousClass21Y r02;
        boolean z3;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C139776sb r1 = new C139776sb(r12, r13, 17);
            Log.d("bottosgetprotocolhelper/success");
            AnonymousClass4CS r4 = r11.A00;
            Iterable<C34851vv> iterable = (Iterable) r1.A01;
            int A0I = AnonymousClass8UG.A0I(C73783g4.A0b(iterable, 10));
            if (A0I < 16) {
                A0I = 16;
            }
            LinkedHashMap A0C = C18330xA.A0C(A0I);
            for (C34851vv r03 : iterable) {
                C138956rH r04 = (C138956rH) r03.A00;
                Object obj = r04.A00;
                Number number = (Number) r04.A01;
                if (number != null) {
                    int i = (number.longValue() > 5 ? 1 : (number.longValue() == 5 ? 0 : -1));
                    z3 = true;
                    if (i == 0) {
                        AnonymousClass000.A1C(obj, A0C, z3);
                    }
                }
                z3 = false;
                AnonymousClass000.A1C(obj, A0C, z3);
            }
            AnonymousClass4JA r42 = (AnonymousClass4JA) r4;
            if (r42.A02 != 0) {
                Log.i("WabaiConsentManager/sync/success");
                Boolean bool = (Boolean) C18280x3.A0W(A0C, 20231027);
                if (bool != null && bool.booleanValue()) {
                    ((C54282oT) ((C43412Sa) r42.A01).A05.getValue()).A01("yes", true);
                }
                ((C84164Bh) r42.A00).BaR(true);
                return;
            }
            Log.i("BonsaiTos/sync/success");
            Boolean bool2 = (Boolean) C18280x3.A0W(A0C, 20230902);
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            Boolean bool3 = (Boolean) C18280x3.A0W(A0C, 20230901);
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            } else {
                z2 = false;
            }
            C54862pP r5 = (C54862pP) r42.A01;
            C54282oT r14 = (C54282oT) r5.A05.getValue();
            if (z) {
                r0 = AnonymousClass21Y.A02;
            } else {
                r0 = AnonymousClass21Y.A03;
            }
            r14.A01(r0, true);
            C54282oT r15 = (C54282oT) r5.A04.getValue();
            if (z2) {
                r02 = AnonymousClass21Y.A02;
            } else {
                r02 = AnonymousClass21Y.A03;
            }
            r15.A01(r02, true);
            ((AnonymousClass4GP) r42.A00).invoke();
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("GetDisclosureStageByIdsResponseClientSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                new C139776sb(r12, r13, 16);
                Log.d("bottosgetprotocolhelper/client error");
                r11.A00.BSk();
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("GetDisclosureStageByIdsResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    new C139776sb(r12, r13, 18);
                    Log.d("bottosgetprotocolhelper/server error");
                    r11.A00.BSk();
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("GetDisclosureStageByIdsResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }

    public static void A07(AnonymousClass36K r6, AnonymousClass2I7 r7, C35721xK r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Iterator A0q = C18320x8.A0q(new C139776sb(r6, r8, 5).A01);
            while (A0q.hasNext()) {
                C35001wA r0 = (C35001wA) A0q.next();
                String str = r0.A00;
                C162457s7.A0D(str);
                boolean parseBoolean = Boolean.parseBoolean(r0.A01);
                AnonymousClass33p r2 = r7.A00.A00;
                C18270x1.A0v(r2, str, parseBoolean);
                C18270x1.A0i(C18270x1.A03(r2), "pref_ctwa_ep_config_sync_last_time", System.currentTimeMillis());
            }
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("FetchAdIntentForSurfacesResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                AnonymousClass36K A02 = C41032Ir.A02(r6, r8);
                C626836d.A04(r6, C86304Jp.A00(28), new String[]{"error"});
                C626836d.A0E(A02, r6, 7);
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("FetchAdIntentForSurfacesResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public static void A08(AnonymousClass36K r6, AnonymousClass2IL r7, C35711xJ r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C35781xQ r0 = new C35781xQ(r6, r8);
            UsernameViewModel usernameViewModel = r7.A00;
            String str = r0.A01;
            C162457s7.A0D(str);
            usernameViewModel.A0E(new C32991sG(str));
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("GetResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C84784Dr r1 = (C84784Dr) new C139776sb(r6, r8, 14).A00;
                long A03 = C18320x8.A03(r1.B5b());
                String BDZ = r1.BDZ();
                C162457s7.A0D(BDZ);
                r7.A00.A0E(new C33001sH(A03, BDZ));
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("GetResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public static void A09(AnonymousClass36K r6, AnonymousClass2IM r7, C35711xJ r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            new C139746sY(r6, r8, 12);
            r7.A00.A0F(C33041sL.A00);
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("DeleteResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C84774Dq r1 = (C84774Dq) new C139776sb(r6, r8, 13).A00;
                long A03 = C18320x8.A03(r1.B5b());
                String BDZ = r1.BDZ();
                C162457s7.A0D(BDZ);
                r7.A00.A0F(new C33021sJ(A03, BDZ));
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("DeleteResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public static void A0A(AnonymousClass36K r6, AnonymousClass2IM r7, C35711xJ r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            new C139746sY(r6, r8, 13);
            r7.A00.A0F(C33041sL.A00);
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("SetResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C84794Ds r1 = (C84794Ds) new C139776sb(r6, r8, 15).A00;
                long A03 = C18320x8.A03(r1.B5b());
                String BDZ = r1.BDZ();
                C162457s7.A0D(BDZ);
                r7.A00.A0F(new C33021sJ(A03, BDZ));
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("SetResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }
}
