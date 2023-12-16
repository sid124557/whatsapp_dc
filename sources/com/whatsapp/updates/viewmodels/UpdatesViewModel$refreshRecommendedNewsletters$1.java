package com.whatsapp.updates.viewmodels;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshRecommendedNewsletters$1", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshRecommendedNewsletters$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshRecommendedNewsletters$1(UpdatesViewModel updatesViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = updatesViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if ((!r10.A00(r53.A00(), X.C56952sp.A06(r12, 4309))) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r55) {
        /*
            r54 = this;
            r1 = r54
            int r0 = r1.label
            if (r0 != 0) goto L_0x02e2
            X.C57682u2.A01(r55)
            java.lang.String r0 = "UpdatesViewModel/refresh recommended newsletters"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r1.this$0
            X.5o3 r7 = r0.A06
            X.495 r0 = r7.A00
            if (r0 == 0) goto L_0x0019
            r0.cancel()
        L_0x0019:
            X.2se r6 = r7.A04
            X.5UP r0 = r6.A0E
            boolean r0 = X.C18300x5.A1S(r0)
            r17 = 0
            if (r0 == 0) goto L_0x00b6
            X.2cj r2 = r6.A0H
            X.2YW r10 = r2.A06
            X.2g1 r0 = r2.A05
            r53 = r0
            java.lang.String r3 = r53.A00()
            X.1VX r12 = r2.A03
            r0 = 4271(0x10af, float:5.985E-42)
            long r0 = X.C56952sp.A06(r12, r0)
            boolean r0 = r10.A00(r3, r0)
            if (r0 == 0) goto L_0x00bd
            java.util.List r4 = r2.A07
            monitor-enter(r4)
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02df }
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            long r8 = r8 - r0
            long r0 = r2.A00     // Catch:{ all -> 0x02df }
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            X.3d3 r5 = X.C72023d3.A00     // Catch:{ all -> 0x02df }
        L_0x0052:
            java.util.List r1 = r2.A00(r5)     // Catch:{ all -> 0x02df }
            goto L_0x007d
        L_0x0057:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02df }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x02df }
        L_0x005f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x02df }
            X.4uY r1 = (X.C95804uY) r1     // Catch:{ all -> 0x02df }
            X.2ss r0 = r2.A02     // Catch:{ all -> 0x02df }
            X.31A r1 = X.C56982ss.A00(r0, r1)     // Catch:{ all -> 0x02df }
            boolean r0 = r1 instanceof X.AnonymousClass1RL     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x005f
            X.1RL r1 = (X.AnonymousClass1RL) r1     // Catch:{ all -> 0x02df }
            if (r1 == 0) goto L_0x005f
            r5.add(r1)     // Catch:{ all -> 0x02df }
            goto L_0x005f
        L_0x007d:
            monitor-exit(r4)
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecommendedCache Mem cache hit: "
            X.AnonymousClass000.A1H(r0, r3, r1)
            java.lang.String r0 = " Result(s)"
            X.C18260x0.A1J(r3, r0)
        L_0x0092:
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x00bd
            X.3Wi r4 = r6.A06
            r3 = 41
            X.3Zy r0 = new X.3Zy
            r0.<init>(r7, r3, r1)
            r4.A0S(r0)
            java.lang.String r3 = r53.A00()
            r0 = 4309(0x10d5, float:6.038E-42)
            long r0 = X.C56952sp.A06(r12, r0)
            boolean r0 = r10.A00(r3, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00bd
        L_0x00b6:
            r0 = r17
            r7.A00 = r0
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00bd:
            X.3RL r3 = new X.3RL
            r3.<init>(r2, r7)
            X.31C r0 = r6.A0D
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "NewsletterManager/getRecommendedNewsletters/not connected -> skipping"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.6nE r0 = new X.6nE
            r0.<init>()
            r3.BS5(r0)
            goto L_0x00b6
        L_0x00d8:
            r1 = 20
            int r0 = (int) r1
            r13 = 1
            java.lang.String r11 = "SUBSCRIBER_COUNT"
            r14 = 0
            X.6nD r1 = new X.6nD
            r8 = r1
            r9 = r3
            r10 = r17
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.2gy r0 = r6.A07
            r0.A02(r1)
            r17 = r1
            goto L_0x00b6
        L_0x00f1:
            java.lang.String r1 = r53.A00()
            r0 = 4271(0x10af, float:5.985E-42)
            long r15 = X.C56952sp.A06(r12, r0)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.2iu r3 = r10.A01
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "_timestamp"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r5)
            java.lang.String r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x0219
            long r13 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            if (r0 == 0) goto L_0x0219
            r8 = -1
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x012c
            X.2sH r0 = r10.A00
            long r8 = r0.A0D()
            long r8 = r8 - r13
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0219
        L_0x012c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "_data"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r3 = r3.A00(r0)
            if (r3 == 0) goto L_0x0219
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x021c }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x021c }
            r0.<init>(r3)     // Catch:{ all -> 0x021c }
            java.util.Iterator r16 = X.C57282tO.A01(r0)     // Catch:{ all -> 0x021c }
        L_0x0149:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x021c }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x021c }
            X.5Yx r5 = X.C95804uY.A03     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "jid"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            X.4uY r3 = r5.A01(r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0149
            X.31A r15 = new X.31A     // Catch:{ all -> 0x021c }
            r15.<init>((X.C95814uZ) r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "name"
            java.lang.String r28 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "name_id"
            long r37 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "desc"
            java.lang.String r29 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "desc_id"
            long r39 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "pic"
            java.lang.String r30 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "pic_id"
            long r41 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "pic_preview"
            java.lang.String r31 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "pic_preview_id"
            long r43 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "verified"
            int r11 = r0.getInt(r3)     // Catch:{ all -> 0x021c }
            X.21e[] r5 = X.C371621e.values()     // Catch:{ all -> 0x021c }
            int r9 = r5.length     // Catch:{ all -> 0x021c }
            r3 = 0
        L_0x01ab:
            if (r3 >= r9) goto L_0x0214
            r14 = r5[r3]     // Catch:{ all -> 0x021c }
            int r8 = r14.value     // Catch:{ all -> 0x021c }
            if (r8 != r11) goto L_0x01c0
            java.lang.String r3 = "membership"
            int r11 = r0.getInt(r3)     // Catch:{ all -> 0x021c }
            X.21q[] r5 = X.C372821q.values()     // Catch:{ all -> 0x021c }
            int r9 = r5.length     // Catch:{ all -> 0x021c }
            r3 = 0
            goto L_0x01c3
        L_0x01c0:
            int r3 = r3 + 1
            goto L_0x01ab
        L_0x01c3:
            if (r3 >= r9) goto L_0x020f
            r13 = r5[r3]     // Catch:{ all -> 0x021c }
            int r8 = r13.value     // Catch:{ all -> 0x021c }
            if (r8 != r11) goto L_0x020c
            java.lang.String r3 = "subscribers"
            long r47 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "creation"
            long r45 = r0.getLong(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "invite_code"
            java.lang.String r33 = r0.optString(r3)     // Catch:{ all -> 0x021c }
            X.21c r24 = X.C371421c.PUBLIC     // Catch:{ all -> 0x021c }
            X.21l r25 = X.C372321l.NOT_ENFORCED     // Catch:{ all -> 0x021c }
            r35 = -1
            r50 = 0
            r49 = 1
            java.util.ArrayList r34 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x021c }
            X.21r r23 = X.C372921r.DEFAULT     // Catch:{ all -> 0x021c }
            X.599 r22 = X.AnonymousClass599.DEFAULT     // Catch:{ all -> 0x021c }
            X.1RL r0 = new X.1RL     // Catch:{ all -> 0x021c }
            r27 = r17
            r32 = r17
            r52 = r50
            r18 = r0
            r19 = r17
            r20 = r15
            r21 = r13
            r26 = r14
            r51 = r50
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49, r50, r51, r52)     // Catch:{ all -> 0x021c }
            r1.add(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0149
        L_0x020c:
            int r3 = r3 + 1
            goto L_0x01c3
        L_0x020f:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x0214:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x0219:
            X.3d3 r1 = X.C72023d3.A00     // Catch:{ all -> 0x021c }
            goto L_0x0221
        L_0x021c:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)
        L_0x0221:
            boolean r5 = r1 instanceof X.AnonymousClass3Z0
            r0 = r5 ^ 1
            if (r0 == 0) goto L_0x02cb
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "RecommendedCache Deserialized successfully"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecommendedCache Deserialized a total of "
            X.AnonymousClass000.A1H(r0, r3, r1)
            java.lang.String r0 = " items"
            X.C18260x0.A1J(r3, r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r1.iterator()
        L_0x0244:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r5 = r9.next()
            r0 = r5
            X.31A r0 = (X.AnonymousClass31A) r0
            X.2ss r3 = r2.A02
            X.4uZ r0 = r0.A05()
            X.31A r0 = X.C56982ss.A00(r3, r0)
            if (r0 != 0) goto L_0x0244
            r8.add(r5)
            goto L_0x0244
        L_0x0261:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecommendedCache Found "
            X.C18260x0.A19(r0, r3, r8)
            java.lang.String r0 = " items not in memory cache"
            X.C18260x0.A1J(r3, r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x0273:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0289
            java.lang.Object r5 = r8.next()
            X.31A r5 = (X.AnonymousClass31A) r5
            X.2ss r3 = r2.A02
            X.4uZ r0 = r5.A05()
            r3.A0H(r5, r0)
            goto L_0x0273
        L_0x0289:
            monitor-enter(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "RecommendedCache Mem cache populated: "
            X.AnonymousClass000.A1H(r0, r3, r1)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = " Result(s)"
            X.C18260x0.A1J(r3, r0)     // Catch:{ all -> 0x02df }
            r4.clear()     // Catch:{ all -> 0x02df }
            r8 = 0
            r2.A00 = r8     // Catch:{ all -> 0x02df }
            java.util.ArrayList r5 = X.C73783g4.A0c(r1)     // Catch:{ all -> 0x02df }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x02df }
        L_0x02a7:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x02df }
            X.1RL r0 = (X.AnonymousClass1RL) r0     // Catch:{ all -> 0x02df }
            X.4uY r0 = r0.A0I()     // Catch:{ all -> 0x02df }
            r5.add(r0)     // Catch:{ all -> 0x02df }
            goto L_0x02a7
        L_0x02bb:
            r4.addAll(r5)     // Catch:{ all -> 0x02df }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02df }
            r2.A00 = r8     // Catch:{ all -> 0x02df }
            monitor-exit(r4)
            java.util.List r1 = r2.A00(r1)
            goto L_0x0092
        L_0x02cb:
            java.lang.Throwable r3 = X.AnonymousClass3Z9.A00(r1)
            if (r3 == 0) goto L_0x02d6
            java.lang.String r0 = "RecommendedCache Failed to deserialize"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x02d6:
            X.3d3 r0 = X.C72023d3.A00
            if (r5 == 0) goto L_0x02db
            r1 = r0
        L_0x02db:
            java.util.Collection r1 = (java.util.Collection) r1
            goto L_0x0092
        L_0x02df:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x02e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshRecommendedNewsletters$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new UpdatesViewModel$refreshRecommendedNewsletters$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new UpdatesViewModel$refreshRecommendedNewsletters$1(this.this$0, (C84814Du) obj2));
    }
}
