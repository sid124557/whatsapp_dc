package com.whatsapp.media;

import X.AnonymousClass000;
import X.AnonymousClass001;

public class OggAnalyzer {
    public static native OggFileReport examineOggStream(String str);

    public class OggAnalyzerException extends Exception {
        public final int errorCode;

        public OggAnalyzerException(int i) {
            this.errorCode = i;
        }

        public String toString() {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("OggAnalyzerException(errorCode=");
            A0o.append(this.errorCode);
            return AnonymousClass000.A0e(A0o);
        }
    }

    public class OggFileReport {
        public final int channels;
        public final float fileDurationSeconds;
        public final boolean isAudioStreamOpus;
        public final int numberOfStreams;
        public final int samplingRate;

        public OggFileReport(float f, int i, int i2, int i3, boolean z) {
            this.fileDurationSeconds = f;
            this.numberOfStreams = i;
            this.samplingRate = i2;
            this.channels = i3;
            this.isAudioStreamOpus = z;
        }

        public String toString() {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("OggFileReport(fileDurationSeconds=");
            A0o.append(this.fileDurationSeconds);
            A0o.append(", numberOfStreams=");
            A0o.append(this.numberOfStreams);
            A0o.append(", samplingRate=");
            A0o.append(this.samplingRate);
            A0o.append(", channels=");
            A0o.append(this.channels);
            A0o.append(", isAudioStreamOpus=");
            A0o.append(this.isAudioStreamOpus);
            return AnonymousClass000.A0e(A0o);
        }
    }
}
