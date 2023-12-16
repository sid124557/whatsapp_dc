package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sq  reason: invalid class name and case insensitive filesystem */
public final class C56962sq {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass2XO A02;
    public final C55682qk A03;
    public final C48352el A04;
    public final C69263Wi A05;
    public final C66663Mh A06;
    public final C29411im A07;
    public final C153167am A08;
    public final C41162Je A09;
    public final C68213Sh A0A;
    public final C48402eq A0B;
    public final C34431v9 A0C;
    public final C64773Ex A0D;
    public final C29421in A0E;
    public final C47882dz A0F;
    public final C56422rx A0G;
    public final AnonymousClass5ZU A0H;
    public final C113905mB A0I;
    public final C56612sH A0J;
    public final AnonymousClass33p A0K;
    public final C620733j A0L;
    public final C56122rS A0M;
    public final C66543Lv A0N;
    public final AnonymousClass2Y3 A0O;
    public final C56152rV A0P;
    public final C72303dV A0Q;
    public final C56382rt A0R;
    public final C55302q8 A0S;
    public final C56662sM A0T;
    public final AnonymousClass1VX A0U;
    public final AnonymousClass3LP A0V;
    public final AnonymousClass4FV A0W;
    public final AnonymousClass2RM A0X;
    public final AnonymousClass31C A0Y;
    public final C56832sd A0Z;
    public final C60892zL A0a;
    public final C56572sD A0b;
    public final AnonymousClass4FS A0c;
    public final Set A0d = AnonymousClass0x9.A17();

    public static String A00(String str, StringBuilder sb, Collection collection) {
        sb.append(str);
        String arrays = Arrays.toString(collection.toArray(new UserJid[0]));
        C162457s7.A0D(arrays);
        return arrays;
    }

