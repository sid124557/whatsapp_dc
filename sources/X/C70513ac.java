package X;

/* renamed from: X.3ac  reason: invalid class name and case insensitive filesystem */
public class C70513ac implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C70513ac(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.2qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.2r9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v102, resolved type: X.2qW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: X.2qW} */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x049b, code lost:
        if (r4.A0Y() != false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0723, code lost:
        r8 = !r13.A0I(r9, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0980, code lost:
        if (r5.A1I != 0) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0bda, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0bdd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0c7a, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0c7d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x104c, code lost:
        if (r0 != null) goto L_0x104f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x104f, code lost:
        r3.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x1052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x107a, code lost:
        r0.BkM(new X.C70513ac(r2, r3, r4, r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x1082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x1123, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x1124, code lost:
        com.whatsapp.util.Log.e("voicenote/startvoicenote/startfailed", r1);
        X.C69263Wi.A07(r3, r4, r5, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x112f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        if (r0 != null) goto L_0x104f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x061c A[Catch:{ all -> 0x13a8, all -> 0x13af, all -> 0x13b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0660 A[Catch:{ all -> 0x13a8, all -> 0x13af, all -> 0x13b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0b75 A[SYNTHETIC, Splitter:B:489:0x0b75] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0b7a  */
    /* JADX WARNING: Removed duplicated region for block: B:719:0x1243 A[Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x1264 A[Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:724:0x1272 A[Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:835:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r0 = r35
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x1357;
                case 1: goto L_0x0eef;
                case 2: goto L_0x0e93;
                case 3: goto L_0x1341;
                case 4: goto L_0x12b7;
                case 5: goto L_0x0c0b;
                case 6: goto L_0x11c5;
                case 7: goto L_0x0bde;
                case 8: goto L_0x11b1;
                case 9: goto L_0x0ba3;
                case 10: goto L_0x0b7f;
                case 11: goto L_0x1178;
                case 12: goto L_0x1146;
                case 13: goto L_0x0421;
                case 14: goto L_0x0397;
                case 15: goto L_0x036d;
                case 16: goto L_0x020c;
                case 17: goto L_0x01b7;
                case 18: goto L_0x008c;
                case 19: goto L_0x005f;
                case 20: goto L_0x015e;
                case 21: goto L_0x10d2;
                case 22: goto L_0x109f;
                case 23: goto L_0x1083;
                case 24: goto L_0x106c;
                case 25: goto L_0x1053;
                case 26: goto L_0x0ff8;
                case 27: goto L_0x0f40;
                case 28: goto L_0x0f27;
                case 29: goto L_0x0f17;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A00
            X.2hP r1 = (X.C49972hP) r1
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r0.A02
            X.1mW r4 = (X.C30481mW) r4
            java.lang.Object r3 = r0.A03
            X.6bL r3 = (X.C130076bL) r3
            X.8qC r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.2a9 r2 = (X.C45522a9) r2
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            boolean r1 = r5 instanceof android.app.Application
            r0 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "Application context was passed in for burning"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x002e:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "XFamilyTextStatusBurningManager/text status burning failed for message: "
            java.lang.String r1 = X.C624134x.A0C(r4, r2, r0)
            r0 = 0
            X.C106245Ye.A02(r1, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C624134x.A0C(r4, r2, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            r3.A06(r0)
        L_0x004b:
            return
        L_0x004c:
            X.3LZ r1 = r2.A01
            X.4QG r0 = X.C100715Bz.A00(r5, r0, r4)
            java.io.File r0 = r1.A00(r4, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x104f
            goto L_0x002e
        L_0x005f:
            java.lang.Object r4 = r0.A00
            X.5ZT r4 = (X.AnonymousClass5ZT) r4
            java.lang.Object r3 = r0.A02
            X.3Wi r3 = (X.C69263Wi) r3
            java.lang.Object r5 = r0.A03
            X.5TQ r6 = r4.A0L
            if (r6 == 0) goto L_0x0087
            java.lang.String r0 = "voicenote/startvoicenote/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A1Q
            int r0 = r1.get()
            if (r0 == 0) goto L_0x10e9
            android.media.SoundPool r2 = X.AnonymousClass5ZT.A1b
            int r1 = r1.get()
            r0 = 0
            r2.setVolume(r1, r0, r0)
            goto L_0x10e9
        L_0x0087:
            java.lang.String r0 = "voicenote/startvoicenote/skip"
            goto L_0x0c7a
        L_0x008c:
            java.lang.Object r10 = r0.A00
            X.5ZT r10 = (X.AnonymousClass5ZT) r10
            java.lang.Object r9 = r0.A01
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r8 = r0.A02
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r7 = r0.A03
            java.lang.String r0 = "VoiceNoteRecordingUI/prepareVoiceRecorderForResume/start"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qd r6 = r10.A11
            com.whatsapp.audioRecording.AudioRecordFactory r13 = r10.A0i
            com.whatsapp.audioRecording.OpusRecorderFactory r12 = r10.A0j
            X.5qb r11 = r10.A1D
            X.3Dh r1 = r6.A00
            java.lang.String r0 = X.C107655bf.A0U()
            java.io.File r14 = X.C64393Dh.A00(r1, r0)
            long r2 = X.C107655bf.A0G(r9)
            X.2sH r5 = r6.A07
            X.1VX r1 = r6.A0A
            X.3Wi r15 = r6.A01
            X.2Yz r0 = r6.A0D
            X.2s6 r4 = r6.A05
            java.lang.String r21 = r14.getAbsolutePath()
            X.5TQ r14 = new X.5TQ
            r16 = r13
            r17 = r12
            r18 = r5
            r19 = r1
            r20 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r1 = r9.getName()
            if (r1 == 0) goto L_0x0111
            X.2H3 r5 = r0.A00
            java.lang.String r0 = "@"
            java.lang.String[] r1 = r1.split(r0)
            r0 = 0
            r1 = r1[r0]
            X.1RC r0 = r5.A00
            X.4GK r12 = r0.get()
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x113c }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x113c }
            java.lang.String r5 = "SELECT chat_jid, page_number FROM draft_voice_note_metadata WHERE chat_jid=?"
            java.lang.String[] r1 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x113c }
            java.lang.String r0 = "DraftVoiceNoteMetadataDataStore/get"
            android.database.Cursor r5 = r11.A0E(r5, r0, r1)     // Catch:{ all -> 0x113c }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x1130 }
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "page_number"
            long r0 = X.AnonymousClass0x2.A0C(r5, r0)     // Catch:{ all -> 0x1130 }
            r5.close()     // Catch:{ all -> 0x113c }
            goto L_0x0114
        L_0x010b:
            r5.close()     // Catch:{ all -> 0x113c }
            r12.close()
        L_0x0111:
            r0 = 0
            goto L_0x0117
        L_0x0114:
            r12.close()
        L_0x0117:
            r12 = 2
            r5 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x0153
            r14.A01 = r0
            com.whatsapp.util.OpusRecorder r11 = r14.A06
            r11.setInitialVariablesForResume(r0, r2)
            java.io.File r3 = r14.A08
            boolean r0 = X.C627536m.A0M(r4, r9, r3)
            if (r0 == 0) goto L_0x0153
            if (r8 == 0) goto L_0x0144
            java.io.File r2 = r14.A09
            boolean r0 = X.C627536m.A0M(r4, r8, r2)
            if (r0 == 0) goto L_0x0144
            r1 = 1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0140 }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x0140 }
            r14.A0D = r0     // Catch:{ FileNotFoundException -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0144:
            r11.prepare()     // Catch:{ Exception -> 0x0148 }
            goto L_0x014f
        L_0x0148:
            r2 = 0
            r0 = 0
            r6.A01(r14, r0, r2)
            goto L_0x0153
        L_0x014f:
            r5 = r14
            r10.A0H(r3)
        L_0x0153:
            X.3Wi r2 = r10.A0g
            r0 = 30
            X.3aN r1 = new X.3aN
            r1.<init>(r10, r5, r7, r0)
            goto L_0x0bda
        L_0x015e:
            java.lang.Object r1 = r0.A00
            X.2hX r1 = (X.C50042hX) r1
            java.lang.Object r4 = r0.A01
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.A03
            android.graphics.drawable.Drawable r0 = r1.A00()
            if (r4 == 0) goto L_0x018c
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            java.lang.String r1 = r1.A02
            java.lang.String r0 = "CLOSE"
            boolean r1 = X.C162457s7.A0P(r1, r0)
            r0 = 2131886563(0x7f1201e3, float:1.9407708E38)
            if (r1 == 0) goto L_0x0185
            r0 = 2131895753(0x7f1225c9, float:1.9426348E38)
        L_0x0185:
            java.lang.CharSequence r0 = r2.getText(r0)
            r4.setNavigationContentDescription((java.lang.CharSequence) r0)
        L_0x018c:
            android.content.res.Resources r3 = r2.getResources()
            if (r3 == 0) goto L_0x01b4
            if (r4 == 0) goto L_0x004b
            android.content.Context r2 = r4.getContext()
            r1 = 2130971052(0x7f0409ac, float:1.7550831E38)
            r0 = 2131102714(0x7f060bfa, float:1.7817874E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            int r0 = r3.getColor(r0)
            r4.setBackgroundColor(r0)
        L_0x01a9:
            r1 = 15
            X.5eZ r0 = new X.5eZ
            r0.<init>(r5, r1)
            r4.setNavigationOnClickListener(r0)
            return
        L_0x01b4:
            if (r4 == 0) goto L_0x004b
            goto L_0x01a9
        L_0x01b7:
            java.lang.Object r1 = r0.A03
            X.5Gz r1 = (X.C101975Gz) r1
            X.5ZT r6 = r1.A00
            X.5ZQ r1 = r6.A0K
            if (r1 == 0) goto L_0x004b
            int r5 = r1.A02()
            X.5ZQ r1 = r6.A0K
            int r2 = r1.A03()
            X.5ZQ r1 = r6.A0K
            boolean r4 = r1.A0F()
            java.lang.Object r3 = r0.A00
            X.4Be r3 = (X.C84144Be) r3
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.AyM(r1)
            if (r4 == 0) goto L_0x01f1
            java.lang.Object r3 = r0.A02
            android.os.Handler r3 = (android.os.Handler) r3
            r1 = 16
            r3.postDelayed(r0, r1)
        L_0x01e5:
            java.lang.Object r1 = r0.A01
            X.4Be r1 = (X.C84144Be) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.AyM(r0)
            return
        L_0x01f1:
            if (r5 != r2) goto L_0x01e5
            X.5ZQ r1 = r6.A0K
            r1.A09()
            X.5ZQ r1 = r6.A0K
            if (r1 == 0) goto L_0x0206
            r1.A05()     // Catch:{ IOException | IllegalStateException -> 0x0200 }
            goto L_0x0206
        L_0x0200:
            r2 = move-exception
            java.lang.String r1 = "VoiceNoteDraftSeekRunnable/ error preparing audio player for voice note preview "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0206:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.AyM(r1)
            goto L_0x01e5
        L_0x020c:
            java.lang.Object r10 = r0.A00
            X.34Z r10 = (X.AnonymousClass34Z) r10
            java.lang.Object r9 = r0.A01
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r4 = r0.A02
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r8 = r0.A03
            java.util.AbstractCollection r8 = (java.util.AbstractCollection) r8
            java.util.Iterator r1 = r8.iterator()
        L_0x0220:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0236
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            java.io.File r0 = X.AnonymousClass002.A0A(r4, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            goto L_0x0220
        L_0x0236:
            java.lang.String r6 = ".superpack_version"
            java.io.File r3 = X.AnonymousClass002.A0A(r4, r6)
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ IOException -> 0x0253 }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x0249 }
            X.AnonymousClass0x2.A1L(r0, r2)     // Catch:{ all -> 0x0249 }
            r2.close()     // Catch:{ IOException -> 0x0253 }
            goto L_0x0259
        L_0x0249:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x024e }
            goto L_0x0252
        L_0x024e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0253 }
        L_0x0252:
            throw r1     // Catch:{ IOException -> 0x0253 }
        L_0x0253:
            r1 = move-exception
            java.lang.String r0 = "Could not write decompressed asset metadata"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0259:
            java.lang.String r0 = r3.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            java.io.File[] r5 = r4.listFiles()
            int r4 = r5.length
            r7 = 0
            r3 = 0
        L_0x0267:
            if (r3 >= r4) goto L_0x0281
            r2 = r5[r3]
            java.lang.String r1 = r2.getName()
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x027e
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x027e
            r2.delete()
        L_0x027e:
            int r3 = r3 + 1
            goto L_0x0267
        L_0x0281:
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A07
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r7)
            if (r0 == 0) goto L_0x004b
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.io.File r1 = r9.getFilesDir()
            java.lang.String r0 = "decompressed"
            java.io.File r6 = X.AnonymousClass002.A0A(r1, r0)
            java.io.File[] r5 = r6.listFiles()
            int r4 = r5.length
            r11 = 0
        L_0x029e:
            if (r7 >= r4) goto L_0x02c9
            r2 = r5[r7]
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x02b8
            java.lang.String r1 = r2.getName()
            boolean r0 = r10.A02(r9, r1)
            if (r0 != 0) goto L_0x02b5
            r3.add(r1)
        L_0x02b5:
            int r7 = r7 + 1
            goto L_0x029e
        L_0x02b8:
            r2.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown file in decompressed assets directory: "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            goto L_0x02b5
        L_0x02c9:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x004b
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.lang.Integer[] r8 = X.AnonymousClass34Z.A08
            int r7 = r8.length
        L_0x02d6:
            if (r11 >= r7) goto L_0x0312
            r0 = r8[r11]
            int r5 = r0.intValue()
            java.util.Iterator r12 = r3.iterator()
        L_0x02e2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x030f
            java.lang.String r2 = X.AnonymousClass001.A0m(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "assets/compressed/"
            r1.append(r0)
            if (r5 == 0) goto L_0x030a
            r0 = 1
            if (r5 != r0) goto L_0x1374
            java.lang.String r0 = "strings"
        L_0x02fd:
            r1.append(r0)
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            r4.put(r0, r2)
            goto L_0x02e2
        L_0x030a:
            java.lang.String r0 = X.AnonymousClass34Z.A00(r10)
            goto L_0x02fd
        L_0x030f:
            int r11 = r11 + 1
            goto L_0x02d6
        L_0x0312:
            java.lang.String r0 = r9.getPackageCodePath()     // Catch:{ IOException -> 0x0347 }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0347 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0347 }
            java.util.Enumeration r1 = r2.entries()     // Catch:{ all -> 0x033d }
        L_0x031f:
            boolean r0 = r1.hasMoreElements()     // Catch:{ all -> 0x033d }
            if (r0 == 0) goto L_0x0339
            java.lang.Object r0 = r1.nextElement()     // Catch:{ all -> 0x033d }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x033d }
            java.lang.String r0 = X.C18320x8.A0e(r0, r4)     // Catch:{ all -> 0x033d }
            if (r0 == 0) goto L_0x031f
            r3.remove(r0)     // Catch:{ all -> 0x033d }
            goto L_0x031f
        L_0x0339:
            r2.close()     // Catch:{ IOException -> 0x0347 }
            goto L_0x0347
        L_0x033d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0342 }
            goto L_0x0346
        L_0x0342:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0347 }
        L_0x0346:
            throw r1     // Catch:{ IOException -> 0x0347 }
        L_0x0347:
            java.util.Iterator r5 = r3.iterator()
        L_0x034b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = X.AnonymousClass001.A0m(r5)
            java.io.File r4 = X.AnonymousClass002.A0A(r6, r0)
            java.io.File[] r3 = r4.listFiles()
            int r2 = r3.length
            r1 = 0
        L_0x035f:
            if (r1 >= r2) goto L_0x0369
            r0 = r3[r1]
            r0.delete()
            int r1 = r1 + 1
            goto L_0x035f
        L_0x0369:
            r4.delete()
            goto L_0x034b
        L_0x036d:
            java.lang.Object r2 = r0.A01
            X.8qC r2 = (X.C183538qC) r2
            java.lang.Object r1 = r0.A02
            X.2sr r1 = (X.C56972sr) r1
            java.lang.Object r3 = r0.A03
            X.4AF r3 = (X.AnonymousClass4AF) r3
            java.lang.Object r0 = r2.get()
            X.3FZ r0 = (X.AnonymousClass3FZ) r0
            r0.BQW()
            com.whatsapp.Me r0 = X.C56972sr.A00(r1)
            if (r0 == 0) goto L_0x004b
            java.lang.String r2 = X.AnonymousClass0x9.A0w(r0)
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r1 = 6833(0x1ab1, float:9.575E-42)
            r0 = 2
            r3.Blk(r2, r1, r0)
            return
        L_0x0397:
            java.util.concurrent.atomic.AtomicInteger r1 = X.C60282yI.A09
            int r5 = r1.getAndIncrement()
            r3 = 0
        L_0x039e:
            java.lang.Object r2 = r0.A00
            java.util.concurrent.ArrayBlockingQueue r2 = (java.util.concurrent.ArrayBlockingQueue) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0413
            int r9 = r3 + 1
            r1 = 15
            if (r3 >= r1) goto L_0x0413
            java.lang.Object r3 = r2.poll()
            X.2Oz r3 = (X.C42652Oz) r3
            if (r3 == 0) goto L_0x004b
            java.lang.Object r1 = r0.A03
            X.8qC r1 = (X.C183538qC) r1
            java.lang.Object r7 = r1.get()
            X.8vZ r7 = (X.C186568vZ) r7
            r6 = 916783105(0x36a50001, float:4.9173836E-6)
            r7.markerStart(r6, r5)
            X.4Ec r8 = r3.A01
            java.lang.String r2 = r8.B9C()
            java.lang.String r1 = "listener"
            r7.markerAnnotate((int) r6, (int) r5, (java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "event_type"
            int r4 = r3.A00
            r7.markerAnnotate((int) r6, (int) r5, (java.lang.String) r1, (int) r4)
            X.30Y r3 = r3.A02
            int r2 = r3.A00
            java.lang.String r1 = "marker_id"
            r7.markerAnnotate((int) r6, (int) r5, (java.lang.String) r1, (int) r2)
            r1 = 1
            if (r4 == r1) goto L_0x03e8
            r8.BRu(r3)     // Catch:{ Exception -> 0x03f0 }
            goto L_0x03eb
        L_0x03e8:
            r8.Bc8(r3)     // Catch:{ Exception -> 0x03f0 }
        L_0x03eb:
            r1 = 2
            r7.markerEnd(r6, r5, r1)     // Catch:{ Exception -> 0x03f0 }
            goto L_0x0400
        L_0x03f0:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x1383 }
            if (r2 == 0) goto L_0x03fc
            java.lang.String r1 = "fail_reason"
            r7.markerAnnotate((int) r6, (int) r5, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x1383 }
        L_0x03fc:
            r1 = 3
            r7.markerEnd(r6, r5, r1)     // Catch:{ all -> 0x1383 }
        L_0x0400:
            int r2 = r3.A01
            java.lang.Object r1 = r0.A01
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Object r1 = X.C18290x4.A0j(r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            if (r1 == 0) goto L_0x0411
            r1.decrementAndGet()
        L_0x0411:
            r3 = r9
            goto L_0x039e
        L_0x0413:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x004b
            java.lang.Object r0 = r0.A02
            X.4FX r0 = (X.AnonymousClass4FX) r0
            r0.BrL()
            return
        L_0x0421:
            java.lang.Object r2 = r0.A00
            X.3Qn r2 = (X.C67753Qn) r2
            java.lang.Object r6 = r0.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r1 = r0.A02
            X.4FY r1 = (X.AnonymousClass4FY) r1
            java.lang.Object r0 = r0.A03
            r16 = r0
            r3 = 1
            if (r6 != 0) goto L_0x043b
            r17 = 0
        L_0x0436:
            r21 = 0
            if (r6 == 0) goto L_0x04ad
            goto L_0x0448
        L_0x043b:
            X.30x r4 = r2.A0P     // Catch:{ all -> 0x13b4 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x13b4 }
            X.2ov r0 = X.AnonymousClass36G.A03(r0)     // Catch:{ all -> 0x13b4 }
            X.3fe r17 = X.C614730x.A00(r0, r4)     // Catch:{ all -> 0x13b4 }
            goto L_0x0436
        L_0x0448:
            X.318 r4 = r2.A0d     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x13a8 }
            java.util.Set r0 = r4.A0D(r0)     // Catch:{ all -> 0x13a8 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x04ad
            X.2sr r4 = r2.A05     // Catch:{ all -> 0x13a8 }
            boolean r0 = r4.A0b(r6)     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x049d
            boolean r0 = r4.A0Y()     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x0497
            X.1iB r0 = r2.A0b     // Catch:{ all -> 0x13a8 }
            boolean r0 = r0.A0M(r6)     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x0497
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/unknown self device, jid="
            X.C18260x0.A1S(r4, r0, r6)     // Catch:{ all -> 0x13a8 }
            X.4FS r4 = r2.A1D     // Catch:{ all -> 0x13a8 }
            r0 = 27
            X.C70133a0.A01(r4, r2, r6, r0)     // Catch:{ all -> 0x13a8 }
            r4 = 7
            boolean r0 = r1.BqQ()     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x048a
            X.33Y r0 = r2.A0v     // Catch:{ all -> 0x13a8 }
            r0.A07(r1)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x048a:
            r1.Bmv(r4)     // Catch:{ all -> 0x13a8 }
            X.2dP r4 = r2.A0o     // Catch:{ all -> 0x13a8 }
            X.3ST r1 = (X.AnonymousClass3ST) r1     // Catch:{ all -> 0x13a8 }
            r0 = 0
            r4.A00(r0, r1)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x0497:
            boolean r0 = r4.A0Y()     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x04ad
        L_0x049d:
            boolean r0 = X.AnonymousClass0x9.A1P(r6)     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x04ad
            X.2a1 r0 = r1.B8J()     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x0b57
            int r0 = r0.A00     // Catch:{ all -> 0x13a8 }
            if (r0 != r3) goto L_0x0b57
        L_0x04ad:
            X.33Z r5 = r2.A0c     // Catch:{ all -> 0x13a8 }
            byte[] r4 = r1.B70()     // Catch:{ all -> 0x13a8 }
            X.2a1 r0 = r1.B8J()     // Catch:{ all -> 0x13a8 }
            boolean r0 = r5.A0B(r6, r0, r4, r3)     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x0b11
            X.2iU r0 = r2.A16     // Catch:{ all -> 0x13a8 }
            X.2r5 r7 = r0.A0Y     // Catch:{ all -> 0x13a8 }
            long r4 = r1.B9D()     // Catch:{ all -> 0x13a8 }
            r6 = r21
            X.2rb r4 = r7.A01(r6, r4)     // Catch:{ all -> 0x13a8 }
            X.1gS r4 = (X.AnonymousClass1gS) r4     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x04d3
            r5 = 3
            r4.A03(r5)     // Catch:{ all -> 0x13a8 }
        L_0x04d3:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "DecryptMessageRunnable/run axolotl received a message; message.key="
            X.AnonymousClass0x2.A17(r1, r5, r6)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "; message.retryCount="
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            int r5 = r1.BCI()     // Catch:{ all -> 0x13a8 }
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r11 = "; message.remote_resource="
            r6.append(r11)     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            X.C18260x0.A0o(r5, r6)     // Catch:{ all -> 0x13a8 }
            byte[] r7 = r1.BC0()     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x0573
            byte r6 = r7[r21]     // Catch:{ all -> 0x13a8 }
            r5 = r21
            int r10 = X.C18290x4.A07(r7, r6, r5)     // Catch:{ all -> 0x13a8 }
            X.33n r12 = r0.A0C     // Catch:{ all -> 0x13a8 }
            X.2qF r5 = r12.A07     // Catch:{ all -> 0x13a8 }
            int r9 = r5.A01()     // Catch:{ all -> 0x13a8 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "DecryptMessageRunnable/sendPreKeysIfNecessary received a registration id with message; message.key="
            X.AnonymousClass0x2.A17(r1, r5, r6)     // Catch:{ all -> 0x13a8 }
            r6.append(r11)     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r8 = "; serverRegistrationId="
            r6.append(r8)     // Catch:{ all -> 0x13a8 }
            r6.append(r10)     // Catch:{ all -> 0x13a8 }
            java.lang.String r7 = "; localRegistrationId="
            X.C18260x0.A0y(r7, r6, r9)     // Catch:{ all -> 0x13a8 }
            if (r10 == r9) goto L_0x0573
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "DecryptMessageRunnable/sendPreKeysIfNecessary registration id received with message did not match local; message.key="
            X.AnonymousClass0x2.A17(r1, r5, r6)     // Catch:{ all -> 0x13a8 }
            r6.append(r11)     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            r6.append(r8)     // Catch:{ all -> 0x13a8 }
            r6.append(r10)     // Catch:{ all -> 0x13a8 }
            X.C18260x0.A0y(r7, r6, r9)     // Catch:{ all -> 0x13a8 }
            X.1i9 r6 = r0.A05     // Catch:{ all -> 0x13a8 }
            monitor-enter(r6)     // Catch:{ all -> 0x13a8 }
            boolean r5 = r6.A02     // Catch:{ all -> 0x1396 }
            monitor-exit(r6)     // Catch:{ all -> 0x13a8 }
            if (r5 != 0) goto L_0x0557
            r12.A0K()     // Catch:{ all -> 0x13a8 }
            r6.A0C()     // Catch:{ all -> 0x13a8 }
            goto L_0x0573
        L_0x0557:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "DecryptMessageRunnable/sendPreKeysIfNecessary pre keys already sent on this connection; not sending at this time; message.key="
            X.AnonymousClass0x2.A17(r1, r5, r6)     // Catch:{ all -> 0x13a8 }
            r6.append(r11)     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            r6.append(r8)     // Catch:{ all -> 0x13a8 }
            r6.append(r10)     // Catch:{ all -> 0x13a8 }
            X.C18260x0.A0y(r7, r6, r9)     // Catch:{ all -> 0x13a8 }
        L_0x0573:
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r5 = X.C627336j.A0K(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0771
            X.3Lq r10 = r0.A0P     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            X.1fJ r9 = X.AnonymousClass34R.A01(r5)     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r12 = X.AnonymousClass32Y.A03(r5)     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.Jid r5 = r1.BCm()     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = X.C106405Yw.A03(r5)     // Catch:{ all -> 0x13a8 }
            boolean r5 = X.C155477ey.A00(r5)     // Catch:{ all -> 0x13a8 }
            r8 = 0
            if (r5 == 0) goto L_0x05b3
            X.2sj r5 = r10.A0b     // Catch:{ all -> 0x13a8 }
            X.33k r6 = X.C56892sj.A01(r5, r9)     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.Jid r5 = r1.BCm()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r5)     // Catch:{ all -> 0x13a8 }
            boolean r5 = r6.A0Q(r5)     // Catch:{ all -> 0x13a8 }
            r6 = r5 ^ 1
            goto L_0x05b4
        L_0x05b3:
            r6 = 0
        L_0x05b4:
            if (r9 == 0) goto L_0x0771
            if (r12 == 0) goto L_0x0771
            int r5 = r1.B7F()     // Catch:{ all -> 0x13a8 }
            r13 = 7
            if (r5 == r13) goto L_0x0771
            if (r6 != 0) goto L_0x0771
            boolean r5 = r1 instanceof X.AnonymousClass3ST     // Catch:{ all -> 0x13a8 }
            java.lang.String r15 = "pn"
            if (r5 == 0) goto L_0x05ea
            r5 = r1
            X.3ST r5 = (X.AnonymousClass3ST) r5     // Catch:{ all -> 0x13a8 }
            java.lang.String r6 = r5.A1A     // Catch:{ all -> 0x13a8 }
        L_0x05cd:
            X.2Kz r7 = r10.A0m     // Catch:{ all -> 0x13a8 }
            X.4uZ r14 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r5 = r14 instanceof X.C28011fL     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x05e8
            X.1fL r14 = (X.C28011fL) r14     // Catch:{ all -> 0x13a8 }
        L_0x05d9:
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r5)     // Catch:{ all -> 0x13a8 }
            boolean r5 = X.C627336j.A0L(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0610
            goto L_0x05ec
        L_0x05e8:
            r14 = 0
            goto L_0x05d9
        L_0x05ea:
            r6 = r15
            goto L_0x05cd
        L_0x05ec:
            if (r14 == 0) goto L_0x0610
            X.2pW r5 = r7.A01     // Catch:{ all -> 0x13a8 }
            X.3Ex r11 = r5.A02     // Catch:{ all -> 0x13a8 }
            X.3ZH r5 = r11.A09(r14)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0603
            java.lang.String r7 = "lid"
            java.lang.String r5 = r5.A0M     // Catch:{ all -> 0x13a8 }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0603
            goto L_0x0610
        L_0x0603:
            X.3ZH r5 = r11.A09(r14)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x060e
            boolean r5 = r5.A0k     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x060e
            goto L_0x0610
        L_0x060e:
            r5 = 1
            goto L_0x0611
        L_0x0610:
            r5 = 0
        L_0x0611:
            r7 = 0
            if (r5 == 0) goto L_0x0660
            java.lang.String r5 = "lid"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x13a8 }
            if (r5 != 0) goto L_0x0660
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "decryptmessagerunnable/Dropping incoming message since it's from a lid participant in a non-incognito CAG; message.key="
            r4.append(r0)     // Catch:{ all -> 0x13a8 }
            X.2z0 r0 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            X.C18270x1.A17(r0, r4)     // Catch:{ all -> 0x13a8 }
            X.1VX r5 = r10.A0j     // Catch:{ all -> 0x13a8 }
            r4 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x13a8 }
            boolean r0 = r5.A0Y(r0, r4)     // Catch:{ all -> 0x13a8 }
            X.33Y r4 = r10.A10     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x065a
            r0 = 551(0x227, float:7.72E-43)
            r4.A08(r1, r0)     // Catch:{ all -> 0x13a8 }
        L_0x063f:
            X.4uZ r0 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            X.1fJ r6 = X.AnonymousClass34R.A03(r0)     // Catch:{ all -> 0x13a8 }
            X.C626936e.A06(r6)     // Catch:{ all -> 0x13a8 }
            X.3Lr r5 = r10.A0t     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "subgroup_conflict_recovery"
            r0 = 3
            r5.A0E(r6, r4, r0)     // Catch:{ all -> 0x13a8 }
            X.36E r0 = r10.A07     // Catch:{ all -> 0x13a8 }
            r0.A0Q(r1, r7, r13)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x065a:
            java.lang.String r0 = "lid-in-non-incognito-cag"
            r4.A09(r1, r0, r7)     // Catch:{ all -> 0x13a8 }
            goto L_0x063f
        L_0x0660:
            int r11 = r1.B7F()     // Catch:{ all -> 0x13a8 }
            r5 = 8
            boolean r23 = X.AnonymousClass000.A1U(r11, r5)
            X.2sj r13 = r10.A0b     // Catch:{ all -> 0x13a8 }
            boolean r5 = r13.A0C(r9)     // Catch:{ all -> 0x13a8 }
            r22 = r5 ^ 1
            if (r22 == 0) goto L_0x068f
            if (r23 != 0) goto L_0x0771
            X.3Ex r5 = r10.A0F     // Catch:{ all -> 0x13a8 }
            X.3ZH r5 = r5.A0A(r9)     // Catch:{ all -> 0x13a8 }
            boolean r5 = r5.A0j     // Catch:{ all -> 0x13a8 }
            if (r5 != 0) goto L_0x068f
            boolean r11 = r15.equals(r6)     // Catch:{ all -> 0x13a8 }
            X.2sr r5 = r10.A06     // Catch:{ all -> 0x13a8 }
            if (r11 == 0) goto L_0x06a0
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A05(r5)     // Catch:{ all -> 0x13a8 }
        L_0x068c:
            r10.A0V(r9, r5)     // Catch:{ all -> 0x13a8 }
        L_0x068f:
            X.33h r5 = r13.A09     // Catch:{ all -> 0x13a8 }
            r25 = r5
            X.33k r11 = r5.A07(r9)     // Catch:{ all -> 0x13a8 }
            X.2zG r5 = r11.A05(r12)     // Catch:{ all -> 0x13a8 }
            boolean r5 = X.AnonymousClass000.A1W(r5)
            goto L_0x06a5
        L_0x06a0:
            X.1fH r5 = r5.A0H()     // Catch:{ all -> 0x13a8 }
            goto L_0x068c
        L_0x06a5:
            r14 = 1
            if (r5 != 0) goto L_0x06b6
            X.2sM r5 = r13.A0B     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r5 = r5.A03(r12)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x06e8
            X.2zG r5 = r11.A05(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x06e8
        L_0x06b6:
            r20 = r14 ^ 1
            X.2pW r15 = r10.A0r     // Catch:{ all -> 0x13a8 }
            X.C162457s7.A0J(r6, r3)     // Catch:{ all -> 0x13a8 }
            boolean r19 = r15.A01(r9, r6)     // Catch:{ all -> 0x13a8 }
            if (r20 == 0) goto L_0x0721
            r24 = r12
            X.2sM r5 = r15.A04     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r18 = r5.A03(r12)     // Catch:{ all -> 0x13a8 }
            if (r18 != 0) goto L_0x06e1
            X.2qk r5 = r15.A00     // Catch:{ all -> 0x13a8 }
            r14 = r5
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "Cannot retrieve counterpart from "
            r6 = r5
            java.lang.String r6 = X.AnonymousClass000.A0P(r12, r6, r11)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "GroupLidInfra/incoming_group_message_sanitation"
            r11 = r5
            r14.A0A(r11, r8, r6)     // Catch:{ all -> 0x13a8 }
        L_0x06e1:
            int r6 = r15.A00(r9)     // Catch:{ all -> 0x13a8 }
            if (r6 == 0) goto L_0x06f2
            goto L_0x06ea
        L_0x06e8:
            r14 = 0
            goto L_0x06b6
        L_0x06ea:
            r5 = 3
            if (r6 != r5) goto L_0x071c
            boolean r5 = X.C627336j.A0L(r12)     // Catch:{ all -> 0x13a8 }
            goto L_0x06f6
        L_0x06f2:
            boolean r5 = X.C627336j.A0M(r12)     // Catch:{ all -> 0x13a8 }
        L_0x06f6:
            if (r5 != 0) goto L_0x071c
            r24 = r18
            if (r18 != 0) goto L_0x071c
            X.2qk r5 = r10.A04     // Catch:{ all -> 0x13a8 }
            r15 = r5
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "participant "
            r11.append(r5)     // Catch:{ all -> 0x13a8 }
            r11.append(r12)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = " missing mapping, addressing mode mismatch = "
            r6 = r5
            r5 = r19
            java.lang.String r5 = X.AnonymousClass000.A0b(r6, r11, r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r14 = "GroupLidInfra/incoming_group_message_unknown"
            r6 = r5
            r15.A0A(r14, r8, r6)     // Catch:{ all -> 0x13a8 }
            goto L_0x0721
        L_0x071c:
            r5 = r24
            r10.A0V(r9, r5)     // Catch:{ all -> 0x13a8 }
        L_0x0721:
            if (r23 == 0) goto L_0x0740
            boolean r5 = r13.A0I(r9, r12)     // Catch:{ all -> 0x13a8 }
            r8 = r5 ^ 1
            if (r8 == 0) goto L_0x0740
            r5 = r25
            X.33k r5 = r5.A07(r9)     // Catch:{ all -> 0x13a8 }
            X.2zG r5 = r5.A05(r12)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0740
            r5.A01 = r3     // Catch:{ all -> 0x13a8 }
            java.util.List r5 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x13a8 }
            r10.A0O(r9, r7, r5)     // Catch:{ all -> 0x13a8 }
        L_0x0740:
            if (r22 != 0) goto L_0x0748
            if (r20 != 0) goto L_0x0748
            if (r8 != 0) goto L_0x0748
            if (r19 == 0) goto L_0x0771
        L_0x0748:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "groupmgr/onIncomingGroupMessage: getting group info; meNotInGroup="
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            r5 = r22
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = ", participantNotInGroup="
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            r5 = r20
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = ", promoteParticipantAsAdmin="
            X.C18260x0.A1D(r5, r6, r8)     // Catch:{ all -> 0x13a8 }
            X.3Lr r8 = r10.A0t     // Catch:{ all -> 0x13a8 }
            if (r19 == 0) goto L_0x07ac
            X.21x r5 = X.C373521x.LID_MIGRATION     // Catch:{ all -> 0x13a8 }
            java.lang.String r6 = r5.contextString     // Catch:{ all -> 0x13a8 }
            r5 = 6
            r8.A0E(r9, r6, r5)     // Catch:{ all -> 0x13a8 }
        L_0x0771:
            int r5 = r1.BCI()     // Catch:{ all -> 0x13a8 }
            if (r5 < r3) goto L_0x07b0
            r5 = 16
            boolean r5 = r1.BFN(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x07b0
            X.2qz r6 = r0.A0c     // Catch:{ all -> 0x13a8 }
            X.2z0 r5 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            X.34x r5 = r6.A05(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0791
            byte r6 = r5.A1I     // Catch:{ all -> 0x13a8 }
            r5 = 11
            if (r6 == r5) goto L_0x07b0
        L_0x0791:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "DecryptMessageRunnable/run Dropping bypassed retry message due to missing placeholder; message.key="
            r5.append(r4)     // Catch:{ all -> 0x13a8 }
            X.2z0 r4 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            X.C18270x1.A17(r4, r5)     // Catch:{ all -> 0x13a8 }
            X.33Y r5 = r0.A0W     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "bypassed-dropped"
            java.lang.String r0 = "404"
            r5.A09(r1, r4, r0)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x07ac:
            r8.A0E(r9, r7, r3)     // Catch:{ all -> 0x13a8 }
            goto L_0x0771
        L_0x07b0:
            X.1b7 r6 = new X.1b7     // Catch:{ all -> 0x13a8 }
            r6.<init>()     // Catch:{ all -> 0x13a8 }
            int r5 = r1.BCI()     // Catch:{ all -> 0x13a8 }
            java.lang.Long r5 = X.AnonymousClass0x9.A0m(r5)     // Catch:{ all -> 0x13a8 }
            r6.A0E = r5     // Catch:{ all -> 0x13a8 }
            boolean r5 = r1.BIE()     // Catch:{ all -> 0x13a8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x13a8 }
            r6.A02 = r5     // Catch:{ all -> 0x13a8 }
            int r5 = r1.B7F()     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r5 = X.AnonymousClass368.A04(r5)     // Catch:{ all -> 0x13a8 }
            r6.A0B = r5     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r5 = X.C627336j.A0K(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r8 = X.C18280x3.A0S()     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r9 = X.C18290x4.A0a()     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x07e8
            r5 = 1
            goto L_0x086c
        L_0x07e8:
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r5 = r5 instanceof X.C135166kE     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0860
            r6.A06 = r9     // Catch:{ all -> 0x13a8 }
        L_0x07f2:
            X.4uZ r7 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            X.2ss r5 = r0.A0E     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r5 = X.AnonymousClass36M.A07(r5, r7)     // Catch:{ all -> 0x13a8 }
            r6.A0C = r5     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.Jid r5 = r1.BCm()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r5)     // Catch:{ all -> 0x13a8 }
            X.2sr r10 = r0.A03     // Catch:{ all -> 0x13a8 }
            boolean r5 = r10.A0b(r7)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x084e
            r6.A08 = r9     // Catch:{ all -> 0x13a8 }
        L_0x0810:
            int r5 = r1.B7F()     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r5 = X.AnonymousClass36E.A02(r5)     // Catch:{ all -> 0x13a8 }
            r6.A09 = r5     // Catch:{ all -> 0x13a8 }
            boolean r8 = r1 instanceof X.AnonymousClass3ST     // Catch:{ all -> 0x13a8 }
            if (r8 == 0) goto L_0x0829
            X.36E r7 = r0.A04     // Catch:{ all -> 0x13a8 }
            r5 = r1
            X.3ST r5 = (X.AnonymousClass3ST) r5     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r5 = r7.A0A(r5)     // Catch:{ all -> 0x13a8 }
            r6.A03 = r5     // Catch:{ all -> 0x13a8 }
        L_0x0829:
            X.36E r7 = r0.A04     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            int r5 = r7.A08(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x083b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x13a8 }
            r6.A04 = r5     // Catch:{ all -> 0x13a8 }
        L_0x083b:
            com.whatsapp.jid.Jid r5 = r1.BCm()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r5)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x0b73
            X.2ov r28 = X.AnonymousClass36G.A02(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x13a8 }
            r6.A00 = r5     // Catch:{ all -> 0x13a8 }
            goto L_0x0873
        L_0x084e:
            if (r7 == 0) goto L_0x085d
            boolean r5 = X.AnonymousClass0x9.A1P(r7)     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x085d
            java.lang.Integer r5 = X.C18290x4.A0b()     // Catch:{ all -> 0x13a8 }
            r6.A08 = r5     // Catch:{ all -> 0x13a8 }
            goto L_0x0810
        L_0x085d:
            r6.A08 = r8     // Catch:{ all -> 0x13a8 }
            goto L_0x0810
        L_0x0860:
            X.4uZ r5 = r1.BAZ()     // Catch:{ all -> 0x13a8 }
            boolean r5 = r5 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x086b
            r6.A06 = r8     // Catch:{ all -> 0x13a8 }
            goto L_0x07f2
        L_0x086b:
            r5 = 0
        L_0x086c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x13a8 }
            r6.A06 = r5     // Catch:{ all -> 0x13a8 }
            goto L_0x07f2
        L_0x0873:
            if (r4 == 0) goto L_0x0877
            r4.A02 = r3     // Catch:{ all -> 0x13a8 }
        L_0x0877:
            X.1VX r11 = r0.A0N     // Catch:{ all -> 0x13a8 }
            X.4FS r9 = r0.A0d     // Catch:{ all -> 0x13a8 }
            X.33n r12 = r0.A0C     // Catch:{ all -> 0x13a8 }
            X.2Sz r5 = r0.A0T     // Catch:{ all -> 0x13a8 }
            X.2bf r22 = new X.2bf     // Catch:{ all -> 0x13a8 }
            r23 = r12
            r24 = r11
            r25 = r5
            r26 = r1
            r27 = r9
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x13a8 }
            X.2a1 r31 = r1.B8J()     // Catch:{ all -> 0x13a8 }
            boolean r13 = r0.A01(r1)     // Catch:{ all -> 0x13a8 }
            r14 = 0
            if (r13 != 0) goto L_0x08a0
            X.2a1 r13 = r1.BCn()     // Catch:{ all -> 0x13a8 }
            if (r13 == 0) goto L_0x08a0
            r14 = 1
        L_0x08a0:
            r32 = r14 ^ 1
            r29 = r6
            r30 = r4
            r27 = r22
            X.2ex r23 = r27.A00(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x13a8 }
            X.2a1 r13 = r1.BCn()     // Catch:{ all -> 0x13a8 }
            boolean r27 = X.AnonymousClass000.A1W(r13)
            r22 = r0
            r24 = r6
            r25 = r4
            int r13 = r22.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x13a8 }
            if (r13 != 0) goto L_0x08e7
            X.2bf r22 = new X.2bf     // Catch:{ all -> 0x13a8 }
            r23 = r12
            r24 = r11
            r25 = r5
            r27 = r9
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x13a8 }
            X.2a1 r26 = r1.BCn()     // Catch:{ all -> 0x13a8 }
            r23 = r28
            r24 = r6
            r25 = r4
            r27 = r3
            X.2ex r23 = r22.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x13a8 }
            r22 = r0
            r26 = r1
            r27 = r21
            int r13 = r22.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x13a8 }
        L_0x08e7:
            r5 = 2
            if (r13 == r5) goto L_0x0b73
            X.36Y r13 = r0.A0M     // Catch:{ all -> 0x13a8 }
            X.2hp r11 = r0.A0Z     // Catch:{ all -> 0x13a8 }
            X.2Yl r5 = r0.A0a     // Catch:{ all -> 0x13a8 }
            int r5 = X.AnonymousClass36E.A00(r13, r1, r11, r5)     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x13a8 }
            r6.A0A = r11     // Catch:{ all -> 0x13a8 }
            X.4uZ r5 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r5 = r7.A0T(r5, r11)     // Catch:{ all -> 0x13a8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x13a8 }
            r6.A01 = r5     // Catch:{ all -> 0x13a8 }
            java.lang.Boolean r5 = r6.A00     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x091c
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x13a8 }
            if (r5 == 0) goto L_0x091c
            if (r4 == 0) goto L_0x0916
            r4.A02 = r3     // Catch:{ all -> 0x13a8 }
        L_0x0916:
            X.4FV r4 = r0.A0O     // Catch:{ all -> 0x13a8 }
            r4.BhD(r6)     // Catch:{ all -> 0x13a8 }
            goto L_0x0921
        L_0x091c:
            X.4FV r4 = r0.A0O     // Catch:{ all -> 0x13a8 }
            X.C18280x3.A0t(r6, r4, r3)     // Catch:{ all -> 0x13a8 }
        L_0x0921:
            X.34x r5 = r1.B7X()     // Catch:{ all -> 0x13a8 }
            boolean r4 = r5 instanceof X.C30361mK     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0950
            X.1mK r5 = (X.C30361mK) r5     // Catch:{ all -> 0x13a8 }
            X.30w r4 = r5.A0y()     // Catch:{ all -> 0x13a8 }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x13a8 }
            boolean r4 = r4.A05()     // Catch:{ all -> 0x13a8 }
            if (r4 != 0) goto L_0x0950
            java.lang.String r4 = "DecryptMessageRunnable/downloadLocationThumbnail"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x13a8 }
            r5.A02 = r3     // Catch:{ all -> 0x13a8 }
            r4 = 2
            X.4HU r11 = new X.4HU     // Catch:{ all -> 0x13a8 }
            r11.<init>(r5, r4, r0)     // Catch:{ all -> 0x13a8 }
            android.os.Handler r5 = r0.A00     // Catch:{ all -> 0x13a8 }
            r4 = 24
            X.3a0 r4 = X.C70133a0.A00(r0, r11, r4)     // Catch:{ all -> 0x13a8 }
            r5.post(r4)     // Catch:{ all -> 0x13a8 }
        L_0x0950:
            X.2sj r5 = r0.A0I     // Catch:{ all -> 0x13a8 }
            X.2z0 r4 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            X.4uZ r4 = X.AnonymousClass2z0.A01(r4)     // Catch:{ all -> 0x13a8 }
            java.util.Set r11 = r5.A04(r4)     // Catch:{ all -> 0x13a8 }
            X.2qk r4 = r0.A02     // Catch:{ all -> 0x13a8 }
            int r5 = X.C627336j.A00(r4, r11)     // Catch:{ all -> 0x13a8 }
            int r4 = r11.size()     // Catch:{ all -> 0x13a8 }
            r7.A0P(r1, r5, r4)     // Catch:{ all -> 0x13a8 }
            X.2s4 r14 = r0.A06     // Catch:{ all -> 0x13a8 }
            X.34x r5 = r1.B7X()     // Catch:{ all -> 0x13a8 }
            X.4uZ r4 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r4 = r4 instanceof X.C135166kE     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x097b
            r13 = 3
            goto L_0x0983
        L_0x097b:
            if (r5 == 0) goto L_0x0982
            byte r4 = r5.A1I     // Catch:{ all -> 0x13a8 }
            r13 = 1
            if (r4 == 0) goto L_0x0983
        L_0x0982:
            r13 = 2
        L_0x0983:
            long r4 = r1.BDj()     // Catch:{ all -> 0x13a8 }
            boolean r11 = r1.BIK()     // Catch:{ all -> 0x13a8 }
            r14.A07(r4, r13, r11)     // Catch:{ all -> 0x13a8 }
            java.lang.Boolean r4 = r6.A00     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09ab
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x13a8 }
            if (r4 != 0) goto L_0x09ab
            java.lang.Integer r4 = r6.A07     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0a2b
            int r5 = r4.intValue()     // Catch:{ all -> 0x13a8 }
        L_0x09a0:
            int r4 = r1.B5W()     // Catch:{ all -> 0x13a8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x13a8 }
            r7.A0R(r1, r4, r5)     // Catch:{ all -> 0x13a8 }
        L_0x09ab:
            boolean r4 = r1.BqS()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09da
            X.4uZ r4 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            boolean r4 = r4 instanceof X.C135166kE     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09da
            r4 = 22
            X.C70133a0.A01(r9, r0, r1, r4)     // Catch:{ all -> 0x13a8 }
        L_0x09be:
            X.3Lo r5 = r0.A0F     // Catch:{ all -> 0x13a8 }
            X.4uZ r4 = r1.BC1()     // Catch:{ all -> 0x13a8 }
            X.3ZH r5 = r5.A01(r4)     // Catch:{ all -> 0x13a8 }
            boolean r4 = r5.A10     // Catch:{ all -> 0x13a8 }
            if (r4 != 0) goto L_0x09d3
            r5.A10 = r3     // Catch:{ all -> 0x13a8 }
            r4 = 23
            X.C70133a0.A01(r9, r0, r5, r4)     // Catch:{ all -> 0x13a8 }
        L_0x09d3:
            boolean r4 = r1.BIs()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0ae4
            goto L_0x0a2f
        L_0x09da:
            boolean r4 = r1.BqM()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09be
            X.1i2 r7 = r0.A09     // Catch:{ all -> 0x13a8 }
            X.4uZ r14 = r1.B5O()     // Catch:{ all -> 0x13a8 }
            X.C626936e.A06(r14)     // Catch:{ all -> 0x13a8 }
            X.2z0 r13 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r11 = r1.BCo()     // Catch:{ all -> 0x13a8 }
            int r6 = r1.B7F()     // Catch:{ all -> 0x13a8 }
            java.util.Iterator r5 = X.C61102zi.A03(r7)     // Catch:{ all -> 0x13a8 }
        L_0x09f9:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0a09
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x13a8 }
            X.4F5 r4 = (X.AnonymousClass4F5) r4     // Catch:{ all -> 0x13a8 }
            r4.BOl(r14, r11, r13, r6)     // Catch:{ all -> 0x13a8 }
            goto L_0x09f9
        L_0x0a09:
            boolean r4 = r1.BI6()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09be
            X.2z0 r4 = r1.B9a()     // Catch:{ all -> 0x13a8 }
            X.4uZ r6 = r4.A00     // Catch:{ all -> 0x13a8 }
            if (r6 == 0) goto L_0x09be
            java.util.Iterator r5 = X.C61102zi.A03(r7)     // Catch:{ all -> 0x13a8 }
        L_0x0a1b:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x13a8 }
            X.4F5 r4 = (X.AnonymousClass4F5) r4     // Catch:{ all -> 0x13a8 }
            r4.BW4(r6)     // Catch:{ all -> 0x13a8 }
            goto L_0x0a1b
        L_0x0a2b:
            r5 = 34
            goto L_0x09a0
        L_0x0a2f:
            if (r8 != 0) goto L_0x0a38
            java.lang.String r0 = "DecryptMessageRunnable/sendRetry: no appdata support"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x0a38:
            X.3ST r1 = (X.AnonymousClass3ST) r1     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "DecryptMessageRunnable/sendRetry"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x13a8 }
            int r4 = r1.BCI()     // Catch:{ all -> 0x13a8 }
            r6 = 0
            if (r4 <= 0) goto L_0x0a77
            byte[] r32 = r12.A0d()     // Catch:{ all -> 0x13a8 }
            X.2Ov r30 = r12.A0D()     // Catch:{ all -> 0x13a8 }
            X.2Ov r31 = r12.A0E()     // Catch:{ all -> 0x13a8 }
            boolean r4 = r10.A0Y()     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0a74
            X.2q4 r4 = r0.A0A     // Catch:{ all -> 0x13a8 }
            byte[] r33 = r4.A03()     // Catch:{ all -> 0x13a8 }
        L_0x0a5e:
            com.whatsapp.jid.Jid r4 = r1.A18     // Catch:{ all -> 0x13a8 }
            X.4uZ r4 = X.C627336j.A02(r4)     // Catch:{ all -> 0x13a8 }
            boolean r4 = r4 instanceof X.C135166kE     // Catch:{ all -> 0x13a8 }
            if (r4 == 0) goto L_0x0a9e
            int r5 = r1.A01     // Catch:{ all -> 0x13a8 }
            r4 = 7
            if (r5 != r4) goto L_0x0a9e
            java.lang.Integer r4 = r1.A0W     // Catch:{ all -> 0x13a8 }
            boolean r4 = X.AnonymousClass000.A1W(r4)     // Catch:{ all -> 0x13a8 }
            goto L_0x0a80
        L_0x0a74:
            r33 = r6
            goto L_0x0a5e
        L_0x0a77:
            r32 = r6
            r30 = r6
            r31 = r6
            r33 = r6
            goto L_0x0a5e
        L_0x0a80:
            if (r4 == 0) goto L_0x0a83
            goto L_0x0ae7
        L_0x0a83:
            X.33e r5 = r0.A0K     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.Jid r4 = r1.A0E     // Catch:{ all -> 0x13a8 }
            X.4uZ r4 = X.C627336j.A02(r4)     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r4)     // Catch:{ all -> 0x13a8 }
            X.34r r4 = r5.A05(r4)     // Catch:{ all -> 0x13a8 }
            if (r4 != 0) goto L_0x0a9e
            X.33Y r5 = r0.A0W     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "status-revoke-drop"
            r5.A09(r1, r4, r6)     // Catch:{ all -> 0x13a8 }
            goto L_0x0afd
        L_0x0a9e:
            X.2bg r9 = r0.A0V     // Catch:{ all -> 0x13a8 }
            X.2gy r8 = r0.A07     // Catch:{ all -> 0x13a8 }
            X.1i9 r7 = r0.A05     // Catch:{ all -> 0x13a8 }
            X.2m9 r6 = r0.A0D     // Catch:{ all -> 0x13a8 }
            X.2dP r4 = r0.A0S     // Catch:{ all -> 0x13a8 }
            X.2dH r5 = new X.2dH     // Catch:{ all -> 0x13a8 }
            r22 = r5
            r23 = r7
            r24 = r8
            r25 = r12
            r26 = r6
            r27 = r4
            r28 = r9
            r29 = r1
            r34 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x13a8 }
            int r4 = r1.A04     // Catch:{ all -> 0x13a8 }
            r1 = 1
            if (r4 == r3) goto L_0x0ae0
            r1 = 2
            if (r4 == r1) goto L_0x0ae0
            r1 = 3
            if (r4 == r1) goto L_0x0ae0
            r1 = 4
            if (r4 == r1) goto L_0x0ae0
            switch(r4) {
                case 8: goto L_0x0ad2;
                case 9: goto L_0x0ad5;
                case 10: goto L_0x0ad8;
                case 11: goto L_0x0ada;
                case 12: goto L_0x0adc;
                case 13: goto L_0x0ade;
                default: goto L_0x0ad0;
            }     // Catch:{ all -> 0x13a8 }
        L_0x0ad0:
            r1 = 0
            goto L_0x0ae0
        L_0x0ad2:
            r1 = 11
            goto L_0x0ae0
        L_0x0ad5:
            r1 = 10
            goto L_0x0ae0
        L_0x0ad8:
            r1 = 6
            goto L_0x0ae0
        L_0x0ada:
            r1 = 5
            goto L_0x0ae0
        L_0x0adc:
            r1 = 7
            goto L_0x0ae0
        L_0x0ade:
            r1 = 8
        L_0x0ae0:
            r5.A00(r1)     // Catch:{ all -> 0x13a8 }
            goto L_0x0afd
        L_0x0ae4:
            if (r8 == 0) goto L_0x0b73
            goto L_0x0afd
        L_0x0ae7:
            X.30G r8 = r0.A0H     // Catch:{ all -> 0x13a8 }
            X.2m9 r7 = r8.A04     // Catch:{ all -> 0x13a8 }
            r5 = 29
            X.3Zw r4 = new X.3Zw     // Catch:{ all -> 0x13a8 }
            r4.<init>(r8, r5, r1)     // Catch:{ all -> 0x13a8 }
            r7.A01(r4, r5)     // Catch:{ all -> 0x13a8 }
            X.33Y r5 = r0.A0W     // Catch:{ all -> 0x13a8 }
            java.lang.String r4 = "status-revoke-delay"
            r5.A09(r1, r4, r6)     // Catch:{ all -> 0x13a8 }
        L_0x0afd:
            X.5rC r1 = r0.A01     // Catch:{ all -> 0x13a8 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x13a8 }
            if (r0 == 0) goto L_0x0b73
            r1.A04()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "sendAutomatedMessagesIfNeeded"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x13a8 }
            goto L_0x1398
        L_0x0b11:
            X.2sr r0 = r2.A05     // Catch:{ all -> 0x13a8 }
            boolean r0 = r0.A0b(r6)     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x0b35
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/invalid adv sender="
            X.C18260x0.A1Q(r4, r0, r6)     // Catch:{ all -> 0x13a8 }
            X.3Cp r5 = r2.A0J     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r3]     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x13a8 }
            r4[r21] = r0     // Catch:{ all -> 0x13a8 }
            r0 = 3
            r5.A01(r4, r0)     // Catch:{ all -> 0x13a8 }
            r4 = 5
            r0 = 12
            r2.A06(r1, r4, r0)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x0b35:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/invalid self device identity, jid="
            X.C18260x0.A1Q(r4, r0, r6)     // Catch:{ all -> 0x13a8 }
            r4 = 6
            boolean r0 = r1.BqQ()     // Catch:{ all -> 0x13a8 }
            if (r0 != 0) goto L_0x0b4b
            X.33Y r0 = r2.A0v     // Catch:{ all -> 0x13a8 }
            r0.A07(r1)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x0b4b:
            r1.Bmv(r4)     // Catch:{ all -> 0x13a8 }
            X.2dP r4 = r2.A0o     // Catch:{ all -> 0x13a8 }
            X.3ST r1 = (X.AnonymousClass3ST) r1     // Catch:{ all -> 0x13a8 }
            r0 = 0
            r4.A00(r0, r1)     // Catch:{ all -> 0x13a8 }
            goto L_0x0b73
        L_0x0b57:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x13a8 }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/unknown device message without prekey, jid="
            X.C18260x0.A1Q(r4, r0, r6)     // Catch:{ all -> 0x13a8 }
            r4 = 8
            r0 = 11
            r2.A06(r1, r4, r0)     // Catch:{ all -> 0x13a8 }
            X.3Cp r4 = r2.A0J     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r3]     // Catch:{ all -> 0x13a8 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x13a8 }
            r1[r21] = r0     // Catch:{ all -> 0x13a8 }
            r0 = 3
            r4.A01(r1, r0)     // Catch:{ all -> 0x13a8 }
        L_0x0b73:
            if (r17 == 0) goto L_0x0b78
            r17.close()     // Catch:{ all -> 0x13b4 }
        L_0x0b78:
            if (r16 == 0) goto L_0x004b
            java.util.Set r1 = r2.A1E
            monitor-enter(r1)
            goto L_0x1399
        L_0x0b7f:
            java.lang.Object r1 = r0.A00
            X.2zi r1 = (X.C61102zi) r1
            java.lang.Object r4 = r0.A01
            X.21F r4 = (X.AnonymousClass21F) r4
            java.lang.Object r3 = r0.A02
            X.4uY r3 = (X.C95804uY) r3
            java.lang.Object r2 = r0.A03
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x0b93:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r1.next()
            X.4DE r0 = (X.AnonymousClass4DE) r0
            r0.BLy(r3, r4, r2)
            goto L_0x0b93
        L_0x0ba3:
            java.lang.Object r5 = r0.A00
            X.2U7 r5 = (X.AnonymousClass2U7) r5
            java.lang.Object r4 = r0.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r0.A02
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r0.A03
            X.4uZ r2 = (X.C95814uZ) r2
            X.3dV r0 = r5.A07
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x004b
            boolean r0 = X.C627336j.A0L(r4)
            if (r0 == 0) goto L_0x0bcb
            if (r3 == 0) goto L_0x0bcb
            X.2sM r1 = r5.A08
            r0 = r4
            X.1fH r0 = (X.C27981fH) r0
            r1.A09(r0, r3)
        L_0x0bcb:
            X.4BY r0 = r5.A0D
            X.4uZ r3 = r0.BLb(r2)
            X.3Wi r2 = r5.A01
            r0 = 11
            X.3aM r1 = new X.3aM
            r1.<init>(r5, r3, r4, r0)
        L_0x0bda:
            r2.A0S(r1)
            return
        L_0x0bde:
            java.lang.Object r4 = r0.A00
            X.5Y7 r4 = (X.AnonymousClass5Y7) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            X.6i2 r2 = (X.C133846i2) r2
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            X.4Wu r0 = r4.A08
            if (r0 != 0) goto L_0x004b
            X.4Wu r0 = new X.4Wu
            r0.<init>(r3, r2, r4)
            r4.A08 = r0
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0P
            r2.setAdapter(r0)
            r1.getContext()
            r1 = 0
            com.whatsapp.filter.SmoothScrollLinearLayoutManager r0 = new com.whatsapp.filter.SmoothScrollLinearLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            return
        L_0x0c0b:
            java.lang.Object r1 = r0.A00
            X.3dV r1 = (X.C72303dV) r1
            java.lang.Object r6 = r0.A01
            X.30D r6 = (X.AnonymousClass30D) r6
            java.lang.Object r8 = r0.A02
            X.2sp r8 = (X.C56952sp) r8
            java.lang.Object r7 = r0.A03
            X.2U0 r7 = (X.AnonymousClass2U0) r7
            boolean r0 = X.C72303dV.A00(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            X.4Cg[] r0 = new X.C84414Cg[r0]
            X.2Vr r9 = new X.2Vr
            r9.<init>(r0)
            r4 = 1
            java.lang.String r0 = "DatabaseMigrationManager/processAllRollbacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            X.8Nf r3 = X.C48602fA.A00(r6)
        L_0x0c37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c5b
            java.lang.Object r2 = r3.next()
            X.31D r2 = (X.AnonymousClass31D) r2
            boolean r0 = X.AnonymousClass30D.A01(r2)
            if (r0 == 0) goto L_0x0c37
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DatabaseMigrationManager/add migration to pending rollbacks: "
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            X.C18260x0.A1L(r1, r0)
            r5.add(r0)
            goto L_0x0c37
        L_0x0c5b:
            r6.A06(r9, r5, r4, r4)
            r1 = 425(0x1a9, float:5.96E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0c6b
            r6.A04(r4)
        L_0x0c6b:
            X.3dV r0 = r7.A06
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 != 0) goto L_0x0c7e
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, message store is not ready, skip async migrations."
        L_0x0c75:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AsyncMigrations/finalizeMigrationsAppAsyncInit, migrations shouldn't be run on async init."
        L_0x0c7a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0c7e:
            X.33p r9 = r7.A05
            X.8qC r13 = r9.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r13)
            java.lang.String r12 = "backup_restore_state"
            r8 = 0
            int r1 = r0.getInt(r12, r8)
            r0 = 512(0x200, float:7.175E-43)
            if (r1 == r0) goto L_0x0cd0
            long r2 = java.lang.System.currentTimeMillis()
            X.2rO r11 = r7.A07
            r0 = 0
            java.lang.String r10 = "async_init_migration_start_time"
            long r5 = r11.A00(r10, r0)
            long r0 = r2 - r5
            long r14 = java.lang.Math.abs(r0)
            r5 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0ccd
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, skip because of time from last run is equal to "
            r2.append(r0)
            long r0 = X.C18290x4.A0B(r14)
            r2.append(r0)
            java.lang.String r0 = " seconds, should be more then "
            r2.append(r0)
            r0 = 7200(0x1c20, double:3.5573E-320)
            r2.append(r0)
            java.lang.String r0 = " seconds."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            goto L_0x0c75
        L_0x0ccd:
            r11.A04(r10, r2)
        L_0x0cd0:
            X.2fA r3 = r7.A0A
            java.lang.String r1 = "call_log"
            X.31D r0 = r3.A02(r1)
            if (r0 == 0) goto L_0x0cf1
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x0cf1
            java.util.HashSet r5 = X.C18300x5.A0x(r1)
            X.30D r2 = r7.A08
            X.4Cg[] r0 = new X.C84414Cg[r8]
            X.2Vr r1 = new X.2Vr
            r1.<init>(r0)
            r0 = 7
            r2.A06(r1, r5, r0, r4)
        L_0x0cf1:
            X.3Mh r6 = r7.A02
            X.1Ei r0 = X.C66663Mh.A0E
            boolean r0 = r6.A08(r0)
            if (r0 != 0) goto L_0x0d2f
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, shouldMigrateMd is set to false."
        L_0x0cfd:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0d00:
            X.1RV r0 = r7.A09
            r0.A02(r8)
            X.1Ei r0 = X.C66663Mh.A0D
            boolean r2 = r6.A08(r0)
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r13)
            int r1 = r0.getInt(r12, r8)
            r0 = 512(0x200, float:7.175E-43)
            boolean r12 = X.AnonymousClass000.A1U(r1, r0)
            if (r2 != 0) goto L_0x0e18
            if (r12 != 0) goto L_0x0e18
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AsyncMigrations/runFtsMigration, skip. shouldMigrateFTSServerProp: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", shouldMigrateFTSServerProp: "
            X.C18260x0.A1D(r0, r1, r2)
            return
        L_0x0d2f:
            X.2sr r0 = r7.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            if (r0 != 0) goto L_0x0d3a
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, phone user Jid is null."
            goto L_0x0cfd
        L_0x0d3a:
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.lang.String r10 = "migration_jid_store"
            X.31D r1 = r3.A02(r10)
            if (r1 == 0) goto L_0x0d64
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0d64
            java.lang.String r0 = "AsyncMigrations/MDMigrations, jid-store-migration-pending."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r7.A00
            int r0 = r1.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "jid-store-migration-pending"
            r2.A0A(r0, r8, r1)
            r5.add(r10)
        L_0x0d64:
            java.lang.String r10 = "migration_chat_store"
            X.31D r1 = r3.A02(r10)
            if (r1 == 0) goto L_0x0d8a
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0d8a
            java.lang.String r0 = "AsyncMigrations/MDMigrations, chat-store-migration-pending."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r7.A00
            int r0 = r1.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "chat-store-migration-pending"
            r2.A0A(r0, r8, r1)
            r5.add(r10)
        L_0x0d8a:
            java.lang.String r10 = "blank_me_jid"
            X.31D r1 = r3.A02(r10)
            if (r1 == 0) goto L_0x0daf
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0daf
            java.lang.String r0 = "AsyncMigrations/MDMigrations, md-blank-me-jid-migration-pending."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r7.A00
            int r0 = r1.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-blank-me-jid-migration-pending"
            r2.A0A(r0, r8, r1)
            r5.add(r10)
        L_0x0daf:
            java.lang.String r10 = "participant_user"
            X.31D r1 = r3.A02(r10)
            if (r1 == 0) goto L_0x0dd5
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0dd5
            java.lang.String r0 = "AsyncMigrations/MDMigrations, md-participant-user-migration-pending."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r7.A00
            int r0 = r1.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-participant-user-migration-pending"
            r2.A0A(r0, r8, r1)
            r5.add(r10)
        L_0x0dd5:
            java.lang.String r10 = "broadcast_me_jid"
            X.31D r1 = r3.A02(r10)
            if (r1 == 0) goto L_0x0dfa
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0dfa
            java.lang.String r0 = "AsyncMigrations/MDMigrations, md-broadcast-me-jid-migration-pending."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r7.A00
            int r0 = r1.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-broadcast-me-jid-migration-pending"
            r2.A0A(r0, r8, r1)
            r5.add(r10)
        L_0x0dfa:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0e04
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, all migrations are marked as migrated."
            goto L_0x0cfd
        L_0x0e04:
            java.lang.String r0 = "AsyncMigrations/MDMigrations, proceed with migrations."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.30D r2 = r7.A08
            X.4Cg[] r0 = new X.C84414Cg[r8]
            X.2Vr r1 = new X.2Vr
            r1.<init>(r0)
            r0 = 7
            r2.A06(r1, r5, r0, r4)
            goto L_0x0d00
        L_0x0e18:
            X.1XK r6 = new X.1XK
            r6.<init>()
            java.lang.String r0 = "OnAsyncInitMigrationRunner/ftsMigration"
            X.33M r11 = X.AnonymousClass33M.A01(r0)
            java.lang.String r1 = "message_fts"
            X.31D r10 = r3.A02(r1)
            if (r10 == 0) goto L_0x0e55
            boolean r0 = r10.A0M()
            if (r0 != 0) goto L_0x0e55
            java.util.HashSet r5 = X.C18300x5.A0x(r1)
            X.4Cg[] r3 = new X.C84414Cg[r4]
            X.1il r2 = r7.A03
            X.2sH r1 = r7.A04
            X.3Ep r0 = new X.3Ep
            r0.<init>(r2, r1)
            r3[r8] = r0
            X.2Vr r2 = new X.2Vr
            r2.<init>(r3)
            X.30D r1 = r7.A08
            r0 = 7
            boolean r0 = r1.A06(r2, r5, r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
        L_0x0e55:
            if (r12 == 0) goto L_0x004b
            if (r10 == 0) goto L_0x004b
            X.1vA r5 = r7.A0C
            java.lang.String r4 = "fts_migration_elapsed_time_in_ms"
            r1 = 0
            java.lang.String r0 = r5.A02(r4)
            long r2 = X.C615531h.A04(r0, r1)
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x0e89
            r9.A11(r8)
            long r0 = r11.A07()
            long r0 = r0 + r2
            long r0 = X.C18290x4.A0B(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            X.4FV r0 = r7.A0B
            r0.BhD(r6)
            r0 = 0
        L_0x0e85:
            r5.A05(r4, r0)
            return
        L_0x0e89:
            long r0 = r11.A07()
            long r2 = r2 + r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L_0x0e85
        L_0x0e93:
            java.lang.Object r4 = r0.A00
            X.3Lq r4 = (X.C66493Lq) r4
            java.lang.Object r6 = r0.A01
            X.1fJ r6 = (X.C27991fJ) r6
            java.lang.Object r3 = r0.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.lang.Object r5 = r0.A03
            X.8OQ r5 = (X.AnonymousClass8OQ) r5
            X.2c1 r2 = r4.A0W
            X.2sH r0 = r4.A0M
            long r0 = X.C56612sH.A00(r0)
            java.util.List r0 = r2.A00(r6, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0eb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r2 = r6.next()
            X.1mN r2 = (X.C30391mN) r2
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0ee2
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0eb3
            java.lang.Object r0 = r5.get(r1)
            X.C626936e.A06(r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0eb3
        L_0x0ee2:
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.3Lv r0 = r4.A0U
            r0.A0Y(r2)
            goto L_0x0eb3
        L_0x0eef:
            java.lang.Object r1 = r0.A01
            X.8ug r1 = (X.C186058ug) r1
            java.lang.Object r4 = r0.A02
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r0 = r0.A03
            X.8qC r0 = (X.C183538qC) r0
            X.C162457s7.A0H(r4)
            if (r1 == 0) goto L_0x004b
            java.lang.Object r3 = r0.get()
            java.text.Format r3 = (java.text.Format) r3
            long r1 = r1.B6l()
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r0 = r3.format(r0)
            r4.setText(r0)
            return
        L_0x0f17:
            java.lang.Object r2 = r0.A00
            X.2r9 r2 = (X.C55932r9) r2
            java.lang.Object r3 = r0.A01
            java.lang.Object r4 = r0.A02
            java.lang.Object r5 = r0.A03
            X.4FS r0 = r2.A01
            r6 = 28
            goto L_0x107a
        L_0x0f27:
            java.lang.Object r4 = r0.A00
            X.2r9 r4 = (X.C55932r9) r4
            java.lang.Object r3 = r0.A01
            X.2lx r3 = (X.C52732lx) r3
            java.lang.Object r2 = r0.A02
            X.2no r2 = (X.C53872no) r2
            java.lang.Object r1 = r0.A03
            X.2oR r1 = (X.C54262oR) r1
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/CrosspostRunnable executed"
            X.C106245Ye.A00(r0)
            r4.A03(r1, r3, r2)
            return
        L_0x0f40:
            java.lang.Object r6 = r0.A00
            X.5Ke r6 = (X.C102765Ke) r6
            java.lang.Object r2 = r0.A01
            java.lang.Object r3 = r0.A02
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r1 = r0.A03
            X.2fU r1 = (X.C48792fU) r1
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.2Me r4 = r6.A05
            X.2aS r5 = new X.2aS
            r5.<init>(r3, r6, r1)
            r7 = 0
            r6 = 2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Native Auth initiated by "
            X.C18260x0.A1N(r1, r0, r2)
            X.2VJ r2 = r4.A01     // Catch:{ Exception -> 0x0ff3 }
            X.3eZ r1 = new X.3eZ     // Catch:{ Exception -> 0x0ff3 }
            r1.<init>()     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r0 = "wa_android_xfamily_native_auth"
            X.7X6 r2 = r2.A00(r0, r1, r7)     // Catch:{ Exception -> 0x0ff3 }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ Exception -> 0x0ff3 }
            X.8Ti r0 = new X.8Ti     // Catch:{ Exception -> 0x0ff3 }
            r0.<init>()     // Catch:{ Exception -> 0x0ff3 }
            java.util.List r1 = r2.A01(r1, r0, r7)     // Catch:{ Exception -> 0x0ff3 }
            X.C162457s7.A0D(r1)     // Catch:{ Exception -> 0x0ff3 }
            boolean r0 = X.C18310x6.A1X(r1)     // Catch:{ Exception -> 0x0ff3 }
            if (r0 == 0) goto L_0x0fe8
            java.lang.String r3 = "XFamilyFbAccessToken"
            X.3QD r2 = X.AnonymousClass3QD.A00()     // Catch:{ Exception -> 0x0ff3 }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ Exception -> 0x0ff3 }
            X.2fV r0 = (X.C48802fV) r0     // Catch:{ Exception -> 0x0ff3 }
            X.7nb r0 = r0.A01     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x0ff3 }
            X.7yt r0 = new X.7yt     // Catch:{ Exception -> 0x0ff3 }
            r0.<init>(r2, r1, r3)     // Catch:{ Exception -> 0x0ff3 }
            X.5dj r2 = new X.5dj     // Catch:{ Exception -> 0x0ff3 }
            r2.<init>(r0, r6)     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Finished fetching data from FB app"
            X.C106245Ye.A00(r0)     // Catch:{ Exception -> 0x0ff3 }
            X.5Vp r1 = r4.A00     // Catch:{ Exception -> 0x0ff3 }
            if (r1 == 0) goto L_0x0fe1
            X.5zJ r0 = new X.5zJ     // Catch:{ Exception -> 0x0ff3 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0ff3 }
            java.lang.Object r4 = X.C617031x.A00(r0)     // Catch:{ Exception -> 0x0ff3 }
            X.5dT r4 = (X.C108735dT) r4     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r0 = "NativeAuthFbAccountDataAccessor/initiateNativeAuth Finished fetching profile data from FB"
            X.C106245Ye.A00(r0)     // Catch:{ Exception -> 0x0ff3 }
            if (r4 != 0) goto L_0x0fc4
            java.lang.String r0 = "fbUserEntity is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x0ff3 }
            goto L_0x0fef
        L_0x0fc4:
            X.2fU r0 = r5.A02     // Catch:{ Exception -> 0x0ff3 }
            r0.A00()     // Catch:{ Exception -> 0x0ff3 }
            android.app.Activity r3 = r5.A00     // Catch:{ Exception -> 0x0ff3 }
            android.content.Intent r2 = X.C18320x8.A07()     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity"
            r2.setClassName(r1, r0)     // Catch:{ Exception -> 0x0ff3 }
            java.lang.String r0 = "fb_app_user_entity_as_parcel"
            r2.putExtra(r0, r4)     // Catch:{ Exception -> 0x0ff3 }
            r3.startActivity(r2)     // Catch:{ Exception -> 0x0ff3 }
            return
        L_0x0fe1:
            java.lang.String r0 = "fbProfileDataFetcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ Exception -> 0x0ff3 }
            throw r0     // Catch:{ Exception -> 0x0ff3 }
        L_0x0fe8:
            java.lang.String r0 = "sso list is empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x0ff3 }
        L_0x0fef:
            r5.A00(r0)     // Catch:{ Exception -> 0x0ff3 }
            return
        L_0x0ff3:
            r0 = move-exception
            r5.A00(r0)
            return
        L_0x0ff8:
            java.lang.Object r1 = r0.A00
            X.2hO r1 = (X.C49962hO) r1
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r0.A02
            X.1mW r4 = (X.C30481mW) r4
            java.lang.Object r3 = r0.A03
            X.6bL r3 = (X.C130076bL) r3
            X.8qC r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.2I8 r1 = (X.AnonymousClass2I8) r1
            boolean r0 = r5 instanceof android.app.Application
            r2 = 0
            if (r0 == 0) goto L_0x1038
            java.lang.String r1 = "Application context was passed in for burning"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x101b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "CrosspostTextStatusBurningManager/text status burning failed for message: "
            java.lang.String r0 = X.C624134x.A0C(r4, r1, r0)
            X.AnonymousClass356.A02(r0)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C624134x.A0C(r4, r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            r3.A06(r0)
            return
        L_0x1038:
            X.3LZ r1 = r1.A00
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.4QG r0 = X.C100715Bz.A00(r5, r2, r4)
            java.io.File r0 = r1.A00(r4, r0)
            if (r0 == 0) goto L_0x101b
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x104f
            goto L_0x101b
        L_0x104f:
            r3.A05(r0)
            return
        L_0x1053:
            java.lang.Object r4 = r0.A00
            X.2qW r4 = (X.C55542qW) r4
            java.lang.Object r3 = r0.A01
            X.2nJ r3 = (X.C53572nJ) r3
            java.lang.Object r2 = r0.A02
            X.2nn r2 = (X.C53862nn) r2
            java.lang.Object r1 = r0.A03
            X.2ob r1 = (X.C54362ob) r1
            java.lang.String r0 = "CrosspostRequestSessionManager/CrosspostRunnable executed"
            X.AnonymousClass356.A01(r0)
            r4.A02(r1, r3, r2)
            return
        L_0x106c:
            java.lang.Object r2 = r0.A00
            X.2qW r2 = (X.C55542qW) r2
            java.lang.Object r3 = r0.A01
            java.lang.Object r4 = r0.A02
            java.lang.Object r5 = r0.A03
            X.4FS r0 = r2.A01
            r6 = 25
        L_0x107a:
            X.3ac r1 = new X.3ac
            r1.<init>(r2, r3, r4, r5, r6)
            r0.BkM(r1)
            return
        L_0x1083:
            java.lang.Object r4 = r0.A00
            X.30E r4 = (X.AnonymousClass30E) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            X.1mW r2 = (X.C30481mW) r2
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            X.8qC r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.2hO r0 = (X.C49962hO) r0
            r0.A00(r3, r2, r1)
            return
        L_0x109f:
            java.lang.Object r1 = r0.A00
            X.30E r1 = (X.AnonymousClass30E) r1
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r0.A02
            X.1mW r4 = (X.C30481mW) r4
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            X.2qW r2 = r1.A05
            java.lang.String r0 = "CrosspostRequestSessionManager/handleNewAutoShareRecordCreationForTextStatus start text status burning"
            X.AnonymousClass356.A01(r0)
            X.8qC r1 = r2.A07
            java.lang.Object r0 = r1.get()
            X.2hO r0 = (X.C49962hO) r0
            r0.A00(r5, r4, r3)
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r2.A01(r4, r3)
            java.lang.Object r0 = r1.get()
            X.2hO r0 = (X.C49962hO) r0
            r0.A01(r4)
            return
        L_0x10d2:
            java.lang.Object r1 = r0.A00
            java.lang.Object r2 = r0.A01
            X.4Cy r2 = (X.C84594Cy) r2
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A03
            X.C18260x0.A0Q(r2, r3)
            r5 = 2
            X.4Ka r0 = new X.4Ka
            r0.<init>(r1, r2, r3, r4, r5)
            r2.Bh4(r0)
            return
        L_0x10e9:
            r4.A0C()     // Catch:{ Exception -> 0x1123 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x1123 }
            r4.A07 = r1     // Catch:{ Exception -> 0x1123 }
            X.5Uc r0 = r4.A12     // Catch:{ Exception -> 0x1123 }
            r0.A02 = r1     // Catch:{ Exception -> 0x1123 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x1123 }
            r4.A06 = r0     // Catch:{ Exception -> 0x1123 }
            r0 = 0
            r4.A05 = r0     // Catch:{ Exception -> 0x1123 }
            android.os.Handler r1 = r4.A0U     // Catch:{ Exception -> 0x1123 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ Exception -> 0x1123 }
            X.24c r2 = r4.A0c     // Catch:{ Exception -> 0x1123 }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ Exception -> 0x1123 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x1123 }
            r0.start()     // Catch:{ Exception -> 0x1123 }
            X.0yL r1 = new X.0yL     // Catch:{ Exception -> 0x1123 }
            r1.<init>(r0, r2, r6)     // Catch:{ Exception -> 0x1123 }
            r4.A0H = r1     // Catch:{ Exception -> 0x1123 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x1123 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ all -> 0x1120 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x1123 }
            return
        L_0x1120:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x1123 }
            throw r0     // Catch:{ Exception -> 0x1123 }
        L_0x1123:
            r1 = move-exception
            java.lang.String r0 = "voicenote/startvoicenote/startfailed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 10
            X.C69263Wi.A07(r3, r4, r5, r0)
            return
        L_0x1130:
            r1 = move-exception
            if (r5 == 0) goto L_0x113b
            r5.close()     // Catch:{ all -> 0x1137 }
            goto L_0x113b
        L_0x1137:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x113c }
        L_0x113b:
            throw r1     // Catch:{ all -> 0x113c }
        L_0x113c:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x1141 }
            throw r1
        L_0x1141:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x1146:
            java.lang.Object r5 = r0.A00
            X.2yr r5 = (X.C60622yr) r5
            java.lang.Object r4 = r0.A01
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            java.lang.Object r3 = r0.A02
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            if (r5 == 0) goto L_0x1174
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r5.A00
            int r1 = X.AnonymousClass0Y8.A04(r2, r0)
            int r0 = r5.A01
            int r0 = X.AnonymousClass0Y8.A04(r2, r0)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0B(r4, r0)
            X.C162457s7.A0D(r0)
            X.4Lp r4 = new X.4Lp
            r4.<init>(r0, r1)
        L_0x1174:
            r3.setImageDrawable(r4)
            return
        L_0x1178:
            java.lang.Object r5 = r0.A00
            java.lang.Object r8 = r0.A01
            X.4ea r8 = (X.C89654ea) r8
            java.lang.Object r6 = r0.A02
            java.lang.Object r7 = r0.A03
            r8.BjL()     // Catch:{ all -> 0x1186 }
            goto L_0x118a
        L_0x1186:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)
        L_0x118a:
            X.0zH r3 = X.AnonymousClass5V0.A00(r8)
            r0 = 2131891206(0x7f121406, float:1.9417126E38)
            r3.A0T(r0)
            r0 = 2131894489(0x7f1220d9, float:1.9423784E38)
            r9 = 1
            X.4K8 r4 = new X.4K8
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0d(r8, r4, r0)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 142(0x8e, float:1.99E-43)
            X.4K2 r0 = new X.4K2
            r0.<init>(r6, r1)
            r3.A0c(r8, r0, r2)
            r3.A0S()
            return
        L_0x11b1:
            java.lang.Object r3 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r1 = r0.A02
            X.1mV r1 = (X.C30471mV) r1
            java.lang.Object r0 = r0.A03
            X.5ND r0 = (X.AnonymousClass5ND) r0
            r3.A1m(r2, r0, r1)
            return
        L_0x11c5:
            java.lang.Object r6 = r0.A00
            X.33d r6 = (X.C620133d) r6
            java.lang.Object r7 = r0.A01
            X.1I7 r7 = (X.AnonymousClass1I7) r7
            java.lang.Object r5 = r0.A02
            X.1mV r5 = (X.C30471mV) r5
            java.lang.Object r4 = r0.A03
            X.1I7 r4 = (X.AnonymousClass1I7) r4
            java.lang.String r8 = "mediadownloadmanager/queueDownload dependency express path download "
            boolean r0 = r7.A11     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            if (r0 == 0) goto L_0x1211
            X.2sf r9 = r7.A0h     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            boolean r0 = r9 instanceof X.C28231fw     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            if (r0 == 0) goto L_0x1211
            X.1fw r9 = (X.C28231fw) r9     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            boolean r0 = r9.A02     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            if (r0 == 0) goto L_0x11fe
            java.lang.String r0 = "ExpressPathMediaDownloadStat/onPairedDownloadSubscribe get called more than once"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
        L_0x11ec:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.String r0 = "MediaDownload/onPairedRegularMediaDownloadSubscribe EP download already execute time = "
            r11.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            long r2 = r9.A0A     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x1217
            goto L_0x120e
        L_0x11fe:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r9.A01 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            long r0 = r9.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r9.A00 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0 = 1
            r9.A02 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            goto L_0x11ec
        L_0x120e:
            r0 = 0
            goto L_0x1221
        L_0x1211:
            java.lang.String r0 = "MediaDownload/onPairedRegularMediaDownloadSubscribe This should only be called in express path download"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            goto L_0x1236
        L_0x1217:
            long r0 = r9.A01     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x126e
            long r0 = r9.A04()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
        L_0x1221:
            r11.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.String r0 = ", already downloaded bytes = "
            r11.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            long r0 = r9.A00     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x1233
            long r0 = r9.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
        L_0x1233:
            X.C18260x0.A1H(r11, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
        L_0x1236:
            long r2 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            X.2y3 r1 = r6.A0N     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0 = 1
            java.lang.Float r0 = r1.A01(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.String r9 = " milleseconds"
            if (r0 == 0) goto L_0x1264
            float r1 = (float) r2     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            float r0 = r0.floatValue()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            float r1 = r1 / r0
            long r2 = (long) r1     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.String r0 = "MediaDownloadManager/getETAByEstimatedOrDefaultBandwidth Estimate express path download ETA in: "
        L_0x1250:
            r1.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r1.append(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            X.C18260x0.A1J(r1, r9)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            X.1VX r9 = r6.A0K     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0 = 6502(0x1966, float:9.111E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            boolean r0 = r9.A0Y(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            goto L_0x1270
        L_0x1264:
            r0 = 300(0x12c, double:1.48E-321)
            long r2 = r2 / r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.lang.String r0 = "MediaDownloadManager/getETAByEstimatedOrDefaultBandwidth Cannot get bandwidth data to estimate express path ETA. Use P90 bandwidth guess ETA in "
            goto L_0x1250
        L_0x126e:
            long r0 = r0 - r2
            goto L_0x1221
        L_0x1270:
            if (r0 == 0) goto L_0x1288
            r0 = 6575(0x19af, float:9.214E-42)
            int r1 = r9.A0O(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0 = 10000(0x2710, float:1.4013E-41)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            long r0 = (long) r0     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
        L_0x1288:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            java.util.concurrent.FutureTask r0 = r7.A02     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            r0.get(r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x12a8, TimeoutException -> 0x129a, CancellationException -> 0x1290 }
            goto L_0x12b1
        L_0x1290:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r7, r8)
            java.lang.String r0 = " got cancellation exception, probably user manually cancel download"
            X.C18260x0.A1K(r1, r0)
            return
        L_0x129a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r7, r8)
            java.lang.String r0 = " got timeout exception, skip it and start regular download"
            X.C18260x0.A1K(r1, r0)
            r0 = 1
            r7.Ayd(r0)
            goto L_0x12b1
        L_0x12a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r7, r8)
            java.lang.String r0 = " got execution/interrupt exception, skip it and start regular download"
            X.C18260x0.A1K(r1, r0)
        L_0x12b1:
            X.1fp r0 = r6.A0R
            r0.A02(r4, r5)
            return
        L_0x12b7:
            java.lang.Object r1 = r0.A00
            X.2xJ r1 = (X.C59682xJ) r1
            java.lang.Object r9 = r0.A01
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r6 = r0.A02
            byte[][] r6 = (byte[][]) r6
            java.lang.Object r0 = r0.A03
            X.7SL r0 = (X.AnonymousClass7SL) r0
            X.2H0 r8 = r1.A03
            X.7T6 r7 = new X.7T6
            r7.<init>(r0, r1, r6)
            int r5 = r9.length
            int r2 = r6.length
            if (r5 == r2) goto L_0x12f3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "keytransparencyprotocolhelper/sendmultiserializedlookupiq Labels and keys differ in length: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " vs. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " . Request is canceled. Failing verification"
            X.C18260x0.A1K(r1, r0)
            java.lang.String r2 = "Missing identity keys or labels"
            r1 = -1
            r0 = 0
            r7.A00(r0, r2, r1)
            return
        L_0x12f3:
            X.31C r12 = r8.A00
            java.lang.String r15 = r12.A03()
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r2)
            r4 = 0
        L_0x12fe:
            if (r4 >= r5) goto L_0x131d
            r0 = r6[r4]
            X.1wa r2 = new X.1wa
            r2.<init>((byte[]) r0)
            r0 = r9[r4]
            byte[] r0 = r0.getBytes()
            X.1wm r1 = new X.1wm
            r1.<init>((X.C35261wa) r2, (byte[]) r0)
            X.1wa r0 = new X.1wa
            r0.<init>((X.C35381wm) r1)
            r3.add(r0)
            int r4 = r4 + 1
            goto L_0x12fe
        L_0x131d:
            r0 = 19
            X.1wm r2 = new X.1wm
            r2.<init>((java.lang.String) r15, (int) r0)
            r1 = 20
            X.1wm r0 = new X.1wm
            r0.<init>((X.C35381wm) r2, (int) r1)
            X.1xK r10 = new X.1xK
            r10.<init>((X.C35381wm) r0, (java.util.List) r3)
            r16 = 342(0x156, float:4.79E-43)
            X.36K r14 = r10.A00
            r11 = 0
            X.93A r6 = new X.93A
            r6.<init>(r7, r8, r9, r10, r11)
            r17 = 32000(0x7d00, double:1.581E-319)
            r13 = r6
            r12.A0D(r13, r14, r15, r16, r17)
            return
        L_0x1341:
            java.lang.Object r4 = r0.A00
            X.3Lq r4 = (X.C66493Lq) r4
            java.lang.Object r3 = r0.A01
            X.1fL r3 = (X.C28011fL) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A03
            java.lang.Long r1 = (java.lang.Long) r1
            X.2sj r0 = r4.A0b
            r0.A07(r3, r1, r2)
            return
        L_0x1357:
            java.lang.Object r4 = r0.A00
            X.2oz r4 = (X.C54602oz) r4
            java.lang.Object r3 = r0.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r0.A02
            X.2kE r2 = (X.C51692kE) r2
            java.lang.Object r1 = r0.A03
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 2
            X.C162457s7.A0J(r2, r0)
            r4.A00(r2, r3)
            X.3Wh r0 = r4.A00
            X.C69253Wh.A01(r0, r1)
            return
        L_0x1374:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Compressed folder not explicitly specified for assetType: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x1383:
            r2 = move-exception
            int r1 = r3.A01
            java.lang.Object r0 = r0.A01
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = X.C18290x4.A0j(r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x1395
            r0.decrementAndGet()
        L_0x1395:
            throw r2
        L_0x1396:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x13a8 }
        L_0x1398:
            throw r0     // Catch:{ all -> 0x13a8 }
        L_0x1399:
            r0 = r16
            r1.remove(r0)     // Catch:{ all -> 0x13a5 }
            int r0 = r2.A00     // Catch:{ all -> 0x13a5 }
            int r0 = r0 - r3
            r2.A00 = r0     // Catch:{ all -> 0x13a5 }
            monitor-exit(r1)     // Catch:{ all -> 0x13a5 }
            return
        L_0x13a5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x13a5 }
            throw r0
        L_0x13a8:
            r1 = move-exception
            if (r17 == 0) goto L_0x13b3
            r17.close()     // Catch:{ all -> 0x13af }
            goto L_0x13b3
        L_0x13af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x13b4 }
        L_0x13b3:
            throw r1     // Catch:{ all -> 0x13b4 }
        L_0x13b4:
            r4 = move-exception
            if (r16 == 0) goto L_0x13c8
            java.util.Set r1 = r2.A1E
            monitor-enter(r1)
            r0 = r16
            r1.remove(r0)     // Catch:{ all -> 0x13c6 }
            int r0 = r2.A00     // Catch:{ all -> 0x13c6 }
            int r0 = r0 - r3
            r2.A00 = r0     // Catch:{ all -> 0x13c6 }
            monitor-exit(r1)     // Catch:{ all -> 0x13c6 }
            throw r4
        L_0x13c6:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x13c6 }
        L_0x13c8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70513ac.run():void");
    }
}
