package X;

/* renamed from: X.5OW  reason: invalid class name */
public class AnonymousClass5OW {
    public final AnonymousClass5G8 A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final C56362rr A03;
    public final C55622qe A04;
    public final AnonymousClass5ND A05;
    public final AnonymousClass1R1 A06;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass3ZH r11) {
        /*
            r10 = this;
            java.lang.String r0 = "conversation-qpl-annotations/logTypeOfChat"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5ND r0 = r10.A05
            X.5oc r2 = new X.5oc
            r2.<init>(r10, r11)
            X.316 r5 = r0.A01
            X.8JP r1 = r5.A0C
            X.2ck r0 = r5.A0A
            int r0 = r0.A07
            r1.BKd(r2, r0)
            X.4uZ r7 = X.AnonymousClass3ZH.A01(r11)
            if (r7 == 0) goto L_0x00da
            java.lang.String r0 = "conversation-qpl-annotations/logIsPinned"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1R1 r0 = r10.A06
            X.2sa r0 = r0.A0L(r7)
            if (r0 == 0) goto L_0x0032
            boolean r2 = r0.A0H
            java.lang.String r1 = "is_pinned_chat"
            r0 = 0
            r5.A0D(r1, r2, r0)
        L_0x0032:
            java.lang.String r0 = "conversation-qpl-annotations/logIsFirstChatOpen"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5G8 r3 = r10.A00
            monitor-enter(r3)
            java.util.Set r2 = r3.A00     // Catch:{ all -> 0x00d7 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0046
            r2.add(r7)     // Catch:{ all -> 0x00d7 }
            goto L_0x0060
        L_0x0046:
            int r1 = r2.size()     // Catch:{ all -> 0x00d7 }
            r6 = 3
            r0 = 100
            if (r0 != r1) goto L_0x0057
            boolean r0 = r2.contains(r7)     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x005e
            r6 = 4
            goto L_0x005e
        L_0x0057:
            boolean r0 = r2.add(r7)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x005e
            r6 = 1
        L_0x005e:
            monitor-exit(r3)
            goto L_0x0062
        L_0x0060:
            monitor-exit(r3)
            r6 = 2
        L_0x0062:
            java.lang.String r4 = "is_first_chat_open_after_start"
            java.lang.String r3 = "is_first_chat_open"
            r1 = 1
            r2 = 0
            if (r6 == r1) goto L_0x00d3
            r0 = 2
            if (r6 == r0) goto L_0x00cc
            r0 = 3
            if (r6 != r0) goto L_0x0076
            r5.A0D(r3, r2, r2)
        L_0x0073:
            r5.A0D(r4, r2, r2)
        L_0x0076:
            java.lang.String r0 = "conversation-qpl-annotations/logHasUnreadMessages"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2ss r1 = r10.A01
            int r0 = r1.A03(r7)
            if (r0 <= 0) goto L_0x0084
            r2 = 1
        L_0x0084:
            java.lang.String r0 = "has_unread_messages"
            r6 = 0
            r5.A0D(r0, r2, r6)
            java.lang.String r0 = "conversation-qpl-annotations/logTimeOfLastMessage"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            long r1 = r1.A09(r7)
            long r3 = X.AnonymousClass0x9.A05(r1)
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00b2
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00b2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r7.toMinutes(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = "less_1_minute"
        L_0x00ad:
            java.lang.String r0 = "time_of_last_message"
            r5.A0C(r0, r6, r1)
        L_0x00b2:
            return
        L_0x00b3:
            long r1 = r7.toHours(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            java.lang.String r1 = "less_1_hour"
            goto L_0x00ad
        L_0x00be:
            long r1 = r7.toDays(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = "less_1_day"
            goto L_0x00ad
        L_0x00c9:
            java.lang.String r1 = "more_1_day"
            goto L_0x00ad
        L_0x00cc:
            r5.A0D(r3, r1, r2)
            r5.A0D(r4, r1, r2)
            goto L_0x0076
        L_0x00d3:
            r5.A0D(r3, r1, r2)
            goto L_0x0073
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OW.A00(X.3ZH):void");
    }

    public AnonymousClass5OW(AnonymousClass5G8 r1, C56982ss r2, C56892sj r3, C56362rr r4, C55622qe r5, AnonymousClass5ND r6, AnonymousClass1R1 r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
    }
}
