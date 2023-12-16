package X;

import android.content.Context;

/* renamed from: X.6l2  reason: invalid class name and case insensitive filesystem */
public abstract class C135656l2 extends C135676l4 {
    public final Context A00;

    public boolean A0R() {
        return false;
    }

    public C135656l2(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        X.C18260x0.A0u("failed to load SVG from ", r3, X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[ExcHandler: 0pi | IOException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Picture A00(android.content.Context r2, java.lang.String r3) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ 0pi | IOException -> 0x002b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 0pi | IOException -> 0x002b }
            java.lang.String r0 = "graphics/"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ 0pi | IOException -> 0x002b }
            X.0Yb r0 = new X.0Yb     // Catch:{ 0pi | IOException -> 0x002b }
            r0.<init>()     // Catch:{ 0pi | IOException -> 0x002b }
            java.io.InputStream r2 = r2.open(r1)     // Catch:{ 0pi | IOException -> 0x002b }
            X.0QT r1 = r0.A0R(r2)     // Catch:{ all -> 0x0026 }
            r2.close()     // Catch:{ IOException -> 0x001e, 0pi | IOException -> 0x002b }
        L_0x001e:
            if (r1 == 0) goto L_0x0035
            r0 = 0
            android.graphics.Picture r0 = r1.A00(r0)     // Catch:{ 0pi | IOException -> 0x002b }
            return r0
        L_0x0026:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x002a, 0pi | IOException -> 0x002b }
        L_0x002a:
            throw r0     // Catch:{ 0pi | IOException -> 0x002b }
        L_0x002b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "failed to load SVG from "
            X.C18260x0.A0u(r0, r3, r1, r2)
        L_0x0035:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135656l2.A00(android.content.Context, java.lang.String):android.graphics.Picture");
    }
}
