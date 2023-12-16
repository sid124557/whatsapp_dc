package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;

/* renamed from: X.85m  reason: invalid class name and case insensitive filesystem */
public class C1684585m implements C186348v9 {
    public static final ByteBuffer A0K = AnonymousClass6C7.A0s(0);
    public int A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public C151867Wp A03;
    public C160727oD A04;
    public C157547iU A05;
    public C157337i8 A06;
    public ByteBuffer A07;
    public ByteBuffer A08 = A0K;
    public boolean A09;
    public ByteBuffer[] A0A;
    public ByteBuffer[] A0B;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public final C180608lL A0D;
    public final C1445471z A0E;
    public final AnonymousClass720 A0F;
    public final AnonymousClass7QR A0G;
    public volatile long A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;

    public void Bl2(long j) {
        float f = (float) j;
        C153537bV r0 = this.A0G.A05;
        if (r0 != null) {
            AnonymousClass7WV r2 = new AnonymousClass7WV(r0);
            r2.A00(C142366x5.AUDIO, this.A00);
            C159297la.A02(AnonymousClass000.A1W(r2.A00), "No track is selected");
        }
        this.A0H = (long) (f * 1.0f);
        this.A01.flush();
        this.A08 = A0K;
        this.A0J = false;
        this.A09 = false;
        this.A04.A06(this.A0H);
    }

    public void cancel() {
        this.A0I = true;
    }

