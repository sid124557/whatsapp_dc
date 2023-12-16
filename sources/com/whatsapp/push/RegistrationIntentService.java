package com.whatsapp.push;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00W;
import X.AnonymousClass1VX;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass756;
import X.C005105f;
import X.C107695bk;
import X.C18260x0;
import X.C183538qC;
import X.C22031Ec;
import X.C55682qk;
import X.C56612sH;
import X.C615531h;
import X.C64323Da;
import X.C64333Db;
import X.C72343dZ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class RegistrationIntentService extends C005105f implements AnonymousClass4GJ {
    public C55682qk A00;
    public C56612sH A01;
    public AnonymousClass1VX A02;
    public AnonymousClass756 A03;
    public C183538qC A04;
    public C183538qC A05;
    public C183538qC A06;
    public C183538qC A07;
    public C183538qC A08;
    public C183538qC A09;
    public C183538qC A0A;
    public C183538qC A0B;
    public C183538qC A0C;
    public boolean A0D;
    public final Object A0E;
    public volatile AnonymousClass3YV A0F;

    public final synchronized void A09() {
        if (this.A03 == null) {
            this.A03 = new AnonymousClass756();
        }
    }

    public static void A01(Context context) {
        Log.i("GCM: refreshing gcm token");
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        AnonymousClass00W.A00(context, new Intent("com.whatsapp.action.REFRESH", (Uri) null, context, cls), cls, 4);
    }

    public static void A02(Context context) {
        Log.i("GCM: force updating push config");
        A03(context, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028b, code lost:
        if (r1 != false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x028e, code lost:
        if (r22 != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0290, code lost:
        android.os.Binder.restoreCallingIdentity(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0293, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        X.C18270x1.A0h(X.C18300x5.A0A(r3.A0C).putString("c2dm_reg_id", r6), "c2dm_app_vers", 232614005);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a1, code lost:
        if (r21 != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a8, code lost:
        if (android.text.TextUtils.equals(r6, r13) != false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02aa, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ab, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b0, code lost:
        if (r18 == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b2, code lost:
        if (r20 == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b4, code lost:
        if (r1 != false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c4, code lost:
        if (X.C18270x1.A05(r3.A0C).getBoolean("saved_gcm_token_server_unreg", false) != false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c6, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r3.A00.A0A("gcm-retrieved-saved-token", false, (java.lang.String) null);
        X.C18270x1.A0v(X.C18320x8.A0J(r3.A0C), "saved_gcm_token_server_unreg", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02dc, code lost:
        if (r9 != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0073, code lost:
        if (android.text.TextUtils.isEmpty(r13) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02df, code lost:
        r1 = ((X.C45052Ym) r3.A07.get()).A00;
        r13 = X.C58422vE.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f1, code lost:
        if (r1.A0Y(r13, 283) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f9, code lost:
        if (r1.A0Y(r13, 2792) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02fb, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fe, code lost:
        r4 = ((X.C45052Ym) r3.A07.get()).A00();
        r10 = r4.A01;
        r11 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x030e, code lost:
        if (r9 != false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0310, code lost:
        r15 = r5.getStringExtra("mutedChatsHash");
        r8 = r5.getStringExtra("appMuteConfig");
        r0 = (X.C45052Ym) r3.A07.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0326, code lost:
        if (r15 == null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0328, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032d, code lost:
        if (r15.length() != 0) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x032f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0330, code lost:
        r18 = !r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0332, code lost:
        if (r10 == null) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0334, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0339, code lost:
        if (X.C18310x6.A1X(r10) != false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033b, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x033c, code lost:
        if (r18 != false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033e, code lost:
        if (r12 == false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
        if (r22 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034a, code lost:
        if (r0.A00.A0Y(r13, 2792) == false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034c, code lost:
        if (r11 != 0) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        if (r8 == null) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0357, code lost:
        if (r8.length() != 0) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0359, code lost:
        if (r18 == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035b, code lost:
        if (r12 == false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x035d, code lost:
        if (r10 == null) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r12 = X.AnonymousClass0x7.A0t();
        X.C162457s7.A0H(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r11 = X.C58152un.A0D;
        r20 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0370, code lost:
        if (r20.hasNext() == false) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0372, code lost:
        r10 = (X.C52362lM) r20.next();
        r0 = r10.A01.getRawString();
        X.C162457s7.A0H(r11);
        r12.update(X.C18320x8.A1a(r0, r11));
        r0 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038a, code lost:
        if (r0 != null) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038c, code lost:
        r0 = r10.A02.longValue();
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0396, code lost:
        if (r0 == -1) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        if (android.text.TextUtils.equals(r13, r14) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0398, code lost:
        r18 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039e, code lost:
        r0 = java.lang.Long.valueOf(r18);
        r10.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03a4, code lost:
        r12.update(X.C18320x8.A1a(java.lang.String.valueOf(r0.longValue()), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b4, code lost:
        r0 = new byte[6];
        java.lang.System.arraycopy(r12.digest(), 0, r0, 0, 6);
        r0 = X.C18290x4.A0t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c2, code lost:
        if (r0 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ca, code lost:
        if ((!r0.equalsIgnoreCase(r15)) == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03cd, code lost:
        r0 = java.lang.String.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03d5, code lost:
        if (X.AnonymousClass75J.A00(r0, r8) != false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03d7, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new muted chats");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03e4, code lost:
        r0 = X.C18290x4.A0Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03ec, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ed, code lost:
        r1 = r5.getIntExtra("numberOfAccountsFromServer", 1);
        r8 = ((X.C614930z) ((X.AnonymousClass5HD) r3.A04.get()).A00.get()).A0A.A0C() + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        r19 = android.text.TextUtils.isEmpty(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040d, code lost:
        if (r1 == r8) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x040f, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x041f, code lost:
        if (r3.A02.A0O(r13, 4116) == X.C18320x8.A01(r5, "voipPayloadType")) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0421, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to calling push payload version");
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0433, code lost:
        if (((X.C53542nG) r3.A08.get()).A01() == false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0435, code lost:
        r1 = ((X.C53542nG) r3.A08.get()).A00(r5.getStringExtra("pKeyHash"), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0448, code lost:
        if (r9 != false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r0 = X.AnonymousClass001.A1X(232614005, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0450, code lost:
        if (X.AnonymousClass001.A1Z(r1.first) == false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0452, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to pKey rotation");
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0458, code lost:
        r2 = (java.lang.String) r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x045d, code lost:
        X.C18270x1.A0g(X.C18270x1.A03(((X.C53542nG) r3.A08.get()).A02).remove("push:push_pkey_data"), "push:push_pkey_generate_ts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0478, code lost:
        if (r9 == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0486, code lost:
        if (((X.C51072jE) r3.A0A.get()).A02() != false) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0495, code lost:
        if (((X.C51072jE) r3.A0A.get()).A00() == 2) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        if (r20 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a6, code lost:
        if (((X.AnonymousClass5G3) r3.A05.get()).A00.A00() < 7) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a8, code lost:
        ((X.C45472a4) r3.A09.get()).A00(r4, (X.AnonymousClass4DX) null, java.lang.Integer.valueOf(r8), r6, "gcm", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r19 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r1 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r0 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r4 == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r4 == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C18260x0.A0s("GCM: verifying tokenUnregisteredOnServer deleting savedToken:", r14, X.AnonymousClass001.A0o());
        A09();
        r0 = ((X.C101815Gf) r3.A06.get()).A00;
        X.C626936e.A06(r0);
        r15 = (java.lang.String) r0.get();
        r9 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C161757qO.A00());
        r8 = "FCM";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r8.isEmpty() != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        if (r8.equalsIgnoreCase("fcm") != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e0, code lost:
        if (r8.equalsIgnoreCase("gcm") == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        r8 = "*";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r6 = com.google.firebase.iid.FirebaseInstanceId.A01();
        r4 = r9.A06;
        r2 = X.AnonymousClass002.A08();
        r2.putString("delete", "1");
        X.C18290x4.A1J(r4.A00(r2, r6, r15, r8), r9, r4);
        r1 = com.google.firebase.iid.FirebaseInstanceId.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = X.C160237nI.A01(r15, r8);
        r0 = r1.A01.edit();
        r0.remove(r2);
        r0.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0 = X.AnonymousClass002.A0C("MAIN_THREAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
        X.C18270x1.A0l(X.C18270x1.A03(X.C18320x8.A0J(r3.A0C)), "saved_gcm_token_server_unreg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012a, code lost:
        A09();
        r0 = ((X.C101815Gf) r3.A06.get()).A00;
        X.C626936e.A06(r0);
        r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C161757qO.A00()).A05((java.lang.String) r0.get(), "FCM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0152, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0154, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("GCM: token retrieved successfully; token=");
        r1.append(r6.length());
        X.C18260x0.A0y(" bytes; applicationVersion=", r1, 232614005);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0169, code lost:
        if (r19 == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016b, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        X.C18320x8.A0J(r3.A0C).A19(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017a, code lost:
        r1 = !android.text.TextUtils.equals(r6, r14);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        if (r18 != false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0185, code lost:
        r0 = X.AnonymousClass0x9.A0i("GCM: empty token returned but no exception thrown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a0, code lost:
        r0 = X.AnonymousClass0x9.A0i(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01eb, code lost:
        if (r1.equals("BACKOFF") != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ed, code lost:
        r7 = java.lang.Math.min(r5.getLongExtra("delay_ms", 15000), 86400000);
        r5.putExtra("delay_ms", 2 * r7);
        r6 = ((X.C620633i) r3.A0B.get()).A07();
        r2 = X.C624735e.A05(r3, r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0215, code lost:
        if (r6 == null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        r6.cancel(r2);
        r6.set(3, android.os.SystemClock.elapsedRealtime() + r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0229, code lost:
        if (r1.equals("TOO_MANY_REGISTRATIONS") != false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022b, code lost:
        X.C18260x0.A16("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=", X.AnonymousClass001.A0o(), r2);
        X.C18320x8.A0J(r3.A0C).A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0244, code lost:
        if (r1.equals("ACCOUNT_MISSING") != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0246, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=");
        X.C18320x8.A1N(r1, r2);
        r1.append("; playServicesAvailable=");
        X.C18270x1.A1F(r1, X.C159787mS.A00(r3));
        X.C18320x8.A0J(r3.A0C).A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0285, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r25) {
        /*
            r24 = this;
            java.lang.String r23 = "delay_ms"
            r5 = r25
            java.lang.String r1 = r5.getAction()
            java.lang.String r0 = "com.whatsapp.action.VERIFY"
            boolean r22 = r0.equals(r1)
            java.lang.String r0 = "com.whatsapp.action.REFRESH"
            boolean r21 = X.C18280x3.A1V(r5, r0)
            java.lang.String r0 = "com.whatsapp.action.FORCE_REPLACE"
            boolean r4 = X.C18280x3.A1V(r5, r0)
            if (r21 != 0) goto L_0x002a
            if (r22 != 0) goto L_0x002a
            if (r4 != 0) goto L_0x002a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GCM: registration intent action was unknown; intent="
            X.C18260x0.A1S(r1, r0, r5)
            return
        L_0x002a:
            r3 = r24
            r3.A09()
            android.content.Context r0 = r3.getApplicationContext()
            X.7qO r0 = X.C161757qO.A01(r0)
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GCM: Init firebase success:"
            X.C18260x0.A1E(r0, r1, r2)
            long r16 = android.os.Binder.clearCallingIdentity()
            java.lang.String r0 = "registrationId"
            java.lang.String r13 = r5.getStringExtra(r0)     // Catch:{ all -> 0x04f1 }
            r12 = 232614005(0xddd6875, float:1.3645324E-30)
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            android.content.SharedPreferences r0 = X.C18270x1.A05(r0)     // Catch:{ all -> 0x04f1 }
            java.lang.String r11 = "c2dm_reg_id"
            r7 = 0
            java.lang.String r14 = r0.getString(r11, r7)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            android.content.SharedPreferences r0 = X.C18270x1.A05(r0)     // Catch:{ all -> 0x04f1 }
            java.lang.String r10 = "c2dm_app_vers"
            int r2 = X.C18280x3.A02(r0, r10)     // Catch:{ all -> 0x04f1 }
            if (r22 == 0) goto L_0x0075
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x04f1 }
            r20 = 1
            if (r0 != 0) goto L_0x0079
        L_0x0075:
            r20 = 0
            if (r22 == 0) goto L_0x0080
        L_0x0079:
            boolean r0 = android.text.TextUtils.equals(r13, r14)     // Catch:{ all -> 0x04f1 }
            r1 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            boolean r19 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x04f1 }
            boolean r0 = X.AnonymousClass001.A1X(r12, r2)
            if (r20 != 0) goto L_0x0095
            if (r19 != 0) goto L_0x0095
            if (r1 != 0) goto L_0x0095
            if (r0 != 0) goto L_0x0095
            r18 = 0
            if (r4 == 0) goto L_0x012a
        L_0x0095:
            r18 = 1
            if (r4 == 0) goto L_0x012a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer deleting savedToken:"
            X.C18260x0.A0s(r0, r14, r1)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r3.A09()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A06     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.5Gf r0 = (X.C101815Gf) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.C626936e.A06(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r15 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.7qO r0 = X.C161757qO.A00()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            com.google.firebase.iid.FirebaseInstanceId r9 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r8 = "FCM"
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r1 == r0) goto L_0x0110
            boolean r0 = r8.isEmpty()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "fcm"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "gcm"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x00e4
        L_0x00e2:
            java.lang.String r8 = "*"
        L_0x00e4:
            java.lang.String r6 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.7Tn r4 = r9.A06     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.os.Bundle r2 = X.AnonymousClass002.A08()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r1 = "delete"
            java.lang.String r0 = "1"
            r2.putString(r1, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            com.google.android.gms.tasks.Task r0 = r4.A00(r2, r6, r15, r8)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.C18290x4.A1J(r0, r9, r4)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.7nI r1 = com.google.firebase.iid.FirebaseInstanceId.A08     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r2 = X.C160237nI.A01(r15, r8)     // Catch:{ all -> 0x03e9 }
            android.content.SharedPreferences r0 = r1.A01     // Catch:{ all -> 0x03e9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x03e9 }
            r0.remove(r2)     // Catch:{ all -> 0x03e9 }
            r0.commit()     // Catch:{ all -> 0x03e9 }
            goto L_0x0118
        L_0x0110:
            java.lang.String r0 = "MAIN_THREAD"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x03eb
        L_0x0118:
            monitor-exit(r1)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A0C     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.33p r0 = X.C18320x8.A0J(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "saved_gcm_token_server_unreg"
            X.C18270x1.A0l(r1, r0, r2)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x012a:
            r3.A09()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A06     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.5Gf r0 = (X.C101815Gf) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.C626936e.A06(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r2 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.7qO r0 = X.C161757qO.A00()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "FCM"
            java.lang.String r6 = r1.A05(r2, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x0185
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "GCM: token retrieved successfully; token="
            r1.append(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r0 = r6.length()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r1.append(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = " bytes; applicationVersion="
            X.C18260x0.A0y(r0, r1, r12)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r19 == 0) goto L_0x017a
            java.lang.String r0 = "GCM: no previously saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A0C     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.33p r1 = X.C18320x8.A0J(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 0
            r1.A19(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x017a:
            boolean r0 = android.text.TextUtils.equals(r6, r14)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r1 = r0 ^ 1
            r2 = 0
            if (r18 != 0) goto L_0x0294
            goto L_0x028b
        L_0x0185:
            java.lang.String r0 = "GCM: empty token returned but no exception thrown"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x03eb
        L_0x018d:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x027f
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x04f1 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x04f1 }
            r4 = 3
            switch(r0) {
                case -1992442893: goto L_0x01a5;
                case -1800638118: goto L_0x01ae;
                case -1579216525: goto L_0x01b7;
                case -1515255836: goto L_0x01c1;
                case -829011630: goto L_0x01ca;
                case -630263762: goto L_0x01d3;
                case -595928767: goto L_0x01dc;
                case 370784008: goto L_0x01e5;
                case 855732677: goto L_0x0223;
                case 901541140: goto L_0x023e;
                case 1750400351: goto L_0x0268;
                default: goto L_0x01a0;
            }     // Catch:{ all -> 0x04f1 }
        L_0x01a0:
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r2)     // Catch:{ all -> 0x04f1 }
        L_0x01a4:
            throw r0     // Catch:{ all -> 0x04f1 }
        L_0x01a5:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x01ed
        L_0x01ae:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x022b
        L_0x01b7:
            java.lang.String r0 = "PHONE_REGISTRATION_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x0246
        L_0x01c1:
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x0246
        L_0x01ca:
            java.lang.String r0 = "INVALID_PARAMETERS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x0246
        L_0x01d3:
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x0246
        L_0x01dc:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            goto L_0x01ed
        L_0x01e5:
            java.lang.String r0 = "BACKOFF"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
        L_0x01ed:
            r1 = 15000(0x3a98, double:7.411E-320)
            r0 = r23
            long r6 = r5.getLongExtra(r0, r1)     // Catch:{ all -> 0x04f1 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x04f1 }
            r1 = 2
            long r1 = r1 * r7
            r0 = r23
            r5.putExtra(r0, r1)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0B     // Catch:{ all -> 0x04f1 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04f1 }
            X.33i r0 = (X.C620633i) r0     // Catch:{ all -> 0x04f1 }
            android.app.AlarmManager r6 = r0.A07()     // Catch:{ all -> 0x04f1 }
            r0 = 0
            android.app.PendingIntent r2 = X.C624735e.A05(r3, r5, r0)     // Catch:{ all -> 0x04f1 }
            if (r6 == 0) goto L_0x0285
            r6.cancel(r2)     // Catch:{ all -> 0x04f1 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04f1 }
            long r0 = r0 + r7
            r6.set(r4, r0, r2)     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x0223:
            java.lang.String r0 = "TOO_MANY_REGISTRATIONS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
        L_0x022b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04f1 }
            java.lang.String r0 = "GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage="
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            X.33p r0 = X.C18320x8.A0J(r0)     // Catch:{ all -> 0x04f1 }
            r0.A0g()     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x023e:
            java.lang.String r0 = "ACCOUNT_MISSING"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
        L_0x0246:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04f1 }
            java.lang.String r0 = "GCM: attempted to register for GCM but received undocumented error; exceptionMessage="
            r1.append(r0)     // Catch:{ all -> 0x04f1 }
            X.C18320x8.A1N(r1, r2)     // Catch:{ all -> 0x04f1 }
            java.lang.String r0 = "; playServicesAvailable="
            r1.append(r0)     // Catch:{ all -> 0x04f1 }
            int r0 = X.C159787mS.A00(r3)     // Catch:{ all -> 0x04f1 }
            X.C18270x1.A1F(r1, r0)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            X.33p r0 = X.C18320x8.A0J(r0)     // Catch:{ all -> 0x04f1 }
            r0.A0g()     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x0268:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "GCM: attempted to register for GCM but Google Play Services was missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            X.33p r0 = X.C18320x8.A0J(r0)     // Catch:{ all -> 0x04f1 }
            r0.A0g()     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x027f:
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r2)     // Catch:{ all -> 0x04f1 }
            goto L_0x01a4
        L_0x0285:
            java.lang.String r0 = "RegistrationIntentService/onHandleWork AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x028b:
            if (r1 != 0) goto L_0x0294
            r9 = 0
        L_0x028e:
            if (r22 != 0) goto L_0x02df
        L_0x0290:
            android.os.Binder.restoreCallingIdentity(r16)
            return
        L_0x0294:
            X.8qC r0 = r3.A0C     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A0A(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r11, r6)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.C18270x1.A0h(r0, r10, r12)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r21 != 0) goto L_0x02aa
            boolean r0 = android.text.TextUtils.equals(r6, r13)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r9 = 0
            if (r0 != 0) goto L_0x02ab
        L_0x02aa:
            r9 = 1
        L_0x02ab:
            java.lang.String r0 = "GCM: sending client config due to new token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r18 == 0) goto L_0x02dc
            if (r20 == 0) goto L_0x02dc
            if (r1 != 0) goto L_0x02dc
            X.8qC r0 = r3.A0C     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.content.SharedPreferences r0 = X.C18270x1.A05(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r4 = "saved_gcm_token_server_unreg"
            r8 = 0
            boolean r0 = r0.getBoolean(r4, r8)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer fetched saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2qk r1 = r3.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "gcm-retrieved-saved-token"
            r1.A0A(r0, r8, r7)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A0C     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.33p r1 = X.C18320x8.A0J(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 1
            X.C18270x1.A0v(r1, r4, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x02dc:
            if (r9 != 0) goto L_0x02df
            goto L_0x028e
        L_0x02df:
            X.8qC r0 = r3.A07     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2Ym r0 = (X.C45052Ym) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.1VX r1 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 283(0x11b, float:3.97E-43)
            X.2vE r13 = X.C58422vE.A02     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x02fe
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x02fe
            r4 = r7
            goto L_0x03ed
        L_0x02fe:
            X.8qC r0 = r3.A07     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2Ym r0 = (X.C45052Ym) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2f5 r4 = r0.A00()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.util.List r10 = r4.A01     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r11 = r4.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r9 != 0) goto L_0x03ed
            java.lang.String r0 = "mutedChatsHash"
            java.lang.String r15 = r5.getStringExtra(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "appMuteConfig"
            java.lang.String r8 = r5.getStringExtra(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A07     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2Ym r0 = (X.C45052Ym) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r14 = 0
            if (r15 == 0) goto L_0x032f
            int r12 = r15.length()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r1 = 0
            if (r12 != 0) goto L_0x0330
        L_0x032f:
            r1 = 1
        L_0x0330:
            r18 = r1 ^ 1
            if (r10 == 0) goto L_0x033b
            boolean r1 = X.C18310x6.A1X(r10)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r12 = 1
            if (r1 != 0) goto L_0x033c
        L_0x033b:
            r12 = 0
        L_0x033c:
            if (r18 != 0) goto L_0x0342
            if (r12 == 0) goto L_0x0342
            goto L_0x03d7
        L_0x0342:
            X.1VX r1 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r1.A0Y(r13, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x0351
            if (r11 != 0) goto L_0x03cd
            r0 = 0
            goto L_0x03d1
        L_0x0351:
            if (r8 == 0) goto L_0x0359
            int r0 = r8.length()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x03d7
        L_0x0359:
            if (r18 == 0) goto L_0x03ed
            if (r12 == 0) goto L_0x03d7
            if (r10 == 0) goto L_0x03e4
            java.security.MessageDigest r12 = X.AnonymousClass0x7.A0t()     // Catch:{ NoSuchAlgorithmException -> 0x03dd }
            X.C162457s7.A0H(r12)     // Catch:{ NoSuchAlgorithmException -> 0x03dd }
            java.nio.charset.Charset r11 = X.C58152un.A0D     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.util.Iterator r20 = r10.iterator()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x036c:
            boolean r0 = r20.hasNext()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r10 = r20.next()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2lM r10 = (X.C52362lM) r10     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.4uZ r0 = r10.A01     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.C162457s7.A0H(r11)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            byte[] r0 = X.C18320x8.A1a(r0, r11)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r12.update(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Long r0 = r10.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x03a4
            java.lang.Long r0 = r10.A02     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r18 = -1
            int r8 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x039e
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            long r18 = r8.toSeconds(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x039e:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r10.A00 = r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x03a4:
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            byte[] r0 = X.C18320x8.A1a(r0, r11)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r12.update(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x036c
        L_0x03b4:
            byte[] r8 = r12.digest()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r1 = 6
            byte[] r0 = new byte[r1]     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.System.arraycopy(r8, r14, r0, r14, r1)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x03dd
            boolean r0 = r0.equalsIgnoreCase(r15)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03ed
            goto L_0x03d7
        L_0x03cd:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x03d1:
            boolean r0 = X.AnonymousClass75J.A00(r0, r8)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x0359
        L_0x03d7:
            java.lang.String r0 = "GCM: sending client config due to new muted chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x03ec
        L_0x03dd:
            java.lang.String r0 = "No SHA-256 alg. available"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x03eb
        L_0x03e4:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x03eb
        L_0x03e9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x03eb:
            throw r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x03ec:
            r9 = 1
        L_0x03ed:
            java.lang.String r1 = "numberOfAccountsFromServer"
            r0 = 1
            int r1 = r5.getIntExtra(r1, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r3.A04     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.5HD r0 = (X.AnonymousClass5HD) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.8qC r0 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.30z r0 = (X.C614930z) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.33p r0 = r0.A0A     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r0 = r0.A0C()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r8 = r0 + 1
            if (r1 == r8) goto L_0x0410
            r9 = 1
        L_0x0410:
            java.lang.String r0 = "voipPayloadType"
            int r10 = X.C18320x8.A01(r5, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.1VX r1 = r3.A02     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 4116(0x1014, float:5.768E-42)
            int r0 = r1.A0O(r13, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == r10) goto L_0x0427
            java.lang.String r0 = "GCM: sending client config due to calling push payload version"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r9 = 1
        L_0x0427:
            X.8qC r0 = r3.A08     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2nG r0 = (X.C53542nG) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            boolean r0 = r0.A01()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x045d
            X.8qC r0 = r3.A08     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2nG r1 = (X.C53542nG) r1     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "pKeyHash"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.util.Pair r1 = r1.A00(r0, r9)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r9 != 0) goto L_0x0458
            java.lang.Object r0 = r1.first     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 == 0) goto L_0x0458
            java.lang.String r0 = "GCM: sending client config due to pKey rotation"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r9 = 1
        L_0x0458:
            java.lang.Object r2 = r1.second     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x0478
        L_0x045d:
            X.8qC r0 = r3.A08     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2nG r0 = (X.C53542nG) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.33p r0 = r0.A02     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r0 = "push:push_pkey_generate_ts"
            X.C18270x1.A0g(r1, r0)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
        L_0x0478:
            if (r9 == 0) goto L_0x0290
            X.8qC r0 = r3.A0A     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2jE r0 = (X.C51072jE) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            boolean r0 = r0.A02()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            if (r0 != 0) goto L_0x04a8
            X.8qC r0 = r3.A0A     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2jE r0 = (X.C51072jE) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r1 = r0.A00()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 2
            if (r1 == r0) goto L_0x04a8
            X.8qC r0 = r3.A05     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.5G3 r0 = (X.AnonymousClass5G3) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2jr r0 = r0.A00     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            int r1 = r0.A00()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r0 = 7
            if (r1 < r0) goto L_0x0290
        L_0x04a8:
            X.8qC r0 = r3.A09     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            X.2a4 r0 = (X.C45472a4) r0     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            java.lang.String r13 = "gcm"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            r8 = r0
            r9 = r4
            r10 = r7
            r12 = r6
            r14 = r2
            r8.A00(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x018d, SecurityException -> 0x04c0 }
            goto L_0x0290
        L_0x04c0:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x04f0
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x04f1 }
            java.lang.String r0 = "com.google.android.c2dm.permission.RECEIVE"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 != 0) goto L_0x04e0
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x04f1 }
            java.lang.String r0 = "process is bad"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x04f0
        L_0x04e0:
            java.lang.String r0 = "GCM: security exception caught; switching to long-connect"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04f1 }
            X.8qC r0 = r3.A0C     // Catch:{ all -> 0x04f1 }
            X.33p r0 = X.C18320x8.A0J(r0)     // Catch:{ all -> 0x04f1 }
            r0.A0g()     // Catch:{ all -> 0x04f1 }
            goto L_0x0290
        L_0x04f0:
            throw r2     // Catch:{ all -> 0x04f1 }
        L_0x04f1:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.push.RegistrationIntentService.A08(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0F == null) {
            synchronized (this.A0E) {
                if (this.A0F == null) {
                    this.A0F = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0F.generatedComponent();
    }

    public void onCreate() {
        if (!this.A0D) {
            this.A0D = true;
            C22031Ec r1 = (C22031Ec) ((C64323Da) generatedComponent());
            C64333Db r3 = r1.A06;
            this.A01 = C64333Db.A2p(r3);
            this.A02 = C64333Db.A4B(r3);
            this.A00 = C64333Db.A01(r3);
            C107695bk r2 = r3.A00;
            this.A06 = C72343dZ.A00(r2.A5P);
            this.A0B = C72343dZ.A00(r3.AYG);
            this.A09 = C72343dZ.A00(r3.ASi);
            this.A0C = C72343dZ.A00(r3.Aaj);
            this.A08 = C72343dZ.A00(r2.A9u);
            this.A05 = C72343dZ.A00(r2.A2V);
            this.A0A = C72343dZ.A00(r3.ATh);
            this.A04 = C72343dZ.A00(r2.A0G);
            this.A07 = C72343dZ.A00(r1.A03);
        }
        super.onCreate();
    }

    public RegistrationIntentService(int i) {
        this.A0E = AnonymousClass002.A0D();
        this.A0D = false;
    }

    public static void A03(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        C18260x0.A0s("GCM: verifying registration; serverRegistrationId=", str, AnonymousClass001.A0o());
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        Intent intent = new Intent("com.whatsapp.action.VERIFY", (Uri) null, context, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("mutedChatsHash", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("appMuteConfig", str3);
        }
        intent.putExtra("numberOfAccountsFromServer", C615531h.A01(str4, 1));
        if (!TextUtils.isEmpty(str5)) {
            intent.putExtra("pKeyHash", str5);
        }
        intent.putExtra("voipPayloadType", C615531h.A01(str6, 0));
        AnonymousClass00W.A00(context, intent, cls, 4);
    }

    public RegistrationIntentService() {
        this(0);
    }
}
