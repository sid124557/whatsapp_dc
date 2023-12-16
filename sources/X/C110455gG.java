package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.5gG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110455gG implements C15830s0 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public final AnonymousClass0XY BMX(View view, AnonymousClass0XY r9) {
        MediaAlbumActivity mediaAlbumActivity = this.A03;
        View view2 = this.A00;
        View view3 = this.A01;
        View view4 = this.A02;
        C05640Uh r1 = r9.A00;
        int A032 = r1.A0D(7).A03 + C86614Ku.A03(mediaAlbumActivity);
        int i = r1.A0D(7).A00;
        view2.setPadding(0, 0, 0, A032);
        view3.setPadding(0, 0, 0, i);
        view4.setPadding(0, 0, 0, A032);
        return r9;
    }

    public /* synthetic */ C110455gG(View view, View view2, View view3, MediaAlbumActivity mediaAlbumActivity) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }
}