    public final void A00() {
        C153007aW A002;
        C153537bV r2 = this.A0G.A05;
        if (r2 != null && (A002 = r2.A00(C142366x5.AUDIO, this.A00)) != null) {
            Iterator it = A002.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("getMediaEffect");
            }
        }
    }

    public void AzQ(int i) {
        this.A00 = i;
        ByteBuffer[] byteBufferArr = this.A03.A04;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = AnonymousClass6C7.A0s(ZipDecompressor.UNZIP_BUFFER_SIZE);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A07 = byteBuffer;
        C180608lL r4 = this.A0D;
        AnonymousClass720 r3 = this.A0F;
        AnonymousClass7QR r2 = this.A0G;
        C160727oD r0 = new C160727oD(r4, r3, r2.A07);
        this.A04 = r0;
        C153977cN.A01(r0, r2);
        this.A04.A07(C142366x5.AUDIO);
        MediaFormat A032 = this.A04.A03();
        this.A01 = MediaCodec.createDecoderByType(A032.getString("mime"));
        if (A032.containsKey("encoder-delay") && A032.getInteger("encoder-delay") > 10000) {
            A032.setInteger("encoder-delay", 0);
        }
        this.A01.configure(A032, (Surface) null, (MediaCrypto) null, 0);
        this.A01.start();
        this.A0A = this.A01.getInputBuffers();
        this.A0B = this.A01.getOutputBuffers();
    }

    public void B1J(long j) {
        int dequeueInputBuffer;
        int i;
        C157547iU r0;
        ByteBuffer byteBuffer;
        int i2;
        this.A07.clear();
        while (this.A07.hasRemaining() && !this.A09) {
            int min = Math.min(this.A07.remaining(), this.A08.remaining());
            if (min <= 0) {
                if (!this.A09) {
                    MediaCodec mediaCodec = this.A01;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A09 = true;
                            C157337i8 r02 = this.A06;
                            if (r02 != null) {
                                C153337b4 r7 = r02.A00;
                                int i3 = r7.A00;
                                int i4 = r7.A05 + ((int) ((((((float) i3) / (1.0f / 1.0f)) + ((float) r7.A06)) / (r7.A0D * 1.0f)) + 0.5f));
                                short[] sArr = r7.A0A;
                                int i5 = r7.A0H * 2;
                                short[] A042 = r7.A04(sArr, i3, i5 + i3);
                                r7.A0A = A042;
                                int i6 = 0;
                                while (true) {
                                    int i7 = r7.A0E;
                                    if (i6 >= i5 * i7) {
                                        break;
                                    }
                                    A042[(i7 * i3) + i6] = 0;
                                    i6++;
                                }
                                r7.A00 += i5;
                                r7.A01();
                                if (r7.A05 > i4) {
                                    r7.A05 = i4;
                                }
                                r7.A00 = 0;
                                r7.A09 = 0;
                                r7.A06 = 0;
                            }
                        } else {
                            ByteBuffer byteBuffer2 = this.A0B[dequeueOutputBuffer];
                            AnonymousClass6C7.A0z(bufferInfo, byteBuffer2);
                            C153337b4 r8 = this.A06.A00;
                            ShortBuffer asShortBuffer = byteBuffer2.asShortBuffer();
                            int remaining = asShortBuffer.remaining();
                            int i8 = r8.A0E;
                            int i9 = remaining / i8;
                            short[] A043 = r8.A04(r8.A0A, r8.A00, i9);
                            r8.A0A = A043;
                            asShortBuffer.get(A043, r8.A00 * i8, ((i8 * i9) * 2) / 2);
                            r8.A00 += i9;
                            r8.A01();
                            C157337i8 r82 = this.A06;
                            C153337b4 r9 = r82.A00;
                            int i10 = r9.A05 * r9.A0E * 2;
                            if (i10 > 0) {
                                if (r82.A01.capacity() < i10) {
                                    r82.A01 = AnonymousClass6C7.A0s(i10);
                                } else {
                                    r82.A01.clear();
                                }
                                ShortBuffer asShortBuffer2 = r82.A01.asShortBuffer();
                                int remaining2 = asShortBuffer2.remaining();
                                int i11 = r9.A0E;
                                int min2 = Math.min(remaining2 / i11, r9.A05);
                                asShortBuffer2.put(r9.A0B, 0, i11 * min2);
                                int i12 = r9.A05 - min2;
                                r9.A05 = i12;
                                short[] sArr2 = r9.A0B;
                                System.arraycopy(sArr2, min2 * i11, sArr2, 0, i12 * i11);
                                r82.A01.limit(i10);
                                byteBuffer = r82.A01;
                            } else {
                                byteBuffer = C157337i8.A02;
                            }
                            C157547iU r10 = this.A05;
                            if (r10 != null) {
                                int position = byteBuffer.position();
                                int limit = byteBuffer.limit();
                                int i13 = r10.A03;
                                int i14 = i13 * 2;
                                int i15 = ((limit - position) / i14) * 4;
                                if (r10.A01.capacity() < i15) {
                                    r10.A01 = AnonymousClass6C7.A0s(i15);
                                } else {
                                    r10.A01.clear();
                                }
                                r10.A02 = r10.A01;
                                while (position < limit) {
                                    int i16 = 0;
                                    short s = 0;
                                    for (int i17 = 0; i17 < i13; i17++) {
                                        short s2 = byteBuffer.getShort((i17 * 2) + position);
                                        int i18 = C157547iU.A04;
                                        int i19 = s + i18;
                                        int i20 = s2 + i18;
                                        if (i19 >= i18 || i20 >= i18) {
                                            i2 = (((i19 + i20) * 2) - ((i19 * i20) / i18)) - C157547iU.A05;
                                        } else {
                                            i2 = (i19 * i20) / i18;
                                        }
                                        int i21 = C157547iU.A05;
                                        if (i2 == i21) {
                                            i2 = i21 - 1;
                                        }
                                        s = (short) (i2 - i18);
                                    }
                                    do {
                                        r10.A02.putShort(s);
                                        i16++;
                                    } while (i16 < 2);
                                    position += i14;
                                }
                                byteBuffer.position(limit);
                                r10.A02.flip();
                                C157547iU r1 = this.A05;
                                byteBuffer = r1.A02;
                                r1.A02 = r1.A00;
                            }
                            this.A08 = byteBuffer;
                            this.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0B = this.A01.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A01.getOutputFormat();
                        this.A02 = outputFormat;
                        int integer = outputFormat.getInteger("channel-count");
                        if (integer != 2) {
                            r0 = new C157547iU(integer);
                        } else {
                            r0 = null;
                        }
                        this.A05 = r0;
                        int integer2 = this.A02.getInteger("sample-rate");
                        int integer3 = this.A02.getInteger("channel-count");
                        C153537bV r03 = this.A0G.A05;
                        if (r03 != null) {
                            AnonymousClass7WV r2 = new AnonymousClass7WV(r03);
                            r2.A00(C142366x5.AUDIO, this.A00);
                            C159297la.A02(AnonymousClass000.A1W(r2.A00), "No track is selected");
                        }
                        A00();
                        this.A06 = new C157337i8(integer2, integer3);
                    }
                }
                while (true) {
                    if (this.A0J || this.A0I || (dequeueInputBuffer = this.A01.dequeueInputBuffer(0)) < 0) {
                        break;
                    }
                    int A012 = this.A04.A01(this.A0A[dequeueInputBuffer]);
                    if (A012 <= 0) {
                        this.A01.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        this.A0J = true;
                        break;
                    }
                    AnonymousClass7B8 r04 = this.A04.A08;
                    if (r04 != null) {
                        i = r04.A00.getSampleFlags();
                    } else {
                        i = -1;
                    }
                    this.A01.queueInputBuffer(dequeueInputBuffer, 0, A012, this.A04.A02(), i);
                    this.A04.A08();
                }
            } else {
                ByteBuffer duplicate = this.A08.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A07.put(duplicate);
                ByteBuffer byteBuffer3 = this.A08;
                byteBuffer3.position(byteBuffer3.position() + min);
            }
        }
        if (this.A06 != null) {
            A00();
        }
        while (true) {
            int position2 = this.A07.position();
            int limit2 = this.A07.limit();
            ByteBuffer byteBuffer4 = this.A07;
            if (position2 < limit2) {
                byteBuffer4.put((byte) 0);
            } else {
                byteBuffer4.flip();
                return;
            }
        }
    }

    public C152527Zf B9T() {
        return null;
    }

    public boolean BHN() {
        return this.A09;
    }

    public void release() {
        AnonymousClass7VY r2 = new AnonymousClass7VY();
        AnonymousClass7RG.A00(new C188878zd(this.A01, r2));
        AnonymousClass7RG.A00(new C188878zd(r2, this.A04));
        Throwable th = r2.A01;
        if (th == null) {
            this.A07 = null;
            this.A01 = null;
            return;
        }
        throw th;
    }

    public void start() {
    }

    public C1684585m(C151867Wp r2, C180608lL r3, C1445471z r4, AnonymousClass720 r5, AnonymousClass7QR r6) {
        this.A0G = r6;
        this.A03 = r2;
        this.A0E = r4;
        this.A0D = r3;
        this.A0F = r5;
    }

    public long B1I() {
        throw C18320x8.A0m();
    }

    public long B6n() {
        throw C18320x8.A0m();
    }
}
