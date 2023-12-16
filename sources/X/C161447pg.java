package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: X.7pg  reason: invalid class name and case insensitive filesystem */
public final class C161447pg {
    public C159127lA A00;
    public final AnonymousClass2VN A01;
    public final AnonymousClass2VO A02;
    public final AnonymousClass2E4 A03;
    public final C69263Wi A04;
    public final C56612sH A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass31C A07;
    public final AnonymousClass282 A08;
    public final AnonymousClass7SQ A09;
    public final C29541iz A0A;
    public final AnonymousClass1j0 A0B;
    public final C40622Hc A0C;
    public final AnonymousClass2Oj A0D;
    public final C44522Wj A0E;
    public final C44542Wl A0F;
    public final C48182eU A0G;
    public final C40642He A0H;
    public final C51052jC A0I;
    public final AnonymousClass2Z4 A0J;
    public final C183538qC A0K;
    public final String A0L;
    public final Map A0M;
    public final Map A0N;
    public final Map A0O;
    public final Map A0P;

    public final C35251wZ A02() {
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
        AnonymousClass3Z6.A04("session-id", this.A0F.A00(), r2);
        r2[1] = AnonymousClass3Z6.A02("bloks-versioning-id", "6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9");
        r2[2] = AnonymousClass3Z6.A02("phoenix-versioning-id", "ce07772e7ab2c60d4def52839c1ca2016cd29cd9a2ad4b028c19245d1be21e02");
        Map A0F2 = C73813g7.A0F(r2);
        C162457s7.A0K(A0F2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        String A0d = C18280x3.A0d(A0F2);
        C162457s7.A0D(A0d);
        return new C35251wZ(new C35381wm(A0d, 3), 3);
    }

    public final Map A04(List list) {
        AbstractCollection abstractCollection;
        if (list == null) {
            return null;
        }
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (!map.containsKey("is_entry_screen") || C162457s7.A0P(map.get("is_entry_screen"), Boolean.FALSE)) {
                Object obj = map.get("sources");
                if ((obj instanceof ArrayList) && (abstractCollection = (AbstractCollection) obj) != null) {
                    Iterator it2 = abstractCollection.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Set set = (Set) A0r.get(next);
                        if (set == null) {
                            set = AnonymousClass0x9.A17();
                            A0r.put(next, set);
                        }
                        set.add(new AnonymousClass7YN(AnonymousClass0x2.A0d("app_id", map), (Map) map.get("bloks_server_params")));
                    }
                }
            }
        }
        return A0r;
    }

    public final void A06(AnonymousClass4DL r22, AnonymousClass20N r23, C52622lm r24, String str) {
        int i;
        AnonymousClass908 r7;
        AnonymousClass36K r1;
        String str2;
        String str3;
        AnonymousClass20N r8 = r23;
        C162457s7.A0J(r8, 2);
        C52622lm r10 = r24;
        int hashCode = r10.hashCode();
        String str4 = r10.A00;
        C29541iz r72 = this.A0A;
        r72.A01(hashCode, str4);
        r72.A03(hashCode, "config_name", str4);
        AnonymousClass31C r14 = this.A07;
        String A032 = r14.A03();
        int hashCode2 = r10.hashCode();
        String name = r8.name();
        r72.A00(hashCode2, "iqRequest");
        if (name != null) {
            r72.A03(hashCode2, "iq_type", name);
        }
        r72.A03(hashCode2, "session_id", this.A0F.A00());
        int ordinal = r8.ordinal();
        AnonymousClass4DL r82 = r22;
        String str5 = str;
        if (ordinal == 0) {
            Map map = r10.A02;
            if (map != null) {
                C626936e.A06(map);
                LinkedHashMap A0r = C18320x8.A0r();
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (A0w.getValue() != null) {
                        C18270x1.A1N(A0r, A0w);
                    }
                }
                str2 = C18280x3.A0d(A0r);
            } else {
                str2 = null;
            }
            C35721xK r11 = new C35721xK(new C35381wm(new C35381wm(r10.A01, str2), A02(), str4), new C35381wm(A032, 0), 10);
            r1 = r11.A00;
            C162457s7.A0D(r1);
            r7 = new AnonymousClass908(r82, this, r10, r11, str5, 0);
            i = 302;
        } else if (ordinal == 1) {
            Map map2 = r10.A02;
            if (map2 != null) {
                C626936e.A06(map2);
                LinkedHashMap A0r2 = C18320x8.A0r();
                Iterator A0q2 = AnonymousClass000.A0q(map2);
                while (A0q2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                    if (A0w2.getValue() != null) {
                        C18270x1.A1N(A0r2, A0w2);
                    }
                }
                str3 = C18280x3.A0d(A0r2);
            } else {
                str3 = null;
            }
            C35721xK r0 = new C35721xK(new C35381wm(new C35381wm(r10.A01, str3), A02(), str4), new C35381wm(A032, 1), 11);
            r1 = r0.A00;
            C162457s7.A0D(r1);
            r7 = new AnonymousClass908(r82, this, r10, r0, str5, 1);
            i = 303;
        } else {
            return;
        }
        r14.A0D(r7, r1, A032, i, 32000);
    }

    public void A07(AnonymousClass4B3 r17, AnonymousClass4DQ r18, C52622lm r19, String str, String str2, Map map) {
        String str3 = str;
        C162457s7.A0J(str3, 2);
        C52622lm r3 = r19;
        String str4 = r3.A00;
        String str5 = str2;
        if (str2 != null) {
            this.A0N.put(str4, str5);
        }
        int hashCode = hashCode();
        AnonymousClass1j0 r4 = this.A0B;
        r4.A01(hashCode, str4);
        r4.A03(hashCode, "config_name", str4);
        C44542Wl r5 = this.A0F;
        r5.A00 = null;
        String A002 = r5.A00();
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("config", str4);
        A1G.put("isStartingState", true);
        A1G.put("sessionId", A002);
        A1G.put("referral", str3);
        this.A0M.put(C373721z.SESSION_ID.key, r5.A00());
        r5.A00();
        C44522Wj r2 = this.A0E;
        String str6 = this.A0L;
        synchronized (r2) {
            C162457s7.A0J(str6, 0);
            r2.A00.put(str6, this);
        }
        r4.A00(hashCode, "iqRequest");
        r4.A03(hashCode, "iq_type", "GET");
        r4.A03(hashCode, "session_id", r5.A00());
        A06(new C171918Ix(this, r17, r18, str4, str3, map, hashCode), AnonymousClass20N.GET, r3, str4);
    }

    public final void A0C(C138816r3 r10) {
        C162457s7.A0J(r10, 0);
        int hashCode = hashCode();
        String str = this.A0L;
        C162457s7.A0J(str, 2);
        C53332mv r2 = ((C44932Ya) this.A0K.get()).A01;
        String str2 = r10.A00;
        C162457s7.A0D(str2);
        String A002 = C59842xa.A00(Integer.valueOf(hashCode));
        if (A002 == null) {
            A002 = "";
        }
        r2.A01((C46772cB) null, Boolean.TRUE, str2, A002, str, "");
    }

    public final void A0D(String str, String str2) {
        List list;
        String str3 = str2;
        C162457s7.A0J(str3, 1);
        AnonymousClass7SQ r9 = this.A09;
        Map map = this.A0M;
        String str4 = this.A0L;
        C162457s7.A0J(str4, 3);
        Map A012 = AnonymousClass31O.A01(str3);
        if (!A012.isEmpty()) {
            LinkedHashMap A0r = C18320x8.A0r();
            Object obj = A012.get("states");
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Iterator A0q = AnonymousClass000.A0q((Map) obj);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                String A0q2 = C18310x6.A0q(A0w);
                Object value = A0w.getValue();
                C162457s7.A0K(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                AnonymousClass7SR A002 = r9.A00(A0q2, str, str4, (Map) value, map);
                if (A002 != null) {
                    A0r.put(A0w.getKey(), A002);
                }
            }
            Object obj2 = A012.get("next_screens");
            if (obj2 instanceof List) {
                list = (List) obj2;
            } else {
                list = null;
            }
            Object obj3 = A012.get("start_at");
            C162457s7.A0K(obj3, "null cannot be cast to non-null type kotlin.String");
            C162457s7.A0J(obj3, 1);
            A0B((AnonymousClass39C) null, list, false);
            return;
        }
        throw AnonymousClass001.A0e("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
    }

    public C161447pg(AnonymousClass2VN r17, AnonymousClass2VO r18, AnonymousClass2E4 r19, C69263Wi r20, C56612sH r21, AnonymousClass1VX r22, AnonymousClass31C r23, AnonymousClass282 r24, AnonymousClass7SQ r25, C29541iz r26, AnonymousClass1j0 r27, C40622Hc r28, AnonymousClass2Oj r29, C44522Wj r30, C44542Wl r31, C48182eU r32, C40642He r33, C51052jC r34, AnonymousClass2Z4 r35, C183538qC r36, Map map) {
        String A0Y;
        C152677Zw A002;
        AnonymousClass31C r9 = r23;
        AnonymousClass1VX r10 = r22;
        C56612sH r11 = r21;
        C69263Wi r12 = r20;
        C18260x0.A0c(r11, r10, r12, r9);
        AnonymousClass282 r8 = r24;
        C162457s7.A0J(r8, 7);
        C44522Wj r5 = r30;
        C48182eU r4 = r32;
        C18280x3.A15(r5, r4);
        AnonymousClass2VN r15 = r17;
        C162457s7.A0J(r15, 12);
        C29541iz r7 = r26;
        C162457s7.A0J(r7, 14);
        AnonymousClass2VO r14 = r18;
        C162457s7.A0J(r14, 15);
        AnonymousClass2E4 r13 = r19;
        C162457s7.A0J(r13, 16);
        AnonymousClass2Z4 r3 = r35;
        C162457s7.A0J(r3, 17);
        C183538qC r1 = r36;
        C162457s7.A0J(r1, 18);
        Map map2 = map;
        C162457s7.A0J(map2, 19);
        AnonymousClass1j0 r6 = r27;
        C162457s7.A0J(r6, 20);
        this.A05 = r11;
        this.A06 = r10;
        this.A04 = r12;
        this.A07 = r9;
        this.A09 = r25;
        this.A0F = r31;
        this.A08 = r8;
        this.A0C = r28;
        this.A0E = r5;
        this.A0G = r4;
        this.A0D = r29;
        this.A01 = r15;
        this.A0H = r33;
        this.A0A = r7;
        this.A02 = r14;
        this.A03 = r13;
        this.A0J = r3;
        this.A0K = r1;
        this.A0O = map2;
        this.A0B = r6;
        C51052jC r0 = r34;
        this.A0I = r0;
        if (r34 == null || (A002 = r4.A00(r0.A00)) == null || A002.A00() == null) {
            A0Y = C18280x3.A0Y();
            C162457s7.A0H(A0Y);
        } else {
            A0Y = A002.A05.A02;
        }
        this.A0L = A0Y;
        this.A0P = C18320x8.A0r();
        this.A0M = C18320x8.A0r();
        this.A0N = AnonymousClass001.A0t();
    }

    public static final /* synthetic */ void A00(C161447pg r3) {
        AnonymousClass2Z4 r2 = r3.A0J;
        String str = r3.A0L;
        synchronized (r2) {
            C162457s7.A0J(str, 0);
            r2.A01.remove(str);
        }
        C44522Wj r22 = r3.A0E;
        synchronized (r22) {
            r22.A00.remove(str);
        }
        Stack stack = r3.A0C.A00;
        stack.clear();
        stack.add(AnonymousClass001.A0t());
        r3.A00 = null;
    }

    public static final /* synthetic */ void A01(C161447pg r1, C138966rI r2) {
        C182908pB r12 = (C182908pB) r1.A0P.get(r2.A01);
        if (r12 != null) {
            AnonymousClass36K r0 = r2.A00;
            C162457s7.A0D(r0);
            r12.Bhc(r0);
        }
    }

    public final Map A03(C138966rI r22, String str) {
        String A0e;
        Object A002;
        String A0e2;
        Map map;
        String A0e3;
        Object obj;
        ArrayList A0s = AnonymousClass001.A0s();
        for (C138626qj r1 : (Iterable) r22.A00) {
            C179938jx r12 = (C179938jx) r1.A00;
            C162457s7.A0D(r12);
            C157187ht r10 = null;
            if (r12 instanceof C139186re) {
                C139186re r13 = (C139186re) r12;
                C138756qw r4 = r13.A00;
                String str2 = r4.A02;
                String str3 = r13.A02;
                Map A003 = C1452674v.A00(r4.A01);
                Map A004 = C1452674v.A00(r13.A05);
                if (A004 != null) {
                    map = C73813g7.A0E(A004, AnonymousClass3Z6.A02(C373721z.ADDITIONAL_PARAMS.key, this.A0M));
                } else {
                    map = null;
                }
                Map A005 = C1452674v.A00(r4.A05);
                String str4 = r4.A04;
                if (str4 == null) {
                    A0e3 = "$";
                } else {
                    A0e3 = AnonymousClass6C9.A0e(str4);
                }
                String str5 = r4.A03;
                String str6 = r13.A03;
                if (str6 == null) {
                    str6 = "replace";
                }
                String str7 = r13.A04;
                if (str7 != null) {
                    Object nextValue = new JSONTokener(str7).nextValue();
                    C162457s7.A0H(nextValue);
                    obj = AnonymousClass355.A00(nextValue);
                } else {
                    obj = null;
                }
                String str8 = r13.A01;
                if (str8 != null) {
                    r10 = new C157187ht(str8);
                }
                C162457s7.A0H(str2);
                C162457s7.A0H(str3);
                A002 = new C137066ni(r10, obj, str, str2, str3, A0e3, str5, str6, A003, map, A005);
            } else if (r12 instanceof C139176rd) {
                C139176rd r14 = (C139176rd) r12;
                String str9 = r14.A00.A02;
                C162457s7.A0D(str9);
                String str10 = r14.A02;
                C162457s7.A0D(str10);
                List<C138626qj> list = r14.A03;
                ArrayList A0I2 = AnonymousClass002.A0I(C73783g4.A0b(list, 10));
                for (C138626qj r2 : list) {
                    A0I2.add(r2.A00);
                }
                ArrayList A0I3 = AnonymousClass002.A0I(C73783g4.A0b(A0I2, 10));
                Iterator it = A0I2.iterator();
                while (it.hasNext()) {
                    String str11 = ((C34801vq) it.next()).A00;
                    C162457s7.A0D(str11);
                    A0I3.add(str11);
                }
                String str12 = r14.A01;
                if (str12 != null) {
                    r10 = new C157187ht(str12);
                }
                A002 = new C137026ne(r10, str9, str10, A0I3);
            } else if (r12 instanceof C139146ra) {
                String str13 = ((C139146ra) r12).A00.A02;
                C162457s7.A0D(str13);
                A002 = new C137016nd(str13);
            } else if (r12 instanceof C139156rb) {
                C139156rb r15 = (C139156rb) r12;
                C138756qw r42 = r15.A00;
                String str14 = r42.A02;
                C162457s7.A0D(str14);
                Map A006 = C1452674v.A00(r42.A01);
                Map A007 = C1452674v.A00(r15.A01);
                String str15 = r42.A04;
                if (str15 == null) {
                    A0e2 = "$";
                } else {
                    A0e2 = AnonymousClass6C9.A0e(str15);
                }
                A002 = new C137036nf(str14, A0e2, r42.A03, A006, A007);
            } else if (r12 instanceof C139166rc) {
                C139166rc r16 = (C139166rc) r12;
                String str16 = r16.A01.A02;
                C162457s7.A0D(str16);
                String str17 = r16.A02;
                C162457s7.A0D(str17);
                String str18 = r16.A00.A00;
                C162457s7.A0D(str18);
                A002 = new C137046ng(this.A0H, str16, str17, str18);
            } else if (r12 instanceof C139196rf) {
                AnonymousClass2VN r9 = this.A01;
                C139196rf r17 = (C139196rf) r12;
                C138756qw r3 = r17.A00;
                String str19 = r3.A02;
                Map A008 = C1452674v.A00(r3.A01);
                Map A009 = C1452674v.A00(r17.A04);
                Map A0010 = C1452674v.A00(r3.A05);
                String str20 = r3.A04;
                if (str20 == null) {
                    A0e = "$";
                } else {
                    A0e = AnonymousClass6C9.A0e(str20);
                }
                String str21 = r17.A01;
                if (str21 != null) {
                    r10 = new C157187ht(str21);
                }
                String str22 = r3.A03;
                String str23 = r17.A03;
                String str24 = r17.A02;
                String str25 = this.A0L;
                C162457s7.A0H(str19);
                C162457s7.A0H(str23);
                C162457s7.A0H(str24);
                A002 = r9.A00(r10, str19, str22, A0e, str23, str24, str25, A008, A009, A0010);
            }
            A0s.add(A002);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(A0s));
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((AnonymousClass7SR) next).A01, next);
        }
        Iterator A0q = AnonymousClass000.A0q(linkedHashMap);
        while (A0q.hasNext()) {
            C162457s7.A0J(AnonymousClass0x2.A0W(A0q), 0);
        }
        return linkedHashMap;
    }

    public final void A09(AnonymousClass4B3 r37, AnonymousClass4DQ r38, AnonymousClass39C r39, String str, String str2, String str3, List list, Map map, Map map2, int i, boolean z) {
        Map map3;
        Object obj;
        String str4;
        Map map4 = map;
        String A002 = this.A0F.A00();
        AnonymousClass39C r7 = r39;
        List<Map> list2 = list;
        boolean z2 = z;
        A0B(r7, list2, z2);
        Map A042 = A04(list2);
        ArrayList A0s = AnonymousClass001.A0s();
        if (list != null) {
            for (Map map5 : list2) {
                Object obj2 = map5.get("is_entry_screen");
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                if (AnonymousClass0x9.A1Q(obj2)) {
                    Map map6 = (Map) map5.get("bloks_server_params");
                    if (map6 != null) {
                        obj = map6.get("screen_id");
                    } else {
                        obj = null;
                    }
                    if (!(!(obj instanceof String) || (str4 = (String) obj) == null || str4.length() == 0)) {
                        A0s.add(str4);
                    }
                }
            }
        }
        if (A0s.isEmpty()) {
            A0s = null;
        }
        Map A043 = C57692u3.A04(C373721z.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map == null) {
            map4 = C73813g7.A0A();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A043);
        linkedHashMap.putAll(map4);
        C51052jC r2 = this.A0I;
        String str5 = str;
        String str6 = str2;
        Map map7 = map2;
        if (r2 != null && this.A06.A0X(3374)) {
            C48182eU r8 = this.A0G;
            String str7 = r2.A00;
            if (r8.A00(str7) == null) {
                Map map8 = (Map) linkedHashMap.get("overwrite_first_screen_presentation");
                AnonymousClass2E4 r22 = this.A03;
                AnonymousClass7XZ r12 = new AnonymousClass7XZ();
                String str8 = this.A0L;
                if (map8 != null) {
                    map3 = C73813g7.A0D(map8);
                } else {
                    map3 = null;
                }
                C152687Zx r28 = new C152687Zx(str5, A002, str8, str6, list2, map3, map7);
                System.currentTimeMillis();
                C64333Db r23 = r22.A00.A01;
                C152677Zw r9 = new C152677Zw((C56612sH) r23.ASO.get(), r23.Ap4(), r12, r28, str7);
                synchronized (r8) {
                    Map map9 = r8.A00;
                    if (map9.size() >= 3) {
                        Iterator it = map9.keySet().iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                String A0m = AnonymousClass001.A0m(it);
                                next = (String) next;
                                C152677Zw r1 = (C152677Zw) map9.get(next);
                                C152677Zw r0 = (C152677Zw) map9.get(A0m);
                                if (!(r1 == null || r0 == null || r1.A00 < r0.A00)) {
                                    next = A0m;
                                }
                            }
                            map9.remove(next);
                        } else {
                            throw AnonymousClass002.A0G("Empty collection can't be reduced.");
                        }
                    }
                    map9.put(r9.A06, r9);
                }
            }
        }
        A08(r37, r38, r7, str5, A002, str6, str3, A0s, map7, linkedHashMap, (Map) null, A042, i, false, z2);
    }

    public final void A0A(AnonymousClass4B3 r36, AnonymousClass4DQ r37, AnonymousClass39C r38, String str, String str2, String str3, Map map, boolean z) {
        String str4;
        List list;
        Object obj;
        Map map2;
        String str5 = str2;
        C162457s7.A0J(str5, 1);
        int hashCode = hashCode();
        AnonymousClass1j0 r1 = this.A0B;
        String str6 = str;
        r1.A01(hashCode, str6);
        r1.A03(hashCode, "config_name", str6);
        C48182eU r12 = this.A0G;
        C51052jC r0 = this.A0I;
        if (r0 != null) {
            str4 = r0.A00;
        } else {
            str4 = null;
        }
        C152677Zw A002 = r12.A00(str4);
        AnonymousClass4B3 r14 = r36;
        AnonymousClass4DQ r15 = r37;
        AnonymousClass39C r16 = r38;
        String str7 = str3;
        Map map3 = map;
        boolean z2 = z;
        if (A002 == null || A002.A00() == null) {
            AnonymousClass7SQ r11 = this.A09;
            Map map4 = this.A0M;
            String str8 = this.A0L;
            C162457s7.A0J(str8, 3);
            Map A012 = AnonymousClass31O.A01(str5);
            if (!A012.isEmpty()) {
                LinkedHashMap A0r = C18320x8.A0r();
                Object obj2 = A012.get("states");
                C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Iterator A0q = AnonymousClass000.A0q((Map) obj2);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    String A0q2 = C18310x6.A0q(A0w);
                    Object value = A0w.getValue();
                    C162457s7.A0K(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    AnonymousClass7SR A003 = r11.A00(A0q2, str6, str8, (Map) value, map4);
                    if (A003 != null) {
                        A0r.put(A0w.getKey(), A003);
                    }
                }
                Object obj3 = A012.get("next_screens");
                if (obj3 instanceof List) {
                    list = (List) obj3;
                } else {
                    list = null;
                }
                String A0d = AnonymousClass0x2.A0d("start_at", A012);
                C162457s7.A0J(A0d, 1);
                A09(r14, r15, r16, str6, A0d, str7, list, map3, A0r, hashCode, z2);
                return;
            }
            throw AnonymousClass001.A0e("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
        }
        C152687Zx r6 = A002.A05;
        List list2 = r6.A05;
        Map A042 = A04(list2);
        Map map5 = r6.A06;
        String A004 = A002.A00();
        if (A004 != null) {
            AnonymousClass3Z6[] r13 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A04(C373721z.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, r13);
            r13[1] = AnonymousClass3Z6.A02("overwrite_first_screen_presentation", map5);
            Map A0F2 = C73813g7.A0F(r13);
            Stack stack = A002.A08;
            ListIterator listIterator = stack.listIterator(stack.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                obj = listIterator.previous();
            } while (!C162457s7.A0P(((AnonymousClass7ZL) obj).A01, A004));
            AnonymousClass7ZL r17 = (AnonymousClass7ZL) obj;
            if (r17 == null || (map2 = r17.A02) == null) {
                map2 = C73813g7.A0A();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0F2);
            linkedHashMap.putAll(map2);
            A08(r14, r15, r16, str6, r6.A03, A004, str7, (List) null, r6.A07, map3, linkedHashMap, A042, hashCode, true, z2);
            return;
        }
        A09(r14, r15, r16, str6, r6.A04, str7, list2, map3, r6.A07, hashCode, z2);
    }

    public final void A0B(AnonymousClass39C r8, List list, boolean z) {
        if (z) {
            AnonymousClass2Z4 r2 = this.A0J;
            String str = this.A0L;
            synchronized (r2) {
                C162457s7.A0J(str, 0);
                r2.A01.put(str, r8);
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (AnonymousClass0x9.A1Q(map.get("is_entry_screen"))) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("FdsManager:fetchEntryScreenForPslConfig prefetch ");
                    C18260x0.A0o(map.get("app_id"), A0o);
                    int hashCode = hashCode();
                    ((C44932Ya) this.A0K.get()).A00(AnonymousClass0x2.A0d("app_id", map), this.A0L, (Map) map.get("bloks_server_params"), hashCode);
                }
            }
        }
    }

    public final void A0F(Map map) {
        ((Map) C162457s7.A03(this.A0C.A00)).putAll(map);
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            C162457s7.A0J(AnonymousClass0x2.A0W(A0q), 0);
        }
    }

    public final void A05(C54802pJ r3, Long l, String str, String str2, int i) {
        r3.A00(i, str);
        if (!(str2 == null || l == null)) {
            r3.A02(i, str2, l.longValue());
        }
        r3.A03(i, "session_id", this.A0F.A00());
    }

    public void A0E(Map map) {
        if (!map.isEmpty()) {
            this.A0M.putAll(map);
        }
    }

    public final void A08(AnonymousClass4B3 r13, AnonymousClass4DQ r14, AnonymousClass39C r15, String str, String str2, String str3, String str4, List list, Map map, Map map2, Map map3, Map map4, int i, boolean z, boolean z2) {
        String str5;
        Map map5 = map2;
        AnonymousClass2VO r4 = this.A02;
        String str6 = this.A0L;
        C51052jC r0 = this.A0I;
        if (r0 != null) {
            str5 = r0.A00;
        } else {
            str5 = null;
        }
        C159127lA A002 = r4.A00(this.A0C, str, str2, str6, str5, str4);
        this.A00 = A002;
        A002.A0C = map4;
        A002.A0A = list;
        C44522Wj r42 = this.A0E;
        synchronized (r42) {
            C162457s7.A0J(str6, 0);
            r42.A00.put(str6, this);
        }
        r13.BTd(A002.A0a);
        Map map6 = map;
        A0F(map6);
        if (z2) {
            AnonymousClass2Z4 r43 = this.A0J;
            synchronized (r43) {
                r43.A01.put(str6, r15);
            }
        }
        Map A042 = C57692u3.A04(C373721z.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map2 == null) {
            map5 = C73813g7.A0A();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A042);
        linkedHashMap.putAll(map5);
        A002.A02(new C1896492c(this, r14, 1), str3, linkedHashMap, map3, z);
        Long A0m = AnonymousClass0x9.A0m(map6.size());
        AnonymousClass1j0 r132 = this.A0B;
        int i2 = i;
        A05(r132, A0m, "initializeStateMachine", "num_states", i2);
        r132.A03.A07(i2, 467);
    }
}
