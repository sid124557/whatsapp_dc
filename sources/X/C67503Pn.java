package X;

/* renamed from: X.3Pn  reason: invalid class name and case insensitive filesystem */
public final class C67503Pn implements AnonymousClass4F7 {
    public final C41752Ll A00;
    public final C183538qC A01;

    public C67503Pn(C41752Ll r2, C183538qC r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection B3C(java.lang.String r8, int r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r2 = 0
            X.C162457s7.A0J(r8, r2)
            java.util.LinkedHashSet r6 = X.AnonymousClass0x9.A17()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)
            r0 = 37
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r0)
            r3[r2] = r0
            r0 = 1
            X.C18280x3.A1Q(r3, r9, r0)
            java.lang.String r2 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag LIKE ? ORDER BY weight DESC LIMIT ?"
            X.8qC r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0063 }
            X.4GK r5 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0063 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005c }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_AVATAR_SEARCH_TAG"
            android.database.Cursor r3 = r1.A0E(r2, r0, r3)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0055 }
        L_0x003a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = X.C18320x8.A0c(r3, r2)     // Catch:{ all -> 0x0055 }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            r4.add(r1)     // Catch:{ all -> 0x0055 }
            goto L_0x003a
        L_0x004e:
            r3.close()     // Catch:{ all -> 0x005c }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0063 }
            goto L_0x0067
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0063 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0067:
            java.util.ArrayList r3 = X.C73783g4.A0c(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.2jB r0 = new X.2jB
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x006f
        L_0x0082:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67503Pn.B3C(java.lang.String, int, boolean, boolean):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ayq() {
        /*
            r5 = this;
            X.8qC r0 = r5.A01
            X.4Fq r4 = X.C18630y0.A08(r0)
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0024 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0024 }
            X.C162457s7.A0D(r3)     // Catch:{ all -> 0x0024 }
            r2 = 0
            java.lang.String r1 = "AvatarStickerSearchDictionaryTable/clearAll/CLEAR_ALL"
            java.lang.String r0 = "avatar_sticker_search_dictionary"
            int r2 = r3.A07(r0, r2, r1, r2)     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearall/count="
            X.C18260x0.A0w(r0, r1, r2)     // Catch:{ all -> 0x0024 }
            r4.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67503Pn.Ayq():void");
    }

    public void BmT(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r4 = this;
            X.8qC r0 = r4.A01
            X.4GK r3 = X.C18630y0.A04(r0)
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x002f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "SELECT EXISTS(SELECT 1 FROM avatar_sticker_search_dictionary) AS has_records"
            java.lang.String r0 = "GET_COUNT_AVATAR_STICKER_SEARCH_TAGS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x002f }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "has_records"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r2.close()     // Catch:{ all -> 0x002f }
            r3.close()
            return r0
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67503Pn.getCount():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection B3D(java.lang.String[] r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.util.LinkedHashSet r6 = X.AnonymousClass0x9.A17()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.3ct r7 = X.C71923ct.A00(r9)
        L_0x000c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.String[] r3 = X.C71923ct.A01(r7)
            int r0 = r3.length
            java.lang.String r2 = X.C57212tH.A00(r0)
            X.C162457s7.A0D(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag IN "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ORDER BY weight DESC"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.8qC r0 = r8.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0071 }
            X.4GK r5 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0071 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_MULTIPLE_AVATAR_SEARCH_TAGS"
            android.database.Cursor r3 = r1.A0E(r2, r0, r3)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
        L_0x0048:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = X.C18320x8.A0c(r3, r2)     // Catch:{ all -> 0x0063 }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0048
            r4.add(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0048
        L_0x005c:
            r3.close()     // Catch:{ all -> 0x006a }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0071 }
            goto L_0x000c
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0071 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0075:
            java.util.ArrayList r3 = X.C73783g4.A0c(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x007d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.2jB r0 = new X.2jB
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x007d
        L_0x0090:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67503Pn.B3D(java.lang.String[], int, boolean, boolean):java.util.Collection");
    }
}
