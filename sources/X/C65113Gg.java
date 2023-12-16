package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.3Gg  reason: invalid class name and case insensitive filesystem */
public class C65113Gg implements AnonymousClass4FW {
    public C29171iO A00;
    public C54292oU A01;
    public boolean A02 = false;

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.A02 = true;
        X.AnonymousClass29R.A00(r4, r2);
        X.C18260x0.A1R(X.AnonymousClass001.A0o(), "MediaTranscodeService/start-service-foreground for message:", r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWU(X.C624134x r8, int r9) {
        /*
            r7 = this;
            X.2oU r0 = r7.A01
            android.content.Context r4 = r0.A00
            java.util.HashMap r3 = com.whatsapp.media.transcode.MediaTranscodeService.A0B
            monitor-enter(r3)
            byte r1 = r8.A1I     // Catch:{ all -> 0x00b0 }
            r0 = 3
            r6 = 1
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 9
            if (r1 == r0) goto L_0x001c
            r0 = 2
            if (r1 != r0) goto L_0x004e
            int r0 = r8.A09     // Catch:{ all -> 0x00b0 }
            if (r0 == r6) goto L_0x004e
        L_0x001c:
            int r0 = r8.A0D     // Catch:{ all -> 0x00b0 }
            r2 = 0
            if (r0 != r6) goto L_0x006c
            X.2z0 r5 = r8.A1J     // Catch:{ all -> 0x00b0 }
            boolean r0 = r3.containsKey(r5)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x004e
            X.1mV r8 = (X.C30471mV) r8     // Catch:{ all -> 0x00b0 }
            r3.put(r5, r8)     // Catch:{ all -> 0x00b0 }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r4, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "com.whatsapp.media.transcode.MediaTranscodeService.START"
            android.content.Intent r2 = r1.setAction(r0)     // Catch:{ all -> 0x00b0 }
            X.1iO r0 = r7.A00     // Catch:{ all -> 0x00b0 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0050
            r7.A02 = r6     // Catch:{ all -> 0x00b0 }
            X.AnonymousClass29R.A00(r4, r2)     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x00b0 }
        L_0x004e:
            monitor-exit(r3)     // Catch:{ all -> 0x00b0 }
            goto L_0x00af
        L_0x0050:
            r4.startService(r2)     // Catch:{ IllegalStateException -> 0x005d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x005d }
            java.lang.String r0 = "MediaTranscodeService/start-service for message:"
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ IllegalStateException -> 0x005d }
            goto L_0x004e
        L_0x005d:
            r7.A02 = r6     // Catch:{ all -> 0x00b0 }
            X.AnonymousClass29R.A00(r4, r2)     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x00b0 }
            goto L_0x004e
        L_0x006c:
            X.2z0 r0 = r8.A1J     // Catch:{ all -> 0x00b0 }
            java.lang.Object r5 = r3.remove(r0)     // Catch:{ all -> 0x00b0 }
            X.1mV r5 = (X.C30471mV) r5     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x004e
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "MediaTranscodeService/stop-service for message:"
            X.2z0 r0 = X.C624134x.A08(r5, r0, r1)     // Catch:{ all -> 0x00b0 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x00b0 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b0 }
            r0 = 26
            if (r1 < r0) goto L_0x00a5
            boolean r0 = r7.A02     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r4, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "com.whatsapp.media.transcode.MediaTranscodeService.STOP"
            android.content.Intent r0 = r1.setAction(r0)     // Catch:{ all -> 0x00b0 }
            X.AnonymousClass29R.A00(r4, r0)     // Catch:{ all -> 0x00b0 }
        L_0x00a2:
            r7.A02 = r2     // Catch:{ all -> 0x00b0 }
            goto L_0x004e
        L_0x00a5:
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r4, r0)     // Catch:{ all -> 0x00b0 }
            r4.stopService(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00a2
        L_0x00af:
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65113Gg.BWU(X.34x, int):void");
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
