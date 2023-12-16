package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RZ;
import X.AnonymousClass0x2;
import X.AnonymousClass316;
import X.AnonymousClass33p;
import X.AnonymousClass34Z;
import X.AnonymousClass3DM;
import X.AnonymousClass4FO;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5PA;
import X.AnonymousClass5V3;
import X.AnonymousClass75D;
import X.AnonymousClass8SV;
import X.C101785Gc;
import X.C106965aS;
import X.C117165rU;
import X.C163217tS;
import X.C182358oH;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C24681Yi;
import X.C29441ip;
import X.C389229y;
import X.C38982Af;
import X.C44062Un;
import X.C47582dU;
import X.C51152jM;
import X.C55682qk;
import X.C56612sH;
import X.C58392vB;
import X.C58422vE;
import X.C58652vb;
import X.C61072zf;
import X.C620733j;
import X.C626936e;
import X.C63793Ax;
import X.C64333Db;
import X.C64713Eq;
import X.C69963Zi;
import X.C70003Zm;
import X.C70173a4;
import X.C72343dZ;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.security.Security;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spo";
    public final Context appContext;
    public final C58652vb appStartStat;
    public C101785Gc applicationCreatePerfTracker;
    public boolean asyncInitStarted;
    public boolean isFirstColdStart = false;
    public C620733j whatsAppLocale;

    /* JADX INFO: finally extract failed */
    private boolean decompressAsset(AnonymousClass34Z r15, C56612sH r16, boolean z, AnonymousClass4FV r18, C61072zf r19, AnonymousClass33p r20, C55682qk r21) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = z;
        try {
            if (r15.A03(this.appContext, COMPRESSED_LIBS_ARCHIVE_NAME, 0, false, z2)) {
                this.isFirstColdStart = true;
                C24681Yi r5 = new C24681Yi();
                r5.A02 = COMPRESSED_LIBS_ARCHIVE_NAME;
                r5.A01 = C18310x6.A0f(SystemClock.uptimeMillis(), uptimeMillis);
                r18.BhD(r5);
            }
            StringBuilder A0l = AnonymousClass000.A0l("AbstractAppShellDelegate/decompressAsset time:");
            A0l.append(C18310x6.A0A(uptimeMillis));
            A0l.append(" firstColdStart:");
            C18260x0.A1V(A0l, this.isFirstColdStart);
            return true;
        } catch (Exception e) {
            try {
                Log.w(AnonymousClass000.A0b("AbstractAppShellDelegate/decompressLibraries: Error decompressing archive libs.spo, usingLegacyMethod: ", AnonymousClass001.A0o(), z2), e);
                maybeReportDecompressionFailure(r19, e, r20, r21);
                StringBuilder A0l2 = AnonymousClass000.A0l("AbstractAppShellDelegate/decompressAsset time:");
                A0l2.append(C18310x6.A0A(uptimeMillis));
                A0l2.append(" firstColdStart:");
                C18260x0.A1V(A0l2, this.isFirstColdStart);
                return false;
            } catch (Throwable th) {
                StringBuilder A0l3 = AnonymousClass000.A0l("AbstractAppShellDelegate/decompressAsset time:");
                A0l3.append(C18310x6.A0A(uptimeMillis));
                A0l3.append(" firstColdStart:");
                C18260x0.A1V(A0l3, this.isFirstColdStart);
                throw th;
            }
        }
    }

    private void decompressLibraries(WhatsAppLibLoader whatsAppLibLoader, AnonymousClass34Z r19, C56612sH r20, C55682qk r21, AnonymousClass4FV r22, C61072zf r23, AnonymousClass33p r24) {
        Context context = this.appContext;
        try {
            WhatsAppLibLoader.A00(context, "superpack");
            byte[] bArr = new byte[3];
            try {
                AssetDecompressor.testDecompressorLibraryUsable(bArr);
                if (!Arrays.equals(new byte[]{71, 119, 83}, bArr)) {
                    Log.w("whatsappassetdecompressor/usable compressor test array does not match");
                    Log.e("AbstractAppShellDelegate/decompressLibraries: Could not load decompressor libraries");
                    return;
                }
                Log.i("whatsappassetdecompressor/decompressor-usable isLibraryUsable: True");
                Context context2 = this.appContext;
                boolean z = true;
                C626936e.A0C(!"2.23.26.14".isEmpty());
                int i = AssetDecompressor.get_architecture();
                StringBuilder A0l = AnonymousClass000.A0l("2.23.26.14");
                A0l.append(":");
                A0l.append(new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[i]);
                A0l.append(":");
                AnonymousClass34Z r10 = r19;
                r10.A01 = AnonymousClass001.A0k(A0l, C18290x4.A0B(AnonymousClass002.A0B(context2.getPackageCodePath()).lastModified()));
                r10.A02 = true;
                C63793Ax r2 = r10.A03;
                if (!(i == 0 || i == 3)) {
                    z = false;
                }
                r2.A01(z, AnonymousClass002.A0A(context2.getFilesDir(), "decompressed/libs.spo").getAbsolutePath());
                C56612sH r11 = r20;
                C55682qk r3 = r21;
                AnonymousClass4FV r13 = r22;
                C61072zf r14 = r23;
                AnonymousClass33p r15 = r24;
                C55682qk r16 = r3;
                if (!decompressAsset(r10, r11, false, r13, r14, r15, r16) && decompressAsset(r10, r11, true, r13, r14, r15, r16)) {
                    r3.A0A("AbstractAppShellDelegate/decompressLibraries/fallback", false, (String) null);
                }
            } catch (UnsatisfiedLinkError e) {
                Log.w("whatsappassetdecompressor/decompressor-usable error while testing compressor library usability testLibraryUsable", e);
            }
        } catch (UnsatisfiedLinkError e2) {
            C18260x0.A1R(AnonymousClass001.A0o(), "whatsapplibloader/compression library is corrupt/", e2);
            C18260x0.A0s("whatsapplibloader/load-startup-libs: install source ", context.getPackageManager().getInstallerPackageName(context.getPackageName()), AnonymousClass001.A0o());
        }
    }

    private void initCrashHandling(AnonymousClass3DM r1, C44062Un r2) {
        r1.A0A = r2;
        C38982Af.A00 = r1;
    }

    private void initLogging(C29441ip r2) {
        Log.connectivityInfoProvider = new C64713Eq(r2);
    }

    private void initStartupPathPerfLogging(AnonymousClass4FO r9) {
        C101785Gc r1 = (C101785Gc) ((C64333Db) r9).AcK.A00.A0Z.get();
        this.applicationCreatePerfTracker = r1;
        long j = this.appStartStat.A02;
        Log.d("ApplicationCreatePerfTracker/startAppCreationTracker");
        AnonymousClass316 r0 = r1.A00;
        r0.A0D.BKm(703926783, "perf_origin", "ApplicationCreatePerfTracker", j, TimeUnit.NANOSECONDS);
        r0.A08(j);
        C101785Gc r12 = this.applicationCreatePerfTracker;
        Log.d("ApplicationCreatePerfTracker/appCreationOnCreateStart");
        r12.A00.A0A("app_creation_on_create");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installAnrDetector(X.C56612sH r18, X.AnonymousClass1VX r19, X.AnonymousClass4FV r20, X.AnonymousClass3DO r21, com.whatsapp.nativelibloader.WhatsAppLibLoader r22, X.AnonymousClass2VW r23, X.C42962Qf r24) {
        /*
            r17 = this;
            r8 = r17
            X.5Gc r0 = r8.applicationCreatePerfTracker
            java.lang.String r14 = "InstallAnrDetector"
            X.316 r0 = r0.A00
            r0.A0A(r14)
            android.content.Context r6 = r8.appContext
            r5 = r22
            monitor-enter(r5)
            X.C626936e.A06(r6)     // Catch:{ all -> 0x01d9 }
            r7 = 1
            java.lang.Boolean r0 = r5.A00     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x00ba
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r5.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            X.34Z r1 = r5.A06     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.lang.String r0 = "libs.spo"
            boolean r0 = r1.A02(r6, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 == 0) goto L_0x00a2
            X.C155137eL.A00(r6)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String[] r3 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A09     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            int r4 = r3.length     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r2 = 0
        L_0x002d:
            if (r2 >= r4) goto L_0x003d
            r1 = r3[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            boolean r0 = X.AnonymousClass34Z.A01(r6, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x003a
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A00(r6, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x003d:
            java.lang.String[] r9 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A08     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            int r4 = r9.length     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r2 = 0
        L_0x0041:
            if (r2 >= r4) goto L_0x006f
            r10 = r9[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            boolean r0 = X.AnonymousClass34Z.A01(r6, r10)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "whatsapplibloader/system-load-optional-library start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.lang.System.loadLibrary(r10)     // Catch:{ UnsatisfiedLinkError -> 0x005f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsatisfiedLinkError -> 0x005f }
            java.lang.String r0 = "whatsapplibloader/load-optional-library loaded: "
            X.C18260x0.A0q(r0, r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x005f }
            goto L_0x0066
        L_0x005f:
            r1 = move-exception
            java.lang.String r0 = "whatsapplibloader/load-optional-library error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
        L_0x0066:
            java.lang.String r0 = "whatsapplibloader/system-load-optional-library end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0041
        L_0x006f:
            boolean r0 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A02()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "whatsapplibloader/load-startup-libs unable to use loaded libraries; trying install direct from apk"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.util.List r0 = java.util.Arrays.asList(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A01(r6, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs install direct from apk worked; retesting library usability"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            boolean r0 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A02()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "whatsapplibloader/load-startup-libs library usability still broken; throwing to corrupt installation activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.lang.String r1 = "unable to use libraries despite successful install directly from apk"
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            goto L_0x00c5
        L_0x009d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r5.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            goto L_0x00c6
        L_0x00a2:
            java.lang.String r0 = "whatsappsoloader/decompression failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            X.3LG r3 = r5.A05     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            android.os.Handler r2 = X.AnonymousClass000.A0A()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r1 = 31
            X.3Zy r0 = new X.3Zy     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r0.<init>(r6, r1, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r2.post(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            goto L_0x01cb
        L_0x00ba:
            boolean r0 = r0.booleanValue()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            if (r0 != 0) goto L_0x00c6
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
        L_0x00c5:
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
        L_0x00c6:
            monitor-exit(r5)
            r1 = 5391(0x150f, float:7.554E-42)
            X.2vE r0 = X.C58422vE.A02
            r2 = r19
            boolean r0 = r2.A0Y(r0, r1)
            java.lang.String r12 = "anr_detector"
            java.lang.String r15 = "abort_hook"
            java.lang.String r2 = "breakpad"
            r11 = r21
            r16 = r23
            if (r0 == 0) goto L_0x0156
            X.1Xz r10 = new X.1Xz
            r10.<init>()
            X.1Xz r9 = new X.1Xz
            r9.<init>()
            X.1Xz r7 = new X.1Xz
            r7.<init>()
            X.1Xz r6 = new X.1Xz
            r6.<init>()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = 3
            X.5sG r0 = new X.5sG
            r0.<init>((java.lang.Object) r8, (int) r1)
            r11.A01(r0, r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C24591Xz.A00(r10, r0, r4)
            java.lang.String r0 = "anrDetector/breakpad-manager"
            r10.A02 = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            r13 = 4
            X.8Lw r0 = new X.8Lw
            r0.<init>(r13)
            r11.A01(r0, r15)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C24591Xz.A00(r9, r0, r2)
            java.lang.String r0 = "anrDetector/abortHooks"
            r9.A02 = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            X.5sG r1 = new X.5sG
            r0 = r16
            r1.<init>((java.lang.Object) r0, (int) r13)
            r11.A01(r1, r12)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C24591Xz.A00(r7, r0, r2)
            java.lang.String r0 = "anrDetector/anrDetectorUtil"
            r7.A02 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C24591Xz.A00(r6, r0, r4)
            java.lang.String r0 = "anrDetector/overall"
            r6.A02 = r0
            r0 = r20
            r0.BhD(r10)     // Catch:{ all -> 0x0154 }
            r0.BhD(r9)     // Catch:{ all -> 0x0154 }
            r0.BhD(r7)     // Catch:{ all -> 0x0154 }
            r0.BhD(r6)     // Catch:{ all -> 0x0154 }
            goto L_0x01cc
        L_0x0154:
            r0 = move-exception
            throw r0
        L_0x0156:
            r1 = 5
            X.5sG r0 = new X.5sG
            r0.<init>((java.lang.Object) r8, (int) r1)
            r11.A01(r0, r2)
            r1 = 4
            X.8Lw r0 = new X.8Lw
            r0.<init>(r1)
            r11.A01(r0, r15)
            r2 = 6
            X.5sG r1 = new X.5sG
            r0 = r16
            r1.<init>((java.lang.Object) r0, (int) r2)
            r11.A01(r1, r12)
            goto L_0x01cc
        L_0x0174:
            r3 = move-exception
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r6.getPackageName()     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs: install source "
            X.C18260x0.A0s(r0, r2, r1)     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs: available internal storage: "
            r2.append(r0)     // Catch:{ all -> 0x01d9 }
            X.2zf r0 = r5.A04     // Catch:{ all -> 0x01d9 }
            long r0 = r0.A03()     // Catch:{ all -> 0x01d9 }
            X.C18260x0.A1I(r2, r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "WhatsAppLibLoader/loadStartupLibs"
            com.whatsapp.util.Log.e(r4, r3)     // Catch:{ all -> 0x01d9 }
            X.33p r3 = r5.A03     // Catch:{ all -> 0x01d7 }
            java.lang.String r2 = "corrupt_installation_reported_timestamp"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r0 = r3.A2P(r2, r0)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01bb
            X.2qk r1 = r5.A01     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "native libraries are missing"
            r1.A0A(r4, r7, r0)     // Catch:{ all -> 0x01d7 }
            r3.A1Y(r2)     // Catch:{ all -> 0x01d7 }
        L_0x01bb:
            X.3LG r3 = r5.A05     // Catch:{ all -> 0x01d9 }
            android.os.Handler r2 = X.AnonymousClass000.A0A()     // Catch:{ all -> 0x01d9 }
            r1 = 31
            X.3Zy r0 = new X.3Zy     // Catch:{ all -> 0x01d9 }
            r0.<init>(r6, r1, r3)     // Catch:{ all -> 0x01d9 }
            r2.post(r0)     // Catch:{ all -> 0x01d9 }
        L_0x01cb:
            monitor-exit(r5)
        L_0x01cc:
            com.whatsapp.wamsys.JniBridge.setDependencies(r24)
            X.5Gc r0 = r8.applicationCreatePerfTracker
            X.316 r0 = r0.A00
            r0.A09(r14)
            return
        L_0x01d7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.installAnrDetector(X.2sH, X.1VX, X.4FV, X.3DO, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.2VW, X.2Qf):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$installAnrDetector$0() {
        BreakpadManager.A00(this.appContext);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$installAnrDetector$2() {
        BreakpadManager.A00(this.appContext);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$onCreate$4() {
        return this.appContext.getString(R.string.gcm_defaultSenderId);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        if (X.C72303dV.A00(r6.BLG()) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void lambda$queueAsyncInit$5(X.C58392vB r5, X.AnonymousClass4FO r6) {
        /*
            java.lang.String r2 = "async-init"
            X.5ZC r1 = X.C58392vB.A01
            X.4FV r0 = r5.A00
            X.2bk r5 = new X.2bk
            r5.<init>(r0, r1, r2)
            r2 = r6
            X.3Db r2 = (X.C64333Db) r2
            X.4C1 r0 = r2.AQB
            X.8qC r0 = X.C72343dZ.A00(r0)
            java.lang.Object r0 = r0.get()
            X.9dq r0 = (X.C197769dq) r0
            r0.A00()
            X.3Db r0 = r2.AcK
            X.5bk r0 = r0.A00
            X.4C1 r0 = r0.A0c
            java.lang.Object r1 = r0.get()
            X.5Fn r1 = (X.C101635Fn) r1
            X.4C1 r0 = r2.ATh     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.2jE r0 = (X.C51072jE) r0     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0042
            X.3dV r0 = r6.BLG()     // Catch:{ all -> 0x0072 }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x0072 }
            r4 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0072 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0049:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0072 }
            X.66U r2 = (X.AnonymousClass66U) r2     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "Executing "
            r1.append(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r2.BDW()     // Catch:{ all -> 0x0072 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x006a
            r2.BMe()     // Catch:{ all -> 0x0072 }
        L_0x006a:
            r2.BMd()     // Catch:{ all -> 0x0072 }
            goto L_0x0049
        L_0x006e:
            r5.A00()
            return
        L_0x0072:
            r0 = move-exception
            r5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$5(X.2vB, X.4FO):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$queueAsyncInit$6(AnonymousClass4FO r8) {
        Log.i("app-init main thread idle");
        synchronized (this) {
            if (!this.asyncInitStarted) {
                this.asyncInitStarted = true;
                C64333Db r5 = (C64333Db) r8;
                AnonymousClass5PA r4 = (AnonymousClass5PA) C72343dZ.A00(r5.A25).get();
                r4.A0J.execute(new C117165rU(r4, 30, this.appContext));
                AnonymousClass4FS BsP = r8.BsP();
                C58392vB r3 = (C58392vB) r5.AQV.get();
                C47582dU AM5 = C389229y.A01(this.appContext).AcK.A00.AM5();
                Log.d("AppAsyncInit/BroadcastReceiver/begin");
                AnonymousClass0RZ.A01("AppAsyncInit/BroadcastReceiver");
                C69963Zi.A00(AM5.A05, 44).run();
                if (AM5.A0A.A0Y(C58422vE.A02, 5899)) {
                    Log.d("AppAsyncInit/BroadcastReceiver/async-registration");
                    AM5.A0F.BkM(C70003Zm.A00(AM5, 40));
                } else {
                    AM5.A00();
                }
                AnonymousClass0RZ.A00();
                Log.d("AppAsyncInit/BroadcastReceiver/end");
                C70173a4.A00(BsP, r8, r3, 9);
                ((C106965aS) r5.AcK.A00.ABl.get()).A03("AppInit", "End");
                Log.d("Preconditions/markAppInitIdleDone");
            }
        }
        return false;
    }

    private void maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(AnonymousClass4FO r5) {
        if (C18300x5.A1V(this.appContext.getDir("account_switching", 0), "checkpoint")) {
            Log.i("AbstractAppShellDelegate/onCreate/checkpoint file exists/recoverFromFailureToSwitchAccountsDuringAppStartup");
            ((C51152jM) C72343dZ.A00(((C64333Db) r5).A0V).get()).A02(true);
            r5.Azq().A0A("AbstractAppShellDelegate/recoverFromFailureToSwitchAccountsDuringAppStartup", false, (String) null);
        }
    }

    private void maybeReportDecompressionFailure(C61072zf r5, Exception exc, AnonymousClass33p r7, C55682qk r8) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AbstractAppShellDelegate/maybeReportDecompressionFailure: available internal storage: ");
        C18260x0.A1I(A0o, r5.A03());
        Log.e("AbstractAppShellDelegate/maybeReportDecompressionFailure", exc);
        if (r7.A2P("decompression_failure_reported_timestamp", 86400000)) {
            r8.A0A("AbstractAppShellDelegate/maybeReportDecompressionFailure", true, "superpack decompression failed");
            r7.A1Y("decompression_failure_reported_timestamp");
        }
    }

    private void setBouncyCastleProvider() {
        this.applicationCreatePerfTracker.A00.A0A("SetBouncyCastleProvider");
        Security.addProvider(new AnonymousClass8SV());
        this.applicationCreatePerfTracker.A00.A09("SetBouncyCastleProvider");
    }

    private void setStrictModePolicyForAppInit() {
        this.applicationCreatePerfTracker.A00.A0A("SetStrictModePolicyForAppInit");
        this.applicationCreatePerfTracker.A00.A09("SetStrictModePolicyForAppInit");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupTestEnvironmentForDebug() {
        /*
            r5 = this;
            android.content.Context r1 = r5.appContext     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "EndToEnd-Test"
            java.lang.String r0 = "Prepare"
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x004d }
            X.C106345Yp.A00 = r1     // Catch:{ all -> 0x004d }
            X.C106345Yp.A00()     // Catch:{ all -> 0x004d }
            org.json.JSONObject r0 = X.C106345Yp.A00()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "systemproperties"
            boolean r0 = r0.has(r1)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x004c
            org.json.JSONObject r0 = X.C106345Yp.A00()     // Catch:{ Exception -> 0x0046 }
            org.json.JSONObject r3 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0046 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r0 = "Setting E2E system properties: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ Exception -> 0x0046 }
            android.util.Log.w(r4, r0)     // Catch:{ Exception -> 0x0046 }
            java.util.Iterator r2 = r3.keys()     // Catch:{ Exception -> 0x0046 }
        L_0x0034:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0046 }
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r0 = r3.getString(r1)     // Catch:{ Exception -> 0x0046 }
            java.lang.System.setProperty(r1, r0)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0034
        L_0x0046:
            r1 = move-exception
            java.lang.String r0 = "Failed to set E2E system properties"
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x004d }
        L_0x004c:
            return
        L_0x004d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.setupTestEnvironmentForDebug():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C620733j r3 = this.whatsAppLocale;
        C626936e.A06(r3);
        Locale A00 = AnonymousClass75D.A00(configuration);
        if (!r3.A05.equals(A00)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("whatsapplocale/savedefaultlanguage/phone language changed to: ");
            C18260x0.A1L(A0o, A00.toLanguageTag());
            r3.A05 = A00;
            if (!r3.A06) {
                r3.A04 = A00;
                r3.A0Q();
                for (C182358oH BVk : r3.A0A) {
                    BVk.BVk();
                }
            }
        }
        C620733j r0 = this.whatsAppLocale;
        C626936e.A06(r0);
        r0.A0P();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:0|23|5|6|7|8|(1:10)(1:15)|11|(1:13)|14|16|17|18|19|(3:23|24|25)|26|27|(1:29)(3:33|(1:35)|36)|30|(3:32|37|38)(28:39|40|(4:42|(2:45|43)|155|46)|47|48|49|(1:51)(2:52|(1:56))|57|58|(1:60)|61|62|(6:64|65|66|67|68|69)(2:81|82)|83|84|(1:86)|87|88|89|(1:91)(4:92|93|94|95)|96|97|98|99|(2:101|45d)|125|126|127)|128|129|130|131|(1:(1:76))) */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0594, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        X.C626936e.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x059c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        X.AnonymousClass0RZ.A00();
        r5.A09("AppInit_main");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x05a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x01d9 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x021d A[Catch:{ all -> 0x0594, all -> 0x059c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0230 A[Catch:{ all -> 0x0594, all -> 0x059c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0231 A[Catch:{ all -> 0x0594, all -> 0x059c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0276 A[SYNTHETIC, Splitter:B:39:0x0276] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r35 = this;
            java.lang.String r20 = "MainThreadInit"
            r0 = r35
            android.content.Context r2 = r0.appContext
            java.lang.Class<X.4FO> r1 = X.AnonymousClass4FO.class
            java.lang.Object r2 = X.C389229y.A02(r2, r1)
            X.4FO r2 = (X.AnonymousClass4FO) r2
            X.1ip r1 = r2.AzX()
            r0.initLogging(r1)
            java.lang.String r1 = "AbstractAppShellDelegate/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(r2)
            X.2qk r3 = r2.Azq()
            X.3f8 r1 = com.whatsapp.util.Log.LOGGER_THREAD
            monitor-enter(r1)
            r1.A00 = r3     // Catch:{ all -> 0x05ab }
            monitor-exit(r1)
            r1 = r2
            X.3Db r1 = (X.C64333Db) r1
            X.4C1 r3 = r1.A76
            java.lang.Object r4 = r3.get()
            X.3DM r4 = (X.AnonymousClass3DM) r4
            X.4C1 r3 = r1.A45
            java.lang.Object r3 = r3.get()
            X.2Un r3 = (X.C44062Un) r3
            r4.A0A = r3
            X.C38982Af.A00 = r4
            r0.initStartupPathPerfLogging(r2)
            r0.logDebugInfo()
            X.3Db r3 = r1.AcK
            X.5bk r4 = r3.A00
            X.4C1 r3 = r4.ABl
            java.lang.Object r8 = r3.get()
            X.5aS r8 = (X.C106965aS) r8
            android.content.Context r7 = r0.appContext     // Catch:{ all -> 0x05a9 }
            X.3dI r6 = r8.A03     // Catch:{ all -> 0x05a9 }
            r5 = 40
            X.5rT r3 = new X.5rT     // Catch:{ all -> 0x05a9 }
            r3.<init>(r8, r5, r7)     // Catch:{ all -> 0x05a9 }
            r6.execute(r3)     // Catch:{ all -> 0x05a9 }
            java.lang.String r5 = "AppInit"
            java.lang.String r3 = "Resume"
            r8.A03(r5, r3)     // Catch:{ all -> 0x05a9 }
            X.5Gc r3 = r0.applicationCreatePerfTracker
            java.lang.String r7 = "DecompressLibraries"
            X.316 r3 = r3.A00
            r3.A0A(r7)
            X.4C1 r3 = r1.AbT
            java.lang.Object r8 = r3.get()
            com.whatsapp.nativelibloader.WhatsAppLibLoader r8 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r8
            X.4C1 r3 = r1.AbS
            java.lang.Object r6 = r3.get()
            X.34Z r6 = (X.AnonymousClass34Z) r6
            X.2sH r12 = r2.Bqh()
            X.2qk r13 = r2.Azq()
            X.4FV r14 = r2.BsT()
            X.4C1 r3 = r1.AXI
            java.lang.Object r3 = r3.get()
            X.2zf r3 = (X.C61072zf) r3
            X.33p r16 = r2.BsO()
            r9 = r0
            r10 = r8
            r11 = r6
            r15 = r3
            r9.decompressLibraries(r10, r11, r12, r13, r14, r15, r16)
            X.5Gc r3 = r0.applicationCreatePerfTracker
            X.316 r3 = r3.A00
            r3.A09(r7)
            X.2sH r9 = r2.Bqh()
            X.1VX r10 = r2.Avy()
            X.4FV r11 = r2.BsT()
            X.4C1 r3 = r4.AAK
            java.lang.Object r7 = r3.get()
            X.3DO r7 = (X.AnonymousClass3DO) r7
            X.4C1 r3 = r1.AbT
            java.lang.Object r6 = r3.get()
            com.whatsapp.nativelibloader.WhatsAppLibLoader r6 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r6
            X.4C1 r3 = r4.A03
            java.lang.Object r3 = r3.get()
            X.2VW r3 = (X.AnonymousClass2VW) r3
            X.2Qf r15 = r4.AQE()
            r8 = r0
            r12 = r7
            r13 = r6
            r14 = r3
            r8.installAnrDetector(r9, r10, r11, r12, r13, r14, r15)
            X.4C1 r3 = r1.AWR
            java.lang.Object r7 = r3.get()
            X.2sF r7 = (X.C56592sF) r7
            boolean r3 = X.C58042uc.A00()
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = "startuptracker/background start"
            com.whatsapp.util.Log.d((java.lang.String) r3)
        L_0x00e7:
            X.4C1 r3 = r1.AWR
            java.lang.Object r3 = r3.get()
            X.2sF r3 = (X.C56592sF) r3
            java.lang.String r7 = "decompress_libraries"
            boolean r6 = r0.isFirstColdStart
            X.316 r5 = r3.A03
            if (r5 == 0) goto L_0x00fb
            r3 = 1
            r5.A0D(r7, r6, r3)
        L_0x00fb:
            X.4C1 r3 = r1.AWR
            java.lang.Object r5 = r3.get()
            X.2sF r5 = (X.C56592sF) r5
            java.lang.String r21 = "app_creation_on_create"
            r3 = r21
            r5.A07(r3)
            X.4C1 r3 = r4.A5P
            java.lang.Object r4 = r3.get()
            X.5Gf r4 = (X.C101815Gf) r4
            r8 = 0
            X.934 r3 = new X.934
            r3.<init>(r0, r8)
            X.3dY r3 = X.C72333dY.A06(r3)
            r4.A00 = r3
            r0.setBouncyCastleProvider()
            r0.setStrictModePolicyForAppInit()
            java.lang.String r3 = "AppShell/onCreate"
            X.AnonymousClass0RZ.A01(r3)
            goto L_0x014c
        L_0x012a:
            r7.A01()
            android.os.Handler r6 = r7.A0B
            r3 = 18
            X.3bp r3 = X.C71263bp.A00(r7, r3)
            r6.post(r3)
            java.lang.String r3 = "startuptracker/cold start"
            com.whatsapp.util.Log.d((java.lang.String) r3)
            X.5ZC r3 = r7.A0M
            r7.A02 = r3
            r3 = 1
            r7.A01 = r3
            r3 = 24772609(0x17a0001, float:4.591775E-38)
            r7.A02(r3, r5)
            goto L_0x00e7
        L_0x014c:
            X.33j r3 = r2.BsW()     // Catch:{ all -> 0x05a4 }
            r0.whatsAppLocale = r3     // Catch:{ all -> 0x05a4 }
            X.4C1 r3 = r1.Aam     // Catch:{ all -> 0x05a4 }
            X.8qC r3 = X.C72343dZ.A00(r3)     // Catch:{ all -> 0x05a4 }
            java.lang.Object r19 = r3.get()     // Catch:{ all -> 0x05a4 }
            r3 = r19
            X.2og r3 = (X.C54412og) r3     // Catch:{ all -> 0x05a4 }
            r19 = r3
            X.5Gc r3 = r0.applicationCreatePerfTracker     // Catch:{ all -> 0x05a4 }
            X.316 r4 = r3.A00     // Catch:{ all -> 0x05a4 }
            r3 = r20
            r4.A0A(r3)     // Catch:{ all -> 0x05a4 }
            android.content.Context r3 = r0.appContext     // Catch:{ all -> 0x05a4 }
            X.3Db r4 = X.C389229y.A01(r3)     // Catch:{ all -> 0x05a4 }
            X.4C1 r3 = r4.AWR     // Catch:{ all -> 0x05a4 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x05a4 }
            X.2sF r7 = (X.C56592sF) r7     // Catch:{ all -> 0x05a4 }
            java.lang.String r18 = "main_thread_init"
            r3 = r18
            r7.A07(r3)     // Catch:{ all -> 0x05a4 }
            X.3Db r3 = r4.AcK     // Catch:{ all -> 0x05a4 }
            X.5bk r5 = r3.A00     // Catch:{ all -> 0x05a4 }
            X.4C1 r3 = r5.A0Z     // Catch:{ all -> 0x05a4 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x05a4 }
            X.5Gc r3 = (X.C101785Gc) r3     // Catch:{ all -> 0x05a4 }
            java.lang.String r4 = "app_init_instance"
            X.316 r3 = r3.A00     // Catch:{ all -> 0x05a4 }
            r3.A0A(r4)     // Catch:{ all -> 0x05a4 }
            X.2UK r12 = r5.AM4()     // Catch:{ all -> 0x05a4 }
            r3.A09(r4)     // Catch:{ all -> 0x05a4 }
            X.5Gc r3 = r12.A0A     // Catch:{ all -> 0x05a4 }
            java.lang.String r6 = "AppInit_main"
            X.316 r5 = r3.A00     // Catch:{ all -> 0x05a4 }
            r5.A0A(r6)     // Catch:{ all -> 0x05a4 }
            java.lang.String r3 = "AppInit/main"
            X.AnonymousClass0RZ.A01(r3)     // Catch:{ all -> 0x05a4 }
            android.content.Context r4 = r12.A00     // Catch:{ all -> 0x059c }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059c }
            r3 = 22
            if (r9 > r3) goto L_0x01d9
            java.lang.String r9 = "samsung"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x059c }
            boolean r3 = r9.equalsIgnoreCase(r3)     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x01d9
            java.lang.String r3 = "android.sec.clipboard.ClipboardUIManager"
            java.lang.Class r13 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r10 = "getInstance"
            r11 = 1
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x01d9 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r8] = r3     // Catch:{ Exception -> 0x01d9 }
            java.lang.reflect.Method r10 = r13.getDeclaredMethod(r10, r9)     // Catch:{ Exception -> 0x01d9 }
            r10.setAccessible(r11)     // Catch:{ Exception -> 0x01d9 }
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01d9 }
            r9[r8] = r4     // Catch:{ Exception -> 0x01d9 }
            r3 = 0
            r10.invoke(r3, r9)     // Catch:{ Exception -> 0x01d9 }
        L_0x01d9:
            android.app.Application r9 = X.AnonymousClass2A0.A00(r4)     // Catch:{ all -> 0x059c }
            X.8qC r3 = r12.A0G     // Catch:{ all -> 0x059c }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x059c }
            android.app.Application$ActivityLifecycleCallbacks r3 = (android.app.Application.ActivityLifecycleCallbacks) r3     // Catch:{ all -> 0x059c }
            r9.registerActivityLifecycleCallbacks(r3)     // Catch:{ all -> 0x059c }
            X.73Y r3 = new X.73Y     // Catch:{ all -> 0x059c }
            r3.<init>()     // Catch:{ all -> 0x059c }
            X.C379124n.A00 = r3     // Catch:{ all -> 0x059c }
            X.74R r9 = new X.74R     // Catch:{ all -> 0x059c }
            r9.<init>()     // Catch:{ all -> 0x059c }
            java.util.concurrent.atomic.AtomicReference r3 = X.C1459477x.A00     // Catch:{ all -> 0x059c }
            r3.set(r9)     // Catch:{ all -> 0x059c }
            X.C1441570g.A00 = r4     // Catch:{ all -> 0x059c }
            X.33j r10 = r12.A04     // Catch:{ all -> 0x059c }
            java.lang.String r9 = "StringPackIdsRegister"
            r5.A0A(r9)     // Catch:{ all -> 0x059c }
            X.8GD r3 = new X.8GD     // Catch:{ all -> 0x059c }
            r3.<init>()     // Catch:{ all -> 0x059c }
            X.C106375Ys.A02 = r3     // Catch:{ all -> 0x059c }
            r5.A09(r9)     // Catch:{ all -> 0x059c }
            java.lang.String r9 = "loadAndApplyForcedLanguage"
            r5.A0A(r9)     // Catch:{ all -> 0x059c }
            X.2og r3 = r10.A08     // Catch:{ all -> 0x059c }
            java.lang.String r11 = r3.A02()     // Catch:{ all -> 0x059c }
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x0231
            java.lang.String r3 = "whatsapplocale/loadandapplyforcedlanguage/no language to load"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x059c }
            r10.A06 = r8     // Catch:{ all -> 0x059c }
        L_0x0225:
            r5.A09(r9)     // Catch:{ all -> 0x059c }
            com.whatsapp.nativelibloader.WhatsAppLibLoader r3 = r12.A09     // Catch:{ all -> 0x059c }
            boolean r3 = r3.A03()     // Catch:{ all -> 0x059c }
            if (r3 != 0) goto L_0x0276
            goto L_0x026f
        L_0x0231:
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "whatsapplocale/loadandapplyforcedlanguage/language to load: "
            X.C18260x0.A0s(r3, r11, r13)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = X.C154327cz.A00(r11)     // Catch:{ all -> 0x059c }
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)     // Catch:{ all -> 0x059c }
            r10.A04 = r3     // Catch:{ all -> 0x059c }
            java.lang.String r3 = r3.getCountry()     // Catch:{ all -> 0x059c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x0263
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0l(r11)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "-IN"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r11)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = X.C154327cz.A00(r3)     // Catch:{ all -> 0x059c }
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)     // Catch:{ all -> 0x059c }
            r10.A04 = r3     // Catch:{ all -> 0x059c }
        L_0x0263:
            r3 = 1
            r10.A06 = r3     // Catch:{ all -> 0x059c }
            java.util.Locale r3 = r10.A04     // Catch:{ all -> 0x059c }
            java.util.Locale.setDefault(r3)     // Catch:{ all -> 0x059c }
            r10.A0R()     // Catch:{ all -> 0x059c }
            goto L_0x0225
        L_0x026f:
            X.2s4 r3 = r12.A03     // Catch:{ all -> 0x0592 }
            r3.A01()     // Catch:{ all -> 0x0592 }
            goto L_0x0533
        L_0x0276:
            X.3DE r9 = r12.A0C     // Catch:{ all -> 0x059c }
            X.2og r3 = r9.A00     // Catch:{ all -> 0x059c }
            android.content.SharedPreferences r14 = r3.A01     // Catch:{ all -> 0x059c }
            java.lang.String r13 = "version"
            java.lang.String r3 = "0.0.0"
            java.lang.String r15 = r14.getString(r13, r3)     // Catch:{ all -> 0x059c }
            java.lang.StringBuilder r10 = X.C18290x4.A0u(r15)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager/version; previous "
            X.C18260x0.A0q(r3, r15, r10)     // Catch:{ all -> 0x059c }
            java.lang.String r11 = "2.23.26.14"
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager/version; current "
            X.C18260x0.A0q(r3, r11, r10)     // Catch:{ all -> 0x059c }
            boolean r3 = r11.equals(r15)     // Catch:{ all -> 0x059c }
            r15 = r3 ^ 1
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager/version; version_changed="
            X.C18260x0.A1D(r3, r10, r15)     // Catch:{ all -> 0x059c }
            if (r15 == 0) goto L_0x02f6
            r15 = 1
            android.content.SharedPreferences$Editor r10 = r14.edit()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "run_on_connect_tasks_for_version_change"
            X.C18270x1.A0l(r10, r3, r15)     // Catch:{ all -> 0x059c }
            android.content.SharedPreferences$Editor r10 = r14.edit()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "async_tasks_pending_for_version_change"
            X.C18270x1.A0l(r10, r3, r15)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager/version; trigger app updated events"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager: app updated event (via app init) scheduling async observers for later"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x059c }
            X.2jE r3 = r9.A01     // Catch:{ all -> 0x059c }
            r3.A00()     // Catch:{ all -> 0x059c }
            X.8qC r3 = r9.A03     // Catch:{ all -> 0x059c }
            java.util.Iterator r15 = X.AnonymousClass0x2.A0j(r3)     // Catch:{ all -> 0x059c }
        L_0x02d3:
            boolean r3 = r15.hasNext()     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x02ef
            java.lang.Object r10 = r15.next()     // Catch:{ all -> 0x059c }
            X.65i r10 = (X.C1226865i) r10     // Catch:{ all -> 0x059c }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "AppUpdatedEventManager: handling "
            X.C18260x0.A1T(r9, r3, r10)     // Catch:{ all -> 0x059c }
            X.AnonymousClass0x2.A18(r9)     // Catch:{ all -> 0x059c }
            r10.BMW()     // Catch:{ all -> 0x059c }
            goto L_0x02d3
        L_0x02ef:
            android.content.SharedPreferences$Editor r3 = r14.edit()     // Catch:{ all -> 0x059c }
            X.C18270x1.A0j(r3, r13, r11)     // Catch:{ all -> 0x059c }
        L_0x02f6:
            X.8qC r3 = r12.A0N     // Catch:{ all -> 0x059c }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x059c }
            com.whatsapp.NativeMediaHandler r3 = (com.whatsapp.NativeMediaHandler) r3     // Catch:{ all -> 0x059c }
            com.whatsapp.NativeMediaHandler.initFileHandlingCallbacks(r3)     // Catch:{ all -> 0x059c }
            X.8qC r3 = r12.A0H     // Catch:{ all -> 0x059c }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x059c }
            X.5Id r10 = (X.C102255Id) r10     // Catch:{ all -> 0x059c }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x059c }
            X.C626936e.A01 = r3     // Catch:{ all -> 0x059c }
            r9 = 1
            X.8qC r3 = r10.A02     // Catch:{ all -> 0x0594 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0594 }
            X.2jE r3 = (X.C51072jE) r3     // Catch:{ all -> 0x0594 }
            int r11 = r3.A00()     // Catch:{ all -> 0x0594 }
            r3 = 6
            if (r11 != r3) goto L_0x032b
            X.8qC r3 = r10.A01     // Catch:{ all -> 0x0594 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0594 }
            X.1hy r3 = (X.C28911hy) r3     // Catch:{ all -> 0x0594 }
            r3.A08()     // Catch:{ all -> 0x0594 }
            goto L_0x0349
        L_0x032b:
            X.8qC r3 = r10.A00     // Catch:{ all -> 0x0594 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0594 }
            X.2jr r3 = (X.C51462jr) r3     // Catch:{ all -> 0x0594 }
            int r11 = r3.A00()     // Catch:{ all -> 0x0594 }
            r3 = 7
            if (r11 == r3) goto L_0x033e
            r3 = 9
            if (r11 != r3) goto L_0x0349
        L_0x033e:
            X.8qC r3 = r10.A01     // Catch:{ all -> 0x0594 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0594 }
            X.1hy r3 = (X.C28911hy) r3     // Catch:{ all -> 0x0594 }
            r3.A0B(r9)     // Catch:{ all -> 0x0594 }
        L_0x0349:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x059c }
            X.C626936e.A01 = r3     // Catch:{ all -> 0x059c }
            X.8qC r9 = r10.A00     // Catch:{ all -> 0x059c }
            java.lang.Object r3 = r9.get()     // Catch:{ all -> 0x059c }
            X.2jr r3 = (X.C51462jr) r3     // Catch:{ all -> 0x059c }
            boolean r3 = r3.A02()     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r9.get()     // Catch:{ all -> 0x059c }
            X.2jr r3 = (X.C51462jr) r3     // Catch:{ all -> 0x059c }
            r3.A01(r8)     // Catch:{ all -> 0x059c }
        L_0x0366:
            X.1ht r10 = r12.A0B     // Catch:{ all -> 0x0592 }
            X.2oU r3 = r10.A01     // Catch:{ all -> 0x0592 }
            android.content.Context r11 = r3.A00     // Catch:{ all -> 0x0592 }
            java.io.File r3 = r11.getFilesDir()     // Catch:{ all -> 0x0592 }
            java.lang.String r9 = "login_failed"
            java.io.File r3 = X.AnonymousClass002.A0A(r3, r9)     // Catch:{ all -> 0x0592 }
            r3.getAbsolutePath()     // Catch:{ all -> 0x0592 }
            r3.exists()     // Catch:{ all -> 0x0592 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0592 }
            if (r3 == 0) goto L_0x03a6
            java.io.FileInputStream r3 = r11.openFileInput(r9)     // Catch:{ IOException -> 0x039f }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x039f }
            r11.<init>(r3)     // Catch:{ IOException -> 0x039f }
            boolean r3 = r11.readBoolean()     // Catch:{ all -> 0x0395 }
            r10.A00 = r3     // Catch:{ all -> 0x0395 }
            r11.close()     // Catch:{ IOException -> 0x039f }
            goto L_0x03ad
        L_0x0395:
            r9 = move-exception
            r11.close()     // Catch:{ all -> 0x039a }
            goto L_0x039e
        L_0x039a:
            r3 = move-exception
            r9.addSuppressed(r3)     // Catch:{ IOException -> 0x039f }
        L_0x039e:
            throw r9     // Catch:{ IOException -> 0x039f }
        L_0x039f:
            r9 = move-exception
            java.lang.String r3 = "loginmanager/failed login_failed"
            com.whatsapp.util.Log.w(r3, r9)     // Catch:{ all -> 0x0592 }
            goto L_0x03ab
        L_0x03a6:
            java.lang.String r3 = "loginmanager/loadloginfailed/none"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0592 }
        L_0x03ab:
            r10.A00 = r8     // Catch:{ all -> 0x0592 }
        L_0x03ad:
            X.2qk r3 = r12.A01     // Catch:{ all -> 0x059c }
            X.C69423Wy.A04 = r3     // Catch:{ all -> 0x059c }
            X.2p2 r11 = X.C69423Wy.A06     // Catch:{ all -> 0x059c }
            r11.A02 = r3     // Catch:{ all -> 0x059c }
            X.1VX r9 = r12.A08     // Catch:{ all -> 0x059c }
            X.8y5 r10 = r12.A0D     // Catch:{ all -> 0x059c }
            X.C162457s7.A0J(r9, r8)     // Catch:{ all -> 0x059c }
            r3 = 1
            X.C162457s7.A0J(r10, r3)     // Catch:{ all -> 0x059c }
            r3 = 4524(0x11ac, float:6.34E-42)
            X.2vE r10 = X.C58422vE.A02     // Catch:{ all -> 0x059c }
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A03 = r3     // Catch:{ all -> 0x059c }
            r3 = 5509(0x1585, float:7.72E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A04 = r3     // Catch:{ all -> 0x059c }
            r3 = 5510(0x1586, float:7.721E-42)
            r9.A0X(r3)     // Catch:{ all -> 0x059c }
            r3 = 5353(0x14e9, float:7.501E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A05 = r3     // Catch:{ all -> 0x059c }
            r3 = 6481(0x1951, float:9.082E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A06 = r3     // Catch:{ all -> 0x059c }
            r3 = 3985(0xf91, float:5.584E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A07 = r3     // Catch:{ all -> 0x059c }
            r3 = 6851(0x1ac3, float:9.6E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A01 = r3     // Catch:{ all -> 0x059c }
            r3 = 6629(0x19e5, float:9.289E-42)
            boolean r3 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x059c }
            X.C1001059l.A02 = r3     // Catch:{ all -> 0x059c }
            boolean r3 = X.C1001059l.A04     // Catch:{ all -> 0x059c }
            if (r3 == 0) goto L_0x040a
            X.2GD r3 = new X.2GD     // Catch:{ all -> 0x059c }
            r3.<init>()     // Catch:{ all -> 0x059c }
            X.C1001059l.A00 = r3     // Catch:{ all -> 0x059c }
        L_0x040a:
            java.lang.String r3 = "AppInit/msgStore/checkHealth"
            X.AnonymousClass0RZ.A01(r3)     // Catch:{ all -> 0x059c }
            java.lang.String r13 = "MsgStoreInit"
            r5.A0A(r13)     // Catch:{ all -> 0x059c }
            X.2sr r3 = r12.A02     // Catch:{ all -> 0x058a }
            com.whatsapp.Me r3 = X.C56972sr.A00(r3)     // Catch:{ all -> 0x058a }
            if (r3 == 0) goto L_0x042c
            X.2sA r14 = r12.A05     // Catch:{ all -> 0x058a }
            r3 = 1
            r14.A08(r3)     // Catch:{ all -> 0x058a }
            r3 = 39
            X.3Zm r3 = X.C70003Zm.A00(r12, r3)     // Catch:{ all -> 0x058a }
            r3.run()     // Catch:{ all -> 0x058a }
            goto L_0x0449
        L_0x042c:
            X.8qC r3 = r12.A0M     // Catch:{ all -> 0x058a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x058a }
            X.3dV r3 = (X.C72303dV) r3     // Catch:{ all -> 0x058a }
            X.2rF r3 = r3.A02     // Catch:{ all -> 0x058a }
            r3.A01()     // Catch:{ all -> 0x058a }
            java.lang.String r3 = "app-init/main/sendInitialMigrationInfoNeededBroadcast"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0588 }
            X.8qC r3 = r12.A0J     // Catch:{ all -> 0x0588 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0588 }
            X.2mq r3 = (X.C53282mq) r3     // Catch:{ all -> 0x0588 }
            r3.A01()     // Catch:{ all -> 0x0588 }
        L_0x0449:
            r5.A09(r13)     // Catch:{ all -> 0x059c }
            X.AnonymousClass0RZ.A00()     // Catch:{ all -> 0x059c }
            X.4FS r3 = r12.A0E     // Catch:{ all -> 0x0592 }
            boolean r3 = r3 instanceof X.C69423Wy     // Catch:{ all -> 0x0592 }
            if (r3 == 0) goto L_0x04ac
            r3 = 1442(0x5a2, float:2.02E-42)
            boolean r16 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x0592 }
            java.util.concurrent.Executor r14 = X.C69423Wy.A08     // Catch:{ all -> 0x0592 }
            monitor-enter(r11)     // Catch:{ all -> 0x0592 }
            java.util.List r13 = r11.A01     // Catch:{ all -> 0x04a8 }
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x04a8 }
            X.C626936e.A0C(r3)     // Catch:{ all -> 0x04a8 }
            java.lang.String r3 = "job-anomaly-detector-thread"
            android.os.HandlerThread r15 = new android.os.HandlerThread     // Catch:{ all -> 0x04a8 }
            r15.<init>(r3)     // Catch:{ all -> 0x04a8 }
            r15.start()     // Catch:{ all -> 0x04a8 }
            X.2pN r9 = r11.A00     // Catch:{ all -> 0x04a8 }
            X.1uM r3 = new X.1uM     // Catch:{ all -> 0x04a8 }
            r3.<init>(r9, r14)     // Catch:{ all -> 0x04a8 }
            r13.add(r3)     // Catch:{ all -> 0x04a8 }
            X.6q5 r3 = new X.6q5     // Catch:{ all -> 0x04a8 }
            r3.<init>(r15, r9, r14)     // Catch:{ all -> 0x04a8 }
            r13.add(r3)     // Catch:{ all -> 0x04a8 }
            if (r16 == 0) goto L_0x048d
            X.1uN r3 = new X.1uN     // Catch:{ all -> 0x04a8 }
            r3.<init>(r9, r14)     // Catch:{ all -> 0x04a8 }
            r13.add(r3)     // Catch:{ all -> 0x04a8 }
        L_0x048d:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x0491:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r3 == 0) goto L_0x04ab
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x04a8 }
            X.2pC r9 = (X.C54732pC) r9     // Catch:{ all -> 0x04a8 }
            monitor-enter(r9)     // Catch:{ all -> 0x04a8 }
            java.util.Set r3 = r9.A02     // Catch:{ all -> 0x04a5 }
            r3.add(r11)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r9)     // Catch:{ all -> 0x04a8 }
            goto L_0x0491
        L_0x04a5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x04a8 }
            throw r0     // Catch:{ all -> 0x04a8 }
        L_0x04a8:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0592 }
            throw r0     // Catch:{ all -> 0x0592 }
        L_0x04ab:
            monitor-exit(r11)     // Catch:{ all -> 0x0592 }
        L_0x04ac:
            X.2s4 r3 = r12.A03     // Catch:{ all -> 0x0592 }
            r3.A01()     // Catch:{ all -> 0x0592 }
            X.2pr r3 = r12.A0F     // Catch:{ all -> 0x0592 }
            r3.A01(r4)     // Catch:{ all -> 0x0592 }
            X.8qC r3 = r12.A0I     // Catch:{ all -> 0x0592 }
            java.lang.Object r12 = r3.get()     // Catch:{ all -> 0x0592 }
            X.2Tu r12 = (X.C43872Tu) r12     // Catch:{ all -> 0x0592 }
            X.1VX r9 = r12.A01     // Catch:{ all -> 0x0592 }
            r3 = 687(0x2af, float:9.63E-43)
            boolean r33 = r9.A0Y(r10, r3)     // Catch:{ all -> 0x0592 }
            X.8qC r3 = r12.A0B     // Catch:{ all -> 0x0592 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0592 }
            X.4FV r3 = (X.AnonymousClass4FV) r3     // Catch:{ all -> 0x0592 }
            X.8qC r13 = r12.A02     // Catch:{ all -> 0x0592 }
            java.util.Objects.requireNonNull(r13)     // Catch:{ all -> 0x0592 }
            r11 = 5
            X.5bc r14 = new X.5bc     // Catch:{ all -> 0x0592 }
            r14.<init>(r13, r11)     // Catch:{ all -> 0x0592 }
            r13 = 0
            X.3dY r17 = new X.3dY     // Catch:{ all -> 0x0592 }
            r11 = r17
            r11.<init>(r13, r14)     // Catch:{ all -> 0x0592 }
            X.2Gq r16 = new X.2Gq     // Catch:{ all -> 0x0592 }
            r11 = r16
            r11.<init>(r12)     // Catch:{ all -> 0x0592 }
            X.2L6 r15 = new X.2L6     // Catch:{ all -> 0x0592 }
            r15.<init>(r4, r12)     // Catch:{ all -> 0x0592 }
            X.8qC r14 = r12.A05     // Catch:{ all -> 0x0592 }
            java.util.Objects.requireNonNull(r14)     // Catch:{ all -> 0x0592 }
            r12 = 6
            X.5bc r11 = new X.5bc     // Catch:{ all -> 0x0592 }
            r11.<init>(r14, r12)     // Catch:{ all -> 0x0592 }
            X.3dY r12 = new X.3dY     // Catch:{ all -> 0x0592 }
            r12.<init>(r13, r11)     // Catch:{ all -> 0x0592 }
            r28 = 3
            r29 = 100
            r11 = 3991(0xf97, float:5.593E-42)
            boolean r34 = r9.A0Y(r10, r11)     // Catch:{ all -> 0x0592 }
            r30 = 8
            r11 = 305(0x131, float:4.27E-43)
            int r31 = r9.A0O(r10, r11)     // Catch:{ all -> 0x0592 }
            r32 = 1
            r22 = r3
            r23 = r4
            r24 = r16
            r25 = r15
            r26 = r17
            r27 = r12
            r22.BFx(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0592 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "app-init/async/device_info/OS_BUILD_NUMBER "
            r4.append(r3)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ all -> 0x059c }
            X.C18260x0.A1L(r4, r3)     // Catch:{ all -> 0x059c }
            java.lang.String r3 = "app-init/main/done"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x059c }
        L_0x0533:
            X.AnonymousClass0RZ.A00()     // Catch:{ all -> 0x05a4 }
            r5.A09(r6)     // Catch:{ all -> 0x05a4 }
            java.lang.String r5 = "init"
            java.lang.String r4 = "_end"
            java.lang.String r3 = "main_thread"
            r7.A09(r3, r5, r4)     // Catch:{ all -> 0x05a4 }
            r3 = r18
            r7.A06(r3)     // Catch:{ all -> 0x05a4 }
            X.5Gc r3 = r0.applicationCreatePerfTracker     // Catch:{ all -> 0x05a4 }
            X.316 r4 = r3.A00     // Catch:{ all -> 0x05a4 }
            r3 = r20
            r4.A09(r3)     // Catch:{ all -> 0x05a4 }
            android.os.ConditionVariable r3 = X.C626936e.A00     // Catch:{ all -> 0x05a4 }
            r3.open()     // Catch:{ all -> 0x05a4 }
            r0.queueAsyncInit(r2)     // Catch:{ all -> 0x05a4 }
            X.AnonymousClass0RZ.A00()
            int r2 = r19.A01()
            X.C06280Wy.A02(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            X.C626936e.A01 = r2
            X.5Gc r2 = r0.applicationCreatePerfTracker
            java.lang.String r0 = "ApplicationCreatePerfTracker/appCreationOnCreateEnd"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.316 r2 = r2.A00
            r0 = r21
            r2.A09(r0)
            r0 = 2
            r2.A0E(r0)
            X.4C1 r0 = r1.AWR
            java.lang.Object r1 = r0.get()
            X.2sF r1 = (X.C56592sF) r1
            r0 = r21
            r1.A06(r0)
            return
        L_0x0588:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x058a }
        L_0x058a:
            r1 = move-exception
            r5.A09(r13)     // Catch:{ all -> 0x059c }
            X.AnonymousClass0RZ.A00()     // Catch:{ all -> 0x059c }
            goto L_0x059b
        L_0x0592:
            r1 = move-exception
            goto L_0x059b
        L_0x0594:
            r1 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x059c }
            X.C626936e.A01 = r0     // Catch:{ all -> 0x059c }
        L_0x059b:
            throw r1     // Catch:{ all -> 0x059c }
        L_0x059c:
            r0 = move-exception
            X.AnonymousClass0RZ.A00()     // Catch:{ all -> 0x05a4 }
            r5.A09(r6)     // Catch:{ all -> 0x05a4 }
            throw r0     // Catch:{ all -> 0x05a4 }
        L_0x05a4:
            r0 = move-exception
            X.AnonymousClass0RZ.A00()
            throw r0
        L_0x05a9:
            r0 = move-exception
            throw r0
        L_0x05ab:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.onCreate():void");
    }

    public AbstractAppShellDelegate(Context context, C58652vb r3) {
        this.appContext = context;
        this.appStartStat = r3;
    }

    private void logDebugInfo() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AbstractAppShellDelegate/debug_info: pkg=");
        A0o.append(this.appContext.getPackageName());
        A0o.append("; v=");
        A0o.append(AnonymousClass5V3.A00());
        A0o.append("; vc=");
        A0o.append(232614005);
        A0o.append("; p=");
        A0o.append("consumer");
        A0o.append("; e=");
        A0o.append(45);
        A0o.append("; g=");
        A0o.append("v2.23.26.13-257-gadfd91dc8b0c");
        A0o.append("; t=");
        A0o.append(1702528694000L);
        A0o.append("; d=");
        AnonymousClass0x2.A1N(A0o, Build.MANUFACTURER);
        A0o.append(Build.MODEL);
        A0o.append("; os=Android ");
        A0o.append(Build.VERSION.RELEASE);
        A0o.append("; abis=");
        C18260x0.A1L(A0o, TextUtils.join(",", Build.SUPPORTED_ABIS));
    }

    private void queueAsyncInit(AnonymousClass4FO r3) {
        Looper.myQueue().addIdleHandler(new C163217tS(r3, this));
    }
}
