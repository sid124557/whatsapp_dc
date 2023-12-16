package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1el  reason: invalid class name and case insensitive filesystem */
public class C27841el extends C56552sB {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C56352rq A02;
    public final AnonymousClass319 A03;
    public final C49652gs A04;
    public final C54492oo A05 = new C54492oo();
    public final C55732qp A06;
    public final C29361ih A07;
    public final C56932sn A08;
    public final C49932hK A09;
    public final C60082xy A0A;
    public final C54512oq A0B;
    public final C72173dI A0C;
    public final Map A0D = AnonymousClass001.A0t();
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r13.A0J != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass4BM r11, X.C27841el r12, X.AnonymousClass39M r13, long r14) {
        /*
            r5 = r13
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0037
            X.2gs r0 = r12.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r13.A05
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = "RecentStickers/ sent sticker avatar sticker stable id is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r1 = "Avatar Sticker with NULL stable ID found"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x001c:
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x0023
            r11.BQg(r0)
        L_0x0023:
            return
        L_0x0024:
            X.2oq r0 = r12.A0B
            X.39M r5 = r0.A00(r1)
            if (r5 != 0) goto L_0x003c
            X.2hK r0 = r12.A09
            X.39M r5 = r0.A00(r13)
            if (r5 != 0) goto L_0x003c
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
            goto L_0x0042
        L_0x0037:
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x003c
            goto L_0x001c
        L_0x003c:
            java.lang.String r0 = r5.A09
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "RecentStickers/add file path is null"
        L_0x0042:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x001c
        L_0x0046:
            java.lang.String r3 = r5.A0D
            if (r3 != 0) goto L_0x004d
            java.lang.String r0 = "RecentStickers/add file hash is null"
            goto L_0x0042
        L_0x004d:
            boolean r0 = r12.A0J(r3)
            if (r0 == 0) goto L_0x00dc
            java.util.Map r4 = r12.A0D
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x00d9
            long r0 = X.C18290x4.A0C(r3, r4)
        L_0x005f:
            long r2 = java.lang.Math.max(r14, r0)
            boolean r3 = r12.A0I(r5, r2)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x009e
            if (r3 == 0) goto L_0x009e
            java.lang.String r1 = r5.A0D
            X.C626936e.A06(r1)
            X.2xy r2 = r12.A0A
            java.lang.String r0 = r5.A0D
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "RecentStickerDBStorage/updateLastStickerSentTs/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007d:
            X.AnonymousClass0x2.A1K(r1, r4, r14)
            java.util.List r0 = super.A03()
            java.util.Iterator r3 = r0.iterator()
        L_0x0088:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r3.next()
            X.2hJ r2 = (X.C49922hJ) r2
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r2.A00 = r14
        L_0x009e:
            X.3Wi r3 = r12.A01
            X.1ih r2 = r12.A07
            java.util.Objects.requireNonNull(r2)
            r1 = 18
        L_0x00a7:
            X.5sF r0 = new X.5sF
            r0.<init>(r2, r1)
            r3.BkS(r0)
            goto L_0x001c
        L_0x00b1:
            X.8qC r0 = r2.A01
            X.4Fq r2 = X.C18630y0.A08(r0)
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r5.A0D     // Catch:{ all -> 0x0119 }
            r0 = 0
            r10[r0] = r3     // Catch:{ all -> 0x0119 }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "last_sticker_sent_ts"
            X.2sg r5 = X.AnonymousClass3H0.A02(r6, r2, r0, r14)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = "recent_stickers"
            java.lang.String r8 = "plaintext_hash = ?"
            java.lang.String r9 = "updateSticker/UPDATE_RECENT_STICKERS_LAST_SENT_TS"
            r5.A05(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0119 }
            r2.close()
            goto L_0x007d
        L_0x00d9:
            r0 = 0
            goto L_0x005f
        L_0x00dc:
            java.lang.String r0 = r5.A09
            if (r0 == 0) goto L_0x010b
            int r1 = r5.A01
            r0 = 1
            if (r1 == r0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecentStickers/add/adding third party sticker, sticker plaintext hash: "
            X.C18260x0.A0q(r0, r3, r1)
            X.2sn r0 = r12.A08
            java.io.File r2 = r0.A03(r5)
        L_0x00f4:
            if (r2 == 0) goto L_0x0101
            X.AnonymousClass39M.A02(r5, r2)
            X.2qp r0 = r12.A06
            r0.A04(r5)
            r12.A0I(r5, r14)
        L_0x0101:
            X.3Wi r3 = r12.A01
            X.1ih r2 = r12.A07
            java.util.Objects.requireNonNull(r2)
            r1 = 19
            goto L_0x00a7
        L_0x010b:
            java.io.File r2 = r12.A0C(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecentStickers/add/adding internal reference for sticker, sticker plaintext hash: "
            X.C18260x0.A0q(r0, r3, r1)
            goto L_0x00f4
        L_0x0119:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x011e }
            throw r1
        L_0x011e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27841el.A00(X.4BM, X.1el, X.39M, long):void");
    }

    public final boolean A0I(AnonymousClass39M r13, long j) {
        String A0o;
        String str;
        AnonymousClass39M r6 = r13;
        String str2 = r13.A0D;
        if (str2 != null) {
            C54492oo r4 = this.A05;
            String A002 = r4.A00(str2);
            if (A002 == null) {
                String str3 = r13.A09;
                if (str3 != null) {
                    C626936e.A00();
                    File A0B2 = AnonymousClass002.A0B(str3);
                    if (!A0B2.exists()) {
                        C18260x0.A0r("WebpUtils/getFileHashExcludingMetadata/file does not exist, ", str3, AnonymousClass001.A0o());
                    } else {
                        A002 = WebpUtils.A00(A0B2);
                        if (A002 == null) {
                            return false;
                        }
                    }
                }
            }
            synchronized (r4) {
                A0o = C18310x6.A0o(A002, r4.A01);
            }
            if (A0o != null) {
                String str4 = r13.A0D;
                if (!str4.equals(A0o)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("RecentStickers/dedupeStickerFilesBasedOnImageHash/Removing old sticker from recents:");
                    A0o2.append(A0o);
                    A0o2.append(", with the same image hash:");
                    A0o2.append(A002);
                    C18260x0.A0s(", with the new sticker:", str4, A0o2);
                    A07(new C49922hJ(r6, A0o, A002, r13.A05, 0));
                }
            }
            if (r13.A0C == null) {
                if (r13.A0L) {
                    str = "application/was";
                } else {
                    str = "image/webp";
                }
                r13.A0C = str;
            }
            return super.A08(new C49922hJ(r6, r13.A0D, A002, r13.A05, j));
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27841el(X.AnonymousClass2VG r4, X.C39772Dg r5, X.C64393Dh r6, X.C69263Wi r7, X.C56352rq r8, X.AnonymousClass319 r9, X.C49652gs r10, X.C55732qp r11, X.C29361ih r12, X.C56932sn r13, X.C49932hK r14, X.C54512oq r15, X.AnonymousClass4FS r16, boolean r17) {
        /*
            r3 = this;
            X.3dX r0 = r5.A00
            X.3Db r0 = r0.A01
            X.4C1 r0 = r0.ADh
            java.lang.Object r0 = r0.get()
            X.2VG r0 = (X.AnonymousClass2VG) r0
            X.3Pq r1 = new X.3Pq
            r2 = r17
            r1.<init>(r0, r2)
            r0 = 32
            r3.<init>(r1, r0)
            r3.A01 = r7
            r3.A00 = r6
            r3.A0B = r15
            r3.A06 = r11
            r3.A0E = r2
            r3.A07 = r12
            r3.A08 = r13
            r3.A03 = r9
            r3.A04 = r10
            r3.A09 = r14
            X.2xy r0 = r4.A00(r2)
            r3.A0A = r0
            r3.A02 = r8
            X.3dI r0 = X.C72173dI.A00(r16)
            r3.A0C = r0
            X.2oo r0 = new X.2oo
            r0.<init>()
            r3.A05 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r3.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27841el.<init>(X.2VG, X.2Dg, X.3Dh, X.3Wi, X.2rq, X.319, X.2gs, X.2qp, X.1ih, X.2sn, X.2hK, X.2oq, X.4FS, boolean):void");
    }

    public /* bridge */ /* synthetic */ void A0A(AnonymousClass4F8 r5) {
        C67573Pu r52 = (C67573Pu) r5;
        C626936e.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1L(A0o, C18300x5.A0k(r52, "RecentStickers/addEntry/adding entry:", A0o));
        C54492oo r2 = this.A05;
        C49922hJ r1 = r52.A01;
        String str = r1.A02;
        r2.A01(str, r1.A03);
        AnonymousClass0x2.A1K(str, this.A0D, r1.A00);
        super.A0A(r52);
    }

    public void A0G(AnonymousClass4BM r4, AnonymousClass39M r5) {
        this.A0C.execute(new C70363aN(this, r5, r4, 14));
    }

    public void A0H(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, boolean z, boolean z2) {
        AnonymousClass39M r2 = new AnonymousClass39M();
        r2.A0D = str;
        if (str2 != null) {
            r2.A0G = str2;
        }
        if (str3 != null) {
            r2.A08 = str3;
        }
        if (str4 != null) {
            r2.A06 = str4;
        }
        if (str5 != null) {
            r2.A0C = str5;
        }
        if (str6 != null) {
            r2.A0B = str6;
        }
        r2.A00 = i;
        r2.A03 = i2;
        r2.A02 = i3;
        r2.A07 = str7;
        r2.A0K = z;
        r2.A0L = z2;
        this.A0A.A02(r2);
        for (C49922hJ r1 : super.A03()) {
            if (str.equals(r1.A02)) {
                r1.A00(r2);
            }
        }
    }

    public boolean A0J(String str) {
        Map map;
        int size;
        boolean containsKey;
        C54492oo r2 = this.A05;
        synchronized (r2) {
            map = r2.A00;
            size = map.size();
        }
        if (size > 0) {
            synchronized (r2) {
                containsKey = map.containsKey(str);
            }
            return containsKey;
        }
        Iterator it = A0D().iterator();
        while (it.hasNext()) {
            if (str.equals(AnonymousClass0x7.A0b(it).A0D)) {
                return true;
            }
        }
        return false;
    }

    public void A09(int i) {
        C626936e.A00();
        C49922hJ r3 = (C49922hJ) A02(i);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1L(A0o, C18300x5.A0k(r3, "RecentStickers/removeEntry/removing entry: ", A0o));
        C56352rq r0 = this.A02;
        String str = r3.A02;
        r0.A06(str);
        this.A05.A02(str, r3.A03);
        this.A0D.remove(str);
        super.A09(i);
    }

    public Pair A0B(String str) {
        long j;
        Iterator it = A0D().iterator();
        while (it.hasNext()) {
            AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
            if (str.equals(A0b.A0D)) {
                Map map = this.A0D;
                if (map.containsKey(str)) {
                    j = C18290x4.A0C(str, map);
                } else {
                    j = 0;
                }
                return AnonymousClass0x9.A0C(A0b, Long.valueOf(j));
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r0 == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0C(X.AnonymousClass39M r7) {
        /*
            r6 = this;
            X.C626936e.A00()
            java.lang.String r0 = r7.A0D
            r5 = 0
            if (r0 == 0) goto L_0x007c
            X.2rq r3 = r6.A02
            java.io.File r4 = r3.A02(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecentStickers/addInternalReference/sticker file exist, increment reference counting:"
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r4, r0, r1)
            X.C18260x0.A1J(r1, r0)
        L_0x0021:
            java.lang.String r0 = r7.A0D
            java.io.File r0 = r3.A01(r0)
            return r0
        L_0x0028:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.String r1 = r7.A09
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            X.C626936e.A00()
            java.lang.String r2 = r7.A09
            if (r2 == 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = "RecentStickers/copyFile/sticker file is being copied from: "
            r1.append(r0)     // Catch:{ IOException -> 0x0064 }
            r1.append(r2)     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = " to:"
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r4, r0, r1)     // Catch:{ IOException -> 0x0064 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x0064 }
            X.3Dh r1 = r6.A00     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = r7.A09     // Catch:{ IOException -> 0x0064 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x0064 }
            r1.A0a(r0, r4)     // Catch:{ IOException -> 0x0064 }
            goto L_0x0078
        L_0x0064:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RecentStickers/copyFile/error copying file sticker"
            r1.append(r0)
            java.lang.String r0 = r7.A0E
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = ""
        L_0x0073:
            X.C18260x0.A1K(r1, r0)
        L_0x0076:
            r0 = 0
            goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r0 == 0) goto L_0x007c
            goto L_0x0021
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27841el.A0C(X.39M):java.io.File");
    }

    public List A0D() {
        String str;
        List<C49922hJ> A032 = super.A03();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C49922hJ r5 : A032) {
            C54492oo r1 = this.A05;
            String str2 = r5.A02;
            r1.A01(str2, r5.A03);
            AnonymousClass0x2.A1K(str2, this.A0D, r5.A00);
            AnonymousClass39M r2 = r5.A04;
            String str3 = r2.A0D;
            if (str3 == null) {
                r2.A0D = str2;
                str3 = str2;
            }
            if (r2.A0L) {
                str = "application/was";
            } else {
                str = "image/webp";
            }
            r2.A0C = str;
            if (str3 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A022 = this.A02.A02(str3);
                AnonymousClass39M.A02(r2, A022);
                if (A022.getAbsolutePath() != null) {
                    this.A06.A04(r2);
                }
            }
            A0s.add(r2.A03());
        }
        return A0s;
    }

    public List A0E() {
        Cursor A0E2;
        String str;
        List<C49922hJ> A032 = super.A03();
        for (C49922hJ r3 : A032) {
            C60082xy r5 = this.A0A;
            String str2 = r3.A02;
            String[] A1b = C18270x1.A1b(str2);
            AnonymousClass4GK A042 = C18630y0.A04(r5.A01);
            try {
                A0E2 = ((AnonymousClass3H0) A042).A03.A0E("SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE plaintext_hash = ?", "getStickerFromFileHash/QUERY_RECENT_STICKER", A1b);
                if (A0E2.moveToNext()) {
                    AnonymousClass39M A002 = C60082xy.A00(A0E2, (C55732qp) r5.A00.get());
                    A0E2.close();
                    A042.close();
                    if (A002.A06 == null) {
                        AnonymousClass319 r6 = this.A03;
                        AnonymousClass2S8 A0A2 = r6.A0A(str2, (byte) 20, true);
                        if (A0A2 != null) {
                            A002 = new AnonymousClass39M();
                            A002.A0D = str2;
                            A002.A0G = A0A2.A04;
                            A002.A08 = A0A2.A03;
                            AnonymousClass33C r7 = A0A2.A02;
                            A002.A06 = r7.A0G;
                            String str3 = A0A2.A05;
                            A002.A0C = str3;
                            A002.A0L = "application/was".equals(str3);
                            byte[] bArr = r7.A0W;
                            if (bArr != null) {
                                A002.A0B = C18320x8.A0i(bArr);
                            }
                            A002.A00 = (int) r7.A0A;
                            A002.A03 = r7.A08;
                            A002.A02 = r7.A06;
                            r6.A0E.A04(A002);
                            r5.A02(A002);
                        }
                    }
                    r3.A00(A002);
                } else {
                    A0E2.close();
                    C18260x0.A0r("RecentStickerDBStorage/getStickerFromFileHash/sticker unable to be retrieved from recent stickers db: filehash = ", str2, C18280x3.A0f(A042));
                    Log.e("RecentStickers/getStickerListAndWeights/recent sticker not found in db");
                }
                AnonymousClass39M r1 = r3.A04;
                if (r1.A0C == null) {
                    if (r1.A0L) {
                        str = "application/was";
                    } else {
                        str = "image/webp";
                    }
                    r1.A0C = str;
                }
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        Map A052 = super.A05();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C49922hJ r32 : A032) {
            AnonymousClass39M A033 = r32.A04.A03();
            String str4 = A033.A0D;
            if (str4 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A022 = this.A02.A02(str4);
                AnonymousClass39M.A02(A033, A022);
                A022.getAbsolutePath();
            }
            AnonymousClass0x2.A1F(A033, A052.get(r32), A0s);
        }
        return A0s;
        throw th;
    }

    public Map A0F() {
        List<C49922hJ> A032 = super.A03();
        HashMap A0t = AnonymousClass001.A0t();
        for (C49922hJ r0 : A032) {
            String str = r0.A02;
            if (str != null) {
                AnonymousClass0x2.A1J(str, A0t, r0.A00);
            }
        }
        return A0t;
    }
}
