package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.4Oc  reason: invalid class name and case insensitive filesystem */
public class C87124Oc extends BaseAdapter {
    public List A00;
    public final AnonymousClass5OM A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public C87124Oc(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A01 = new AnonymousClass5OM(mediaAlbumActivity);
    }

    public int getCount() {
        return C86614Ku.A08(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public int getItemViewType(int i) {
        C624134x A0R;
        C105165Tv r1 = this.A02.A00.A0M;
        List list = this.A00;
        if (list == null) {
            A0R = null;
        } else {
            A0R = C18320x8.A0R(list, i);
        }
        C626936e.A06(A0R);
        return r1.A00(A0R);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r5.A00.A00 != null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.A00
            if (r0 != 0) goto L_0x007a
            r4 = 0
        L_0x0005:
            X.C626936e.A06(r4)
            r3 = 0
            if (r8 != 0) goto L_0x0053
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            X.5kg r0 = r5.A00
            X.5Tv r1 = r0.A0M
            android.content.Context r0 = r9.getContext()
            X.4oJ r8 = r1.A03(r0, r5, r4)
            r0 = 2131431280(0x7f0b0f70, float:1.8484285E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0025
            r0.setPadding(r3, r3, r3, r3)
        L_0x0025:
            java.util.HashSet r2 = r5.A0c
            X.2z0 r1 = r4.A1J
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x003d
            r2.remove(r1)
            boolean r0 = r5.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003d
            boolean r0 = r4.A1F
            r8.A1R(r3, r0)
        L_0x003d:
            X.5OM r2 = r6.A01
            r1 = r8
            int r0 = r2.A00
            if (r0 != r7) goto L_0x004b
            int r0 = r2.A01
            r8.A02 = r0
        L_0x0048:
            r2.A04 = r1
        L_0x004a:
            return r8
        L_0x004b:
            r8.A02 = r3
            X.4oJ r0 = r2.A04
            if (r0 != r8) goto L_0x004a
            r1 = 0
            goto L_0x0048
        L_0x0053:
            X.4oJ r8 = (X.C93314oJ) r8
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            java.util.HashSet r0 = r5.A0c
            X.2z0 r2 = r4.A1J
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0070
            java.util.HashSet r0 = r5.A0b
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0070
            X.5kg r0 = r5.A00
            X.0R2 r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r8.A1q(r4, r0)
            java.util.HashSet r0 = r5.A0b
            r0.remove(r2)
            goto L_0x0025
        L_0x007a:
            X.34x r4 = X.C18320x8.A0R(r0, r7)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87124Oc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 112;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
