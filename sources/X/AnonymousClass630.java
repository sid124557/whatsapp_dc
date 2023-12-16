package X;

import java.io.File;
import java.util.List;

/* renamed from: X.630  reason: invalid class name */
public final class AnonymousClass630 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ List $filesToKeep;
    public final /* synthetic */ File $folder;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.$filesToKeep.contains(r3) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            java.io.File r0 = r2.$folder
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0015
            java.util.List r0 = r2.$filesToKeep
            boolean r1 = r0.contains(r3)
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass630.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass630(File file, List list) {
        super(1);
        this.$folder = file;
        this.$filesToKeep = list;
    }
}
