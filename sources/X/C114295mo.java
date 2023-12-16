package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.5mo  reason: invalid class name and case insensitive filesystem */
public class C114295mo implements C185708u7 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public C114295mo(View view, View view2, MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
    }

    public void BRJ(View view) {
        this.A02.onBackPressed();
    }

    public void Bbl(View view, float f) {
        float f2;
        float f3 = 1.0f - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A00.setAlpha(f2);
        this.A01.setAlpha(f2);
        this.A02.A03.setAlpha(f2);
    }

    public /* synthetic */ boolean BHS(View view) {
        return true;
    }

    public void BRe(int i) {
    }

    public void BbQ(View view) {
    }
}
