package X;

/* renamed from: X.2gS  reason: invalid class name and case insensitive filesystem */
public final class C49392gS {
    public final C44252Vg A00;
    public final AnonymousClass2ND A01;
    public final C29431io A02;
    public final C183538qC A03;

    public final void A00(C30401mO r8) {
        C162457s7.A0J(r8, 0);
        AnonymousClass2ND r4 = this.A01;
        r4.A01.BkP(new C71593cM((Object) this.A00, (Object) r8, (Object) r4, (Object) new C80073xe(r8, this), 22));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C30401mO r7) {
        /*
            r6 = this;
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.2Vg r0 = r6.A00
            X.3ZF r1 = r7.A01
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0010:
            X.3dV r0 = r0.A00
            X.4Fq r5 = r0.A04()
            android.content.ContentValues r4 = X.C18280x3.A09()     // Catch:{ all -> 0x0047 }
            X.C624134x.A0H(r4, r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "call_log_row_id"
            long r0 = r1.A05()     // Catch:{ all -> 0x0047 }
            X.2sg r3 = X.AnonymousClass3H0.A02(r4, r5, r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "message_call_log"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_CALL_LOG_MESSAGE"
            long r3 = r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x0047 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog/insert error, rowId="
            java.lang.String r0 = X.C624134x.A0C(r7, r0, r1)     // Catch:{ all -> 0x0047 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r5.close()
            return
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49392gS.A01(X.1mO):void");
    }

    public C49392gS(C44252Vg r2, AnonymousClass2ND r3, C29431io r4, C183538qC r5) {
        C18260x0.A0Q(r4, r2);
        C162457s7.A0J(r5, 4);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
