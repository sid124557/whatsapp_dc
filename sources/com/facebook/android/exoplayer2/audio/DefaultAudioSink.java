package com.facebook.android.exoplayer2.audio;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.AnonymousClass7W3;
import X.AnonymousClass7XP;
import X.AnonymousClass80g;
import X.C125726Jd;
import X.C125756Jg;
import X.C125766Jh;
import X.C125786Jj;
import X.C143556z5;
import X.C143566z6;
import X.C1463379w;
import X.C1463479x;
import X.C148527Is;
import X.C149117Lc;
import X.C149127Ld;
import X.C150687Ru;
import X.C151337Ui;
import X.C157697ij;
import X.C157987jF;
import X.C158167jX;
import X.C158327jn;
import X.C159197lM;
import X.C1673480s;
import X.C1673580t;
import X.C173748Rn;
import X.C18270x1;
import X.C18300x5;
import X.C183678qR;
import X.C186578vb;
import X.C186588vc;
import X.C187048wM;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public final class DefaultAudioSink {
    public static AtomicInteger A0h = AnonymousClass6CA.A0d();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public AudioTrack A0B;
    public C158167jX A0C;
    public AnonymousClass80g A0D;
    public C183678qR A0E;
    public C151337Ui A0F;
    public C157697ij A0G;
    public C157697ij A0H;
    public C149127Ld A0I;
    public C149127Ld A0J;
    public AnonymousClass7W3 A0K;
    public ByteBuffer A0L;
    public ByteBuffer A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public C187048wM[] A0T;
    public ByteBuffer[] A0U;
    public final C158327jn A0V;
    public final AnonymousClass7XP A0W = new AnonymousClass7XP(new C1463479x(this));
    public final C125756Jg A0X;
    public final C186578vb A0Y;
    public final C149117Lc A0Z;
    public final C150687Ru A0a;
    public final C150687Ru A0b;
    public final C125766Jh A0c;
    public final C157987jF A0d;
    public final ArrayDeque A0e;
    public final C187048wM[] A0f;
    public final C187048wM[] A0g;

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0362, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0407, code lost:
        if (r3 == 11) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x040e, code lost:
        if (r3 != 11) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0413, code lost:
        if (r3 != 8) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r8 == r1) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(java.nio.ByteBuffer r26, long r27) {
        /*
            r25 = this;
            r7 = 1
            r6 = r25
            java.nio.ByteBuffer r1 = r6.A0L
            r12 = 0
            r8 = r26
            if (r1 == 0) goto L_0x000d
            r0 = 0
            if (r8 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            X.C159197lM.A01(r0)
            X.7ij r0 = r6.A0H
            r14 = 0
            r4 = r27
            if (r0 == 0) goto L_0x0070
            boolean r0 = r6.A0E()
            if (r0 == 0) goto L_0x04d3
            X.7ij r2 = r6.A0H
            X.7ij r3 = r6.A0G
            int r1 = r3.A04
            int r0 = r2.A04
            if (r1 != r0) goto L_0x0075
            int r1 = r3.A03
            int r0 = r2.A03
            if (r1 != r0) goto L_0x0075
            int r1 = r3.A06
            int r0 = r2.A06
            if (r1 != r0) goto L_0x0075
            int r1 = r3.A02
            int r0 = r2.A02
            if (r1 != r0) goto L_0x0075
            int r1 = r3.A05
            int r0 = r2.A05
            if (r1 != r0) goto L_0x0075
            r6.A0G = r2
            r6.A0H = r14
            android.media.AudioTrack r2 = r6.A0B
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x006d
            boolean r0 = r2.isOffloadedPlayback()
            if (r0 == 0) goto L_0x006d
            r1 = 3
            android.media.AudioTrack r0 = r6.A0B
            int r0 = r0.getPlayState()
            if (r0 != r1) goto L_0x0060
            android.media.AudioTrack r0 = r6.A0B
            r0.setOffloadEndOfStream()
        L_0x0060:
            android.media.AudioTrack r2 = r6.A0B
            X.7ij r0 = r6.A0G
            X.7z1 r0 = r0.A07
            int r1 = r0.A07
            int r0 = r0.A08
            r2.setOffloadDelayPadding(r1, r0)
        L_0x006d:
            r6.A07(r4)
        L_0x0070:
            android.media.AudioTrack r0 = r6.A0B
            if (r0 != 0) goto L_0x0178
            goto L_0x0082
        L_0x0075:
            r6.A06()
            boolean r0 = r6.A0D()
            if (r0 != 0) goto L_0x04d3
            r6.A04()
            goto L_0x006d
        L_0x0082:
            X.7jF r1 = r6.A0d     // Catch:{ 6z5 -> 0x016c }
            monitor-enter(r1)     // Catch:{ 6z5 -> 0x016c }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0169 }
            monitor-exit(r1)     // Catch:{ 6z5 -> 0x016c }
            if (r0 == 0) goto L_0x04d3
            boolean r0 = r6.A0N     // Catch:{ 6z5 -> 0x016c }
            if (r0 == 0) goto L_0x00d6
            X.7ij r0 = r6.A0G     // Catch:{ 6z5 -> 0x0098 }
            r0.getClass()     // Catch:{ 6z5 -> 0x0098 }
            android.media.AudioTrack r1 = r6.A02(r0)     // Catch:{ 6z5 -> 0x0098 }
            goto L_0x00dc
        L_0x0098:
            r10 = move-exception
            X.7ij r13 = r6.A0G     // Catch:{ 6z5 -> 0x016c }
            int r0 = r13.A00     // Catch:{ 6z5 -> 0x016c }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 <= r11) goto L_0x00d5
            X.7z1 r0 = r13.A07     // Catch:{ 6z5 -> 0x016c }
            r16 = r0
            int r0 = r13.A01     // Catch:{ 6z5 -> 0x016c }
            r18 = r0
            int r15 = r13.A04     // Catch:{ 6z5 -> 0x016c }
            int r9 = r13.A05     // Catch:{ 6z5 -> 0x016c }
            int r3 = r13.A06     // Catch:{ 6z5 -> 0x016c }
            int r2 = r13.A02     // Catch:{ 6z5 -> 0x016c }
            int r1 = r13.A03     // Catch:{ 6z5 -> 0x016c }
            X.8wM[] r13 = r13.A08     // Catch:{ 6z5 -> 0x016c }
            X.7ij r0 = new X.7ij     // Catch:{ 6z5 -> 0x016c }
            r17 = r13
            r19 = r15
            r20 = r9
            r21 = r3
            r22 = r2
            r23 = r1
            r24 = r11
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 6z5 -> 0x016c }
            android.media.AudioTrack r1 = r6.A02(r0)     // Catch:{ 6z5 -> 0x00d1 }
            r6.A0G = r0     // Catch:{ 6z5 -> 0x00d1 }
            goto L_0x00dc
        L_0x00d1:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch:{ 6z5 -> 0x016c }
        L_0x00d5:
            throw r10     // Catch:{ 6z5 -> 0x016c }
        L_0x00d6:
            X.7ij r0 = r6.A0G     // Catch:{ 6z5 -> 0x016c }
            android.media.AudioTrack r1 = r6.A02(r0)     // Catch:{ 6z5 -> 0x016c }
        L_0x00dc:
            r6.A0B = r1     // Catch:{ 6z5 -> 0x016c }
            int r3 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 6z5 -> 0x016c }
            r0 = 29
            if (r3 < r0) goto L_0x00fc
            boolean r0 = r1.isOffloadedPlayback()     // Catch:{ 6z5 -> 0x016c }
            if (r0 == 0) goto L_0x00fc
            android.media.AudioTrack r0 = r6.A0B     // Catch:{ 6z5 -> 0x016c }
            r6.A09(r0)     // Catch:{ 6z5 -> 0x016c }
            android.media.AudioTrack r2 = r6.A0B     // Catch:{ 6z5 -> 0x016c }
            X.7ij r0 = r6.A0G     // Catch:{ 6z5 -> 0x016c }
            X.7z1 r0 = r0.A07     // Catch:{ 6z5 -> 0x016c }
            int r1 = r0.A07     // Catch:{ 6z5 -> 0x016c }
            int r0 = r0.A08     // Catch:{ 6z5 -> 0x016c }
            r2.setOffloadDelayPadding(r1, r0)     // Catch:{ 6z5 -> 0x016c }
        L_0x00fc:
            android.media.AudioTrack r0 = r6.A0B     // Catch:{ 6z5 -> 0x016c }
            int r0 = r0.getAudioSessionId()     // Catch:{ 6z5 -> 0x016c }
            r6.A01 = r0     // Catch:{ 6z5 -> 0x016c }
            X.7XP r11 = r6.A0W     // Catch:{ 6z5 -> 0x016c }
            android.media.AudioTrack r9 = r6.A0B     // Catch:{ 6z5 -> 0x016c }
            X.7ij r0 = r6.A0G     // Catch:{ 6z5 -> 0x016c }
            int r2 = r0.A03     // Catch:{ 6z5 -> 0x016c }
            int r10 = r0.A05     // Catch:{ 6z5 -> 0x016c }
            int r1 = r0.A00     // Catch:{ 6z5 -> 0x016c }
            r11.A0G = r9     // Catch:{ 6z5 -> 0x016c }
            r11.A00 = r1     // Catch:{ 6z5 -> 0x016c }
            X.7Tz r0 = new X.7Tz     // Catch:{ 6z5 -> 0x016c }
            r0.<init>(r9)     // Catch:{ 6z5 -> 0x016c }
            r11.A0H = r0     // Catch:{ 6z5 -> 0x016c }
            int r9 = r9.getSampleRate()     // Catch:{ 6z5 -> 0x016c }
            r11.A02 = r9     // Catch:{ 6z5 -> 0x016c }
            r0 = 23
            if (r3 >= r0) goto L_0x012d
            r0 = 5
            if (r2 == r0) goto L_0x012b
            r0 = 6
            if (r2 != r0) goto L_0x012d
        L_0x012b:
            r0 = 1
            goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            r11.A0L = r0     // Catch:{ 6z5 -> 0x016c }
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0C(r2)     // Catch:{ 6z5 -> 0x016c }
            r11.A0K = r0     // Catch:{ 6z5 -> 0x016c }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014b
        L_0x0144:
            int r1 = r1 / r10
            long r0 = X.AnonymousClass6CA.A0G(r1)     // Catch:{ 6z5 -> 0x016c }
            long r9 = (long) r9     // Catch:{ 6z5 -> 0x016c }
            long r0 = r0 / r9
        L_0x014b:
            r11.A04 = r0     // Catch:{ 6z5 -> 0x016c }
            r0 = 0
            r11.A09 = r0     // Catch:{ 6z5 -> 0x016c }
            r11.A0C = r0     // Catch:{ 6z5 -> 0x016c }
            r11.A0B = r0     // Catch:{ 6z5 -> 0x016c }
            r11.A0J = r12     // Catch:{ 6z5 -> 0x016c }
            r11.A0F = r2     // Catch:{ 6z5 -> 0x016c }
            r11.A06 = r2     // Catch:{ 6z5 -> 0x016c }
            r11.A0A = r0     // Catch:{ 6z5 -> 0x016c }
            android.media.AudioTrack r1 = r6.A0B     // Catch:{ 6z5 -> 0x016c }
            if (r1 == 0) goto L_0x0166
            float r0 = r6.A00     // Catch:{ 6z5 -> 0x016c }
            r1.setVolume(r0)     // Catch:{ 6z5 -> 0x016c }
        L_0x0166:
            r6.A0Q = r7     // Catch:{ 6z5 -> 0x016c }
            goto L_0x0178
        L_0x0169:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 6z5 -> 0x016c }
            throw r0     // Catch:{ 6z5 -> 0x016c }
        L_0x016c:
            r1 = move-exception
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x0177
            X.7Ru r0 = r6.A0a
            r0.A00(r1)
            return r12
        L_0x0177:
            throw r1
        L_0x0178:
            X.7Ru r0 = r6.A0a
            r0.A01 = r14
            boolean r0 = r6.A0Q
            r17 = 0
            if (r0 == 0) goto L_0x01aa
            r0 = r17
            long r0 = java.lang.Math.max(r0, r4)
            r6.A06 = r0
            r6.A0R = r12
            r6.A0Q = r12
            r6.A07(r4)
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x01aa
            r6.A0P = r7
            android.media.AudioTrack r0 = r6.A0B
            if (r0 == 0) goto L_0x01aa
            X.7XP r0 = r6.A0W
            X.7Tz r0 = r0.A0H
            r0.getClass()
            r0.A00(r12)
            android.media.AudioTrack r0 = r6.A0B
            r0.play()
        L_0x01aa:
            X.7XP r9 = r6.A0W
            long r0 = r6.A00()
            android.media.AudioTrack r2 = r9.A0G
            r2.getClass()
            int r3 = r2.getPlayState()
            boolean r2 = r9.A0L
            if (r2 == 0) goto L_0x01ce
            r2 = 2
            if (r3 != r2) goto L_0x01c3
            r9.A0J = r12
            return r12
        L_0x01c3:
            if (r3 != r7) goto L_0x01ce
            long r10 = r9.A00()
            int r2 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x01ce
            return r12
        L_0x01ce:
            boolean r2 = r9.A0J
            boolean r0 = r9.A01(r0)
            r9.A0J = r0
            if (r2 == 0) goto L_0x01fb
            if (r0 != 0) goto L_0x01fb
            if (r3 == r7) goto L_0x01fb
            X.79x r3 = r9.A0M
            int r2 = r9.A00
            long r0 = r9.A04
            long r21 = com.facebook.android.exoplayer2.util.Util.A05(r0)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r3.A00
            X.8qR r3 = r0.A0E
            if (r3 == 0) goto L_0x01fb
            long r23 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.A05
            long r23 = r23 - r0
            r20 = r2
            r19 = r3
            r19.Ber(r20, r21, r23)
        L_0x01fb:
            java.nio.ByteBuffer r0 = r6.A0L
            if (r0 != 0) goto L_0x048c
            java.nio.ByteOrder r1 = r8.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            X.C159197lM.A01(r0)
            boolean r0 = r8.hasRemaining()
            if (r0 == 0) goto L_0x04d2
            X.7ij r1 = r6.A0G
            int r0 = r1.A04
            if (r0 == 0) goto L_0x0418
            int r0 = r6.A03
            if (r0 != 0) goto L_0x0418
            int r2 = r1.A03
            r10 = -1
            switch(r2) {
                case 5: goto L_0x0231;
                case 6: goto L_0x0231;
                case 7: goto L_0x026d;
                case 8: goto L_0x026d;
                case 9: goto L_0x02c6;
                case 10: goto L_0x030e;
                case 11: goto L_0x0312;
                case 12: goto L_0x0312;
                case 13: goto L_0x0222;
                case 14: goto L_0x0316;
                case 15: goto L_0x022d;
                case 16: goto L_0x030e;
                case 17: goto L_0x0365;
                case 18: goto L_0x0231;
                default: goto L_0x0222;
            }
        L_0x0222:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r2)
            throw r0
        L_0x022d:
            r15 = 512(0x200, float:7.175E-43)
            goto L_0x03e7
        L_0x0231:
            int r0 = r8.position()
            int r0 = r0 + 5
            byte r0 = r8.get(r0)
            r2 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r2 = r2 >> r1
            r0 = 10
            if (r2 <= r0) goto L_0x0269
            int r0 = r8.position()
            int r0 = r0 + 4
            byte r0 = r8.get(r0)
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            if (r0 == r1) goto L_0x0261
            int r0 = r8.position()
            int r0 = r0 + 4
            byte r0 = r8.get(r0)
            r0 = r0 & 48
            int r1 = r0 >> 4
        L_0x0261:
            int[] r0 = X.C1461678x.A00
            r0 = r0[r1]
            int r15 = r0 * 256
            goto L_0x03e7
        L_0x0269:
            r15 = 1536(0x600, float:2.152E-42)
            goto L_0x03e7
        L_0x026d:
            int r1 = r8.position()
            byte r2 = r8.get(r1)
            r0 = -2
            if (r2 == r0) goto L_0x02b9
            if (r2 == r10) goto L_0x0299
            r0 = 31
            if (r2 == r0) goto L_0x02a6
            int r0 = r1 + 4
            byte r0 = r8.get(r0)
            r0 = r0 & 1
            int r2 = r0 << 6
            int r0 = r1 + 5
        L_0x028a:
            byte r0 = r8.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
        L_0x0290:
            int r0 = r0 >> 2
            r0 = r0 | r2
            int r0 = r0 + 1
            int r15 = r0 * 32
            goto L_0x03e7
        L_0x0299:
            int r0 = r1 + 4
            byte r0 = r8.get(r0)
            r0 = r0 & 7
            int r2 = r0 << 4
            int r0 = r1 + 7
            goto L_0x02b2
        L_0x02a6:
            int r0 = r1 + 5
            byte r0 = r8.get(r0)
            r0 = r0 & 7
            int r2 = r0 << 4
            int r0 = r1 + 6
        L_0x02b2:
            byte r0 = r8.get(r0)
            r0 = r0 & 60
            goto L_0x0290
        L_0x02b9:
            int r0 = r1 + 5
            byte r0 = r8.get(r0)
            r0 = r0 & 1
            int r2 = r0 << 6
            int r0 = r1 + 4
            goto L_0x028a
        L_0x02c6:
            int r0 = r8.position()
            int r13 = X.AnonymousClass6C9.A0D(r8, r0)
            r1 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r13 & r1
            if (r0 != r1) goto L_0x0309
            int r0 = r13 >>> 19
            r3 = 3
            r10 = r0 & 3
            if (r10 == r7) goto L_0x0309
            int r0 = r13 >>> 17
            r2 = r0 & 3
            if (r2 == 0) goto L_0x0309
            int r0 = r13 >>> 12
            r11 = 15
            r1 = r0 & 15
            int r0 = r13 >>> 10
            r0 = r0 & 3
            if (r1 == 0) goto L_0x0309
            if (r1 == r11) goto L_0x0309
            if (r0 == r3) goto L_0x0309
            r15 = 1152(0x480, float:1.614E-42)
            if (r2 == r7) goto L_0x0303
            r0 = 2
            if (r2 == r0) goto L_0x03e7
            if (r2 != r3) goto L_0x02fe
            r15 = 384(0x180, float:5.38E-43)
            goto L_0x03e7
        L_0x02fe:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x0303:
            if (r10 == r3) goto L_0x03e7
            r15 = 576(0x240, float:8.07E-43)
            goto L_0x03e7
        L_0x0309:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x030e:
            r15 = 1024(0x400, float:1.435E-42)
            goto L_0x03e7
        L_0x0312:
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x03e7
        L_0x0316:
            int r11 = r8.position()
            int r0 = r8.limit()
            int r2 = r0 + -10
            r3 = r11
        L_0x0321:
            if (r3 > r2) goto L_0x0362
            int r0 = r3 + 4
            int r0 = X.AnonymousClass6C9.A0D(r8, r0)
            r1 = r0 & -2
            r0 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r1 != r0) goto L_0x035f
            int r3 = r3 - r11
            if (r3 == r10) goto L_0x0362
            int r0 = r8.position()
            int r0 = r0 + r3
            int r0 = r0 + 7
            int r1 = X.AnonymousClass6CA.A08(r8, r0)
            r0 = 187(0xbb, float:2.62E-43)
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            int r1 = r8.position()
            int r1 = r1 + r3
            r0 = 8
            if (r2 == 0) goto L_0x034f
            r0 = 9
        L_0x034f:
            int r1 = r1 + r0
            byte r0 = r8.get(r1)
            int r0 = r0 >> 4
            r1 = r0 & 7
            r0 = 40
            int r0 = r0 << r1
            int r15 = r0 * 16
            goto L_0x03e7
        L_0x035f:
            int r3 = r3 + 1
            goto L_0x0321
        L_0x0362:
            r15 = 0
            goto L_0x03e7
        L_0x0365:
            r0 = 16
            byte[] r1 = new byte[r0]
            int r0 = r8.position()
            r8.get(r1)
            r8.position(r0)
            X.7k6 r3 = new X.7k6
            r3.<init>(r1)
            r0 = 16
            r3.A00(r0)
            int r1 = r3.A00(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r13 = 4
            if (r1 != r0) goto L_0x038c
            r0 = 24
            r3.A00(r0)
        L_0x038c:
            r11 = 2
            int r0 = r3.A00(r11)
            r10 = 3
            if (r0 != r10) goto L_0x039d
        L_0x0394:
            r3.A00(r11)
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x0394
        L_0x039d:
            r0 = 10
            int r16 = r3.A00(r0)
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x03c7
            int r0 = r3.A00(r10)
            if (r0 <= 0) goto L_0x03c7
            int r2 = r3.A02
            r3.A02 = r2
            int r0 = r3.A00
            int r1 = r0 + 2
            r3.A00 = r1
            r0 = 7
            if (r1 <= r0) goto L_0x03c4
            int r0 = r2 + 1
            r3.A02 = r0
            int r0 = r1 + -8
            r3.A00 = r0
        L_0x03c4:
            r3.A01()
        L_0x03c7:
            boolean r15 = r3.A02()
            r2 = 48000(0xbb80, float:6.7262E-41)
            r1 = 44100(0xac44, float:6.1797E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r15 == 0) goto L_0x03d9
            r0 = 48000(0xbb80, float:6.7262E-41)
        L_0x03d9:
            int r3 = r3.A00(r13)
            if (r0 != r1) goto L_0x03ec
            r0 = 13
            if (r3 != r0) goto L_0x0416
            int[] r0 = X.C154587dQ.A00
            r15 = r0[r3]
        L_0x03e7:
            r6.A03 = r15
            if (r15 != 0) goto L_0x0418
            return r7
        L_0x03ec:
            if (r0 != r2) goto L_0x0416
            int[] r1 = X.C154587dQ.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0416
            r15 = r1[r3]
            int r2 = r16 % 5
            r1 = 8
            if (r2 == r7) goto L_0x0411
            r0 = 11
            if (r2 == r11) goto L_0x040c
            if (r2 == r10) goto L_0x0411
            if (r2 != r13) goto L_0x03e7
            if (r3 == r10) goto L_0x0409
            if (r3 == r1) goto L_0x0409
            if (r3 != r0) goto L_0x03e7
        L_0x0409:
            int r15 = r15 + 1
            goto L_0x03e7
        L_0x040c:
            if (r3 == r1) goto L_0x0409
            if (r3 != r0) goto L_0x03e7
            goto L_0x0409
        L_0x0411:
            if (r3 == r10) goto L_0x0409
            if (r3 != r1) goto L_0x03e7
            goto L_0x0409
        L_0x0416:
            r15 = 0
            goto L_0x03e7
        L_0x0418:
            X.7Ld r0 = r6.A0I
            if (r0 == 0) goto L_0x0427
            boolean r0 = r6.A0E()
            if (r0 == 0) goto L_0x04d3
            r6.A07(r4)
            r6.A0I = r14
        L_0x0427:
            long r0 = r6.A06
            X.7ij r13 = r6.A0G
            int r2 = r13.A04
            if (r2 != 0) goto L_0x04a7
            long r2 = r6.A08
            int r10 = r13.A01
            long r10 = (long) r10
            long r2 = r2 / r10
        L_0x0435:
            X.6Jh r10 = r6.A0c
            long r10 = r10.A04
            long r2 = r2 - r10
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r10
            X.7z1 r10 = r13.A07
            int r10 = r10.A0F
            long r10 = (long) r10
            long r2 = r2 / r10
            long r0 = r0 + r2
            boolean r2 = r6.A0R
            if (r2 != 0) goto L_0x045b
            long r15 = X.AnonymousClass6C9.A0N(r0, r4)
            r10 = 200000(0x30d40, double:9.8813E-319)
            int r2 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0478
            X.6z3 r2 = new X.6z3
            r2.<init>(r4, r0)
            r6.A0R = r7
        L_0x045b:
            boolean r2 = r6.A0E()
            if (r2 == 0) goto L_0x04d3
            long r2 = r27 - r0
            long r0 = r6.A06
            long r0 = r0 + r2
            r6.A06 = r0
            r6.A0R = r12
            r6.A07(r4)
            X.8qR r1 = r6.A0E
            if (r1 == 0) goto L_0x0478
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0478
            r1.BYR()
        L_0x0478:
            X.7ij r0 = r6.A0G
            int r0 = r0.A04
            if (r0 != 0) goto L_0x049c
            long r0 = r6.A08
            int r2 = r8.remaining()
            long r2 = (long) r2
            long r0 = r0 + r2
            r6.A08 = r0
        L_0x0488:
            r6.A0L = r8
            r6.A04 = r7
        L_0x048c:
            r6.A08(r4)
            java.nio.ByteBuffer r0 = r6.A0L
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x04aa
            r6.A0L = r14
            r6.A04 = r12
            return r7
        L_0x049c:
            long r2 = r6.A07
            int r0 = r6.A03
            long r0 = (long) r0
            long r10 = (long) r7
            long r0 = r0 * r10
            long r2 = r2 + r0
            r6.A07 = r2
            goto L_0x0488
        L_0x04a7:
            long r2 = r6.A07
            goto L_0x0435
        L_0x04aa:
            long r10 = r6.A00()
            long r1 = r9.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x04d3
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x04d3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04d3
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "Resetting stalled audio track"
            android.util.Log.w(r1, r0)
            r6.A04()
        L_0x04d2:
            return r7
        L_0x04d3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0G(java.nio.ByteBuffer, long):boolean");
    }

    @Deprecated
    public DefaultAudioSink(C187048wM[] r9) {
        C148527Is r1 = new C148527Is();
        r1.A00 = C158327jn.A01;
        r9.getClass();
        C149117Lc r6 = new C149117Lc(r9);
        r1.A02 = r6;
        this.A0V = r1.A00;
        this.A0Z = r6;
        this.A0Y = r1.A01;
        C157987jF r0 = new C157987jF(C186588vc.A00);
        this.A0d = r0;
        r0.A01();
        C125756Jg r4 = new C125756Jg();
        this.A0X = r4;
        C125766Jh r3 = new C125766Jh();
        this.A0c = r3;
        ArrayList A0s = AnonymousClass001.A0s();
        C1673580t[] r12 = new C1673580t[3];
        r12[0] = new C125726Jd();
        C18300x5.A1K(r4, r3, r12);
        Collections.addAll(A0s, r12);
        Collections.addAll(A0s, r6.A03);
        this.A0g = (C187048wM[]) A0s.toArray(new C187048wM[0]);
        this.A0f = new C187048wM[]{new C125786Jj()};
        this.A00 = 1.0f;
        this.A0D = AnonymousClass80g.A02;
        this.A01 = 0;
        this.A0F = new C151337Ui();
        C158167jX r2 = C158167jX.A05;
        this.A0J = new C149127Ld(r2, 0, 0, false);
        this.A0C = r2;
        this.A02 = -1;
        this.A0T = new C187048wM[0];
        this.A0U = new ByteBuffer[0];
        this.A0e = AnonymousClass6CA.A0a();
        this.A0a = new C150687Ru();
        this.A0b = new C150687Ru();
    }

    public final long A00() {
        C157697ij r1 = this.A0G;
        if (r1.A04 == 0) {
            return this.A0A / ((long) r1.A05);
        }
        return this.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (r17 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r17 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r17 == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(boolean r22) {
        /*
            r21 = this;
            r14 = r21
            android.media.AudioTrack r0 = r14.A0B
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r14.A0Q
            if (r0 != 0) goto L_0x02c7
            X.7XP r9 = r14.A0W
            android.media.AudioTrack r0 = r9.A0G
            r0.getClass()
            int r0 = r0.getPlayState()
            r13 = 3
            if (r0 != r13) goto L_0x01c0
            long r4 = r9.A00()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r4 = r4 / r0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
            long r0 = java.lang.System.nanoTime()
            long r2 = X.C18290x4.A0B(r0)
            long r0 = r9.A08
            long r15 = r2 - r0
            r10 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long[] r11 = r9.A0N
            int r8 = r9.A01
            long r0 = r4 - r2
            r11[r8] = r0
            int r1 = r8 + 1
            r0 = 10
            int r1 = r1 % r0
            r9.A01 = r1
            int r10 = r9.A03
            if (r10 >= r0) goto L_0x0053
            int r10 = r10 + 1
            r9.A03 = r10
        L_0x0053:
            r9.A08 = r2
            r9.A0D = r6
            r8 = 0
        L_0x0058:
            if (r8 >= r10) goto L_0x0064
            r15 = r11[r8]
            long r0 = (long) r10
            long r15 = r15 / r0
            long r6 = r6 + r15
            r9.A0D = r6
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0064:
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x01c0
            X.7Tz r8 = r9.A0H
            r8.getClass()
            X.7NP r12 = r8.A05
            long r0 = r8.A03
            long r10 = r2 - r0
            long r0 = r8.A04
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00b2
            r8.A03 = r2
            android.media.AudioTrack r0 = r12.A04
            android.media.AudioTimestamp r10 = r12.A03
            boolean r17 = r0.getTimestamp(r10)
            if (r17 == 0) goto L_0x009e
            long r6 = r10.framePosition
            long r0 = r12.A01
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x0094
            long r0 = r12.A02
            r15 = 1
            long r0 = r0 + r15
            r12.A02 = r0
        L_0x0094:
            r12.A01 = r6
            long r0 = r12.A02
            r11 = 32
            long r0 = r0 << r11
            long r6 = r6 + r0
            r12.A00 = r6
        L_0x009e:
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00ca
            r11 = 2
            if (r0 == r6) goto L_0x00e0
            if (r0 == r11) goto L_0x00c7
            if (r0 != r13) goto L_0x00b0
            if (r17 == 0) goto L_0x00b2
        L_0x00ac:
            r0 = 0
            r8.A00(r0)
        L_0x00b0:
            if (r17 != 0) goto L_0x00ed
        L_0x00b2:
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x01c0
            java.lang.reflect.Method r8 = r9.A0I
            if (r8 == 0) goto L_0x01c0
            long r0 = r9.A07
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01c0
            goto L_0x0180
        L_0x00c7:
            if (r17 != 0) goto L_0x00ed
            goto L_0x00ac
        L_0x00ca:
            if (r17 == 0) goto L_0x0170
            long r0 = r10.nanoTime
            long r15 = X.C18290x4.A0B(r0)
            long r0 = r8.A02
            int r7 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00b2
            long r0 = r12.A00
            r8.A01 = r0
            r8.A00(r6)
            goto L_0x00ed
        L_0x00e0:
            if (r17 == 0) goto L_0x00ac
            long r6 = r12.A00
            long r0 = r8.A01
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ed
            r8.A00(r11)
        L_0x00ed:
            long r0 = r10.nanoTime
            long r10 = X.C18290x4.A0B(r0)
            long r6 = r12.A00
            long r12 = X.AnonymousClass6C9.A0N(r10, r2)
            r15 = 5000000(0x4c4b40, double:2.470328E-317)
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
            X.79x r1 = r9.A0M
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Spurious audio timestamp (system clock mismatch): "
        L_0x0108:
            r12.append(r0)
            r12.append(r6)
            java.lang.String r6 = ", "
            r12.append(r6)
            r12.append(r10)
            r12.append(r6)
            r12.append(r2)
            r12.append(r6)
            r12.append(r4)
            r12.append(r6)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r7 = r1.A00
            X.7ij r4 = r7.A0G
            int r0 = r4.A04
            if (r0 != 0) goto L_0x014c
            long r0 = r7.A08
            int r4 = r4.A01
            long r4 = (long) r4
            long r0 = r0 / r4
        L_0x0133:
            r12.append(r0)
            r12.append(r6)
            long r0 = r7.A00()
            java.lang.String r1 = X.AnonymousClass001.A0k(r12, r0)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
            r0 = 4
        L_0x0147:
            r8.A00(r0)
            goto L_0x00b2
        L_0x014c:
            long r0 = r7.A07
            goto L_0x0133
        L_0x014f:
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r6 * r12
            int r12 = r9.A02
            long r12 = (long) r12
            long r0 = r0 / r12
            long r12 = X.AnonymousClass6C9.A0N(r0, r4)
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0169
            X.79x r1 = r9.A0M
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Spurious audio timestamp (frame position mismatch): "
            goto L_0x0108
        L_0x0169:
            int r1 = r8.A00
            r0 = 4
            if (r1 != r0) goto L_0x00b2
            r0 = 0
            goto L_0x0147
        L_0x0170:
            long r0 = r8.A02
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            r8.A00(r13)
            goto L_0x00b2
        L_0x0180:
            android.media.AudioTrack r1 = r9.A0G     // Catch:{ Exception -> 0x01bb }
            r1.getClass()     // Catch:{ Exception -> 0x01bb }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0U()     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r0 = r8.invoke(r1, r0)     // Catch:{ Exception -> 0x01bb }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x01bb }
            long r0 = X.C18290x4.A0A(r0)     // Catch:{ Exception -> 0x01bb }
            long r4 = r9.A04     // Catch:{ Exception -> 0x01bb }
            long r0 = r0 - r4
            r9.A0A = r0     // Catch:{ Exception -> 0x01bb }
            r4 = 0
            long r0 = java.lang.Math.max(r0, r4)     // Catch:{ Exception -> 0x01bb }
            r9.A0A = r0     // Catch:{ Exception -> 0x01bb }
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01be
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r6, r7, r0)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x01bb }
            r9.A0A = r4     // Catch:{ Exception -> 0x01bb }
            goto L_0x01be
        L_0x01bb:
            r0 = 0
            r9.A0I = r0
        L_0x01be:
            r9.A07 = r2
        L_0x01c0:
            long r0 = java.lang.System.nanoTime()
            long r6 = X.C18290x4.A0B(r0)
            X.7Tz r1 = r9.A0H
            r1.getClass()
            int r5 = r1.A00
            r0 = 1
            if (r5 == r0) goto L_0x021e
            r0 = 2
            if (r5 == r0) goto L_0x021e
            int r0 = r9.A03
            if (r0 != 0) goto L_0x0219
            long r2 = r9.A00()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
        L_0x01e5:
            if (r22 != 0) goto L_0x01ea
            long r0 = r9.A0A
            long r2 = r2 - r0
        L_0x01ea:
            X.7ij r6 = r14.A0G
            long r4 = r14.A00()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r7 = java.lang.Math.min(r2, r4)
        L_0x01fc:
            java.util.ArrayDeque r3 = r14.A0e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0238
            java.lang.Object r0 = r3.getFirst()
            X.7Ld r0 = (X.C149127Ld) r0
            long r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0238
            java.lang.Object r0 = r3.remove()
            X.7Ld r0 = (X.C149127Ld) r0
            r14.A0J = r0
            goto L_0x01fc
        L_0x0219:
            long r0 = r9.A0D
            long r2 = r6 + r0
            goto L_0x01e5
        L_0x021e:
            X.7NP r4 = r1.A05
            long r2 = r4.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
            r0 = 2
            if (r5 != r0) goto L_0x01ea
            android.media.AudioTimestamp r0 = r4.A03
            long r0 = r0.nanoTime
            long r0 = X.C18290x4.A0B(r0)
            long r6 = r6 - r0
            long r2 = r2 + r6
            goto L_0x01ea
        L_0x0238:
            X.7Ld r2 = r14.A0J
            long r0 = r2.A00
            long r15 = r7 - r0
            X.7jX r1 = r2.A02
            X.7jX r0 = X.C158167jX.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x025d
            long r2 = r2.A01
            long r2 = r2 + r15
        L_0x024b:
            X.7ij r6 = r14.A0G
            X.7Lc r0 = r14.A0Z
            X.6Ji r0 = r0.A00
            long r4 = r0.A04
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 + r4
            return r2
        L_0x025d:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02a7
            X.7Lc r0 = r14.A0Z
            X.80s r2 = r0.A01
            long r5 = r2.A03
            r3 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02a0
            long r4 = r2.A02
            X.7b5 r0 = r2.A08
            r0.getClass()
            int r1 = r0.A00
            int r0 = r0.A0G
            int r1 = r1 * r0
            int r0 = r1 * 2
            long r0 = (long) r0
            long r4 = r4 - r0
            X.7kA r0 = r2.A05
            int r1 = r0.A03
            X.7kA r0 = r2.A04
            int r6 = r0.A03
            if (r1 != r6) goto L_0x0299
            long r2 = r2.A03
        L_0x028b:
            r17 = r4
            r19 = r2
            long r4 = com.facebook.android.exoplayer2.util.Util.A07(r15, r17, r19)
        L_0x0293:
            X.7Ld r0 = r14.A0J
            long r2 = r0.A01
            long r2 = r2 + r4
            goto L_0x024b
        L_0x0299:
            long r0 = (long) r1
            long r4 = r4 * r0
            long r2 = r2.A03
            long r0 = (long) r6
            long r2 = r2 * r0
            goto L_0x028b
        L_0x02a0:
            float r0 = r2.A01
            double r2 = (double) r0
            double r0 = (double) r15
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x0293
        L_0x02a7:
            java.lang.Object r6 = r3.getFirst()
            X.7Ld r6 = (X.C149127Ld) r6
            long r4 = r6.A00
            long r4 = r4 - r7
            X.7Ld r0 = r14.A0J
            X.7jX r0 = r0.A02
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02c3
            double r2 = (double) r4
            double r0 = (double) r1
            double r2 = r2 * r0
            long r4 = java.lang.Math.round(r2)
        L_0x02c3:
            long r2 = r6.A01
            long r2 = r2 - r4
            goto L_0x024b
        L_0x02c7:
            r2 = -9223372036854775808
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A01(boolean):long");
    }

    public final AudioTrack A02(C157697ij r13) {
        AudioTrack audioTrack;
        try {
            AnonymousClass80g r2 = this.A0D;
            int i = this.A01;
            if (Util.A00 >= 29) {
                audioTrack = r13.A00(r2, i);
            } else {
                C1463379w r0 = r2.A00;
                if (r0 == null) {
                    r0 = new C1463379w(r2);
                    r2.A00 = r0;
                }
                audioTrack = new AudioTrack(r0.A00, AnonymousClass6C8.A0U(r13.A06, r13.A02, r13.A03), r13.A00, 1, i);
            }
            AtomicInteger atomicInteger = A0h;
            atomicInteger.incrementAndGet();
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
                atomicInteger.decrementAndGet();
            } catch (Exception e) {
                Object[] A0M2 = AnonymousClass002.A0M();
                C18270x1.A1Q(A0M2, state);
                AnonymousClass000.A1P(A0M2, atomicInteger.get(), 1);
                Log.e("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", A0M2), e);
            }
            int i2 = r13.A06;
            int i3 = r13.A02;
            int i4 = r13.A00;
            throw new C143556z5(r13.A07, state, i2, i3, i4, atomicInteger.get(), AnonymousClass6C9.A1M(r13.A04));
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            int i5 = r13.A06;
            int i6 = r13.A02;
            int i7 = r13.A00;
            throw new C143556z5(r13.A07, 0, i5, i6, i7, A0h.get(), AnonymousClass001.A1T(r13.A04));
        } catch (C143556z5 e2) {
            throw e2;
        }
    }

    public final C149127Ld A03() {
        C149127Ld r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        ArrayDeque arrayDeque = this.A0e;
        if (!arrayDeque.isEmpty()) {
            return (C149127Ld) arrayDeque.getLast();
        }
        return this.A0J;
    }

    public void A04() {
        if (this.A0B != null) {
            this.A08 = 0;
            this.A07 = 0;
            this.A0A = 0;
            this.A09 = 0;
            int i = 0;
            this.A03 = 0;
            this.A0J = new C149127Ld(A03().A02, 0, 0, A03().A03);
            this.A06 = 0;
            this.A0I = null;
            this.A0e.clear();
            this.A0L = null;
            this.A04 = 0;
            this.A0M = null;
            this.A0S = false;
            this.A0O = false;
            this.A02 = -1;
            this.A0c.A04 = 0;
            while (true) {
                C187048wM[] r1 = this.A0T;
                if (i >= r1.length) {
                    break;
                }
                C187048wM r0 = r1[i];
                r0.flush();
                this.A0U[i] = r0.BAF();
                i++;
            }
            AnonymousClass7XP r3 = this.A0W;
            AudioTrack audioTrack = r3.A0G;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A0B.pause();
            }
            AudioTrack audioTrack2 = this.A0B;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                AnonymousClass7W3 r12 = this.A0K;
                r12.getClass();
                r12.A01(this.A0B);
            }
            AudioTrack audioTrack3 = this.A0B;
            this.A0B = null;
            C157697ij r02 = this.A0H;
            if (r02 != null) {
                this.A0G = r02;
                this.A0H = null;
            }
            r3.A0D = 0;
            r3.A03 = 0;
            r3.A01 = 0;
            r3.A08 = 0;
            r3.A0G = null;
            r3.A0H = null;
            this.A0d.A00();
            new C173748Rn(audioTrack3, this).start();
        }
        this.A0b.A01 = null;
        this.A0a.A01 = null;
    }

    public void A05() {
        if (!this.A0O && this.A0B != null && A0E()) {
            A06();
            this.A0O = true;
        }
    }

    public final void A06() {
        if (!this.A0S) {
            this.A0S = true;
            AnonymousClass7XP r4 = this.A0W;
            long A002 = A00();
            r4.A0E = r4.A00();
            r4.A0F = AnonymousClass6C8.A0L();
            r4.A05 = A002;
            this.A0B.stop();
        }
    }

    public final void A07(long j) {
        C158167jX r5;
        boolean z;
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            C149117Lc r4 = this.A0Z;
            r5 = A03().A02;
            C1673480s r3 = r4.A01;
            float f = r5.A01;
            if (r3.A01 != f) {
                r3.A01 = f;
                r3.A0D = true;
            }
            float f2 = r5.A00;
            if (r3.A00 != f2) {
                r3.A00 = f2;
                r3.A0D = true;
            }
            r4.A02.A00 = r5.A03;
        } else {
            r5 = C158167jX.A05;
        }
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            C149117Lc r1 = this.A0Z;
            z = A03().A03;
            r1.A00.A05 = z;
        } else {
            z = false;
        }
        this.A0e.add(new C149127Ld(r5, Math.max(0, j), (A00() * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0G.A06), z));
        C187048wM[] r52 = this.A0G.A08;
        ArrayList A0s = AnonymousClass001.A0s();
        for (C187048wM r12 : r52) {
            if (r12.BGz()) {
                A0s.add(r12);
            } else {
                r12.flush();
            }
        }
        int size = A0s.size();
        this.A0T = (C187048wM[]) A0s.toArray(new C187048wM[size]);
        this.A0U = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C187048wM[] r13 = this.A0T;
            if (i < r13.length) {
                C187048wM r0 = r13[i];
                r0.flush();
                this.A0U[i] = r0.BAF();
                i++;
            } else {
                return;
            }
        }
    }

    public final void A08(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0T.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0L;
                if (byteBuffer == null) {
                    byteBuffer = C187048wM.A00;
                }
            } else {
                byteBuffer = this.A0U[i - 1];
            }
            if (i == length) {
                A0C(byteBuffer, j);
            } else {
                C187048wM r1 = this.A0T[i];
                if (i > this.A02) {
                    r1.Bi4(byteBuffer);
                }
                ByteBuffer BAF = r1.BAF();
                this.A0U[i] = BAF;
                if (BAF.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    public final void A09(AudioTrack audioTrack) {
        AnonymousClass7W3 r0 = this.A0K;
        if (r0 == null) {
            r0 = new AnonymousClass7W3(this);
            this.A0K = r0;
        }
        r0.A00(audioTrack);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        r5 = X.C158327jn.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r5.containsKey(java.lang.Integer.valueOf(r4)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r4 != 18) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, 18) >= 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, r4) < 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r3 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r3 == -1) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r4 == 18) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r3 <= 8) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        throw new X.C143756zQ(r7, X.AnonymousClass000.A0P(r7, "Unable to configure passthrough for: ", X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r11 != -1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        r3 = 48000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A00 < 29) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        r3 = X.C154597dR.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r1 = com.facebook.android.exoplayer2.util.Util.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        if (r1 > 28) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r3 != 7) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        if (r1 > 26) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if ("fugu".equals(com.facebook.android.exoplayer2.util.Util.A01) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r3 != 1) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r0 = com.facebook.android.exoplayer2.util.Util.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        if (r0 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        r0 = android.util.Pair.create(java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        if (r0 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        r10 = X.C18280x3.A03(r0);
        r13 = X.C18290x4.A03(r0);
        r8 = 2;
        r19 = -1;
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        if (r3 == 3) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f4, code lost:
        if (r3 == 4) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        if (r3 != 5) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fb, code lost:
        r0 = r5.getOrDefault(java.lang.Integer.valueOf(r4), 0);
        r0.getClass();
        r3 = X.AnonymousClass001.A0K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0111, code lost:
        if (r4 != 8) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0119, code lost:
        if (java.util.Arrays.binarySearch(r1.A00, 8) >= 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011b, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017a, code lost:
        if (r0 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C166637z1 r27, int[] r28) {
        /*
            r26 = this;
            r7 = r27
            java.lang.String r3 = r7.A0S
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r3)
            r2 = 0
            r6 = r26
            if (r0 == 0) goto L_0x0052
            int r5 = r7.A0B
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0C(r5)
            X.C159197lM.A01(r0)
            int r3 = r7.A05
            int r19 = com.facebook.android.exoplayer2.util.Util.A02(r5, r3)
            X.8wM[] r14 = r6.A0g
            X.6Jh r2 = r6.A0c
            int r1 = r7.A07
            int r0 = r7.A08
            r2.A03 = r1
            r2.A02 = r0
            X.6Jg r0 = r6.A0X
            r1 = r28
            r0.A01 = r1
            int r0 = r7.A0F
            X.7kA r4 = new X.7kA
            r4.<init>(r0, r3, r5)
            int r3 = r14.length
            r2 = 0
        L_0x0039:
            if (r2 >= r3) goto L_0x017e
            r0 = r14[r2]
            X.7kA r1 = r0.AzO(r4)     // Catch:{ 6yK -> 0x004b }
            boolean r0 = r0.BGz()     // Catch:{ 6yK -> 0x004b }
            if (r0 == 0) goto L_0x0048
            r4 = r1
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004b:
            r1 = move-exception
            X.6zQ r0 = new X.6zQ
            r0.<init>((X.C166637z1) r7, (java.lang.Throwable) r1)
            throw r0
        L_0x0052:
            X.8wM[] r14 = new X.C187048wM[r2]
            int r11 = r7.A0F
            X.7jn r1 = r6.A0V
            r3.getClass()
            java.lang.String r4 = r7.A0O
            int r0 = r3.hashCode()
            switch(r0) {
                case -2123537834: goto L_0x0172;
                case -1095064472: goto L_0x016a;
                case -53558318: goto L_0x0152;
                case 187078296: goto L_0x014a;
                case 187078297: goto L_0x0141;
                case 1504578661: goto L_0x0139;
                case 1504831518: goto L_0x0130;
                case 1505942594: goto L_0x0127;
                case 1556697186: goto L_0x011e;
                default: goto L_0x0064;
            }
        L_0x0064:
            r4 = 0
        L_0x0065:
            X.8OQ r5 = X.C158327jn.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0091
            r8 = 18
            if (r4 != r8) goto L_0x010f
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r8)
            if (r0 >= 0) goto L_0x007e
            r4 = 6
        L_0x007e:
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r4)
            if (r0 < 0) goto L_0x0091
            int r3 = r7.A05
            r0 = -1
            if (r3 == r0) goto L_0x00a1
            if (r4 == r8) goto L_0x00a1
            r0 = 8
            if (r3 <= r0) goto L_0x00b1
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unable to configure passthrough for: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r0, r1)
            X.6zQ r0 = new X.6zQ
            r0.<init>((X.C166637z1) r7, (java.lang.String) r1)
            throw r0
        L_0x00a1:
            r3 = r11
            if (r11 != r0) goto L_0x00a7
            r3 = 48000(0xbb80, float:6.7262E-41)
        L_0x00a7:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x00fb
            int r3 = X.C154597dR.A00(r4, r3)
        L_0x00b1:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 28
            if (r1 > r0) goto L_0x00ce
            r0 = 7
            if (r3 != r0) goto L_0x00f0
            r3 = 8
        L_0x00bc:
            r0 = 26
            if (r1 > r0) goto L_0x00ce
            java.lang.String r1 = "fugu"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 1
            if (r3 != r0) goto L_0x00ce
            r3 = 2
        L_0x00ce:
            int r0 = com.facebook.android.exoplayer2.util.Util.A00(r3)
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            if (r0 == 0) goto L_0x0091
            int r10 = X.C18280x3.A03(r0)
            int r13 = X.C18290x4.A03(r0)
            r8 = 2
            r19 = -1
            r9 = -1
            goto L_0x018d
        L_0x00f0:
            r0 = 3
            if (r3 == r0) goto L_0x00f9
            r0 = 4
            if (r3 == r0) goto L_0x00f9
            r0 = 5
            if (r3 != r0) goto L_0x00bc
        L_0x00f9:
            r3 = 6
            goto L_0x00bc
        L_0x00fb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r5.getOrDefault(r1, r0)
            r0.getClass()
            int r3 = X.AnonymousClass001.A0K(r0)
            goto L_0x00b1
        L_0x010f:
            r3 = 8
            if (r4 != r3) goto L_0x007e
            int[] r0 = r1.A00
            int r0 = java.util.Arrays.binarySearch(r0, r3)
            if (r0 >= 0) goto L_0x007e
            r4 = 7
            goto L_0x007e
        L_0x011e:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r3.equals(r0)
            r4 = 14
            goto L_0x017a
        L_0x0127:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r3.equals(r0)
            r4 = 8
            goto L_0x017a
        L_0x0130:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r3.equals(r0)
            r4 = 9
            goto L_0x017a
        L_0x0139:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r3.equals(r0)
            r4 = 6
            goto L_0x017a
        L_0x0141:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r3.equals(r0)
            r4 = 17
            goto L_0x017a
        L_0x014a:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r3.equals(r0)
            r4 = 5
            goto L_0x017a
        L_0x0152:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x0064
            X.7Rw r0 = X.C162097rD.A02(r4)
            if (r0 == 0) goto L_0x0064
            int r0 = r0.A00
            int r4 = X.AnonymousClass6C9.A06(r0)
            goto L_0x0065
        L_0x016a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r3.equals(r0)
            r4 = 7
            goto L_0x017a
        L_0x0172:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r3.equals(r0)
            r4 = 18
        L_0x017a:
            if (r0 != 0) goto L_0x0065
            goto L_0x0064
        L_0x017e:
            int r10 = r4.A02
            int r11 = r4.A03
            int r0 = r4.A01
            int r13 = com.facebook.android.exoplayer2.util.Util.A00(r0)
            int r9 = com.facebook.android.exoplayer2.util.Util.A02(r10, r0)
            r8 = 0
        L_0x018d:
            int r12 = android.media.AudioTrack.getMinBufferSize(r11, r13, r10)
            r0 = -2
            boolean r0 = X.AnonymousClass001.A1X(r12, r0)
            X.C159197lM.A02(r0)
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r8 == 0) goto L_0x01f2
            r0 = 1
            if (r8 == r0) goto L_0x01e8
            r1 = 250000(0x3d090, float:3.50325E-40)
            r0 = 5
            if (r10 != r0) goto L_0x01a9
            r1 = 500000(0x7a120, float:7.00649E-40)
        L_0x01a9:
            int r0 = X.C1673880w.A00(r10)
            long r2 = (long) r1
            long r0 = (long) r0
        L_0x01af:
            long r0 = X.AnonymousClass6C7.A0H(r2, r0)
            int r0 = X.C159357lh.A00(r0)
        L_0x01b7:
            double r0 = (double) r0
            double r0 = r0 * r17
            int r2 = (int) r0
            int r0 = java.lang.Math.max(r12, r2)
            int r0 = r0 + r9
            int r25 = r0 + -1
            int r25 = r25 / r9
            int r25 = r25 * r9
            java.lang.String r2 = ") for: "
            if (r10 == 0) goto L_0x022d
            if (r13 == 0) goto L_0x021a
            X.7ij r1 = new X.7ij
            r21 = r9
            r22 = r11
            r23 = r13
            r24 = r10
            r17 = r7
            r18 = r14
            r20 = r8
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.media.AudioTrack r0 = r6.A0B
            if (r0 == 0) goto L_0x0217
            r6.A0H = r1
            return
        L_0x01e8:
            int r1 = X.C1673880w.A00(r10)
            r0 = 50000000(0x2faf080, float:3.6872239E-37)
            long r2 = (long) r0
            long r0 = (long) r1
            goto L_0x01af
        L_0x01f2:
            int r16 = r12 * 4
            r0 = 250000(0x3d090, float:3.50325E-40)
            long r0 = (long) r0
            long r4 = (long) r11
            long r0 = r0 * r4
            long r2 = (long) r9
            long r0 = X.AnonymousClass6C7.A0H(r0, r2)
            int r15 = X.C159357lh.A00(r0)
            r0 = 750000(0xb71b0, float:1.050974E-39)
            long r0 = (long) r0
            long r0 = r0 * r4
            long r0 = X.AnonymousClass6C7.A0H(r0, r2)
            int r1 = X.C159357lh.A00(r0)
            r0 = r16
            int r0 = X.AnonymousClass001.A0D(r0, r1, r15)
            goto L_0x01b7
        L_0x0217:
            r6.A0G = r1
            return
        L_0x021a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid output channel config (mode="
            X.C18270x1.A19(r0, r2, r1, r8)
            java.lang.String r1 = X.AnonymousClass000.A0R(r7, r1)
            X.6zQ r0 = new X.6zQ
            r0.<init>((X.C166637z1) r7, (java.lang.String) r1)
            throw r0
        L_0x022d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid output encoding (mode="
            X.C18270x1.A19(r0, r2, r1, r8)
            java.lang.String r1 = X.AnonymousClass000.A0R(r7, r1)
            X.6zQ r0 = new X.6zQ
            r0.<init>((X.C166637z1) r7, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0A(X.7z1, int[]):void");
    }

    public void A0B(C158167jX r10) {
        C158167jX r3 = new C158167jX(AnonymousClass001.A01(r10.A01, 8.0f, 0.1f), AnonymousClass001.A01(r10.A00, 8.0f, 0.1f), false, false);
        boolean z = A03().A03;
        C149127Ld A032 = A03();
        if (!r3.equals(A032.A02) || z != A032.A03) {
            C149127Ld r2 = new C149127Ld(r3, -9223372036854775807L, -9223372036854775807L, z);
            if (this.A0B != null) {
                this.A0I = r2;
            } else {
                this.A0J = r2;
            }
        }
    }

    public boolean A0D() {
        if (this.A0B == null || !this.A0W.A01(A00())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0M != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E() {
        /*
            r9 = this;
            int r8 = r9.A02
            r7 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto L_0x002c
            r9.A02 = r6
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.8wM[] r3 = r9.A0T
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.Bi3()
        L_0x001c:
            r9.A08(r1)
            boolean r0 = r0.BHW()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A02
            int r8 = r0 + 1
            r9.A02 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0M
            if (r0 == 0) goto L_0x003a
            r9.A0C(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0M
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r6
        L_0x003a:
            r9.A02 = r5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0E():boolean");
    }

    public final void A0C(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.A0M;
            boolean z = true;
            boolean z2 = false;
            if (byteBuffer2 != null) {
                C159197lM.A01(AnonymousClass000.A1Y(byteBuffer2, byteBuffer));
            } else {
                this.A0M = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            int write = this.A0B.write(byteBuffer, remaining, 1);
            this.A05 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Util.A00 >= 24 && write == -6) || write == -32) {
                    z2 = true;
                }
                C143566z6 r1 = new C143566z6(this.A0G.A07, write, z2);
                if (!r1.isRecoverable) {
                    this.A0b.A00(r1);
                    return;
                }
                throw r1;
            }
            this.A0b.A01 = null;
            AudioTrack audioTrack = this.A0B;
            if (Util.A00 >= 29) {
                audioTrack.isOffloadedPlayback();
            }
            int i = this.A0G.A04;
            if (i == 0) {
                this.A0A += (long) write;
            }
            if (write == remaining) {
                if (i != 0) {
                    if (byteBuffer != this.A0L) {
                        z = false;
                    }
                    C159197lM.A02(z);
                    this.A09 += ((long) this.A03) * ((long) this.A04);
                }
                this.A0M = null;
            }
        }
    }

    public boolean A0F(int i, int i2) {
        if (!Util.A0C(i2)) {
            if (Arrays.binarySearch(this.A0V.A00, i2) < 0) {
                return false;
            }
            if (i == -1 || i <= 8) {
                return true;
            }
            return false;
        }
        return true;
    }
}