    public final UserJid A01() {
        Object obj;
        UserJid userJid;
        synchronized (this) {
            Iterator it = this.A0d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UserJid) obj) instanceof C135216kJ) {
                    break;
                }
            }
            userJid = (UserJid) obj;
        }
        return userJid;
    }

    public final List A03(C95814uZ r10) {
        String A002;
        C162457s7.A0J(r10, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        C56152rV r3 = this.A0P;
        Iterator it = r3.A04(r10, 5, false, false).iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            C48892fe r2 = new C48892fe();
            if (A0T2 instanceof AnonymousClass4FG) {
                A002 = ((AnonymousClass4FG) A0T2).BDY().A05;
            } else {
                if (A0T2 instanceof C30791n7) {
                    A002 = this.A0O.A00(A0T2);
                    if (A002 == null) {
                    }
                }
                r2.A02 = r3.A06(r10, A0T2.A0K);
                r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(A0T2.A0K) * TimeUnit.HOURS.toSeconds(1));
                A0s.add(r2);
            }
            r2.A01 = A002;
            r2.A02 = r3.A06(r10, A0T2.A0K);
            r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(A0T2.A0K) * TimeUnit.HOURS.toSeconds(1));
            A0s.add(r2);
        }
        return A0s;
    }

    public final synchronized Set A05() {
        return C73723fy.A0P(this.A0d);
    }

    public final synchronized Set A06() {
        Set A0O2;
        Set set = this.A0d;
        A0O2 = C73723fy.A0O(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid A0T2 = C18310x6.A0T(it);
            if (A0T2 instanceof PhoneUserJid) {
                C56662sM r1 = this.A0T;
                C162457s7.A0K(A0T2, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                for (C27981fH remove : r1.A04((PhoneUserJid) A0T2)) {
                    A0O2.remove(remove);
                }
            }
        }
        return A0O2;
    }

    public final void A08() {
        Set A0P2;
        synchronized (this) {
            Set set = this.A0d;
            A0P2 = C73723fy.A0P(set);
            set.clear();
            A09();
            this.A04.A01(new C117125rQ(this, 0));
        }
        if (!A0P2.isEmpty()) {
            this.A0E.A0C(A0P2);
        }
    }

    public final void A0D(Activity activity, AnonymousClass49C r15, UserJid userJid) {
        UserJid userJid2 = userJid;
        C18270x1.A10(activity, 0, userJid2);
        this.A02.A00(activity, new AnonymousClass3CQ(activity, r15, this, new C43802Tn((AnonymousClass20K) null, (AnonymousClass3ZH) null, userJid2, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, false)), false);
    }

    public final void A0E(Activity activity, AnonymousClass20K r16, AnonymousClass3ZH r17, UserJid userJid, Integer num, String str, String str2, String str3) {
        Boolean bool;
        List list;
        UserJid userJid2 = userJid;
        boolean A1Y = AnonymousClass0x2.A1Y(activity, userJid2);
        AnonymousClass3ZH r5 = r17;
        String str4 = str3;
        C18260x0.A0U(str4, r5);
        String str5 = str;
        if (str == null) {
            bool = null;
        } else if (this.A0P.A00(userJid2) != null) {
            bool = C18320x8.A0V(this.A0R.A06(userJid2));
        } else {
            bool = null;
        }
        if (A0O(r5, A1Y)) {
            list = A03(userJid2);
        } else {
            list = null;
        }
        A0C(activity, (AnonymousClass49C) null, new C43802Tn(r16, r5, userJid2, bool, num, str5, str2, str4, list, A1Y), false);
    }

    public final void A0F(Activity activity, AnonymousClass3ZH r13, String str, boolean z) {
        C18270x1.A14(activity, r13);
        A0B(activity, (AnonymousClass49C) null, (AnonymousClass20K) null, r13, (Integer) null, (String) null, (String) null, str, false, z);
    }

    public final void A0H(UserJid userJid, String str) {
        synchronized (this) {
            if (this.A0d.add(userJid)) {
                A0I(userJid, str, true);
            }
        }
    }

    public final void A0J(UserJid userJid, boolean z) {
        C162457s7.A0J(userJid, 0);
        C56832sd r2 = this.A0Z;
        C31241ny r22 = new C31241ny(C56832sd.A00(userJid, r2), this.A0J.A0H());
        r22.A00 = z;
        this.A0N.A09(r22, -1);
    }

    public final synchronized void A0L(String str, Map map, Set set) {
        String str2;
        UserJid A012;
        synchronized (this) {
            Set set2 = set;
            if (C72303dV.A00(this.A0Q)) {
                set2.addAll(A07(set2));
            }
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            Set A0O2 = C73723fy.A0O(set2);
            Set set3 = this.A0d;
            A0O2.removeAll(set3);
            Set A0O3 = C73723fy.A0O(set3);
            A0O3.removeAll(set2);
            if (this.A0V.A00.A0Y(C58422vE.A02, 1844) && (A012 = A01()) != null) {
                A0O3.remove(A012);
                set2.add(A012);
            }
            A17.addAll(A0O2);
            A17.addAll(A0O3);
            boolean z = this.A01;
            boolean A0M2 = A0M();
            this.A01 = true;
            C48352el r3 = this.A04;
            r3.A01(new C117175rV(this, 19, map));
            if (AnonymousClass0x7.A1S(A17)) {
                if (A0M2 && z) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18260x0.A1K(A0o, A00("old block list: ", A0o, set3));
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A1K(A0o2, A00("new block list: ", A0o2, set2));
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    C18260x0.A1K(A0o3, A00("added: ", A0o3, A0O2));
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    C18260x0.A1K(A0o4, A00("removed: ", A0o4, A0O3));
                    if (C18310x6.A1X(A0O2) && C18310x6.A1X(A0O3)) {
                        str2 = "Added/Removed";
                    } else if (C18310x6.A1X(A0O2)) {
                        str2 = "Added";
                    } else {
                        str2 = "Removed";
                    }
                    this.A03.A0A("block list de-synchronization", true, str2);
                }
                r3.A01(new C71603cN(this, set2, A17, str, 5));
            } else {
                AnonymousClass33p r1 = this.A0K;
                C18270x1.A0i(C18270x1.A03(r1), "block_list_receive_time", this.A0J.A0H());
                if (!A0M2) {
                    this.A05.A0S(new C117125rQ(this, 1));
                }
            }
        }
    }

    public final boolean A0N(AnonymousClass20K r6, UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        if (r6 == AnonymousClass20K.A02 && this.A0U.A0Y(C58422vE.A02, 4588)) {
            return true;
        }
        AnonymousClass1VX r2 = this.A0U;
        if (!r2.A0Y(C58422vE.A02, 3370)) {
            return false;
        }
        String A082 = C56952sp.A08(r2, 3590);
        return C107575bX.A0F(A082) || C175728Zm.A0S(A082, userJid.user, false);
    }

    public final UserJid A02(UserJid userJid) {
        if (userJid instanceof PhoneUserJid) {
            C56662sM r1 = this.A0T;
            C162457s7.A0K(userJid, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            return r1.A01((PhoneUserJid) userJid);
        } else if (!C627336j.A0L(userJid)) {
            return null;
        } else {
            C56662sM r12 = this.A0T;
            C162457s7.A0K(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            return C56662sM.A00(r12, userJid);
        }
    }

    public final Map A04() {
        String A0Z2 = C18280x3.A0Z(this.A0B.A00(), "biz_block_reasons");
        LinkedHashMap A0r = C18320x8.A0r();
        if (!TextUtils.isEmpty(A0Z2)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z2);
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    A0r.put(A0m, A1H.get(A0m));
                }
            } catch (JSONException unused) {
            }
        }
        return A0r;
    }

    public final void A09() {
        AnonymousClass33p r3 = this.A0K;
        C18270x1.A0j(C18270x1.A03(r3), "block_list_v2_dhash", (String) null);
        C18270x1.A0g(C18270x1.A03(r3), "block_list_receive_time");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r2.equals(r1) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r14 = this;
            X.2eq r3 = r14.A0B
            android.content.SharedPreferences r0 = r3.A00()
            java.lang.String r6 = "biz_block_reasons_language"
            java.lang.String r5 = X.C18280x3.A0Z(r0, r6)
            X.33j r4 = r14.A0L
            java.lang.String r2 = r4.A07()
            X.C162457s7.A0D(r2)
            int r0 = r2.length()
            r1 = 1
            if (r0 <= 0) goto L_0x00a6
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x00a6
        L_0x0022:
            r5 = 0
            if (r1 == 0) goto L_0x0084
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "biz_block_reasons_country"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            if (r2 == 0) goto L_0x004a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = r4.A06()
            X.C162457s7.A0D(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0084
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0084
        L_0x004a:
            r4 = 1
        L_0x004b:
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "biz_block_reasons_api_back_off_days"
            int r0 = r1.getInt(r0, r5)
            if (r0 < 0) goto L_0x00f3
            X.2sH r0 = r14.A0J
            long r6 = r0.A0H()
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "biz_block_reasons_api_cooling_timestamp"
            long r1 = X.AnonymousClass0x2.A0B(r1, r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00f3
            if (r4 == 0) goto L_0x0081
            X.3Mh r1 = r14.A06
            X.1Ek r0 = X.C66663Mh.A14
            int r2 = r1.A03(r0)
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "biz_block_reasons_version"
            int r0 = r1.getInt(r0, r5)
            if (r2 <= r0) goto L_0x00f3
        L_0x0081:
            r6 = r14
            monitor-enter(r6)
            goto L_0x00a9
        L_0x0084:
            r4 = 0
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "biz_block_reasons"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "biz_block_reasons_version"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r6)
            java.lang.String r0 = "biz_block_reasons_country"
            X.C18270x1.A0g(r1, r0)
            r3.A01(r5)
            goto L_0x004b
        L_0x00a6:
            r1 = 0
            goto L_0x0022
        L_0x00a9:
            X.3Sh r8 = r14.A0A     // Catch:{ all -> 0x00ef }
            X.31C r7 = r8.A02     // Catch:{ all -> 0x00ef }
            java.lang.String r10 = r7.A03()     // Catch:{ all -> 0x00ef }
            r4 = 2
            X.39V[] r2 = new X.AnonymousClass39V[r4]     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "name"
            java.lang.String r0 = "biz_block_reasons"
            X.AnonymousClass39V.A0B(r1, r0, r2, r5)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "v"
            X.39V r0 = new X.39V     // Catch:{ all -> 0x00ef }
            r0.<init>((java.lang.String) r1, (int) r4)     // Catch:{ all -> 0x00ef }
            r1 = 1
            r2[r1] = r0     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "mobile_config"
            X.36K r3 = X.AnonymousClass36K.A0I(r0, r2)     // Catch:{ all -> 0x00ef }
            X.39V[] r2 = X.AnonymousClass39V.A0H(r10, r5)     // Catch:{ all -> 0x00ef }
            X.AnonymousClass39V.A0E(r2, r1)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass39V.A0B(r1, r0, r2, r4)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz"
            X.36K r9 = X.AnonymousClass36K.A0E(r3, r1, r0, r2)     // Catch:{ all -> 0x00ef }
            r11 = 234(0xea, float:3.28E-43)
            r12 = 20000(0x4e20, double:9.8813E-320)
            r7.A0K(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00ef }
            goto L_0x00f2
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00f2:
            monitor-exit(r6)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56962sq.A0A():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.4Hi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.3E5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.3E5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.3E5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.app.Activity r18, X.AnonymousClass49C r19, X.AnonymousClass20K r20, X.AnonymousClass3ZH r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            r17 = this;
            r8 = r21
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass3ZH.A07(r8)
            if (r9 == 0) goto L_0x005c
            r3 = r17
            r4 = r18
            r1 = r19
            r16 = r26
            if (r27 == 0) goto L_0x0055
            X.3E5 r5 = new X.3E5
            r12 = r1
            r13 = r3
            r14 = r8
            r15 = r16
            r11 = r4
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x001e:
            r12 = r23
            if (r26 == 0) goto L_0x0053
            if (r23 == 0) goto L_0x0053
            X.2rV r0 = r3.A0P
            X.34x r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x0051
            X.2rt r0 = r3.A0R
            boolean r0 = r0.A06(r9)
            java.lang.Boolean r10 = X.C18320x8.A0V(r0)
        L_0x0036:
            r15 = 0
            X.2Tn r6 = new X.2Tn
            r7 = r20
            r11 = r22
            r13 = r24
            r14 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.2XO r2 = r3.A02
            boolean r1 = r6.A0A
            X.3CQ r0 = new X.3CQ
            r0.<init>(r4, r5, r3, r6)
            r2.A00(r4, r0, r1)
            return
        L_0x0051:
            r10 = 0
            goto L_0x0036
        L_0x0053:
            r10 = 0
            goto L_0x0036
        L_0x0055:
            r0 = 2
            X.4Hi r5 = new X.4Hi
            r5.<init>(r1, r0)
            goto L_0x001e
        L_0x005c:
            java.lang.String r0 = "jid is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56962sq.A0B(android.app.Activity, X.49C, X.20K, X.3ZH, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024e, code lost:
        if (r5.equals("biz_account_info_block") == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0258, code lost:
        if (r5.equals("account_info_block") != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x025a, code lost:
        r32 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0266, code lost:
        if (r5.equals("biz_overflow_menu_block") == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0270, code lost:
        if (r5.equals("chat") == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0274, code lost:
        r32 = X.C18280x3.A0S();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.app.Activity r37, X.AnonymousClass49C r38, X.C43802Tn r39, boolean r40) {
        /*
            r36 = this;
            r1 = r39
            r5 = r38
            boolean r0 = r1.A0A
            r16 = r0
            java.lang.String r2 = r1.A08
            r32 = 0
            if (r2 == 0) goto L_0x0023
            int r0 = X.AnonymousClass31J.A00(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x0016:
            r0 = r36
            X.5mB r9 = r0.A0I
            com.whatsapp.jid.UserJid r3 = r1.A04
            r35 = r3
            X.C162457s7.A0D(r35)
            monitor-enter(r9)
            goto L_0x0026
        L_0x0023:
            r12 = r32
            goto L_0x0016
        L_0x0026:
            boolean r3 = X.C627336j.A0K(r35)     // Catch:{ all -> 0x03ae }
            if (r3 != 0) goto L_0x007b
            android.content.SharedPreferences r8 = r9.A01()     // Catch:{ all -> 0x03ae }
            java.lang.String r3 = r35.getRawString()     // Catch:{ all -> 0x03ae }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r3)     // Catch:{ all -> 0x03ae }
            java.lang.String r3 = "_integrity"
            java.lang.String r11 = X.AnonymousClass000.A0X(r3, r4)     // Catch:{ all -> 0x03ae }
            java.lang.String r3 = "0,null,null,0"
            java.lang.String r3 = r8.getString(r11, r3)     // Catch:{ all -> 0x03ae }
            java.lang.String r10 = ","
            java.lang.String[] r7 = r3.split(r10)     // Catch:{ all -> 0x03ae }
            r3 = 0
            long r14 = X.C624334z.A00(r7, r3)     // Catch:{ all -> 0x03ae }
            r3 = 3
            long r3 = X.C624334z.A00(r7, r3)     // Catch:{ all -> 0x03ae }
            X.C624334z.A02(r7)     // Catch:{ all -> 0x03ae }
            r6 = 2
            X.C624334z.A01(r7, r6)     // Catch:{ all -> 0x03ae }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x03ae }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x03ae }
            r6 = 4
            java.io.Serializable[] r7 = new java.io.Serializable[r6]     // Catch:{ all -> 0x03ae }
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03ae }
            X.C18260x0.A0j(r6, r12, r13, r7)     // Catch:{ all -> 0x03ae }
            X.AnonymousClass0x2.A1V(r7, r3)     // Catch:{ all -> 0x03ae }
            java.util.List r3 = java.util.Arrays.asList(r7)     // Catch:{ all -> 0x03ae }
            java.lang.String r3 = android.text.TextUtils.join(r10, r3)     // Catch:{ all -> 0x03ae }
            X.C18270x1.A0j(r8, r11, r3)     // Catch:{ all -> 0x03ae }
        L_0x007b:
            monitor-exit(r9)
            X.1im r3 = r0.A07
            boolean r3 = r3.A06
            if (r3 == 0) goto L_0x014c
            r8 = r37
            if (r38 != 0) goto L_0x008d
            X.3E3 r5 = new X.3E3
            r3 = r16
            r5.<init>(r8, r0, r3)
        L_0x008d:
            X.2dz r4 = r0.A0F
            r3 = r35
            X.2vg r24 = r4.A00(r3)
            X.2Je r3 = r0.A09
            X.2Dc r3 = r3.A00
            X.3dX r3 = r3.A00
            X.3Db r3 = r3.A01
            X.3Wi r20 = X.C64333Db.A04(r3)
            X.2qk r19 = X.C64333Db.A01(r3)
            X.3LP r29 = r3.Akp()
            X.31C r30 = X.C64333Db.A5u(r3)
            X.4C1 r4 = r3.A2b
            java.lang.Object r7 = r4.get()
            X.2sq r7 = (X.C56962sq) r7
            X.4C1 r4 = r3.A6P
            java.lang.Object r6 = r4.get()
            X.1in r6 = (X.C29421in) r6
            X.4C1 r4 = r3.AaX
            java.lang.Object r4 = r4.get()
            X.2sM r4 = (X.C56662sM) r4
            X.33p r26 = X.C64333Db.A2s(r3)
            X.1VX r28 = X.C64333Db.A4B(r3)
            X.2oF r3 = new X.2oF
            r31 = r40
            r21 = r5
            r22 = r7
            r23 = r1
            r25 = r6
            r27 = r4
            r17 = r3
            r18 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.31C r7 = r3.A0D
            java.lang.String r15 = r7.A03()
            X.3LP r5 = r3.A0C
            X.2Tn r13 = r3.A06
            X.3ZH r4 = r13.A03
            if (r4 == 0) goto L_0x029a
            X.4uZ r4 = r4.A0H
            boolean r4 = X.C57362tW.A00(r5, r4)
            if (r4 == 0) goto L_0x029a
            r5 = 1
            X.4Hf r4 = new X.4Hf
            r4.<init>(r3, r5)
            X.3Sa r9 = new X.3Sa
            r9.<init>(r4, r7)
            boolean r7 = r13.A0A
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "SetChatPsaBlockingStatusHelper/setChatPsaBlockingStatus to "
            X.C18260x0.A1E(r3, r4, r7)
            X.31C r8 = r9.A01
            java.lang.String r11 = r8.A03()
            r12 = 339(0x153, float:4.75E-43)
            X.2rL r6 = X.C56052rL.A00()
            java.lang.String r4 = "xmlns"
            java.lang.String r3 = "w:comms:chat"
            X.C56052rL.A0D(r6, r4, r3)
            java.lang.String r3 = "id"
            X.C56052rL.A0D(r6, r3, r11)
            java.lang.String r4 = "type"
            java.lang.String r3 = "set"
            X.C56052rL.A0D(r6, r4, r3)
            java.lang.String r3 = "blocking"
            X.2rL r5 = X.C56052rL.A04(r3)
            if (r7 == 0) goto L_0x0295
            java.lang.String r4 = "block"
        L_0x013b:
            java.lang.String r3 = "action"
            X.C56052rL.A0D(r5, r3, r4)
            X.C56052rL.A07(r5, r6)
            X.36K r10 = r6.A0F()
            r13 = 0
            r8.A0D(r9, r10, r11, r12, r13)
        L_0x014c:
            if (r16 == 0) goto L_0x0223
            X.3LP r4 = r0.A0V
            r3 = r35
            boolean r3 = X.C57362tW.A00(r4, r3)
            if (r3 == 0) goto L_0x0187
            java.lang.String r5 = r1.A07
            if (r5 == 0) goto L_0x0164
            int r3 = r5.hashCode()
            r6 = 1
            switch(r3) {
                case -1801846342: goto L_0x0248;
                case -401299234: goto L_0x0260;
                case 3052376: goto L_0x026a;
                case 894529294: goto L_0x0252;
                case 1622880667: goto L_0x027a;
                default: goto L_0x0164;
            }
        L_0x0164:
            r7 = 0
            if (r2 == 0) goto L_0x016e
            int r3 = r2.hashCode()
            switch(r3) {
                case -612071747: goto L_0x0224;
                case -174614655: goto L_0x0230;
                case 133626717: goto L_0x023c;
                default: goto L_0x016e;
            }
        L_0x016e:
            X.4FS r6 = r0.A0c
            X.4FV r5 = r0.A0W
            X.2rV r3 = r0.A0P
            java.lang.Integer r33 = java.lang.Integer.valueOf(r7)
            r34 = 1
            r29 = r5
            r30 = r35
            r31 = r6
            r27 = r3
            r28 = r4
            X.AnonymousClass31G.A01(r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0187:
            X.1VX r4 = r0.A0U
            r3 = 4225(0x1081, float:5.92E-42)
            X.2vE r7 = X.C58422vE.A02
            boolean r3 = r4.A0Y(r7, r3)
            if (r3 == 0) goto L_0x019a
            X.4FS r4 = r0.A0c
            r3 = 18
            X.C18290x4.A1M(r4, r1, r0, r3)
        L_0x019a:
            java.lang.String r4 = r1.A07
            com.whatsapp.jid.PhoneUserJid r5 = r1.A00
            X.7am r6 = r0.A08
            int r13 = X.AnonymousClass31J.A01(r4)
            java.lang.String r3 = r1.A09
            int r1 = X.AnonymousClass5A4.A00(r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r14 = 6
            r4 = 0
            r8 = r6
            r9 = r35
            r11 = r2
            r12 = r3
            r15 = r4
            r8.A02(r9, r10, r11, r12, r13, r14, r15)
            X.2zL r3 = r0.A0a
            if (r5 != 0) goto L_0x01be
            r5 = r9
        L_0x01be:
            X.1VX r1 = r3.A03
            r0 = 5245(0x147d, float:7.35E-42)
            boolean r0 = r1.A0Y(r7, r0)
            if (r0 == 0) goto L_0x0223
            X.2ss r0 = r3.A01
            X.31A r8 = r0.A0A(r5, r4)
            if (r8 == 0) goto L_0x0223
            X.1Yq r2 = new X.1Yq
            r2.<init>()
            java.lang.String r0 = r5.getRawString()
            r2.A03 = r0
            java.lang.Long r0 = r8.A06()
            long r6 = r0.longValue()
            X.2sH r0 = r3.A00
            long r4 = r0.A0H()
            X.3Lv r0 = r3.A02
            long r0 = r0.A04(r6)
            long r4 = r4 - r0
            double r0 = X.C60892zL.A00(r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A02 = r0
            java.lang.Long r0 = r8.A06()
            long r0 = r0.longValue()
            double r0 = r3.A01(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            java.lang.Long r0 = r8.A06()
            long r0 = r0.longValue()
            double r0 = r3.A02(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A01 = r0
            X.4FV r0 = r3.A04
            r0.BhD(r2)
        L_0x0223:
            return
        L_0x0224:
            java.lang.String r3 = "messages_not_helpful"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x016e
            r7 = 1
            goto L_0x016e
        L_0x0230:
            java.lang.String r3 = "too_many_messages"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x016e
            r7 = 2
            goto L_0x016e
        L_0x023c:
            java.lang.String r3 = "suspicious"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x016e
            r7 = 3
            goto L_0x016e
        L_0x0248:
            java.lang.String r3 = "biz_account_info_block"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x025a
            goto L_0x0164
        L_0x0252:
            java.lang.String r3 = "account_info_block"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0164
        L_0x025a:
            java.lang.Integer r32 = java.lang.Integer.valueOf(r6)
            goto L_0x0164
        L_0x0260:
            java.lang.String r3 = "biz_overflow_menu_block"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0274
            goto L_0x0164
        L_0x026a:
            java.lang.String r3 = "chat"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0274
            goto L_0x0164
        L_0x0274:
            java.lang.Integer r32 = X.C18280x3.A0S()
            goto L_0x0164
        L_0x027a:
            java.lang.String r3 = "psa_banner_block"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0164
            java.lang.Integer r32 = X.AnonymousClass0x9.A0j()
            X.33p r3 = r0.A0K
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r3)
            java.lang.String r3 = "wac_consent_shown"
            X.C18270x1.A0l(r5, r3, r6)
            goto L_0x0164
        L_0x0295:
            java.lang.String r4 = "unblock"
            goto L_0x013b
        L_0x029a:
            com.whatsapp.jid.UserJid r6 = r13.A04
            boolean r4 = X.C627336j.A0L(r6)
            if (r4 == 0) goto L_0x02aa
            X.2sM r4 = r3.A0A
            com.whatsapp.jid.PhoneUserJid r4 = X.C56662sM.A00(r4, r6)
            r13.A00 = r4
        L_0x02aa:
            X.2qk r8 = r3.A02
            X.33p r5 = r3.A09
            X.2Vd r4 = new X.2Vd
            r4.<init>(r3)
            X.3Sn r11 = new X.3Sn
            r11.<init>(r8, r4, r5, r7)
            X.2vg r14 = r3.A07
            java.lang.String r3 = "blocklistv2setprotocolhelper/sendSetBlocklistRequest"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.31C r3 = r11.A03
            r17 = r3
            r10 = 2
            X.33p r3 = r11.A02
            android.content.SharedPreferences r4 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r3 = "block_list_v2_dhash"
            java.lang.String r5 = X.C18280x3.A0Z(r4, r3)
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            boolean r9 = r13.A0A
            if (r9 == 0) goto L_0x03a9
            java.lang.String r7 = "block"
        L_0x02de:
            java.lang.String r3 = "action"
            X.AnonymousClass39V.A03(r3, r7, r4)
            com.whatsapp.jid.PhoneUserJid r7 = r13.A00
            java.lang.String r3 = "jid"
            if (r7 != 0) goto L_0x02ea
            r7 = r6
        L_0x02ea:
            X.AnonymousClass39V.A01(r7, r3, r4)
            boolean r3 = X.C107575bX.A0F(r5)
            if (r3 != 0) goto L_0x02f8
            java.lang.String r3 = "dhash"
            X.AnonymousClass39V.A03(r3, r5, r4)
        L_0x02f8:
            r3 = 0
            X.39V[] r8 = X.C18300x5.A1Z(r4, r3)
            if (r9 != 0) goto L_0x0344
            r4 = 0
        L_0x0300:
            java.lang.String r3 = "item"
            X.AnonymousClass36K.A0O(r4, r3, r12, r8)
            r4 = 1
            r6 = 0
            if (r9 == 0) goto L_0x031a
            java.lang.String r7 = r13.A07
            if (r7 == 0) goto L_0x031a
            X.39V[] r5 = new X.AnonymousClass39V[r4]
            java.lang.String r3 = "source"
            X.AnonymousClass39V.A0B(r3, r7, r5, r6)
            java.lang.String r3 = "entry_point"
            X.AnonymousClass36K.A0R(r3, r12, r5)
        L_0x031a:
            X.39V[] r5 = X.AnonymousClass0x9.A1W()
            X.AnonymousClass39V.A0E(r5, r6)
            java.lang.String r3 = "id"
            X.AnonymousClass39V.A0D(r3, r15, r5, r4, r10)
            java.lang.String r4 = "xmlns"
            java.lang.String r3 = "blocklist"
            X.AnonymousClass39V.A07(r4, r3, r5)
            X.36K[] r4 = X.C18280x3.A1a(r12, r6)
            java.lang.String r3 = "iq"
            X.36K r5 = X.AnonymousClass36K.A0J(r3, r5, r4)
            r8 = 20000(0x4e20, double:9.8813E-320)
            r3 = r17
            r4 = r11
            r6 = r15
            r7 = r10
            r3.A0K(r4, r5, r6, r7, r8)
            goto L_0x014c
        L_0x0344:
            java.lang.Boolean r3 = r13.A05
            if (r3 != 0) goto L_0x039c
            java.lang.String r4 = "none"
        L_0x034b:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.String r3 = "first_message"
            X.AnonymousClass39V.A03(r3, r4, r7)
            java.lang.String r4 = r13.A08
            if (r4 == 0) goto L_0x0368
            java.lang.String r3 = "reason"
            X.AnonymousClass39V.A03(r3, r4, r7)
            java.lang.String r4 = r13.A09
            if (r4 == 0) goto L_0x0368
            java.lang.String r3 = "reason_description"
            X.AnonymousClass39V.A03(r3, r4, r7)
        L_0x0368:
            java.lang.String r4 = r13.A07
            if (r4 == 0) goto L_0x0371
            java.lang.String r3 = "entry_point"
            X.AnonymousClass39V.A03(r3, r4, r7)
        L_0x0371:
            if (r14 == 0) goto L_0x038f
            java.lang.String r4 = "business_discovery_entry_point"
            java.lang.String r3 = r14.A03
            X.AnonymousClass39V.A03(r4, r3, r7)
            java.lang.String r6 = "business_discovery_timestamp"
            long r3 = r14.A00
            X.39V r5 = new X.39V
            r5.<init>((java.lang.String) r6, (long) r3)
            r7.add(r5)
            java.lang.String r4 = r14.A02
            if (r4 == 0) goto L_0x038f
            java.lang.String r3 = "business_discovery_id"
            X.AnonymousClass39V.A03(r3, r4, r7)
        L_0x038f:
            r3 = 0
            X.39V[] r4 = X.C18300x5.A1Z(r7, r3)
            java.lang.String r3 = "biz_opt_out"
            X.36K r4 = X.AnonymousClass36K.A0I(r3, r4)
            goto L_0x0300
        L_0x039c:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03a6
            java.lang.String r4 = "true"
            goto L_0x034b
        L_0x03a6:
            java.lang.String r4 = "false"
            goto L_0x034b
        L_0x03a9:
            java.lang.String r7 = "unblock"
            goto L_0x02de
        L_0x03ae:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56962sq.A0C(android.app.Activity, X.49C, X.2Tn, boolean):void");
    }

    public final void A0K(C46112b6 r23) {
        AnonymousClass36K A0I2;
        C56612sH r12 = this.A0J;
        AnonymousClass31C r14 = this.A0Y;
        C68393Sz r10 = new C68393Sz(this, r12, this.A0K, r14, r23);
        Log.i("getblocklistprotocolhelper/sendGetBlocklistRequest");
        AnonymousClass31C r15 = r10.A03;
        String A032 = r15.A03();
        String A0Z2 = C18280x3.A0Z(AnonymousClass0x2.A0F(r10.A02), "block_list_v2_dhash");
        if (TextUtils.isEmpty(A0Z2)) {
            A0I2 = null;
        } else {
            AnonymousClass39V[] r1 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B("dhash", A0Z2, r1, 0);
            A0I2 = AnonymousClass36K.A0I("item", r1);
        }
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        C135206kI r4 = C135206kI.A00;
        AnonymousClass39V.A02(r4, "to", A1W, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 1);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        AnonymousClass39V.A07("xmlns", "blocklist", A1W);
        r15.A0D(r10, AnonymousClass36K.A0F(A0I2, "iq", A1W), A032, 198, 0);
        if (this.A0V.A00.A0Y(C58422vE.A02, 1844)) {
            AnonymousClass3SZ r7 = new AnonymousClass3SZ(new C85684Hf(this, 0), r14);
            Log.i("GetChatPsaBlockingStatusHelper/sendGetChatPsaBlockStatusRequest");
            AnonymousClass31C r152 = r7.A01;
            String A033 = r152.A03();
            C56052rL A042 = C56052rL.A04("iq");
            C56052rL.A06(r4, A042, "to");
            C56052rL.A0D(A042, "xmlns", "w:comms:chat");
            C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A033);
            C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C56052rL A043 = C56052rL.A04("query");
            C56052rL.A07(C56052rL.A04("blocking_status"), A043);
            C56052rL.A07(A043, A042);
            r152.A0D(r7, A042.A0F(), A033, 340, 0);
        }
    }

    public final boolean A0M() {
        return AnonymousClass000.A1S((AnonymousClass0x2.A0F(this.A0K).getLong("block_list_receive_time", 0) > 0 ? 1 : (AnonymousClass0x2.A0F(this.A0K).getLong("block_list_receive_time", 0) == 0 ? 0 : -1)));
    }

    public final boolean A0O(AnonymousClass3ZH r5, boolean z) {
        UserJid userJid;
        if (r5 != null) {
            userJid = AnonymousClass32Y.A05(r5.A0H);
        } else {
            userJid = null;
        }
        if (this.A0U.A0Y(C58422vE.A02, 978) || !z || r5 == null || userJid == null || !r5.A0R() || !this.A0G.A03(userJid)) {
            return false;
        }
        return true;
    }

    public final boolean A0P(UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        return this.A0d.contains(userJid);
    }

    public final Set A07(Set set) {
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid A022 = A02(C18310x6.A0T(it));
            if (A022 != null) {
                A0K2.add(A022);
            }
        }
        return A0K2;
    }

    public final void A0G(Activity activity, UserJid userJid) {
        C18260x0.A0O(activity, userJid);
        A0D(activity, (AnonymousClass49C) null, userJid);
    }

    public final void A0I(UserJid userJid, String str, boolean z) {
        A0J(userJid, z);
        if (this.A0C.A01(userJid, z)) {
            C18270x1.A0j(C18270x1.A03(this.A0K), "block_list_v2_dhash", str);
        }
        C69263Wi.A09(this.A05, this, userJid, 20);
    }

    public C56962sq(AnonymousClass2XO r37, C55682qk r38, C48352el r39, C69263Wi r40, C66663Mh r41, C29411im r42, C153167am r43, C41162Je r44, C68213Sh r45, C48402eq r46, C34431v9 r47, C64773Ex r48, C29421in r49, C47882dz r50, C56422rx r51, AnonymousClass5ZU r52, C113905mB r53, C56612sH r54, AnonymousClass33p r55, C620733j r56, C56122rS r57, C66543Lv r58, AnonymousClass2Y3 r59, C56152rV r60, C72303dV r61, C56382rt r62, C55302q8 r63, C56662sM r64, AnonymousClass1VX r65, AnonymousClass3LP r66, AnonymousClass4FV r67, AnonymousClass2RM r68, AnonymousClass31C r69, C56832sd r70, C60892zL r71, C56572sD r72, AnonymousClass4FS r73) {
        C56612sH r23 = r54;
        AnonymousClass1VX r19 = r65;
        AnonymousClass2XO r35 = r37;
        C55682qk r34 = r38;
        C69263Wi r32 = r40;
        C18260x0.A0f(r23, r19, r35, r32, r34);
        C56382rt r20 = r62;
        AnonymousClass4FS r15 = r73;
        C56572sD r14 = r72;
        AnonymousClass4FV r17 = r67;
        C66663Mh r31 = r41;
        C18260x0.A0g(r15, r20, r17, r31, r14);
        C56122rS r21 = r57;
        C162457s7.A0J(r21, 11);
        C620733j r22 = r56;
        AnonymousClass5ZU r24 = r52;
        AnonymousClass31C r16 = r69;
        AnonymousClass3LP r18 = r66;
        C64773Ex r27 = r48;
        C18260x0.A0h(r18, r16, r24, r27, r22);
        C48352el r33 = r39;
        C162457s7.A0J(r33, 18);
        C56152rV r13 = r60;
        C56662sM r5 = r64;
        C29421in r26 = r49;
        C18290x4.A1N(r26, r5, r13);
        C29411im r30 = r42;
        C162457s7.A0J(r30, 22);
        C60892zL r2 = r71;
        C162457s7.A0J(r2, 24);
        C72303dV r7 = r61;
        C162457s7.A0J(r7, 25);
        AnonymousClass33p r12 = r55;
        C162457s7.A0J(r12, 26);
        C56422rx r25 = r51;
        C162457s7.A0J(r25, 27);
        C66543Lv r9 = r58;
        C162457s7.A0J(r9, 28);
        C113905mB r11 = r53;
        C162457s7.A0J(r11, 29);
        C56832sd r3 = r70;
        C162457s7.A0J(r3, 30);
        C68213Sh r29 = r45;
        C162457s7.A0J(r29, 31);
        AnonymousClass2RM r4 = r68;
        C162457s7.A0J(r4, 33);
        C47882dz r10 = r50;
        C162457s7.A0J(r10, 34);
        C55302q8 r6 = r63;
        C162457s7.A0J(r6, 35);
        C48402eq r28 = r46;
        C162457s7.A0J(r28, 36);
        AnonymousClass2Y3 r8 = r59;
        C162457s7.A0J(r8, 37);
        this.A0J = r23;
        this.A0U = r19;
        this.A02 = r35;
        this.A05 = r32;
        this.A03 = r34;
        this.A0c = r15;
        this.A0R = r20;
        this.A0W = r17;
        this.A06 = r31;
        this.A0b = r14;
        this.A0M = r21;
        this.A0V = r18;
        this.A0Y = r16;
        this.A0H = r24;
        this.A0D = r27;
        this.A0L = r22;
        this.A0C = r47;
        this.A04 = r33;
        this.A0E = r26;
        this.A0T = r5;
        this.A0P = r13;
        this.A07 = r30;
        this.A08 = r43;
        this.A0a = r2;
        this.A0Q = r7;
        this.A0K = r12;
        this.A0G = r25;
        this.A0N = r9;
        this.A0I = r11;
        this.A0Z = r3;
        this.A0A = r29;
        this.A09 = r44;
        this.A0X = r4;
        this.A0F = r10;
        this.A0S = r6;
        this.A0B = r28;
        this.A0O = r8;
    }
}
