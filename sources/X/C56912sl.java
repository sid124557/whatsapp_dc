package X;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.Me;
import com.whatsapp.registration.integritysignals.GpiaRegClient$calculateGpiaParameter$1;
import com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenBlocking$1;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sl  reason: invalid class name and case insensitive filesystem */
public class C56912sl {
    public C58752vl A00;
    public String A01;
    public final C106175Xx A02;
    public final C56972sr A03;
    public final C56492s4 A04;
    public final C29441ip A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final AnonymousClass5ZR A09;
    public final AnonymousClass33p A0A;
    public final C620733j A0B;
    public final AnonymousClass1VW A0C;
    public final AnonymousClass4FV A0D;
    public final C59742xP A0E;
    public final AnonymousClass33K A0F;
    public final AnonymousClass3Au A0G;
    public final AnonymousClass3At A0H;
    public final AnonymousClass2TA A0I;
    public final C57542to A0J;
    public final C55132pq A0K;
    public final AnonymousClass3FI A0L;
    public final AnonymousClass4FS A0M;
    public final C40882Ic A0N;
    public final C55142pr A0O;
    public final C106535Zj A0P;

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A04(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r1 = "eu"
            X.5Xx r0 = r4.A02     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            java.lang.String r0 = r0.A03(r5)     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            boolean r0 = r1.equals(r0)     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            if (r0 != 0) goto L_0x002a
            X.2oU r0 = r4.A08     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            android.content.Context r0 = r0.A00     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            X.2XM r0 = X.C158157jW.A00(r0)     // Catch:{ 6QB | 6yw | IOException -> 0x0018 }
            goto L_0x002b
        L_0x0018:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegistrationHttpManager/RegistrationHelper/getAdvertisingId at "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " failed"
            X.C18260x0.A15(r0, r1, r2)
        L_0x002a:
            r0 = r3
        L_0x002b:
            if (r0 == 0) goto L_0x002f
            java.lang.String r3 = r0.A00
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56912sl.A04(java.lang.String, java.lang.String):java.lang.String");
    }

