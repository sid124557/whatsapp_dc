package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.4KQ  reason: invalid class name */
public class AnonymousClass4KQ implements AnonymousClass4EZ {
    public Object A00;
    public final int A01;

    public AnonymousClass4KQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BQs(String str) {
        String str2;
        switch (this.A01) {
            case 1:
                C18270x1.A0l(C18270x1.A03(((C66493Lq) this.A00).A0O), "pnh_group_lid_incomplete", true);
                return;
            case 2:
                Log.i("groupchatinfo/getgroupdescription/delivery fail");
                return;
            case 3:
                ((C84814Du) this.A00).BkD(C96054vj.A00);
                return;
            case 4:
                ((C72183dJ) this.A00).BQr(AnonymousClass002.A0C("disconnected while waiting for response"));
                return;
            case 6:
                str2 = AnonymousClass000.A0V("BroadcastXmppMethods/sendGetBroadcastLists/onDeliveryFailure: iq=", str, AnonymousClass001.A0o());
                break;
            case 7:
                Log.i("marketing_disclosure/SetMMDisclosureAcceptanceRequest delivery fail");
                C44972Ye r5 = (C44972Ye) this.A00;
                C61242zw r4 = r5.A01;
                r4.A08.A00(r4.A00.A0H(), false);
                C61242zw.A00(r4, new C81083zJ(r5.A00, r4));
                return;
            case 9:
                Log.i("PushXmppMethod/clear config delivery failure");
                ((AnonymousClass4DX) this.A00).BSk();
                return;
            case 10:
                str2 = "SpamXmppMethods/failed to deliver spam report";
                break;
            case 11:
                ((AnonymousClass4EH) this.A00).BQp();
                return;
            case 13:
                Log.i("clientActionLog/SetClientConfig delivery fail");
                ((C41092Ix) ((C69903Yy) this.A00).element).A00 = -2;
                return;
            default:
                return;
        }
        Log.e(str2);
    }

