package com.whatsapp.wds.metrics.logging.network;

import X.AnonymousClass0Pc;
import X.AnonymousClass4GR;
import X.AnonymousClass5K1;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1", f = "HierarchyUploader.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"logFiles"}, s = {"L$0"})
public final class HierarchyUploader$startWork$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass0Pc $completer;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass5K1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HierarchyUploader$startWork$1$1$1(AnonymousClass0Pc r2, AnonymousClass5K1 r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$completer = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r14) {
        /*
            r13 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r13.label
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r6) goto L_0x0010
            java.lang.Object r3 = r13.L$0
            java.io.File[] r3 = (java.io.File[]) r3
            goto L_0x00b6
        L_0x0010:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0015:
            X.C57682u2.A01(r14)
            X.5K1 r0 = r13.this$0
            r0.A01 = r2
            X.5Wc r0 = r0.A02
            android.content.Context r0 = r0.A00
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r8 = "wds_metrics"
            java.io.File r3 = X.AnonymousClass002.A0A(r0, r8)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x003d
            r1 = 3
            X.6Ab r0 = new X.6Ab
            r0.<init>(r1)
            java.io.File[] r12 = r3.listFiles(r0)
            if (r12 != 0) goto L_0x003f
        L_0x003d:
            java.io.File[] r12 = new java.io.File[r2]
        L_0x003f:
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = X.C105715Wc.A03
            long r10 = r10 - r0
            int r9 = r12.length
            r5 = 0
        L_0x0048:
            if (r5 >= r9) goto L_0x005a
            r1 = r12[r5]
            long r3 = r1.lastModified()
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r1.delete()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            int r5 = r5 + 1
            goto L_0x0048
        L_0x005a:
            X.5K1 r0 = r13.this$0
            X.5Wc r0 = r0.A02
            android.content.Context r0 = r0.A00
            java.io.File r0 = r0.getCacheDir()
            java.io.File r3 = X.AnonymousClass002.A0A(r0, r8)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x007a
            r1 = 3
            X.6Ab r0 = new X.6Ab
            r0.<init>(r1)
            java.io.File[] r3 = r3.listFiles(r0)
            if (r3 != 0) goto L_0x007c
        L_0x007a:
            java.io.File[] r3 = new java.io.File[r2]
        L_0x007c:
            int r0 = r3.length
            if (r0 != 0) goto L_0x0096
            X.0Pc r1 = r13.$completer
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            r1.A01(r0)
            X.5K1 r0 = r13.this$0
            r0.A01 = r6
            java.lang.String r0 = "no log files to upload"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0093:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0096:
            X.5K1 r0 = r13.this$0     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            X.4C1 r0 = r0.A03     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            X.1dd r5 = (X.C27321dd) r5     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            X.C162457s7.A0H(r5)     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            r13.L$0 = r3     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            r13.label = r6     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            X.46Q r4 = X.AnonymousClass2C4.A01     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            r1 = 0
            com.whatsapp.graphql.GraphqlRequest$postAwait$2 r0 = new com.whatsapp.graphql.GraphqlRequest$postAwait$2     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            r0.<init>(r5, r1)     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            java.lang.Object r0 = X.C616131n.A00(r13, r4, r0)     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            if (r0 != r7) goto L_0x00b9
            goto L_0x00fa
        L_0x00b6:
            X.C57682u2.A01(r14)     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
        L_0x00b9:
            X.5K1 r0 = r13.this$0     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            r0.A01 = r6     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            java.lang.String r0 = "upload success"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x00c4, OutOfMemoryError -> 0x00d0 }
            goto L_0x00d4
        L_0x00c4:
            r1 = move-exception
            java.lang.String r0 = "upload failure "
            com.whatsapp.util.Log.d(r0, r1)
            X.5K1 r0 = r13.this$0
            r0.A01 = r2
            goto L_0x00d4
        L_0x00d0:
            X.5K1 r0 = r13.this$0
            r0.A01 = r2
        L_0x00d4:
            X.5K1 r0 = r13.this$0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00ef
            int r1 = r3.length
        L_0x00db:
            if (r2 >= r1) goto L_0x00e7
            r0 = r3[r2]
            if (r0 == 0) goto L_0x00e4
            r0.delete()     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            int r2 = r2 + 1
            goto L_0x00db
        L_0x00e7:
            X.0Pc r1 = r13.$completer
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            goto L_0x00f6
        L_0x00ef:
            X.0Pc r1 = r13.$completer
            X.0An r0 = new X.0An
            r0.<init>()
        L_0x00f6:
            r1.A01(r0)
            goto L_0x0093
        L_0x00fa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new HierarchyUploader$startWork$1$1$1(this.$completer, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
