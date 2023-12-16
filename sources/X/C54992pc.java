package X;

/* renamed from: X.2pc  reason: invalid class name and case insensitive filesystem */
public final class C54992pc {
    public final C56352rq A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final C54872pQ A03;
    public final C29361ih A04;
    public final C54972pa A05;
    public final C49942hL A06;
    public final C73853gB A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A04.A0Y(X.C58422vE.A02, 4772) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass39M r14, X.C84814Du r15) {
        /*
            r13 = this;
            X.2pQ r1 = r13.A03
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0015
            X.1VX r2 = r1.A04
            r1 = 4772(0x12a4, float:6.687E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x01d9
            X.1VX r1 = r13.A02
            r0 = 4842(0x12ea, float:6.785E-42)
            java.lang.String r2 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002b
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x01d9
            r0 = 4843(0x12eb, float:6.786E-42)
            java.lang.String r2 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003e
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x01d9
            java.lang.String r0 = r13.A01()
            if (r0 == 0) goto L_0x01d9
            X.2pa r5 = r13.A05
            X.2iT r6 = r5.A01(r0)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            r3 = 0
            if (r6 == 0) goto L_0x0057
            java.util.List r7 = r6.A05
            if (r7 != 0) goto L_0x005b
        L_0x0057:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
        L_0x005b:
            java.util.Iterator r9 = r7.iterator()
        L_0x005f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008d
            X.39M r8 = X.AnonymousClass0x7.A0b(r9)
            java.lang.String r2 = r8.A0A
            java.lang.String r0 = r14.A0A
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r2 = r8.A0G
            java.lang.String r0 = r14.A0G
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r2 = r8.A0D
            java.lang.String r0 = r14.A0D
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = r8.A0A
            r4.append(r0)
            goto L_0x005f
        L_0x008d:
            java.lang.String r2 = X.C18290x4.A0o(r4)
            java.lang.String r0 = "FunStickerPack/adding new sticker into sticker pack"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r7.add(r14)
            java.lang.String r12 = r13.A01()
            java.lang.String r9 = ""
            if (r12 != 0) goto L_0x00a2
            r12 = r9
        L_0x00a2:
            r0 = 4842(0x12ea, float:6.785E-42)
            java.lang.String r11 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r11)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b3
            r11 = 0
        L_0x00b3:
            if (r11 != 0) goto L_0x00b6
            r11 = r9
        L_0x00b6:
            r0 = 4843(0x12eb, float:6.786E-42)
            java.lang.String r10 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r10)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c7
            r10 = 0
        L_0x00c7:
            if (r10 != 0) goto L_0x00ca
            r10 = r9
        L_0x00ca:
            r0 = 4880(0x1310, float:6.838E-42)
            java.lang.String r1 = X.C56952sp.A08(r1, r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r1)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00db
            r9 = r1
        L_0x00db:
            java.lang.String r8 = X.C627236i.A05(r2)
            java.util.Iterator r2 = r7.iterator()
            r1 = 0
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f2
            X.39M r0 = X.AnonymousClass0x7.A0b(r2)
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x00e4
        L_0x00f2:
            long r1 = (long) r1
            X.2db r4 = new X.2db
            r4.<init>()
            if (r6 == 0) goto L_0x00ff
            java.lang.String r0 = r6.A0G
            if (r0 == 0) goto L_0x00ff
            r12 = r0
        L_0x00ff:
            r4.A0E = r12
            if (r6 == 0) goto L_0x0108
            java.lang.String r0 = r6.A0I
            if (r0 == 0) goto L_0x0108
            r11 = r0
        L_0x0108:
            r4.A0G = r11
            if (r6 == 0) goto L_0x0111
            java.lang.String r0 = r6.A0K
            if (r0 == 0) goto L_0x0111
            r10 = r0
        L_0x0111:
            r4.A0I = r10
            if (r6 == 0) goto L_0x011a
            java.lang.String r0 = r6.A0A
            if (r0 == 0) goto L_0x011a
            r9 = r0
        L_0x011a:
            r4.A03 = r9
            r0 = 0
            r4.A0O = r0
            r4.A0F = r8
            if (r6 == 0) goto L_0x0127
            java.lang.String r0 = r6.A0M
            if (r0 != 0) goto L_0x0129
        L_0x0127:
            java.lang.String r0 = "-1"
        L_0x0129:
            r4.A0K = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A0M = r0
            r4.A01 = r1
            r4.A0N = r7
            r0 = 0
            r4.A0R = r0
            r4.A0V = r0
            r4.A0T = r0
            X.2iT r4 = r4.A00()
            if (r6 != 0) goto L_0x0143
            r0 = 1
        L_0x0143:
            r4.A07 = r0
            r0 = 0
            r4.A08 = r0
            X.2hL r1 = r13.A06
            X.C626936e.A00()
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x01a0
            java.lang.String r2 = r4.A0G
            X.C162457s7.A0D(r2)
            X.C626936e.A00()
            java.io.File r0 = r1.A01(r2)
        L_0x015d:
            android.graphics.Bitmap r0 = r1.A00(r0, r2)
            if (r0 != 0) goto L_0x01c1
            X.2rq r0 = r13.A00
            X.3Dh r0 = r0.A00
            java.io.File r1 = X.C54292oU.A01(r0)
            java.lang.String r0 = "Stickers"
            java.io.File r7 = X.C64393Dh.A01(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            java.lang.String r0 = ".png"
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)
            X.2oU r0 = r13.A01
            android.content.Context r2 = r0.A00
            r1 = 2131234015(0x7f080cdf, float:1.8084184E38)
            r0 = 2131103040(0x7f060d40, float:1.7818535E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r2, r1, r0)
            android.graphics.Bitmap r2 = X.C107335b8.A00(r0)
            X.C162457s7.A0D(r2)
            java.io.File r1 = X.AnonymousClass002.A0A(r7, r6)
            java.io.ByteArrayOutputStream r0 = X.AnonymousClass0x9.A0e()
            X.C18310x6.A12(r2, r0)
            java.io.BufferedOutputStream r2 = X.AnonymousClass0x7.A0d(r1)
            goto L_0x01ac
        L_0x01a0:
            X.2ht r0 = r1.A04
            java.lang.String r2 = r4.A0G
            java.io.File r0 = r0.A01(r2)
            X.C162457s7.A0D(r2)
            goto L_0x015d
        L_0x01ac:
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x01b4 }
            r2.write(r0)     // Catch:{ all -> 0x01b4 }
            goto L_0x01be
        L_0x01b4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01b9 }
            throw r1
        L_0x01b9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01be:
            r2.close()
        L_0x01c1:
            r5.A02(r4)
            X.3gB r1 = r13.A07
            com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3 r0 = new com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3
            r0.<init>(r13, r4, r3)
            java.lang.Object r1 = X.C616131n.A00(r15, r1, r0)
            X.218 r0 = X.AnonymousClass218.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x01d9
            return r1
        L_0x01d4:
            java.lang.String r0 = "FunStickerPack/sticker already added on sticker pack"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x01d9:
            X.2wD r1 = X.C59022wD.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54992pc.A00(X.39M, X.4Du):java.lang.Object");
    }

    public final String A01() {
        String A08 = C56952sp.A08(this.A02, 4841);
        if (AnonymousClass2AB.A00(A08).length() == 0) {
            return null;
        }
        return A08;
    }

    public C54992pc(C56352rq r1, C54292oU r2, AnonymousClass1VX r3, C54872pQ r4, C29361ih r5, C54972pa r6, C49942hL r7, C73853gB r8) {
        C18260x0.A0f(r3, r2, r5, r6, r4);
        C18260x0.A0W(r8, r7, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A00 = r1;
    }
}
