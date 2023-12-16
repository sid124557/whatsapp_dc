package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;

/* renamed from: X.7gP  reason: invalid class name and case insensitive filesystem */
public class C156307gP {
    public int A00;
    public int A01;
    public String A02;

    public static C156307gP A00(String str) {
        String string;
        AnonymousClass7B8 r5 = new AnonymousClass7B8(new MediaExtractor());
        try {
            MediaExtractor mediaExtractor = r5.A00;
            mediaExtractor.setDataSource(str);
            AnonymousClass7JU A002 = C159287lZ.A00(r5);
            if (A002 != null) {
                MediaFormat mediaFormat = A002.A01;
                C156307gP r1 = new C156307gP();
                if (mediaFormat.containsKey("channel-count")) {
                    r1.A00 = mediaFormat.getInteger("channel-count");
                    if (mediaFormat.containsKey("sample-rate")) {
                        r1.A01 = mediaFormat.getInteger("sample-rate");
                        if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                            r1.A02 = string;
                            mediaExtractor.release();
                            return r1;
                        }
                    }
                }
            }
            mediaExtractor.release();
            return null;
        } catch (AnonymousClass6O0 | IOException unused) {
            r5.A00.release();
            return null;
        } catch (Throwable th) {
            r5.A00.release();
            throw th;
        }
    }
}
