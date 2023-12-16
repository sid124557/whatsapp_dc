package X;

/* renamed from: X.0JG  reason: invalid class name */
public final class AnonymousClass0JG {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0018: MOVE  (r5v1 com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) = 
          (r5v0 com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C157967jD r10, X.C131266dJ r11) {
        /*
            r4 = 0
            X.C162457s7.A0J(r10, r4)
            r1 = 1
            X.C162457s7.A0J(r11, r1)
            X.7bI r3 = r11.A00
            r2 = 0
            if (r3 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r0 = "media_store"
            X.8r1 r5 = X.C162377rs.A03(r3, r0)
            boolean r0 = r5 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule
            if (r0 == 0) goto L_0x0059
            com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule r5 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r5
            if (r5 == 0) goto L_0x0059
            java.lang.Object r7 = r10.A04(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.A03(r1)
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            java.lang.Object r9 = r10.A03(r0)
            java.lang.String r9 = (java.lang.String) r9
            r0 = 3
            java.lang.Object r1 = r10.A03(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 4
            java.lang.Object r11 = r10.A03(r0)
            java.lang.String r11 = (java.lang.String) r11
            android.content.Context r6 = r3.A00()
            X.C162457s7.A0D(r6)
            if (r1 == 0) goto L_0x0057
            int r0 = r1.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x0053:
            r5.loadMedia(r6, r7, r8, r9, r10, r11)
            return r2
        L_0x0057:
            r10 = r2
            goto L_0x0053
        L_0x0059:
            java.lang.String r1 = "bk.action.media.LoadMediaV3"
            java.lang.String r0 = "Failed to load media: MediaStore data module is not found."
            X.C159737mN.A01(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JG.A00(X.7jD, X.6dJ):java.lang.Object");
    }
}
