package com.whatsapp.interop.blocklist;

import X.AnonymousClass2RM;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2", f = "InteropBlockListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListManager$loadBlockListFromStorage$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass2RM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListManager$loadBlockListFromStorage$2(AnonymousClass2RM r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x0056
            X.C57682u2.A01(r9)
            X.2RM r0 = r8.this$0
            java.util.Set r5 = r0.A02
            monitor-enter(r5)
            java.util.Set r7 = r0.A02     // Catch:{ all -> 0x0053 }
            X.1v8 r0 = r0.A00     // Catch:{ all -> 0x0053 }
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0053 }
            X.4GK r4 = X.C18630y0.A03(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "SELECT jid FROM wa_block_list_interop"
            java.lang.String r0 = "INTEROP_GET_BLOCK_LIST"
            android.database.Cursor r3 = X.AnonymousClass361.A09(r4, r1, r0)     // Catch:{ all -> 0x004c }
            int r2 = X.AnonymousClass0x9.A01(r3)     // Catch:{ all -> 0x0045 }
        L_0x0024:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003a
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ all -> 0x0045 }
            com.whatsapp.jid.UserJid r0 = r1.A0E(r0)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0024
            r6.add(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0024
        L_0x003a:
            r3.close()     // Catch:{ all -> 0x004c }
            r4.close()     // Catch:{ all -> 0x0053 }
            r7.addAll(r6)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return r7
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, (C84814Du) obj2));
    }
}
