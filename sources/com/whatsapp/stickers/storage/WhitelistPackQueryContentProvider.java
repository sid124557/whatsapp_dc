package com.whatsapp.stickers.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C18320x8;
import X.C18530xp;
import X.C60462yb;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;

public class WhitelistPackQueryContentProvider extends C18530xp {
    public UriMatcher A00;
    public C60462yb A01;

    public int delete(Uri uri, String str, String[] strArr) {
        throw C18320x8.A0m();
    }

    public String getType(Uri uri) {
        A08();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("vnd.android.cursor.item/vnd.");
        A0o.append("com.whatsapp.provider.sticker_whitelist_check");
        A0o.append(".");
        return AnonymousClass000.A0X("is_whitelisted", A0o);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw C18320x8.A0m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        com.whatsapp.util.Log.e("Exception when querying whitelist packs", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            r7 = this;
            r7.A08()
            r6 = 0
            r4 = r7
            monitor-enter(r4)     // Catch:{ Exception -> 0x0097 }
            android.content.UriMatcher r0 = r7.A00     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x001a
            r0 = -1
            android.content.UriMatcher r3 = new android.content.UriMatcher     // Catch:{ all -> 0x0094 }
            r3.<init>(r0)     // Catch:{ all -> 0x0094 }
            r7.A00 = r3     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "com.whatsapp.provider.sticker_whitelist_check"
            java.lang.String r1 = "is_whitelisted"
            r0 = 1
            r3.addURI(r2, r1, r0)     // Catch:{ all -> 0x0094 }
        L_0x001a:
            android.content.UriMatcher r0 = r7.A00     // Catch:{ all -> 0x0094 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0097 }
            int r0 = r0.match(r8)     // Catch:{ Exception -> 0x0097 }
            r4 = 1
            if (r0 != r4) goto L_0x0093
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x0097 }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = "authority"
            java.lang.String r3 = r8.getQueryParameter(r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = "identifier"
            java.lang.String r5 = r8.getQueryParameter(r0)     // Catch:{ Exception -> 0x0097 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0097 }
            if (r0 != 0) goto L_0x0093
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0097 }
            if (r0 != 0) goto L_0x0093
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r3, r0)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r2 = r7.getCallingPackage()     // Catch:{ Exception -> 0x0097 }
            if (r2 == 0) goto L_0x0081
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x0097 }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "result"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0097 }
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x0097 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0097 }
            android.database.MatrixCursor$RowBuilder r1 = r2.newRow()     // Catch:{ Exception -> 0x0097 }
            X.2yb r0 = r7.A01     // Catch:{ Exception -> 0x0097 }
            boolean r0 = r0.A03(r3, r5)     // Catch:{ Exception -> 0x0097 }
            if (r0 != 0) goto L_0x0079
            r4 = 0
        L_0x0079:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0097 }
            r1.add(r0)     // Catch:{ Exception -> 0x0097 }
            return r2
        L_0x0081:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = "the calling package "
            r1.append(r0)     // Catch:{ Exception -> 0x0097 }
            r1.append(r2)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = " does not own the queried authority: "
            X.C18260x0.A0t(r0, r3, r1)     // Catch:{ Exception -> 0x0097 }
        L_0x0093:
            return r6
        L_0x0094:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0097 }
            throw r0     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            java.lang.String r0 = "Exception when querying whitelist packs"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18320x8.A0m();
    }
}
