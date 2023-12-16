package X;

/* renamed from: X.3cN  reason: invalid class name and case insensitive filesystem */
public class C71603cN implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C71603cN(C142486xH r2, C152777a6 r3, C162987t5 r4) {
        this.A04 = 0;
        this.A00 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05e7, code lost:
        r4 = X.C61102zi.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05ef, code lost:
        if (r4.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05f1, code lost:
        r3 = (X.C58212ut) r4.next();
        r3.A00.runOnUiThread(new X.C70193a6(r3, 28, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0b46, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b4a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0b4b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0b4c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0b4f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0c05, code lost:
        r7.BTD(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0c0a, code lost:
        if (r8 == null) goto L_0x0c30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0c0c, code lost:
        r2 = X.AnonymousClass001.A0o();
        r1 = X.AnonymousClass000.A0q(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0c18, code lost:
        if (r1.hasNext() == false) goto L_0x0c27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0c1a, code lost:
        X.AnonymousClass000.A1B(X.AnonymousClass0x2.A0W(r1), r2);
        r2.append(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0c27, code lost:
        r6.A02.A0A("ShopManager/requestShopMetadata", r5, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0c30, code lost:
        r6.A01.A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0c35, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x031e, code lost:
        r1 = new X.C25161a4();
        r1.A05 = r5;
        r1.A02 = r6;
        r1.A03 = r2;
        r1.A01 = null;
        r1.A06 = r7;
        r1.A00 = java.lang.Boolean.valueOf(r8);
        r4.A00.BhA(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0339, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:34:0x010a, B:359:0x0a42] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07d7  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r41 = this;
            r2 = r41
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0650;
                case 1: goto L_0x0638;
                case 2: goto L_0x0ae1;
                case 3: goto L_0x0bd0;
                case 4: goto L_0x0604;
                case 5: goto L_0x0aa1;
                case 6: goto L_0x0a84;
                case 7: goto L_0x0a66;
                case 8: goto L_0x04e8;
                case 9: goto L_0x0938;
                case 10: goto L_0x036b;
                case 11: goto L_0x0925;
                case 12: goto L_0x0912;
                case 13: goto L_0x0829;
                case 14: goto L_0x033c;
                case 15: goto L_0x02d8;
                case 16: goto L_0x028f;
                case 17: goto L_0x077f;
                case 18: goto L_0x0258;
                case 19: goto L_0x076d;
                case 20: goto L_0x0748;
                case 21: goto L_0x070d;
                case 22: goto L_0x06fb;
                case 23: goto L_0x021a;
                case 24: goto L_0x06df;
                case 25: goto L_0x00e5;
                case 26: goto L_0x00cb;
                case 27: goto L_0x003c;
                case 28: goto L_0x06c1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r2.A00
            X.3EF r4 = (X.AnonymousClass3EF) r4
            java.lang.Object r3 = r2.A01
            X.2gR r3 = (X.C49382gR) r3
            java.lang.Object r8 = r2.A02
            X.39C r8 = (X.AnonymousClass39C) r8
            java.lang.String r2 = r2.A03
            X.1Sw r1 = r4.A04
            java.lang.String r0 = r1.A00
            java.lang.String r7 = r1.A0E(r0)
            if (r7 == 0) goto L_0x06ac
            r3.A01(r7)
            if (r8 == 0) goto L_0x003b
            X.2qq r6 = r4.A07
            java.lang.String r5 = r8.A01
            X.2wc r1 = r4.A03
            r0 = 0
            X.2Uf r4 = r1.A00(r2, r0)
            long r2 = r8.A00
            boolean r1 = r8.A02
            X.32G r0 = new X.32G
            r0.<init>((java.lang.Object) r7, (long) r2, (boolean) r1)
            r6.A02(r4, r0, r5)
        L_0x003b:
            return
        L_0x003c:
            java.lang.Object r5 = r2.A00
            X.2pC r5 = (X.C54732pC) r5
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.util.Iterator r10 = r0.iterator()
        L_0x004e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r10.next()
            X.2p2 r0 = (X.C54632p2) r0
            int r7 = r5.A00
            X.2qk r2 = r0.A02
            java.lang.String r0 = com.whatsapp.util.Log.stackTraceStartPhrase()
            java.lang.StringBuilder r9 = X.C18330xA.A0A(r0)
            r9.append(r4)
            java.lang.String r8 = "\n"
            r9.append(r8)
            java.lang.String r0 = "Job anomaly detected [type: "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = "]\n"
            r9.append(r0)
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r3)
        L_0x007f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009b
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r6)
            java.lang.String r0 = X.C18310x6.A0q(r1)
            X.C18290x4.A1R(r9, r0)
            java.lang.String r0 = X.AnonymousClass0x9.A12(r1)
            r9.append(r0)
            r9.append(r8)
            goto L_0x007f
        L_0x009b:
            java.lang.String r0 = "### end stack trace"
            X.C18260x0.A1M(r9, r0)
            X.C615631i.A01()
            if (r2 == 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "job-anomaly-"
            r1.append(r0)
            r0 = 1
            if (r7 == r0) goto L_0x00c8
            r0 = 2
            if (r7 == r0) goto L_0x00c5
            r0 = 3
            if (r7 == r0) goto L_0x00c2
            java.lang.String r0 = "DELAYED_JOB"
        L_0x00b9:
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r0 = 0
            r2.A0A(r1, r0, r4)
            goto L_0x004e
        L_0x00c2:
            java.lang.String r0 = "FREQUENT_RUNNING_JOB"
            goto L_0x00b9
        L_0x00c5:
            java.lang.String r0 = "LONG_RUNNING_JOB"
            goto L_0x00b9
        L_0x00c8:
            java.lang.String r0 = "BLOCKED_QUEUE"
            goto L_0x00b9
        L_0x00cb:
            java.lang.Object r6 = r2.A00
            X.2cF r6 = (X.C46812cF) r6
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r5 = r2.A02
            X.3Yy r5 = (X.C69903Yy) r5
            java.lang.String r4 = r2.A03
            X.3Lc r2 = r6.A02     // Catch:{ IllegalStateException -> 0x0b15, Exception -> 0x003b }
            java.lang.Object r1 = r5.element     // Catch:{ IllegalStateException -> 0x0b15, Exception -> 0x003b }
            X.34x r1 = (X.C624134x) r1     // Catch:{ IllegalStateException -> 0x0b15, Exception -> 0x003b }
            r0 = 0
            r2.A00(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x0b15, Exception -> 0x003b }
            goto L_0x0b14
        L_0x00e5:
            java.lang.Object r5 = r2.A00
            X.30F r5 = (X.AnonymousClass30F) r5
            java.lang.String r3 = r2.A03
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r12 = r2.A02
            X.4uZ r12 = (X.C95814uZ) r12
            java.lang.String r0 = "scheduled-call/onScheduledCallCancelMessageAdded execute on worker thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qK r0 = r5.A08
            X.2i6 r6 = r0.A02(r1, r3)
            if (r6 == 0) goto L_0x003b
            long r2 = r6.A02
            X.3dV r0 = r0.A05
            X.4Fq r9 = r0.A04()
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0b46 }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x0b46 }
            java.lang.String r7 = "scheduled_calls"
            java.lang.String r4 = "creation_message_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r2)     // Catch:{ all -> 0x0b46 }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_SCHEDULED_CALL_BY_ROW_ID"
            int r0 = r8.A07(r7, r4, r0, r1)     // Catch:{ all -> 0x0b46 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "ScheduledCallsStore/deleteScheduledCallByRowID delete failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0b46 }
        L_0x0124:
            r9.close()
            r5.A00(r2)
            X.3Wi r4 = r5.A00
            r1 = 22
            X.3Zv r0 = new X.3Zv
            r0.<init>(r5, r2, r1)
            r4.A0S(r0)
            X.8qC r0 = r5.A0D
            java.lang.Object r1 = r0.get()
            X.2Pc r1 = (X.C42682Pc) r1
            X.35J r0 = r1.A03
            X.4uZ r13 = r6.A04
            X.2z0 r4 = X.AnonymousClass35J.A01(r13, r0)
            X.2sH r0 = r1.A01
            long r2 = r0.A0H()
            X.1nt r1 = new X.1nt
            r1.<init>(r4, r2)
            r1.A1J(r12)
            java.lang.String r10 = r6.A06
            r1.A1f(r10)
            X.3Lv r0 = r5.A07
            r0.A0V(r1)
            X.8qC r0 = r5.A0E
            java.lang.Object r7 = r0.get()
            X.2TF r7 = (X.AnonymousClass2TF) r7
            X.2sr r11 = r7.A01
            boolean r0 = r11.A0a(r12)
            if (r0 != 0) goto L_0x003b
            X.3Ex r2 = r7.A03
            X.3ZH r4 = r2.A0A(r13)
            android.content.Context r9 = r7.A00
            android.content.Intent r1 = X.C627736r.A0N(r9, r4)
            java.lang.String r0 = "fromNotification"
            r8 = 1
            android.content.Intent r3 = r1.putExtra(r0, r8)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 2
            android.app.PendingIntent r3 = X.C624735e.A00(r9, r0, r3, r1)
            java.lang.String r0 = "critical_app_alerts@1"
            X.0Ue r5 = new X.0Ue
            r5.<init>(r9, r0)
            r1 = 2131233341(0x7f080a3d, float:1.8082817E38)
            android.app.Notification r0 = r5.A07
            r0.icon = r1
            X.C18320x8.A0y(r9, r5)
            r5.A09 = r3
            r5.A0E(r8)
            X.5mM r1 = r7.A05
            X.5UX r0 = r7.A02
            android.graphics.Bitmap r6 = X.C107305b5.A01(r9, r0, r1, r4)
            X.0Ma r4 = new X.0Ma
            r4.<init>()
            r3 = 2131893302(0x7f121c36, float:1.9421377E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 0
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r10, r1, r0, r3)
            r4.A01 = r0
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r6)
            r4.A00 = r0
            X.0Of r8 = new X.0Of
            r8.<init>(r4)
            androidx.core.app.NotificationCompat$MessagingStyle r6 = new androidx.core.app.NotificationCompat$MessagingStyle
            r6.<init>(r8)
            X.5ZU r4 = r7.A04
            r3 = 1
            if (r12 != 0) goto L_0x020c
            r0 = 2131888111(0x7f1207ef, float:1.9410848E38)
            java.lang.String r2 = r9.getString(r0)
        L_0x01d3:
            boolean r0 = r11.A0a(r12)
            r4 = 0
            if (r0 == 0) goto L_0x0202
            r1 = 2131893301(0x7f121c35, float:1.9421375E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r10
        L_0x01e1:
            java.lang.String r3 = r9.getString(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            X.0Ti r0 = new X.0Ti
            r0.<init>(r8, r3, r1)
            r6.A08(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A01 = r0
            r5.A08(r6)
            X.33T r1 = r7.A07
            r0 = 58
            X.AnonymousClass33T.A03(r5, r1, r0)
            return
        L_0x0202:
            r1 = 2131893300(0x7f121c34, float:1.9421373E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r2, r4)
            r0[r3] = r10
            goto L_0x01e1
        L_0x020c:
            X.3ZH r2 = r2.A0A(r12)
            int r1 = r4.A0A(r13)
            r0 = 0
            java.lang.String r2 = r4.A0R(r2, r1, r0)
            goto L_0x01d3
        L_0x021a:
            java.lang.Object r3 = r2.A00
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.Object r7 = r2.A01
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.String r6 = r2.A03
            java.lang.Object r1 = r2.A02
            X.3Yy r1 = (X.C69903Yy) r1
            r0 = 2
            X.C162457s7.A0J(r6, r0)
            X.03q r5 = r3.A0Q()
            if (r5 == 0) goto L_0x003b
            X.2nh r4 = r3.A06
            if (r4 == 0) goto L_0x0b50
            java.lang.Object r3 = r1.element
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r1 = ";"
            X.44p r0 = X.C827044p.A00
            java.lang.String r2 = X.C73723fy.A0A(r1, r7, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sms:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.C162457s7.A0D(r0)
            r4.A00(r5, r0, r3, r6)
            return
        L_0x0258:
            java.lang.Object r8 = r2.A00
            X.4uZ r8 = (X.C95814uZ) r8
            java.lang.Object r7 = r2.A01
            com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver r7 = (com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver) r7
            java.lang.Object r3 = r2.A02
            X.34x r3 = (X.C624134x) r3
            java.lang.String r6 = r2.A03
            if (r8 == 0) goto L_0x003b
            X.2sd r1 = r7.A08
            if (r1 == 0) goto L_0x0b66
            X.2sH r0 = r7.A02
            if (r0 == 0) goto L_0x0b5e
            long r4 = r0.A0H()
            long r2 = r3.A1L
            X.2z0 r0 = X.C56832sd.A00(r8, r1)
            X.1nw r1 = new X.1nw
            r1.<init>(r0, r4)
            r1.A00 = r2
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r1.A01 = r6
            X.3Lv r0 = r7.A06
            if (r0 == 0) goto L_0x0b57
            r0.A08(r1)
            return
        L_0x028f:
            java.lang.Object r6 = r2.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r6 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r6
            java.lang.Object r5 = r2.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            X.2qz r1 = r6.A05
            r0 = 0
            X.34x r1 = X.C55832qz.A01(r5, r1, r4, r0)
            if (r1 == 0) goto L_0x003b
            com.whatsapp.jid.UserJid r0 = r1.A0o()
            java.lang.String r5 = X.C627336j.A07(r0)
            X.2Fe r4 = r6.A02
            boolean r0 = r1 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x02d6
            r0 = r1
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            java.lang.String r7 = r0.A05
        L_0x02bb:
            X.2W0 r2 = r6.A04
            long r0 = r1.A1L
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1W(r0)
            r1 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            X.4pZ r0 = X.C93924pZ.A00
            if (r3 == r0) goto L_0x02d1
            r1 = 2
        L_0x02d1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x031e
        L_0x02d6:
            r7 = 0
            goto L_0x02bb
        L_0x02d8:
            java.lang.Object r6 = r2.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r6 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r6
            java.lang.Object r5 = r2.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            X.2qz r1 = r6.A05
            r0 = 0
            X.34x r1 = X.C55832qz.A01(r5, r1, r4, r0)
            if (r1 == 0) goto L_0x003b
            com.whatsapp.jid.UserJid r0 = r1.A0o()
            java.lang.String r5 = X.C627336j.A07(r0)
            X.2Fe r4 = r6.A02
            boolean r0 = r1 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x033a
            r0 = r1
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            java.lang.String r7 = r0.A05
        L_0x0304:
            X.2W0 r2 = r6.A04
            long r0 = r1.A1L
            java.lang.Integer r0 = r2.A00(r0)
            boolean r8 = X.AnonymousClass000.A1W(r0)
            java.lang.Integer r6 = X.C18290x4.A0a()
            X.4pZ r1 = X.C93924pZ.A00
            r0 = 2
            if (r3 != r1) goto L_0x031a
            r0 = 1
        L_0x031a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x031e:
            r0 = 0
            X.1a4 r1 = new X.1a4
            r1.<init>()
            r1.A05 = r5
            r1.A02 = r6
            r1.A03 = r2
            r1.A01 = r0
            r1.A06 = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A00 = r0
            X.4FV r0 = r4.A00
            r0.BhA(r1)
            return
        L_0x033a:
            r7 = 0
            goto L_0x0304
        L_0x033c:
            java.lang.Object r5 = r2.A00
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r0 = r2.A01
            X.34x r0 = (X.C624134x) r0
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A02
            X.49d r3 = (X.C836249d) r3
            X.2z0 r2 = r0.A1J
            r1 = 2131434167(0x7f0b1ab7, float:1.849014E38)
            r0 = 2
            X.C162457s7.A0J(r2, r0)
            java.lang.Object r0 = r5.getTag(r1)
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "ConversationRowVideoUtils/fetchAndSetVideoDurationText: set duration to view"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.setText(r4)
            r3.BMK(r4)
            return
        L_0x036b:
            java.lang.Object r10 = r2.A00
            X.3Fe r10 = (X.C64833Fe) r10
            java.lang.Object r13 = r2.A01
            java.util.Set r13 = (java.util.Set) r13
            java.lang.String r15 = r2.A03
            java.lang.Object r9 = r2.A02
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9
            int r0 = r13.size()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.util.ArrayList r11 = X.AnonymousClass002.A0I(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.util.HashMap r18 = X.AnonymousClass001.A0t()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.util.Iterator r16 = r13.iterator()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r8 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0390:
            boolean r0 = r16.hasNext()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 == 0) goto L_0x04cc
            java.lang.String r0 = X.AnonymousClass001.A0m(r16)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            byte[] r1 = X.AnonymousClass0x7.A1X(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.1BN r0 = X.AnonymousClass1BN.DEFAULT_INSTANCE     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.1BN r0 = (X.AnonymousClass1BN) r0     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.String r7 = r0.url_     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r7 != 0) goto L_0x03b0
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest no url in request"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x0390
        L_0x03b0:
            boolean r12 = r0.includeHqThumbnail_     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.5Zz r1 = r10.A0D     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r0 = 1
            java.util.ArrayList r0 = r1.A05(r7, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 == 0) goto L_0x043c
            java.lang.Object r6 = r0.get(r8)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
        L_0x03c1:
            X.2s4 r0 = r10.A02     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.33j r14 = r10.A08     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r2 = 0
            if (r6 == 0) goto L_0x03de
            java.lang.String r3 = X.C106685Zz.A01(r6)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r4 != 0) goto L_0x03de
            X.3Ls r4 = X.C57782uC.A00(r3)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r4 == 0) goto L_0x03e8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r4, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
        L_0x03de:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest load result="
            r1.append(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x043e
        L_0x03e8:
            X.3Ls r5 = new X.3Ls     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r5.<init>(r0, r1, r3)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r4 = 0
            java.lang.String r0 = r14.A07()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            X.1VX r1 = r10.A0C     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            r5.A0B(r1, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            boolean r0 = r5.A0F()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            if (r0 == 0) goto L_0x0410
            X.8Tk r0 = X.C57782uC.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            monitor-enter(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            r0.put(r3, r5)     // Catch:{ all -> 0x040d }
            monitor-exit(r0)     // Catch:{ all -> 0x040d }
            r5.A0A(r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            r4 = 1
            goto L_0x0410
        L_0x040d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x040d }
            throw r1     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
        L_0x0410:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            java.lang.String r0 = "WebPageLoader/loadPage/"
            r1.append(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            java.lang.String r0 = r5.A06()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            r1.append(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            java.lang.String r0 = "; success="
            X.C18260x0.A1D(r0, r1, r4)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0426 }
            goto L_0x0430
        L_0x0426:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b6e }
            java.lang.String r0 = "WebPageLoader/loadPage/ex="
            X.C18260x0.A1Q(r1, r0, r3)     // Catch:{ all -> 0x0b6e }
        L_0x0430:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r4 == 0) goto L_0x03de
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r5, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x03de
        L_0x043c:
            r6 = 0
            goto L_0x03c1
        L_0x043e:
            boolean r0 = X.AnonymousClass000.A1W(r2)
            X.C18260x0.A1V(r1, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.3XA r5 = new X.3XA     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r5.<init>()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r11.add(r5)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r3 = 0
            if (r2 != 0) goto L_0x0451
            goto L_0x04be
        L_0x0451:
            java.lang.Object r4 = r2.first     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.3Ls r4 = (X.C66513Ls) r4     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.Object r0 = r2.second     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 == 0) goto L_0x0460
            int r20 = r20 + 1
            goto L_0x0462
        L_0x0460:
            int r21 = r21 + 1
        L_0x0462:
            byte[] r0 = r4.A0W     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 == 0) goto L_0x04b2
            if (r12 == 0) goto L_0x04b2
            X.1VX r2 = r10.A0C     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r1 = 3665(0xe51, float:5.136E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 == 0) goto L_0x04b2
            X.33c r1 = r10.A0E     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.3QB r0 = new X.3QB     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r23 = r0
            r24 = r4
            r25 = r5
            r26 = r10
            r27 = r7
            r28 = r6
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r1.A07(r4, r0, r8)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.4FS r12 = r10.A0J     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r0 = 3668(0xe54, float:5.14E-42)
            long r0 = X.C56952sp.A06(r2, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            java.lang.String r2 = "NonMessageDataRequestManager/handleLinkPreviewRequest/"
            java.lang.String r3 = X.AnonymousClass000.A0V(r2, r15, r3)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.3aa r2 = new X.3aa     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r23 = r2
            r24 = r5
            r25 = r4
            r26 = r7
            r27 = r6
            r28 = r8
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r12.Bkn(r2, r3, r0)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x0390
        L_0x04b2:
            X.23E r0 = X.AnonymousClass23E.SUCCESS     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.2vy r1 = X.C58882vy.A00(r4, r3, r7, r6)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.2NR r2 = new X.2NR     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r2.<init>(r1, r0, r7)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x04c7
        L_0x04be:
            int r22 = r22 + 1
            X.23E r0 = X.AnonymousClass23E.NOT_FOUND     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.2NR r2 = new X.2NR     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r2.<init>(r3, r0, r7)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
        L_0x04c7:
            r5.A05(r2)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x0390
        L_0x04cc:
            boolean r0 = r11.isEmpty()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            if (r0 != 0) goto L_0x003b
            X.1I2 r0 = new X.1I2     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r0.<init>(r11)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            X.3X7 r14 = new X.3X7     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r19 = r13
            r17 = r15
            r16 = r9
            r15 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            r0.A03(r14)     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            goto L_0x0b73
        L_0x04e8:
            java.lang.Object r0 = r2.A00
            X.1gI r0 = (X.AnonymousClass1gI) r0
            java.lang.Object r10 = r2.A01
            byte[] r10 = (byte[]) r10
            java.lang.Object r7 = r2.A02
            byte[] r7 = (byte[]) r7
            java.lang.String r11 = r2.A03
            X.1hv r3 = r0.A02
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x0bcd }
            java.lang.Object r4 = r0.remove(r11)     // Catch:{ all -> 0x0bcd }
            X.2NJ r4 = (X.AnonymousClass2NJ) r4     // Catch:{ all -> 0x0bcd }
            X.2Xh r1 = r3.A02     // Catch:{ all -> 0x0bcd }
            r2 = 0
            if (r4 == 0) goto L_0x050d
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0bcd }
        L_0x0508:
            r6 = 5
            r1.A00(r6, r11, r0)     // Catch:{ all -> 0x0bcd }
            goto L_0x050f
        L_0x050d:
            r0 = r2
            goto L_0x0508
        L_0x050f:
            if (r4 != 0) goto L_0x0513
            goto L_0x0b79
        L_0x0513:
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0bcd }
            int r9 = r10.length     // Catch:{ IllegalArgumentException -> 0x0bc0 }
            r5 = 44
            if (r9 < r5) goto L_0x0bb9
            r1 = 0
            r0 = 32
            byte[] r2 = java.util.Arrays.copyOfRange(r10, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0bc0 }
            byte[] r8 = java.util.Arrays.copyOfRange(r10, r0, r5)     // Catch:{ IllegalArgumentException -> 0x0bc0 }
            byte[] r9 = java.util.Arrays.copyOfRange(r10, r5, r9)     // Catch:{ IllegalArgumentException -> 0x0bc0 }
            byte[] r5 = r4.A02     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "link_code_pairing_key_bundle_encryption_key"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x0bcd }
            r0 = 32
            byte[] r1 = X.AnonymousClass31Q.A02(r5, r2, r1, r0)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x0bcd }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0bcd }
            javax.crypto.Cipher r1 = X.C18320x8.A0v()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0ba7 }
            javax.crypto.spec.IvParameterSpec r0 = X.C18330xA.A0D(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0ba7 }
            r8 = 2
            byte[] r2 = X.C18310x6.A1Y(r2, r0, r1, r9, r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0ba7 }
            int r0 = r2.length     // Catch:{ ParseException -> 0x0b96 }
            int r1 = r0 + -64
            r0 = 32
            byte[][] r2 = X.AnonymousClass36A.A08(r2, r0, r0, r1)     // Catch:{ ParseException -> 0x0b96 }
            r0 = 0
            r9 = r2[r0]     // Catch:{ all -> 0x0bcd }
            r0 = 1
            r1 = r2[r0]     // Catch:{ all -> 0x0bcd }
            r2 = r2[r8]     // Catch:{ all -> 0x0bcd }
            X.33n r0 = r3.A06     // Catch:{ all -> 0x0bcd }
            X.35n r0 = r0.A00     // Catch:{ all -> 0x0bcd }
            X.2KK r8 = r0.A04()     // Catch:{ all -> 0x0bcd }
            X.2e4 r0 = r8.A01     // Catch:{ all -> 0x0bcd }
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x0bcd }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0bcd }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x0bcd }
            if (r0 != 0) goto L_0x0584
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/primary identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0bcd }
            X.2fj r0 = r3.A03     // Catch:{ all -> 0x0bcd }
            r0.A01(r11)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0bcd }
            r3.A0A(r11, r0)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x0584:
            boolean r0 = java.util.Arrays.equals(r7, r9)     // Catch:{ all -> 0x0bcd }
            if (r0 != 0) goto L_0x059b
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/companion identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0bcd }
            X.2fj r0 = r3.A03     // Catch:{ all -> 0x0bcd }
            r0.A01(r11)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0bcd }
            r3.A0A(r11, r0)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x059b:
            X.2jv r1 = new X.2jv     // Catch:{ all -> 0x0bcd }
            r1.<init>(r9, r6)     // Catch:{ all -> 0x0bcd }
            X.2ew r0 = r8.A00     // Catch:{ all -> 0x0bcd }
            byte[] r1 = X.AnonymousClass36G.A08(r0, r1)     // Catch:{ all -> 0x0bcd }
            r0 = 3
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x0bcd }
            X.C18260x0.A0i(r5, r1, r2, r0)     // Catch:{ all -> 0x0bcd }
            byte[] r2 = X.AnonymousClass36A.A06(r0)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "adv_secret"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x0bcd }
            r0 = 32
            byte[] r13 = X.AnonymousClass31Q.A00(r2, r1, r0)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish done"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0bcd }
            byte[] r12 = r4.A01     // Catch:{ all -> 0x0bcd }
            java.lang.String r4 = r4.A00     // Catch:{ all -> 0x0bcd }
            r0 = 2
            byte[][] r5 = new byte[r0][]     // Catch:{ 23X -> 0x0b8c }
            r2 = 1
            byte[] r1 = new byte[r2]     // Catch:{ 23X -> 0x0b8c }
            r0 = 0
            r1[r0] = r6     // Catch:{ 23X -> 0x0b8c }
            byte[] r0 = X.AnonymousClass36A.A03(r1, r7, r5, r0, r2)     // Catch:{ 23X -> 0x0b8c }
            X.2jv r0 = X.AnonymousClass36G.A01(r0)     // Catch:{ 23X -> 0x0b8c }
            X.2e4 r8 = new X.2e4     // Catch:{ 23X -> 0x0b8c }
            r8.<init>(r0)     // Catch:{ 23X -> 0x0b8c }
            java.lang.Integer r10 = X.AnonymousClass32P.A01(r4)     // Catch:{ 23X -> 0x0b8c }
            X.239 r9 = X.AnonymousClass239.E2EE     // Catch:{ 23X -> 0x0b8c }
            X.2S3 r7 = new X.2S3     // Catch:{ 23X -> 0x0b8c }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ 23X -> 0x0b8c }
            monitor-exit(r3)
            java.util.Iterator r4 = X.C61102zi.A03(r3)
        L_0x05eb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r4.next()
            X.2ut r3 = (X.C58212ut) r3
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r2 = r3.A00
            r1 = 28
            X.3a6 r0 = new X.3a6
            r0.<init>(r3, r1, r7)
            r2.runOnUiThread(r0)
            goto L_0x05eb
        L_0x0604:
            java.lang.Object r3 = r2.A00
            X.3Oj r3 = (X.C67203Oj) r3
            java.lang.Object r0 = r2.A01
            X.2SI r0 = (X.AnonymousClass2SI) r0
            java.lang.String r4 = r2.A03
            java.lang.Object r7 = r2.A02
            X.4Dc r7 = (X.C84634Dc) r7
            X.2fE r2 = r0.A04
            X.2WN r1 = r0.A03
            int r0 = r0.A00
            if (r0 != 0) goto L_0x062f
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r1.A00
            X.5dg r1 = (X.C108865dg) r1
            if (r1 == 0) goto L_0x062f
            r1.A00 = r4
            r7.BTE(r1)
            X.2iF r0 = r3.A00
            X.0Qw r0 = r0.A01
            r0.A08(r4, r1)
            return
        L_0x062f:
            if (r2 == 0) goto L_0x003b
            java.util.Map r8 = r2.A00
            X.2iF r6 = r3.A00
            r5 = 0
            goto L_0x0c05
        L_0x0638:
            java.lang.Object r5 = r2.A00
            X.4b3 r5 = (X.C88944b3) r5
            java.lang.Object r3 = r2.A01
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r1 = r2.A03
            java.lang.Object r4 = r2.A02
            android.view.View r4 = (android.view.View) r4
            X.33i r0 = r5.A08
            android.content.ClipboardManager r2 = r0.A0C()
            if (r2 == 0) goto L_0x003b
            goto L_0x0c36
        L_0x0650:
            java.lang.Object r3 = r2.A00
            X.7t5 r3 = (X.C162987t5) r3
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "buildRenderersCompleted starts"
            r3.A0K(r0, r1)
            java.lang.Object r4 = r2.A02
            X.7a6 r4 = (X.C152777a6) r4
            r4.getClass()
            X.7yv r1 = r4.A0F
            X.7a6 r0 = r3.A10
            if (r0 == 0) goto L_0x0c87
            X.7a6 r0 = r3.A10
            X.7yv r0 = r0.A0F
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0c87
            r0 = 1
            r3.A0Z = r0
            java.lang.Object r0 = r2.A01
            X.6xH r0 = (X.C142486xH) r0
            r3.A0M = r0
            android.view.Surface r1 = r3.A0H
            if (r1 == 0) goto L_0x0687
            X.8LG r0 = r3.A0p
            boolean r0 = r0.useBlockingSetSurfaceExo2
            r3.A0H(r1, r0)
        L_0x0687:
            float r0 = r3.A01
            r3.A0B(r0)
            float r0 = r3.A00
            r3.A0A(r0)
            int r0 = r3.A02
            r3.A0C(r0)
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x06a8
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x003b
            X.7qS r0 = r3.A12
            X.7br r0 = r0.A01
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x003b
        L_0x06a8:
            r3.A08()
            return
        L_0x06ac:
            boolean r0 = r4 instanceof X.C34321ut
            if (r0 == 0) goto L_0x06be
            java.lang.String r0 = "Extensions bloks layout was not loaded"
        L_0x06b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            r3.A00(r0)
            r0 = 4
            r4.A01(r0)
            return
        L_0x06be:
            java.lang.String r0 = "Commerce bloks layout was not loaded"
            goto L_0x06b2
        L_0x06c1:
            java.lang.Object r1 = r2.A00
            X.3XT r1 = (X.AnonymousClass3XT) r1
            java.lang.Object r4 = r2.A01
            X.2Jg r4 = (X.C41182Jg) r4
            java.lang.String r3 = r2.A03
            java.lang.Object r2 = r2.A02
            java.util.Map r2 = (java.util.Map) r2
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            X.2XW r1 = r1.A02
            java.lang.String r0 = "address_message_validate"
            X.2m3 r0 = r1.A00(r4, r0)
            r0.A02(r3, r2)
            return
        L_0x06df:
            java.lang.Object r0 = r2.A00
            X.2Rc r0 = (X.C43182Rc) r0
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r1 = r2.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.2Rd r0 = r0.A02
            X.66R r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.2pB r0 = (X.C54722pB) r0
            r0.A02(r1, r1, r3, r4)
            return
        L_0x06fb:
            java.lang.Object r4 = r2.A00
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            java.lang.Object r3 = r2.A01
            X.1fK r3 = (X.C28001fK) r3
            java.lang.String r1 = r2.A03
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            com.whatsapp.group.newgroup.NewGroup.A0C(r4, r3, r1, r0)
            return
        L_0x070d:
            java.lang.Object r5 = r2.A00
            X.2Th r5 = (X.C43742Th) r5
            java.lang.String r1 = r2.A03
            java.lang.Object r4 = r2.A01
            java.lang.Object r3 = r2.A02
            r0 = 3
            X.C162457s7.A0J(r3, r0)
            android.app.Activity r7 = r5.A01
            X.AnonymousClass0x9.A1L(r7)
            r0 = r7
            X.4ea r0 = (X.C89654ea) r0
            android.view.View r0 = r0.A00
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            X.33i r9 = r5.A06
            X.0sA r7 = (X.C15910sA) r7
            r11 = 0
            X.4ab r8 = X.C88694ab.A01(r0, r1, r11)
            X.5fd r6 = new X.5fd
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = 2131894589(0x7f12213d, float:1.9423987E38)
            r1 = 45
            X.5f5 r0 = new X.5f5
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r3, (java.lang.Object) r4, (int) r1)
            r6.A04(r0, r2)
            r6.A01()
            return
        L_0x0748:
            java.lang.Object r0 = r2.A00
            X.2cV r0 = (X.C46972cV) r0
            java.lang.String r5 = r2.A03
            java.lang.Object r3 = r2.A01
            java.lang.Object r4 = r2.A02
            X.8qC r0 = r0.A06
            java.lang.Object r2 = r0.get()
            X.30F r2 = (X.AnonymousClass30F) r2
            java.lang.String r0 = "scheduled-call/onScheduledCallCancelMessageAdded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3dI r0 = r2.A0B
            r6 = 25
            X.3cN r1 = new X.3cN
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
        L_0x076d:
            java.lang.Object r4 = r2.A00
            X.4UA r4 = (X.AnonymousClass4UA) r4
            java.lang.String r3 = r2.A03
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r0 = r2.A02
            X.7aS r0 = (X.C152967aS) r0
            r4.A0I(r0, r1, r3)
            return
        L_0x077f:
            java.lang.Object r0 = r2.A00
            X.3ST r0 = (X.AnonymousClass3ST) r0
            java.lang.Object r8 = r2.A01
            X.2Pp r8 = (X.C42812Pp) r8
            java.lang.Object r7 = r2.A02
            X.1EU r7 = (X.AnonymousClass1EU) r7
            java.lang.String r4 = r2.A03
            X.2z0 r6 = r0.A0Q
            X.C162457s7.A0D(r6)
            X.2gW r5 = r8.A00
            int r0 = r7.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r3 = 0
            if (r0 == 0) goto L_0x07fb
            X.1ER r0 = r7.interactiveMessage_
            r1 = r0
            if (r0 != 0) goto L_0x07a6
            X.1ER r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x07a6:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x07fb
            if (r1 != 0) goto L_0x07b0
            X.1ER r1 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x07b0:
            X.1EF r1 = r1.contextInfo_
            if (r1 != 0) goto L_0x07b6
            X.1EF r1 = X.AnonymousClass1EF.DEFAULT_INSTANCE
        L_0x07b6:
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x07c1
            boolean r0 = r1.isForwarded_
            if (r0 == 0) goto L_0x07c1
            r3 = 1
        L_0x07c1:
            X.2Q6 r8 = r8.A02
            r1 = 0
            if (r3 == 0) goto L_0x07eb
            r0 = 0
        L_0x07c7:
            java.lang.String r12 = r5.A01(r6, r0)
            X.4uZ r9 = r6.A00
            int r0 = r5.A00(r9, r4, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L_0x07db
            com.whatsapp.jid.PhoneUserJid r9 = X.AnonymousClass32X.A00(r4)
        L_0x07db:
            r11 = 0
            r15 = 22
            X.4FS r0 = r8.A03
            X.3cD r7 = new X.3cD
            r14 = r11
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.BkM(r7)
            return
        L_0x07eb:
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x07f6
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            goto L_0x07c7
        L_0x07f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x07c7
        L_0x07fb:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CatalogNFMLoggingHelper/isForwarded: message with key=["
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = "] and catalog_message_id=["
            r2.append(r0)
            java.lang.String r0 = r6.A01
            X.C162457s7.A0C(r0)
            java.security.MessageDigest r1 = X.AnonymousClass0x7.A0t()
            byte[] r0 = X.C18290x4.A1b(r0)
            java.lang.String r0 = X.C18270x1.A0V(r1, r0)
            X.C162457s7.A0D(r0)
            r2.append(r0)
            java.lang.String r0 = "] is not interactive message or does not have context info"
            X.C18260x0.A1J(r2, r0)
            goto L_0x07c1
        L_0x0829:
            java.lang.Object r0 = r2.A00
            X.5mB r0 = (X.C113905mB) r0
            java.lang.Object r6 = r2.A01
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r3 = r2.A03
            java.lang.Object r5 = r2.A02
            X.21N r5 = (X.AnonymousClass21N) r5
            r0.A02()
            java.lang.String r2 = X.AnonymousClass0x9.A0v(r6, r3)
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            char[] r1 = new char[r0]
            r0 = 44
            r4 = 0
            r1[r4] = r0
            java.util.List r0 = X.C175728Zm.A0O(r2, r1)
            java.lang.String[] r7 = X.AnonymousClass0x7.A1b(r0)
            java.lang.Long r0 = X.C624334z.A04(r7, r4)
            java.lang.Long r12 = X.AnonymousClass0x2.A0T()
            if (r0 != 0) goto L_0x085c
            r0 = r12
        L_0x085c:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>(r0)
            r0 = 1
            java.lang.Long r0 = X.C624334z.A04(r7, r0)
            if (r0 != 0) goto L_0x086d
            r0 = r12
        L_0x086d:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong
            r10.<init>(r0)
            r0 = 2
            java.lang.Long r0 = X.C624334z.A04(r7, r0)
            if (r0 != 0) goto L_0x087e
            r0 = r12
        L_0x087e:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            r0 = 3
            java.lang.Long r0 = X.C624334z.A04(r7, r0)
            if (r0 != 0) goto L_0x088f
            r0 = r12
        L_0x088f:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>(r0)
            r0 = 4
            java.lang.Long r0 = X.C624334z.A04(r7, r0)
            if (r0 != 0) goto L_0x08a0
            r0 = r12
        L_0x08a0:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong
            r8.<init>(r0)
            r0 = 5
            java.lang.Long r0 = X.C624334z.A04(r7, r0)
            if (r0 == 0) goto L_0x08b1
            r12 = r0
        L_0x08b1:
            long r0 = r12.longValue()
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong
            r7.<init>(r0)
            int r0 = X.C18320x8.A02(r5, r4)
            switch(r0) {
                case 0: goto L_0x08c6;
                case 1: goto L_0x08c8;
                case 2: goto L_0x08ca;
                case 3: goto L_0x08cc;
                case 4: goto L_0x08ce;
                case 5: goto L_0x08d0;
                default: goto L_0x08c1;
            }
        L_0x08c1:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x08c6:
            r0 = r11
            goto L_0x08d1
        L_0x08c8:
            r0 = r10
            goto L_0x08d1
        L_0x08ca:
            r0 = r2
            goto L_0x08d1
        L_0x08cc:
            r0 = r9
            goto L_0x08d1
        L_0x08ce:
            r0 = r8
            goto L_0x08d1
        L_0x08d0:
            r0 = r7
        L_0x08d1:
            r0.incrementAndGet()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r0 = 6
            java.lang.Long[] r5 = new java.lang.Long[r0]
            long r0 = r11.get()
            X.AnonymousClass000.A1Q(r5, r4, r0)
            long r0 = r10.get()
            X.AnonymousClass001.A1Q(r5, r0)
            long r0 = r2.get()
            X.AnonymousClass0x2.A1U(r5, r0)
            long r0 = r9.get()
            X.AnonymousClass0x2.A1V(r5, r0)
            long r0 = r8.get()
            X.C18300x5.A1R(r5, r0)
            long r0 = r7.get()
            X.C18320x8.A1R(r5, r0)
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)
            X.C162457s7.A0D(r0)
            X.C18270x1.A0j(r6, r3, r0)
            return
        L_0x0912:
            java.lang.Object r5 = r2.A00
            X.30g r5 = (X.C613330g) r5
            java.lang.Object r4 = r2.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.String r3 = r2.A03
            java.lang.Object r1 = r2.A02
            X.0rw r1 = (X.C15790rw) r1
            r0 = 0
            r5.A07(r1, r4, r0, r3)
            return
        L_0x0925:
            java.lang.Object r5 = r2.A00
            X.2cp r5 = (X.C47172cp) r5
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A01
            X.23E r3 = (X.AnonymousClass23E) r3
            java.lang.Object r1 = r2.A02
            X.39M r1 = (X.AnonymousClass39M) r1
            r0 = 0
            r5.A00(r3, r1, r4, r0)
            return
        L_0x0938:
            java.lang.Object r6 = r2.A00
            X.3Et r6 = (X.C64743Et) r6
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            java.lang.String r0 = r2.A03
            java.lang.Object r4 = r2.A02
            X.39T r4 = (X.AnonymousClass39T) r4
            X.2rl r7 = r6.A0E
            X.C626936e.A06(r0)
            X.1mE r3 = r7.A03(r5, r0)
            X.1nO r3 = (X.AnonymousClass1nO) r3
            if (r3 == 0) goto L_0x0a60
            int r0 = r3.A03
            r2 = 2
            if (r0 == 0) goto L_0x0967
            if (r0 != r2) goto L_0x0a50
            int r2 = r3.A01
            X.3Mh r1 = r6.A01
            X.1Ek r0 = X.C66663Mh.A1K
            int r0 = r1.A03(r0)
            if (r2 <= r0) goto L_0x0a50
            r2 = 3
        L_0x0967:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/activate sync phase "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for "
            X.C18260x0.A1R(r1, r0, r5)
            X.2qw r1 = r6.A0D
            X.C626936e.A00()
            android.content.ContentValues r11 = X.AnonymousClass0x9.A06()
            r17 = 1
            java.lang.String r8 = java.lang.String.valueOf(r17)
            java.lang.String r0 = "status"
            r11.put(r0, r8)
            X.1RE r10 = r1.A02
            X.4Fq r0 = r10.A0C()
            X.3Yo r16 = r0.Axl()     // Catch:{ all -> 0x0a41 }
            r8 = r0
            X.3H0 r8 = (X.AnonymousClass3H0) r8     // Catch:{ all -> 0x0a37 }
            X.2sg r8 = r8.A03     // Catch:{ all -> 0x0a37 }
            java.lang.String r20 = "msg_history_sync"
            java.lang.String r21 = "device_id=?  AND sync_type=?  AND status=?"
            java.lang.String[] r23 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0a37 }
            java.lang.String r12 = r5.getRawString()     // Catch:{ all -> 0x0a37 }
            r9 = 0
            r23[r9] = r12     // Catch:{ all -> 0x0a37 }
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0a37 }
            r23[r17] = r15     // Catch:{ all -> 0x0a37 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0a37 }
            r9 = 2
            r23[r9] = r12     // Catch:{ all -> 0x0a37 }
            java.lang.String r22 = "MessageHistorySyncStore.activateSync"
            r18 = r8
            r19 = r11
            int r14 = r18.A05(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0a37 }
            if (r14 != 0) goto L_0x0a2d
            X.4GK r13 = r10.get()     // Catch:{ all -> 0x0a37 }
            r8 = r13
            X.3H0 r8 = (X.AnonymousClass3H0) r8     // Catch:{ all -> 0x09fd }
            X.2sg r12 = r8.A03     // Catch:{ all -> 0x09fd }
            java.lang.String r11 = "SELECT status FROM msg_history_sync WHERE device_id=? AND sync_type=? LIMIT 1"
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x09fd }
            java.lang.String r8 = r5.getRawString()     // Catch:{ all -> 0x09fd }
            r10 = 0
            r9[r10] = r8     // Catch:{ all -> 0x09fd }
            r9[r17] = r15     // Catch:{ all -> 0x09fd }
            java.lang.String r8 = "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID_AND_SYNC_TYPE"
            android.database.Cursor r9 = r12.A0E(r11, r8, r9)     // Catch:{ all -> 0x09fd }
            int r8 = r9.getCount()     // Catch:{ all -> 0x09f1 }
            if (r8 <= 0) goto L_0x09e8
            r10 = 1
        L_0x09e8:
            r9.close()     // Catch:{ all -> 0x09fd }
            r13.close()     // Catch:{ all -> 0x0a37 }
            if (r10 != 0) goto L_0x0a2d
            goto L_0x0a07
        L_0x09f1:
            r2 = move-exception
            if (r9 == 0) goto L_0x09fc
            r9.close()     // Catch:{ all -> 0x09f8 }
            goto L_0x09fc
        L_0x09f8:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x09fd }
        L_0x09fc:
            throw r2     // Catch:{ all -> 0x09fd }
        L_0x09fd:
            r2 = move-exception
            r13.close()     // Catch:{ all -> 0x0a02 }
            goto L_0x0a06
        L_0x0a02:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0a37 }
        L_0x0a06:
            throw r2     // Catch:{ all -> 0x0a37 }
        L_0x0a07:
            r23 = -1
            r21 = -1
            r22 = 2
            r18 = 0
            X.2o9 r8 = new X.2o9     // Catch:{ all -> 0x0a37 }
            r27 = r23
            r29 = r23
            r31 = r23
            r33 = r23
            r35 = r23
            r37 = r23
            r39 = r23
            r19 = r5
            r20 = r2
            r25 = r23
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r37, r39)     // Catch:{ all -> 0x0a37 }
            r1.A02(r8)     // Catch:{ all -> 0x0a37 }
        L_0x0a2d:
            r16.A00()     // Catch:{ all -> 0x0a37 }
            r1.A01(r0, r5)     // Catch:{ all -> 0x0a37 }
            r16.close()     // Catch:{ all -> 0x0a41 }
            goto L_0x0a46
        L_0x0a37:
            r2 = move-exception
            r16.close()     // Catch:{ all -> 0x0a3c }
            goto L_0x0a40
        L_0x0a3c:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0a41 }
        L_0x0a40:
            throw r2     // Catch:{ all -> 0x0a41 }
        L_0x0a41:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0b4b }
            throw r1
        L_0x0a46:
            r0.close()
            if (r14 <= 0) goto L_0x0a50
            X.2Vn r0 = r6.A03
            r0.A00()
        L_0x0a50:
            long r0 = r3.A1L
            X.C626936e.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.A06(r0)
        L_0x0a60:
            X.33S r0 = r6.A0G
            r0.A01(r4)
            return
        L_0x0a66:
            java.lang.Object r1 = r2.A00
            X.4ea r1 = (X.C89654ea) r1
            java.lang.Object r0 = r2.A01
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r4 = r2.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.String r3 = r2.A03
            r0.setText(r3)
            X.3Wi r2 = r1.A05
            X.33i r1 = r1.A08
            X.39w r0 = new X.39w
            r0.<init>(r2, r1, r3)
            r4.setOnLongClickListener(r0)
            return
        L_0x0a84:
            java.lang.Object r5 = r2.A00
            com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel r5 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel) r5
            java.lang.String r4 = r2.A03
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Object r2 = r2.A02
            X.6vh r2 = (X.C141516vh) r2
            r0 = 3
            X.C162457s7.A0J(r2, r0)
            X.5QD r1 = r5.A04
            X.8Ys r0 = new X.8Ys
            r0.<init>(r2, r5, r3)
            r1.A00(r3, r4, r0)
            return
        L_0x0aa1:
            java.lang.Object r6 = r2.A00
            X.2sq r6 = (X.C56962sq) r6
            java.lang.Object r1 = r2.A01
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r7 = r2.A03
            java.lang.Object r5 = r2.A02
            monitor-enter(r6)
            java.util.Set r0 = r6.A0d     // Catch:{ all -> 0x0ade }
            r0.clear()     // Catch:{ all -> 0x0ade }
            r0.addAll(r1)     // Catch:{ all -> 0x0ade }
            X.1v9 r0 = r6.A0C     // Catch:{ all -> 0x0ade }
            r0.A00(r1)     // Catch:{ all -> 0x0ade }
            X.33p r4 = r6.A0K     // Catch:{ all -> 0x0ade }
            X.2sH r0 = r6.A0J     // Catch:{ all -> 0x0ade }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r0 = "block_list_receive_time"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x0ade }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0ade }
            java.lang.String r0 = "block_list_v2_dhash"
            X.C18270x1.A0j(r1, r0, r7)     // Catch:{ all -> 0x0ade }
            X.3Wi r1 = r6.A05     // Catch:{ all -> 0x0ade }
            r0 = 17
            X.C69263Wi.A09(r1, r6, r5, r0)     // Catch:{ all -> 0x0ade }
            monitor-exit(r6)
            return
        L_0x0ade:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0ae1:
            java.lang.Object r6 = r2.A00
            X.2x1 r6 = (X.C59502x1) r6
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r2.A02
            X.4CI r4 = (X.AnonymousClass4CI) r4
            java.lang.String r2 = r2.A03
            X.33g r3 = r6.A01
            X.5dt r0 = r3.A02(r5)
            if (r0 == 0) goto L_0x0b10
            boolean r0 = r0.A0X
            if (r0 == 0) goto L_0x0b10
            X.2VK r1 = r6.A00
            X.3Dz r0 = new X.3Dz
            r0.<init>(r4, r6, r5, r2)
            X.1LY r2 = r1.A00(r0, r5, r2)
            r1 = 0
            X.4KA r0 = new X.4KA
            r0.<init>(r2, r1)
            r3.A06(r0, r5)
            return
        L_0x0b10:
            r4.onSuccess()
            return
        L_0x0b14:
            return
        L_0x0b15:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Mismatch after delayed comparison: message_type="
            r1.append(r0)
            java.lang.Object r0 = r5.element
            X.34x r0 = (X.C624134x) r0
            if (r0 == 0) goto L_0x0b44
            byte r0 = r0.A1I
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
        L_0x0b2b:
            r1.append(r0)
            java.lang.String r0 = ", stack="
            r1.append(r0)
            X.C18320x8.A1N(r1, r3)
            java.lang.String r0 = ", prev="
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r4, r1)
            X.2qk r1 = r6.A00
            java.lang.String r0 = "fmessage-database-mismatch"
            r1.A09(r0, r2, r3)
            return
        L_0x0b44:
            r0 = 0
            goto L_0x0b2b
        L_0x0b46:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0b4b }
            throw r1
        L_0x0b4b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0b50:
            java.lang.String r0 = "inviteContactUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b57:
            java.lang.String r0 = "coreMessageStoreWrapper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b5e:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b66:
            java.lang.String r0 = "systemMessageFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b6e:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
            throw r0     // Catch:{ 6u5 | IllegalArgumentException -> 0x0b74 }
        L_0x0b73:
            return
        L_0x0b74:
            r1 = move-exception
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest error in parsing request"
            goto L_0x0c83
        L_0x0b79:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish ref not exists, ref="
            X.C18260x0.A0r(r0, r11, r1)     // Catch:{ all -> 0x0bcd }
            X.2Vl r1 = r3.A01     // Catch:{ all -> 0x0bcd }
            r0 = 4
            r1.A00(r0, r11, r2)     // Catch:{ all -> 0x0bcd }
            r3.A09(r11, r2)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x0b8c:
            r1 = move-exception
            java.lang.String r0 = "CompanionPairingData/createFromCodePairing invalidCompanionIdentity "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bcd }
            r3.A09(r11, r4)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x0b96:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeUtil/decodeLinkCodePairingWrappedKeyBundle split fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/invalid linkCodePairingWrappedKeyBundleDecrypted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0bcd }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0bcd }
            r3.A0A(r11, r0)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x0ba7:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/decryption fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bcd }
            X.2Vl r2 = r3.A01     // Catch:{ all -> 0x0bcd }
            java.lang.String r1 = r4.A00     // Catch:{ all -> 0x0bcd }
            r0 = 3
            r2.A00(r0, r11, r1)     // Catch:{ all -> 0x0bcd }
            r3.A0A(r11, r1)     // Catch:{ all -> 0x0bcd }
            goto L_0x0bc6
        L_0x0bb9:
            java.lang.String r0 = "LinkCodePairingWrappedKeyBundleData input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x0bc0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0bc0 }
        L_0x0bc0:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bcd }
        L_0x0bc6:
            monitor-exit(r3)
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/onCompanionFinish companionPairingData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0bcd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0bd0:
            java.lang.Object r5 = r2.A00
            X.3Oj r5 = (X.C67203Oj) r5
            java.lang.Object r3 = r2.A01
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r4 = r2.A03
            java.lang.Object r7 = r2.A02
            X.4Dc r7 = (X.C84634Dc) r7
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to fetch metadata: "
            r1.append(r0)
            java.lang.String r0 = r3.getLocalizedMessage()
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass0x7.A0f()
            X.32n r0 = new X.32n
            r0.<init>((java.lang.String) r2)
            r8.put(r1, r0)
            X.2iF r6 = r5.A00
            r5 = 1
        L_0x0c05:
            java.lang.String r3 = "ShopManager/requestShopMetadata"
            r7.BTD(r8)
            if (r8 == 0) goto L_0x0c30
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.util.Iterator r1 = X.AnonymousClass000.A0q(r8)
        L_0x0c14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c27
            java.lang.Object r0 = X.AnonymousClass0x2.A0W(r1)
            X.AnonymousClass000.A1B(r0, r2)
            r0 = 10
            r2.append(r0)
            goto L_0x0c14
        L_0x0c27:
            X.2qk r1 = r6.A02
            java.lang.String r0 = r2.toString()
            r1.A0A(r3, r5, r0)
        L_0x0c30:
            X.0Qw r0 = r6.A01
            r0.A05(r4)
            return
        L_0x0c36:
            java.lang.String r0 = "wapay"
            boolean r0 = r0.equals(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            if (r0 == 0) goto L_0x0c65
            java.lang.String r1 = r3.getLastPathSegment()     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r0 = 2131891728(0x7f121610, float:1.9418184E38)
        L_0x0c46:
            android.util.Pair r3 = X.C18290x4.A0K(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            java.lang.Object r0 = r3.first     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r2.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r2 = 0
            r5.A04 = r2     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r4.invalidate()     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            X.3Wi r1 = r5.A07     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            int r0 = X.C18290x4.A03(r3)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r1.A0H(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            goto L_0x0c7f
        L_0x0c65:
            java.lang.String r0 = "tel"
            boolean r0 = r0.equals(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            if (r0 == 0) goto L_0x0c79
            java.lang.String r1 = r3.getSchemeSpecificPart()     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r0 = 2131892531(0x7f121933, float:1.9419813E38)
            r5.A00()     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            goto L_0x0c46
        L_0x0c79:
            java.lang.String r1 = r5.A0A     // Catch:{ NullPointerException | SecurityException -> 0x0c80 }
            r0 = 2131890409(0x7f1210e9, float:1.941551E38)
            goto L_0x0c46
        L_0x0c7f:
            return
        L_0x0c80:
            r1 = move-exception
            java.lang.String r0 = "linktouchablespan/copy/"
        L_0x0c83:
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0c87:
            java.lang.String r1 = "skipped buildRenderersCompleted because of non-matching request"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r3.A0K(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71603cN.run():void");
    }

    public C71603cN(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj3;
    }

    public C71603cN(C47172cp r2, AnonymousClass23E r3, AnonymousClass39M r4, String str) {
        this.A04 = 11;
        this.A00 = r2;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
    }
}
