package X;

import java.io.IOException;

/* renamed from: X.9bA  reason: invalid class name and case insensitive filesystem */
public final class C196579bA implements AnonymousClass4EN {
    public final /* synthetic */ AnonymousClass9SJ A00;
    public final /* synthetic */ C106935aP A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyP(X.AnonymousClass2SI r30) {
        /*
            r29 = this;
            r0 = 0
            r3 = r30
            X.C162457s7.A0J(r3, r0)
            X.2WN r2 = r3.A03
            X.C162457s7.A0D(r2)
            X.2fE r1 = r3.A04
            X.C162457s7.A0D(r1)
            int r0 = r3.A00
            r4 = r29
            if (r0 == 0) goto L_0x0044
            r3 = 0
            java.lang.Object r1 = r1.A00(r3)
            boolean r0 = r1 instanceof X.AnonymousClass59W
            if (r0 == 0) goto L_0x0022
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
        L_0x0022:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ARDScriptingMetadataDownloader Error response: "
            X.C18260x0.A1Q(r1, r0, r3)
            X.9SJ r2 = r4.A00
            if (r3 != 0) goto L_0x0031
            X.986 r3 = X.AnonymousClass986.A00
        L_0x0031:
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.SCRIPTING_METADATA_DOWNLOAD_FAILURE
            r1.A00 = r0
            r1.A03 = r3
            X.9KQ r0 = r1.A00()
            r2.A00(r0)
            return
        L_0x0044:
            java.lang.String r0 = "ARDScriptingMetadataDownloader Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r2.A00
            X.5RY r2 = (X.AnonymousClass5RY) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ARDScriptingMetadataDownloader Data: "
            X.C18260x0.A1P(r1, r0, r2)
            if (r2 != 0) goto L_0x005d
            X.9SJ r2 = r4.A00
            X.985 r3 = X.AnonymousClass985.A00
            goto L_0x0031
        L_0x005d:
            X.9SJ r3 = r4.A00
            com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata r0 = X.C106935aP.A00(r2)
            X.9iz r2 = r3.A00
            X.9Pl r6 = r2.A01
            java.lang.String r14 = "a98fd0f490f87104f7b2b702d0abc949f9db6325"
            java.lang.String r5 = r0.mCdnUrl
            int r4 = r0.mRevision
            r10 = 0
            com.facebook.cameracore.ardelivery.model.ARAssetType r8 = com.facebook.cameracore.ardelivery.model.ARAssetType.SCRIPTING_PACKAGE
            r25 = -1
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r9 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.ZIP
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = ":"
            java.lang.String r21 = X.AnonymousClass000.A0Y(r0, r1, r4)
            X.9Xk r7 = new X.9Xk
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r19 = r10
            r20 = r10
            r22 = r10
            r23 = r10
            r11 = r10
            r18 = r5
            r24 = r4
            r27 = r25
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
            X.9W5 r9 = r6.A00
            java.util.List r14 = java.util.Collections.singletonList(r7)
            X.9Kl r12 = new X.9Kl
            r12.<init>()
            X.9YU r11 = new X.9YU
            r11.<init>(r3)
            X.32L r13 = r2.A02
            r9.A04(r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196579bA.AyP(X.2SI):void");
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        AnonymousClass9SJ r2 = this.A00;
        C194579Tm r1 = new C194579Tm();
        r1.A00 = AnonymousClass9K2.SCRIPTING_METADATA_DOWNLOAD_FAILURE;
        r1.A03 = iOException;
        r2.A00(r1.A00());
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        AnonymousClass9SJ r2 = this.A00;
        C194579Tm r1 = new C194579Tm();
        r1.A00 = AnonymousClass9K2.SCRIPTING_METADATA_DOWNLOAD_FAILURE;
        r1.A03 = exc;
        r2.A00(r1.A00());
    }

    public C196579bA(AnonymousClass9SJ r1, C106935aP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
