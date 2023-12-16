package X;

import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.4ov  reason: invalid class name and case insensitive filesystem */
public final class C93634ov extends C113255l8 {
    public final MediaAlbumActivity A00;
    public final C93724pC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93634ov(AnonymousClass5M7 r4, MediaAlbumActivity mediaAlbumActivity, C93724pC r6) {
        super(r4.A00(mediaAlbumActivity));
        C86614Ku.A1S(r4, 1, r6);
        this.A00 = mediaAlbumActivity;
        this.A01 = r6;
    }

    public boolean B2s(AnonymousClass654 r9, Collection collection, int i) {
        C162457s7.A0J(collection, 1);
        if (i == 1) {
            AnonymousClass1QT r1 = this.A01.A05;
            C624134x A0b = C86654Ky.A0b(collection);
            MediaAlbumActivity mediaAlbumActivity = this.A00;
            C162457s7.A0J(A0b, 0);
            if (r1.A01.A01(A0b)) {
                C95814uZ r0 = mediaAlbumActivity.A0M;
                if (r0 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                mediaAlbumActivity.Boo(AnonymousClass25W.A00(r0, A0b));
                return true;
            }
            C95814uZ A002 = AnonymousClass2z0.A00(A0b);
            if (mediaAlbumActivity.A0D.A0X(6650)) {
                C70333aK.A00(mediaAlbumActivity.A04, mediaAlbumActivity, A002, A0b, 22);
                return true;
            }
            mediaAlbumActivity.A78(mediaAlbumActivity.A00.A0C.A0A(A002), A002, A0b);
            return true;
        } else if (i == 12) {
            return this.A01.A04.A02(this.A00, C86654Ky.A0b(collection));
        } else if (i == 15) {
            C93834pQ r3 = this.A01.A06;
            C624134x A0b2 = C86654Ky.A0b(collection);
            MediaAlbumActivity mediaAlbumActivity2 = this.A00;
            C162457s7.A0J(A0b2, 0);
            C119525x7 r7 = new C119525x7(mediaAlbumActivity2);
            C95814uZ r4 = A0b2.A1J.A00;
            if (r4 == null) {
                return false;
            }
            r3.A01.A08().A03(new C116475qL(mediaAlbumActivity2, r3, r4, A0b2, "album_media_menu_report", r7));
            return true;
        } else if (i != 31) {
            return super.B2s(r9, collection, i);
        } else {
            return this.A01.A07.A01(this.A00, C86654Ky.A0b(collection));
        }
    }
}
