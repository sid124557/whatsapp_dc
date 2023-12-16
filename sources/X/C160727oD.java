package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.7oD  reason: invalid class name and case insensitive filesystem */
public class C160727oD {
    public int A00 = 0;
    public long A01;
    public long A02 = Long.MAX_VALUE;
    public long A03;
    public C152527Zf A04;
    public C151307Uf A05;
    public C180608lL A06;
    public C153247av A07 = new C153247av(TimeUnit.MICROSECONDS, -1, -1);
    public AnonymousClass7B8 A08;
    public AnonymousClass720 A09;
    public C151367Um A0A;
    public File A0B;
    public HashMap A0C;
    public boolean A0D;

    public final void A05() {
        Throwable th;
        AnonymousClass7JU r8;
        Throwable th2;
        C1445171w.A00("BaseMediaDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0D) {
            try {
                File file = this.A0B;
                if (file == null || !file.exists()) {
                    th = new FileNotFoundException();
                } else {
                    C153247av r2 = this.A07;
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    this.A03 = timeUnit.convert(r2.A01, r2.A02);
                    C153247av r22 = this.A07;
                    long convert = timeUnit.convert(r22.A00, r22.A02);
                    this.A01 = convert;
                    long j = this.A03;
                    if (j < 0) {
                        j = 0;
                    }
                    this.A03 = j;
                    if (convert <= 0) {
                        convert = TimeUnit.MILLISECONDS.toMicros(A04().A07);
                        this.A01 = convert;
                    }
                    long j2 = this.A03;
                    if (convert > j2) {
                        AnonymousClass7B8 r23 = new AnonymousClass7B8(new MediaExtractor());
                        this.A08 = r23;
                        r23.A00.setDataSource(this.A0B.getAbsolutePath());
                        ArrayList A0s = AnonymousClass001.A0s();
                        AnonymousClass7JU r7 = null;
                        try {
                            r8 = C159287lZ.A00(this.A08);
                        } catch (AnonymousClass6O0 e) {
                            AnonymousClass0x7.A1D(e, A0s);
                            r8 = null;
                        }
                        try {
                            AnonymousClass7B8 r24 = this.A08;
                            List<AnonymousClass7JU> A022 = C159287lZ.A02(r24, "video/");
                            if (!A022.isEmpty()) {
                                for (AnonymousClass7JU r1 : A022) {
                                    if (C162127rJ.A05(r1.A02)) {
                                        if (A022.size() > 1) {
                                            C159287lZ.A01(A022);
                                        }
                                        r7 = r1;
                                        if (r8 != null) {
                                            AnonymousClass0x2.A1I(C142366x5.AUDIO, this.A0C, r8.A00);
                                        }
                                        if (r7 != null) {
                                            AnonymousClass0x2.A1I(C142366x5.VIDEO, this.A0C, r7.A00);
                                        }
                                        C152527Zf r12 = this.A04;
                                        r12.A04 = A0s.toString();
                                        r12.A05 = this.A0C.toString();
                                        this.A0D = true;
                                        return;
                                    }
                                }
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Unsupported video codec. Contained ");
                                th2 = new AnonymousClass6O0(AnonymousClass000.A0X(C159287lZ.A01(A022), A0o));
                            } else {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("No video track exception. Track Info List: ");
                                th2 = new AnonymousClass6O3(AnonymousClass000.A0X(C159287lZ.A01(C159287lZ.A02(r24, "")), A0o2));
                            }
                            throw th2;
                        } catch (AnonymousClass6O0 | AnonymousClass6O3 e2) {
                            AnonymousClass0x7.A1D(e2, A0s);
                        }
                    } else {
                        Object[] A0M = AnonymousClass002.A0M();
                        AnonymousClass000.A1Q(A0M, 0, convert);
                        AnonymousClass000.A1Q(A0M, 1, j2);
                        C1445171w.A00("BaseMediaDemuxer", "setStartAndEndTime: MediaDemuxerException mEndTimeUs=%s, mStartTimeUs=%s", A0M);
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("End time is lesser than the start time. StartTimeUs : ");
                        A0o3.append(this.A03);
                        A0o3.append(", EndTimeUs = ");
                        th = new AnonymousClass6O2(AnonymousClass001.A0k(A0o3, this.A01));
                    }
                }
                throw th;
            } catch (IOException e3) {
                C1445171w.A00("BaseMediaDemuxer", "checkAndInitialize MediaDemuxerException=%s", e3);
                throw new AnonymousClass6O2("Failed to initialize", e3);
            }
        }
    }

    public boolean A08() {
        AnonymousClass7B8 r0 = this.A08;
        if (r0 == null || !r0.A00.advance()) {
            return false;
        }
        C153247av r4 = this.A07;
        long sampleTime = this.A08.A00.getSampleTime();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (sampleTime != -1) {
            long convert = timeUnit.convert(r4.A00, r4.A02);
            if (convert < 0 || sampleTime <= convert) {
                return true;
            }
        }
        this.A00++;
        return false;
    }

