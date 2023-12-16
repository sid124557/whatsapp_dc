package X;

import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.5OM  reason: invalid class name */
public class AnonymousClass5OM {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public C93314oJ A04;
    public final /* synthetic */ MediaAlbumActivity A05;

    public AnonymousClass5OM(MediaAlbumActivity mediaAlbumActivity) {
        this.A05 = mediaAlbumActivity;
    }

    public int A00(int i, int i2, boolean z) {
        MediaAlbumActivity mediaAlbumActivity = this.A05;
        int max = Math.max(-mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), (((mediaAlbumActivity.A75() + i) + C86614Ku.A03(mediaAlbumActivity)) - i2) / 2);
        if (z) {
            return AnonymousClass001.A0C(i, i2, max);
        }
        return max;
    }
}
