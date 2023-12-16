package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.33O  reason: invalid class name */
public class AnonymousClass33O {
    public C34121uG A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C620633i A03;
    public final C57162tC A04;
    public final AnonymousClass1VX A05;
    public final C55782qu A06;
    public final C59962xm A07;
    public final C55732qp A08;
    public final C147367Ea A09 = new C147367Ea();
    public final AnonymousClass33Q A0A;
    public final WebpUtils A0B;
    public final AnonymousClass7O6 A0C;
    public final C53062mU A0D;
    public final AnonymousClass2X1 A0E;
    public final C45552aC A0F;
    public final ConcurrentHashMap A0G;
    public final ConcurrentHashMap A0H;

    public void A04(Context context, AnonymousClass39M r15, C183098pU r16, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        String A002 = A00(r15, i3, i4);
        A06((C69263Wi) null, this.A03, new C137796pH(context, r15, r16, A002, i3, i4), this.A0B, (Map) null);
    }

    public static String A00(AnonymousClass39M r5, int i, int i2) {
        StringBuilder A0v;
        String str = r5.A0D;
        if (str != null) {
            A0v = AnonymousClass001.A0o();
            A0v.append(str.replace("/", "-"));
        } else {
            A0v = C18290x4.A0v(r5);
        }
        A0v.append("_");
        A0v.append(i);
        return AnonymousClass000.A0Y("_", A0v, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0148, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x014f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x012c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C64393Dh r11, X.C620633i r12, X.AnonymousClass39M r13, com.whatsapp.stickers.WebpUtils r14) {
        /*
            java.lang.String r0 = r13.A09
            r10 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData filePath is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000a:
            return r10
        L_0x000b:
            r0 = 0
            X.C162457s7.A0J(r12, r0)     // Catch:{ IOException -> 0x015f }
            X.C18260x0.A0Q(r14, r11)     // Catch:{ IOException -> 0x015f }
            java.lang.String r6 = r13.A09     // Catch:{ IOException -> 0x015f }
            if (r6 == 0) goto L_0x013b
            int r0 = r6.length()     // Catch:{ IOException -> 0x015f }
            if (r0 == 0) goto L_0x013b
            int r1 = r13.A01     // Catch:{ IOException -> 0x015f }
            r0 = 3
            if (r1 != r0) goto L_0x0073
            X.5UR r1 = r12.A0R()     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = r13.A09     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            java.io.InputStream r3 = r1.A06(r0)     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            goto L_0x0033
        L_0x0032:
            r3 = r10
        L_0x0033:
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x004f
            X.C627536m.A0I(r3, r2)     // Catch:{ all -> 0x0048 }
            byte[] r9 = r2.toByteArray()     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ all -> 0x0054 }
            r3.close()     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            goto L_0x013e
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x004f:
            r2.close()     // Catch:{ all -> 0x0054 }
            goto L_0x013d
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
            throw r0     // Catch:{ IOException -> 0x006b, SecurityException -> 0x0063, IllegalArgumentException -> 0x005b }
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015f }
            goto L_0x013d
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/SecurityException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015f }
            goto L_0x013d
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IOException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015f }
            goto L_0x013d
        L_0x0073:
            r9 = 0
            java.io.File r8 = X.AnonymousClass002.A0B(r6)     // Catch:{ IOException -> 0x015f }
            boolean r0 = r8.exists()     // Catch:{ IOException -> 0x015f }
            if (r0 == 0) goto L_0x00d1
            long r0 = r8.length()     // Catch:{ IOException -> 0x015f }
            r2 = 1048576(0x100000, double:5.180654E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x010a
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x015f }
            java.lang.String r4 = "Sticker/getImageDataFromFile/sticker is above legal size limit: "
            r5.append(r4)     // Catch:{ IOException -> 0x015f }
            r5.append(r2)     // Catch:{ IOException -> 0x015f }
            java.lang.String r4 = ", hash: "
            r5.append(r4)     // Catch:{ IOException -> 0x015f }
            java.lang.String r4 = r13.A0D     // Catch:{ IOException -> 0x015f }
            X.C18260x0.A1L(r5, r4)     // Catch:{ IOException -> 0x015f }
            java.lang.String r5 = r13.A0D     // Catch:{ IOException -> 0x015f }
            java.lang.String r4 = r13.A0G     // Catch:{ IOException -> 0x015f }
            java.io.File r7 = r11.A0W(r5, r4)     // Catch:{ IOException -> 0x015f }
            if (r7 != 0) goto L_0x00b0
            java.lang.String r0 = "Sticker/getImageDataFromFile/could not get sticker thumbnail file"
        L_0x00ab:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x015f }
            goto L_0x013e
        L_0x00b0:
            boolean r4 = r7.exists()     // Catch:{ IOException -> 0x015f }
            if (r4 != 0) goto L_0x0109
            boolean r0 = r13.A0L     // Catch:{ IOException -> 0x015f }
            if (r0 != 0) goto L_0x00ce
            int r0 = r14.A01(r6)     // Catch:{ IOException -> 0x015f }
            long r0 = (long) r0     // Catch:{ IOException -> 0x015f }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "Sticker/getImageDataFromFile/even first frame is above legal size limit: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)     // Catch:{ IOException -> 0x015f }
            goto L_0x00ab
        L_0x00ce:
            java.lang.String r0 = "Sticker/getImageDataFromFile/lottie sticker exceeds sticker file limit"
            goto L_0x00ab
        L_0x00d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "Sticker/getImageDataFromFile/sticker file cannot be found, "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ IOException -> 0x015f }
            goto L_0x00ab
        L_0x00dc:
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r8)     // Catch:{ IOException -> 0x015f }
            X.6uL r6 = new X.6uL     // Catch:{ IOException -> 0x015f }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x015f }
            java.io.ByteArrayOutputStream r5 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x0149 }
            X.C627536m.A0I(r6, r5)     // Catch:{ all -> 0x0142 }
            byte[] r4 = r5.toByteArray()     // Catch:{ all -> 0x0142 }
            int r3 = (int) r0     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x0142 }
            boolean r2 = r14.A04(r2, r4, r3)     // Catch:{ all -> 0x0142 }
            if (r2 == 0) goto L_0x0102
            r5.close()     // Catch:{ all -> 0x0149 }
            r6.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0109
        L_0x0102:
            r5.close()     // Catch:{ all -> 0x0149 }
            r6.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x013e
        L_0x0109:
            r8 = r7
        L_0x010a:
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r8)     // Catch:{ OutOfMemoryError -> 0x0134 }
            X.6uL r3 = new X.6uL     // Catch:{ OutOfMemoryError -> 0x0134 }
            r3.<init>(r2, r0)     // Catch:{ OutOfMemoryError -> 0x0134 }
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x012d }
            X.C627536m.A0I(r3, r2)     // Catch:{ all -> 0x0126 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0126 }
            r2.close()     // Catch:{ all -> 0x012d }
            r3.close()     // Catch:{ OutOfMemoryError -> 0x0134 }
            r9 = r0
            goto L_0x013e
        L_0x0126:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0134 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromFile/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015f }
            goto L_0x013e
        L_0x013b:
            r9 = 0
            goto L_0x013e
        L_0x013d:
            r9 = r10
        L_0x013e:
            r10 = r9
            if (r9 != 0) goto L_0x000a
            goto L_0x0150
        L_0x0142:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ IOException -> 0x015f }
            throw r0     // Catch:{ IOException -> 0x015f }
        L_0x0150:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker file does not exist: "
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = r13.A0D     // Catch:{ IOException -> 0x015f }
            X.C18260x0.A1M(r1, r0)     // Catch:{ IOException -> 0x015f }
            return r10
        L_0x015f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker IOException when getting image data: "
            r1.append(r0)
            java.lang.String r0 = r13.A0D
            X.C18260x0.A15(r0, r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33O.A01(X.3Dh, X.33i, X.39M, com.whatsapp.stickers.WebpUtils):byte[]");
    }

    public final Drawable A02(C152657Zu r22, String str, byte[] bArr) {
        int min;
        int i;
        AnonymousClass39M r7;
        AnonymousClass330 r0;
        String str2;
        ConcurrentHashMap concurrentHashMap = this.A0G;
        C152657Zu r1 = r22;
        String str3 = r1.A05;
        Reference reference = (Reference) concurrentHashMap.get(str3);
        if (reference != null) {
            AnonymousClass7XO r5 = (AnonymousClass7XO) reference.get();
            if (r5 != null) {
                return new AnonymousClass6D5(r5);
            }
            concurrentHashMap.remove(str3);
        }
        byte[] bArr2 = bArr;
        WebPImage A002 = AnonymousClass33Q.A00(bArr2);
        if (A002 != null) {
            Integer num = r1.A04;
            boolean z = false;
            if (num != null && r1.A03.A0J) {
                boolean z2 = false;
                if (A002.getFrameCount() > 1) {
                    z2 = true;
                }
                this.A06.A01.markerAnnotate(354170068, num.intValue(), C137486ol.A00.A00, z2);
            }
            AnonymousClass1VX r10 = this.A05;
            C58422vE r9 = C58422vE.A02;
            if (r10.A0Y(r9, 295) && !((r0 = (r7 = r1.A03).A04) == null && ((str2 = r7.A09) == null || (r0 = this.A08.A01(r7.A04(), str2)) == null))) {
                z = !r0.A09;
            }
            String str4 = str;
            if (A002.getFrameCount() == 1 || z) {
                Bitmap A052 = this.A0A.A05(str4, bArr2, r1.A02, r1.A00);
                if (A052 != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(A052);
                    this.A0H.put(str3, new SoftReference(bitmapDrawable));
                    return bitmapDrawable;
                }
                C18260x0.A0r("StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: ", str4, AnonymousClass001.A0o());
            } else {
                if (r10.A0Y(r9, 276)) {
                    min = Math.min(512, r1.A02);
                    i = Math.min(512, r1.A00);
                    if (r1.A07) {
                        min = (int) (((float) min) / 2.0f);
                        i = (int) (((float) i) / 2.0f);
                    }
                    C18260x0.A0q(", hash=", str4, C18270x1.A0W(min, "StickerImageLoader/loadAnimatedSticker/load sticker size="));
                } else {
                    min = Math.min(512, r1.A00().getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                    i = min;
                }
                AnonymousClass33Q r12 = this.A0A;
                String A012 = AnonymousClass33Q.A01(str3, min, i);
                Bitmap A042 = r12.A04(A012);
                if (!(A042 == null && (A042 = r12.A02(A002, A012, min, i)) == null)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass0x2.A1M(A0o, str4);
                    A0o.append("_");
                    A0o.append(min);
                    AnonymousClass7XO r13 = new AnonymousClass7XO(A042, A002, this.A02, this.A0C, AnonymousClass000.A0Y("_", A0o, i), min, i);
                    concurrentHashMap.put(str3, AnonymousClass0x9.A14(r13));
                    return new AnonymousClass6D5(r13);
                }
            }
        }
        return null;
    }

    public void A03() {
        C34121uG r1 = this.A00;
        if (r1 != null) {
            r1.A01 = true;
            r1.interrupt();
            this.A00 = null;
        }
        C147367Ea r12 = this.A09;
        synchronized (r12) {
            r12.A00.clear();
        }
        AnonymousClass7O6 r13 = this.A0C;
        C138286q4 r0 = r13.A00;
        if (r0 != null) {
            r0.A00();
            r13.A00 = null;
        }
    }

    public void A05(ImageView imageView, AnonymousClass39M r21, C183108pV r22, int i, int i2, int i3, boolean z, boolean z2) {
        Integer num;
        PriorityQueue priorityQueue;
        Drawable drawable;
        AnonymousClass39M r10 = r21;
        if (r10.A0J) {
            C55782qu r2 = this.A06;
            int A002 = r2.A00();
            num = Integer.valueOf(A002);
            r2.A01(A002, "start_sticker_loading");
        } else {
            num = null;
        }
        int i4 = i2;
        int i5 = i3;
        String A003 = A00(r10, i4, i5);
        ImageView imageView2 = imageView;
        imageView2.setTag(A003);
        C147367Ea r23 = this.A09;
        synchronized (r23) {
            priorityQueue = r23.A00;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                if (((C32601rJ) it.next()).A00 == imageView2) {
                    it.remove();
                }
            }
        }
        Drawable drawable2 = imageView2.getDrawable();
        Reference reference = (Reference) this.A0H.get(A003);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            drawable = null;
            if (r10.A0D != null) {
                ConcurrentHashMap concurrentHashMap = this.A0G;
                Reference reference2 = (Reference) concurrentHashMap.get(A003);
                if (reference2 != null) {
                    AnonymousClass7XO r0 = (AnonymousClass7XO) reference2.get();
                    if (r0 != null) {
                        drawable = new AnonymousClass6D5(r0);
                    } else {
                        concurrentHashMap.remove(A003);
                    }
                }
            }
        }
        C183108pV r11 = r22;
        if (drawable2 != null && drawable2.equals(drawable)) {
            if (r22 != null) {
                r11.Bcc(true);
            }
            if (num != null) {
                C55782qu r24 = this.A06;
                int intValue = num.intValue();
                r24.A01(intValue, "in_memory_cache_hit");
                r24.A02(C372621o.SUCCESS, intValue);
            }
        } else if (drawable != null) {
            if (num != null) {
                C55782qu r25 = this.A06;
                int intValue2 = num.intValue();
                r25.A01(intValue2, "in_memory_cache_hit");
                r25.A02(C372621o.SUCCESS, intValue2);
            }
            imageView2.setImageDrawable(drawable);
            if (r22 != null) {
                r11.Bcc(true);
            }
        } else {
            imageView2.setImageResource(R.drawable.sticker_loading_indicator);
            if (num != null) {
                this.A06.A01(num.intValue(), "sticker_load_enqueued");
            }
            C32601rJ r7 = new C32601rJ(imageView2, this.A06, r10, r11, num, A003, i4, i5, i, z, z2);
            synchronized (r23) {
                priorityQueue.add(r7);
                r23.notifyAll();
            }
            if (this.A00 == null) {
                C34121uG r02 = new C34121uG(r23, this);
                this.A00 = r02;
                r02.start();
            }
        }
    }

    public AnonymousClass33O(C64393Dh r2, C69263Wi r3, C620633i r4, C57162tC r5, AnonymousClass1VX r6, C55782qu r7, C59962xm r8, C55732qp r9, AnonymousClass33Q r10, WebpUtils webpUtils, AnonymousClass2IA r12, C53062mU r13, AnonymousClass2X1 r14, C45552aC r15) {
        this.A05 = r6;
        this.A02 = r3;
        this.A0B = webpUtils;
        this.A08 = r9;
        this.A03 = r4;
        this.A0F = r15;
        this.A01 = r2;
        this.A0A = r10;
        this.A07 = r8;
        this.A06 = r7;
        this.A0E = r14;
        this.A04 = r5;
        this.A0D = r13;
        this.A0C = new AnonymousClass7O6(r3, r6, r12);
        this.A0H = AnonymousClass0x9.A1D();
        this.A0G = AnonymousClass0x9.A1D();
    }

    public final void A06(C69263Wi r7, C620633i r8, C152657Zu r9, WebpUtils webpUtils, Map map) {
        Reference reference;
        if (r9.A02()) {
            Drawable drawable = null;
            if (map == null || (reference = (Reference) map.get(r9.A05)) == null || (drawable = (Drawable) reference.get()) == null) {
                AnonymousClass39M r1 = r9.A03;
                byte[] A012 = A01(this.A01, r8, r1, webpUtils);
                if (A012 != null) {
                    if (r1.A0L) {
                        String str = r9.A05;
                        String str2 = r1.A0D;
                        C59962xm r0 = this.A07;
                        int i = r9.A02;
                        int i2 = r9.A00;
                        try {
                            Drawable A013 = r0.A01(str2, A012);
                            if (A013 != null) {
                                drawable = new BitmapDrawable(r9.A00().getResources(), C59962xm.A00(A013, i, i2));
                                this.A0H.put(str, new SoftReference(drawable));
                            }
                        } catch (OutOfMemoryError e) {
                            Log.w("LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap", e);
                        }
                    } else if (r9.A06) {
                        String str3 = r1.A0D;
                        C626936e.A06(str3);
                        drawable = A02(r9, str3, A012);
                    } else {
                        Bitmap A052 = this.A0A.A05(r9.A05, A012, r9.A02, r9.A00);
                        if (A052 != null) {
                            drawable = new BitmapDrawable(A052);
                        }
                    }
                    drawable = null;
                }
                if (map != null) {
                    if (drawable != null) {
                        map.put(r9.A05, new SoftReference(drawable));
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("StickerImageLoader/loadSticker failed to create drawable: ");
                        C18260x0.A1K(A0o, r9.A05);
                    }
                }
            }
            r9.A01(drawable, r7);
        }
    }
}