    public void BSN(AnonymousClass36K r7, String str) {
        String str2;
        StringBuilder sb;
        SharedPreferences sharedPreferences;
        int A02;
        switch (this.A01) {
            case 1:
                C18270x1.A0l(C18270x1.A03(((C66493Lq) this.A00).A0O), "pnh_group_lid_incomplete", true);
                return;
            case 2:
                Log.i("groupchatinfo/getgroupdescription/error");
                return;
            case 3:
                C162457s7.A0J(r7, 1);
                ((C84814Du) this.A00).BkD(new C96034vh(r7));
                return;
            case 4:
                C162457s7.A0J(r7, 1);
                ((C72183dJ) this.A00).BQt(r7);
                return;
            case 6:
                sb = AnonymousClass001.A0o();
                sb.append("BroadcastXmppMethods/sendGetBroadcastLists/onError: iq=");
                sb.append(str);
                break;
            case 7:
                C18260x0.A0x("marketing_disclosure/SetMMDisclosureAcceptanceRequest/", AnonymousClass001.A0o(), C57492tj.A00(r7));
                C44972Ye r5 = (C44972Ye) this.A00;
                C61242zw r4 = r5.A01;
                r4.A08.A00(r4.A00.A0H(), false);
                C61242zw.A00(r4, new C81083zJ(r5.A00, r4));
                return;
            case 8:
                int A012 = C57492tj.A01(r7);
                C56142rU r52 = ((C46542bo) this.A00).A01;
                r52.A04(A012);
                if (A012 != 207 && A012 != 304 && (A012 < 400 || A012 > 503)) {
                    sb = AnonymousClass001.A0o();
                    sb.append("ABPropsManager/onABPropError; unknown error code: ");
                    sb.append(A012);
                    break;
                } else {
                    synchronized (r52) {
                        sharedPreferences = r52.A00;
                        A02 = C18280x3.A02(sharedPreferences, "ab_props:sys:fetch_attemp_count");
                    }
                    int i = A02 + 1;
                    r52.A03(i);
                    if (i >= 3) {
                        long A0H = r52.A01.A0H();
                        synchronized (r52) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong("ab_props:sys:last_refresh_time", A0H);
                            edit.apply();
                        }
                        r52.A03(0);
                        return;
                    }
                    return;
                }
            case 9:
                C18260x0.A0x("PushXmppMethod/clear config error/", AnonymousClass001.A0o(), C57492tj.A00(r7));
                ((AnonymousClass4DX) this.A00).BSk();
                return;
            case 10:
                str2 = "SpamXmppMethods/bad spam report";
                break;
            case 11:
                C18260x0.A0O(str, r7);
                ((AnonymousClass4EH) this.A00).BS9(new AnonymousClass24F(r7, str));
                return;
            case 12:
                JniBridge.jvidispatchIOO(2, str, r7);
                return;
            case 13:
                int A002 = C57492tj.A00(r7);
                C18260x0.A0x("clientActionLog/clientConfigSetError/", AnonymousClass001.A0o(), A002);
                ((C41092Ix) ((C69903Yy) this.A00).element).A00 = -1;
                C162457s7.A0J(C18260x0.A05("clientActionLog/clientConfigSetError/", A002), 0);
                return;
            default:
                return;
        }
        str2 = sb.toString();
        Log.e(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04c6, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012a, code lost:
        r0 = r1.putBoolean(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r22, java.lang.String r23) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A01
            r2 = r22
            r4 = r23
            switch(r0) {
                case 0: goto L_0x04ea;
                case 1: goto L_0x0011;
                case 2: goto L_0x0130;
                case 3: goto L_0x050d;
                case 4: goto L_0x051e;
                case 5: goto L_0x0010;
                case 6: goto L_0x0021;
                case 7: goto L_0x052a;
                case 8: goto L_0x01c4;
                case 9: goto L_0x053b;
                case 10: goto L_0x04e6;
                case 11: goto L_0x0548;
                case 12: goto L_0x0551;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "clientActionLog/read/client_config_set"
        L_0x000d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r3.A00
            X.3Lq r0 = (X.C66493Lq) r0
            X.33p r0 = r0.A0O
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pnh_group_lid_incomplete"
            goto L_0x012a
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BroadcastXmppMethods/sendGetBroadcastLists/onSuccess: iq="
            X.C18260x0.A0s(r0, r4, r1)
            java.lang.String r0 = "lists"
            X.36K r1 = r2.A0l(r0)
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = "list"
            java.util.Iterator r9 = X.AnonymousClass36K.A0M(r1, r0)
        L_0x0038:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010f
            X.36K r2 = X.C18310x6.A0Y(r9)
            java.lang.Class<X.1fI> r1 = X.AnonymousClass1fI.class
            java.lang.String r0 = "id"
            com.whatsapp.jid.Jid r11 = r2.A0g(r1, r0)
            X.1fI r11 = (X.AnonymousClass1fI) r11
            java.lang.String r0 = "name"
            java.lang.String r12 = X.AnonymousClass36K.A0L(r2, r0)
            java.lang.String r0 = "recipient"
            java.util.List r1 = r2.A0s(r0)
            int r0 = r1.size()
            com.whatsapp.jid.UserJid[] r5 = new com.whatsapp.jid.UserJid[r0]
            java.util.Iterator r4 = r1.iterator()
            r2 = 0
        L_0x0065:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0079
            X.36K r0 = X.C18310x6.A0Y(r4)
            int r1 = r2 + 1
            com.whatsapp.jid.Jid r0 = X.AnonymousClass36K.A06(r0)
            r5[r2] = r0
            r2 = r1
            goto L_0x0065
        L_0x0079:
            java.lang.Object r0 = r3.A00
            X.2Zq r0 = (X.C45342Zq) r0
            X.8qC r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.33A r2 = (X.AnonymousClass33A) r2
            java.util.List r6 = java.util.Arrays.asList(r5)
            r1 = 0
            X.C162457s7.A0J(r11, r1)
            r4 = 1
            X.C18270x1.A10(r12, r4, r6)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "BroadcastListManager/onParticipatingList/jid:"
            r8.append(r5)
            r8.append(r11)
            java.lang.String r0 = "/name:"
            r8.append(r0)
            r8.append(r12)
            java.lang.String r0 = "/recipients:"
            r8.append(r0)
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r1]
            java.lang.Object[] r7 = r6.toArray(r0)
            if (r7 != 0) goto L_0x00f1
            java.lang.String r0 = "null"
        L_0x00b5:
            X.C18260x0.A1L(r8, r0)
            X.2ss r0 = r2.A05
            boolean r0 = r0.A0L(r11)
            if (r0 != 0) goto L_0x00e7
            X.2ba r0 = r2.A07
            java.util.Map r0 = r0.A04
            boolean r0 = r0.containsKey(r11)
            if (r0 != 0) goto L_0x00e7
            X.1mI r1 = r2.A02(r11, r6)
            X.4Ft r0 = r2.A0D
            r0.BEz(r1, r4)
        L_0x00d3:
            X.3Ex r10 = r2.A02
            X.3ZH r0 = r10.A07(r11)
            if (r0 != 0) goto L_0x0038
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "pn"
            r10.A05(r11, r12, r13, r14)
            goto L_0x0038
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r11, r5)
            java.lang.String r0 = " already exists"
            X.C18260x0.A1L(r1, r0)
            goto L_0x00d3
        L_0x00f1:
            int r1 = r7.length
            r0 = 429496729(0x19999999, float:1.5881867E-23)
            if (r1 <= r0) goto L_0x00fa
            r1 = 429496729(0x19999999, float:1.5881867E-23)
        L_0x00fa:
            int r0 = r1 * 5
            int r0 = r0 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            X.AnonymousClass8UD.A07(r1, r0, r7)
            java.lang.String r0 = X.C18290x4.A0o(r1)
            goto L_0x00b5
        L_0x010f:
            java.lang.Object r0 = r3.A00
            X.2Zq r0 = (X.C45342Zq) r0
            X.8qC r0 = r0.A02
            java.lang.Object r1 = r0.get()
            X.33A r1 = (X.AnonymousClass33A) r1
            java.lang.String r0 = "BroadcastListManager/onParticipatingList/onParticipatingListsComplete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r0 = r1.A04
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "refresh_broadcast_lists"
        L_0x012a:
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            goto L_0x04c6
        L_0x0130:
            java.lang.String r0 = "groupchatinfo/getgroupdescription/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.36K r1 = r2.A0j()
            com.whatsapp.jid.Jid r6 = X.AnonymousClass36K.A07(r2)
            X.1fJ r6 = (X.C27991fJ) r6
            if (r6 == 0) goto L_0x0010
            java.lang.Object r0 = r3.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.3Lq r2 = X.C66503Lr.A00(r0)
            r4 = 0
            X.C162457s7.A0J(r1, r4)
            X.2zN r5 = X.AnonymousClass36J.A04(r1)
            X.2ss r0 = r2.A0S
            int r1 = r0.A06(r6)
            r8 = 1
            X.3Ex r3 = r2.A0F
            X.3ZH r0 = r3.A09(r6)
            if (r1 != r8) goto L_0x019f
            if (r0 == 0) goto L_0x0559
            X.2zN r0 = r0.A0K
            if (r0 == 0) goto L_0x0559
            java.lang.String r1 = r0.A03
            X.1fJ r7 = r2.A06(r6)
            if (r7 == 0) goto L_0x0010
            java.lang.String r0 = r5.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "groupmgr/onParentGroupDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r0 = r3.A0A(r6)
            r0.A0O(r5)
            X.C34461vC.A03(r3, r0)
            X.3Oz r4 = r2.A0k
            X.2sd r3 = r2.A17
            r2 = 0
            X.1mI r1 = r3.A04(r6, r5, r2, r8)
            r0 = 3015(0xbc7, float:4.225E-42)
            r4.BEz(r1, r0)
            X.1mI r2 = r3.A04(r7, r5, r2, r8)
        L_0x0197:
            r1 = 3006(0xbbe, float:4.212E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            return
        L_0x019f:
            if (r0 == 0) goto L_0x0556
            X.2zN r0 = r0.A0K
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r5.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "groupmgr/onGroupDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3ZH r0 = r3.A0A(r6)
            r0.A0O(r5)
            X.C34461vC.A03(r3, r0)
            X.2sd r1 = r2.A17
            r0 = 0
            X.1mI r2 = r1.A04(r6, r5, r0, r4)
            goto L_0x0197
        L_0x01c4:
            java.lang.String r0 = "props"
            X.36K r6 = r2.A0l(r0)
            java.lang.String r0 = "erid"
            X.36K r19 = r2.A0l(r0)
            if (r6 == 0) goto L_0x048b
            java.lang.Object r9 = r3.A00
            X.2bo r9 = (X.C46542bo) r9
            java.lang.String r0 = "protocol"
            r11 = 0
            java.lang.String r1 = r6.A0r(r0, r11)
            r0 = 1
            X.C615531h.A01(r1, r0)
            java.lang.String r0 = "ab_key"
            java.lang.String r12 = r6.A0r(r0, r11)
            java.lang.String r0 = "hash"
            java.lang.String r18 = r6.A0r(r0, r11)
            java.lang.String r0 = "refresh"
            java.lang.String r2 = r6.A0r(r0, r11)
            r0 = 86400(0x15180, double:4.26873E-319)
            long r4 = X.C615531h.A04(r2, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            java.lang.String r0 = "refresh_id"
            int r17 = X.AnonymousClass36K.A01(r6, r0)
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            java.lang.String r0 = "prop"
            java.util.List r0 = r6.A0s(r0)
            android.util.SparseIntArray r8 = new android.util.SparseIntArray
            r8.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x021c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x025b
            X.36K r6 = X.C18310x6.A0Y(r7)
            java.lang.String r1 = "config_code"
            java.lang.String r0 = r6.A0r(r1, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024a
            int r2 = X.AnonymousClass36K.A02(r6, r1)
            java.lang.String r0 = "config_value"
            java.lang.String r1 = r6.A0q(r0)
            java.lang.String r0 = "config_expo_key"
            java.lang.String r0 = r6.A0r(r0, r11)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            r10.append(r2, r0)
            goto L_0x021c
        L_0x024a:
            java.lang.String r0 = "event_code"
            int r1 = X.AnonymousClass36K.A02(r6, r0)
            java.lang.String r0 = "sampling_weight"
            int r0 = X.AnonymousClass36K.A02(r6, r0)
            r8.append(r1, r0)
            goto L_0x021c
        L_0x025b:
            X.2rU r7 = r9.A01
            X.2sH r0 = r9.A00
            r20 = r0
            monitor-enter(r7)
            android.content.SharedPreferences r6 = r7.A00     // Catch:{ all -> 0x0569 }
            android.content.SharedPreferences$Editor r2 = r6.edit()     // Catch:{ all -> 0x0569 }
            boolean r0 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x0569 }
            if (r0 != 0) goto L_0x0320
            X.2GP r0 = r7.A05     // Catch:{ all -> 0x0569 }
            X.2eH r1 = r0.A00     // Catch:{ all -> 0x0569 }
            java.lang.Class<X.3LK> r0 = X.AnonymousClass3LK.class
            X.485 r0 = r1.A02(r0)     // Catch:{ all -> 0x0569 }
            X.3LK r0 = (X.AnonymousClass3LK) r0     // Catch:{ all -> 0x0569 }
            X.8qC r0 = r0.A00     // Catch:{ all -> 0x0569 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0569 }
            X.3Mh r1 = (X.C66663Mh) r1     // Catch:{ all -> 0x0569 }
            X.1Ei r0 = X.C66663Mh.A0C     // Catch:{ all -> 0x0569 }
            boolean r0 = r1.A08(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x0320
            X.2y5 r1 = r7.A08     // Catch:{ all -> 0x0569 }
            java.lang.String r0 = "ab-props-backup"
            android.content.SharedPreferences r13 = r1.A03(r0)     // Catch:{ all -> 0x0569 }
            X.C18270x1.A0m(r13)     // Catch:{ all -> 0x0569 }
            java.util.Map r1 = r6.getAll()     // Catch:{ all -> 0x0569 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0569 }
            if (r0 != 0) goto L_0x0320
            android.content.SharedPreferences$Editor r14 = r13.edit()     // Catch:{ all -> 0x0569 }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x0569 }
        L_0x02a7:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x031d
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r16)     // Catch:{ all -> 0x0569 }
            java.lang.String r13 = X.C18310x6.A0q(r0)     // Catch:{ all -> 0x0569 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0569 }
            if (r1 == 0) goto L_0x02a7
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x0569 }
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x02cf
            boolean r0 = X.AnonymousClass001.A1Z(r1)     // Catch:{ all -> 0x0569 }
            r14.putBoolean(r13, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x02cf:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x02e1
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ all -> 0x0569 }
            float r0 = r1.floatValue()     // Catch:{ all -> 0x0569 }
            r14.putFloat(r13, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x02e1:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x02f1
            int r0 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0569 }
            r14.putInt(r13, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x02f1:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x0301
            long r0 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x0569 }
            r14.putLong(r13, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x0301:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x030f
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0569 }
            r14.putString(r13, r1)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x030f:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r15)     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x02a7
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x0569 }
            r14.putStringSet(r13, r1)     // Catch:{ all -> 0x0569 }
            goto L_0x02a7
        L_0x031d:
            r14.commit()     // Catch:{ all -> 0x0569 }
        L_0x0320:
            r0 = 600000(0x927c0, double:2.964394E-318)
            long r0 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x0569 }
            java.lang.String r14 = "ab_props:sys:refresh"
            r2.putLong(r14, r0)     // Catch:{ all -> 0x0569 }
            boolean r5 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x0569 }
            r4 = 0
            if (r5 != 0) goto L_0x03ed
            java.util.HashMap r15 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0569 }
            java.lang.String r5 = "ab_props:sys:last_exposure_keys"
            java.util.Set r13 = r6.getStringSet(r5, r11)     // Catch:{ all -> 0x0569 }
            r6.getAll()     // Catch:{ all -> 0x0569 }
            r2.clear()     // Catch:{ all -> 0x0569 }
            r2.putLong(r14, r0)     // Catch:{ all -> 0x0569 }
            r2.putStringSet(r5, r13)     // Catch:{ all -> 0x0569 }
            X.8qC r0 = r7.A09     // Catch:{ all -> 0x0569 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0569 }
            X.2nR r1 = (X.C53652nR) r1     // Catch:{ all -> 0x0569 }
            monitor-enter(r1)     // Catch:{ all -> 0x0569 }
            r1.A01 = r4     // Catch:{ all -> 0x0566 }
            monitor-exit(r1)     // Catch:{ all -> 0x0569 }
            X.1ho r14 = r7.A04     // Catch:{ all -> 0x0569 }
            java.util.Iterator r13 = X.C61102zi.A03(r14)     // Catch:{ all -> 0x0569 }
        L_0x035b:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x0370
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0569 }
            X.2di r1 = (X.C47722di) r1     // Catch:{ all -> 0x0569 }
            r1.A04()     // Catch:{ Exception -> 0x036b }
            goto L_0x035b
        L_0x036b:
            r0 = move-exception
            r14.A08(r1, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x035b
        L_0x0370:
            r14 = 0
        L_0x0371:
            int r0 = r10.size()     // Catch:{ all -> 0x0564 }
            if (r14 >= r0) goto L_0x03a5
            int r1 = r10.keyAt(r14)     // Catch:{ all -> 0x0564 }
            java.lang.Object r13 = r10.valueAt(r14)     // Catch:{ all -> 0x0564 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0564 }
            java.lang.Object r0 = r13.first     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0564 }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x0564 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0564 }
            boolean r0 = r7.A06(r2, r0, r1)     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x03a2
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0564 }
            if (r0 != 0) goto L_0x03a2
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r1)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "_expo_key"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0564 }
            r2.putString(r0, r13)     // Catch:{ all -> 0x0564 }
        L_0x03a2:
            int r14 = r14 + 1
            goto L_0x0371
        L_0x03a5:
            java.util.Set r0 = r6.getStringSet(r5, r11)     // Catch:{ all -> 0x055f }
            if (r0 != 0) goto L_0x03b6
            X.0nO r11 = new X.0nO     // Catch:{ all -> 0x055f }
            r11.<init>(r4)     // Catch:{ all -> 0x055f }
        L_0x03b0:
            X.0nO r6 = new X.0nO     // Catch:{ all -> 0x055f }
            r6.<init>(r4)     // Catch:{ all -> 0x055f }
            goto L_0x03bf
        L_0x03b6:
            X.0nO r11 = new X.0nO     // Catch:{ all -> 0x055f }
            r11.<init>(r4)     // Catch:{ all -> 0x055f }
            r11.addAll(r0)     // Catch:{ all -> 0x055f }
            goto L_0x03b0
        L_0x03bf:
            r5 = 0
        L_0x03c0:
            int r0 = r10.size()     // Catch:{ all -> 0x055f }
            if (r5 >= r0) goto L_0x03e0
            java.lang.Object r0 = r10.valueAt(r5)     // Catch:{ all -> 0x055f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x055f }
            if (r0 != 0) goto L_0x03d0
            r1 = 0
            goto L_0x03d4
        L_0x03d0:
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x055f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x055f }
        L_0x03d4:
            boolean r0 = r11.contains(r1)     // Catch:{ all -> 0x055f }
            if (r0 == 0) goto L_0x03dd
            r6.add(r1)     // Catch:{ all -> 0x055f }
        L_0x03dd:
            int r5 = r5 + 1
            goto L_0x03c0
        L_0x03e0:
            X.2sp r0 = r7.A06     // Catch:{ all -> 0x055f }
            r0.A0V(r2, r6)     // Catch:{ all -> 0x055f }
            r0.A0U()     // Catch:{ all -> 0x0564 }
            r15.isEmpty()     // Catch:{ all -> 0x0569 }
            r6 = 1
            goto L_0x03ee
        L_0x03ed:
            r6 = 0
        L_0x03ee:
            java.lang.String r0 = "ab_props:sys:config_key"
            r2.putString(r0, r12)     // Catch:{ all -> 0x0564 }
            X.4AF r1 = r7.A07     // Catch:{ all -> 0x0564 }
            X.C162457s7.A0J(r1, r4)     // Catch:{ all -> 0x0564 }
            r0 = 4473(0x1179, float:6.268E-42)
            X.C18300x5.A1G(r1, r12, r0)     // Catch:{ all -> 0x0564 }
            boolean r0 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x0564 }
            if (r0 != 0) goto L_0x040a
            java.lang.String r1 = "ab_props:sys:config_hash"
            r0 = r18
            r2.putString(r1, r0)     // Catch:{ all -> 0x0564 }
        L_0x040a:
            java.lang.String r5 = "ab_props:sys:last_refresh_time"
            long r0 = r20.A0H()     // Catch:{ all -> 0x0569 }
            r2.putLong(r5, r0)     // Catch:{ all -> 0x0569 }
            java.lang.String r1 = "ab_props:sys:last_version"
            r0 = r17
            r2.putInt(r1, r0)     // Catch:{ all -> 0x0569 }
            r2.apply()     // Catch:{ all -> 0x0569 }
            if (r6 == 0) goto L_0x043a
            X.1ho r5 = r7.A04     // Catch:{ all -> 0x0569 }
            java.util.Iterator r2 = X.C61102zi.A03(r5)     // Catch:{ all -> 0x0569 }
        L_0x0425:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0569 }
            if (r0 == 0) goto L_0x043a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0569 }
            X.2di r1 = (X.C47722di) r1     // Catch:{ all -> 0x0569 }
            r1.A03()     // Catch:{ Exception -> 0x0435 }
            goto L_0x0425
        L_0x0435:
            r0 = move-exception
            r5.A08(r1, r0)     // Catch:{ all -> 0x0569 }
            goto L_0x0425
        L_0x043a:
            r7.A04(r4)     // Catch:{ all -> 0x0569 }
            r7.A03(r4)     // Catch:{ all -> 0x0569 }
            X.2oU r0 = r7.A02     // Catch:{ all -> 0x0569 }
            java.io.File r1 = X.C54292oU.A03(r0)     // Catch:{ all -> 0x0569 }
            java.lang.String r0 = "crash_counter"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0569 }
            X.C18270x1.A0x(r0)     // Catch:{ all -> 0x0569 }
            monitor-exit(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x048b
            X.2YD r2 = r9.A03
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r2.A00     // Catch:{ all -> 0x0561 }
            if (r0 != 0) goto L_0x0467
            X.2y5 r1 = r2.A01     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "field-stats-events-sampling"
            android.content.SharedPreferences r0 = r1.A03(r0)     // Catch:{ all -> 0x0561 }
            r2.A00 = r0     // Catch:{ all -> 0x0561 }
        L_0x0467:
            monitor-exit(r2)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r4.clear()
            r2 = 0
        L_0x0470:
            int r0 = r8.size()
            if (r2 >= r0) goto L_0x0488
            int r0 = r8.keyAt(r2)
            int r1 = r8.valueAt(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.putInt(r0, r1)
            int r2 = r2 + 1
            goto L_0x0470
        L_0x0488:
            r4.apply()
        L_0x048b:
            if (r19 == 0) goto L_0x0010
            java.lang.Object r1 = r3.A00
            X.2bo r1 = (X.C46542bo) r1
            r0 = r19
            byte[] r0 = r0.A01
            java.lang.String r6 = X.C18290x4.A0t(r0)
            X.2Ku r1 = r1.A02
            X.8qC r5 = r1.A01
            android.content.SharedPreferences r0 = X.C18270x1.A05(r5)
            java.lang.String r4 = "encrypted_rid"
            java.lang.String r3 = X.AnonymousClass0x9.A0v(r0, r4)
            X.2sp r2 = r1.A00
            r0 = 3664(0xe50, float:5.134E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x04ca
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "EncryptedRidManager/clearEncryptedRid"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A0A(r5)
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)
        L_0x04c6:
            r0.apply()
            return
        L_0x04ca:
            r0 = 6084(0x17c4, float:8.525E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "EncryptedRidManager/setEncryptedRid"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A0A(r5)
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r6)
            goto L_0x04c6
        L_0x04e6:
            java.lang.String r0 = "SpamXmppMethods/success"
            goto L_0x000d
        L_0x04ea:
            X.36K r1 = r2.A0j()
            java.lang.String r0 = "disappearing_mode"
            X.AnonymousClass36K.A0N(r1, r0)
            java.lang.String r0 = "duration"
            int r6 = X.AnonymousClass36K.A02(r1, r0)
            java.lang.String r0 = "t"
            long r4 = X.AnonymousClass36K.A04(r1, r0)
            java.lang.Object r0 = r3.A00
            X.2cW r0 = (X.C46982cW) r0
            X.2rR r2 = r0.A04
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            r2.A06(r6, r4)
            return
        L_0x050d:
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r1 = r3.A00
            X.4Du r1 = (X.C84814Du) r1
            X.4vi r0 = new X.4vi
            r0.<init>(r2)
            r1.BkD(r0)
            return
        L_0x051e:
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r3.A00
            X.3dJ r0 = (X.C72183dJ) r0
            r0.BQt(r2)
            return
        L_0x052a:
            java.lang.Object r0 = r3.A00
            X.2Ye r0 = (X.C44972Ye) r0
            X.2zw r2 = r0.A01
            X.4uZ r1 = r0.A00
            X.3zK r0 = new X.3zK
            r0.<init>(r1, r2)
            X.C61242zw.A00(r2, r0)
            return
        L_0x053b:
            java.lang.String r0 = "PushXmppMethod/clear config success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r3.A00
            X.4DX r0 = (X.AnonymousClass4DX) r0
            r0.onSuccess()
            return
        L_0x0548:
            java.lang.Object r1 = r3.A00
            X.4EH r1 = (X.AnonymousClass4EH) r1
            r0 = 0
            r1.BdS(r0, r0)
            return
        L_0x0551:
            r0 = 2
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r4, r2)
            return
        L_0x0556:
            java.lang.String r0 = "groupmgr/onGroupDescription/new group"
            goto L_0x055b
        L_0x0559:
            java.lang.String r0 = "groupmgr/onParentGroupDescription/new community"
        L_0x055b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x055f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0564 }
        L_0x0561:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0564:
            r0 = move-exception
            goto L_0x0568
        L_0x0566:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0569 }
        L_0x0568:
            throw r0     // Catch:{ all -> 0x0569 }
        L_0x0569:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KQ.BdM(X.36K, java.lang.String):void");
    }
}
