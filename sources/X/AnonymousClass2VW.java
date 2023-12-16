package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.2VW  reason: invalid class name */
public class AnonymousClass2VW {
    public final C183538qC A00;

    public synchronized void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) this.A00.get();
        synchronized (sigquitBasedANRDetector.A07) {
            if (!sigquitBasedANRDetector.A0A) {
                Log.i("SigquitBasedANRDetector/start called");
                HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                sigquitBasedANRDetector.A00 = handlerThread;
                handlerThread.start();
                sigquitBasedANRDetector.A08 = new Handler(sigquitBasedANRDetector.A00.getLooper());
                Log.i("SigquitBasedANRDetector/start thread started");
                SigquitBasedANRDetector.startDetector();
                sigquitBasedANRDetector.A0A = true;
                Log.i("SigquitBasedANRDetector/started");
            }
        }
    }

    public AnonymousClass2VW(C183538qC r1) {
        this.A00 = r1;
    }
}