    public int A01(ByteBuffer byteBuffer) {
        AnonymousClass7B8 r0 = this.A08;
        if (r0 == null) {
            return -1;
        }
        long sampleTime = r0.A00.getSampleTime();
        C153247av r5 = this.A07;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        boolean z = false;
        if (sampleTime != -1) {
            long convert = timeUnit.convert(r5.A00, r5.A02);
            if (convert < 0 || sampleTime <= convert) {
                z = true;
            }
        }
        if (!z) {
            C152527Zf r52 = this.A04;
            if (r52.A01 != -1) {
                return -1;
            }
            r52.A01 = sampleTime;
            return -1;
        }
        if (!this.A07.A01(sampleTime, timeUnit)) {
            C153247av r02 = this.A07;
            if (sampleTime < timeUnit.convert(r02.A01, r02.A02)) {
                this.A04.A02 = sampleTime;
            }
        } else {
            C152527Zf r53 = this.A04;
            if (r53.A03 == -1) {
                r53.A03 = sampleTime;
            }
            r53.A00 = sampleTime;
        }
        return this.A08.A00.readSampleData(byteBuffer, 0);
    }

    public long A02() {
        AnonymousClass7B8 r0 = this.A08;
        if (r0 == null) {
            return -1;
        }
        long sampleTime = r0.A00.getSampleTime();
        if (this.A07.A01(sampleTime, TimeUnit.MICROSECONDS)) {
            return (sampleTime - this.A03) - this.A02;
        }
        if (sampleTime >= 0) {
            return -2;
        }
        return sampleTime;
    }

    public MediaFormat A03() {
        AnonymousClass7B8 r2 = this.A08;
        if (r2 == null) {
            return null;
        }
        try {
            return r2.A00.getTrackFormat(r2.A00.getSampleTrackIndex());
        } catch (Exception e) {
            C1445171w.A00("BaseMediaDemuxer", "getSampleMediaFormat: IllegalStateException=%s, getTrackInfos=%s", e, A00(this.A08).toString());
            throw new IllegalStateException(String.format(Locale.ROOT, "getSampleMediaFormat failed: %s, MediaDemuxerStats: %s", new Object[]{A00(this.A08), this.A04}), e);
        }
    }

    public C151307Uf A04() {
        C151307Uf r0 = this.A05;
        if (r0 == null) {
            try {
                r0 = this.A06.B2y(Uri.fromFile(this.A0B));
                this.A05 = r0;
                if (r0 == null) {
                    C1445171w.A00("BaseMediaDemuxer", "getMediaMetadata: Media metadata is null", new Object[0]);
                    throw new AnonymousClass6O2("Media metadata is null");
                }
            } catch (IOException e) {
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = e;
                C1445171w.A00("BaseMediaDemuxer", "getMediaMetadata: IOException=%s", A0L);
                throw new AnonymousClass6O2("Cannot extract metadata", e);
            }
        }
        return r0;
    }

    public void A06(long j) {
        long j2 = j + this.A03 + this.A02;
        if (this.A08 != null) {
            if (this.A07.A01(j2, TimeUnit.MICROSECONDS)) {
                AnonymousClass7B8 r3 = this.A08;
                int i = 0;
                if (j2 == 0) {
                    i = 2;
                }
                r3.A00.seekTo(j2, i);
            }
        }
    }

    public C160727oD(C180608lL r7, AnonymousClass720 r8, C151367Um r9) {
        this.A06 = r7;
        this.A0C = AnonymousClass001.A0t();
        this.A09 = r8;
        this.A04 = new C152527Zf();
        this.A0A = r9;
    }

    public static JSONObject A00(AnonymousClass7B8 r8) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            MediaExtractor mediaExtractor = r8.A00;
            A1G.put("sample-track-index", mediaExtractor.getSampleTrackIndex());
            A1G.put("track-count", mediaExtractor.getTrackCount());
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                Locale locale = Locale.ROOT;
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1P(A0L, i, 0);
                A1G.put(String.format(locale, "track-%d", A0L), trackFormat.toString());
            }
        } catch (Exception unused) {
        }
        return A1G;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C142366x5 r8) {
        /*
            r7 = this;
            r7.A05()
            java.util.HashMap r1 = r7.A0C
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x007f
            int r1 = X.AnonymousClass6C8.A0D(r8, r1)
            X.7B8 r0 = r7.A08
            android.media.MediaExtractor r0 = r0.A00
            r0.selectTrack(r1)
            X.7B8 r6 = r7.A08
            long r2 = r7.A03
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0022
            r1 = 2
        L_0x0022:
            android.media.MediaExtractor r0 = r6.A00
            r0.seekTo(r2, r1)
            X.7B8 r0 = r7.A08
            android.media.MediaExtractor r0 = r0.A00
            r0.getSampleTime()
        L_0x002e:
            X.7B8 r0 = r7.A08
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.7av r0 = r7.A07
            boolean r0 = r0.A01(r2, r1)
            if (r0 == 0) goto L_0x005a
            X.7B8 r0 = r7.A08
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            long r0 = r7.A03
            long r2 = r2 - r0
            long r0 = r7.A02
            long r0 = java.lang.Math.min(r2, r0)
            r7.A02 = r0
            X.7B8 r0 = r7.A08
            android.media.MediaExtractor r0 = r0.A00
            r0.getSampleTime()
        L_0x005a:
            long r3 = r7.A02
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            boolean r0 = r7.A08()
            if (r0 != 0) goto L_0x002e
        L_0x006b:
            r0 = 0
            r7.A00 = r0
            X.7B8 r6 = r7.A08
            long r2 = r7.A03
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x007a
            r1 = 2
        L_0x007a:
            android.media.MediaExtractor r0 = r6.A00
            r0.seekTo(r2, r1)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160727oD.A07(X.6x5):void");
    }
}
