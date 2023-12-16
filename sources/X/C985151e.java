package X;

import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.51e  reason: invalid class name and case insensitive filesystem */
public final class C985151e extends C105395Ut {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final C50382i5 A02;
    public final C53602nM A03;
    public final AnonymousClass1VX A04;
    public final C624134x A05;
    public final C104835Sn A06;

    public C985151e(C69263Wi r13, C85244Fm r14, C50382i5 r15, C53602nM r16, AnonymousClass5ST r17, C620633i r18, C56612sH r19, C620733j r20, AnonymousClass1VX r21, C48132eP r22, C624134x r23, C104035Pj r24) {
        super(r14, r13, r18, r20, r22, r24);
        this.A04 = r21;
        this.A02 = r15;
        this.A03 = r16;
        C624134x r0 = r23;
        C626936e.A06(r0);
        this.A05 = r0;
        this.A06 = new C104835Sn(r19, 4500);
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(A03());
        AnonymousClass0x2.A0q(textEmojiLabel.getContext(), textEmojiLabel, R.color.f5nameremoved);
        textEmojiLabel.setGravity(17);
        AnonymousClass5ST r4 = r17;
        AnonymousClass5ST.A00(textEmojiLabel.getContext(), textEmojiLabel, r4);
        int A032 = (int) r4.A03(C18290x4.A0G(textEmojiLabel), r4.A02);
        textEmojiLabel.setPadding(A032, A032, A032, A032);
        this.A01 = textEmojiLabel;
        FrameLayout frameLayout = new FrameLayout(A03());
        this.A00 = frameLayout;
        C86654Ky.A17(textEmojiLabel, frameLayout, -2, 17);
    }

    public long A02() {
        return this.A06.A00;
    }

    public void A07() {
        C105395Ut.A01(this.A06, this);
    }

    public void A08() {
        this.A06.A02();
    }
}
