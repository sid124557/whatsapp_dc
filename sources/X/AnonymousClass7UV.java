package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.7UV  reason: invalid class name */
public final class AnonymousClass7UV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C166527yp A07;
    public final C187058wN[] A08;

    public final AudioTrack A00(C158427jx r4, int i, boolean z) {
        AudioAttributes A002;
        AudioFormat A0U = AnonymousClass6C8.A0U(this.A06, this.A02, this.A03);
        if (z) {
            A002 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A002 = r4.A00();
        }
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(A002).setAudioFormat(A0U);
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z2 = false;
        }
        return sessionId.setOffloadedPlayback(z2).build();
    }

    public AnonymousClass7UV(C166527yp r12, C187058wN[] r13, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long j;
        int i8;
        this.A07 = r12;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        int i9 = i4;
        this.A06 = i9;
        int i10 = i5;
        this.A02 = i10;
        int i11 = i6;
        this.A03 = i11;
        this.A08 = r13;
        if (i2 != 0) {
            if (i2 != 1) {
                j = 250000;
            } else {
                j = 50000000;
            }
            switch (i6) {
                case 5:
                    i8 = 160000;
                    break;
                case 6:
                case 18:
                    i8 = 768000;
                    break;
                case 7:
                    i8 = 192000;
                    break;
                case 8:
                    i8 = 2250000;
                    break;
                case 9:
                    i8 = 40000;
                    break;
                case 10:
                    i8 = 100000;
                    break;
                case 11:
                    i8 = 16000;
                    break;
                case 12:
                    i8 = 7000;
                    break;
                case 14:
                    i8 = 3062500;
                    break;
                case 15:
                    i8 = 8000;
                    break;
                case 16:
                    i8 = 256000;
                    break;
                case 17:
                    i8 = 336000;
                    break;
                default:
                    throw AnonymousClass6CA.A0N();
            }
            i7 = (int) AnonymousClass6C7.A0H(j, (long) i8);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i9, i10, i11);
            C161487pm.A04(AnonymousClass001.A1X(minBufferSize, -2));
            long j2 = (long) i9;
            int i12 = this.A05;
            i7 = AnonymousClass001.A0D(minBufferSize * 4, Math.max(minBufferSize, ((int) ((750000 * j2) / SearchActionVerificationClientService.MS_TO_NS)) * i12), ((int) ((250000 * j2) / SearchActionVerificationClientService.MS_TO_NS)) * i12);
        }
        this.A00 = i7;
    }
}
