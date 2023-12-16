package X;

import android.content.Context;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.68e  reason: invalid class name and case insensitive filesystem */
public class C1233768e implements AnonymousClass66W {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    public C1233768e(SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity) {
        this.A01 = selectedImageAndVideoAlbumActivity;
        this.A00 = selectedImageAndVideoAlbumActivity;
    }

    public String B77() {
        String str;
        AnonymousClass3ZH r1;
        AnonymousClass5ZU r0;
        UserJid A002;
        UserJid A003;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) obj;
            C87654Ud r02 = singleSelectedMessageActivity.A07;
            str = null;
            if (r02 == null) {
                throw C18270x1.A0S("singleSelectedMessageViewModel");
            }
            C624134x A1H = C86664Kz.A1H(r02.A00);
            if (!(A1H == null || (A003 = C66493Lq.A00(A1H)) == null)) {
                C64773Ex r03 = singleSelectedMessageActivity.A03;
                if (r03 != null) {
                    r1 = r03.A06(A003);
                    if (r1 != null) {
                        r0 = singleSelectedMessageActivity.A04;
                        if (r0 == null) {
                            throw C18270x1.A0S("waContactNames");
                        }
                    }
                } else {
                    throw C18270x1.A0S("contactManager");
                }
            }
            return str;
        }
        SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) obj;
        C30471mV A7A = selectedImageAndVideoAlbumActivity.A7A();
        str = null;
        if (!(A7A == null || (A002 = C66493Lq.A00(A7A)) == null)) {
            C64773Ex r04 = selectedImageAndVideoAlbumActivity.A00;
            if (r04 != null) {
                r1 = r04.A06(A002);
                if (r1 != null) {
                    r0 = selectedImageAndVideoAlbumActivity.A01;
                    if (r0 == null) {
                        throw C18270x1.A0S("waContactNames");
                    }
                }
            } else {
                throw C18270x1.A0S("contactManager");
            }
        }
        return str;
        return C18300x5.A0h(r0, r1);
    }

    public Collection BCf() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C87654Ud r0 = ((SingleSelectedMessageActivity) obj).A07;
            if (r0 == null) {
                throw C18270x1.A0S("singleSelectedMessageViewModel");
            }
            Object A07 = r0.A00.A07();
            if (A07 != null) {
                return C18290x4.A12(A07);
            }
            return null;
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = ((SelectedImageAndVideoAlbumActivity) obj).A03;
        if (selectedImageAlbumViewModel != null) {
            return C86664Kz.A1P(selectedImageAlbumViewModel.A00);
        }
        throw C18270x1.A0S("selectedImageAlbumViewModel");
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return (Context) this.A00;
    }

    public C1233768e(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        this.A01 = singleSelectedMessageActivity;
        this.A00 = singleSelectedMessageActivity;
    }
}
