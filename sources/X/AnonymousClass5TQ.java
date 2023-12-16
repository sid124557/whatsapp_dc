package X;

import android.media.AudioRecord;
import android.os.Build;
import android.os.SystemClock;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.5TQ  reason: invalid class name */
public class AnonymousClass5TQ {
    public long A00;
    public long A01;
    public boolean A02;
    public final AudioRecord A03;
    public final C69263Wi A04;
    public final C56612sH A05;
    public final OpusRecorder A06;
    public final AnonymousClass66N A07;
    public final File A08;
    public final File A09;
    public final Object A0A = AnonymousClass002.A0D();
    public final boolean A0B;
    public final short[] A0C;
    public volatile FileOutputStream A0D;

    public float A00() {
        int read;
        int i = Build.VERSION.SDK_INT;
        AudioRecord audioRecord = this.A03;
        short[] sArr = this.A0C;
        int length = sArr.length;
        if (i >= 23) {
            read = audioRecord.read(sArr, 0, length, 1);
        } else {
            read = audioRecord.read(sArr, 0, length);
        }
        if (read > 0) {
            this.A00 = 0;
            if (this.A02) {
                this.A02 = false;
                C69263Wi r2 = this.A04;
                AnonymousClass66N r1 = this.A07;
                Objects.requireNonNull(r1);
                C117105rO.A00(r2, r1, 16);
                Log.d("voicerecorder/handleAudioRecorderNoData/ audio recorder resumes returning data");
            }
        } else {
            Log.d("voicerecorder/handleAudioRecorderNoData/ audio recorder not returning data");
            long j = this.A00;
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i2 == 0) {
                this.A00 = elapsedRealtime;
            } else if (elapsedRealtime - j > 1000 && !this.A02) {
                Log.d("voicerecorder/handleAudioRecorderNoData/ audio recorder not returning data for more than 1s");
                this.A02 = true;
                C69263Wi r22 = this.A04;
                AnonymousClass66N r12 = this.A07;
                Objects.requireNonNull(r12);
                C117105rO.A00(r22, r12, 17);
            }
        }
        short s = 0;
        for (int i3 = 0; i3 < read; i3++) {
            short s2 = sArr[i3];
            if (s2 > s) {
                s = s2;
            }
        }
        if (this.A0B && read == 0) {
            return -1.0f;
        }
        float max = Math.max(0.0f, Math.min((float) ((Math.log((double) s) * 0.25d) - 1.5807000398635864d), 1.0f));
        try {
            if (!A02()) {
                return max;
            }
            this.A0D.write((int) (100.0f * max));
            return max;
        } catch (IOException e) {
            Log.e("voicerecorder/getandstorevisualizationvalue/ error writing visualization file data ", e);
            return max;
        }
    }

    public void A01() {
        this.A03.stop();
        this.A00 = 0;
        this.A02 = false;
        C69263Wi r2 = this.A04;
        AnonymousClass66N r1 = this.A07;
        Objects.requireNonNull(r1);
        C117105rO.A00(r2, r1, 16);
    }

    public final boolean A02() {
        if (this.A0D == null) {
            synchronized (this.A0A) {
                if (this.A0D == null) {
                    Log.d("voicerecorder/createVisualizationFileAndStreamAsync/doCreate");
                    try {
                        File file = this.A09;
                        if (file.createNewFile()) {
                            this.A0D = AnonymousClass0x9.A0h(file);
                            Log.d("voicerecorder/visualizationFile and stream created");
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("voicerecorder/unable to create visualization file; visualizationPath=");
                            C18260x0.A1M(A0o, file.getPath());
                        }
                    } catch (IOException e) {
                        Log.e("voicerecorder/error creating visualization file ", e);
                    }
                }
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voicerecorder/createVisualizationFileAndStreamAsync/");
        C18260x0.A1U(A0o2, AnonymousClass000.A1W(this.A0D));
        if (this.A0D == null) {
            return false;
        }
        return true;
    }

    public AnonymousClass5TQ(C69263Wi r5, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C56612sH r8, AnonymousClass1VX r9, AnonymousClass66N r10, String str) {
        this.A05 = r8;
        this.A04 = r5;
        String A0X = AnonymousClass000.A0X(".opus", AnonymousClass000.A0l(str));
        this.A08 = AnonymousClass002.A0B(A0X);
        this.A07 = r10;
        this.A06 = opusRecorderFactory.createOpusRecorder(A0X);
        this.A0B = r9.A0X(1139);
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        this.A03 = audioRecordFactory.createAudioRecord(44100, minBufferSize);
        this.A0C = new short[(((minBufferSize == -1 || minBufferSize == -2) ? 88200 : minBufferSize) / 2)];
        this.A09 = AnonymousClass002.A0B(AnonymousClass000.A0X("Visualization.data", AnonymousClass000.A0l(str)));
    }
}
