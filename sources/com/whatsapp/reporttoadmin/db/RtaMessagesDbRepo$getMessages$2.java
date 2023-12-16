package com.whatsapp.reporttoadmin.db;

import X.AnonymousClass0QU;
import X.AnonymousClass2Rk;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2", f = "RtaMessagesDbRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtaMessagesDbRepo$getMessages$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass0QU $cancellationSignal;
    public final /* synthetic */ C27991fJ $groupJid;
    public int label;
    public final /* synthetic */ AnonymousClass2Rk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtaMessagesDbRepo$getMessages$2(AnonymousClass0QU r2, C27991fJ r3, AnonymousClass2Rk r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r4;
        this.$groupJid = r3;
        this.$cancellationSignal = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0167, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x016a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r19
            int r0 = r10.label
            if (r0 != 0) goto L_0x016b
            X.C57682u2.A01(r20)
            X.2Rk r0 = r10.this$0
            java.util.List r0 = r0.A04
            java.util.ArrayList r4 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
            r6 = 0
            r2 = 0
        L_0x0017:
            boolean r0 = r3.hasNext()
            r9 = 1
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            if (r2 >= 0) goto L_0x002b
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x002b:
            java.lang.String[] r0 = X.AnonymousClass0x7.A1a(r0, r6)
            X.C18280x3.A1Q(r0, r2, r9)
            java.util.List r0 = X.AnonymousClass8UF.A0o(r0)
            r4.add(r0)
            r2 = r1
            goto L_0x0017
        L_0x003b:
            java.util.List[] r0 = new java.util.List[r6]
            java.lang.Object[] r1 = r4.toArray(r0)
            r5 = 0
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.2Rk r0 = r10.this$0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r0.A03
            X.4GK r8 = r0.get()
            X.2Rk r0 = r10.this$0
            r18 = r0
            X.1fJ r11 = r10.$groupJid
            X.0QU r7 = r10.$cancellationSignal
            r0 = 487(0x1e7, float:6.82E-43)
            X.3ct r3 = new X.3ct     // Catch:{ all -> 0x0164 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0164 }
        L_0x0061:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0140
            java.lang.Object r13 = r3.next()     // Catch:{ all -> 0x0164 }
            java.util.List[] r13 = (java.util.List[]) r13     // Catch:{ all -> 0x0164 }
            X.C162457s7.A0H(r13)     // Catch:{ all -> 0x0164 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0164 }
            int r1 = r13.length     // Catch:{ all -> 0x0164 }
            r2 = 0
        L_0x0076:
            if (r2 >= r1) goto L_0x0083
            r0 = r13[r2]     // Catch:{ all -> 0x0164 }
            X.C162457s7.A0H(r0)     // Catch:{ all -> 0x0164 }
            X.C73743g0.A0W(r0, r12)     // Catch:{ all -> 0x0164 }
            int r2 = r2 + 1
            goto L_0x0076
        L_0x0083:
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0164 }
            java.lang.Object[] r12 = r12.toArray(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x0164 }
            r0 = r18
            X.2sm r0 = r0.A01     // Catch:{ all -> 0x0164 }
            X.C56922sm.A02(r0, r11, r2, r6)     // Catch:{ all -> 0x0164 }
            java.lang.Object[] r12 = X.C73713fx.A06(r12, r2)     // Catch:{ all -> 0x0164 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "( values  (\""
            r15.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r14 = "MESSAGE_KEY_ID"
            r15.append(r14)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "\", \""
            r15.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "MESSAGE_INDEX"
            r15.append(r2)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "\"),"
            r15.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "(?,?)"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = ","
            X.C18310x6.A1G(r0, r1, r15)     // Catch:{ all -> 0x0164 }
            java.lang.String r13 = ")"
            java.lang.String r15 = X.AnonymousClass000.A0X(r13, r15)     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "SELECT DISTINCT "
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = X.AnonymousClass2C5.A01     // Catch:{ all -> 0x0164 }
            X.AnonymousClass0x2.A1O(r1, r0)     // Catch:{ all -> 0x0164 }
            r1.append(r15)     // Catch:{ all -> 0x0164 }
            java.lang.String r15 = " LEFT JOIN "
            r1.append(r15)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "message_edit_info"
            X.C18300x5.A1P(r1, r0)     // Catch:{ all -> 0x0164 }
            X.C18300x5.A1O(r1, r14)     // Catch:{ all -> 0x0164 }
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "original_key_id"
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            r1.append(r15)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "available_message_view"
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = " ON ("
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "available_message_view.key_id = "
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            r1.append(r14)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = " OR "
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "available_message_view._id = message_row_id"
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            X.AnonymousClass0x2.A1P(r1, r13)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "chat_row_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "message_type NOT IN ('8', '10', '7', '15', '19', '64')"
            X.C18320x8.A1L(r1, r0)     // Catch:{ all -> 0x0164 }
            r1.append(r2)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = " ASC"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0164 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0164 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0164 }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "GET_ALL_REPORTED_TO_ADMIN_MESSAGES_FOR_JID_START_SQL"
            android.database.Cursor r0 = r1.A0D(r7, r2, r0, r12)     // Catch:{ all -> 0x0164 }
            r4.add(r0)     // Catch:{ all -> 0x0164 }
            goto L_0x0061
        L_0x0140:
            r8.close()
            X.2Rk r0 = r10.this$0
            X.2ga r3 = r0.A02
            long r1 = X.C18310x6.A0A(r16)
            java.lang.String r0 = "ReportToAdminStore/getReportedMessagesForJid"
            r3.A02(r0, r1)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0163
            android.database.Cursor[] r0 = new android.database.Cursor[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            android.database.Cursor[] r0 = (android.database.Cursor[]) r0
            android.database.MergeCursor r5 = new android.database.MergeCursor
            r5.<init>(r0)
        L_0x0163:
            return r5
        L_0x0164:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        AnonymousClass2Rk r3 = this.this$0;
        return new RtaMessagesDbRepo$getMessages$2(this.$cancellationSignal, this.$groupJid, r3, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
