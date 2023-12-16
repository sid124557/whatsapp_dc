package com.whatsapp.comments;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C60332yN;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMessages$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C60332yN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMessages$1(C60332yN r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x008c
            X.C57682u2.A01(r9)
            X.2yN r5 = r8.this$0
            X.4Gp r4 = r5.A0B
        L_0x000b:
            java.lang.Object r6 = r4.getValue()
            X.3dV r0 = r5.A03
            X.4GK r3 = r0.get()
            X.34x r0 = r5.A04     // Catch:{ all -> 0x0085 }
            long r0 = r0.A1L     // Catch:{ all -> 0x0085 }
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String[] r7 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0085 }
            X.C18260x0.A1W(r7, r2, r0)     // Catch:{ all -> 0x0085 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0085 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = X.C58092uh.A01     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r2 = r2.A0E(r1, r0, r7)     // Catch:{ all -> 0x0085 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x007e }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList r1 = X.AnonymousClass000.A0o(r2)     // Catch:{ all -> 0x007e }
        L_0x003c:
            X.2qz r0 = r5.A05     // Catch:{ all -> 0x007e }
            X.34x r0 = r0.A03(r2)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0047
            r1.add(r0)     // Catch:{ all -> 0x007e }
        L_0x0047:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x003c
            goto L_0x0050
        L_0x004e:
            X.3d3 r1 = X.C72023d3.A00     // Catch:{ all -> 0x007e }
        L_0x0050:
            r2.close()     // Catch:{ all -> 0x0085 }
            java.util.Comparator r0 = X.C60332yN.A0D     // Catch:{ all -> 0x0085 }
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ all -> 0x0085 }
            X.C73723fy.A0T(r1, r2)     // Catch:{ all -> 0x0085 }
            int r0 = r2.size()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicReference r1 = r5.A06     // Catch:{ all -> 0x0085 }
            X.21B r0 = X.AnonymousClass21B.COMPLETE     // Catch:{ all -> 0x0085 }
            r1.set(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0072
        L_0x006b:
            java.util.concurrent.atomic.AtomicReference r1 = r5.A06     // Catch:{ all -> 0x0085 }
            X.21B r0 = X.AnonymousClass21B.INCOMPLETE     // Catch:{ all -> 0x0085 }
            r1.set(r0)     // Catch:{ all -> 0x0085 }
        L_0x0072:
            r3.close()
            boolean r0 = r4.AzD(r6, r2)
            if (r0 == 0) goto L_0x000b
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.CommentListManager$loadMessages$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CommentListManager$loadMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CommentListManager$loadMessages$1(this.this$0, (C84814Du) obj2));
    }
}
