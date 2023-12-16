package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.Iterator;

/* renamed from: X.1u5  reason: invalid class name and case insensitive filesystem */
public class C34011u5 extends AnonymousClass5ZM {
    public final int A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final C55862r2 A03;
    public final C29361ih A04;
    public final AnonymousClass4BN A05;
    public final AnonymousClass2MF A06;
    public final StickerPackDownloader A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public void A0E(Object... objArr) {
        Number number = objArr[1];
        int intValue = number.intValue();
        AnonymousClass2MF r0 = this.A06;
        String str = this.A0A;
        r0.A01.put(str, number);
        Iterator A032 = C61102zi.A03(this.A04);
        while (A032.hasNext()) {
            C56872sh r02 = (C56872sh) A032.next();
            r02.toString();
            r02.A0D(str, intValue);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        if (X.C18310x6.A1X(r0) != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023c, code lost:
        if (r0 == false) goto L_0x023e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r2 = r27
            X.2iT[] r2 = (X.C50612iT[]) r2
            r1 = r26
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r3 = r1.A07
            r0 = 0
            r6 = r2[r0]
            boolean r5 = r1.A0B
            X.3Um r7 = new X.3Um
            r7.<init>(r1)
            java.lang.Integer r2 = r1.A09
            java.lang.Integer r0 = r1.A08
            r17 = r0
            int r0 = r1.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r4 = 0
            X.C162457s7.A0J(r6, r4)
            X.1sS r0 = r3.A0E
            r0.A05()
            X.1u5 r0 = r7.A00
            X.4MC r9 = r0.A02
            boolean r0 = r9.isCancelled()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "cancelled"
        L_0x0033:
            X.1rK r1 = new X.1rK
            r1.<init>(r0)
            return r1
        L_0x0039:
            r1 = r6
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x0249
            java.util.List r0 = r6.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0083
            r0 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1 r1 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1
            r1.<init>(r3, r0)
            X.3du r0 = X.C72553du.A00
            java.lang.Object r10 = X.C380725l.A00(r0, r1)
            java.util.Set r10 = (java.util.Set) r10
        L_0x0056:
            X.2xR r8 = r3.A03
            r5 = 1
            X.C162457s7.A0J(r10, r5)
            X.3gB r1 = r8.A08
            r15 = 0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1
            r11 = r8
            r12 = r17
            r14 = r10
            r16 = r5
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = X.C380725l.A00(r1, r0)
            X.2iT r1 = (X.C50612iT) r1
        L_0x0071:
            if (r1 != 0) goto L_0x0091
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDownloader/StickerError/could not get sticker pack by id, sticker pack id: "
            r1.append(r0)
            java.lang.String r0 = r6.A0G
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0033
        L_0x0083:
            X.3d7 r10 = X.C72063d7.A00
            goto L_0x0056
        L_0x0086:
            java.util.List r0 = r6.A05
            X.C162457s7.A0D(r0)
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x0249
        L_0x0091:
            X.2cE r8 = r3.A0D
            X.C626936e.A00()
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x00fc
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            r5.append(r0)
            java.lang.String r0 = r1.A0M
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r5)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0l(r0)
            X.1VX r6 = r8.A02
            r5 = 6785(0x1a81, float:9.508E-42)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r0 = r6.A0R(r0, r5)
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r10)
            if (r5 == 0) goto L_0x00fc
            X.2hI r0 = r8.A04
            java.lang.String r11 = r0.A00(r5)
            X.C162457s7.A0D(r11)
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r1.A0G
            X.C162457s7.A0D(r0)
            java.io.File r10 = r8.A00(r0)
            if (r10 == 0) goto L_0x00fc
            X.2oU r0 = r8.A01
            android.content.Context r5 = r0.A00
            r0 = 2131231894(0x7f080496, float:1.8079882E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r5, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r5 = r0.getBitmap()
            java.io.ByteArrayOutputStream r0 = X.AnonymousClass0x9.A0e()
            X.C18310x6.A12(r5, r0)
            byte[] r0 = r0.toByteArray()
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)
            r5 = 5120(0x1400, double:2.5296E-320)
            X.C627536m.A0S(r10, r0, r5)
        L_0x00fc:
            java.util.List r0 = r1.A05
            r25 = r0
            X.C162457s7.A0D(r25)
            int r14 = r25.size()
            r5 = 0
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>(r4)
            X.1VX r12 = r3.A02
            r0 = 3064(0xbf8, float:4.294E-42)
            X.2vE r11 = X.C58422vE.A02
            boolean r0 = r12.A0Y(r11, r0)
            if (r0 == 0) goto L_0x017d
            X.405 r13 = new X.405
            r13.<init>(r1, r7, r10, r14)
            X.3gB r6 = r3.A0I
            r0 = 4
            X.3gB r6 = r6.A00(r0)
            r9 = 0
            X.46f r0 = new X.46f
            r0.<init>(r9)
            X.4Gl r0 = X.C616031m.A00(r6, r0)
            X.4C6 r24 = X.AnonymousClass349.A02(r0)
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1 r6 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1
            r18 = r6
            r19 = r1
            r20 = r7
            r21 = r3
            r22 = r9
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.3du r0 = X.C72553du.A00
            java.lang.Object r0 = X.C380725l.A00(r0, r6)
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0
            java.lang.Object r7 = r0.value
        L_0x014e:
            java.lang.Throwable r6 = X.AnonymousClass3Z9.A00(r7)
            if (r6 != 0) goto L_0x05a9
            java.util.List r7 = (java.util.List) r7
            r1.A05 = r7
            r0 = 3792(0xed0, float:5.314E-42)
            boolean r0 = r12.A0Y(r11, r0)
            if (r0 == 0) goto L_0x0350
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x0350
            X.39M r5 = r1.A09
            if (r5 == 0) goto L_0x0350
            java.lang.String r0 = "StickerPackDownloader/downloadAvatarStickerDynamicIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2mU r0 = r3.A08
            java.io.File r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x034b
            java.lang.String r0 = r0.getAbsolutePath()
            r5.A09 = r0
            goto L_0x0254
        L_0x017d:
            X.406 r6 = new X.406
            r6.<init>(r1, r7, r10, r14)
            java.util.List r0 = r1.A05
            X.C162457s7.A0D(r0)
            java.util.ArrayList r7 = X.C73783g4.A0c(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x018f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x014e
            X.39M r13 = X.AnonymousClass0x7.A0b(r15)
            boolean r0 = r9.isCancelled()
            java.lang.String r14 = "cancelled"
            if (r0 == 0) goto L_0x01aa
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r14)
            X.3Z0 r7 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x014e
        L_0x01aa:
            X.2aC r0 = r3.A0C
            X.C162457s7.A0H(r13)
            X.294 r13 = r0.A00(r13)
            boolean r0 = r13 instanceof X.C32831rh
            if (r0 == 0) goto L_0x01c0
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r14)
            X.3Z0 r7 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x014e
        L_0x01c0:
            boolean r0 = r13 instanceof X.C32841ri
            if (r0 == 0) goto L_0x05db
            r6.invoke()
            X.1ri r13 = (X.C32841ri) r13
            X.39M r0 = r13.A00
            r7.add(r0)
            goto L_0x018f
        L_0x01cf:
            X.2ME r15 = r8.A05
            java.lang.String r10 = r1.A0G
            X.C162457s7.A0D(r10)
            java.io.File r14 = r8.A00(r10)
            java.lang.String r6 = "StaticContentDownloader/download/error downloading: "
            if (r14 == 0) goto L_0x023e
            X.33K r0 = r15.A01     // Catch:{ IOException -> 0x0233 }
            X.4GL r12 = r0.A03(r11)     // Catch:{ IOException -> 0x0233 }
            r0 = r12
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0229 }
            java.net.HttpURLConnection r13 = r0.A01     // Catch:{ all -> 0x0229 }
            int r5 = r13.getResponseCode()     // Catch:{ all -> 0x0229 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L_0x0215
            X.2s4 r5 = r15.A00     // Catch:{ all -> 0x0229 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0229 }
            java.io.InputStream r0 = r12.B47(r5, r0, r0)     // Catch:{ all -> 0x0229 }
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0229 }
            r13.<init>(r0)     // Catch:{ all -> 0x0229 }
            boolean r0 = X.C627536m.A0R(r14, r13)     // Catch:{ all -> 0x020b }
            r13.close()     // Catch:{ all -> 0x0229 }
            r12.close()     // Catch:{ IOException -> 0x0233 }
            goto L_0x023c
        L_0x020b:
            r5 = move-exception
            r13.close()     // Catch:{ all -> 0x0210 }
            goto L_0x0214
        L_0x0210:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ all -> 0x0229 }
        L_0x0214:
            throw r5     // Catch:{ all -> 0x0229 }
        L_0x0215:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0m(r6, r11)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = ", returned code: "
            r5.append(r0)     // Catch:{ all -> 0x0229 }
            int r0 = r13.getResponseCode()     // Catch:{ all -> 0x0229 }
            X.C18270x1.A1F(r5, r0)     // Catch:{ all -> 0x0229 }
            r12.close()     // Catch:{ IOException -> 0x0233 }
            goto L_0x023e
        L_0x0229:
            r5 = move-exception
            r12.close()     // Catch:{ all -> 0x022e }
            goto L_0x0232
        L_0x022e:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ IOException -> 0x0233 }
        L_0x0232:
            throw r5     // Catch:{ IOException -> 0x0233 }
        L_0x0233:
            r5 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A0u(r6, r11, r0, r5)
            goto L_0x023e
        L_0x023c:
            if (r0 != 0) goto L_0x00fc
        L_0x023e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackTrayIconDownloader/failed to download tray icon for sticker pack "
            X.C18260x0.A0r(r0, r10, r5)
            goto L_0x00fc
        L_0x0249:
            X.2oE r5 = r3.A07
            java.lang.String r1 = r6.A0G
            r0 = 0
            X.2iT r1 = r5.A00(r0, r1)
            goto L_0x0071
        L_0x0254:
            X.2P2 r6 = r3.A09     // Catch:{ all -> 0x0335 }
            r5 = 0
            if (r0 != 0) goto L_0x0265
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x025b:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Unable to create avatar dynamic icon given template Id"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0335 }
        L_0x0264:
            throw r0     // Catch:{ all -> 0x0335 }
        L_0x0265:
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x026a }
            goto L_0x026f
        L_0x026a:
            r0 = move-exception
            X.3Z0 r13 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0335 }
        L_0x026f:
            boolean r0 = r13 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x0274
            r13 = r5
        L_0x0274:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13     // Catch:{ all -> 0x0335 }
            if (r13 != 0) goto L_0x027b
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x025b
        L_0x027b:
            X.2oU r0 = r6.A00     // Catch:{ all -> 0x0335 }
            android.content.Context r9 = r0.A00     // Catch:{ all -> 0x0335 }
            android.content.res.Resources r5 = r9.getResources()     // Catch:{ all -> 0x0335 }
            r0 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r5 = r5.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0335 }
            r0 = 2131099846(0x7f0600c6, float:1.7812057E38)
            int r9 = X.AnonymousClass0Y8.A04(r9, r0)     // Catch:{ all -> 0x0335 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0335 }
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createBitmap(r5, r5, r0)     // Catch:{ all -> 0x0335 }
            X.C162457s7.A0D(r16)     // Catch:{ all -> 0x0335 }
            int r0 = r16.getWidth()     // Catch:{ all -> 0x0335 }
            float r12 = (float) r0     // Catch:{ all -> 0x0335 }
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r0
            android.graphics.Canvas r11 = new android.graphics.Canvas     // Catch:{ all -> 0x0335 }
            r0 = r16
            r11.<init>(r0)     // Catch:{ all -> 0x0335 }
            android.graphics.Paint r14 = new android.graphics.Paint     // Catch:{ all -> 0x0335 }
            r14.<init>()     // Catch:{ all -> 0x0335 }
            r0 = 1
            r14.setAntiAlias(r0)     // Catch:{ all -> 0x0335 }
            r14.setDither(r0)     // Catch:{ all -> 0x0335 }
            r14.setFilterBitmap(r0)     // Catch:{ all -> 0x0335 }
            android.graphics.Paint r10 = new android.graphics.Paint     // Catch:{ all -> 0x0335 }
            r10.<init>()     // Catch:{ all -> 0x0335 }
            r10.setAntiAlias(r0)     // Catch:{ all -> 0x0335 }
            r10.setDither(r0)     // Catch:{ all -> 0x0335 }
            r10.setFilterBitmap(r0)     // Catch:{ all -> 0x0335 }
            r10.setColor(r9)     // Catch:{ all -> 0x0335 }
            int r15 = r13.getWidth()     // Catch:{ all -> 0x0335 }
            int r0 = r13.getHeight()     // Catch:{ all -> 0x0335 }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ all -> 0x0335 }
            r9.<init>(r4, r4, r15, r0)     // Catch:{ all -> 0x0335 }
            float r15 = (float) r5     // Catch:{ all -> 0x0335 }
            r0 = 0
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ all -> 0x0335 }
            r5.<init>(r0, r0, r15, r15)     // Catch:{ all -> 0x0335 }
            r11.drawARGB(r4, r4, r4, r4)     // Catch:{ all -> 0x0335 }
            android.graphics.Path r15 = new android.graphics.Path     // Catch:{ all -> 0x0335 }
            r15.<init>()     // Catch:{ all -> 0x0335 }
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW     // Catch:{ all -> 0x0335 }
            r15.addCircle(r12, r12, r12, r0)     // Catch:{ all -> 0x0335 }
            r11.clipPath(r15)     // Catch:{ all -> 0x0335 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0335 }
            r11.drawColor(r4, r0)     // Catch:{ all -> 0x0335 }
            r11.drawCircle(r12, r12, r12, r10)     // Catch:{ all -> 0x0335 }
            r11.drawBitmap(r13, r9, r5, r14)     // Catch:{ all -> 0x0335 }
            r13.recycle()     // Catch:{ all -> 0x0335 }
            java.io.ByteArrayOutputStream r9 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x0335 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0335 }
            r0 = r16
            r0.compress(r5, r4, r9)     // Catch:{ all -> 0x0335 }
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x0335 }
            java.io.ByteArrayInputStream r9 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ all -> 0x0335 }
            X.2ee r0 = r6.A01     // Catch:{ all -> 0x0335 }
            java.lang.String r5 = "meta-avatar-tab-icon"
            X.30B r0 = r0.A00     // Catch:{ all -> 0x0335 }
            X.1sU r0 = r0.A04()     // Catch:{ all -> 0x0335 }
            r0.A08(r5)     // Catch:{ all -> 0x0335 }
            X.2cE r0 = r6.A02     // Catch:{ all -> 0x0335 }
            java.io.File r0 = r0.A00(r5)     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x032d
            r5 = 500000(0x7a120, double:2.47033E-318)
            X.C627536m.A0S(r0, r9, r5)     // Catch:{ all -> 0x0335 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0335 }
            goto L_0x033a
        L_0x032d:
            java.lang.String r0 = "Unable to create dynamic icon file"
            java.io.FileNotFoundException r0 = X.C18330xA.A05(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0264
        L_0x0335:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x033a:
            java.lang.Throwable r6 = X.AnonymousClass3Z9.A00(r0)
            if (r6 == 0) goto L_0x0350
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDownloader/failed to update avatar dynamic icon "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r5, r6)
            goto L_0x034d
        L_0x034b:
            java.lang.String r0 = "StickerPackDownloader/failed to download avatar dynamic icon"
        L_0x034d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0350:
            java.lang.String r5 = "stickers_downloaded"
            r0 = r17
            r3.A02(r2, r0, r5)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDownloader/finished fetching stickers/sticker pack id: "
            r5.append(r0)
            java.lang.String r9 = r1.A0G
            X.C18260x0.A1L(r5, r9)
            boolean r11 = r1.A0S
            if (r11 == 0) goto L_0x03d0
            java.lang.String r12 = r1.A0L
            if (r12 == 0) goto L_0x04a0
            java.lang.String r0 = "StickerPackDownloader/updateAvatarStickerPackTrayIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ee r0 = r3.A0B
            X.C162457s7.A0D(r9)
            X.30B r0 = r0.A00
            X.1sU r0 = r0.A04()
            r0.A08(r9)
            java.util.List r0 = r1.A05
            r16 = r0
            X.C162457s7.A0D(r16)
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x03c8
            X.2Hq r6 = r8.A03
            java.util.Iterator r13 = r16.iterator()
        L_0x0394:
            boolean r0 = r13.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r10 = r13.next()
            r5 = r10
            X.39M r5 = (X.AnonymousClass39M) r5
            java.lang.String r0 = r5.A05
            if (r0 != 0) goto L_0x03ae
            X.330 r0 = r5.A04
            if (r0 == 0) goto L_0x0394
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0394
        L_0x03ae:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0394
        L_0x03b4:
            X.39M r10 = (X.AnonymousClass39M) r10
            if (r10 != 0) goto L_0x03be
            java.lang.Object r10 = X.C73723fy.A03(r16)
            X.39M r10 = (X.AnonymousClass39M) r10
        L_0x03be:
            java.lang.String r0 = r10.A09
            r5 = 0
            if (r0 != 0) goto L_0x03ff
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x03c5:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03c8:
            java.lang.String r5 = "tray_icon_updated"
            r0 = r17
            r3.A02(r2, r0, r5)
        L_0x03d0:
            X.2pa r10 = r3.A0F
            X.2iT r5 = r10.A01(r9)
            if (r5 == 0) goto L_0x0529
            java.lang.String r0 = "StickerPackDownloader/deletePreviouslyInstalledStickerPack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r6 = r5.A05
            X.C162457s7.A0D(r6)
            java.util.List r13 = r1.A05
            X.C162457s7.A0D(r13)
            java.util.ArrayList r8 = X.C73783g4.A0d(r6)
            java.util.Iterator r5 = r6.iterator()
        L_0x03ef:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04a7
            X.39M r0 = X.AnonymousClass0x7.A0b(r5)
            java.lang.String r0 = r0.A0D
            r8.add(r0)
            goto L_0x03ef
        L_0x03ff:
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x0404 }
            goto L_0x0409
        L_0x0404:
            r0 = move-exception
            X.3Z0 r15 = X.AnonymousClass3Z0.A01(r0)
        L_0x0409:
            boolean r0 = r15 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x040e
            r15 = r5
        L_0x040e:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            if (r15 != 0) goto L_0x0415
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x03c5
        L_0x0415:
            X.2oU r0 = r6.A00
            android.content.Context r10 = r0.A00
            android.content.res.Resources r5 = r10.getResources()
            r0 = 2131165372(0x7f0700bc, float:1.794496E38)
            int r6 = r5.getDimensionPixelSize(r0)
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            int r5 = X.AnonymousClass0Y8.A04(r10, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r6, r6, r0)
            X.C162457s7.A0D(r13)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            r14.<init>(r13)
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>()
            r0 = 1
            r12.setAntiAlias(r0)
            r12.setDither(r0)
            r12.setFilterBitmap(r0)
            r12.setColor(r5)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_OVER
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r5)
            r12.setXfermode(r0)
            int r5 = r15.getWidth()
            int r0 = r15.getHeight()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4, r4, r5, r0)
            float r6 = (float) r6
            r5 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5, r5, r6, r6)
            r14.drawARGB(r4, r4, r4, r4)
            r14.drawOval(r0, r12)
            r14.drawBitmap(r15, r10, r0, r12)
            r15.recycle()
            java.io.ByteArrayOutputStream r5 = X.AnonymousClass0x9.A0e()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            r13.compress(r0, r4, r5)
            byte[] r0 = r5.toByteArray()
            java.io.ByteArrayInputStream r10 = X.AnonymousClass0x9.A0d(r0)
            r0 = r16
            java.lang.Object r0 = r0.get(r4)
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r0 = r0.A0F
            if (r0 == 0) goto L_0x03c8
            java.io.File r0 = r8.A00(r0)
            if (r0 == 0) goto L_0x03c8
            r5 = 500000(0x7a120, double:2.47033E-318)
            X.C627536m.A0S(r0, r10, r5)
            goto L_0x03c8
        L_0x04a0:
            java.lang.String r0 = "StickerPackDownloader/avatar stickerpack without tray icon template"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x03d0
        L_0x04a7:
            java.util.ArrayList r12 = X.C73783g4.A0d(r13)
            java.util.Iterator r5 = r13.iterator()
        L_0x04af:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04bf
            X.39M r0 = X.AnonymousClass0x7.A0b(r5)
            java.lang.String r0 = r0.A0D
            r12.add(r0)
            goto L_0x04af
        L_0x04bf:
            java.util.Set r5 = X.C73723fy.A0P(r12)
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            java.util.Set r12 = X.C73723fy.A0O(r8)
            X.C162457s7.A0J(r12, r4)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 != 0) goto L_0x04d6
            java.util.List r5 = X.C73723fy.A0F(r5)
        L_0x04d6:
            java.util.Collection r5 = (java.util.Collection) r5
            r12.retainAll(r5)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r6.iterator()
        L_0x04e3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r0 = r0.A0D
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x04e3
            r8.add(r5)
            goto L_0x04e3
        L_0x04fc:
            r8.size()
            java.util.Iterator r6 = r8.iterator()
        L_0x0503:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0521
            X.39M r5 = X.AnonymousClass0x7.A0b(r6)
            java.lang.String r0 = r5.A09
            if (r0 == 0) goto L_0x0503
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0503
            java.lang.String r5 = r5.A0D
            if (r5 == 0) goto L_0x0503
            X.2rq r0 = r3.A01
            r0.A06(r5)
            goto L_0x0503
        L_0x0521:
            java.lang.String r5 = "previous_stickers_deleted"
            r0 = r17
            r3.A02(r2, r0, r5)
        L_0x0529:
            X.C626936e.A00()
            X.2X2 r0 = r10.A03
            int r8 = r0.A01(r9)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDownloader/installStickerPack(order="
            r5.append(r0)
            java.lang.String r0 = X.C18260x0.A09(r5, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r11 == 0) goto L_0x055a
            java.util.Iterator r6 = r7.iterator()
            r5 = 0
        L_0x0549:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0557
            X.39M r0 = X.AnonymousClass0x7.A0b(r6)
            int r0 = r0.A00
            int r5 = r5 + r0
            goto L_0x0549
        L_0x0557:
            long r5 = (long) r5
            r1.A02 = r5
        L_0x055a:
            r10.A02(r1)
            java.lang.String r5 = "stickerpack_installed"
            r0 = r17
            r3.A02(r2, r0, r5)
            X.2jG r0 = r3.A0G
            r0.A02(r9)
            X.2iT r5 = r10.A01(r9)
            if (r5 == 0) goto L_0x05a5
            r0 = r25
            r5.A05 = r0
            r5.A06 = r4
            r5.A00 = r8
            r0 = 1
            r5.A08 = r0
            if (r2 == 0) goto L_0x059d
            if (r17 == 0) goto L_0x059d
            X.8vZ r6 = r3.A04
            int r7 = r2.intValue()
            int r8 = r17.intValue()
            java.lang.String r9 = "stickerpack_size"
            long r10 = r1.A02
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r9, (long) r10)
            java.util.List r0 = r1.A05
            int r1 = r0.size()
            java.lang.String r0 = "stickerpack_amount"
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r0, (int) r1)
        L_0x059d:
            X.1rL r1 = new X.1rL
            r0 = r25
            r1.<init>(r5, r0)
            return r1
        L_0x05a5:
            java.lang.String r0 = "Unable to get sticker pack from database"
            goto L_0x0033
        L_0x05a9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDownloader/error during download: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r6)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r2 = r10.get()
        L_0x05ba:
            if (r5 >= r2) goto L_0x05d0
            r0 = r25
            java.lang.Object r0 = r0.get(r5)
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r1 = r0.A0D
            if (r1 == 0) goto L_0x05cd
            X.2rq r0 = r3.A01
            r0.A06(r1)
        L_0x05cd:
            int r5 = r5 + 1
            goto L_0x05ba
        L_0x05d0:
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "no error message available"
            goto L_0x0033
        L_0x05db:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34011u5.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        C387328x r4 = (C387328x) obj;
        AnonymousClass2MF r2 = this.A06;
        String str = this.A0A;
        r2.A01.remove(str);
        r2.A00.remove(str);
        if (r4 == null) {
            r4 = new C32611rK("received null result");
        }
        A0G(r4);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C387328x r1 = (C387328x) obj;
        C626936e.A06(r1);
        A0G(r1);
    }

    public final void A0G(C387328x r6) {
        C25311aJ r4 = new C25311aJ();
        r4.A04 = Integer.valueOf(this.A00);
        String str = this.A0A;
        boolean equals = "meta-avatar".equals(str);
        r4.A02 = C18320x8.A0V(equals);
        r4.A01 = Boolean.valueOf(equals);
        if (equals) {
            r4.A06 = this.A03.A03;
        }
        if (this.A01.A0Y(C58422vE.A02, 6787)) {
            r4.A03 = Boolean.valueOf(this.A0C);
        }
        if (r6 instanceof C32621rL) {
            C29361ih r0 = this.A04;
            C50612iT r2 = ((C32621rL) r6).A00;
            Iterator A032 = C61102zi.A03(r0);
            while (A032.hasNext()) {
                ((C56872sh) A032.next()).A08(r2);
            }
            r4.A00 = Boolean.FALSE;
        } else if (r6 instanceof C32611rK) {
            C32611rK r22 = (C32611rK) r6;
            Iterator A033 = C61102zi.A03(this.A04);
            while (A033.hasNext()) {
                ((C56872sh) A033.next()).A0B(str);
            }
            r4.A00 = Boolean.TRUE;
            r4.A05 = r22.A00;
        }
        this.A02.BhD(r4);
        AnonymousClass2MF r1 = this.A06;
        r1.A01.remove(str);
        r1.A00.remove(str);
        AnonymousClass4BN r02 = this.A05;
        if (r02 != null) {
            r02.BcZ(r6);
        }
    }

    public C34011u5(AnonymousClass1VX r2, AnonymousClass4FV r3, C55862r2 r4, C29361ih r5, C50612iT r6, AnonymousClass4BN r7, AnonymousClass2MF r8, StickerPackDownloader stickerPackDownloader, Integer num, Integer num2, int i, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = stickerPackDownloader;
        this.A06 = r8;
        this.A0A = r6.A0G;
        this.A0C = r6.A0U;
        this.A05 = r7;
        this.A02 = r3;
        this.A00 = i;
        this.A0B = z;
        this.A09 = num;
        this.A08 = num2;
    }
}
