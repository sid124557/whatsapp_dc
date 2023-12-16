package X;

import android.media.MediaCodec;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: X.8HS  reason: invalid class name */
public class AnonymousClass8HS implements C184448rq {
    public static final int[] A09 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public int A00;
    public C182558oc A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public volatile boolean A08;

    public static boolean A00(File file) {
        AnonymousClass6DM r2;
        if (file != null && file.exists()) {
            try {
                r2 = new AnonymousClass6DM();
                r2.setDataSource(file.getAbsolutePath());
                boolean A1W = AnonymousClass000.A1W(r2.extractMetadata(16));
                r2.close();
                return A1W;
            } catch (Exception e) {
                Log.e("audiotranscoder/cantranscode", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
    }

    public void cancel() {
        this.A08 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0379, code lost:
        if (r7.A01.BZ1(r2) != false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020c, code lost:
        if (r6.getInteger("bit-width") != 24) goto L_0x020e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r50 = this;
            java.lang.String r40 = "pcm-encoding"
            java.lang.String r39 = "channel-count"
            java.lang.String r38 = "sample-rate"
            java.lang.String r37 = "bit-width"
            java.lang.String r2 = "audiotranscoder/can't create decoder for "
            java.lang.String r4 = "durationUs"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "audiotranscoder/bitrate:"
            r1.append(r0)
            r7 = r50
            int r0 = r7.A03
            r49 = r0
            X.C18260x0.A1G(r1, r0)
            android.media.MediaExtractor r11 = new android.media.MediaExtractor
            r11.<init>()
            java.io.File r0 = r7.A06
            java.lang.String r0 = r0.getAbsolutePath()
            r11.setDataSource(r0)
            int r9 = r11.getTrackCount()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "audiotranscoder/Number of tracks:"
            X.C18260x0.A0y(r0, r1, r9)
            r12 = 0
            r5 = 0
        L_0x003b:
            java.lang.String r8 = "mime"
            if (r5 >= r9) goto L_0x045e
            android.media.MediaFormat r6 = r11.getTrackFormat(r5)
            java.lang.String r3 = r6.getString(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "audiotranscoder/track:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "mime:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " format:"
            X.C18260x0.A1R(r1, r0, r6)
            java.lang.String r0 = "audio"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0073
            if (r5 < 0) goto L_0x045e
            java.io.File r0 = r7.A07
            r48 = r0
            java.io.FileOutputStream r36 = X.AnonymousClass0x9.A0h(r48)
            goto L_0x0076
        L_0x0073:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0076:
            java.nio.channels.FileChannel r35 = r36.getChannel()     // Catch:{ all -> 0x0454 }
            android.media.MediaCodecInfo[] r13 = X.AnonymousClass6C9.A1X(r12)     // Catch:{ all -> 0x0448 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/number of codecs: "
            r1.append(r0)     // Catch:{ all -> 0x0448 }
            int r10 = r13.length     // Catch:{ all -> 0x0448 }
            X.C18260x0.A1G(r1, r10)     // Catch:{ all -> 0x0448 }
            r34 = 0
        L_0x008d:
            java.lang.String r33 = "audio/mp4a-latm"
            if (r12 >= r10) goto L_0x00b9
            r14 = r13[r12]     // Catch:{ all -> 0x0448 }
            boolean r0 = r14.isEncoder()     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String[] r9 = r14.getSupportedTypes()     // Catch:{ all -> 0x0448 }
            r6 = 0
            r3 = 0
        L_0x009f:
            int r0 = r9.length     // Catch:{ all -> 0x0448 }
            if (r6 >= r0) goto L_0x00b2
            if (r3 != 0) goto L_0x00b4
            r1 = r9[r6]     // Catch:{ all -> 0x0448 }
            r0 = r33
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x00af
            r3 = 1
        L_0x00af:
            int r6 = r6 + 1
            goto L_0x009f
        L_0x00b2:
            if (r3 == 0) goto L_0x00b6
        L_0x00b4:
            r34 = r14
        L_0x00b6:
            int r12 = r12 + 1
            goto L_0x008d
        L_0x00b9:
            if (r34 == 0) goto L_0x042e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/found "
            r3.append(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = r34.getName()     // Catch:{ all -> 0x0448 }
            r3.append(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = " supporting "
            r0 = r33
            X.C18260x0.A0s(r1, r0, r3)     // Catch:{ all -> 0x0448 }
            android.media.MediaFormat r6 = r11.getTrackFormat(r5)     // Catch:{ all -> 0x0448 }
            java.lang.String r3 = r6.getString(r8)     // Catch:{ all -> 0x0448 }
            r11.selectTrack(r5)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0448 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x010a
        L_0x00ed:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0448 }
            r0 = 28
            if (r1 < r0) goto L_0x0103
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/first sample size: "
            r5.append(r0)     // Catch:{ all -> 0x0448 }
            long r0 = r11.getSampleSize()     // Catch:{ all -> 0x0448 }
            X.C18260x0.A1I(r5, r0)     // Catch:{ all -> 0x0448 }
        L_0x0103:
            java.lang.String r1 = "max-input-size"
            r0 = 16384(0x4000, float:2.2959E-41)
            r6.setInteger(r1, r0)     // Catch:{ all -> 0x0448 }
        L_0x010a:
            boolean r0 = r6.containsKey(r4)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x0127
            long r18 = r6.getLong(r4)     // Catch:{ all -> 0x0448 }
        L_0x0114:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/decoder format:"
            X.C18270x1.A1H(r1, r0, r6)     // Catch:{ all -> 0x0448 }
            X.C18280x3.A14(r1)     // Catch:{ all -> 0x0448 }
            r0 = 0
            r7.A02 = r0     // Catch:{ all -> 0x0448 }
            r0 = 0
            r7.A00 = r0     // Catch:{ all -> 0x0448 }
            goto L_0x012a
        L_0x0127:
            r18 = 0
            goto L_0x0114
        L_0x012a:
            android.media.MediaCodec r13 = android.media.MediaCodec.createDecoderByType(r3)     // Catch:{ IllegalArgumentException -> 0x041d }
            java.lang.String r0 = "audiotranscoder/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0448 }
            if (r13 == 0) goto L_0x040d
            java.lang.String r0 = r34.getName()     // Catch:{ all -> 0x0448 }
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0448 }
            r1 = 0
            r0 = 0
            r13.configure(r6, r0, r0, r1)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0448 }
            r13.start()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audiotranscoder/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer[] r32 = r13.getInputBuffers()     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer[] r31 = r13.getOutputBuffers()     // Catch:{ all -> 0x0448 }
            android.media.MediaCodec$BufferInfo r5 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0448 }
            r5.<init>()     // Catch:{ all -> 0x0448 }
            android.media.MediaCodec$BufferInfo r30 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0448 }
            r30.<init>()     // Catch:{ all -> 0x0448 }
            long r9 = r7.A04     // Catch:{ all -> 0x0448 }
            r16 = 1000(0x3e8, double:4.94E-321)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x018e
            long r0 = r9 * r16
            r2 = 0
            r11.seekTo(r0, r2)     // Catch:{ all -> 0x0448 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            java.lang.String r3 = "audiotranscoder/seek to:"
            r2.append(r3)     // Catch:{ all -> 0x0448 }
            r2.append(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = " actual:"
            r2.append(r0)     // Catch:{ all -> 0x0448 }
            long r0 = r11.getSampleTime()     // Catch:{ all -> 0x0448 }
            X.C18260x0.A1I(r2, r0)     // Catch:{ all -> 0x0448 }
        L_0x018e:
            r0 = 7
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0448 }
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            goto L_0x019e
        L_0x019c:
            if (r24 != 0) goto L_0x03ba
        L_0x019e:
            r24 = 0
            boolean r0 = r7.A08     // Catch:{ all -> 0x0403 }
            if (r0 != 0) goto L_0x03ba
            r0 = 0
            int r42 = r13.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0403 }
            if (r42 < 0) goto L_0x01db
            r1 = r32[r42]     // Catch:{ all -> 0x0403 }
            r0 = r24
            int r44 = r11.readSampleData(r1, r0)     // Catch:{ all -> 0x0403 }
            if (r44 >= 0) goto L_0x01cb
            java.lang.String r0 = "audiotranscoder/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0403 }
            r45 = 0
            r47 = 4
            r44 = r24
            r41 = r13
            r43 = r24
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0403 }
            r24 = 1
            goto L_0x01db
        L_0x01cb:
            long r45 = r11.getSampleTime()     // Catch:{ all -> 0x0403 }
            r47 = r0
            r41 = r13
            r43 = r0
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0403 }
            r11.advance()     // Catch:{ all -> 0x0403 }
        L_0x01db:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = r13.dequeueOutputBuffer(r5, r0)     // Catch:{ all -> 0x0403 }
            if (r8 < 0) goto L_0x0390
            long r0 = r5.presentationTimeUs     // Catch:{ all -> 0x0403 }
            long r22 = r9 * r16
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 < 0) goto L_0x0381
            if (r28 != 0) goto L_0x02d6
            java.lang.String r1 = r34.getName()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "OMX.google"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x020e
            r0 = r37
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x020e
            r0 = r37
            int r1 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
            r0 = 24
            r26 = 1
            if (r1 == r0) goto L_0x0210
        L_0x020e:
            r26 = 0
        L_0x0210:
            r0 = r38
            int r14 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
            r0 = r39
            int r3 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
            r0 = r40
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x0250
            r0 = r40
            int r2 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
        L_0x022a:
            r0 = r33
            android.media.MediaFormat r1 = android.media.MediaFormat.createAudioFormat(r0, r14, r3)     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "bitrate"
            r15 = r49
            r1.setInteger(r0, r15)     // Catch:{ all -> 0x0403 }
            r0 = r38
            r1.setInteger(r0, r14)     // Catch:{ all -> 0x0403 }
            r0 = r39
            r1.setInteger(r0, r3)     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = "aac-profile"
            r0 = 2
            r1.setInteger(r3, r0)     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = "max-input-size"
            r0 = 64000(0xfa00, float:8.9683E-41)
            r1.setInteger(r3, r0)     // Catch:{ all -> 0x0403 }
            goto L_0x0252
        L_0x0250:
            r2 = 0
            goto L_0x022a
        L_0x0252:
            if (r2 == 0) goto L_0x0259
            r0 = r40
            r1.setInteger(r0, r2)     // Catch:{ all -> 0x0403 }
        L_0x0259:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/configuring encoder with output format "
            X.C18260x0.A1R(r2, r0, r1)     // Catch:{ all -> 0x0403 }
            r2 = 1
            r0 = 0
            r12.configure(r1, r0, r0, r2)     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0403 }
            r0 = r38
            int r3 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
            r0 = r39
            int r2 = r6.getInteger(r0)     // Catch:{ all -> 0x0403 }
            r0 = -1
            r15 = 0
            r4[r15] = r0     // Catch:{ all -> 0x0403 }
            r1 = 1
            r0 = -15
            r4[r1] = r0     // Catch:{ all -> 0x0403 }
            r14 = 0
        L_0x0282:
            int[] r1 = A09     // Catch:{ all -> 0x0403 }
            int r0 = r1.length     // Catch:{ all -> 0x0403 }
            if (r14 >= r0) goto L_0x028e
            r0 = r1[r14]     // Catch:{ all -> 0x0403 }
            if (r3 == r0) goto L_0x02a0
            int r14 = r14 + 1
            goto L_0x0282
        L_0x028e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/sampling rate "
            r1.append(r0)     // Catch:{ all -> 0x0403 }
            r1.append(r3)     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = " bps is not supported"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0403 }
            r14 = 0
        L_0x02a0:
            byte r0 = (byte) r14     // Catch:{ all -> 0x0403 }
            byte r3 = (byte) r2     // Catch:{ all -> 0x0403 }
            r2 = 2
            r1 = 64
            r4[r2] = r1     // Catch:{ all -> 0x0403 }
            int r0 = r0 << r2
            r0 = r0 | 64
            byte r1 = (byte) r0     // Catch:{ all -> 0x0403 }
            r4[r2] = r1     // Catch:{ all -> 0x0403 }
            int r0 = r3 >> 2
            X.AnonymousClass6C8.A0u(r1, r4, r0, r2)     // Catch:{ all -> 0x0403 }
            r2 = 3
            r0 = r3 & 3
            r1 = 6
            int r0 = r0 << r1
            byte r0 = (byte) r0     // Catch:{ all -> 0x0403 }
            r4[r2] = r0     // Catch:{ all -> 0x0403 }
            r0 = 4
            r4[r0] = r15     // Catch:{ all -> 0x0403 }
            r0 = 5
            r4[r0] = r15     // Catch:{ all -> 0x0403 }
            r0 = -4
            r4[r1] = r0     // Catch:{ all -> 0x0403 }
            r12.start()     // Catch:{ all -> 0x0403 }
            java.nio.ByteBuffer[] r25 = r12.getInputBuffers()     // Catch:{ all -> 0x0403 }
            java.nio.ByteBuffer[] r0 = r12.getOutputBuffers()     // Catch:{ all -> 0x0403 }
            r7.A02 = r0     // Catch:{ all -> 0x0403 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r28 = 1
            goto L_0x02d9
        L_0x02d6:
            r0 = 1000000(0xf4240, double:4.940656E-318)
        L_0x02d9:
            int r2 = r12.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0403 }
            r14 = -1
        L_0x02de:
            if (r2 != r14) goto L_0x02ec
            r3 = r30
            r2 = r35
            r7.A02(r3, r12, r2, r4)     // Catch:{ all -> 0x0403 }
            int r2 = r12.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0403 }
            goto L_0x02de
        L_0x02ec:
            if (r2 < 0) goto L_0x0384
            r3 = r25[r2]     // Catch:{ all -> 0x0403 }
            r14 = r31[r8]     // Catch:{ all -> 0x0403 }
            X.AnonymousClass6C7.A0z(r5, r14)     // Catch:{ all -> 0x0403 }
            r3.clear()     // Catch:{ all -> 0x0403 }
            if (r26 == 0) goto L_0x0316
            r15 = 0
        L_0x02fb:
            boolean r0 = r14.hasRemaining()     // Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x030f
            byte r1 = r14.get()     // Catch:{ all -> 0x0403 }
            int r0 = r15 % 3
            if (r0 == 0) goto L_0x030c
            r3.put(r1)     // Catch:{ all -> 0x0403 }
        L_0x030c:
            int r15 = r15 + 1
            goto L_0x02fb
        L_0x030f:
            int r0 = r5.size     // Catch:{ all -> 0x0403 }
            int r0 = r0 * 2
            int r3 = r0 / 3
            goto L_0x031b
        L_0x0316:
            r3.put(r14)     // Catch:{ all -> 0x0403 }
            int r3 = r5.size     // Catch:{ all -> 0x0403 }
        L_0x031b:
            r43 = 0
            long r0 = r5.presentationTimeUs     // Catch:{ all -> 0x0403 }
            int r15 = r5.flags     // Catch:{ all -> 0x0403 }
            r41 = r12
            r42 = r2
            r44 = r3
            r45 = r0
            r47 = r15
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0403 }
            X.AnonymousClass6C7.A0z(r5, r14)     // Catch:{ all -> 0x0403 }
            long r2 = r7.A05     // Catch:{ all -> 0x0403 }
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0346
            long r0 = r5.presentationTimeUs     // Catch:{ all -> 0x0403 }
            long r20 = r2 * r16
            int r14 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r14 <= 0) goto L_0x0346
            r14 = 0
            r24 = 1
            goto L_0x0348
        L_0x0346:
            r14 = 0
        L_0x0348:
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0384
            X.8oc r0 = r7.A01     // Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x0384
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0356
            r22 = 0
        L_0x0356:
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x035d
            r2 = r18
            goto L_0x035f
        L_0x035d:
            long r2 = r2 * r16
        L_0x035f:
            long r0 = r5.presentationTimeUs     // Catch:{ all -> 0x0403 }
            long r0 = r0 - r22
            r14 = 100
            long r0 = r0 * r14
            long r2 = r2 - r22
            long r0 = r0 / r2
            int r2 = (int) r0     // Catch:{ all -> 0x0403 }
            r0 = r29
            if (r2 == r0) goto L_0x0384
            boolean r0 = r7.A08     // Catch:{ all -> 0x0403 }
            if (r0 != 0) goto L_0x037b
            X.8oc r0 = r7.A01     // Catch:{ all -> 0x0403 }
            boolean r1 = r0.BZ1(r2)     // Catch:{ all -> 0x0403 }
            r0 = 0
            if (r1 == 0) goto L_0x037c
        L_0x037b:
            r0 = 1
        L_0x037c:
            r7.A08 = r0     // Catch:{ all -> 0x0403 }
            r29 = r2
            goto L_0x0384
        L_0x0381:
            int r27 = r27 + 1
            goto L_0x038b
        L_0x0384:
            r1 = r30
            r0 = r35
            r7.A02(r1, r12, r0, r4)     // Catch:{ all -> 0x0403 }
        L_0x038b:
            r0 = 0
            r13.releaseOutputBuffer(r8, r0)     // Catch:{ all -> 0x0403 }
            goto L_0x03af
        L_0x0390:
            r0 = -3
            if (r8 != r0) goto L_0x0394
            goto L_0x03a6
        L_0x0394:
            r0 = -2
            if (r8 != r0) goto L_0x03af
            android.media.MediaFormat r6 = r13.getOutputFormat()     // Catch:{ all -> 0x0403 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/decoder output format has changed to "
            java.lang.String r0 = X.AnonymousClass000.A0P(r6, r0, r1)     // Catch:{ all -> 0x0403 }
            goto L_0x03ac
        L_0x03a6:
            java.nio.ByteBuffer[] r31 = r13.getOutputBuffers()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/decoder output buffers have changed."
        L_0x03ac:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0403 }
        L_0x03af:
            int r0 = r5.flags     // Catch:{ all -> 0x0403 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "audiotranscoder/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0403 }
        L_0x03ba:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = "audiotranscoder/processed frames:"
            r2.append(r0)     // Catch:{ all -> 0x0403 }
            int r0 = r7.A00     // Catch:{ all -> 0x0403 }
            r2.append(r0)     // Catch:{ all -> 0x0403 }
            java.lang.String r1 = " skipped:"
            r0 = r27
            X.C18260x0.A0y(r1, r2, r0)     // Catch:{ all -> 0x0403 }
            r13.stop()     // Catch:{ all -> 0x0448 }
            r13.release()     // Catch:{ all -> 0x0448 }
            if (r28 == 0) goto L_0x03da
            r12.stop()     // Catch:{ all -> 0x0448 }
        L_0x03da:
            r12.release()     // Catch:{ all -> 0x0448 }
            r11.release()     // Catch:{ all -> 0x0448 }
            if (r35 == 0) goto L_0x03e5
            r35.close()     // Catch:{ all -> 0x0454 }
        L_0x03e5:
            r36.close()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "audiotranscoder finished cancelled:"
            r2.append(r0)
            boolean r0 = r7.A08
            r2.append(r0)
            java.lang.String r0 = " output:"
            r2.append(r0)
            long r0 = r48.length()
            X.C18260x0.A1I(r2, r0)
            return
        L_0x0403:
            r1 = move-exception
            r13.stop()     // Catch:{ all -> 0x0448 }
            r13.release()     // Catch:{ all -> 0x0448 }
            if (r28 == 0) goto L_0x0441
            goto L_0x043e
        L_0x040d:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0448 }
            X.C18260x0.A0r(r2, r3, r0)     // Catch:{ all -> 0x0448 }
            r11.release()     // Catch:{ all -> 0x0448 }
            X.6ph r1 = new X.6ph     // Catch:{ all -> 0x0448 }
            r1.<init>()     // Catch:{ all -> 0x0448 }
            goto L_0x0447
        L_0x041d:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r3)     // Catch:{ all -> 0x0448 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0448 }
            r11.release()     // Catch:{ all -> 0x0448 }
            X.6ph r1 = new X.6ph     // Catch:{ all -> 0x0448 }
            r1.<init>()     // Catch:{ all -> 0x0448 }
            goto L_0x0447
        L_0x042e:
            java.lang.String r0 = "audiotranscoder/ no codec supporting audio/mp4a-latm"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0448 }
            r11.release()     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "No codec supporting audio/mp4a-latm"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0448 }
            r1.<init>(r0)     // Catch:{ all -> 0x0448 }
            goto L_0x0447
        L_0x043e:
            r12.stop()     // Catch:{ all -> 0x0448 }
        L_0x0441:
            r12.release()     // Catch:{ all -> 0x0448 }
            r11.release()     // Catch:{ all -> 0x0448 }
        L_0x0447:
            throw r1     // Catch:{ all -> 0x0448 }
        L_0x0448:
            r1 = move-exception
            if (r35 == 0) goto L_0x0453
            r35.close()     // Catch:{ all -> 0x044f }
            goto L_0x0453
        L_0x044f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0454 }
        L_0x0453:
            throw r1     // Catch:{ all -> 0x0454 }
        L_0x0454:
            r1 = move-exception
            r36.close()     // Catch:{ all -> 0x0459 }
            throw r1
        L_0x0459:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x045e:
            java.lang.String r0 = "audiotranscoder/no audio tracks"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r11.release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HS.A01():void");
    }

    public final void A02(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, byte[] bArr) {
        String A0P;
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = this.A02[dequeueOutputBuffer];
                AnonymousClass6C7.A0z(bufferInfo, byteBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    this.A00++;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    AnonymousClass6C8.A0u((i >> 11) & 3, bArr, bArr[3] & 252, 3);
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                if (dequeueOutputBuffer == -3) {
                    this.A02 = mediaCodec.getOutputBuffers();
                    A0P = "audiotranscoder/encoder output buffers have changed";
                } else if (dequeueOutputBuffer == -2) {
                    A0P = AnonymousClass000.A0P(mediaCodec.getOutputFormat(), "audiotranscoder/encoder output format has changed to ", AnonymousClass001.A0o());
                }
                Log.i(A0P);
            }
        }
    }

    public boolean BFR() {
        return true;
    }

    public AnonymousClass8HS(C149767Nu r3) {
        this.A06 = r3.A03;
        this.A04 = r3.A01;
        this.A05 = r3.A02;
        this.A07 = r3.A04;
        this.A03 = r3.A00;
    }
}
