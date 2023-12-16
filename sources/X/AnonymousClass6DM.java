package X;

import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.6DM  reason: invalid class name */
public class AnonymousClass6DM extends MediaMetadataRetriever implements Closeable {
    public void close() {
        try {
            release();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
