package X;

/* renamed from: X.0JF  reason: invalid class name */
public final class AnonymousClass0JF {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0017: MOVE  (r2v1 com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) = 
          (r2v0 com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C157967jD r5, X.C131266dJ r6) {
        /*
            r1 = 0
            X.C162457s7.A0J(r5, r1)
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            X.7bI r4 = r6.A00
            r3 = 0
            if (r4 == 0) goto L_0x0029
            java.lang.String r0 = "media_store"
            X.8r1 r2 = X.C162377rs.A03(r4, r0)
            boolean r0 = r2 instanceof com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule
            if (r0 == 0) goto L_0x002a
            com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule r2 = (com.bloks.stdlib.datamodules.mediastore.MediaStoreDataModule) r2
            if (r2 == 0) goto L_0x002a
            java.lang.Object r1 = r5.A04(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            r2.loadAlbums(r4, r1)
        L_0x0029:
            return r3
        L_0x002a:
            java.lang.String r1 = "bk.action.media.LoadAlbums"
            java.lang.String r0 = "Failed to load albums: MediaStore data module is not found."
            X.C159737mN.A01(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JF.A00(X.7jD, X.6dJ):java.lang.Object");
    }
}
