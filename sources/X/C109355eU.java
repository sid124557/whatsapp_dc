package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.5eU  reason: invalid class name and case insensitive filesystem */
public class C109355eU implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109355eU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Rect rect) {
        rect.left /= 2;
        rect.right /= 2;
        rect.top /= 2;
        rect.bottom /= 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r11.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fd, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fe, code lost:
        com.whatsapp.util.Log.e(X.C18260x0.A05("cropimage/oom: ", r1), r11);
        r0 = r8.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020f, code lost:
        r8.A0B.recycle();
        r8.A0B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021e, code lost:
        r15.recycle();
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0222, code lost:
        A00(r7);
        r1 = r1 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e0, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d7, code lost:
        if (r0.getVisibility() != 8) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x057c, code lost:
        r1.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x057f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05e5, code lost:
        r3.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x073c, code lost:
        r3.startActivity(new android.content.Intent(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0744, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x075c, code lost:
        X.C86654Ky.A1C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x075f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0796, code lost:
        r2.setClassName(r1, r0);
        r3.A0m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x079c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0844, code lost:
        r1.A2L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0847, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08e8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08e9, code lost:
        com.whatsapp.util.Log.e("cropimage/cannot_resample: ", r1);
        r8.setResult(0, com.whatsapp.crop.CropImage.A0C());
        r8.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f3, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:38:0x010f, B:79:0x01b0, B:81:0x01be, B:97:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08e8 A[ExcHandler: IOException (r1v94 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:38:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x08d7;
                case 1: goto L_0x051c;
                case 2: goto L_0x0483;
                case 3: goto L_0x08c7;
                case 4: goto L_0x089f;
                case 5: goto L_0x0410;
                case 6: goto L_0x0896;
                case 7: goto L_0x0865;
                case 8: goto L_0x0848;
                case 9: goto L_0x083b;
                case 10: goto L_0x0831;
                case 11: goto L_0x0816;
                case 12: goto L_0x080e;
                case 13: goto L_0x0806;
                case 14: goto L_0x0800;
                case 15: goto L_0x07f3;
                case 16: goto L_0x07f3;
                case 17: goto L_0x07eb;
                case 18: goto L_0x03ae;
                case 19: goto L_0x07d0;
                case 20: goto L_0x07d0;
                case 21: goto L_0x07c8;
                case 22: goto L_0x07be;
                case 23: goto L_0x07be;
                case 24: goto L_0x079d;
                case 25: goto L_0x03e6;
                case 26: goto L_0x0784;
                case 27: goto L_0x03e6;
                case 28: goto L_0x0771;
                case 29: goto L_0x0760;
                case 30: goto L_0x0758;
                case 31: goto L_0x0007;
                case 32: goto L_0x03a5;
                case 33: goto L_0x0007;
                case 34: goto L_0x0745;
                case 35: goto L_0x0730;
                case 36: goto L_0x0723;
                case 37: goto L_0x0717;
                case 38: goto L_0x0038;
                case 39: goto L_0x0632;
                case 40: goto L_0x05f7;
                case 41: goto L_0x05c4;
                case 42: goto L_0x05b1;
                case 43: goto L_0x0580;
                case 44: goto L_0x002c;
                case 45: goto L_0x0020;
                case 46: goto L_0x07eb;
                case 47: goto L_0x0573;
                case 48: goto L_0x0569;
                case 49: goto L_0x055f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            java.lang.String r0 = "https://faq.whatsapp.com/764072925284841"
            android.content.Intent r2 = X.C18300x5.A08(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r3.A0c
            X.03q r0 = r3.A0R()
            r1.A0A(r0, r2)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r0 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.4Cq r0 = r0.A04
            if (r0 == 0) goto L_0x001f
            r0.BOQ()
            return
        L_0x002c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.4Cq r0 = r0.A04
            if (r0 == 0) goto L_0x001f
            r0.BLw()
            return
        L_0x0038:
            java.lang.Object r8 = r1.A00
            com.whatsapp.crop.CropImage r8 = (com.whatsapp.crop.CropImage) r8
            X.5UE r0 = r8.A0M
            if (r0 == 0) goto L_0x001f
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x001f
            r10 = 1
            r8.A0X = r10
            com.whatsapp.crop.CropImageView r0 = r8.A0L
            r5 = 0
            r0.setEnabled(r5)
            com.whatsapp.crop.CropImageView r1 = r8.A0L
            java.util.ArrayList r0 = r1.A07
            r0.clear()
            r6 = 0
            r3 = 1
            X.2Xw r0 = new X.2Xw
            r0.<init>(r6)
            r1.A04(r0, r10)
            com.whatsapp.crop.CropImageView r0 = r8.A0L
            r0.A05 = r10
            android.graphics.Paint r9 = X.C86664Kz.A0Z()
            r9.setAntiAlias(r10)
            r9.setFilterBitmap(r10)
            r9.setDither(r10)
            X.5UE r0 = r8.A0M
            android.graphics.Rect r7 = r0.A01()
            int r11 = r8.A06
            java.lang.String r16 = "cropimage/cannot_resample: "
            java.lang.String r4 = "cropimage/oom: "
            java.lang.String r1 = "filter"
            java.lang.String r12 = "doodle"
            r15 = 0
            if (r11 == 0) goto L_0x0151
            int r2 = r8.A07
            if (r2 == 0) goto L_0x0151
            int r13 = r8.A09
            if (r13 <= r10) goto L_0x009e
            int r0 = r7.left
            int r0 = r0 * r13
            r7.left = r0
            int r0 = r7.right
            int r0 = r0 * r13
            r7.right = r0
            int r0 = r7.top
            int r0 = r0 * r13
            r7.top = r0
            int r0 = r7.bottom
            int r0 = r0 * r13
            r7.bottom = r0
        L_0x009e:
            boolean r0 = r8.A0Z
            if (r0 != 0) goto L_0x00b2
            int r13 = r7.width()
            int r0 = r8.A06
            if (r13 >= r0) goto L_0x00b2
            int r11 = r7.width()
            int r2 = r7.height()
        L_0x00b2:
            int r15 = r7.width()
            int r14 = r7.height()
            int r13 = r8.A06
            int r0 = r8.A07
            int r13 = X.C107245ax.A00(r15, r14, r13, r0, r10)
            int r0 = r7.left
            int r0 = r0 / r13
            r7.left = r0
            int r0 = r7.right
            int r0 = r0 / r13
            r7.right = r0
            int r0 = r7.top
            int r0 = r0 / r13
            r7.top = r0
            int r0 = r7.bottom
            int r0 = r0 / r13
            r7.bottom = r0
            int r0 = r8.A09
            if (r0 > r10) goto L_0x00f0
            if (r13 > r10) goto L_0x00f0
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r12)
            if (r0 != 0) goto L_0x00f0
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r5)
            if (r0 == 0) goto L_0x02d1
        L_0x00f0:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r6
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r5
            r1.inScaled = r5
            r1.inDither = r10
            r1.inPreferQualityOverSpeed = r10
            r10 = r13
        L_0x0105:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r13)
            if (r10 > r0) goto L_0x02d1
            r1.inSampleSize = r10
            X.53r r12 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
            java.io.InputStream r14 = r12.A0G(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r14, r6, r1)     // Catch:{ all -> 0x0128 }
            r8.A0B = r0     // Catch:{ all -> 0x0128 }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
            goto L_0x02d1
        L_0x0128:
            r12 = move-exception
            r14.close()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
        L_0x0131:
            throw r12     // Catch:{ OutOfMemoryError -> 0x0132, IOException -> 0x08e8 }
        L_0x0132:
            r12 = move-exception
            java.lang.String r0 = X.C18260x0.A05(r4, r10)
            com.whatsapp.util.Log.e(r0, r12)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x014b
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x014b
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r6
        L_0x014b:
            A00(r7)
            int r10 = r10 * 2
            goto L_0x0105
        L_0x0151:
            int r0 = r8.A09
            if (r0 <= r10) goto L_0x0158
            r8.A6D(r7)
        L_0x0158:
            int r0 = r8.A03
            r2 = 1
            if (r0 == 0) goto L_0x0177
        L_0x015d:
            int r0 = r7.width()
            int r11 = r0 / 2
            int r0 = r8.A03
            if (r11 > r0) goto L_0x0171
            int r0 = r7.height()
            int r11 = r0 / 2
            int r0 = r8.A03
            if (r11 <= r0) goto L_0x0177
        L_0x0171:
            int r2 = r2 * 2
            A00(r7)
            goto L_0x015d
        L_0x0177:
            int r0 = r8.A09
            if (r0 > r10) goto L_0x0191
            if (r2 > r10) goto L_0x0191
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r12)
            if (r0 != 0) goto L_0x0191
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r5)
            if (r0 == 0) goto L_0x0229
        L_0x0191:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r6
            r1 = r2
        L_0x0199:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r2)
            if (r1 > r0) goto L_0x0229
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options
            r12.<init>()
            r12.inSampleSize = r1
            r12.inJustDecodeBounds = r5
            r12.inScaled = r5
            r12.inDither = r10
            r12.inPreferQualityOverSpeed = r10
            X.53r r11 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
            java.io.InputStream r13 = r11.A0G(r0, r10)     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r13, r6, r12)     // Catch:{ all -> 0x01f3 }
            r8.A0B = r0     // Catch:{ all -> 0x01f3 }
            int r14 = r7.width()     // Catch:{ all -> 0x01f3 }
            int r12 = r7.height()     // Catch:{ all -> 0x01f3 }
            int r0 = r8.A03     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x01dd
            if (r14 > r0) goto L_0x01d4
            if (r12 <= r0) goto L_0x01dd
        L_0x01d4:
            if (r14 <= r12) goto L_0x01da
            int r12 = r12 * r0
            int r12 = r12 / r14
            r14 = r0
            goto L_0x01dd
        L_0x01da:
            int r14 = r14 * r0
            int r14 = r14 / r12
            r12 = r0
        L_0x01dd:
            android.graphics.Bitmap r0 = r8.A0B     // Catch:{ all -> 0x01f3 }
            android.graphics.Bitmap$Config r11 = r0.getConfig()     // Catch:{ all -> 0x01f3 }
            boolean r0 = r8.A0S     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01e9
            if (r11 != 0) goto L_0x01eb
        L_0x01e9:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01f3 }
        L_0x01eb:
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r14, r12, r11)     // Catch:{ all -> 0x01f3 }
            r13.close()     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
            goto L_0x0229
        L_0x01f3:
            r11 = move-exception
            r13.close()     // Catch:{ all -> 0x01f8 }
            goto L_0x01fc
        L_0x01f8:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
        L_0x01fc:
            throw r11     // Catch:{ OutOfMemoryError -> 0x01fd, IOException -> 0x08e8 }
        L_0x01fd:
            r11 = move-exception
            java.lang.String r0 = X.C18260x0.A05(r4, r1)
            com.whatsapp.util.Log.e(r0, r11)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0216
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0216
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r6
        L_0x0216:
            if (r15 == 0) goto L_0x0222
            boolean r0 = r15.isRecycled()
            if (r0 != 0) goto L_0x0222
            r15.recycle()
            r15 = r6
        L_0x0222:
            A00(r7)
            int r1 = r1 * 2
            goto L_0x0199
        L_0x0229:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x02b4
            int r10 = r7.width()
            int r2 = r7.height()
            int r0 = r8.A03
            if (r0 == 0) goto L_0x0242
            if (r10 > r0) goto L_0x023d
            if (r2 <= r0) goto L_0x0242
        L_0x023d:
            if (r10 <= r2) goto L_0x02b0
            int r2 = r2 * r0
            int r2 = r2 / r10
            r10 = r0
        L_0x0242:
            if (r15 != 0) goto L_0x0256
            android.graphics.Bitmap r0 = r8.A0B
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x0250
            if (r1 != 0) goto L_0x0252
        L_0x0250:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0252:
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r10, r2, r1)
        L_0x0256:
            android.graphics.Canvas r6 = X.AnonymousClass4L0.A06(r15)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r5, r5, r10, r2)
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x02a9
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x02a9
            android.graphics.Matrix r10 = X.AnonymousClass002.A05()
            int r1 = r4.left
            int r0 = r4.right
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 / 2
            float r2 = (float) r0
            int r1 = r4.top
            int r0 = r4.bottom
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 / 2
            float r0 = (float) r0
            r10.preTranslate(r2, r0)
            android.graphics.Matrix r0 = r8.A0D
            r10.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r10.postRotate(r0)
            int r1 = r4.left
            int r0 = r4.right
            int r1 = r1 + r0
            int r0 = r1 / 2
            float r2 = (float) r0
            int r1 = r4.top
            int r0 = r4.bottom
            int r1 = r1 + r0
            int r0 = r1 / 2
            float r0 = (float) r0
            r10.postTranslate(r2, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4)
            r10.mapRect(r0)
            r6.setMatrix(r10)
        L_0x02a9:
            android.graphics.Bitmap r0 = r8.A0B
            r6.drawBitmap(r0, r7, r4, r9)
            goto L_0x0367
        L_0x02b0:
            int r10 = r10 * r0
            int r10 = r10 / r2
            r2 = r0
            goto L_0x0242
        L_0x02b4:
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "error-oom"
            android.content.Intent r2 = r1.putExtra(r0, r3)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889108(0x7f120bd4, float:1.941287E38)
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r8.setResult(r5, r0)
            goto L_0x03a1
        L_0x02d1:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x02b4
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != 0) goto L_0x02dd
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x02dd:
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r11, r2, r0)
            android.graphics.Canvas r6 = X.AnonymousClass4L0.A06(r15)
            float r1 = (float) r11
            float r0 = (float) r2
            android.graphics.RectF r4 = X.C86664Kz.A0b(r1, r0)
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x0323
            int r0 = r7.width()
            float r1 = (float) r0
            float r0 = r4.width()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r10 = r0 / 2
            int r0 = r7.height()
            float r1 = (float) r0
            float r0 = r4.height()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r2 = r0 / 2
            int r1 = java.lang.Math.max(r5, r10)
            int r0 = java.lang.Math.max(r5, r2)
            r7.inset(r1, r0)
            int r0 = -r10
            int r0 = java.lang.Math.max(r5, r0)
            float r1 = (float) r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            float r0 = (float) r0
            r4.inset(r1, r0)
        L_0x0323:
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x0362
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0362
            android.graphics.Matrix r10 = X.AnonymousClass002.A05()
            float r1 = r4.left
            float r0 = r4.right
            float r1 = r1 + r0
            float r2 = -r1
            r11 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r11
            float r1 = r4.top
            float r0 = r4.bottom
            float r1 = r1 + r0
            float r0 = -r1
            float r0 = r0 / r11
            r10.preTranslate(r2, r0)
            android.graphics.Matrix r0 = r8.A0D
            r10.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r10.postRotate(r0)
            float r2 = r4.left
            float r0 = r4.right
            float r2 = r2 + r0
            float r2 = r2 / r11
            float r1 = r4.top
            float r0 = r4.bottom
            float r1 = r1 + r0
            float r1 = r1 / r11
            r10.postTranslate(r2, r1)
            r10.mapRect(r4)
            r6.setMatrix(r10)
        L_0x0362:
            android.graphics.Bitmap r0 = r8.A0B
            r6.drawBitmap(r0, r7, r4, r9)
        L_0x0367:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x036e
            r0.recycle()
        L_0x036e:
            if (r15 != 0) goto L_0x0377
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A0C()
            r8.setResult(r5, r0)
        L_0x0377:
            X.5UE r0 = r8.A0M
            if (r0 == 0) goto L_0x001f
            android.graphics.Rect r10 = r0.A01()
            int r0 = r8.A09
            if (r0 <= r3) goto L_0x0386
            r8.A6D(r10)
        L_0x0386:
            android.net.Uri r9 = r8.A0F
            if (r9 != 0) goto L_0x08f9
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r10)
            java.lang.String r1 = "rotate"
            int r0 = r8.A08
            r2.putExtra(r1, r0)
            r0 = -1
            r8.setResult(r0, r2)
            r15.recycle()
        L_0x03a1:
            r8.finish()
            return
        L_0x03a5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsFragment r0 = (com.whatsapp.conversationslist.LockedConversationsFragment) r0
            android.view.View r1 = r0.A00
            if (r1 != 0) goto L_0x03e0
            return
        L_0x03ae:
            java.lang.Object r3 = r1.A00
            X.4pt r3 = (X.C94094pt) r3
            X.4Wk r2 = r3.A05
            int r0 = r2.A00
            r2.A06(r0)
            int r0 = r3.A01()
            r2.A00 = r0
            android.widget.RadioButton r1 = r3.A00
            r0 = 1
            r1.setChecked(r0)
            X.7HX r0 = r2.A01
            if (r0 == 0) goto L_0x001f
            r3.A01()
            android.view.View r2 = r0.A00
            r0 = 2131433437(0x7f0b17dd, float:1.848866E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r0)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131434161(0x7f0b1ab1, float:1.8490128E38)
            android.view.View r1 = X.C06560Yg.A02(r2, r0)
        L_0x03e0:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03e6:
            java.lang.Object r5 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.03q r4 = r5.A0Q()
            X.4PD r0 = r5.A1O
            if (r0 == 0) goto L_0x001f
            if (r4 == 0) goto L_0x001f
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r4 instanceof X.C89644eZ
            if (r0 == 0) goto L_0x001f
            X.4eZ r4 = (X.C89644eZ) r4
            X.5aW r3 = X.C86624Kv.A0O(r5)
            X.4kR r2 = X.C91604kR.A00
            X.5k0 r1 = new X.5k0
            r1.<init>(r4, r5)
            r0 = 4
            r3.A08(r4, r2, r1, r0)
            return
        L_0x0410:
            java.lang.Object r3 = r1.A00
            X.5l7 r3 = (X.C113245l7) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2f
            r0 = 0
            r1.onWindowFocusChanged(r0)
            X.4On r2 = X.C113245l7.A0A(r3)
            X.4VQ r0 = r3.A3B
            java.util.ArrayList r0 = r0.A1H
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x001f
            java.util.Set r0 = r2.A0b
            r0.clear()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2f
            int r1 = r0.getFirstVisiblePosition()
            X.34x r7 = r2.getItem(r1)
            if (r7 == 0) goto L_0x0445
            X.2z0 r0 = r7.A1J
            X.4uZ r0 = r0.A00
            if (r0 != 0) goto L_0x0445
            int r0 = r1 + 1
            X.34x r7 = r2.getItem(r0)
        L_0x0445:
            X.4VQ r9 = r3.A3B
            int r13 = r3.A0S()
            int r14 = r2.A01()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2f
            int r15 = r0.getFirstVisiblePosition()
            int r16 = r2.getCount()
            java.util.ArrayList r6 = r9.A1H
            boolean r0 = X.AnonymousClass0x7.A1S(r6)
            if (r0 == 0) goto L_0x001f
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            if (r7 == 0) goto L_0x0924
            java.util.Iterator r8 = r6.iterator()
        L_0x046b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0924
            X.34x r5 = X.C18300x5.A0T(r8)
            long r2 = r5.A1M
            long r0 = r7.A1M
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x046b
            X.2z0 r0 = r5.A1J
            r12.add(r0)
            goto L_0x046b
        L_0x0483:
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            X.2aG r1 = r4.A5T
            r0 = 1
            r1.A00(r0)
            X.2sq r1 = r4.A27
            X.4uZ r0 = r4.A4J
            boolean r0 = X.C86614Ku.A1X(r1, r0)
            if (r0 == 0) goto L_0x04a1
            X.4eZ r1 = X.C113245l7.A09(r4)
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x04a1:
            r4.A18()
            X.1VX r0 = r4.A41
            r5 = 0
            boolean r0 = X.C86614Ku.A1Y(r0)
            if (r0 == 0) goto L_0x0931
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r4.A3v
            if (r0 == 0) goto L_0x04b4
            r0.A00()
        L_0x04b4:
            X.4fS r0 = r4.A2a
            X.4c6 r1 = r0.A02
            if (r1 == 0) goto L_0x04c6
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x04da
            com.whatsapp.WaEditText r0 = r1.A05
            r1.A06(r0)
            return
        L_0x04c6:
            r5 = 1
            boolean r0 = r4.A2X()
            if (r0 == 0) goto L_0x0931
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A40
            if (r0 == 0) goto L_0x0931
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0931
            goto L_0x04ec
        L_0x04da:
            boolean r0 = r4.A2X()
            if (r0 == 0) goto L_0x050e
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A40
            if (r0 == 0) goto L_0x050e
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x050e
        L_0x04ec:
            com.whatsapp.KeyboardPopupLayout r1 = r4.A1a
            r0 = 1
            r1.A07 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A0t
            if (r1 == 0) goto L_0x04f9
            r0 = 5
            r1.A0S(r0)
        L_0x04f9:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A1a
            r0 = 28
            X.3cX r2 = new X.3cX
            r2.<init>((int) r0, (java.lang.Object) r4, (boolean) r5)
            r1 = 1133903872(0x43960000, float:300.0)
            float r0 = r4.A0R()
            float r0 = r0 * r1
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x050e:
            X.4fS r3 = r4.A2a
            X.4c6 r2 = r3.A02
            if (r2 == 0) goto L_0x001f
            X.4uZ r1 = r3.A0W
            com.whatsapp.community.ConversationCommunityViewModel r0 = r3.A0I
            r2.A0A(r0, r3, r1)
            return
        L_0x051c:
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            X.2aG r1 = r4.A5T
            r0 = 8
            r1.A00(r0)
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            int r3 = r0.getLastVisiblePosition()
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            int r1 = r0.getCount()
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            int r0 = r0.getFooterViewsCount()
            int r1 = r1 - r0
            int r0 = r1 + -1
            r2 = 2
            if (r3 < r0) goto L_0x054a
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            r0.setTranscriptMode(r2)
            com.whatsapp.conversation.ConversationListView r1 = r4.A2f
            r0 = 1
            r1.A0A(r0)
        L_0x054a:
            r4.A18()
            boolean r0 = r4.A2X()
            if (r0 == 0) goto L_0x001f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0t
            if (r0 == 0) goto L_0x001f
            int r0 = r0.A0O
            if (r0 == r2) goto L_0x001f
            r4.A0d()
            return
        L_0x055f:
            java.lang.Object r1 = r1.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            goto L_0x075c
        L_0x0569:
            java.lang.Object r1 = r1.A00
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.4Cr r0 = r1.A00
            r0.BfD()
            goto L_0x057c
        L_0x0573:
            java.lang.Object r1 = r1.A00
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.4Cr r0 = r1.A00
            r0.BMl()
        L_0x057c:
            r1.A1K()
            return
        L_0x0580:
            java.lang.Object r2 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r2 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r2
            X.214 r1 = r2.A1Y()
            X.214 r0 = X.AnonymousClass214.BLOCKING_DISCLOSURE
            if (r1 != r0) goto L_0x05a2
            X.2zw r1 = r2.A04
            X.4uZ r0 = r2.A03
            r1.A01(r0)
        L_0x0593:
            X.4Cq r0 = r2.A04
            if (r0 == 0) goto L_0x059a
            r0.BLw()
        L_0x059a:
            X.2q9 r3 = r2.A1a()
            X.4uZ r1 = r2.A03
            r0 = 0
            goto L_0x05e5
        L_0x05a2:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0593
            X.2zw r1 = r2.A04
            X.4uZ r0 = r2.A03
            r1.A01(r0)
            r0 = 1
            r2.A02 = r0
            goto L_0x0593
        L_0x05b1:
            java.lang.Object r1 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r1
            X.4Cq r0 = r1.A04
            if (r0 == 0) goto L_0x05bc
            r0.BOQ()
        L_0x05bc:
            X.2q9 r3 = r1.A1a()
            X.4uZ r1 = r1.A03
            r0 = 1
            goto L_0x05e5
        L_0x05c4:
            java.lang.Object r4 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r4
            X.5hX r3 = r4.A00
            if (r3 == 0) goto L_0x05f0
            android.content.Context r2 = r4.A0G()
            X.5X8 r1 = r4.A02
            if (r1 == 0) goto L_0x05e9
            java.lang.String r0 = "https://faq.whatsapp.com/785493319976156"
            android.net.Uri r1 = r1.A00(r0)
            r0 = 0
            r3.BkW(r2, r1, r0)
            X.2q9 r3 = r4.A1a()
            X.4uZ r1 = r4.A03
            r0 = 2
        L_0x05e5:
            r3.A01(r1, r0)
            return
        L_0x05e9:
            java.lang.String r0 = "waLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05f0:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05f7:
            java.lang.Object r4 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment) r4
            X.2uz r1 = r4.A01
            if (r1 == 0) goto L_0x062b
            X.214 r3 = r4.A1Y()
            X.214 r0 = X.AnonymousClass214.BLOCKING_DISCLOSURE
            if (r3 == r0) goto L_0x0627
            X.4FV r2 = r1.A00
            X.1YF r1 = new X.1YF
            r1.<init>()
            int r0 = X.C58272uz.A00(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A00 = r0
            java.lang.Long r0 = X.AnonymousClass0x2.A0U()
            r1.A02 = r0
            r2.BhD(r1)
        L_0x0627:
            r4.A1K()
            return
        L_0x062b:
            java.lang.String r0 = "dataSharingCtwaDisclosureLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0632:
            java.lang.Object r3 = r1.A00
            com.whatsapp.crop.CropImage r3 = (com.whatsapp.crop.CropImage) r3
            int r0 = r3.A08
            int r0 = r0 + 270
            int r0 = r0 % 360
            r3.A08 = r0
            android.content.Context r6 = r25.getContext()
            X.33i r5 = r3.A0I
            android.content.Context r4 = r25.getContext()
            int r2 = r3.A08
            r0 = 90
            r1 = 2131892574(0x7f12195e, float:1.94199E38)
            if (r2 == r0) goto L_0x0662
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 2131892572(0x7f12195c, float:1.9419896E38)
            if (r2 == r0) goto L_0x0662
            r0 = 270(0x10e, float:3.78E-43)
            r1 = 2131892573(0x7f12195d, float:1.9419898E38)
            if (r2 == r0) goto L_0x0662
            r1 = 2131892565(0x7f121955, float:1.9419882E38)
        L_0x0662:
            java.lang.String r0 = r4.getString(r1)
            X.C107295b4.A00(r6, r5, r0)
            r15 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r0 = r3.A0L
            android.graphics.Matrix r0 = r0.getImageViewMatrix()
            r0.mapRect(r5)
            android.graphics.Matrix r1 = r3.A0C
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r1.postRotate(r0)
            com.whatsapp.crop.CropImageView r4 = r3.A0L
            android.graphics.Bitmap r0 = r3.A0B
            X.2Xw r2 = new X.2Xw
            r2.<init>(r0)
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            android.graphics.Matrix r0 = r3.A0D
            r1.set(r0)
            android.graphics.Matrix r0 = r3.A0C
            r1.postConcat(r0)
            r2.A01 = r1
            r0 = 0
            r4.A04(r2, r0)
            X.5UE r2 = r3.A0M
            if (r2 == 0) goto L_0x06ba
            com.whatsapp.crop.CropImageView r0 = r3.A0L
            android.graphics.Matrix r1 = r0.getImageMatrix()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r2.A03 = r0
            android.graphics.Rect r0 = r2.A03()
            r2.A04 = r0
            android.view.View r0 = r2.A07
            r0.invalidate()
        L_0x06ba:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r0 = r3.A0L
            android.graphics.Matrix r0 = r0.getImageViewMatrix()
            r0.mapRect(r4)
            float r2 = r5.width()
            float r0 = r4.width()
            float r2 = r2 / r0
            float r1 = r5.height()
            float r0 = r4.height()
            float r5 = X.C86664Kz.A00(r1, r0, r2)
            X.5UE r1 = r3.A0M
            if (r1 == 0) goto L_0x06e6
            com.whatsapp.crop.CropImageView r0 = r3.A0L
            r0.A06(r1)
        L_0x06e6:
            r9 = 1
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r9)
            r14 = 1119092736(0x42b40000, float:90.0)
            r10 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r13 = new android.view.animation.RotateAnimation
            r18 = r9
            r19 = r10
            r16 = r9
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r7 = r5
            r8 = r6
            r11 = r9
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.addAnimation(r13)
            r2.addAnimation(r4)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            com.whatsapp.crop.CropImageView r0 = r3.A0L
            r0.startAnimation(r2)
            return
        L_0x0717:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0723:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            goto L_0x073c
        L_0x0730:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "package:com.whatsapp"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DELETE"
        L_0x073c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
        L_0x0745:
            java.lang.Object r1 = r1.A00
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x0753
            r0 = 0
            r1.setSelected(r0)
        L_0x0753:
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x0758:
            java.lang.Object r1 = r1.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
        L_0x075c:
            X.C86654Ky.A1C(r1)
            return
        L_0x0760:
            java.lang.Object r0 = r1.A00
            X.4Oj r0 = (X.C87194Oj) r0
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A08
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0L
            X.0R6 r1 = r0.A0N
            X.4Wl r1 = (X.C87874Wl) r1
            r0 = 0
            r1.A0K(r0)
            return
        L_0x0771:
            java.lang.Object r3 = r1.A00
            X.0eF r3 = (X.C08310eF) r3
            X.03q r0 = r3.A0Q()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.SettingsGoogleDrive"
            goto L_0x0796
        L_0x0784:
            java.lang.Object r3 = r1.A00
            X.0eF r3 = (X.C08310eF) r3
            X.03q r0 = r3.A0Q()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
        L_0x0796:
            r2.setClassName(r1, r0)
            r3.A0m(r2)
            return
        L_0x079d:
            java.lang.Object r4 = r1.A00
            X.0eF r4 = (X.C08310eF) r4
            X.03q r0 = r4.A0R()
            java.lang.String r3 = "archived_chats"
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "scroll_to_setting"
            r1.putExtra(r0, r3)
            r4.A0m(r1)
            return
        L_0x07be:
            java.lang.Object r0 = r1.A00
            com.whatsapp.components.WaSwitchView r0 = (com.whatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
            return
        L_0x07c8:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
            return
        L_0x07d0:
            java.lang.Object r2 = r1.A00
            X.5Ui r2 = (X.C105295Ui) r2
            r0 = 1
            X.4s5 r1 = new X.4s5
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.4FV r0 = r2.A07
            r0.BhD(r1)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A06
            r0.A1U()
            return
        L_0x07eb:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x07f3:
            java.lang.Object r2 = r1.A00
            X.4pr r2 = (X.C94084pr) r2
            r1 = 0
            r0 = 0
            r2.setResult(r0, r1)
            r2.finish()
            return
        L_0x0800:
            java.lang.Object r0 = r1.A00
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x0806:
            java.lang.Object r0 = r1.A00
            X.4pm r0 = (X.C94054pm) r0
            r0.BFg()
            return
        L_0x080e:
            java.lang.Object r0 = r1.A00
            X.5UU r0 = (X.AnonymousClass5UU) r0
            r0.A02()
            return
        L_0x0816:
            java.lang.Object r4 = r1.A00
            X.5UU r4 = (X.AnonymousClass5UU) r4
            X.3ZH r0 = r4.A00
            X.4uZ r3 = X.C86604Kt.A0a(r0)
            X.2sD r2 = r4.A0H
            boolean r1 = r4.A01
            java.lang.Integer r0 = X.C18290x4.A0c()
            r2.A02(r3, r0, r1)
            java.lang.Runnable r0 = r4.A0J
            r0.run()
            return
        L_0x0831:
            java.lang.Object r0 = r1.A00
            X.69y r0 = (X.C1238369y) r0
            java.lang.Object r1 = r0.A00
            X.5l7 r1 = (X.C113245l7) r1
            r0 = 0
            goto L_0x0844
        L_0x083b:
            java.lang.Object r0 = r1.A00
            X.69y r0 = (X.C1238369y) r0
            java.lang.Object r1 = r0.A00
            X.5l7 r1 = (X.C113245l7) r1
            r0 = 1
        L_0x0844:
            r1.A2L(r0)
            return
        L_0x0848:
            java.lang.Object r1 = r1.A00
            X.5l7 r1 = (X.C113245l7) r1
            X.676 r4 = r1.A2z
            X.4eZ r0 = r4.getActivity()
            X.4uZ r3 = r1.A4J
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity"
            X.C86604Kt.A13(r2, r3, r1, r0)
            r4.startActivity(r2)
            return
        L_0x0865:
            java.lang.Object r2 = r1.A00
            X.5l7 r2 = (X.C113245l7) r2
            boolean r0 = r2.A6S
            if (r0 == 0) goto L_0x087f
            X.1VX r1 = r2.A41
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x087f
            X.4Cs r0 = r2.A7A
            if (r0 == 0) goto L_0x087f
            r0.BgM()
            return
        L_0x087f:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            if (r0 != 0) goto L_0x0892
            r2.A1B()
            android.widget.ImageButton r1 = r2.A0f
            r0 = 46
            X.5sD r0 = X.C117615sD.A00(r2, r0)
            r1.post(r0)
            return
        L_0x0892:
            r2.A1F()
            return
        L_0x0896:
            java.lang.Object r1 = r1.A00
            X.5l7 r1 = (X.C113245l7) r1
            r0 = 0
            r1.A2J(r0)
            return
        L_0x089f:
            java.lang.Object r3 = r1.A00
            X.5l7 r3 = (X.C113245l7) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2f
            r0 = 0
            r1.onWindowFocusChanged(r0)
            java.util.Stack r1 = r3.A7O
            boolean r0 = r1.empty()
            if (r0 == 0) goto L_0x08b8
            com.whatsapp.conversation.ConversationListView r1 = r3.A2f
            r0 = 1
            r1.A0A(r0)
            return
        L_0x08b8:
            java.lang.Object r0 = r1.pop()
            X.7Ki r0 = (X.C148947Ki) r0
            X.34x r2 = r0.A02
            int r1 = r0.A00
            r0 = 0
            r3.A22(r2, r0, r1)
            return
        L_0x08c7:
            java.lang.Object r2 = r1.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.2aG r0 = r2.A5T
            r1 = 2
            r0.A00(r1)
            X.4fS r0 = r2.A2a
            r0.A09(r1)
            return
        L_0x08d7:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.33p r0 = r0.A3K
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "newsletter_wait_list_subscription"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x08e8:
            r1 = move-exception
            r0 = r16
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A0C()
            r8.setResult(r5, r0)
            r8.finish()
            return
        L_0x08f9:
            X.4FS r7 = r8.A04
            X.2zf r6 = r8.A0K
            X.33i r5 = r8.A0I
            android.graphics.Bitmap$CompressFormat r4 = r8.A0A
            int r3 = r8.A04
            boolean r2 = r8.A0U
            int r1 = r8.A02
            int r0 = r8.A08
            X.1tU r12 = new X.1tU
            r13 = r8
            r14 = r4
            r16 = r10
            r17 = r9
            r18 = r5
            r19 = r6
            r20 = r3
            r21 = r1
            r22 = r0
            r23 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.AnonymousClass0x7.A1B(r12, r7)
            return
        L_0x0924:
            java.lang.Object r11 = X.AnonymousClass0x9.A0t(r6)
            X.34x r11 = (X.C624134x) r11
            r17 = 1
            r10 = 0
            r9.A0P(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0931:
            X.4fS r2 = r4.A2a
            android.widget.ImageButton r1 = r4.A0g
            r0 = 3
            r2.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109355eU.onClick(android.view.View):void");
    }
}
