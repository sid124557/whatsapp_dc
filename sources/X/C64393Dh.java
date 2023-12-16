package X;

import android.media.MediaScannerConnection;
import com.whatsapp.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Dh  reason: invalid class name and case insensitive filesystem */
public class C64393Dh implements C833347v, AnonymousClass485 {
    public static SimpleDateFormat A06 = AnonymousClass0x7.A0u("yyyyww");
    public static final String A07 = AnonymousClass000.A0X(" History Sync", AnonymousClass000.A0l("WhatsApp"));
    public static final String A08 = AnonymousClass000.A0X(" Animated Gifs", AnonymousClass000.A0l("WhatsApp"));
    public static final String A09 = AnonymousClass000.A0X(" Audio", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0A = AnonymousClass000.A0X(" Calls", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0B = AnonymousClass000.A0X(" Documents", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0C = AnonymousClass000.A0X(" Images", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0D = AnonymousClass000.A0X(" Profile Photos", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0E = AnonymousClass000.A0X(" Video Notes", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0F = AnonymousClass000.A0X(" Stickers", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0G = AnonymousClass000.A0X(" Video", AnonymousClass000.A0l("WhatsApp"));
    public static final String A0H = AnonymousClass000.A0X(" Voice Notes", AnonymousClass000.A0l("WhatsApp"));
    public AnonymousClass2UN A00;
    public final C54292oU A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final Object A05 = AnonymousClass002.A0D();

    public File A0L(C633138t r4, C369320h r5, String str, String str2, String str3, boolean z) {
        File A0D2;
        File A012;
        String str4;
        File A0O = A0O(r5, true);
        if (A0O != null) {
            return A0O;
        }
        if (z) {
            A012 = C54292oU.A01(this);
            str4 = "business_activity_report.zip.enc.tmp";
        } else if (C633138t.A0X == r4) {
            A012 = C54292oU.A01(this);
            str4 = "payment_background_img.enc.tmp";
        } else {
            if (C633138t.A0L == r4) {
                A0D2 = A01(C54292oU.A01(this), A07);
            } else {
                A0D2 = A0D();
                if (str != null) {
                    return A04(A0D2, str, str3, ".enc.tmp");
                }
            }
            return A04(A0D2, str2, str3, ".enc.tmp");
        }
        return AnonymousClass002.A0A(A012, str4);
    }

    public File A0M(C633138t r7, C369320h r8, String str, String str2, boolean z, boolean z2) {
        File A0D2;
        File A012;
        String str3;
        File A0O = A0O(r8, false);
        if (A0O != null) {
            return A0O;
        }
        if (z) {
            A012 = C54292oU.A01(this);
            str3 = "business_activity_report.zip.tmp";
        } else {
            if (C633138t.A0L == r7) {
                A0D2 = A01(C54292oU.A01(this), A07);
            } else if (C633138t.A0X == r7) {
                A012 = C54292oU.A01(this);
                str3 = "payment_background_img.tmp";
            } else if (z2) {
                String l = Long.toString(System.currentTimeMillis(), 36);
                File file = A08().A09;
                StringBuilder A0o = AnonymousClass001.A0o();
                StringBuilder A0l = AnonymousClass000.A0l(r7.A02);
                A0l.append("-");
                C18270x1.A1C(l, A0l, A0o);
                return C18270x1.A0A(file, ".tmp", A0o);
            } else {
                A0D2 = A0D();
            }
            return A04(A0D2, str, str2, ".tmp");
        }
        return AnonymousClass002.A0A(A012, str3);
    }

    public static File A01(File file, String str) {
        File file2 = new File(file, str);
        A07(file2, false);
        return file2;
    }

    public static File A02(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public static final File A04(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            name = AnonymousClass000.A0V(str.replace('/', '-'), str3, AnonymousClass001.A0o());
        } else if (str2 != null) {
            name = AnonymousClass002.A0B(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A03(file, name);
    }

    public static synchronized String A06(File file, String str) {
        String A0V;
        boolean z;
        synchronized (C64393Dh.class) {
            String l = Long.toString(System.currentTimeMillis(), 36);
            A0V = AnonymousClass000.A0V("-", l, AnonymousClass000.A0l(str));
            File[] listFiles = file.listFiles(new C116955r9(A0V));
            if (listFiles != null) {
                do {
                    z = false;
                    for (File name : listFiles) {
                        if (name.getName().equals(A0V)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append(C18260x0.A06(str, "-", l));
                            AnonymousClass000.A1B(UUID.randomUUID(), A0o);
                            A0V = A0o.toString();
                            z = true;
                        }
                    }
                } while (z);
            }
        }
        return A0V;
    }

    public AnonymousClass2UN A08() {
        AnonymousClass2UN r0;
        synchronized (this.A05) {
            if (this.A00 == null) {
                Log.i("fmessageio/media-dirs-null");
                A0Y();
            }
            r0 = this.A00;
            C626936e.A06(r0);
        }
        return r0;
    }

    public File A0B() {
        return A02(C54292oU.A02(this.A01), "export_chats");
    }

    public File A0C() {
        return A02(C54292oU.A02(this.A01), "export_gdpr");
    }

    public File A0N(C30471mV r5) {
        if (!(r5.A1J.A00 instanceof C135176kF) || r5.A1x() == null) {
            return A04(A0D(), r5.A04, r5.A07, ".tmp");
        }
        File A012 = C54292oU.A01(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r5.A1x());
        return C18270x1.A0A(A012, ".tmp", A0o);
    }

    public File A0Q(String str) {
        String str2;
        File A022 = C54292oU.A02(this.A01);
        if ("personal".equals(str)) {
            str2 = "export_personal_dyi";
        } else {
            str2 = "export_business_dyi";
        }
        return A02(A022, str2);
    }

    public File A0V(String str, String str2) {
        return A04(AnonymousClass002.A0A(AnonymousClass310.A00((AnonymousClass310) this.A02.get()), ".Thumbs"), str, str2, ".prog.thumb.jpg");
    }

    public File A0W(String str, String str2) {
        File A0A2 = AnonymousClass002.A0A(AnonymousClass310.A00((AnonymousClass310) this.A02.get()), ".StickerThumbs");
        A07(A0A2, false);
        return A04(A0A2, str, str2, ".thumb.webp");
    }

    public void A0Y() {
        synchronized (this.A05) {
            Log.i("fmessageio/initExternalStorageDirectory");
            this.A00 = new AnonymousClass2UN(this);
        }
    }

    public final void A0Z(File file) {
        File A0A2 = AnonymousClass002.A0A(file, ".nomedia");
        if (A0A2.exists() && A0A2.delete()) {
            C18260x0.A1P(AnonymousClass001.A0o(), "fmessageio/deletenomedia/deleted ", A0A2);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                A0c((Runnable) null, Arrays.asList(listFiles));
            }
        }
    }

    public void A0a(File file, File file2) {
        C627536m.A0C((AnonymousClass306) this.A03.get(), file, file2);
    }

    public void A0b(File file, File file2) {
        C627536m.A0D((AnonymousClass306) this.A03.get(), file, file2);
    }

    public C64393Dh(C54292oU r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public static File A00(C64393Dh r0, String str) {
        return A03(r0.A0D(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2.isDirectory() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A03(java.io.File r2, java.lang.String r3) {
        /*
            boolean r0 = r2.exists()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r2.isFile()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0010
            r2.delete()     // Catch:{ all -> 0x002a }
            goto L_0x0017
        L_0x0010:
            boolean r1 = r2.isDirectory()     // Catch:{ all -> 0x002a }
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "app/extsharedfile/folder/created/false"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x002a }
        L_0x0025:
            java.io.File r0 = X.AnonymousClass002.A0A(r2, r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x002a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64393Dh.A03(java.io.File, java.lang.String):java.io.File");
    }

    public static File A05(File file, String str, StringBuilder sb) {
        sb.append(str);
        return new File(file, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3.isDirectory() != false) goto L_0x0025;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(java.io.File r3, boolean r4) {
        /*
            boolean r0 = r3.exists()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r3.isFile()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x001f
            r3.delete()     // Catch:{ all -> 0x004d }
        L_0x000f:
            boolean r0 = r3.mkdirs()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "fmessageio/prepareFolder/mkdirs failed: "
            X.C18260x0.A1Q(r1, r0, r3)     // Catch:{ all -> 0x004d }
            goto L_0x0025
        L_0x001f:
            boolean r0 = r3.isDirectory()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000f
        L_0x0025:
            if (r4 == 0) goto L_0x004c
            java.lang.String r0 = ".nomedia"
            java.io.File r2 = X.AnonymousClass002.A0A(r3, r0)     // Catch:{ all -> 0x004d }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "fmessageio/prepareFolder/nomedia doesn't exist, creating in "
            X.C18260x0.A1P(r1, r0, r3)     // Catch:{ all -> 0x004d }
            r2.createNewFile()     // Catch:{ IOException -> 0x0040 }
            goto L_0x004b
        L_0x0040:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "fmessageio/prepareFolder "
            X.C18260x0.A0k(r3, r0, r1, r2)     // Catch:{ all -> 0x004d }
            goto L_0x004c
        L_0x004b:
            return
        L_0x004c:
            return
        L_0x004d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64393Dh.A07(java.io.File, boolean):void");
    }

    public File A09() {
        return AnonymousClass002.A0A(C54292oU.A01(this), "business_activity_report.zip");
    }

    public File A0A() {
        File file = A08().A02;
        A07(file, false);
        return file;
    }

    public File A0D() {
        File file = A08().A03;
        A07(file, true);
        return file;
    }

    public File A0E() {
        return A08().A05;
    }

    public File A0F() {
        return A01(C54292oU.A01(this), "Payment Backgrounds");
    }

    public File A0G() {
        File file = A08().A0A;
        A07(file, false);
        return file;
    }

    public File A0H() {
        return A08().A0H;
    }

    public File A0I() {
        File file = A08().A0N;
        A07(file, false);
        return file;
    }

    public File A0J() {
        return A08().A0O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r9 != 3) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0K(byte r7, int r8, int r9) {
        /*
            r6 = this;
            X.2UN r1 = r6.A08()
            r2 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r7 == r3) goto L_0x00bd
            if (r7 == r4) goto L_0x009a
            if (r7 == r5) goto L_0x0086
            r0 = 9
            if (r7 == r0) goto L_0x0071
            r0 = 13
            if (r7 == r0) goto L_0x0065
            r0 = 20
            if (r7 == r0) goto L_0x0062
            r0 = 23
            if (r7 == r0) goto L_0x00bd
            r0 = 37
            if (r7 == r0) goto L_0x00bd
            r0 = 65
            if (r7 == r0) goto L_0x00d5
            r0 = 81
            if (r7 == r0) goto L_0x005f
            r0 = 25
            if (r7 == r0) goto L_0x00bd
            r0 = 26
            if (r7 == r0) goto L_0x0071
            r0 = 28
            if (r7 == r0) goto L_0x0086
            r0 = 29
            if (r7 == r0) goto L_0x0065
            r0 = 42
            if (r7 == r0) goto L_0x005c
            r0 = 43
            if (r7 == r0) goto L_0x005c
        L_0x0042:
            X.8qC r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.310 r0 = (X.AnonymousClass310) r0
            java.io.File r1 = X.AnonymousClass310.A00(r0)
            java.lang.String r0 = "Media"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
        L_0x0054:
            if (r9 == r4) goto L_0x0058
            if (r9 != r5) goto L_0x00d3
        L_0x0058:
            A07(r0, r3)
            return r0
        L_0x005c:
            java.io.File r0 = r1.A08
            goto L_0x0054
        L_0x005f:
            java.io.File r2 = r1.A0H
            goto L_0x009e
        L_0x0062:
            java.io.File r0 = r1.A04
            goto L_0x0054
        L_0x0065:
            if (r9 == r3) goto L_0x00d1
            if (r9 == r4) goto L_0x006e
            if (r9 != r5) goto L_0x0042
            java.io.File r0 = r1.A0I
            goto L_0x0058
        L_0x006e:
            java.io.File r0 = r1.A0B
            goto L_0x0058
        L_0x0071:
            r0 = 7
            if (r8 != r0) goto L_0x0077
            java.io.File r0 = r1.A0D
            goto L_0x0054
        L_0x0077:
            if (r9 == r3) goto L_0x0083
            if (r9 == r4) goto L_0x0080
            if (r9 != r5) goto L_0x0042
            java.io.File r0 = r1.A0K
            goto L_0x0058
        L_0x0080:
            java.io.File r0 = r1.A0D
            goto L_0x0058
        L_0x0083:
            java.io.File r0 = r1.A02
            goto L_0x00d3
        L_0x0086:
            if (r9 == r3) goto L_0x0097
            if (r9 == r4) goto L_0x0094
            if (r9 == r5) goto L_0x0091
            if (r9 != r2) goto L_0x0042
            java.io.File r0 = r1.A07
            goto L_0x00d3
        L_0x0091:
            java.io.File r0 = r1.A0M
            goto L_0x0058
        L_0x0094:
            java.io.File r0 = r1.A0F
            goto L_0x0058
        L_0x0097:
            java.io.File r0 = r1.A0O
            goto L_0x00d3
        L_0x009a:
            if (r8 != r3) goto L_0x00ae
            java.io.File r2 = r1.A0P
        L_0x009e:
            java.text.SimpleDateFormat r1 = A06
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r0 = X.AnonymousClass002.A0A(r2, r0)
            goto L_0x0054
        L_0x00ae:
            if (r9 == r3) goto L_0x00ba
            if (r9 == r4) goto L_0x00b7
            if (r9 != r5) goto L_0x0042
            java.io.File r0 = r1.A0J
            goto L_0x0058
        L_0x00b7:
            java.io.File r0 = r1.A0C
            goto L_0x0058
        L_0x00ba:
            java.io.File r0 = r1.A01
            goto L_0x00d3
        L_0x00bd:
            if (r9 == r3) goto L_0x00ce
            if (r9 == r4) goto L_0x00cb
            if (r9 == r5) goto L_0x00c8
            if (r9 != r2) goto L_0x0042
            java.io.File r0 = r1.A06
            goto L_0x00d3
        L_0x00c8:
            java.io.File r0 = r1.A0L
            goto L_0x0058
        L_0x00cb:
            java.io.File r0 = r1.A0E
            goto L_0x0058
        L_0x00ce:
            java.io.File r0 = r1.A05
            goto L_0x00d3
        L_0x00d1:
            java.io.File r0 = r1.A00
        L_0x00d3:
            r3 = 0
            goto L_0x0058
        L_0x00d5:
            java.io.File r0 = r6.A0F()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64393Dh.A0K(byte, int, int):java.io.File");
    }

    public final File A0O(C369320h r5, boolean z) {
        String str;
        File A012;
        StringBuilder A0o;
        String str2;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (z) {
            str = ".enc";
        } else {
            str = "";
        }
        A0o2.append(str);
        String A0X = AnonymousClass000.A0X(".tmp", A0o2);
        if (r5 == C369320h.ACCOUNT) {
            A012 = C54292oU.A01(this);
            A0o = AnonymousClass001.A0o();
            str2 = "gdpr.zip";
        } else if (r5 != C369320h.NEWSLETTER) {
            return null;
        } else {
            A012 = C54292oU.A01(this);
            A0o = AnonymousClass001.A0o();
            str2 = "channels_gdpr.zip";
        }
        A0o.append(str2);
        return C18270x1.A0A(A012, A0X, A0o);
    }

    public File A0P(String str) {
        String str2;
        File A012 = C54292oU.A01(this);
        if ("personal".equals(str)) {
            str2 = "dyi.zip";
        } else {
            str2 = "business_dyi.zip";
        }
        return AnonymousClass002.A0A(A012, str2);
    }

    public File A0R(String str) {
        return A00(this, str);
    }

    public File A0S(String str) {
        File file = A08().A09;
        A07(file, false);
        return A03(file, str);
    }

    public File A0T(String str) {
        String A042 = C627236i.A04(str);
        File file = A08().A0R;
        A07(file, false);
        C626936e.A06(A042);
        return A03(file, A042);
    }

    public File A0U(String str, String str2) {
        return A05(A0Q(str2), ".zip", AnonymousClass000.A0l(str));
    }

    public List A0X() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(A08().A01);
        A0s.add(A08().A00);
        A0s.add(A08().A0O);
        A0s.add(A08().A05);
        A0s.add(A08().A0P);
        A0s.add(A08().A0H);
        File file = A08().A0Q;
        A07(file, false);
        A0s.add(file);
        A0s.add(A0A());
        A0s.add(A0I());
        File file2 = A08().A04;
        A07(file2, false);
        A0s.add(file2);
        return A0s;
    }

    public void A0c(Runnable runnable, List list) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        MediaScannerConnection.scanFile(this.A01.A00, strArr, (String[]) null, new C108185ca(runnable, new AtomicInteger(size)));
    }

    public boolean A0d(File file) {
        return C18290x4.A1V(A08().A0A, file.getCanonicalPath());
    }

    public boolean A0e(File file) {
        if (!C18290x4.A1V(A08().A03, file.getCanonicalPath())) {
            if (C18290x4.A1V(A08().A09, file.getCanonicalPath())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0f(File file) {
        if (!A0d(file)) {
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        AnonymousClass2UN A082 = A08();
        if (C18290x4.A1V(A082.A0I, canonicalPath) || C18290x4.A1V(A082.A0J, canonicalPath) || C18290x4.A1V(A082.A0K, canonicalPath) || C18290x4.A1V(A082.A0L, canonicalPath) || C18290x4.A1V(A082.A0M, canonicalPath) || C18290x4.A1V(A082.A0N, canonicalPath) || C18290x4.A1V(A082.A0B, canonicalPath) || C18290x4.A1V(A082.A0C, canonicalPath) || C18290x4.A1V(A082.A0D, canonicalPath) || C18290x4.A1V(A082.A0E, canonicalPath) || C18290x4.A1V(A082.A0F, canonicalPath) || C18290x4.A1V(A082.A04, canonicalPath) || C18290x4.A1V(A082.A0H, canonicalPath) || C18290x4.A1V(A082.A0P, canonicalPath)) {
            return false;
        }
        return true;
    }
}
