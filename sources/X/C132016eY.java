package X;

import java.io.File;

/* renamed from: X.6eY  reason: invalid class name and case insensitive filesystem */
public final class C132016eY extends AnonymousClass1I8 {
    public final C64393Dh A00;
    public final C61072zf A01;
    public final File A02;
    public final AnonymousClass4GP A03;
    public final AnonymousClass4GT A04;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r8 == -1) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        r9 = r6.A04;
        r1 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A1B(java.util.UUID.randomUUID(), r1);
        r9 = (java.io.File) r9.BGk(X.AnonymousClass000.A0X(".wav", r1), X.AnonymousClass6C9.A0Z(r3), r6.A00, r6.A01);
        r14 = X.AnonymousClass0x9.A0h(r9).getChannel();
        X.C162457s7.A0D(r14);
        r12 = r5.getTrackFormat(r8);
        X.C162457s7.A0D(r12);
        r11 = r12.getString("mime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        if (r11 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        r5.selectTrack(r8);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r12.containsKey("durationUs") == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        r20 = r12.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        X.C18260x0.A1R(X.AnonymousClass001.A0o(), "audiodecodetask/decoder format: ", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r8 = android.media.MediaCodec.createDecoderByType(r11);
        X.C162457s7.A0H(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.whatsapp.util.Log.i("audiodecodetask/decoder created");
        r8.configure(r12, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        com.whatsapp.util.Log.i("audiodecodetask/decoder configured");
        r8.start();
        com.whatsapp.util.Log.i("audiodecodetask/decoder started");
        r19 = r8.getInputBuffers();
        X.C162457s7.A0D(r19);
        r18 = r8.getOutputBuffers();
        X.C162457s7.A0D(r18);
        r4 = new android.media.MediaCodec.BufferInfo();
        r12 = 0;
        r17 = false;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0115, code lost:
        if (r6.A02.isCancelled() != false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        r23 = r8.dequeueInputBuffer(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        if (r23 < 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        r25 = r5.readSampleData(r19[r23], r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        if (r25 >= 0) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        com.whatsapp.util.Log.i("audiodecodetask/extractor BUFFER_FLAG_END_OF_STREAM");
        r8.queueInputBuffer(r23, r2, r2, r0, 4);
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        r8.queueInputBuffer(r23, r2, r25, r5.getSampleTime(), r2);
        r5.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        r13 = r8.dequeueOutputBuffer(r4, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0151, code lost:
        if (r13 < 0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0159, code lost:
        if (r4.presentationTimeUs < 0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015b, code lost:
        r0 = r18[r13];
        X.AnonymousClass6C7.A0z(r4, r0);
        r14.write(r0);
        X.AnonymousClass6C7.A0z(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0168, code lost:
        if (r20 == 0) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016a, code lost:
        r0 = (int) ((((long) 100) * r4.presentationTimeUs) / r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0173, code lost:
        if (r0 == r12) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0175, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0177, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        r8.releaseOutputBuffer(r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
        if (r13 != -3) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        r18 = r8.getOutputBuffers();
        X.C162457s7.A0D(r18);
        r0 = "audiodecodetask/decoder output buffers have changed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018c, code lost:
        if (r13 != -2) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018e, code lost:
        r2 = r8.getOutputFormat();
        X.C162457s7.A0D(r2);
        r0 = X.AnonymousClass000.A0P(r2, "audiodecodetask/decoder output format has changed to ", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019f, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a6, code lost:
        if ((r4.flags & 4) == 0) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a8, code lost:
        com.whatsapp.util.Log.i("audiodecodetask/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ad, code lost:
        X.C18260x0.A0y("audiodecodetask/skipped: ", X.AnonymousClass001.A0o(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b7, code lost:
        r2 = 0;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ba, code lost:
        if (r17 != false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01be, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8.stop();
        r8.release();
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01dc, code lost:
        com.whatsapp.util.Log.e("audiodecodetask/can't get input mime");
        r5.release();
        r0 = new X.C138056ph();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        r8.stop();
        r8.release();
        r5.release();
        r2 = X.AnonymousClass001.A0o();
        r2.append("audiodecodetask finished output: ");
        X.C18260x0.A1I(r2, r9.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0237, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A07() {
        /*
            r29 = this;
            r10 = 1
            r7 = 0
            r6 = r29
            java.io.File r3 = r6.A02     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r3 == 0) goto L_0x023e
            boolean r0 = r3.exists()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r0 == 0) goto L_0x023e
            X.6DM r2 = new X.6DM     // Catch:{ Exception -> 0x0238 }
            r2.<init>()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0231 }
            r2.setDataSource(r0)     // Catch:{ all -> 0x0231 }
            r0 = 16
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ all -> 0x0231 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2.close()     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = "audiodecodetask/audio/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.4GP r0 = r6.A03     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.Object r5 = r0.invoke()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            android.media.MediaExtractor r5 = (android.media.MediaExtractor) r5     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.setDataSource(r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            int r9 = r5.getTrackCount()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "audiodecodetask/Number of tracks: "
            X.C18260x0.A0y(r0, r1, r9)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r2 = 0
            r8 = 0
        L_0x004c:
            java.lang.String r11 = "mime"
            r4 = -1
            if (r8 >= r9) goto L_0x01ea
            android.media.MediaFormat r13 = r5.getTrackFormat(r8)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C162457s7.A0D(r13)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r12 = r13.getString(r11)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "audiodecodetask/track: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.append(r8)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "; mime: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.append(r12)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "; format: "
            X.C18260x0.A1R(r1, r0, r13)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r12 == 0) goto L_0x0080
            java.lang.String r0 = "audio"
            boolean r0 = r12.startsWith(r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r0 != r10) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x004c
        L_0x0083:
            if (r8 == r4) goto L_0x01ea
            X.4GT r9 = r6.A04     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.AnonymousClass000.A1B(r0, r1)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = ".wav"
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.Long r3 = X.AnonymousClass6C9.A0Z(r3)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.3Dh r1 = r6.A00     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.2zf r0 = r6.A01     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.Object r9 = r9.BGk(r4, r3, r1, r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.io.File r9 = (java.io.File) r9     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r9)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.nio.channels.FileChannel r14 = r0.getChannel()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C162457s7.A0D(r14)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            android.media.MediaFormat r12 = r5.getTrackFormat(r8)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C162457s7.A0D(r12)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r11 = r12.getString(r11)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r11 == 0) goto L_0x01dc
            r5.selectTrack(r8)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r4 = "durationUs"
            boolean r3 = r12.containsKey(r4)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r0 = 0
            if (r3 == 0) goto L_0x00d9
            long r20 = r12.getLong(r4)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x00cf:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r3 = "audiodecodetask/decoder format: "
            X.C18260x0.A1R(r4, r3, r12)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            goto L_0x00dc
        L_0x00d9:
            r20 = 0
            goto L_0x00cf
        L_0x00dc:
            android.media.MediaCodec r8 = android.media.MediaCodec.createDecoderByType(r11)     // Catch:{ IllegalArgumentException -> 0x01c9 }
            X.C162457s7.A0H(r8)     // Catch:{ IllegalArgumentException -> 0x01c9 }
            java.lang.String r3 = "audiodecodetask/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r8.configure(r12, r7, r7, r2)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r3 = "audiodecodetask/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r8.start()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r3 = "audiodecodetask/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.nio.ByteBuffer[] r19 = r8.getInputBuffers()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C162457s7.A0D(r19)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.nio.ByteBuffer[] r18 = r8.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C162457s7.A0D(r18)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r12 = 0
            r17 = 0
            r11 = 0
        L_0x010f:
            java.util.concurrent.FutureTask r3 = r6.A02     // Catch:{ all -> 0x01be }
            boolean r3 = r3.isCancelled()     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x01ad
            int r23 = r8.dequeueInputBuffer(r0)     // Catch:{ all -> 0x01be }
            if (r23 < 0) goto L_0x014a
            r3 = r19[r23]     // Catch:{ all -> 0x01be }
            int r25 = r5.readSampleData(r3, r2)     // Catch:{ all -> 0x01be }
            if (r25 >= 0) goto L_0x013a
            java.lang.String r3 = "audiodecodetask/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x01be }
            r28 = 4
            r25 = r2
            r22 = r8
            r24 = r2
            r26 = r0
            r22.queueInputBuffer(r23, r24, r25, r26, r28)     // Catch:{ all -> 0x01be }
            r17 = 1
            goto L_0x014a
        L_0x013a:
            long r26 = r5.getSampleTime()     // Catch:{ all -> 0x01be }
            r28 = r2
            r22 = r8
            r24 = r2
            r22.queueInputBuffer(r23, r24, r25, r26, r28)     // Catch:{ all -> 0x01be }
            r5.advance()     // Catch:{ all -> 0x01be }
        L_0x014a:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r13 = r8.dequeueOutputBuffer(r4, r0)     // Catch:{ all -> 0x01be }
            if (r13 < 0) goto L_0x017e
            long r0 = r4.presentationTimeUs     // Catch:{ all -> 0x01be }
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x0177
            r0 = r18[r13]     // Catch:{ all -> 0x01be }
            X.AnonymousClass6C7.A0z(r4, r0)     // Catch:{ all -> 0x01be }
            r14.write(r0)     // Catch:{ all -> 0x01be }
            X.AnonymousClass6C7.A0z(r4, r0)     // Catch:{ all -> 0x01be }
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            r0 = 100
            long r2 = (long) r0     // Catch:{ all -> 0x01be }
            long r0 = r4.presentationTimeUs     // Catch:{ all -> 0x01be }
            long r2 = r2 * r0
            long r2 = r2 / r20
            int r0 = (int) r2     // Catch:{ all -> 0x01be }
            if (r0 == r12) goto L_0x0179
            r12 = r0
            goto L_0x0179
        L_0x0177:
            int r11 = r11 + 1
        L_0x0179:
            r0 = 0
            r8.releaseOutputBuffer(r13, r0)     // Catch:{ all -> 0x01be }
            goto L_0x01a2
        L_0x017e:
            r0 = -3
            if (r13 != r0) goto L_0x018b
            java.nio.ByteBuffer[] r18 = r8.getOutputBuffers()     // Catch:{ all -> 0x01be }
            X.C162457s7.A0D(r18)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "audiodecodetask/decoder output buffers have changed."
            goto L_0x019f
        L_0x018b:
            r0 = -2
            if (r13 != r0) goto L_0x01a2
            android.media.MediaFormat r2 = r8.getOutputFormat()     // Catch:{ all -> 0x01be }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "audiodecodetask/decoder output format has changed to "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x01be }
        L_0x019f:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01be }
        L_0x01a2:
            int r0 = r4.flags     // Catch:{ all -> 0x01be }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "audiodecodetask/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01be }
        L_0x01ad:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "audiodecodetask/skipped: "
            X.C18260x0.A0y(r0, r1, r11)     // Catch:{ all -> 0x01be }
            goto L_0x01f4
        L_0x01b7:
            r2 = 0
            r0 = 0
            if (r17 != 0) goto L_0x01ad
            goto L_0x010f
        L_0x01be:
            r0 = move-exception
            r8.stop()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r8.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            goto L_0x01e9
        L_0x01c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "audiodecodetask/can't create decoder for "
            X.C18260x0.A0u(r0, r11, r1, r2)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.6ph r0 = new X.6ph     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            throw r0     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x01dc:
            java.lang.String r0 = "audiodecodetask/can't get input mime"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.6ph r0 = new X.6ph     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x01e9:
            throw r0     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x01ea:
            java.lang.String r0 = "audiodecodetask/no audio tracks"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r9 = r7
            goto L_0x020d
        L_0x01f4:
            r8.stop()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r8.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r5.release()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            java.lang.String r0 = "audiodecodetask finished output: "
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            long r0 = r9.length()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            X.C18260x0.A1I(r2, r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x020d:
            java.util.concurrent.FutureTask r0 = r6.A02     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            boolean r0 = r0.isCancelled()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r0 == 0) goto L_0x021c
            r0 = 3
            X.7YU r1 = new X.7YU     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.<init>(r7, r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            return r1
        L_0x021c:
            if (r9 == 0) goto L_0x022a
            boolean r0 = r9.exists()     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            if (r0 != r10) goto L_0x022a
            X.7YU r1 = new X.7YU     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.<init>(r9, r10)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            return r1
        L_0x022a:
            r0 = 4
            X.7YU r1 = new X.7YU     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.<init>(r7, r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            return r1
        L_0x0231:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ Exception -> 0x0238 }
            throw r0     // Catch:{ Exception -> 0x0238 }
        L_0x0238:
            r1 = move-exception
            java.lang.String r0 = "audiodecodetask/cannot-decode"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
        L_0x023e:
            java.lang.String r0 = "audiodecodetask/audio/cannot-decode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r0 = 2
            X.7YU r1 = new X.7YU     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            r1.<init>(r7, r0)     // Catch:{ IllegalStateException -> 0x0283, 6ph -> 0x0276, FileNotFoundException -> 0x0269, IOException -> 0x024a }
            return r1
        L_0x024a:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L_0x0262
            java.lang.String r1 = "No space"
            r0 = 0
            boolean r0 = X.C175728Zm.A0S(r2, r1, r0)
            if (r0 != r10) goto L_0x0262
            r0 = 8
            X.7YU r1 = new X.7YU
            r1.<init>(r7, r0)
            return r1
        L_0x0262:
            r0 = 5
            X.7YU r1 = new X.7YU
            r1.<init>(r7, r0)
            return r1
        L_0x0269:
            r1 = move-exception
            java.lang.String r0 = "audiodecodetask/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 7
            X.7YU r1 = new X.7YU
            r1.<init>(r7, r0)
            return r1
        L_0x0276:
            r1 = move-exception
            java.lang.String r0 = "audiodecodetask/badaudio"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 6
            X.7YU r1 = new X.7YU
            r1.<init>(r7, r0)
            return r1
        L_0x0283:
            r1 = move-exception
            java.lang.String r0 = "audiodecodetask/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 5
            X.7YU r1 = new X.7YU
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132016eY.A07():java.lang.Object");
    }

    public C132016eY(C64393Dh r3, C61072zf r4, File file) {
        C18260x0.A0Q(r3, r4);
        AnonymousClass8V1 r1 = AnonymousClass8V1.A00;
        C174478Ur r0 = C174478Ur.A00;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = file;
        this.A04 = r1;
        this.A03 = r0;
    }
}
