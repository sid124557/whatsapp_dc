package com.whatsapp.chatinfo;

import X.AnonymousClass10c;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.EventsViewModel$queryAndUpdateEvents$1", f = "EventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventsViewModel$queryAndUpdateEvents$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass10c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$queryAndUpdateEvents$1(AnonymousClass10c r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0173, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            if (r0 != 0) goto L_0x0174
            X.C57682u2.A01(r15)
            X.10c r0 = r14.this$0
            X.2ss r2 = r0.A02
            X.4uZ r1 = r0.A06
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C162457s7.A0K(r1, r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r2 = r2.A06(r1)
            r1 = 1
            X.10c r0 = r14.this$0
            if (r2 != r1) goto L_0x00bd
            X.2so r1 = r0.A00
            X.4uZ r0 = r0.A06
            X.1fJ r0 = (X.C27991fJ) r0
            java.util.Set r1 = r1.A05(r0)
            X.10c r0 = r14.this$0
            X.2pV r7 = r0.A05
            java.util.ArrayList r6 = X.C73783g4.A0c(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            X.2mC r0 = X.AnonymousClass0x7.A0O(r1)
            com.whatsapp.jid.GroupJid r0 = r0.A02
            r6.add(r0)
            goto L_0x0034
        L_0x0044:
            X.2xj r5 = r7.A03
            int r4 = r6.size()
            java.lang.String[] r3 = new java.lang.String[r4]
            r2 = 0
        L_0x004d:
            if (r2 >= r4) goto L_0x005d
            X.2sm r1 = r5.A00
            java.lang.Object r0 = r6.get(r2)
            X.4uZ r0 = (X.C95814uZ) r0
            X.C56922sm.A02(r1, r0, r3, r2)
            int r2 = r2 + 1
            goto L_0x004d
        L_0x005d:
            X.3dV r0 = r5.A01
            X.4GK r4 = r0.get()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x016d }
            X.3ct r9 = X.C71923ct.A00(r3)     // Catch:{ all -> 0x016d }
        L_0x006b:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x00b5
            java.lang.String[] r8 = X.C71923ct.A01(r9)     // Catch:{ all -> 0x016d }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x016d }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x016d }
            int r1 = r6.size()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x016d }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = ","
            java.lang.String r2 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "\n        SELECT DISTINCT message_row_id\n        FROM message_event\n        WHERE\n            chat_row_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x016d }
            r1.append(r2)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = ")\n        ORDER BY start_time\n        DESC\n        LIMIT 1000\n        "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x016d }
            java.lang.String r1 = X.C830345w.A08(r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHATS_QUERY_ID"
            android.database.Cursor r2 = r3.A0E(r1, r0, r8)     // Catch:{ all -> 0x016d }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0166 }
            X.C59932xj.A00(r2, r5)     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x006b
            r2.close()     // Catch:{ all -> 0x016d }
            goto L_0x006b
        L_0x00b5:
            r4.close()
            java.util.List r13 = r7.A01(r5)
            goto L_0x00fa
        L_0x00bd:
            X.2pV r5 = r0.A05
            X.4uZ r1 = r0.A06
            X.2xj r4 = r5.A03
            r2 = 0
            X.2sm r0 = r4.A00
            long r0 = r0.A07(r1)
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()
            X.AnonymousClass0x2.A1S(r3, r2, r0)
            X.3dV r0 = r4.A01
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x016d }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x016d }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\nORDER BY start_time\nDESC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r2 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x016d }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0166 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0166 }
            X.C59932xj.A00(r2, r0)     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x00f3
            r2.close()     // Catch:{ all -> 0x016d }
        L_0x00f3:
            r4.close()
            java.util.List r13 = r5.A01(r0)
        L_0x00fa:
            X.10c r5 = r14.this$0
            X.4Gp r4 = r5.A08
        L_0x00fe:
            java.lang.Object r6 = r4.getValue()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r12 = r13.iterator()
            r11 = 0
        L_0x010b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r7 = r12.next()
            X.1mU r7 = (X.C30461mU) r7
            X.2pV r10 = r5.A05
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            long r0 = r7.A00
            X.2sH r2 = r10.A01
            long r8 = r2.A0D()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r2)
            if (r0 == 0) goto L_0x014d
            if (r11 != 0) goto L_0x0141
            X.2oU r1 = r5.A01
            r0 = 2131887638(0x7f120616, float:1.9409889E38)
            java.lang.String r1 = X.C54292oU.A04(r1, r0)
            X.1NL r0 = new X.1NL
            r0.<init>(r1)
            r3.add(r0)
            r11 = 1
        L_0x0141:
            X.20Q r2 = X.AnonymousClass20Q.PAST
        L_0x0143:
            r1 = 0
        L_0x0144:
            X.1NM r0 = new X.1NM
            r0.<init>(r2, r7, r1)
            r3.add(r0)
            goto L_0x010b
        L_0x014d:
            X.20Q r2 = X.AnonymousClass20Q.UPCOMING
            X.1mi r0 = r10.A00(r7)
            if (r0 == 0) goto L_0x0143
            X.21m r1 = r0.A01
            goto L_0x0144
        L_0x0158:
            X.2yT r0 = new X.2yT
            r0.<init>(r3)
            boolean r0 = r4.AzD(r6, r0)
            if (r0 == 0) goto L_0x00fe
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0166:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x016d }
        L_0x016d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.EventsViewModel$queryAndUpdateEvents$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EventsViewModel$queryAndUpdateEvents$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EventsViewModel$queryAndUpdateEvents$1(this.this$0, (C84814Du) obj2));
    }
}
