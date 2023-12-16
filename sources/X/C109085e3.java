package X;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5e3  reason: invalid class name and case insensitive filesystem */
public class C109085e3 implements RecognitionListener {
    public final /* synthetic */ AnonymousClass5SM A00;
    public final /* synthetic */ C95884uo A01;

    public C109085e3(AnonymousClass5SM r1, C95884uo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onBeginningOfSpeech() {
    }

    public void onEndOfSegmentedSession() {
        C95884uo r1 = this.A01;
        r1.A03 = false;
        r1.A03 = false;
        SpeechRecognizer speechRecognizer = r1.A01;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            r1.A01 = null;
        }
        C117105rO.A00(r1.A05, this, 18);
    }

    public void onEndOfSpeech() {
    }

    public void onError(int i) {
        AnonymousClass5SM r3 = this.A00;
        C184608sD r2 = (C184608sD) r3.A02.get();
        if (r2 != null) {
            r2.BeV(r3.A00, AnonymousClass000.A0Y("onError: ", AnonymousClass001.A0o(), i));
        }
        C95884uo r1 = this.A01;
        r1.A03 = false;
        SpeechRecognizer speechRecognizer = r1.A01;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            r1.A01 = null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = r1.A00;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
        r1.A03 = false;
        C117105rO.A00(r1.A05, this, 19);
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        AnonymousClass5SM r4 = this.A00;
        C184608sD r3 = (C184608sD) r4.A02.get();
        if (!(stringArrayList == null || stringArrayList.size() <= 0 || r3 == null)) {
            r3.BeV(r4.A00, C86664Kz.A1M(stringArrayList, 0));
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.A01.A00;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
        C95884uo r1 = this.A01;
        r1.A03 = false;
        SpeechRecognizer speechRecognizer = r1.A01;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            r1.A01 = null;
        }
        r1.A03 = false;
        C117105rO.A00(r1.A05, this, 20);
    }

    public void onSegmentResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList != null && stringArrayList.size() > 0) {
            C95884uo r4 = this.A01;
            String A0P = AnonymousClass000.A0P(AnonymousClass0x9.A0t(stringArrayList), r4.A02, AnonymousClass001.A0o());
            r4.A02 = A0P;
            AnonymousClass5SM r2 = this.A00;
            C184608sD r1 = (C184608sD) r2.A02.get();
            if (r1 != null) {
                r1.BeV(r2.A00, A0P);
            }
        }
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onPartialResults(Bundle bundle) {
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onRmsChanged(float f) {
    }
}
