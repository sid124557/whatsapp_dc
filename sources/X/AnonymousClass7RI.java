package X;

import android.media.MediaFormat;

/* renamed from: X.7RI  reason: invalid class name */
public class AnonymousClass7RI {
    public C153037aZ A00;

    public void A00(C147787Fs r8) {
        C142616xU r5 = C142616xU.CODEC_ANDROID_AUDIO_AAC;
        AnonymousClass7JT r6 = new AnonymousClass7JT(r5);
        r6.A01 = r8.A00;
        AnonymousClass7RH r0 = r8.A01;
        if (r0 != null) {
            r6.A00 = r0.A00;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(r6.A02.value, 44100, 2);
        createAudioFormat.setInteger("aac-profile", r6.A00);
        createAudioFormat.setInteger("max-input-size", 64000);
        createAudioFormat.setInteger("bitrate", r6.A01);
        createAudioFormat.setInteger("sample-rate", 44100);
        createAudioFormat.setInteger("channel-count", 2);
        C153037aZ A02 = C162127rJ.A02(createAudioFormat, C141286vK.BUFFERS, r5.value, (String) null);
        this.A00 = A02;
        A02.A02();
    }
}
