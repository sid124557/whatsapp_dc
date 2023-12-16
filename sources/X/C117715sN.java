package X;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* renamed from: X.5sN  reason: invalid class name and case insensitive filesystem */
public class C117715sN implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C117715sN(AnonymousClass08M r2, C56082rO r3) {
        this.A03 = 41;
        this.A00 = r3;
        this.A02 = "status_distribution";
        this.A01 = r2;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, String str, int i) {
        r1.BkM(new C117715sN(obj, obj2, str, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0595, code lost:
        r0.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0598, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06ae, code lost:
        r7.A0S(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0729, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x072b, code lost:
        r3.A0C.A0U(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0730, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x079b, code lost:
        if (r2 < 4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x079d, code lost:
        ((com.google.android.gms.common.api.internal.LifecycleCallback) r1.A00).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0bb9, code lost:
        if (r3.A0X(2792) != false) goto L_0x0bbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3.A05(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        X.C157157hp.A00(r4.A01, r3.A03(), r4.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x07a7;
                case 1: goto L_0x0c62;
                case 2: goto L_0x0767;
                case 3: goto L_0x0731;
                case 4: goto L_0x0c51;
                case 5: goto L_0x0719;
                case 6: goto L_0x0706;
                case 7: goto L_0x0c39;
                case 8: goto L_0x0b97;
                case 9: goto L_0x06fa;
                case 10: goto L_0x06d8;
                case 11: goto L_0x06b2;
                case 12: goto L_0x0b82;
                case 13: goto L_0x0b64;
                case 14: goto L_0x0686;
                case 15: goto L_0x0b52;
                case 16: goto L_0x066d;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x04ad;
                case 20: goto L_0x0b31;
                case 21: goto L_0x0b12;
                case 22: goto L_0x0139;
                case 23: goto L_0x0af6;
                case 24: goto L_0x05ee;
                case 25: goto L_0x05ce;
                case 26: goto L_0x0a96;
                case 27: goto L_0x00e8;
                case 28: goto L_0x05ad;
                case 29: goto L_0x0a77;
                case 30: goto L_0x0095;
                case 31: goto L_0x0a5d;
                case 32: goto L_0x0a25;
                case 33: goto L_0x0599;
                case 34: goto L_0x0573;
                case 35: goto L_0x09bc;
                case 36: goto L_0x09a0;
                case 37: goto L_0x094b;
                case 38: goto L_0x0937;
                case 39: goto L_0x0914;
                case 40: goto L_0x08de;
                case 41: goto L_0x08cc;
                case 42: goto L_0x0048;
                case 43: goto L_0x08b4;
                case 44: goto L_0x002a;
                case 45: goto L_0x088e;
                case 46: goto L_0x0546;
                case 47: goto L_0x07fe;
                case 48: goto L_0x07e4;
                case 49: goto L_0x07c7;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r1.A00
            X.2m3 r4 = (X.C52792m3) r4
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            X.7Xj r3 = new X.7Xj
            r3.<init>()
            r0 = 0
            r3.A05(r2, r0)
            if (r1 == 0) goto L_0x001e
        L_0x001a:
            r0 = 1
            r3.A05(r1, r0)
        L_0x001e:
            X.6dJ r2 = r4.A01
            X.48t r1 = r4.A02
            X.7jD r0 = r3.A03()
            X.C157157hp.A00(r2, r0, r1)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r4 = r1.A02
            java.lang.Object r3 = r1.A00
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r3 = (com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel) r3
            java.lang.Object r2 = r1.A01
            X.4uZ r2 = (X.C95814uZ) r2
            if (r4 == 0) goto L_0x0046
            r0 = 0
            X.2z0 r1 = new X.2z0
            r1.<init>(r2, r4, r0)
            X.2qz r0 = r3.A0B
            X.34x r1 = r0.A05(r1)
        L_0x0042:
            X.08M r0 = r3.A03
            goto L_0x0595
        L_0x0046:
            r1 = 0
            goto L_0x0042
        L_0x0048:
            java.lang.Object r2 = r1.A00
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            java.lang.String r4 = r1.A02
            java.lang.Object r3 = r1.A01
            android.net.Uri r3 = (android.net.Uri) r3
            if (r4 == 0) goto L_0x0082
            X.33e r0 = r2.A0a
            int r8 = r0.A02()
            X.33e r0 = r2.A0a
            java.util.List r6 = r0.A07()
            X.33e r0 = r2.A0a
            java.util.List r7 = r0.A08()
            r9 = 0
            X.5de r5 = new X.5de
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r1 = X.C627736r.A0M(r2, r5, r0, r4)
        L_0x0077:
            X.3Wi r7 = r2.A05
            r0 = 26
            X.3bx r8 = new X.3bx
            r8.<init>(r2, r0, r1)
            goto L_0x06ae
        L_0x0082:
            android.content.Intent r1 = X.C18300x5.A07(r2)
            java.lang.String r0 = "com.whatsapp.intent.action.STATUSES"
            android.content.Intent r1 = r1.setAction(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.setAction(r0)
            r1.setData(r3)
            goto L_0x0077
        L_0x0095:
            java.lang.Object r4 = r1.A00
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r4 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r4
            java.lang.Object r5 = r1.A01
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            java.lang.String r6 = r1.A02
            X.1iB r3 = r4.A00
            X.2s7 r0 = r3.A0K
            X.2fq r1 = r0.A04
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "nickname"
            r8.put(r0, r6)
            X.1R7 r0 = r1.A02
            X.4Fq r2 = r0.A0C()
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a72 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0a72 }
            java.lang.String r9 = "devices"
            java.lang.String r10 = "device_id = ?"
            java.lang.String[] r12 = X.C18270x1.A1a(r5)     // Catch:{ all -> 0x0a72 }
            java.lang.String r11 = "setDeviceNickname/UPDATE_DEVICES"
            r7.A05(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0a72 }
            monitor-enter(r1)     // Catch:{ all -> 0x0a72 }
            X.8OQ r0 = r1.A00     // Catch:{ all -> 0x0a6f }
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0a6f }
            X.33G r0 = (X.AnonymousClass33G) r0     // Catch:{ all -> 0x0a6f }
            if (r0 == 0) goto L_0x00d5
            r0.A02 = r6     // Catch:{ all -> 0x0a6f }
        L_0x00d5:
            monitor-exit(r1)     // Catch:{ all -> 0x0a6f }
            r2.close()
            X.33G r0 = r3.A0A(r5)
            if (r0 == 0) goto L_0x00e2
            r3.A0H(r0)
        L_0x00e2:
            X.4UC r1 = r4.A01
            X.2wD r0 = X.C59022wD.A00
            goto L_0x06f6
        L_0x00e8:
            java.lang.Object r4 = r1.A00
            X.5b3 r4 = (X.C107285b3) r4
            java.lang.Object r3 = r1.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.String r5 = r1.A02
            X.2qK r1 = r4.A2k
            X.3dV r0 = r1.A05
            X.4Fq r8 = r0.A04()
            X.2sm r0 = r1.A03     // Catch:{ all -> 0x0a8c }
            long r0 = r0.A07(r3)     // Catch:{ all -> 0x0a8c }
            r7 = 1
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0a8c }
            r10.<init>(r7)     // Catch:{ all -> 0x0a8c }
            java.lang.String r6 = "is_upcoming"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0a8c }
            r10.put(r6, r2)     // Catch:{ all -> 0x0a8c }
            java.lang.String r12 = "key_chat_row_id = ? AND key_id = ?"
            r2 = r8
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0a8c }
            X.2sg r9 = r2.A03     // Catch:{ all -> 0x0a8c }
            java.lang.String r11 = "scheduled_calls"
            r2 = 2
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ all -> 0x0a8c }
            X.C18260x0.A1X(r14, r0)     // Catch:{ all -> 0x0a8c }
            r14[r7] = r5     // Catch:{ all -> 0x0a8c }
            java.lang.String r13 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_KEY_ID_CHAT_JID"
            int r0 = r9.A05(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a8c }
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by key ID and chat JID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0a8c }
        L_0x012b:
            r8.close()
            X.3Wi r7 = r4.A1d
            r0 = 28
            X.5sN r8 = new X.5sN
            r8.<init>(r4, r3, r5, r0)
            goto L_0x06ae
        L_0x0139:
            java.lang.Object r6 = r1.A00
            X.5Wb r6 = (X.C105705Wb) r6
            java.lang.Object r5 = r1.A01
            X.5T3 r5 = (X.AnonymousClass5T3) r5
            java.lang.String r7 = r1.A02
            java.util.List r0 = r5.A06
            java.util.Iterator r20 = r0.iterator()
        L_0x0149:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x04a2
            java.lang.Object r4 = r20.next()
            java.util.List r4 = (java.util.List) r4
            X.5ZO r1 = r5.A02
            r8 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5tA -> 0x0481 }
            r0 = 24
            X.91S r1 = new X.91S     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
        L_0x016a:
            java.util.Collections.sort(r4, r1)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0149
        L_0x016e:
            java.lang.String r2 = "server_score"
            java.lang.String r0 = "distance"
            java.util.ArrayList r19 = X.C18260x0.A0C(r2, r0)     // Catch:{ 5tA -> 0x0481 }
            r11 = 0
            X.C162457s7.A0J(r7, r11)     // Catch:{ 5tA -> 0x0481 }
            X.5U5 r10 = new X.5U5     // Catch:{ 5tA -> 0x0481 }
            r10.<init>(r7)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r2 = "_comment"
            org.json.JSONObject r0 = r10.A02     // Catch:{ 5tA -> 0x0481 }
            java.lang.Object r0 = r0.opt(r2)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x0198
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x0198
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "'s value is not a String."
            X.5tA r0 = X.C118205tA.A00(r0, r1)     // Catch:{ 5tA -> 0x0481 }
            throw r0     // Catch:{ 5tA -> 0x0481 }
        L_0x0198:
            java.lang.String r2 = "_version"
            org.json.JSONObject r0 = r10.A02     // Catch:{ 5tA -> 0x0481 }
            java.lang.Object r0 = r0.opt(r2)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x01b1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "'s value is not a String."
            X.5tA r0 = X.C118205tA.A00(r0, r1)     // Catch:{ 5tA -> 0x0481 }
            throw r0     // Catch:{ 5tA -> 0x0481 }
        L_0x01b1:
            org.json.JSONObject r3 = r10.A02     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "biz_value_features"
            org.json.JSONObject r13 = r3.optJSONObject(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r13 == 0) goto L_0x045d
            X.5YC r12 = r10.A04     // Catch:{ 5tA -> 0x0481 }
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()     // Catch:{ 5tA -> 0x0481 }
            java.util.HashMap r14 = X.AnonymousClass001.A0t()     // Catch:{ 5tA -> 0x0481 }
            java.util.Iterator r17 = r13.keys()     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0D(r17)     // Catch:{ 5tA -> 0x0481 }
        L_0x01cc:
            boolean r0 = r17.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x0237
            java.lang.String r9 = X.AnonymousClass001.A0m(r17)     // Catch:{ 5tA -> 0x0481 }
            boolean r0 = r14.containsKey(r9)     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x01e2
            X.C162457s7.A0H(r9)     // Catch:{ 5tA -> 0x0481 }
            X.C86624Kv.A1R(r9, r14)     // Catch:{ 5tA -> 0x0481 }
        L_0x01e2:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "\\b"
            r2.append(r0)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = X.AnonymousClass000.A0V(r9, r0, r2)     // Catch:{ 5tA -> 0x0481 }
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0)     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0D(r2)     // Catch:{ 5tA -> 0x0481 }
            java.util.Iterator r16 = r13.keys()     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0D(r16)     // Catch:{ 5tA -> 0x0481 }
        L_0x01fd:
            boolean r0 = r16.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x01cc
            java.lang.String r15 = X.AnonymousClass001.A0m(r16)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Object r0 = r13.get(r15)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = r0.toString()     // Catch:{ 5tA -> 0x0481 }
            java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0D(r0)     // Catch:{ 5tA -> 0x0481 }
            boolean r0 = r0.find()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r14.containsKey(r15)     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x0228
            X.C162457s7.A0H(r15)     // Catch:{ 5tA -> 0x0481 }
            X.C86624Kv.A1R(r15, r14)     // Catch:{ 5tA -> 0x0481 }
        L_0x0228:
            java.lang.Object r0 = r14.get(r15)     // Catch:{ 5tA -> 0x0481 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x01fd
            X.C162457s7.A0H(r9)     // Catch:{ 5tA -> 0x0481 }
            r0.add(r9)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x01fd
        L_0x0237:
            java.util.Iterator r15 = X.C18290x4.A11(r14)     // Catch:{ 5tA -> 0x0481 }
        L_0x023b:
            boolean r0 = r15.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x0252
            java.lang.String r9 = X.AnonymousClass001.A0m(r15)     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0H(r9)     // Catch:{ 5tA -> 0x0481 }
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ 5tA -> 0x0481 }
            r0 = r18
            X.AnonymousClass5A9.A00(r9, r14, r2, r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x023b
        L_0x0252:
            java.util.Iterator r17 = r18.iterator()     // Catch:{ 5tA -> 0x0481 }
        L_0x0256:
            boolean r0 = r17.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x02b7
            java.lang.String r2 = X.AnonymousClass001.A0m(r17)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Object r15 = r13.get(r2)     // Catch:{ 5tA -> 0x0481 }
            boolean r0 = r15 instanceof java.lang.Integer     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x026c
            boolean r0 = r15 instanceof java.lang.Double     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x0270
        L_0x026c:
            java.lang.String r15 = r15.toString()     // Catch:{ 5tA -> 0x0481 }
        L_0x0270:
            boolean r0 = r15 instanceof java.lang.String     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x03fa
            boolean r0 = r2.equals(r15)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x027e
            r12.A09(r2, r8)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0256
        L_0x027e:
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0J(r15, r8)     // Catch:{ 5tA -> 0x0481 }
            int r16 = r12.A09(r2, r11)     // Catch:{ 5tA -> 0x0481 }
            java.util.HashMap r9 = r12.A02     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r14 = r12.A06     // Catch:{ 5tA -> 0x0481 }
            int r0 = r14.size()     // Catch:{ 5tA -> 0x0481 }
            X.AnonymousClass0x2.A1I(r2, r9, r0)     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r9 = r12.A08     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r0 = new java.util.Vector     // Catch:{ 5tA -> 0x0481 }
            r0.<init>()     // Catch:{ 5tA -> 0x0481 }
            r9.addElement(r0)     // Catch:{ 5tA -> 0x0481 }
            X.7Y4 r9 = new X.7Y4     // Catch:{ 5tA -> 0x0481 }
            r9.<init>(r15)     // Catch:{ 5tA -> 0x0481 }
            int r15 = r12.A06(r9, r2)     // Catch:{ 5tA -> 0x0481 }
            char r0 = r9.A00()     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x0465
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ 5tA -> 0x0481 }
            X.AnonymousClass3Z6.A03(r2, r0, r14)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0256
        L_0x02b7:
            java.lang.String r0 = "biz_multiply_values"
            org.json.JSONObject r9 = r3.optJSONObject(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r9 == 0) goto L_0x0455
            java.lang.String r0 = "base_values"
            org.json.JSONObject r2 = r9.optJSONObject(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r2 == 0) goto L_0x044d
            java.util.HashMap r0 = r10.A05     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r0 = r10.A01(r0, r2)     // Catch:{ 5tA -> 0x0481 }
            r10.A00 = r0     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r0 = r10.A02(r9, r8)     // Catch:{ 5tA -> 0x0481 }
            r10.A01 = r0     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "sort_strategy"
            java.lang.Object r2 = r3.opt(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r2 == 0) goto L_0x0445
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = "asc"
            boolean r0 = r2.equals(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x02eb
            r0 = 0
            goto L_0x02f4
        L_0x02eb:
            java.lang.String r0 = "desc"
            boolean r0 = r2.equals(r0)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x042d
            r0 = 1
        L_0x02f4:
            r10.A03 = r0     // Catch:{ 5tA -> 0x0481 }
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ 5tA -> 0x0481 }
            java.util.Vector r13 = r12.A09     // Catch:{ 5tA -> 0x0481 }
            r13.clear()     // Catch:{ 5tA -> 0x0481 }
            java.util.Iterator r16 = r19.iterator()     // Catch:{ 5tA -> 0x0481 }
            r15 = 0
        L_0x0304:
            boolean r0 = r16.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x0333
            int r14 = r15 + 1
            java.lang.String r3 = X.AnonymousClass001.A0m(r16)     // Catch:{ 5tA -> 0x0481 }
            java.util.HashSet r0 = r12.A04     // Catch:{ 5tA -> 0x0481 }
            boolean r0 = r0.contains(r3)     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x041d
            boolean r0 = r9.contains(r3)     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x040d
            java.util.HashMap r0 = r12.A03     // Catch:{ 5tA -> 0x0481 }
            X.C162457s7.A0J(r0, r11)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Object r2 = X.C57692u3.A02(r0, r3)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ 5tA -> 0x0481 }
            X.AnonymousClass3Z6.A03(r2, r0, r13)     // Catch:{ 5tA -> 0x0481 }
            r9.add(r3)     // Catch:{ 5tA -> 0x0481 }
            r15 = r14
            goto L_0x0304
        L_0x0333:
            java.util.HashSet r0 = r12.A05     // Catch:{ 5tA -> 0x0481 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ 5tA -> 0x0481 }
        L_0x0339:
            boolean r0 = r3.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x035d
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)     // Catch:{ 5tA -> 0x0481 }
            boolean r0 = r9.contains(r2)     // Catch:{ 5tA -> 0x0481 }
            if (r0 != 0) goto L_0x0339
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "Required extracted feature "
            r1.append(r0)     // Catch:{ 5tA -> 0x0481 }
            r1.append(r2)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = " is not provided in inputOrder"
            X.5tA r1 = X.C118205tA.A00(r0, r1)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x035d:
            boolean r0 = r1.A07()     // Catch:{ 5tA -> 0x0481 }
            r12 = 2
            if (r0 == 0) goto L_0x0390
            java.util.Iterator r3 = r4.iterator()     // Catch:{ 5tA -> 0x0481 }
        L_0x0368:
            boolean r0 = r3.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r2 = r3.next()     // Catch:{ 5tA -> 0x0481 }
            X.8u4 r2 = (X.C185678u4) r2     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double[] r1 = new java.lang.Double[r12]     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = r2.BBc()     // Catch:{ 5tA -> 0x0481 }
            r1[r11] = r0     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = X.C105705Wb.A03     // Catch:{ 5tA -> 0x0481 }
            r1[r8] = r0     // Catch:{ 5tA -> 0x0481 }
            java.util.ArrayList r0 = X.AnonymousClass0x2.A0i(r1)     // Catch:{ 5tA -> 0x0481 }
            double r0 = r10.A00(r0)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5tA -> 0x0481 }
            r2.Bn2(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0368
        L_0x0390:
            java.lang.Double r0 = r1.A04     // Catch:{ 5tA -> 0x0481 }
            X.C626936e.A06(r0)     // Catch:{ 5tA -> 0x0481 }
            double r2 = r0.doubleValue()     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = r1.A05     // Catch:{ 5tA -> 0x0481 }
            X.C626936e.A06(r0)     // Catch:{ 5tA -> 0x0481 }
            double r0 = r0.doubleValue()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r13 = ""
            android.location.Location r9 = new android.location.Location     // Catch:{ 5tA -> 0x0481 }
            r9.<init>(r13)     // Catch:{ 5tA -> 0x0481 }
            r9.setLatitude(r2)     // Catch:{ 5tA -> 0x0481 }
            r9.setLongitude(r0)     // Catch:{ 5tA -> 0x0481 }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ 5tA -> 0x0481 }
        L_0x03b3:
            boolean r0 = r13.hasNext()     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r2 = r13.next()     // Catch:{ 5tA -> 0x0481 }
            X.8u4 r2 = (X.C185678u4) r2     // Catch:{ 5tA -> 0x0481 }
            r2.AyI(r9)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double[] r3 = new java.lang.Double[r12]     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = r2.BBc()     // Catch:{ 5tA -> 0x0481 }
            r3[r11] = r0     // Catch:{ 5tA -> 0x0481 }
            double r0 = r2.B78()     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5tA -> 0x0481 }
            r3[r8] = r0     // Catch:{ 5tA -> 0x0481 }
            java.util.ArrayList r0 = X.AnonymousClass0x2.A0i(r3)     // Catch:{ 5tA -> 0x0481 }
            double r0 = r10.A00(r0)     // Catch:{ 5tA -> 0x0481 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5tA -> 0x0481 }
            r2.Bn2(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x03b3
        L_0x03e4:
            boolean r0 = r10.A03     // Catch:{ 5tA -> 0x0481 }
            if (r0 == 0) goto L_0x03f1
            r0 = 22
            X.91S r1 = new X.91S     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x016a
        L_0x03f1:
            r0 = 23
            X.91S r1 = new X.91S     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x016a
        L_0x03fa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "Feature "
            r1.append(r0)     // Catch:{ 5tA -> 0x0481 }
            r1.append(r2)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = " has unexpected type."
            X.5tA r1 = X.C118205tA.A00(r0, r1)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x040d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "inputOrder contains multiple occurrences of extracted feature "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ 5tA -> 0x0481 }
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x041d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "inputOrder contains undeclared symbol "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ 5tA -> 0x0481 }
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x042d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "sort_strategy has unexpected value: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ 5tA -> 0x0481 }
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x043d:
            java.lang.String r0 = "sort_strategy's value is not a String."
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x0445:
            java.lang.String r0 = "sort_strategy missing from config file."
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x044d:
            java.lang.String r0 = "base_values missing in biz_multiply_values in config file."
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x0455:
            java.lang.String r0 = "biz_multiply_values missing from config file."
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x045d:
            java.lang.String r0 = "biz_value_features missing from config file."
            X.5tA r1 = new X.5tA     // Catch:{ 5tA -> 0x0481 }
            r1.<init>(r0)     // Catch:{ 5tA -> 0x0481 }
            goto L_0x0480
        L_0x0465:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "Unexpected character '"
            r1.append(r0)     // Catch:{ 5tA -> 0x0481 }
            char r0 = r9.A00()     // Catch:{ 5tA -> 0x0481 }
            r1.append(r0)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "' found at index "
            X.C86604Kt.A1P(r9, r0, r2, r1)     // Catch:{ 5tA -> 0x0481 }
            java.lang.String r0 = "'s expression"
            X.5tA r1 = X.C118205tA.A00(r0, r1)     // Catch:{ 5tA -> 0x0481 }
        L_0x0480:
            throw r1     // Catch:{ 5tA -> 0x0481 }
        L_0x0481:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/rankUsingConfig Failed with exception message: "
            X.C18260x0.A16(r0, r1, r3)
            X.2qk r2 = r6.A00
            java.lang.String r1 = "DirectoryBusinessRankerValueModel/rankUsingConfig Value model parsing failed"
            java.lang.String r0 = r3.getMessage()
            r2.A0A(r1, r8, r0)
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 24
            X.C86614Ku.A1U(r4, r0)
            goto L_0x0149
        L_0x04a2:
            X.3Wi r7 = r6.A01
            r0 = 24
            X.5rQ r8 = new X.5rQ
            r8.<init>(r5, r0)
            goto L_0x06ae
        L_0x04ad:
            java.lang.Object r8 = r1.A00
            X.5W7 r8 = (X.AnonymousClass5W7) r8
            java.lang.String r7 = r1.A02
            java.lang.Object r6 = r1.A01
            r9 = 1
            r5 = 2
            X.5QW r1 = r8.A01
            X.7WI r0 = new X.7WI
            r0.<init>(r1)
            java.util.List r0 = r0.A00()
            java.util.ArrayList r4 = X.C18300x5.A0t(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r0.iterator()
        L_0x04ce:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x053b
            java.lang.Object r2 = r10.next()
            X.64c r2 = (X.C1223664c) r2
            boolean r0 = r2 instanceof X.C109045dz
            if (r0 == 0) goto L_0x04fe
            int r0 = r4.size()
            if (r0 >= r5) goto L_0x04ce
            X.C162457s7.A0H(r2)
            boolean r0 = X.AnonymousClass5W7.A00(r2, r4)
            if (r0 != 0) goto L_0x04ce
            r0 = r2
            X.5dz r0 = (X.C109045dz) r0
            java.lang.String r1 = r0.A02
        L_0x04f2:
            X.33j r0 = r8.A02
            boolean r0 = X.AnonymousClass5A7.A00(r0, r1, r7)
            if (r0 == 0) goto L_0x04ce
            r4.add(r2)
            goto L_0x04ce
        L_0x04fe:
            boolean r0 = r2 instanceof X.C109025dx
            if (r0 == 0) goto L_0x0517
            int r0 = r4.size()
            if (r0 >= r5) goto L_0x04ce
            X.C162457s7.A0H(r2)
            boolean r0 = X.AnonymousClass5W7.A00(r2, r4)
            if (r0 != 0) goto L_0x04ce
            r0 = r2
            X.5dx r0 = (X.C109025dx) r0
            java.lang.String r1 = r0.A01
            goto L_0x04f2
        L_0x0517:
            boolean r0 = r2 instanceof X.C109035dy
            if (r0 == 0) goto L_0x04ce
            int r0 = r3.size()
            if (r0 >= r9) goto L_0x04ce
            boolean r0 = r3.contains(r2)
            if (r0 != 0) goto L_0x04ce
            r0 = r2
            X.5dy r0 = (X.C109035dy) r0
            java.lang.String r1 = r0.A01
            X.33j r0 = r8.A02
            boolean r0 = X.AnonymousClass5A7.A00(r0, r1, r7)
            if (r0 == 0) goto L_0x04ce
            X.C162457s7.A0H(r2)
            r3.add(r2)
            goto L_0x04ce
        L_0x053b:
            X.3Wi r7 = r8.A00
            r0 = 8
            X.3aJ r8 = new X.3aJ
            r8.<init>(r6, r4, r3, r0)
            goto L_0x06ae
        L_0x0546:
            java.lang.Object r0 = r1.A00
            X.3Sk r0 = (X.C68243Sk) r0
            java.lang.String r4 = r1.A02
            java.lang.Object r2 = r1.A01
            X.4uZ r2 = (X.C95814uZ) r2
            X.2OG r3 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess called, ticketId="
            X.C18260x0.A0s(r0, r4, r1)
            X.4ER r0 = r3.A00
            r0.BOr(r2)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0029
            X.2aw r0 = r3.A01
            X.4FS r2 = r0.A03
            r1 = 44
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r4, r3)
            r2.BkM(r0)
            return
        L_0x0573:
            java.lang.Object r5 = r1.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r5
            java.lang.Object r4 = r1.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.String r3 = r1.A02
            X.2qz r2 = r5.A05
            r1 = 0
            X.2z0 r0 = new X.2z0
            r0.<init>(r4, r3, r1)
            X.34x r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0029
            X.2W0 r2 = r5.A04
            long r0 = r0.A1L
            java.lang.Integer r1 = r2.A00(r0)
            X.08M r0 = r5.A01
        L_0x0595:
            r0.A0G(r1)
            return
        L_0x0599:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.A01
            X.0R8 r2 = (X.AnonymousClass0R8) r2
            java.lang.String r1 = r1.A02
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0029
            r2.A0J(r1)
            return
        L_0x05ad:
            java.lang.Object r0 = r1.A00
            X.5b3 r0 = (X.C107285b3) r0
            java.lang.Object r4 = r1.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.String r3 = r1.A02
            X.1iZ r0 = r0.A2y
            r2 = 1
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x05be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            X.4Ee r0 = (X.C84904Ee) r0
            r0.Avr(r4, r3, r2)
            goto L_0x05be
        L_0x05ce:
            java.lang.Object r3 = r1.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = (com.whatsapp.calling.callhistory.CallLogActivity) r3
            java.lang.String r2 = r1.A02
            java.lang.Object r0 = r1.A01
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.2qK r1 = r3.A0U
            com.whatsapp.jid.GroupJid r0 = r0.A05
            X.2i6 r0 = r1.A02(r0, r2)
            r3.A0T = r0
            if (r0 == 0) goto L_0x0029
            X.3Wi r7 = r3.A05
            r0 = 9
            X.5sL r8 = X.C117695sL.A00(r3, r0)
            goto L_0x06ae
        L_0x05ee:
            java.lang.Object r7 = r1.A00
            X.5ZL r7 = (X.AnonymousClass5ZL) r7
            java.lang.Object r0 = r1.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r2 = r1.A02
            java.util.Iterator r3 = r0.iterator()
            r6 = 0
            r5 = 0
        L_0x05fe:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x061a
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C97874zP
            if (r0 != 0) goto L_0x0617
            boolean r0 = r1 instanceof X.C97884zQ
            if (r0 != 0) goto L_0x0617
            boolean r0 = r1 instanceof X.C97834zK
            if (r0 == 0) goto L_0x05fe
        L_0x0614:
            int r5 = r5 + 1
            goto L_0x05fe
        L_0x0617:
            int r6 = r6 + 1
            goto L_0x0614
        L_0x061a:
            X.5iD r8 = r7.A0A
            X.2s8 r3 = r7.A0E
            int r1 = r3.A02
            r0 = 98
            r4 = 0
            if (r1 != r0) goto L_0x0627
            r4 = 20
        L_0x0627:
            int r3 = X.C86644Kx.A05(r3)
            java.lang.String r15 = r7.A02()
            r1 = 5
            boolean r0 = X.C111515iD.A00(r8)
            if (r0 == 0) goto L_0x0658
            X.4sJ r9 = new X.4sJ
            r9.<init>()
            r0 = 47
            X.C94924sJ.A01(r8, r9, r0, r4, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r16 = r11
            r14 = r11
            r8.A02(r9, r10, r11, r12, r13, r14, r15, r16)
            X.4FV r0 = r8.A02
            r0.BhD(r9)
        L_0x0658:
            if (r5 != 0) goto L_0x0029
            r0 = 20
            if (r4 != r0) goto L_0x0029
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r10 = 3
            r9 = r5
            r4 = r8
            r7 = r2
            r8 = r5
            r11 = r0
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x066d:
            java.lang.Object r4 = r1.A00
            X.2m3 r4 = (X.C52792m3) r4
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            java.util.Map r1 = (java.util.Map) r1
            X.7Xj r3 = new X.7Xj
            r3.<init>()
            r0 = 0
            r3.A05(r2, r0)
            java.util.Map r1 = X.C57102t5.A01(r1)
            goto L_0x001a
        L_0x0686:
            java.lang.Object r3 = r1.A00
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r3 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r3
            java.lang.String r0 = r1.A02
            java.lang.Object r2 = r1.A01
            X.C162457s7.A0H(r2)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A0A(r0)
            X.3Ex r0 = r3.A04
            if (r0 == 0) goto L_0x0c79
            X.3ZH r0 = r0.A0A(r1)
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0029
            X.3Wi r7 = r3.A02
            if (r7 == 0) goto L_0x0c72
            r0 = 44
            X.5rP r8 = new X.5rP
            r8.<init>(r2, r0)
        L_0x06ae:
            r7.A0S(r8)
            return
        L_0x06b2:
            java.lang.Object r0 = r1.A00
            X.8Eq r0 = (X.C170818Eq) r0
            java.lang.Object r3 = r1.A01
            X.7PB r3 = (X.AnonymousClass7PB) r3
            java.lang.String r2 = r1.A02
            X.5Y9 r0 = r0.A00
            java.util.List r0 = r0.A0P
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x06c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            X.8rA r0 = (X.C184048rA) r0
            r0.BTI(r3, r2)
            goto L_0x06c8
        L_0x06d8:
            java.lang.Object r3 = r1.A00
            X.5PC r3 = (X.AnonymousClass5PC) r3
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.String r1 = r1.A02
            X.5UW r0 = r3.A0D     // Catch:{ Exception -> 0x06f0 }
            r0.A07(r2, r1)     // Catch:{ Exception -> 0x06f0 }
            X.08M r0 = r3.A03     // Catch:{ Exception -> 0x06f0 }
            if (r0 == 0) goto L_0x0029
            r0.A0G(r1)     // Catch:{ Exception -> 0x06f0 }
            goto L_0x0c80
        L_0x06f0:
            X.08M r1 = r3.A06
            if (r1 == 0) goto L_0x0029
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x06f6:
            r1.A0G(r0)
            return
        L_0x06fa:
            java.lang.Object r0 = r1.A00
            X.3TS r0 = (X.AnonymousClass3TS) r0
            X.4CM r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            r0.BU1()
            return
        L_0x0706:
            java.lang.Object r3 = r1.A00
            X.3Go r3 = (X.C65193Go) r3
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.String r1 = r1.A02
            X.2q8 r0 = r3.A0V
            X.1fU r2 = (X.AnonymousClass1fU) r2
            boolean r0 = r0.A03(r2, r1)
            goto L_0x0729
        L_0x0719:
            java.lang.Object r3 = r1.A00
            X.3Go r3 = (X.C65193Go) r3
            java.lang.Object r2 = r1.A01
            X.1fU r2 = (X.AnonymousClass1fU) r2
            java.lang.String r1 = r1.A02
            X.2q8 r0 = r3.A0V
            boolean r0 = r0.A04(r2, r1)
        L_0x0729:
            if (r0 == 0) goto L_0x0029
            X.3Ex r0 = r3.A0C
            r0.A0U(r2)
            return
        L_0x0731:
            java.lang.Object r4 = r1.A01
            com.google.android.gms.common.api.internal.zzd r4 = (com.google.android.gms.common.api.internal.zzd) r4
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x074a
            java.lang.Object r3 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            android.os.Bundle r2 = r4.A01
            if (r2 == 0) goto L_0x0765
            java.lang.String r0 = "ConnectionlessLifecycleHelper"
            android.os.Bundle r0 = r2.getBundle(r0)
        L_0x0747:
            r3.A04(r0)
        L_0x074a:
            int r2 = r4.A00
            r0 = 2
            if (r2 < r0) goto L_0x0756
            java.lang.Object r0 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A01()
        L_0x0756:
            int r2 = r4.A00
            r0 = 3
            if (r2 < r0) goto L_0x0762
            java.lang.Object r0 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A00()
        L_0x0762:
            int r2 = r4.A00
            goto L_0x079a
        L_0x0765:
            r0 = 0
            goto L_0x0747
        L_0x0767:
            java.lang.Object r4 = r1.A01
            X.6CO r4 = (X.AnonymousClass6CO) r4
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x0780
            java.lang.Object r3 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            android.os.Bundle r2 = r4.A01
            if (r2 == 0) goto L_0x07a5
            java.lang.String r0 = "ConnectionlessLifecycleHelper"
            android.os.Bundle r0 = r2.getBundle(r0)
        L_0x077d:
            r3.A04(r0)
        L_0x0780:
            int r2 = r4.A00
            r0 = 2
            if (r2 < r0) goto L_0x078c
            java.lang.Object r0 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A01()
        L_0x078c:
            int r2 = r4.A00
            r0 = 3
            if (r2 < r0) goto L_0x0798
            java.lang.Object r0 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A00()
        L_0x0798:
            int r2 = r4.A00
        L_0x079a:
            r0 = 4
            if (r2 < r0) goto L_0x0029
            java.lang.Object r0 = r1.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A02()
            return
        L_0x07a5:
            r0 = 0
            goto L_0x077d
        L_0x07a7:
            java.lang.Object r0 = r1.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x07b1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r3 = r4.next()
            X.8vW r3 = (X.C186538vW) r3
            java.lang.Object r2 = r1.A01
            X.7yr r2 = (X.C166537yr) r2
            java.lang.String r0 = r1.A02
            r3.BYm(r2, r0)
            goto L_0x07b1
        L_0x07c7:
            java.lang.Object r4 = r1.A00
            X.0eF r4 = (X.C08310eF) r4
            java.lang.Object r3 = r1.A01
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            java.lang.String r0 = r1.A02
            java.lang.Object[] r2 = X.AnonymousClass000.A1b(r0)
            r1 = 2131893094(0x7f121b66, float:1.9420955E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r0 = r0.getString(r1, r2)
            r3.setTitle(r0)
            return
        L_0x07e4:
            java.lang.Object r3 = r1.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            X.1mV r1 = (X.C30471mV) r1
            com.whatsapp.TextEmojiLabel r0 = r3.A06
            r0.setText(r2)
            r3.A1q(r1)
            X.03q r0 = r3.A0R()
            r0.invalidateOptionsMenu()
            return
        L_0x07fe:
            java.lang.Object r4 = r1.A00
            X.5rW r4 = (X.C117185rW) r4
            java.lang.Object r6 = r1.A01
            android.location.Address r6 = (android.location.Address) r6
            java.lang.String r3 = r1.A02
            r5 = 0
            if (r6 == 0) goto L_0x0845
            int r0 = r6.getMaxAddressLineIndex()
            if (r0 < 0) goto L_0x081b
            X.5cU r0 = r4.A02
            com.whatsapp.location.PlaceInfo r1 = r0.A1O
            java.lang.String r0 = r6.getAddressLine(r5)
            r1.A06 = r0
        L_0x081b:
            X.5cU r2 = r4.A02
            com.whatsapp.location.PlaceInfo r0 = r2.A1O
            r0.A04 = r3
            java.lang.String r0 = r6.getLocality()
            if (r0 == 0) goto L_0x0837
            java.lang.String r0 = r6.getLocality()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0837
            java.lang.String r0 = r6.getLocality()
            r2.A0l = r0
        L_0x0837:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0845
            X.6wP r1 = r2.A0Y
            X.6wP r0 = X.C141956wP.EVENT_MODE
            if (r1 != r0) goto L_0x0845
            r2.A0l = r3
        L_0x0845:
            X.5cU r4 = r4.A02
            X.07r r1 = r4.A0X
            r0 = 2131431170(0x7f0b0f02, float:1.8484062E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r1, r0)
            android.view.View r1 = r4.A0G
            r0 = 2131431099(0x7f0b0ebb, float:1.8483918E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r1, r0)
            boolean r0 = r4.A0U()
            if (r0 == 0) goto L_0x0885
            java.lang.String r1 = r4.A0l
        L_0x0861:
            if (r3 == 0) goto L_0x0871
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            int r0 = X.C86614Ku.A01(r0)
            r3.setVisibility(r0)
            r3.setText(r1)
        L_0x0871:
            if (r2 == 0) goto L_0x0881
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x087b
            r5 = 8
        L_0x087b:
            r2.setVisibility(r5)
            r2.setText(r1)
        L_0x0881:
            r4.A0A()
            return
        L_0x0885:
            com.whatsapp.location.PlaceInfo r0 = r4.A1O
            java.lang.String r1 = r0.A06
            if (r1 != 0) goto L_0x0861
            java.lang.String r1 = r0.A04
            goto L_0x0861
        L_0x088e:
            java.lang.Object r5 = r1.A00
            com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel r5 = (com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel) r5
            java.lang.Object r4 = r1.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r3 = r1.A02
            X.33g r2 = r5.A07
            X.5dt r0 = r2.A02(r4)
            if (r0 == 0) goto L_0x08aa
            boolean r0 = r0.A0Z
            if (r0 == 0) goto L_0x08aa
            X.08M r0 = r5.A01
            r0.A0G(r3)
            return
        L_0x08aa:
            X.3Ds r1 = new X.3Ds
            r1.<init>(r5, r3)
            r0 = 0
            r2.A08(r1, r4, r0)
            return
        L_0x08b4:
            java.lang.String r0 = r1.A02
            java.lang.Object r3 = r1.A00
            X.4GQ r3 = (X.AnonymousClass4GQ) r3
            java.lang.Object r2 = r1.A01
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r0)
            r1.append(r0)
            java.lang.String r0 = "/event responses loaded"
            X.C18260x0.A1J(r1, r0)
            r3.invoke(r2)
            return
        L_0x08cc:
            java.lang.Object r2 = r1.A00
            X.2rO r2 = (X.C56082rO) r2
            java.lang.String r0 = "status_distribution"
            java.lang.Object r1 = r1.A01
            X.0Wx r1 = (X.C06270Wx) r1
            java.lang.String r0 = r2.A01(r0)
            r1.A0G(r0)
            return
        L_0x08de:
            java.lang.Object r0 = r1.A00
            X.2Y3 r0 = (X.AnonymousClass2Y3) r0
            java.lang.Object r6 = r1.A01
            X.34x r6 = (X.C624134x) r6
            java.lang.String r3 = r1.A02
            X.3dV r0 = r0.A01
            X.4Fq r5 = r0.A04()
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x090f }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A1L     // Catch:{ all -> 0x090f }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r0 = "message_template_id"
            r4.put(r0, r3)     // Catch:{ all -> 0x090f }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x090f }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x090f }
            java.lang.String r2 = "messages_hydrated_four_row_template"
            r1 = 5
            java.lang.String r0 = "addTemplateId/INSERT_MESSAGES_HYDRATED_FOUR_ROW_TEMPLATE"
            r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x090f }
            r5.close()
            return
        L_0x090f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0a91 }
            throw r1
        L_0x0914:
            java.lang.Object r5 = r1.A00
            X.2qJ r5 = (X.C55412qJ) r5
            java.lang.Object r4 = r1.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.String r3 = r1.A02
            r2 = 0
            X.2ss r1 = r5.A02
            X.31A r0 = X.C56982ss.A00(r1, r4)
            if (r0 != 0) goto L_0x0931
            X.31A r0 = new X.31A
            r0.<init>((X.C95814uZ) r4)
            r0.A0h = r3
            r1.A0H(r0, r4)
        L_0x0931:
            r0.A0h = r3
            r5.A03(r0, r4, r2)
            return
        L_0x0937:
            java.lang.Object r0 = r1.A00
            X.313 r0 = (X.AnonymousClass313) r0
            java.lang.String r3 = r1.A02
            java.lang.Object r2 = r1.A01
            X.2GG r1 = r0.A09
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            r0.put(r3, r2)
            return
        L_0x094b:
            java.lang.Object r2 = r1.A00
            X.5l7 r2 = (X.C113245l7) r2
            java.lang.Object r9 = r1.A01
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r10 = r1.A02
            X.5Tt r1 = r2.A20
            r0 = 17
            r1.A01(r0)
            X.7SU r0 = r2.A4t
            r0.A00()
            X.2sr r0 = r2.A1b
            boolean r11 = r0.A0a(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 != 0) goto L_0x098b
            X.4eZ r3 = X.C113245l7.A09(r2)
            X.4eZ r1 = X.C113245l7.A09(r2)
            r0 = 0
            android.content.Intent r4 = X.C627736r.A1E(r1, r0, r4)
            X.3Wi r5 = r2.A1Z
            X.5Y9 r8 = r2.A21
            X.5Uu r6 = r2.A1z
            X.5Tt r7 = r2.A20
            X.AnonymousClass5ZY.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x098b:
            X.2sr r0 = r2.A1b
            r0.A0a(r9)
            r1 = 11
            X.4eZ r0 = X.C113245l7.A09(r2)
            android.content.Intent r1 = X.C627736r.A0c(r0, r9, r3, r1)
            X.676 r0 = r2.A2z
            r0.startActivity(r1)
            return
        L_0x09a0:
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            java.lang.Object r3 = r1.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r1 = r1.A02
            r0 = 37
            X.5sN r2 = new X.5sN
            r2.<init>(r4, r3, r1, r0)
            X.5T7 r0 = r4.A1t
            X.3XA r1 = r0.A01(r3)
            r0 = 6
            X.C124266Bp.A00(r1, r2, r0)
            return
        L_0x09bc:
            java.lang.Object r2 = r1.A00
            X.2Pp r2 = (X.C42812Pp) r2
            java.lang.Object r6 = r1.A01
            X.2z0 r6 = (X.AnonymousClass2z0) r6
            java.lang.String r3 = r1.A02
            r15 = 1
            X.2gW r5 = r2.A00
            X.3Lv r0 = r5.A01
            X.2qz r0 = r0.A2D
            X.34x r4 = r0.A05(r6)
            if (r4 != 0) goto L_0x09dc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CatalogNFMStructuredMessageLoggingDelegate/logInteraction: unable to find FMessageInteractive with key="
            X.C18260x0.A1Q(r1, r0, r6)
        L_0x09dc:
            X.2Ze r7 = r2.A01
            if (r4 == 0) goto L_0x0a23
            boolean r0 = r4.A1s(r15)
            if (r0 != 0) goto L_0x0a23
            X.2eE r2 = r5.A02
            long r0 = r4.A1L
            X.2k2 r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x0a1e
            java.lang.Integer r0 = X.C18290x4.A0Z()
        L_0x09f4:
            java.lang.String r10 = r5.A01(r6, r0)
            r11 = 0
            if (r4 == 0) goto L_0x0a1b
            X.4uZ r8 = r6.A00
            boolean r0 = r4.A1s(r15)
            int r0 = r5.A00(r8, r3, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.A1s(r15)
            if (r0 == 0) goto L_0x0a13
            com.whatsapp.jid.PhoneUserJid r8 = X.AnonymousClass32X.A00(r3)
        L_0x0a13:
            r13 = 4
            r14 = 22
            r12 = 0
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0a1b:
            r9 = r11
            r8 = r11
            goto L_0x0a13
        L_0x0a1e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            goto L_0x09f4
        L_0x0a23:
            r0 = 0
            goto L_0x09f4
        L_0x0a25:
            java.lang.Object r0 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            java.lang.String r4 = r1.A02
            java.lang.Object r2 = r1.A01
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            X.0zH r3 = X.C18320x8.A0H(r0)
            android.content.Context r1 = r0.A1D()
            X.5Y0 r0 = r0.A1w
            java.lang.CharSequence r0 = X.C107345b9.A05(r1, r0, r4)
            r3.A0h(r0)
            r0 = 2131891057(0x7f121371, float:1.9416823E38)
            r3.A0T(r0)
            r0 = 2131891055(0x7f12136f, float:1.941682E38)
            r3.A0Y(r2, r0)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 10
            X.90p r0 = new X.90p
            r0.<init>(r1)
            r3.A0W(r0, r2)
            r3.A0S()
            return
        L_0x0a5d:
            java.lang.Object r0 = r1.A00
            X.5Xd r0 = (X.C105975Xd) r0
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.String r1 = r1.A02
            X.2q8 r0 = r0.A0C
            X.1fU r2 = (X.AnonymousClass1fU) r2
            r0.A03(r2, r1)
            return
        L_0x0a6f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0a6f }
            throw r0     // Catch:{ all -> 0x0a72 }
        L_0x0a72:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0a91 }
            throw r1
        L_0x0a77:
            java.lang.Object r4 = r1.A00
            com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r4 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r4
            java.lang.String r3 = r1.A02
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.5QD r1 = r4.A05
            X.8Yj r0 = new X.8Yj
            r0.<init>(r4, r2)
            r1.A00(r2, r3, r0)
            return
        L_0x0a8c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0a91 }
            throw r1
        L_0x0a91:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0a96:
            java.lang.Object r5 = r1.A00
            X.5b3 r5 = (X.C107285b3) r5
            java.lang.String r6 = r1.A02
            java.lang.Object r2 = r1.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async start for callId "
            X.C18260x0.A0s(r0, r6, r1)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = X.C627436k.A0O(r1)
            if (r0 == 0) goto L_0x0ad9
            java.lang.String r0 = r1.callId
            boolean r0 = android.text.TextUtils.equals(r6, r0)
            if (r0 == 0) goto L_0x0ad9
            X.2s4 r1 = r5.A1f
            r0 = 1
            r1.A08(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0ac9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0adc
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.2pK r0 = r5.A2v
            r0.A02(r1)
            goto L_0x0ac9
        L_0x0ad9:
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation canceled"
            goto L_0x0af2
        L_0x0adc:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation elapsed "
            r2.append(r0)
            long r0 = X.AnonymousClass0x7.A0E(r3)
            r2.append(r0)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
        L_0x0af2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0af6:
            java.lang.Object r3 = r1.A00
            X.4U8 r3 = (X.AnonymousClass4U8) r3
            java.lang.Object r2 = r1.A01
            X.5ds r2 = (X.C108975ds) r2
            java.lang.String r5 = r1.A02
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5QV r1 = r3.A0L
            com.google.android.gms.maps.model.LatLng r2 = X.C108975ds.A04(r2)
            r7 = 0
            java.lang.String r6 = "pin_on_map"
            r4 = 0
            r1.A01(r2, r3, r4, r5, r6, r7)
            return
        L_0x0b12:
            java.lang.Object r2 = r1.A00
            X.0Wx r2 = (X.C06270Wx) r2
            java.lang.Object r0 = r1.A01
            android.location.Location r0 = (android.location.Location) r0
            java.lang.String r4 = r1.A02
            double r5 = r0.getLatitude()
            double r7 = r0.getLongitude()
            float r9 = r0.getAccuracy()
            X.7KT r3 = new X.7KT
            r3.<init>(r4, r5, r7, r9)
            r2.A0H(r3)
            return
        L_0x0b31:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager r0 = (com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager) r0
            java.lang.Object r2 = r1.A01
            android.location.Location r2 = (android.location.Location) r2
            java.lang.String r3 = r1.A02
            X.08M r0 = r0.A05
            double r4 = r2.getLatitude()
            double r6 = r2.getLongitude()
            float r8 = r2.getAccuracy()
            X.7KT r2 = new X.7KT
            r2.<init>(r3, r4, r6, r8)
            r0.A0H(r2)
            return
        L_0x0b52:
            java.lang.Object r3 = r1.A00
            X.2sq r3 = (X.C56962sq) r3
            java.lang.Object r2 = r1.A01
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r1 = r1.A02
            java.util.Map r0 = X.C73813g7.A0A()
            r3.A0L(r1, r0, r2)
            return
        L_0x0b64:
            java.lang.Object r5 = r1.A00
            X.7H0 r5 = (X.AnonymousClass7H0) r5
            java.lang.Object r4 = r1.A01
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            java.lang.String r3 = r1.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0b75, all -> 0x0b7b }
            r0 = 32000(0x7d00, double:1.581E-319)
            r4.get(r0, r2)     // Catch:{ Exception -> 0x0b75, all -> 0x0b7b }
        L_0x0b75:
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            return
        L_0x0b7b:
            r1 = move-exception
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            throw r1
        L_0x0b82:
            java.lang.Object r4 = r1.A00
            X.2iF r4 = (X.C50482iF) r4
            java.lang.String r3 = r1.A02
            java.lang.Object r2 = r1.A01
            X.4Dc r2 = (X.C84634Dc) r2
            X.1dV r1 = r4.A0A
            X.3Oj r0 = new X.3Oj
            r0.<init>(r4, r2, r3)
            r1.Bh4(r0)
            return
        L_0x0b97:
            java.lang.Object r2 = r1.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r2 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r2
            java.lang.String r8 = r1.A02
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = (android.content.Context) r1
            r4 = 1
            java.lang.String r9 = "gcm"
            X.2Ym r0 = r2.A0F
            if (r0 == 0) goto L_0x0c32
            X.1VX r3 = r0.A00
            r0 = 283(0x11b, float:3.97E-43)
            boolean r0 = r3.A0X(r0)
            if (r0 != 0) goto L_0x0bbb
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r3 = r3.A0X(r0)
            r0 = 0
            if (r3 == 0) goto L_0x0bbc
        L_0x0bbb:
            r0 = 1
        L_0x0bbc:
            r10 = 0
            if (r0 == 0) goto L_0x0c14
            X.2Ym r0 = r2.A0F
            if (r0 == 0) goto L_0x0c2b
            X.2f5 r5 = r0.A00()
        L_0x0bc7:
            X.2nG r0 = r2.A0G
            if (r0 == 0) goto L_0x0c24
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0bdd
            X.2nG r0 = r2.A0G
            if (r0 == 0) goto L_0x0c1d
            android.util.Pair r0 = r0.A00(r10, r4)
            java.lang.Object r10 = r0.second
            java.lang.String r10 = (java.lang.String) r10
        L_0x0bdd:
            X.3Wi r4 = r2.A1Y()
            r3 = 30
            X.3Zq r0 = new X.3Zq
            r0.<init>(r2, r3)
            r4.A0S(r0)
            X.30z r0 = r2.A1Z()
            X.8qC r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            X.30k r0 = (X.C613630k) r0
            X.5SO r0 = r0.A02()
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r0 = r0 + 2
            X.2a4 r4 = r2.A0H
            if (r4 == 0) goto L_0x0c16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.8JM r6 = new X.8JM
            r6.<init>(r1, r2)
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        L_0x0c14:
            r5 = r10
            goto L_0x0bc7
        L_0x0c16:
            java.lang.String r0 = "pushXmppMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c1d:
            java.lang.String r0 = "pushEncryptionHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c24:
            java.lang.String r0 = "pushEncryptionHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c2b:
            java.lang.String r0 = "mutedChatPushConfigHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c32:
            java.lang.String r0 = "mutedChatPushConfigHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c39:
            java.lang.Object r2 = r1.A00
            com.whatsapp.VoiceMessagingService r2 = (com.whatsapp.VoiceMessagingService) r2
            java.lang.Object r0 = r1.A01
            java.lang.String r5 = r1.A02
            X.33m r1 = r2.A01
            java.util.List r6 = java.util.Collections.singletonList(r0)
            r2 = 0
            r8 = 0
            r4 = r2
            r7 = r2
            r3 = r2
            r9 = r8
            r1.A0C(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0c51:
            java.lang.Object r3 = r1.A00
            X.7oM r3 = (X.C160817oM) r3
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            X.7Xz r0 = new X.7Xz
            r0.<init>(r2, r1)
            r3.A08(r0)
            return
        L_0x0c62:
            java.lang.Object r0 = r1.A00
            X.6Nw r0 = (X.C126436Nw) r0
            java.lang.Object r2 = r1.A01
            X.7yr r2 = (X.C166537yr) r2
            java.lang.String r1 = r1.A02
            X.85L r0 = r0.A00
            r0.BYm(r2, r1)
            return
        L_0x0c72:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c79:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117715sN.run():void");
    }

    public C117715sN(LifecycleCallback lifecycleCallback, AnonymousClass6CO r3) {
        this.A03 = 2;
        this.A01 = r3;
        this.A00 = lifecycleCallback;
        this.A02 = "ConnectionlessLifecycleHelper";
    }

    public C117715sN(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public C117715sN(LifecycleCallback lifecycleCallback, zzd zzd) {
        this.A03 = 3;
        this.A01 = zzd;
        this.A00 = lifecycleCallback;
        this.A02 = "ConnectionlessLifecycleHelper";
    }
}
