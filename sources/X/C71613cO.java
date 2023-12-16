package X;

import android.view.View;

/* renamed from: X.3cO  reason: invalid class name and case insensitive filesystem */
public class C71613cO implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C71613cO(C88674aZ r2, C109665ez r3, C84764Dp r4, C52722lw r5) {
        this.A05 = 12;
        this.A00 = r5;
        this.A04 = "status_fragment";
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        if (r5.A0C.A0D(r1) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        if (r0.equals(r10) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x034b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x034c, code lost:
        X.AnonymousClass2A8.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x057c;
                case 1: goto L_0x01e0;
                case 2: goto L_0x010d;
                case 3: goto L_0x0566;
                case 4: goto L_0x0531;
                case 5: goto L_0x03c0;
                case 6: goto L_0x03aa;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x00ad;
                case 10: goto L_0x038e;
                case 11: goto L_0x0350;
                case 12: goto L_0x0073;
                case 13: goto L_0x0272;
                case 14: goto L_0x0030;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A01
            X.7pg r4 = (X.C161447pg) r4
            java.lang.Object r1 = r3.A02
            java.lang.Object r5 = r3.A03
            X.4DL r5 = (X.AnonymousClass4DL) r5
            r0 = 4
            X.C162457s7.A0J(r5, r0)
            int r2 = r1.hashCode()
            X.1iz r0 = r4.A0A
            r1 = 105(0x69, float:1.47E-43)
            X.316 r0 = r0.A03
            r0.A07(r2, r1)
            java.lang.String r4 = "XMPP not connected"
            r3 = 0
            r1 = 1
            X.2ln r0 = new X.2ln
            r0.<init>(r4, r3, r1)
            r5.BSz(r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r2 = r3.A00
            X.5Xa r2 = (X.C105945Xa) r2
            java.lang.String r1 = "status_fragment"
            java.lang.Object r5 = r3.A01
            X.5JT r5 = (X.AnonymousClass5JT) r5
            java.lang.Object r4 = r3.A02
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            java.lang.Object r3 = r3.A03
            X.4aZ r3 = (X.C88674aZ) r3
            r0 = 4
            X.C162457s7.A0J(r3, r0)
            X.5PU r0 = r2.A03
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x002f
            java.lang.Object r2 = r0.get()
            X.66g r2 = (X.C1228966g) r2
            if (r2 == 0) goto L_0x002f
            X.0GC r1 = r2.B6S()
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            int r0 = r1.compareTo(r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x002f
            X.30n r1 = r5.A02
            android.content.Context r0 = r5.A00
            r1.A03(r0, r4, r3, r2)
            return
        L_0x0073:
            java.lang.Object r0 = r3.A00
            X.2lw r0 = (X.C52722lw) r0
            java.lang.String r1 = r3.A04
            java.lang.Object r5 = r3.A01
            X.4Dp r5 = (X.C84764Dp) r5
            java.lang.Object r4 = r3.A02
            X.5ez r4 = (X.C109665ez) r4
            java.lang.Object r3 = r3.A03
            X.4aZ r3 = (X.C88674aZ) r3
            X.5PU r0 = r0.A02
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x002f
            java.lang.Object r2 = r0.get()
            X.66g r2 = (X.C1228966g) r2
            if (r2 == 0) goto L_0x002f
            X.0GC r1 = r2.B6S()
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            int r0 = r1.compareTo(r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x002f
            r5.Boz(r4, r3, r2)
            return
        L_0x00ad:
            java.lang.Object r5 = r3.A00
            com.whatsapp.spamreport.ReportSpamDialogFragmentOld r5 = (com.whatsapp.spamreport.ReportSpamDialogFragmentOld) r5
            java.lang.Object r2 = r3.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            java.lang.String r7 = r3.A04
            java.lang.Object r4 = r3.A02
            java.lang.Object r3 = r3.A03
            X.4uZ r6 = r2.A0H
            X.1fJ r6 = (X.C27991fJ) r6
            X.2ss r0 = r5.A0B
            int r1 = r0.A06(r6)
            r0 = 3
            if (r1 != r0) goto L_0x00fe
            X.2so r0 = r5.A03
            X.1fJ r1 = r0.A01(r6)
            if (r1 != 0) goto L_0x00f5
            int r0 = r2.A03
            r2 = 1
            if (r0 == r2) goto L_0x00e5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReportSpamDialogFragmentOld/nullParent/"
            X.C18260x0.A1Q(r1, r0, r6)
            X.2qk r1 = r5.A00
            java.lang.String r0 = "ReportSpamDialogFragmentOld/nullParent"
            r1.A0A(r0, r2, r7)
        L_0x00e5:
            X.2sj r0 = r5.A0C
            boolean r0 = r0.A0D(r6)
        L_0x00eb:
            if (r0 == 0) goto L_0x002f
        L_0x00ed:
            X.3Wi r1 = r5.A01
            r0 = 45
            X.C69263Wi.A05(r1, r4, r3, r0)
            return
        L_0x00f5:
            X.2sj r0 = r5.A0C
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x00ed
            goto L_0x00e5
        L_0x00fe:
            X.2sj r0 = r5.A0C
            boolean r0 = r0.A0H(r6)
            if (r0 == 0) goto L_0x002f
            X.2ss r0 = r5.A0B
            boolean r0 = r0.A0R(r6)
            goto L_0x00eb
        L_0x010d:
            java.lang.Object r7 = r3.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r7 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r7
            java.lang.Object r5 = r3.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.String r4 = r3.A04
            java.lang.Object r10 = r3.A02
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r2 = r3.A03
            X.2qz r1 = r7.A05
            r0 = 0
            X.34x r5 = X.C55832qz.A01(r5, r1, r4, r0)
            if (r5 == 0) goto L_0x002f
            X.2W0 r3 = r7.A04
            long r0 = r5.A1L
            java.lang.Integer r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r0.equals(r10)
            r13 = 1
            if (r0 == 0) goto L_0x0138
        L_0x0137:
            r13 = 0
        L_0x0138:
            long r0 = r5.A1L
            X.3dV r4 = r3.A00
            X.4Fq r12 = r4.A04()
            android.content.ContentValues r11 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0613 }
            X.C18270x1.A0a(r11, r0)     // Catch:{ all -> 0x0613 }
            java.lang.String r4 = "rating"
            r11.put(r4, r10)     // Catch:{ all -> 0x0613 }
            r4 = r12
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x0613 }
            X.2sg r9 = r4.A03     // Catch:{ all -> 0x0613 }
            java.lang.String r8 = "message_rating"
            r6 = 5
            java.lang.String r4 = "INSERT_MESSAGE_RATING_SQL"
            long r8 = r9.A0C(r8, r4, r11, r6)     // Catch:{ all -> 0x0613 }
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r4)
            java.lang.String r0 = "MessageRatingStore/insertOrUpdateMessageRating/inserted row should have same messageRowId"
            X.C626936e.A0F(r1, r0)     // Catch:{ all -> 0x0613 }
            r12.close()
            com.whatsapp.jid.UserJid r0 = r5.A0o()
            java.lang.String r11 = X.C627336j.A07(r0)
            X.2Fe r9 = r7.A02
            boolean r6 = r5 instanceof X.AnonymousClass4FG
            if (r6 == 0) goto L_0x01de
            r0 = r5
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            java.lang.String r8 = r0.A05
        L_0x0181:
            long r0 = r5.A1L
            java.lang.Integer r0 = r3.A00(r0)
            boolean r4 = X.AnonymousClass000.A1W(r0)
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.4pZ r0 = X.C93924pZ.A00
            if (r2 != r0) goto L_0x0195
            r1 = 1
        L_0x0195:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            X.1a4 r1 = new X.1a4
            r1.<init>()
            r1.A05 = r11
            r1.A02 = r3
            r1.A03 = r0
            if (r10 == 0) goto L_0x01b0
            java.lang.Long r0 = X.C18310x6.A0g(r10)
            r1.A04 = r0
        L_0x01b0:
            r1.A01 = r2
            r1.A06 = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A00 = r0
            X.4FV r0 = r9.A00
            r0.BhA(r1)
            X.3Lv r7 = r7.A03
            if (r6 == 0) goto L_0x002f
            X.302 r6 = r7.A1d
            long r1 = r5.A1L
            r3 = 0
            r8 = 0
            r9 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r3 = X.AnonymousClass001.A1W(r0)
            java.lang.String r0 = "TemplateMessageStore/removeCsatTrigger/parent message row must be set"
            X.C626936e.A0E(r3, r0)
            X.3dV r0 = r6.A01
            X.4Fq r4 = r0.A04()
            goto L_0x05cf
        L_0x01de:
            r8 = 0
            goto L_0x0181
        L_0x01e0:
            java.lang.Object r0 = r3.A00
            X.0sA r0 = (X.C15910sA) r0
            java.lang.Object r5 = r3.A01
            X.4GS r5 = (X.AnonymousClass4GS) r5
            java.lang.Object r2 = r3.A02
            X.5Ts r2 = (X.C105135Ts) r2
            java.lang.String r6 = r3.A04
            java.lang.Object r3 = r3.A03
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r7 = 0
            r4 = 1
            X.0O9 r0 = r0.getLifecycle()
            X.08A r0 = (X.AnonymousClass08A) r0
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.DESTROYED
            if (r1 == r0) goto L_0x002f
            X.2oU r0 = r2.A06
            android.content.res.Resources r2 = X.C54292oU.A00(r0)
            r1 = 2131886270(0x7f1200be, float:1.9407114E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = X.C18320x8.A0b(r2, r6, r0, r7, r1)
            X.C162457s7.A0D(r2)
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r6 = r5.BGj(r2, r1, r0)
            X.5fd r6 = (X.C110065fd) r6
            X.4ab r0 = r6.A03
            X.6FH r8 = r0.A0J
            r0 = 2131433805(0x7f0b194d, float:1.8489406E38)
            android.widget.TextView r5 = X.AnonymousClass002.A09(r8, r0)
            r0 = 0
            r5.setCompoundDrawablesWithIntrinsicBounds(r3, r0, r0, r0)
            r4 = 16
            float r1 = (float) r4
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r5.setCompoundDrawablePadding(r0)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r3 = (int) r1
            int r2 = r8.getPaddingTop()
            int r1 = r8.getPaddingRight()
            int r0 = r8.getPaddingBottom()
            r8.setPadding(r3, r2, r1, r0)
            int r2 = r5.getPaddingTop()
            int r1 = r5.getPaddingRight()
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r7, r2, r1, r0)
            r5.setGravity(r4)
            r6.A01()
            return
        L_0x0272:
            java.lang.Object r10 = r3.A00
            X.5YA r10 = (X.AnonymousClass5YA) r10
            java.lang.Object r9 = r3.A01
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r14 = r3.A02
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r11 = r3.A03
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.String r13 = r3.A04
            r0 = 4
            X.C162457s7.A0J(r13, r0)
            java.lang.String r12 = X.AnonymousClass36X.A02()
            X.57P r8 = new X.57P
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.8qC r0 = r10.A0H
            java.lang.Object r5 = r0.get()
            X.2r9 r5 = (X.C55932r9) r5
            r7 = 1
            X.8qC r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.2ZB r0 = (X.AnonymousClass2ZB) r0
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_debug_session_id"
            X.C18270x1.A0j(r1, r0, r12)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest called for session: "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = " with message "
            r3.append(r0)
            java.util.ArrayList r2 = X.C73783g4.A0d(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x02c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02d3
            X.C624134x.A0Z(r2, r1)
            goto L_0x02c9
        L_0x02d3:
            java.lang.String r0 = X.AnonymousClass000.A0R(r2, r3)
            X.C106245Ye.A00(r0)
            boolean r0 = X.AnonymousClass36X.A09(r14)
            if (r0 == 0) goto L_0x02eb
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest skip for audio status"
            X.C106245Ye.A00(r0)
            r1 = -4
            r0 = 0
            r8.A03(r0, r12, r1, r7)
            return
        L_0x02eb:
            X.8qC r0 = r5.A0C
            java.lang.Object r0 = r0.get()
            X.2f8 r0 = (X.C48582f8) r0
            r0.A00(r12)
            X.8qC r0 = r5.A0B
            java.lang.Object r6 = r0.get()
            X.30J r6 = (X.AnonymousClass30J) r6
            java.util.ArrayList r2 = X.C73783g4.A0d(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x0306:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0310
            X.C624134x.A0Z(r2, r1)
            goto L_0x0306
        L_0x0310:
            X.3dV r0 = r6.A00
            X.4Fq r4 = r0.A04()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0349 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0349 }
            android.database.sqlite.SQLiteDatabase r3 = r0.A00     // Catch:{ all -> 0x0349 }
            r3.beginTransaction()     // Catch:{ all -> 0x0349 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0349 }
        L_0x0324:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0349 }
            if (r0 == 0) goto L_0x0332
            long r0 = X.C18270x1.A02(r2)     // Catch:{ all -> 0x0349 }
            r6.A03(r12, r7, r0)     // Catch:{ all -> 0x0349 }
            goto L_0x0324
        L_0x0332:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0349 }
            r3.endTransaction()     // Catch:{ all -> 0x0349 }
            r4.close()
            X.3YP r1 = new X.3YP
            r1.<init>(r8, r12)
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest start text status burning and eligibility"
            X.C106245Ye.A00(r0)
            r5.A00(r9, r1, r12, r14)
            return
        L_0x0349:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x034b }
        L_0x034b:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r4, r0)
            throw r1
        L_0x0350:
            java.lang.Object r2 = r3.A00
            X.2zx r2 = (X.C61252zx) r2
            java.lang.Object r7 = r3.A01
            X.3EF r7 = (X.AnonymousClass3EF) r7
            java.lang.Object r6 = r3.A02
            X.2gR r6 = (X.C49382gR) r6
            java.lang.Object r5 = r3.A03
            X.39C r5 = (X.AnonymousClass39C) r5
            java.lang.String r4 = r3.A04
            X.2xz r0 = r7.A08
            java.lang.String r3 = X.C380125b.A00(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommerceCustomBloksRequest/Fetching bloks layout for flow["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "] & url["
            r1.append(r0)
            java.lang.String r2 = r2.A0A
            r1.append(r2)
            java.lang.String r0 = "]..."
            X.C18260x0.A1J(r1, r0)
            X.1Sw r1 = r7.A04
            X.3M1 r0 = new X.3M1
            r0.<init>(r6, r5, r7, r4)
            r1.A0F(r0, r2, r3)
            return
        L_0x038e:
            java.lang.Object r5 = r3.A00
            X.5Tp r5 = (X.C105105Tp) r5
            java.lang.Object r4 = r3.A01
            X.4BK r4 = (X.AnonymousClass4BK) r4
            java.lang.Object r2 = r3.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A03
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r3.A04
            X.5Im r1 = r4.BCw(r1, r0, r2)
            X.4UC r0 = r5.A05
            r0.A0G(r1)
            return
        L_0x03aa:
            java.lang.Object r5 = r3.A00
            com.whatsapp.notification.DirectReplyService r5 = (com.whatsapp.notification.DirectReplyService) r5
            java.lang.Object r4 = r3.A01
            X.3Ge r4 = (X.C65093Ge) r4
            java.lang.String r2 = r3.A04
            java.lang.Object r1 = r3.A02
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r0 = r3.A03
            android.content.Intent r0 = (android.content.Intent) r0
            com.whatsapp.notification.DirectReplyService.A01(r0, r1, r4, r5, r2)
            return
        L_0x03c0:
            java.lang.Object r4 = r3.A00
            X.4eX r4 = (X.C89634eX) r4
            java.lang.Object r2 = r3.A01
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Object r5 = r3.A02
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r9 = r3.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.String r12 = r3.A04
            r15 = 0
            X.C162457s7.A0J(r4, r15)
            r6 = 1
            r0 = 4
            X.C162457s7.A0J(r12, r0)
            java.util.List r0 = r4.A0U
            X.C162457s7.A0C(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x03e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0401
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.4uZ r0 = r0.A0H
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x03e8
            r7.add(r1)
            goto L_0x03e8
        L_0x0401:
            java.util.Iterator r1 = r7.iterator()
        L_0x0405:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0416
            X.3ZH r0 = X.C18310x6.A0R(r1)
            X.C162457s7.A0H(r0)
            r4.Ayk(r0)
            goto L_0x0405
        L_0x0416:
            android.content.Intent r3 = X.C18320x8.A07()
            int r0 = r2.size()
            long r0 = (long) r0
            java.lang.String r2 = "extra_invitees_count"
            android.content.Intent r1 = r3.putExtra(r2, r0)
            r0 = -1
            r4.setResult(r0, r1)
            java.util.ArrayList r11 = X.C73783g4.A0c(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x0431:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0443
            java.lang.Object r0 = r1.next()
            X.4x6 r0 = (X.C96854x6) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r11.add(r0)
            goto L_0x0431
        L_0x0443:
            X.33j r8 = r4.A0N
            r7 = 2131755014(0x7f100006, float:1.9140895E38)
            int r0 = r9.size()
            long r2 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r0 = r9.size()
            long r0 = (long) r0
            X.AnonymousClass000.A1Q(r6, r15, r0)
            java.lang.String r0 = r8.A0L(r6, r7, r2)
            X.C162457s7.A0D(r0)
            X.0df r10 = r4.getSupportFragmentManager()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r0)
            java.util.List r0 = r4.A0U
            X.C162457s7.A0C(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r0.iterator()
        L_0x0473:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04a6
            java.lang.Object r6 = r8.next()
            r7 = r6
            X.3ZH r7 = (X.AnonymousClass3ZH) r7
            java.util.ArrayList r2 = X.C73783g4.A0c(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x0488:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x049a
            java.lang.Object r0 = r1.next()
            X.4x6 r0 = (X.C96854x6) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x0488
        L_0x049a:
            X.4uZ r0 = r7.A0H
            boolean r0 = X.C73723fy.A0U(r2, r0)
            if (r0 == 0) goto L_0x0473
            r3.add(r6)
            goto L_0x0473
        L_0x04a6:
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r3.iterator()
        L_0x04ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04c4
            X.3ZH r1 = X.C18310x6.A0R(r2)
            X.5ZU r0 = r4.A0D
            java.lang.String r0 = X.C18300x5.A0h(r0, r1)
            if (r0 == 0) goto L_0x04ae
            r14.add(r0)
            goto L_0x04ae
        L_0x04c4:
            int r2 = r14.size()
            r13 = 1
            if (r2 == r13) goto L_0x0518
            r1 = 2
            if (r2 == r1) goto L_0x0524
            r0 = 3
            if (r2 == r0) goto L_0x0509
            X.33j r8 = r4.A0N
            r7 = 2131755015(0x7f100007, float:1.9140897E38)
            int r2 = r14.size()
            long r5 = (long) r2
            long r3 = (long) r0
            long r5 = r5 - r3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.util.List r1 = r14.subList(r15, r0)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C73723fy.A09(r0, r1)
            r2[r15] = r0
            int r0 = r14.size()
            long r0 = (long) r0
            long r0 = r0 - r3
            X.AnonymousClass000.A1Q(r2, r13, r0)
            java.lang.String r0 = r8.A0L(r2, r7, r5)
        L_0x04f8:
            X.C162457s7.A0D(r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r9)
            X.21J r0 = X.AnonymousClass21J.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.AnonymousClass27t.A00(r0, r1, r12, r11)
            X.AnonymousClass344.A01(r0, r10)
            return
        L_0x0509:
            r3 = 2131886391(0x7f120137, float:1.940736E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.C18280x3.A1M(r14, r2)
            java.lang.Object r0 = r14.get(r1)
            r2[r1] = r0
            goto L_0x052c
        L_0x0518:
            r3 = 2131886393(0x7f120139, float:1.9407364E38)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Object r0 = r14.get(r15)
            r2[r15] = r0
            goto L_0x052c
        L_0x0524:
            r3 = 2131886392(0x7f120138, float:1.9407362E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            X.C18280x3.A1M(r14, r2)
        L_0x052c:
            java.lang.String r0 = r4.getString(r3, r2)
            goto L_0x04f8
        L_0x0531:
            java.lang.String r0 = r3.A04
            java.lang.Object r4 = r3.A01
            X.4ea r4 = (X.C89654ea) r4
            java.lang.Object r2 = r3.A02
            X.4pV r2 = (X.C93884pV) r2
            java.lang.Object r1 = r3.A03
            X.4uZ r1 = (X.C95814uZ) r1
            if (r0 == 0) goto L_0x055a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x055a
            r0 = 2131895851(0x7f12262b, float:1.9426547E38)
        L_0x054a:
            java.lang.String r1 = X.C18290x4.A0l(r4, r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r1, r0)
            r0.show()
        L_0x0556:
            r4.BjL()
            return
        L_0x055a:
            X.2ss r0 = r2.A05
            boolean r0 = r0.A0L(r1)
            if (r0 == 0) goto L_0x0556
            r0 = 2131895953(0x7f122691, float:1.9426754E38)
            goto L_0x054a
        L_0x0566:
            java.lang.Object r5 = r3.A00
            X.67A r5 = (X.AnonymousClass67A) r5
            java.lang.String r4 = r3.A04
            java.lang.Object r0 = r3.A02
            java.lang.Object r2 = r3.A03
            X.34x r2 = (X.C624134x) r2
            java.lang.String r1 = "menu_options"
            java.lang.String r0 = r0.toString()
            r5.BlV(r2, r1, r4, r0)
            return
        L_0x057c:
            java.lang.Object r5 = r3.A00
            X.3Ls r5 = (X.C66513Ls) r5
            java.lang.Object r1 = r3.A01
            X.33j r1 = (X.C620733j) r1
            java.lang.Object r2 = r3.A02
            X.1VX r2 = (X.AnonymousClass1VX) r2
            java.lang.Object r4 = r3.A03
            X.3Wi r4 = (X.C69263Wi) r4
            java.lang.String r3 = r3.A04
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            java.lang.String r0 = r1.A07()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            r5.A0B(r2, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            boolean r0 = r5.A0F()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            if (r0 == 0) goto L_0x05ab
            r1 = 0
            X.3aH r0 = new X.3aH     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            r0.<init>(r5, r3, r1, r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            r4.A0S(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            r5.A0A(r2)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
        L_0x05ab:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            java.lang.String r0 = "webpageinfo/"
            r1.append(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            java.lang.String r0 = r5.A06()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x05bc, all -> 0x05ca }
        L_0x05bc:
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = 1
            r1 = 0
            X.3aH r0 = new X.3aH
            r0.<init>(r5, r3, r1, r2)
            r4.A0S(r0)
            return
        L_0x05ca:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r1
        L_0x05cf:
            X.3Yo r3 = r4.Axl()     // Catch:{ all -> 0x060e }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A07(r9)     // Catch:{ all -> 0x0604 }
            java.lang.String r0 = "csat_trigger_expiration_ts"
            r10.putNull(r0)     // Catch:{ all -> 0x0604 }
            java.lang.String r12 = "message_row_id = ?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ all -> 0x0604 }
            X.AnonymousClass0x2.A1S(r14, r8, r1)     // Catch:{ all -> 0x0604 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0604 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x0604 }
            java.lang.String r11 = "message_template"
            java.lang.String r13 = "UPDATE_TEMPLATE_CSAT_TRIGGER_SQL"
            r9.A05(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0604 }
            r3.A00()     // Catch:{ all -> 0x0604 }
            r3.close()     // Catch:{ all -> 0x060e }
            r4.close()
            r6.A02(r5)
            X.2hU r1 = r7.A0q
            r0 = -1
            r1.A00(r5, r0)
            return
        L_0x0604:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0609 }
            goto L_0x060d
        L_0x0609:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x060e }
        L_0x060d:
            throw r1     // Catch:{ all -> 0x060e }
        L_0x060e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0618 }
            throw r1
        L_0x0613:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0618 }
            throw r1
        L_0x0618:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71613cO.run():void");
    }

    public C71613cO(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A03 = obj4;
    }

    public C71613cO(View.OnClickListener onClickListener, C88674aZ r3, AnonymousClass5JT r4, C105945Xa r5) {
        this.A05 = 14;
        this.A00 = r5;
        this.A04 = "status_fragment";
        this.A01 = r4;
        this.A02 = onClickListener;
        this.A03 = r3;
    }
}
