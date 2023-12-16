package X;

/* renamed from: X.5Ys  reason: invalid class name and case insensitive filesystem */
public class C106375Ys {
    public static C179268is A02;
    public final AnonymousClass5Q5 A00;
    public final C160177nA A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C106375Ys(android.content.Context r5, android.content.res.Resources r6, X.C160177nA r7, java.util.Locale r8) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r1 = r8.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r8.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.7nm r0 = X.AnonymousClass77Y.A00     // Catch:{ IllegalArgumentException -> 0x001f }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x001f }
            if (r0 == 0) goto L_0x001f
            r2 = r0
        L_0x001f:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0027
            r0 = 0
            goto L_0x003a
        L_0x0027:
            java.lang.String r2 = X.C162307rf.A05(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "strings_"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            r0 = 0
            X.5Q5 r0 = A00(r5, r6, r1, r8, r0)
        L_0x003a:
            r4.A00 = r0
            r4.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106375Ys.<init>(android.content.Context, android.content.res.Resources, X.7nA, java.util.Locale):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0169, code lost:
        if (r0 == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f9, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0203, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r2 = r6.toString();
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0213, code lost:
        if (r8.A2P("decompression_failure_reported_timestamp", 86400000) != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0215, code lost:
        r4 = new X.C94494rR();
        r4.A01 = r14;
        r4.A02 = r2;
        r4.A00 = java.lang.Double.valueOf((double) r7.A01.A03());
        r7.A02.BhD(r4);
        r8.A1Y("decompression_failure_reported_timestamp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0233, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Error decompressing archive ");
        X.C18260x0.A14(r14, r1, r6);
        r0 = X.AnonymousClass002.A0C(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0248, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0249, code lost:
        r3 = null;
        r16 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1 A[Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f9 A[ExcHandler: IOException | IndexOutOfBoundsException (e java.lang.Throwable), Splitter:B:25:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0248 A[ExcHandler: IOException | IndexOutOfBoundsException (e java.lang.Throwable), Splitter:B:1:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5Q5 A00(android.content.Context r19, android.content.res.Resources r20, java.lang.String r21, java.util.Locale r22, boolean r23) {
        /*
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r21)
            java.lang.String r7 = ".pack"
            java.lang.String r5 = X.AnonymousClass000.A0X(r7, r0)
            r11 = 0
            r15 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1T(r23)
            r13 = r19
            java.io.File r4 = r13.getFilesDir()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 == 0) goto L_0x0099
            X.3Db r0 = X.C389229y.A01(r13)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.3Db r0 = r0.AcK     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.5bk r0 = r0.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.4C1 r0 = r0.ACI     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.Object r7 = r0.get()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.5W9 r7 = (X.AnonymousClass5W9) r7     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r21)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = ".spo"
            java.lang.String r14 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.File r2 = r13.getFilesDir()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = "decompressed"
            java.io.File r0 = X.AnonymousClass002.A0A(r2, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r14)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.File r2 = X.AnonymousClass002.A0A(r0, r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            boolean r0 = r2.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 == 0) goto L_0x005c
            X.34Z r0 = r7.A03     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            boolean r0 = r0.A02(r13, r14)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 == 0) goto L_0x005c
        L_0x0053:
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r3.<init>(r2, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            goto L_0x00e5
        L_0x005c:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            X.34Z r12 = r7.A03     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r16 = r15
            r17 = r1
            boolean r0 = r12.A03(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            if (r0 == 0) goto L_0x008c
            long r5 = X.C18310x6.A0A(r3)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            boolean r4 = X.C615631i.A02()     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            X.1Yi r3 = new X.1Yi     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r3.<init>()     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r3.A02 = r14     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r3.A01 = r0     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            X.4FV r0 = r7.A02     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            r0.BhD(r3)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
        L_0x008c:
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "Decompression failed: File does not exist"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
            throw r0     // Catch:{ Exception -> 0x0203, IOException | IndexOutOfBoundsException -> 0x0248 }
        L_0x0099:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0l(r21)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = "_"
            r6.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = r13.getPackageCodePath()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            long r2 = r0.lastModified()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            long r2 = X.C18290x4.A0B(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r6.append(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.File r2 = X.C18270x1.A0A(r4, r7, r6)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            boolean r0 = r2.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "extracted_pack_file.pack.tmp"
            java.io.File r4 = X.AnonymousClass002.A0A(r4, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            android.content.res.AssetManager r0 = r20.getAssets()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.InputStream r0 = r0.open(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.C627536m.A0I(r0, r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r3.close()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            boolean r0 = r4.renameTo(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "Renaming temp file failed"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            goto L_0x0247
        L_0x00e5:
            java.nio.channels.FileChannel r16 = r3.getChannel()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01ff, all -> 0x01fb }
            java.nio.channels.FileChannel$MapMode r17 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            r18 = 0
            long r20 = r2.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.nio.MappedByteBuffer r8 = r16.map(r17, r18, r20)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r7 = r22.getLanguage()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = "he"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x01da
            java.lang.String r7 = "iw"
        L_0x0103:
            java.lang.String r0 = "fil"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r7 = "tl"
        L_0x010d:
            java.lang.String r6 = r22.getCountry()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r5 = X.C162307rf.A02(r22)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            r4 = 2
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r23 != 0) goto L_0x0132
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r9 = "en-US"
            X.7nm r0 = X.AnonymousClass77Y.A00     // Catch:{ IllegalArgumentException -> 0x018f, IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.Object r0 = r0.A01(r6)     // Catch:{ IllegalArgumentException -> 0x018f, IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x018f, IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x018f
            r9 = r0
            goto L_0x018f
        L_0x0132:
            java.lang.String r10 = "pt"
            boolean r0 = r10.equals(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x017d
            X.0nO r9 = X.AnonymousClass799.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = r22.getCountry()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            boolean r0 = r9.contains(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 != 0) goto L_0x0148
            java.lang.String r10 = "pt-BR"
        L_0x0148:
            r2.add(r10)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
        L_0x014b:
            int r0 = r6.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 != r4) goto L_0x01bb
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = "-"
            java.lang.String r4 = X.AnonymousClass000.A0V(r0, r6, r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            boolean r0 = r2.isEmpty()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 != 0) goto L_0x016b
            java.lang.String r0 = X.C86664Kz.A1M(r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 != 0) goto L_0x01bb
        L_0x016b:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = X.C162307rf.A02(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            boolean r0 = r5.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x01bb
            r2.add(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            goto L_0x01bb
        L_0x017d:
            java.lang.String r0 = "zh"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = "Hans"
            boolean r0 = r5.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x0193
            java.lang.String r9 = "zh-CN"
        L_0x018f:
            r2.add(r9)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            goto L_0x014b
        L_0x0193:
            java.lang.String r0 = "Hant"
            boolean r0 = r5.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x014b
            java.lang.String r9 = "zh-TW"
            goto L_0x018f
        L_0x019e:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = X.C162307rf.A02(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            boolean r0 = r5.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x014b
            r2.add(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            goto L_0x014b
        L_0x01b0:
            int r2 = r7.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            r0 = 3
            if (r2 != r0) goto L_0x010d
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
        L_0x01bb:
            boolean r0 = r2.isEmpty()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x01d4
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r5 = "translations/loadData error: locale '%s' not supported"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = r22.toLanguageTag()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            r4[r1] = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            java.lang.String r0 = java.lang.String.format(r6, r5, r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
        L_0x01d4:
            X.5Q5 r0 = new X.5Q5     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            r0.<init>(r8, r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            goto L_0x01f2
        L_0x01da:
            java.lang.String r0 = "yi"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r7 = "ji"
            goto L_0x0103
        L_0x01e6:
            java.lang.String r0 = "id"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01f9 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r7 = "in"
            goto L_0x0103
        L_0x01f2:
            X.C624535b.A03(r3)
            X.C624535b.A03(r16)
            return r0
        L_0x01f9:
            r2 = move-exception
            goto L_0x024c
        L_0x01fb:
            r0 = move-exception
            r16 = r11
            goto L_0x025d
        L_0x01ff:
            r2 = move-exception
            r16 = r11
            goto L_0x024c
        L_0x0203:
            r6 = move-exception
            java.lang.String r2 = r6.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.33p r8 = r7.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "decompression_failure_reported_timestamp"
            boolean r0 = r8.A2P(r5, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            if (r0 == 0) goto L_0x0233
            X.4rR r4 = new X.4rR     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r4.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r4.A01 = r14     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r4.A02 = r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.2zf r0 = r7.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            long r2 = r0.A03()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            double r0 = (double) r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r4.A00 = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.4FV r0 = r7.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r0.BhD(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            r8.A1Y(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
        L_0x0233:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = "Error decompressing archive "
            r1.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            X.C18260x0.A14(r14, r1, r6)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.lang.String r0 = r6.getMessage()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
        L_0x0247:
            throw r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0248, all -> 0x025f }
        L_0x0248:
            r2 = move-exception
            r3 = r11
            r16 = r11
        L_0x024c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x025c }
            java.lang.String r0 = "translations/loadData error:"
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x025c }
            X.C624535b.A03(r3)
            X.C624535b.A03(r16)
            return r11
        L_0x025c:
            r0 = move-exception
        L_0x025d:
            r11 = r3
            goto L_0x0262
        L_0x025f:
            r0 = move-exception
            r16 = r11
        L_0x0262:
            X.C624535b.A03(r11)
            X.C624535b.A03(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106375Ys.A00(android.content.Context, android.content.res.Resources, java.lang.String, java.util.Locale, boolean):X.5Q5");
    }

    public static void A01(C179268is r0) {
        A02 = r0;
    }
}
