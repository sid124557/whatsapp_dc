package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.4Wz  reason: invalid class name and case insensitive filesystem */
public class C88014Wz extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ PeerAvatarLayout A01;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AnonymousClass6IS(A0K(), this);
        }
        if (i == 2) {
            return new AnonymousClass6IT(A0K(), this);
        }
        throw new RuntimeException("PeerAvatarLayout/onCreateViewHolder invalid item type");
    }

    public C88014Wz(PeerAvatarLayout peerAvatarLayout) {
        this.A01 = peerAvatarLayout;
    }

    public int A0G() {
        return this.A00.size();
    }

    public final AnonymousClass4Qx A0K() {
        int i;
        PeerAvatarLayout peerAvatarLayout = this.A01;
        AnonymousClass4Qx r3 = new AnonymousClass4Qx(peerAvatarLayout.getContext());
        r3.A00 = peerAvatarLayout.A04;
        int i2 = peerAvatarLayout.A01;
        if (!(i2 == 0 || (i = peerAvatarLayout.A00) == 0)) {
            ThumbnailButton thumbnailButton = r3.A02;
            thumbnailButton.A01 = (float) C86614Ku.A05(r3, i2);
            thumbnailButton.A03 = C86624Kv.A02(r3, i);
        }
        return r3;
    }

    public void BNf(C05570Ua r8, int i) {
        List list = this.A00;
        if (((C186978wF) list.get(i)).B8k() != 1) {
            if (r8 instanceof AnonymousClass6IT) {
                AnonymousClass4Qx r3 = ((AnonymousClass6IT) r8).A00;
                A0L(r3, i, 2);
                String A0y = C86634Kw.A0y(r3.getContext(), ((AnonymousClass8FQ) list.get(i)).A00);
                r3.A02.setVisibility(8);
                ((TextView) AnonymousClass5UY.A00(r3.A03, 0)).setText(A0y);
            }
        } else if (r8 instanceof AnonymousClass6IS) {
            AnonymousClass4Qx r5 = ((AnonymousClass6IS) r8).A00;
            A0L(r5, i, 1);
            PeerAvatarLayout peerAvatarLayout = this.A01;
            C184288rY r32 = peerAvatarLayout.A07;
            if (r32 != null) {
                C105365Uq r2 = peerAvatarLayout.A08;
                AnonymousClass3ZH r0 = ((AnonymousClass8FP) list.get(i)).A00;
                ThumbnailButton thumbnailButton = r5.A02;
                r2.A05(thumbnailButton, r32, r0, true);
                thumbnailButton.setVisibility(0);
                C86634Kw.A1I((TextView) AnonymousClass5UY.A00(r5.A03, 8));
            }
        }
    }

    public int getItemViewType(int i) {
        return ((C186978wF) this.A00.get(i)).B8k();
    }

    public final void A0L(AnonymousClass4Qx r8, int i, int i2) {
        int A002;
        r8.clearAnimation();
        List list = this.A00;
        int size = list.size();
        boolean A1U = AnonymousClass000.A1U(i2, 2);
        int A003 = r8.A00(size);
        if (A1U) {
            AnonymousClass5UY r3 = r8.A03;
            ((LinearLayout.LayoutParams) r3.A05()).height = (int) (((float) A003) - r8.A02.A01);
            ((TextView) r3.A04()).setMinWidth((int) (((double) A003) * 1.5d));
        } else {
            ThumbnailButton thumbnailButton = r8.A02;
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(thumbnailButton);
            A0U.height = A003;
            A0U.width = A003;
            thumbnailButton.setLayoutParams(A0U);
            thumbnailButton.A02 = ((float) (A003 + 1)) / 2.0f;
        }
        LinearLayout.LayoutParams A0C = C86624Kv.A0C();
        if (i != 0) {
            int size2 = list.size();
            if (size2 <= 1) {
                A002 = 0;
            } else {
                A002 = (int) (((double) r8.A00(size2)) * 0.2d);
            }
            int i3 = -A002;
            if (C102805Ki.A00(this.A01.A0A)) {
                A0C.rightMargin = i3;
            } else {
                A0C.leftMargin = i3;
            }
        }
        r8.setLayoutParams(A0C);
        PeerAvatarLayout peerAvatarLayout = this.A01;
        float f = (float) (peerAvatarLayout.A02 - (peerAvatarLayout.A03 * i));
        r8.setElevation(f);
        r8.setElevation(f);
    }
}
