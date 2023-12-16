package X;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.3Pk  reason: invalid class name and case insensitive filesystem */
public final class C67473Pk implements AnonymousClass4ES {
    public final C56492s4 A00;
    public final C57162tC A01;
    public final AnonymousClass33K A02;
    public final C51932kc A03;
    public final C55862r2 A04;
    public final C55782qu A05;
    public final C49192g8 A06;
    public final C67493Pm A07;
    public final C67503Pn A08;
    public final C55132pq A09;

    public InputStream B8P(AnonymousClass4GL r4, Integer num) {
        InputStream A0b = C18310x6.A0b(this.A00, r4, 0, 35);
        if ("gzip".equals(((AnonymousClass3PZ) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(A0b);
        }
        return A0b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0134, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.AnonymousClass2A8.A00(r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016e, code lost:
        if (r0 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        X.AnonymousClass2A8.A00(r22, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e8, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BF3(java.io.InputStream r28, java.lang.Integer r29, long r30) {
        /*
            r27 = this;
            java.lang.String r14 = ", error: "
            java.lang.String r13 = "mapping_file_parsing_failed"
            java.lang.String r12 = "sticker_mapping_file_download_finished"
            java.lang.String r11 = ", filters: "
            r10 = r27
            X.2kc r0 = r10.A03
            r26 = r0
            java.lang.String r9 = r26.A01()
            X.2g8 r0 = r10.A06
            r25 = r0
            java.lang.String r8 = r25.A01()
            X.3Pm r0 = r10.A07
            X.2kc r0 = r0.A00
            X.66R r0 = r0.A01
            r24 = r0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r24)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            X.C18270x1.A0j(r1, r0, r8)
            java.lang.String r2 = r25.A00()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r24)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C18270x1.A0j(r1, r0, r2)
            r23 = 0
            r7 = 0
            r3 = r30
            android.util.JsonReader r22 = X.C18300x5.A0D(r28)     // Catch:{ IOException -> 0x0212, IllegalStateException -> 0x01e9 }
            r22.beginObject()     // Catch:{ all -> 0x01e0 }
            r21 = 1
        L_0x0049:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x019d
            java.lang.String r2 = r22.nextName()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "revision"
            boolean r0 = X.C162457s7.A0P(r2, r0)     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = r22.nextString()     // Catch:{ all -> 0x01e0 }
            X.C18280x3.A12(r2)     // Catch:{ all -> 0x01e0 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r24)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ all -> 0x01e0 }
            r23 = 1
            goto L_0x0049
        L_0x0070:
            java.lang.String r0 = "languages"
            boolean r0 = X.C162457s7.A0P(r2, r0)     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x0175
            X.3Pn r0 = r10.A08     // Catch:{ all -> 0x01e0 }
            X.2Ll r7 = r0.A00     // Catch:{ all -> 0x01e0 }
            X.8qC r0 = r7.A01     // Catch:{ all -> 0x0142 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0142 }
            X.1RH r0 = (X.AnonymousClass1RH) r0     // Catch:{ all -> 0x0142 }
            X.4Fq r6 = r0.A0C()     // Catch:{ all -> 0x0142 }
            X.3Yo r20 = r6.Axl()     // Catch:{ all -> 0x013b }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0132 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0132 }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x0132 }
            r1 = 0
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearAll/DELETE_AVATAR_STICKER_SEARCH_TAG"
            java.lang.String r2 = "avatar_sticker_search_dictionary"
            int r15 = r5.A07(r2, r1, r0, r1)     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearall/count="
            X.C18260x0.A0w(r0, r1, r15)     // Catch:{ all -> 0x0132 }
            r22.beginObject()     // Catch:{ all -> 0x0132 }
        L_0x00a9:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0125
            r22.nextName()     // Catch:{ all -> 0x0132 }
            r22.beginObject()     // Catch:{ all -> 0x0132 }
        L_0x00b5:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0121
            java.lang.String r19 = r22.nextName()     // Catch:{ all -> 0x0132 }
            r22.beginObject()     // Catch:{ all -> 0x0132 }
            java.util.LinkedHashSet r0 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x0132 }
            r22.nextName()     // Catch:{ all -> 0x0132 }
            r22.beginArray()     // Catch:{ all -> 0x0132 }
        L_0x00cc:
            boolean r1 = r22.hasNext()     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = r22.nextString()     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = X.C107575bX.A07(r1)     // Catch:{ all -> 0x0132 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x0132 }
            r0.add(r1)     // Catch:{ all -> 0x0132 }
            goto L_0x00cc
        L_0x00e1:
            r22.endArray()     // Catch:{ all -> 0x0132 }
            r22.nextName()     // Catch:{ all -> 0x0132 }
            int r18 = r22.nextInt()     // Catch:{ all -> 0x0132 }
            r22.endObject()     // Catch:{ all -> 0x0132 }
            X.C162457s7.A0H(r19)     // Catch:{ all -> 0x0132 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x0132 }
        L_0x00f5:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r16 = X.AnonymousClass001.A0m(r17)     // Catch:{ all -> 0x0132 }
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = "sticker_id"
            r0 = r19
            r1.put(r15, r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = "tag"
            r0 = r16
            r1.put(r15, r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = "weight"
            r0 = r18
            X.C18270x1.A0b(r1, r15, r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "insertAvatarStickerTags/REPLACE_AVATAR_STICKER_SEARCH_TAG"
            r5.A0A(r2, r0, r1)     // Catch:{ all -> 0x0132 }
            goto L_0x00f5
        L_0x0121:
            r22.endObject()     // Catch:{ all -> 0x0132 }
            goto L_0x00a9
        L_0x0125:
            r22.endObject()     // Catch:{ all -> 0x0132 }
            r20.A00()     // Catch:{ all -> 0x0132 }
            r20.close()     // Catch:{ all -> 0x013b }
            r6.close()     // Catch:{ all -> 0x0142 }
            goto L_0x0169
        L_0x0132:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            r0 = r20
            X.AnonymousClass2A8.A00(r0, r2)     // Catch:{ all -> 0x013b }
            throw r1     // Catch:{ all -> 0x013b }
        L_0x013b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0142 }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            java.lang.Throwable r5 = X.AnonymousClass3Z0.A00(r0)     // Catch:{ all -> 0x01e0 }
            if (r5 == 0) goto L_0x0167
            X.8qC r0 = r7.A00     // Catch:{ all -> 0x01e0 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x01e0 }
            X.2r2 r6 = (X.C55862r2) r6     // Catch:{ all -> 0x01e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "error: "
            java.lang.String r2 = X.AnonymousClass000.A0a(r0, r1, r5)     // Catch:{ all -> 0x01e0 }
            r1 = 3
            java.lang.String r0 = "write_sticker_tags_to_database_failed"
            r6.A02(r1, r0, r2)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryStore/populatedb/failed"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x01e0 }
        L_0x0167:
            r0 = 0
            goto L_0x016a
        L_0x0169:
            r0 = 1
        L_0x016a:
            if (r21 == 0) goto L_0x0170
            r21 = 1
            if (r0 != 0) goto L_0x0172
        L_0x0170:
            r21 = 0
        L_0x0172:
            r7 = 1
            goto L_0x0049
        L_0x0175:
            X.2r2 r6 = r10.A04     // Catch:{ all -> 0x01e0 }
            java.lang.String r5 = "mapping_file_unexpected_field"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "found unexpected field: '"
            r1.append(r0)     // Catch:{ all -> 0x01e0 }
            r1.append(r2)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "' (rev: "
            X.C18260x0.A0p(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01e0 }
            java.lang.String r1 = X.AnonymousClass000.A0c(r1)     // Catch:{ all -> 0x01e0 }
            r0 = 3
            r6.A02(r0, r5, r1)     // Catch:{ all -> 0x01e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/unhandled field: "
            X.C18260x0.A0r(r0, r2, r1)     // Catch:{ all -> 0x01e0 }
            goto L_0x0049
        L_0x019d:
            r22.endObject()     // Catch:{ all -> 0x01e0 }
            java.lang.String r5 = "mapping_file_missing_field"
            if (r23 != 0) goto L_0x01b7
            X.2r2 r2 = r10.A04     // Catch:{ all -> 0x01e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "mapping file is missing 'revision' field (rev: "
            X.C18260x0.A0p(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01e0 }
            java.lang.String r1 = X.AnonymousClass000.A0c(r1)     // Catch:{ all -> 0x01e0 }
            r0 = 3
            r2.A02(r0, r5, r1)     // Catch:{ all -> 0x01e0 }
        L_0x01b7:
            if (r7 != 0) goto L_0x01cc
            X.2r2 r2 = r10.A04     // Catch:{ all -> 0x01e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "mapping file is missing 'languages' field (rev: "
            X.C18260x0.A0p(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01e0 }
            java.lang.String r1 = X.AnonymousClass000.A0c(r1)     // Catch:{ all -> 0x01e0 }
            r0 = 3
            r2.A02(r0, r5, r1)     // Catch:{ all -> 0x01e0 }
        L_0x01cc:
            r22.close()     // Catch:{ IOException -> 0x0212, IllegalStateException -> 0x01e9 }
            if (r29 == 0) goto L_0x01df
            int r2 = r29.intValue()
            X.2qu r1 = r10.A05
            X.1lr r0 = X.C30101lr.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x01df:
            return r21
        L_0x01e0:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r1 = move-exception
            r0 = r22
            X.AnonymousClass2A8.A00(r0, r2)     // Catch:{ IOException -> 0x0212, IllegalStateException -> 0x01e9 }
            throw r1     // Catch:{ IOException -> 0x0212, IllegalStateException -> 0x01e9 }
        L_0x01e9:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/parsing failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x024d }
            java.lang.String r6 = r26.A01()     // Catch:{ all -> 0x024d }
            java.lang.String r5 = r25.A01()     // Catch:{ all -> 0x024d }
            X.2r2 r2 = r10.A04     // Catch:{ all -> 0x024d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024d }
            java.lang.String r0 = "illegal state exception while parsing (rev: "
            X.C18260x0.A0p(r0, r6, r11, r5, r1)     // Catch:{ all -> 0x024d }
            r1.append(r14)     // Catch:{ all -> 0x024d }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x024d }
            java.lang.String r1 = X.C18260x0.A07(r0, r1)     // Catch:{ all -> 0x024d }
            r0 = 3
            r2.A02(r0, r13, r1)     // Catch:{ all -> 0x024d }
            goto L_0x023b
        L_0x0212:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x024d }
            java.lang.String r6 = r26.A01()     // Catch:{ all -> 0x024d }
            java.lang.String r5 = r25.A01()     // Catch:{ all -> 0x024d }
            X.2r2 r2 = r10.A04     // Catch:{ all -> 0x024d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024d }
            java.lang.String r0 = "unable to parse mapping file (rev: "
            X.C18260x0.A0p(r0, r6, r11, r5, r1)     // Catch:{ all -> 0x024d }
            r1.append(r14)     // Catch:{ all -> 0x024d }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x024d }
            java.lang.String r1 = X.C18260x0.A07(r0, r1)     // Catch:{ all -> 0x024d }
            r0 = 3
            r2.A02(r0, r13, r1)     // Catch:{ all -> 0x024d }
        L_0x023b:
            if (r29 == 0) goto L_0x024b
            int r2 = r29.intValue()
            X.2qu r1 = r10.A05
            X.1lr r0 = X.C30101lr.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x024b:
            r0 = 0
            return r0
        L_0x024d:
            r5 = move-exception
            if (r29 == 0) goto L_0x025e
            int r2 = r29.intValue()
            X.2qu r1 = r10.A05
            X.1lr r0 = X.C30101lr.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x025e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67473Pk.BF3(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public C67473Pk(C56492s4 r1, C57162tC r2, AnonymousClass33K r3, C51932kc r4, C55862r2 r5, C55782qu r6, C49192g8 r7, C67493Pm r8, C67503Pn r9, C55132pq r10) {
        C18260x0.A0f(r1, r5, r3, r10, r6);
        C18260x0.A0W(r4, r2, r9);
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
    }

    public AnonymousClass4GL AzU(String str, String str2) {
        String str3;
        C18260x0.A0s("AvatarStickerSearchDictionaryNetworkClient/connect/language=", str2, AnonymousClass001.A0o());
        C49192g8 r4 = this.A06;
        String A012 = r4.A02.A01();
        String A013 = r4.A01();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarStickerSearchDictionaryNetworkEndpoint/getEndpoint/revision=");
        A0o.append(A012);
        C18260x0.A0s(", filters=", A013, A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("https://static.whatsapp.net/wa/static/avatar?cat=avatar_sticker_search");
        A0o2.append("&lgs=");
        A0o2.append(str2);
        if (A012 != null) {
            A0o2.append("&rev=");
            A0o2.append(A012);
        }
        A0o2.append("&filter=");
        A0o2.append(A013);
        if (r4.A01.A0Y(C58422vE.A02, 4501)) {
            if (r4.A00().length() > 0) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("&country=");
                str3 = AnonymousClass000.A0X(r4.A00(), A0o3);
                C162457s7.A0D(str3);
            } else {
                str3 = "";
            }
            A0o2.append(str3);
        }
        return this.A02.A01(this.A09, C18290x4.A0o(A0o2), str);
    }
}
