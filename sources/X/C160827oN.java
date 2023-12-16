package X;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7oN  reason: invalid class name and case insensitive filesystem */
public abstract class C160827oN {
    public static final HashMap A0J = new C118325tM();
    public C160627o1 A00 = null;
    public final SparseArray A01 = AnonymousClass6CA.A0I();
    public final SparseArray A02 = AnonymousClass6CA.A0I();
    public final SparseIntArray A03 = new SparseIntArray();
    public final C55682qk A04;
    public final C56492s4 A05;
    public final C29441ip A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final C57162tC A09;
    public final AnonymousClass33p A0A;
    public final C159047l0 A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final AnonymousClass33K A0E;
    public final C49912hI A0F;
    public final C55132pq A0G;
    public final AnonymousClass4FS A0H;
    public final List A0I = AnonymousClass001.A0s();

    public synchronized int A01(int i) {
        return this.A03.get(i, 0);
    }

    public synchronized C160627o1 A02() {
        C160627o1 r4;
        String str;
        String str2;
        r4 = this.A00;
        if (r4 == null) {
            r4 = null;
            try {
                AnonymousClass4FV r0 = this.A0D;
                AnonymousClass33p r1 = this.A0A;
                A00(r1, r0);
                if (this instanceof C133846i2) {
                    str2 = "filter";
                } else {
                    str2 = "doodle_emoji";
                }
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r1), AnonymousClass000.A0V("downloadable_category_local_info_json_", str2, AnonymousClass001.A0o()));
                if (!TextUtils.isEmpty(A0Z)) {
                    C160627o1 A002 = C160627o1.A00(A0Z);
                    this.A00 = A002;
                    return A002;
                }
            } catch (JSONException e) {
                C55682qk r2 = this.A04;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
                if (this instanceof C133846i2) {
                    str = "filter";
                } else {
                    str = "doodle_emoji";
                }
                AnonymousClass351.A03(r2, AnonymousClass000.A0a(str, A0o, e));
            }
        }
        return r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C133846i2
            if (r0 == 0) goto L_0x0015
            r0 = r3
            X.6i2 r0 = (X.C133846i2) r0
            monitor-enter(r2)
            java.util.HashMap r1 = r0.A0F()     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0023
            goto L_0x0022
        L_0x0015:
            r0 = r3
            X.6i3 r0 = (X.C133856i3) r0
            monitor-enter(r2)
            android.util.SparseArray r1 = r0.A00     // Catch:{ all -> 0x0024 }
            int r0 = r1.size()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            return r1
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160827oN.A03():java.lang.Object");
    }

    public synchronized void A06() {
        String str;
        if (this instanceof C133846i2) {
            str = "filter";
        } else {
            str = "doodle_emoji";
        }
        this.A0A.A1i(str, (String) null);
        this.A00 = null;
    }

    public final synchronized void A07(int i) {
        this.A01.put(i, Long.valueOf(this.A07.A0H()));
    }

    public synchronized void A09(int i, int i2) {
        SparseIntArray sparseIntArray = this.A03;
        int i3 = sparseIntArray.get(i2, 0);
        if (!(i3 == 3 && i == 3)) {
            if (i3 == 1) {
                if (i != 1) {
                }
            } else if (i3 == 3 && i == 1) {
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CategoryManager/setState/State change from ");
            HashMap hashMap = A0J;
            A0o.append((String) C18290x4.A0j(hashMap, i3));
            A0o.append(" to ");
            C18260x0.A1J(A0o, (String) C18290x4.A0j(hashMap, i));
            sparseIntArray.put(i2, i);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap2 = A0J;
        A0o2.append((String) C18290x4.A0j(hashMap2, i3));
        A0o2.append(" to ");
        A0o2.append((String) C18290x4.A0j(hashMap2, i));
        C18260x0.A1K(A0o2, "!");
    }

    public synchronized void A0A(C184318rb r4, int i) {
        int A012 = A01(i);
        if (A012 == 3 || A012 == 1) {
            Log.d("CategoryManager/registerCallback/Registering user callback");
            this.A0I.add(r4);
        } else {
            if (A012 == 4 || A012 == 2) {
                Log.d("CategoryManager/registerCallback/Servicing on error");
            } else if (A012 != 5 || A03() == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CategoryManager/registerCallback/Unexpected state encountered - ");
                C18260x0.A1K(A0o, (String) C18290x4.A0j(A0J, A012));
            } else {
                Log.d("CategoryManager/registerCallback/Servicing on success");
                Object A032 = A03();
                C626936e.A06(A032);
                r4.BZS(A032);
            }
            r4.BRy();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (A03() == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        com.whatsapp.util.Log.d("CategoryManager/serviceCallbacks/Servicing callbacks on success.");
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r2.hasNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        ((X.C184318rb) r2.next()).BZS(A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        com.whatsapp.util.Log.d("CategoryManager/serviceCallbacks/Servicing callbacks on error.");
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1.hasNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        ((X.C184318rb) r1.next()).BRy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List r2 = r3.A0I     // Catch:{ all -> 0x0052 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            return
        L_0x000b:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r2)     // Catch:{ all -> 0x0052 }
            r2.clear()     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x0038
            java.lang.Object r0 = r3.A03()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "CategoryManager/serviceCallbacks/Servicing callbacks on success."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0024:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r2.next()
            X.8rb r1 = (X.C184318rb) r1
            java.lang.Object r0 = r3.A03()
            r1.BZS(r0)
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "CategoryManager/serviceCallbacks/Servicing callbacks on error."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r1.next()
            X.8rb r0 = (X.C184318rb) r0
            r0.BRy()
            goto L_0x0041
        L_0x0051:
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160827oN.A0C(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = X.AnonymousClass002.A0A(r9.getFilesDir(), X.AnonymousClass000.A0T("downloadable/filter_", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        if (X.C627536m.A0Q(r2) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r0 = "FilterManager/store/Could not prepare filters subdirectory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r4.renameTo(r2) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C18270x1.A1H(r1, "FilterManager/store : rename failed, from ", r4);
        X.C18270x1.A1H(r1, " to ", r2);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015c, code lost:
        r2 = r5.A0F(r13, r14, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0164, code lost:
        if (X.C627536m.A0Q(r2) != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0166, code lost:
        r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016d, code lost:
        if (r4.renameTo(r2) != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016f, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C18270x1.A1H(r1, "DoodleEmojiManager/store : rename failed, from ", r4);
        X.C18270x1.A1H(r1, " to ", r2);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r5.A0H(r14, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.AnonymousClass4GL r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            r10 = r11
            boolean r0 = r11 instanceof X.C133846i2
            if (r0 == 0) goto L_0x00f3
            r7 = -1
            boolean r0 = X.AnonymousClass000.A1U(r14, r7)
            X.C626936e.A0B(r0)
            X.C626936e.A00()
            monitor-enter(r10)
            int r1 = r11.A01(r7)     // Catch:{ all -> 0x01a2 }
            monitor-exit(r10)
            r8 = 0
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.C626936e.A0C(r0)
            java.lang.String r0 = "FilterManager/store/Storing files..."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2s4 r2 = r11.A05     // Catch:{ IOException -> 0x00eb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00eb }
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00eb }
            java.io.InputStream r0 = r12.B47(r2, r1, r0)     // Catch:{ IOException -> 0x00eb }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00eb }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r6 = "downloadable/filter_"
            X.2oU r0 = r11.A08     // Catch:{ all -> 0x00e1 }
            android.content.Context r9 = r0.A00     // Catch:{ all -> 0x00e1 }
            java.io.File r2 = r9.getCacheDir()     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r13)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "_tmp"
            java.io.File r4 = X.C18270x1.A0A(r2, r0, r1)     // Catch:{ all -> 0x00e1 }
            boolean r0 = X.C627536m.A0Q(r4)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "FilterManager/store/Could not prepare temporary cache subdirectory"
        L_0x0055:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00cf
        L_0x0059:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00e1 }
        L_0x005d:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x009c
            java.lang.String r1 = r4.getCanonicalPath()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e1 }
            java.io.File r0 = X.C627536m.A06(r1, r0)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0083
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "FilterManager/store/malicious zip file:"
            r1.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x0055
        L_0x0083:
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ all -> 0x00e1 }
        L_0x0087:
            int r0 = r3.read(r5)     // Catch:{ all -> 0x0095 }
            if (r0 == r7) goto L_0x0091
            r2.write(r5, r8, r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0087
        L_0x0091:
            r2.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x005d
        L_0x0095:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x009a }
            goto L_0x00e0
        L_0x009a:
            r0 = move-exception
            goto L_0x00dd
        L_0x009c:
            monitor-enter(r10)     // Catch:{ all -> 0x00e1 }
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = X.AnonymousClass000.A0T(r6, r13)     // Catch:{ all -> 0x00da }
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x00da }
            boolean r0 = X.C627536m.A0Q(r2)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "FilterManager/store/Could not prepare filters subdirectory"
        L_0x00b1:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00da }
            monitor-exit(r10)     // Catch:{ all -> 0x00da }
            goto L_0x00cf
        L_0x00b6:
            boolean r0 = r4.renameTo(r2)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "FilterManager/store : rename failed, from "
            X.C18270x1.A1H(r1, r0, r4)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = " to "
            X.C18270x1.A1H(r1, r0, r2)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00da }
            goto L_0x00b1
        L_0x00cf:
            r3.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x01a0
        L_0x00d4:
            monitor-exit(r10)     // Catch:{ all -> 0x00da }
            r3.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x018d
        L_0x00da:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00da }
            goto L_0x00e0
        L_0x00dd:
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00e0:
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00eb }
        L_0x00ea:
            throw r1     // Catch:{ IOException -> 0x00eb }
        L_0x00eb:
            r1 = move-exception
            java.lang.String r0 = "FilterManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x00f3:
            r5 = r11
            X.6i3 r5 = (X.C133856i3) r5
            monitor-enter(r10)
            X.C626936e.A00()     // Catch:{ all -> 0x01a2 }
            int r1 = r5.A01(r14)     // Catch:{ all -> 0x01a2 }
            r4 = 1
            r6 = 0
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "DoodleEmojiManager/store/Storing files..."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01a2 }
            X.2s4 r2 = r5.A05     // Catch:{ IOException -> 0x0199 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0199 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0199 }
            java.io.InputStream r0 = r12.B47(r2, r1, r0)     // Catch:{ IOException -> 0x0199 }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x0199 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0199 }
            java.io.File r4 = r5.A0F(r13, r14, r4)     // Catch:{ all -> 0x018f }
            boolean r0 = X.C627536m.A0Q(r4)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0132
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare temporary cache subdirectory"
        L_0x012e:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x018f }
            goto L_0x0182
        L_0x0132:
            java.lang.String r1 = r4.getCanonicalPath()     // Catch:{ all -> 0x018f }
        L_0x0136:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ all -> 0x018f }
            if (r2 == 0) goto L_0x015c
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x018f }
            java.io.File r0 = X.C627536m.A06(r1, r0)     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x014a
            X.C627536m.A0R(r0, r3)     // Catch:{ all -> 0x018f }
            goto L_0x0136
        L_0x014a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "DoodleEmojiManager/store/Potentially malicious file:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x018f }
            goto L_0x012e
        L_0x015c:
            java.io.File r2 = r5.A0F(r13, r14, r6)     // Catch:{ all -> 0x018f }
            boolean r0 = X.C627536m.A0Q(r2)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory"
            goto L_0x012e
        L_0x0169:
            boolean r0 = r4.renameTo(r2)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0186
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "DoodleEmojiManager/store : rename failed, from "
            X.C18270x1.A1H(r1, r0, r4)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " to "
            X.C18270x1.A1H(r1, r0, r2)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018f }
            goto L_0x012e
        L_0x0182:
            r3.close()     // Catch:{ IOException -> 0x0199 }
            goto L_0x019f
        L_0x0186:
            r5.A0H(r14, r13)     // Catch:{ all -> 0x018f }
            r3.close()     // Catch:{ IOException -> 0x0199 }
            monitor-exit(r10)
        L_0x018d:
            r0 = 1
            return r0
        L_0x018f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0199 }
        L_0x0198:
            throw r1     // Catch:{ IOException -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            java.lang.String r0 = "DoodleEmojiManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01a2 }
        L_0x019f:
            monitor-exit(r10)
        L_0x01a0:
            r0 = 0
            return r0
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160827oN.A0E(X.4GL, java.lang.String, int):boolean");
    }

    public static void A00(AnonymousClass33p r10, AnonymousClass4FV r11) {
        String[] strArr = {"manifest", "filter", "doodle_emoji"};
        int i = 0;
        do {
            String str = strArr[i];
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r10), AnonymousClass000.A0V("downloadable_category_local_info_json_", str, AnonymousClass001.A0o()));
            if (!TextUtils.isEmpty(A0Z)) {
                try {
                    C626936e.A06(A0Z);
                    JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                    JSONObject optJSONObject = A1H.optJSONObject("bundles");
                    if (optJSONObject != null) {
                        HashMap A0t = AnonymousClass001.A0t();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String A0m = AnonymousClass001.A0m(keys);
                            A0t.put(A0m, optJSONObject.getString(A0m));
                        }
                        if (A0t != null && A0t.containsKey("0")) {
                            String num = Integer.toString(-1);
                            if (!A0t.containsKey(num)) {
                                Object obj = A0t.get("0");
                                A0t.clear();
                                A0t.put(num, obj);
                                A1H.put("bundles", new JSONObject(A0t));
                                AnonymousClass1WC r1 = new AnonymousClass1WC();
                                r1.A00 = Boolean.TRUE;
                                r11.BhD(r1);
                            }
                        }
                    }
                    r10.A1i(str, A1H.toString());
                } catch (JSONException e) {
                    Log.e("CategoryManager/migrateLocalCatInfo", e);
                }
            }
            i++;
        } while (i < 3);
    }

    public void A05() {
        if (this instanceof C133846i2) {
            C133846i2 r1 = (C133846i2) this;
            synchronized (r1) {
                r1.A00.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(int r13, int r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C133846i2
            if (r0 == 0) goto L_0x009a
            java.lang.String r6 = "filter"
        L_0x0006:
            X.7o1 r3 = r12.A02()
            r7 = 0
            if (r3 == 0) goto L_0x004a
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x004a
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CategoryManager/fetchCategoryFiles/Locale="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " is different than the one present="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for category "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ". Calling manifest now."
            X.C18260x0.A1J(r1, r0)
        L_0x0038:
            X.7WL r9 = new X.7WL
            r9.<init>(r12, r14, r13)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CategoryManager/getFilesAsync/Calling manifest to get latest version for category "
            X.C18260x0.A0q(r0, r6, r1)
            X.7l0 r3 = r12.A0B
            monitor-enter(r3)
            goto L_0x009e
        L_0x004a:
            if (r13 != 0) goto L_0x0038
            r1 = r12
            monitor-enter(r1)
            android.util.SparseArray r0 = r12.A01     // Catch:{ all -> 0x023b }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x023b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x023b }
            if (r0 != 0) goto L_0x005c
            monitor-exit(r1)
            r4 = 0
            goto L_0x0061
        L_0x005c:
            long r4 = r0.longValue()     // Catch:{ all -> 0x023b }
            monitor-exit(r1)
        L_0x0061:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r0
            X.2sH r0 = r12.A07
            long r1 = r0.A0H()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CategoryManager/fetchCategoryFiles/Last successful fetch is fresh, manifest check throttled for category "
            X.C18260x0.A0q(r0, r6, r1)
            boolean r0 = r12.A0D(r14)
            if (r0 != 0) goto L_0x0098
            r12.A06()
            X.2qk r1 = r12.A04
            java.lang.String r0 = "CategoryManager/state is up-to-date but files are not present!"
            X.AnonymousClass351.A03(r1, r0)
            r0 = 0
        L_0x0089:
            r12.A09(r0, r14)
            if (r3 != 0) goto L_0x0093
            r0 = 0
        L_0x008f:
            r12.A0C(r0)
            return
        L_0x0093:
            java.lang.String r0 = r3.A03(r14)
            goto L_0x008f
        L_0x0098:
            r0 = 5
            goto L_0x0089
        L_0x009a:
            java.lang.String r6 = "doodle_emoji"
            goto L_0x0006
        L_0x009e:
            java.lang.String r4 = "manifest"
            r8 = 0
            X.7Vu r0 = r3.A03     // Catch:{ JSONException -> 0x010f }
            if (r0 == 0) goto L_0x00a8
            X.7o1 r8 = r0.A00     // Catch:{ JSONException -> 0x010f }
            goto L_0x011f
        L_0x00a8:
            X.33p r2 = r3.A09     // Catch:{ JSONException -> 0x010f }
            android.content.SharedPreferences r5 = X.AnonymousClass0x2.A0F(r2)     // Catch:{ JSONException -> 0x010f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = "downloadable_category_local_info_json_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ JSONException -> 0x010f }
            java.lang.String r1 = X.C18280x3.A0Z(r5, r0)     // Catch:{ JSONException -> 0x010f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x010f }
            if (r0 != 0) goto L_0x011f
            X.4FV r0 = r3.A0C     // Catch:{ JSONException -> 0x010f }
            A00(r2, r0)     // Catch:{ JSONException -> 0x010f }
            X.7o1 r5 = X.C160627o1.A00(r1)     // Catch:{ JSONException -> 0x010f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/Local hash is "
            r1.append(r0)     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = r5.A01()     // Catch:{ JSONException -> 0x010f }
            X.C18260x0.A1J(r1, r0)     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = r5.A01()     // Catch:{ JSONException -> 0x010f }
            boolean r0 = X.AnonymousClass351.A04(r0)     // Catch:{ JSONException -> 0x010f }
            if (r0 != 0) goto L_0x00f0
            X.2qk r1 = r3.A04     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = "ManifestManager/getLocalManifestHash/Local manifest hash is not base64-urlsafe!"
            X.AnonymousClass351.A03(r1, r0)     // Catch:{ JSONException -> 0x010f }
            r2.A1i(r4, r7)     // Catch:{ JSONException -> 0x010f }
            goto L_0x011f
        L_0x00f0:
            X.2oU r0 = r3.A07     // Catch:{ JSONException -> 0x010f }
            android.content.Context r0 = r0.A00     // Catch:{ JSONException -> 0x010f }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ JSONException -> 0x010f }
            java.lang.String r0 = "downloadable/manifest.json"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ JSONException -> 0x010f }
            boolean r0 = r0.exists()     // Catch:{ JSONException -> 0x010f }
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/Local manifest hash is ok but manifest file is not present!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x010f }
            r2.A1i(r4, r7)     // Catch:{ JSONException -> 0x010f }
            goto L_0x011f
        L_0x010d:
            r8 = r5
            goto L_0x011f
        L_0x010f:
            r4 = move-exception
            X.2qk r2 = r3.A04     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/error while getting local manifest info. FIX ASAP"
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)     // Catch:{ all -> 0x0238 }
            X.AnonymousClass351.A03(r2, r0)     // Catch:{ all -> 0x0238 }
        L_0x011f:
            int r0 = r3.A00     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x022c
            r4 = 2
            if (r0 == r4) goto L_0x01a9
            r7 = 4
            if (r0 == r7) goto L_0x01a9
            if (r8 == 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            X.2sH r5 = r3.A06     // Catch:{ all -> 0x0236 }
            long r10 = r5.A0H()     // Catch:{ all -> 0x0236 }
            long r0 = r3.A03()     // Catch:{ all -> 0x0236 }
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x016e
            goto L_0x0173
        L_0x013f:
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x0236 }
            if (r1 == 0) goto L_0x012c
            X.33j r0 = r3.A0A     // Catch:{ all -> 0x0236 }
            java.util.Locale r0 = X.C620733j.A02(r0)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = X.C162307rf.A04(r0)     // Catch:{ all -> 0x0236 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x012c
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = "ManifestManager/computeState/is stale due to locale change, otherwise time left for staleness = "
            r2.append(r0)     // Catch:{ all -> 0x0236 }
            X.2sH r0 = r3.A06     // Catch:{ all -> 0x0236 }
            long r10 = r0.A0H()     // Catch:{ all -> 0x0236 }
            long r0 = r3.A03()     // Catch:{ all -> 0x0236 }
            long r10 = r10 - r0
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x0236 }
            X.C18260x0.A1J(r2, r0)     // Catch:{ all -> 0x0236 }
        L_0x016e:
            int r2 = r3.A02(r4)     // Catch:{ all -> 0x0236 }
            goto L_0x01b0
        L_0x0173:
            r0 = 1
            if (r13 != r0) goto L_0x0192
            if (r8 != 0) goto L_0x019a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = "ManifestManager/computeState/is stale because urgency is fetch_immediate and there is no local manifest info, otherwise time left for staleness = "
            r2.append(r0)     // Catch:{ all -> 0x0236 }
            long r4 = r5.A0H()     // Catch:{ all -> 0x0236 }
            long r0 = r3.A03()     // Catch:{ all -> 0x0236 }
            long r4 = r4 - r0
            java.lang.String r0 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0236 }
            X.C18260x0.A1J(r2, r0)     // Catch:{ all -> 0x0236 }
            goto L_0x01f1
        L_0x0192:
            if (r8 != 0) goto L_0x019a
            r0 = 3
            int r2 = r3.A02(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x01b0
        L_0x019a:
            X.7Vu r0 = r3.A03     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x01a3
            int r2 = r3.A02(r7)     // Catch:{ all -> 0x0236 }
            goto L_0x01b0
        L_0x01a3:
            r0 = 5
            int r2 = r3.A02(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x01b0
        L_0x01a9:
            java.lang.String r0 = "ManifestManager/computeState/Unexpected state encountered!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0236 }
            int r2 = r3.A00     // Catch:{ all -> 0x0236 }
        L_0x01b0:
            if (r2 == 0) goto L_0x022c
            if (r2 == r4) goto L_0x01f1
            r0 = 3
            if (r2 == r0) goto L_0x01d6
            r0 = 4
            if (r2 == r0) goto L_0x01d4
            r0 = 5
            if (r2 == r0) goto L_0x01be
            goto L_0x01d9
        L_0x01be:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Local Manifest is up-to-date"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0236 }
            X.7Vu r0 = r3.A03     // Catch:{ all -> 0x0236 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0236 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x0236 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0236 }
            X.7o1 r0 = (X.C160627o1) r0     // Catch:{ all -> 0x0236 }
            r9.A01(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x0234
        L_0x01d4:
            r7 = 0
            goto L_0x01f2
        L_0x01d6:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/no local manifest hash found and it's too soon for a server fetch, cannot get category info!"
            goto L_0x01ea
        L_0x01d9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Unexpected state : "
            r1.append(r0)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = X.C159047l0.A00(r2)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0236 }
        L_0x01ea:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0236 }
            r9.A00()     // Catch:{ all -> 0x0236 }
            goto L_0x0234
        L_0x01f1:
            r7 = 1
        L_0x01f2:
            r0 = 0
            r3.A02(r0)     // Catch:{ all -> 0x022a }
            if (r13 != 0) goto L_0x0215
            long r4 = r3.A02     // Catch:{ all -> 0x022a }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r0
            X.2sH r0 = r3.A06     // Catch:{ all -> 0x022a }
            long r1 = r0.A0H()     // Catch:{ all -> 0x022a }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0215
            java.lang.String r0 = "ManifestManager/loadAndService/Last failure is fresh, returning error!"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x022a }
            r0 = 1
            r3.A02(r0)     // Catch:{ all -> 0x022a }
            r9.A00()     // Catch:{ all -> 0x022a }
            goto L_0x0234
        L_0x0215:
            r3.A05(r9, r6)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "ManifestManager/loadAndService/Starting new thread to load."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x022a }
            X.4FS r2 = r3.A0G     // Catch:{ all -> 0x022a }
            r1 = 28
            X.5sI r0 = new X.5sI     // Catch:{ all -> 0x022a }
            r0.<init>(r3, r8, r1, r7)     // Catch:{ all -> 0x022a }
            r2.BkM(r0)     // Catch:{ all -> 0x022a }
            goto L_0x0234
        L_0x022a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x022c:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Loading in progress."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0236 }
            r3.A05(r9, r6)     // Catch:{ all -> 0x0236 }
        L_0x0234:
            monitor-exit(r3)
            return
        L_0x0236:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0238 }
        L_0x0238:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x023b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160827oN.A08(int, int):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0B(X.C160627o1 r21, X.C54832pM r22, java.lang.String r23, int r24) {
        /*
            r20 = this;
            r8 = r20
            X.C626936e.A00()
            r12 = r24
            int r0 = r8.A01(r12)
            r13 = 3
            boolean r0 = X.AnonymousClass000.A1U(r0, r13)
            X.C626936e.A0C(r0)
            X.C626936e.A00()
            int r0 = r8.A01(r12)
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r13)
            X.C626936e.A0C(r0)
            r9 = r21
            java.lang.String r15 = r9.A01
            X.7o1 r0 = r8.A02()
            r2 = 0
            if (r0 != 0) goto L_0x0065
            r4 = r2
        L_0x002e:
            java.lang.String r0 = r9.A03(r12)
            boolean r0 = r0.equals(r4)
            r1 = r1 ^ r0
            X.C626936e.A0C(r1)
            java.lang.String r3 = r9.A02
            r11 = r23
            if (r3 != 0) goto L_0x005b
            X.1VX r5 = r8.A0C
            X.2hI r3 = r8.A0F
            r14 = r8
            r16 = r11
            r17 = r4
            r18 = r2
            r19 = r12
            java.util.Map r1 = r14.A04(r15, r16, r17, r18, r19)
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass351.A00(r5, r3, r0)
            java.lang.String r3 = X.AnonymousClass351.A01(r0, r1)
        L_0x005b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CategoryManager/fetch/Creating connection to download data. Endpoint = "
            X.C18260x0.A0q(r0, r3, r1)
            goto L_0x006a
        L_0x0065:
            java.lang.String r4 = r0.A03(r12)
            goto L_0x002e
        L_0x006a:
            X.33K r1 = r8.A0E     // Catch:{ IOException -> 0x021d }
            X.2pq r0 = r8.A0G     // Catch:{ IOException -> 0x021d }
            X.4GL r3 = r1.A01(r0, r3, r2)     // Catch:{ IOException -> 0x021d }
            r0 = r3
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0213 }
            java.net.HttpURLConnection r7 = r0.A01     // Catch:{ all -> 0x0213 }
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x0213 }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Error, code="
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            int r0 = r7.getResponseCode()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x0213 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0213 }
            r3.close()     // Catch:{ IOException -> 0x021d }
            goto L_0x0223
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Response code from server="
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            int r0 = r7.getResponseCode()     // Catch:{ all -> 0x0213 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "idhash"
            java.lang.String r6 = r7.getHeaderField(r0)     // Catch:{ all -> 0x0213 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Server's idhash is "
            X.C18260x0.A0q(r0, r6, r1)     // Catch:{ all -> 0x0213 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x00cd
            X.2qk r1 = r8.A04     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Server did not return an idhash."
            X.AnonymousClass351.A03(r1, r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r5 = r9.A03(r12)     // Catch:{ all -> 0x0213 }
        L_0x00c8:
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x0213 }
            goto L_0x011e
        L_0x00cd:
            java.lang.String r0 = r9.A03(r12)     // Catch:{ all -> 0x0213 }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0213 }
            if (r0 != 0) goto L_0x011c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Server returned a different version="
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            r1.append(r6)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = " than in manifest="
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = r9.A03(r12)     // Catch:{ all -> 0x0213 }
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = ", marking manifest as stale(if needed) for category "
            X.C18260x0.A0q(r0, r15, r1)     // Catch:{ all -> 0x0213 }
            X.7l0 r5 = r8.A0B     // Catch:{ all -> 0x0213 }
            monitor-enter(r5)     // Catch:{ all -> 0x0213 }
            int r0 = r5.A01()     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x011b
            X.7Vu r0 = r5.A03     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x011b
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x0210 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x0210 }
            X.7o1 r0 = (X.C160627o1) r0     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x0210 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0116
            goto L_0x011b
        L_0x0116:
            r0 = 0
            r5.A04(r0)     // Catch:{ all -> 0x0210 }
        L_0x011b:
            monitor-exit(r5)     // Catch:{ all -> 0x0213 }
        L_0x011c:
            r5 = r6
            goto L_0x00c8
        L_0x011e:
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x0149
            if (r6 == 0) goto L_0x0131
            boolean r0 = r6.equals(r4)     // Catch:{ all -> 0x0213 }
            if (r0 != 0) goto L_0x0131
            X.2qk r1 = r8.A04     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Server's hash doesn't match manifest's even though server returned not-modified!"
            X.AnonymousClass351.A03(r1, r0)     // Catch:{ all -> 0x0213 }
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Unnecessary http request made. Category "
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            r1.append(r15)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = " is already up-to-date. Local idhash was "
            X.C18260x0.A0r(r0, r4, r1)     // Catch:{ all -> 0x0213 }
            r3.close()     // Catch:{ IOException -> 0x021d }
            if (r4 == 0) goto L_0x0223
            goto L_0x01fd
        L_0x0149:
            if (r6 == 0) goto L_0x0158
            boolean r0 = r6.equals(r4)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x0158
            X.2qk r1 = r8.A04     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Server's hash matches manifest's even though server didn't return not-modified!"
            X.AnonymousClass351.A03(r1, r0)     // Catch:{ all -> 0x0213 }
        L_0x0158:
            boolean r0 = r8.A0E(r3, r5, r12)     // Catch:{ all -> 0x0213 }
            java.lang.String r4 = "!"
            if (r0 != 0) goto L_0x0171
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Store failed for "
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            X.C18260x0.A0r(r15, r4, r1)     // Catch:{ all -> 0x0213 }
            r3.close()     // Catch:{ IOException -> 0x021d }
            goto L_0x0223
        L_0x0171:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CategoryManager/fetch/Store succeeded for "
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            X.C18260x0.A0q(r15, r4, r1)     // Catch:{ all -> 0x0213 }
            r8.A05()     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = r9.A01()     // Catch:{ all -> 0x0213 }
            monitor-enter(r8)     // Catch:{ all -> 0x0213 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x020d }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x020d }
            X.7o1 r0 = r8.A02()     // Catch:{ all -> 0x020d }
            r8.A00 = r0     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x020d }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x01b7
        L_0x01a2:
            boolean r0 = r8 instanceof X.C133846i2     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01c3
            java.lang.String r15 = "filter"
        L_0x01a8:
            X.7o1 r14 = new X.7o1     // Catch:{ all -> 0x020d }
            r19 = r2
            r17 = r11
            r18 = r2
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x020d }
            r8.A00 = r14     // Catch:{ all -> 0x020d }
        L_0x01b7:
            X.7o1 r0 = r8.A00     // Catch:{ all -> 0x020d }
            java.util.Map r1 = r0.A03     // Catch:{ all -> 0x020d }
            java.lang.String r0 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x020d }
            r1.put(r0, r5)     // Catch:{ all -> 0x020d }
            goto L_0x01c6
        L_0x01c3:
            java.lang.String r15 = "doodle_emoji"
            goto L_0x01a8
        L_0x01c6:
            X.33p r4 = r8.A0A     // Catch:{ JSONException -> 0x01db }
            boolean r0 = r8 instanceof X.C133846i2     // Catch:{ JSONException -> 0x01db }
            if (r0 == 0) goto L_0x01d8
            java.lang.String r1 = "filter"
        L_0x01ce:
            X.7o1 r0 = r8.A00     // Catch:{ JSONException -> 0x01db }
            java.lang.String r0 = r0.A02()     // Catch:{ JSONException -> 0x01db }
            r4.A1i(r1, r0)     // Catch:{ JSONException -> 0x01db }
            goto L_0x01f8
        L_0x01d8:
            java.lang.String r1 = "doodle_emoji"
            goto L_0x01ce
        L_0x01db:
            r6 = move-exception
            X.2qk r4 = r8.A04     // Catch:{ all -> 0x020d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "CategoryManager/setLocalIdHash/json exception while setting local category info for "
            r1.append(r0)     // Catch:{ all -> 0x020d }
            boolean r0 = r8 instanceof X.C133846i2     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = "filter"
        L_0x01ed:
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r6)     // Catch:{ all -> 0x020d }
            X.AnonymousClass351.A03(r4, r0)     // Catch:{ all -> 0x020d }
            goto L_0x01f8
        L_0x01f5:
            java.lang.String r0 = "doodle_emoji"
            goto L_0x01ed
        L_0x01f8:
            monitor-exit(r8)     // Catch:{ all -> 0x0213 }
            r3.close()     // Catch:{ IOException -> 0x021d }
            r4 = r5
        L_0x01fd:
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load succeeded!"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 5
            r8.A09(r0, r12)
            r8.A07(r12)
            r8.A0C(r4)
            return
        L_0x020d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0213 }
            throw r0     // Catch:{ all -> 0x0213 }
        L_0x0210:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0213 }
            throw r0     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0218 }
            goto L_0x021c
        L_0x0218:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x021d }
        L_0x021c:
            throw r1     // Catch:{ IOException -> 0x021d }
        L_0x021d:
            r1 = move-exception
            java.lang.String r0 = "CategoryManager/fetch/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0223:
            r10 = r22
            long r0 = r10.A01()
            long r6 = r10.A00()
            r4 = 17
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0254
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            monitor-enter(r8)
            android.util.SparseArray r3 = r8.A02     // Catch:{ all -> 0x0251 }
            X.2sH r0 = r8.A07     // Catch:{ all -> 0x0251 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x0251 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0251 }
            r3.put(r12, r0)     // Catch:{ all -> 0x0251 }
            monitor-exit(r8)
            r0 = 4
            r8.A09(r0, r12)
            r8.A0C(r2)
            return
        L_0x0251:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0254:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "CategoryManager/fetchWithBackoff/Load failed, will retry after "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = " seconds for the "
            r4.append(r2)
            long r2 = r10.A00()
            r4.append(r2)
            java.lang.String r2 = "th time"
            X.C18260x0.A1M(r4, r2)
            X.4FS r4 = r8.A0H
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            X.5sJ r7 = new X.5sJ
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "CategoryManager/fetch"
            r4.Bkn(r7, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160827oN.A0B(X.7o1, X.2pM, java.lang.String, int):void");
    }

    public boolean A0D(int i) {
        boolean A1X;
        if (this instanceof C133846i2) {
            C626936e.A0B(AnonymousClass000.A1U(i, -1));
            return ((C133846i2) this).A0H();
        }
        C133856i3 r1 = (C133856i3) this;
        synchronized (r1) {
            r1.A0G(i);
            A1X = C18300x5.A1X(r1.A02, i);
        }
        return A1X;
    }

    public C160827oN(C55682qk r2, C56492s4 r3, C29441ip r4, C56612sH r5, C54292oU r6, C57162tC r7, AnonymousClass33p r8, C159047l0 r9, AnonymousClass1VX r10, AnonymousClass4FV r11, AnonymousClass33K r12, C49912hI r13, C55132pq r14, AnonymousClass4FS r15) {
        this.A08 = r6;
        this.A07 = r5;
        this.A0C = r10;
        this.A04 = r2;
        this.A0H = r15;
        this.A05 = r3;
        this.A0D = r11;
        this.A0B = r9;
        this.A0G = r14;
        this.A0E = r12;
        this.A0A = r8;
        this.A06 = r4;
        this.A0F = r13;
        this.A09 = r7;
    }

    public Map A04(String str, String str2, String str3, String str4, int i) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("category", str);
        if (str2 != null) {
            A0t.put("locale", str2);
        }
        if (str3 != null) {
            A0t.put("existing_id", str3);
        }
        return A0t;
    }
}