    public AnonymousClass5WM A01(C150607Rl r23, String str, String str2, String str3, String str4, JSONObject jSONObject, byte[] bArr, boolean z) {
        int simState;
        String str5;
        String str6;
        if (!A0F()) {
            return new AnonymousClass5WM(C998758n.FAIL_TO_INITIALIZE_WAMSYS, 0);
        }
        A0E(true);
        String str7 = str;
        String str8 = str2;
        byte[] A0H2 = A0H(str7, str8);
        Context context = this.A08.A00;
        AnonymousClass33p r8 = this.A0A;
        byte[] A062 = AnonymousClass36Q.A06(context, r8, str8, 1);
        if (A062 == null) {
            A062 = C627236i.A0H();
        }
        byte[] A063 = AnonymousClass36Q.A06(context, r8, str8, 2);
        r8.A23(A062);
        boolean A0F2 = this.A09.A0F();
        C620633i r2 = this.A06;
        TelephonyManager A0N2 = r2.A0N();
        if (A0N2 == null) {
            simState = -1;
        } else {
            simState = A0N2.getSimState();
        }
        String valueOf = String.valueOf(simState);
        TelephonyManager A0N3 = r2.A0N();
        String str9 = "";
        if (A0N3 != null) {
            str5 = A0N3.getNetworkOperatorName();
            str9 = A0N3.getSimOperatorName();
        } else {
            str5 = str9;
        }
        byte[] bArr2 = bArr;
        if (bArr == null) {
            Log.i("RegistrationHttpManager/checkIfExists/null clientCapabilities");
        }
        HashMap A0t = AnonymousClass001.A0t();
        C18280x3.A1B("token", str3, A0t);
        if (z) {
            A0t.put("context", "poll_2fa".getBytes());
        }
        Integer A002 = C57542to.A00(context.getPackageManager());
        if (A002 != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "RegistrationHttpManager/checkIfExists/tmobile_exp:", A002);
            A0t.put("tmobile_exp", Integer.toString(A002.intValue()).getBytes());
        }
        C18280x3.A1B("mistyped", str4, A0t);
        if (jSONObject != null) {
            A0t.put("offline_ab", AnonymousClass0x9.A1R(jSONObject));
        }
        JSONObject A003 = r23.A00();
        try {
            A003.put("was_activated_from_stub", context.getSharedPreferences("downloader_stub", 0).getBoolean("activated", false));
        } catch (JSONException unused) {
            Log.e("RegistrationHttpManager/Failed to add stub activation metric.");
        }
        A0t.put("client_metrics", AnonymousClass0x9.A1R(A003));
        if (A0F2) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        A0t.put("read_phone_permission_granted", str6.getBytes());
        C18280x3.A1B("sim_state", valueOf, A0t);
        C18280x3.A1B("network_operator_name", str5, A0t);
        C18280x3.A1B("sim_operator_name", str9, A0t);
        A0t.put("device_name", Build.DEVICE.getBytes());
        C183538qC r6 = r8.A01;
        String A0Z = C18280x3.A0Z(C18300x5.A0B(r6), "backup_token_retrieval_error");
        if (!TextUtils.isEmpty(A0Z)) {
            C18280x3.A1B("backup_token_error", A0Z, A0t);
        }
        String string = C18300x5.A0B(r6).getString("pref_autoconf_feo2_query_status", "did_not_query");
        C626936e.A06(string);
        A0t.put("feo2_query_status", string.getBytes());
        A09(A0t);
        A0C(A0t);
        String l = Long.toString(AnonymousClass0x2.A0B(C18300x5.A0B(r6), "language_selector_time_spent"));
        String num = Integer.toString(C18280x3.A02(C18300x5.A0B(r6), "language_selector_clicked_count"));
        C18280x3.A1B("language_selector_time_spent", l, A0t);
        C18280x3.A1B("language_selector_clicked_count", num, A0t);
        C18260x0.A0K(r8, "language_selector_clicked_count");
        C18260x0.A0K(r8, "language_selector_time_spent");
        A0B(A0t);
        A08(A0t);
        A0A(A0t);
        A0D(A0t);
        C18270x1.A0j(C18270x1.A03(r8), "registration_push_notif_code", (String) null);
        String string2 = C18300x5.A0B(r6).getString("c2dm_reg_id", (String) null);
        if (!TextUtils.isEmpty(string2)) {
            C18280x3.A1B("push_token", string2, A0t);
        }
        return (AnonymousClass5WM) C105935Wz.A00(new AnonymousClass56K(this.A0N, this.A0P, str7, str8, A04(str7, "exist_entrypoint"), A05(), A0t, A0H2, A062, A063, bArr2));
    }

    public final Map A07(C97684z4 r8, String str, int i) {
        String str2;
        String str3;
        TelephonyManager A0N2 = this.A06.A0N();
        String str4 = null;
        if (A0N2 != null) {
            str2 = A0N2.getNetworkOperator();
        } else {
            str2 = null;
        }
        AnonymousClass34d A002 = AnonymousClass34d.A00(str2);
        if (A0N2 != null) {
            str4 = A0N2.getSimOperator();
        }
        AnonymousClass34d A003 = AnonymousClass34d.A00(str4);
        String str5 = "";
        if (A0N2 != null) {
            str3 = A0N2.getNetworkOperatorName();
            str5 = A0N2.getSimOperatorName();
        } else {
            str3 = str5;
        }
        Log.i("RegistrationHttpManager/wamsys/verifycode");
        HashMap A0t = AnonymousClass001.A0t();
        if (str != null) {
            C18280x3.A1B("mistyped", str, A0t);
        }
        A0t.put("client_metrics", AnonymousClass0x9.A1R(r8.A00()));
        A00(A002, A003, "entered", String.valueOf(i).getBytes(), A0t);
        C18280x3.A1B("network_operator_name", str3, A0t);
        C18280x3.A1B("sim_operator_name", str5, A0t);
        A08(A0t);
        return A0t;
    }

    public final void A09(Map map) {
        String str = this.A01;
        if (str == null) {
            str = new DecimalFormat("#.##").format(((double) AnonymousClass35D.A02(this.A06)) / 1.073741824E9d);
            this.A01 = str;
        }
        map.put("device_ram", str.getBytes());
    }

    public final void A0A(Map map) {
        int i;
        int i2;
        AnonymousClass1VW r3 = this.A0C;
        C58422vE r2 = C58422vE.A02;
        if (r3.A0Y(r2, 4435)) {
            if (r3.A0Y(r2, 4399)) {
                TelephonyManager A0N2 = this.A06.A0N();
                if (A0N2 == null) {
                    i2 = 2;
                } else {
                    i2 = 1;
                    if (A0N2.getSimState() == 1) {
                        i2 = 0;
                    }
                }
                map.put("sim_type", Integer.toString(i2).getBytes());
            }
            if (r3.A0Y(r2, 4400)) {
                map.put("airplane_mode_type", Integer.toString(C29441ip.A02(this.A08.A00) ? 1 : 0).getBytes());
            }
            if (r3.A0Y(r2, 4401)) {
                map.put("cellular_strength", Integer.toString(C386128j.A00(this.A06)).getBytes());
            }
            if (r3.A0Y(r2, 4402) && this.A05.A0A() != null) {
                TelephonyManager A0N3 = this.A06.A0N();
                if (A0N3 != null) {
                    i = A0N3.isNetworkRoaming();
                } else {
                    i = 2;
                }
                map.put("roaming_type", Integer.toString(i).getBytes());
            }
        }
    }

    public final void A0B(Map map) {
        AnonymousClass2TA r9 = this.A0I;
        Log.d("GpiaRegClient: fetchToken called");
        AnonymousClass1VW r1 = r9.A03;
        C58422vE r3 = C58422vE.A02;
        if (!r1.A0Y(r3, 3753)) {
            Log.w("GpiaRegClient: ABProp is not enabled, so returning without fetching token");
            return;
        }
        GpiaRegClient$fetchTokenBlocking$1 gpiaRegClient$fetchTokenBlocking$1 = new GpiaRegClient$fetchTokenBlocking$1(r9, (C84814Du) null);
        C72553du r2 = C72553du.A00;
        C58482vK r7 = (C58482vK) C380725l.A00(r2, gpiaRegClient$fetchTokenBlocking$1);
        if (r7 != null) {
            String str = r7.A01;
            if (str != null) {
                map.put("gpia_token", str.getBytes());
            }
            if (this.A0C.A0Y(r3, 5696)) {
                long currentTimeMillis = System.currentTimeMillis();
                map.put("gpia", ((String) C380725l.A00(r2, new GpiaRegClient$calculateGpiaParameter$1(r9, str, (C84814Du) null, r7.A00))).getBytes());
                C24591Xz r22 = new C24591Xz();
                C24591Xz.A00(r22, System.currentTimeMillis(), currentTimeMillis);
                r22.A02 = "gpia-param-prepare";
                this.A0D.BhD(r22);
                return;
            }
            JSONObject A1G = AnonymousClass0x9.A1G();
            if (str != null) {
                A1G.put("token", str);
            }
            A1G.put("error_code", r7.A00);
            map.put("gpia", C18290x4.A0o(A1G).getBytes());
        }
    }

    public final void A0C(Map map) {
        Me A0E2 = this.A03.A0E();
        if (A0E2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A0E2.cc);
            map.put("old_phone_number", AnonymousClass000.A0X(A0E2.number, A0o).getBytes());
        }
    }

    public final void A0D(Map map) {
        AnonymousClass2XL BBI = this.A0H.BBI();
        String str = BBI.A01;
        if (!C107575bX.A0F(str)) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append("|");
            map.put("fid", AnonymousClass001.A0k(A0l, C18290x4.A0B(BBI.A00)).getBytes());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r0 == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ InterruptedException -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(boolean r7) {
        /*
            r6 = this;
            java.lang.String r0 = "blacknoise: kick off reg time work"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0047 }
            java.util.concurrent.CountDownLatch r4 = X.C18290x4.A14()     // Catch:{ InterruptedException -> 0x0047 }
            X.2pr r5 = r6.A0O     // Catch:{ InterruptedException -> 0x0047 }
            r3 = 0
            if (r7 == 0) goto L_0x000f
            r3 = r4
        L_0x000f:
            boolean r0 = r5.A02     // Catch:{ InterruptedException -> 0x0047 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "blacknoise: not boostrapped for reg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0047 }
            if (r3 == 0) goto L_0x0032
            goto L_0x002f
        L_0x001b:
            X.4FS r2 = r5.A0C     // Catch:{ InterruptedException -> 0x0047 }
            r0 = 41
            X.3a2 r1 = new X.3a2     // Catch:{ InterruptedException -> 0x0047 }
            r1.<init>(r5, r0, r3)     // Catch:{ InterruptedException -> 0x0047 }
            java.lang.String r0 = "regtime_ka"
            boolean r0 = r2.BkQ(r1, r0)     // Catch:{ InterruptedException -> 0x0047 }
            if (r3 == 0) goto L_0x0032
            if (r0 != 0) goto L_0x0032
        L_0x002f:
            r3.countDown()     // Catch:{ InterruptedException -> 0x0047 }
        L_0x0032:
            if (r7 == 0) goto L_0x0041
            X.1VW r1 = r6.A0C     // Catch:{ InterruptedException -> 0x0047 }
            r0 = 4696(0x1258, float:6.58E-42)
            long r1 = X.C56952sp.A06(r1, r0)     // Catch:{ InterruptedException -> 0x0047 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0047 }
            r4.await(r1, r0)     // Catch:{ InterruptedException -> 0x0047 }
        L_0x0041:
            java.lang.String r0 = "blacknoise: finish off reg time work"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0047 }
            return
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "blacknoise: bad reg time work"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56912sl.A0E(boolean):void");
    }

    public boolean A0F() {
        String str = this.A0G.BBI().A01;
        C55142pr r0 = this.A0O;
        C54292oU r2 = this.A08;
        AnonymousClass3FI r6 = this.A0L;
        AnonymousClass4FS r7 = this.A0M;
        if (r0.A03(this.A04, r2, this.A0A, this.A0B, this.A0K, r6, r7, str)) {
            return true;
        }
        Log.e("RegistrationHttpManager/ensureWamsysForRegBootstrapped/waMsysSetup.bootstrapForReg failed");
        return false;
    }

    public byte[] A0G(String str) {
        AnonymousClass33p r2 = this.A0A;
        byte[] decode = Base64.decode(AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(r2), "token_used_during_reg"), 3);
        if (decode.length != 0) {
            return decode;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RegistrationHttpManager/");
        A0o.append(str);
        C18260x0.A1L(A0o, "/no backup token read from shared preferences, generate a new one");
        byte[] A0H2 = C627236i.A0H();
        r2.A23(A0H2);
        return A0H2;
    }

    public byte[] A0H(String str, String str2) {
        Context context = this.A08.A00;
        String A002 = C386028i.A00(AnonymousClass000.A0T(str, str2));
        byte[] A0J2 = C627236i.A0J(context, A002);
        if (A0J2 != null) {
            return A0J2;
        }
        byte[] A0H2 = C627236i.A0H();
        C627236i.A0D(context, A002, A0H2);
        return A0H2;
    }

    public C56912sl(C106175Xx r2, C56972sr r3, C56492s4 r4, C29441ip r5, C620633i r6, C56612sH r7, C54292oU r8, AnonymousClass5ZR r9, AnonymousClass33p r10, C620733j r11, AnonymousClass1VW r12, AnonymousClass4FV r13, C59742xP r14, AnonymousClass33K r15, AnonymousClass3Au r16, AnonymousClass3At r17, AnonymousClass2TA r18, C57542to r19, C55132pq r20, AnonymousClass3FI r21, AnonymousClass4FS r22, C40882Ic r23, C55142pr r24, C106535Zj r25) {
        this.A07 = r7;
        this.A03 = r3;
        this.A0L = r21;
        this.A08 = r8;
        this.A0M = r22;
        this.A04 = r4;
        this.A0D = r13;
        this.A0O = r24;
        this.A0G = r16;
        this.A0F = r15;
        this.A0H = r17;
        this.A0I = r18;
        this.A06 = r6;
        this.A0B = r11;
        this.A0C = r12;
        this.A02 = r2;
        this.A0K = r20;
        this.A09 = r9;
        this.A0A = r10;
        this.A0N = r23;
        this.A0E = r14;
        this.A05 = r5;
        this.A0P = r25;
        this.A0J = r19;
    }

    public static void A00(AnonymousClass34d r2, AnonymousClass34d r3, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put("mcc", r2.A00.getBytes());
        abstractMap.put("mnc", r2.A01.getBytes());
        abstractMap.put("sim_mcc", r3.A00.getBytes());
        abstractMap.put("sim_mnc", r3.A01.getBytes());
    }

    public C156777hB A02(String str, String str2) {
        if (!A0F()) {
            return new C156777hB();
        }
        Log.i("RegistrationHttpManager/wamsys/reg-onboard-abprop-request");
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("rc", String.valueOf(C374722t.BETA.value).getBytes());
        C183538qC r3 = this.A0A.A01;
        if (C18300x5.A0B(r3).getString("pref_pre_chatd_ab_hash", (String) null) != null) {
            A0t.put("ab_hash", C18300x5.A0B(r3).getString("pref_pre_chatd_ab_hash", (String) null).getBytes());
        }
        return (C156777hB) C105935Wz.A00(new C138526qZ(this.A0N, this.A0P, str, str2, A0t));
    }

    public AnonymousClass5LR A03(C150607Rl r14, String str, String str2, String str3, String str4) {
        byte[] bArr;
        int A1S;
        if (!A0F()) {
            return new AnonymousClass5LR(C998458k.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
        }
        A0E(true);
        String str5 = str;
        String str6 = str2;
        byte[] A0H2 = A0H(str, str6);
        byte[] A0G2 = A0G("resetSecurityCode");
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("client_metrics", AnonymousClass0x9.A1R(r14.A00()));
        A08(A0t);
        if (str4 != null) {
            bArr = str4.getBytes();
        } else {
            bArr = null;
        }
        String str7 = str3;
        if ("wipe".equals(str7)) {
            A1S = 2;
        } else {
            A1S = AnonymousClass000.A1S("email".equals(str7) ? 1 : 0);
        }
        return (AnonymousClass5LR) C105935Wz.A00(new AnonymousClass56M(this.A0N, this.A0P, (String) null, str5, str6, A04(str, "security_entrypoint"), A05(), A0t, bArr, A0H2, A0G2, A1S));
    }

    public final List A05() {
        ArrayList A0s = AnonymousClass001.A0s();
        C59742xP r2 = this.A0E;
        try {
            r2.A00();
        } catch (IOException e) {
            Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.addAll(r2.A07);
        A0s2.addAll(r2.A08);
        A0s2.addAll(r2.A06);
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            AnonymousClass2Q9 r3 = (AnonymousClass2Q9) it.next();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(r3.A02);
            A0o.append(" ");
            A0o.append(r3.A01);
            A0o.append(" ");
            C18270x1.A1D(r3.A03, A0o, A0s);
        }
        return A0s;
    }

    public final Map A06(C97694z5 r6, AnonymousClass34d r7, AnonymousClass34d r8, String str, String str2, String str3) {
        HashMap A0t = AnonymousClass001.A0t();
        if (str2 != null) {
            C18280x3.A1B("mistyped", str2, A0t);
        }
        C18280x3.A1B("reason", str, A0t);
        if (str3 != null) {
            C18280x3.A1B("hasav", str3, A0t);
        }
        A00(r7, r8, "client_metrics", AnonymousClass0x9.A1R(r6.A00()), A0t);
        C183538qC r3 = this.A0A.A01;
        A0t.put("education_screen_displayed", String.valueOf(C18300x5.A0B(r3).getBoolean("pref_flash_call_education_screen_displayed", false)).getBytes());
        A0t.put("prefer_sms_over_flash", String.valueOf(C18300x5.A0B(r3).getBoolean("pref_prefer_sms_over_flash", false)).getBytes());
        A08(A0t);
        A0A(A0t);
        String A0Z = C18280x3.A0Z(C18300x5.A0B(r3), "registration_push_notif_code");
        if (!TextUtils.isEmpty(A0Z)) {
            C18280x3.A1B("push_code", A0Z, A0t);
        }
        if (!TextUtils.isEmpty(C18280x3.A0Z(C18300x5.A0B(r3), "pref_profile_checkpoint_name"))) {
            A0t.put("profile_name", "true".getBytes());
        }
        return A0t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r2 < 6) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.util.Map r6) {
        /*
            r5 = this;
            r6.size()
            X.1ip r0 = r5.A05
            X.2hc r0 = r0.A0A()
            java.lang.Integer r0 = X.AnonymousClass26q.A00(r0)
            if (r0 != 0) goto L_0x0086
            r0 = -1
        L_0x0010:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "network_radio_type"
            r6.put(r0, r1)
            X.2oU r4 = r5.A08
            X.33i r1 = r5.A06
            X.5ZR r0 = r5.A09
            java.lang.String r0 = X.C621333r.A01(r1, r4, r0)
            if (r0 == 0) goto L_0x0032
            int r2 = r0.length()
            r1 = 6
            r0 = 1
            if (r2 >= r1) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            r1 = r2
            if (r0 == 0) goto L_0x003b
            r1 = r3
        L_0x003b:
            byte[] r1 = r1.getBytes()
            java.lang.String r0 = "simnum"
            r6.put(r0, r1)
            android.content.Context r0 = r4.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "rc2"
            boolean r0 = X.C18300x5.A1V(r1, r0)
            if (r0 != 0) goto L_0x0055
            r3 = r2
        L_0x0055:
            byte[] r1 = r3.getBytes()
            java.lang.String r0 = "hasinrc"
            r6.put(r0, r1)
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "pid"
            r6.put(r0, r1)
            X.22t r0 = X.C374722t.BETA
            int r0 = r0.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "rc"
            r6.put(r0, r1)
            r6.size()
            return
        L_0x0086:
            int r0 = r0.intValue()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56912sl.A08(java.util.Map):void");
    }
}
