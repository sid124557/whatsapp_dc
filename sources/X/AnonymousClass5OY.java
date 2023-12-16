package X;

import com.whatsapp.expressionstray.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmoji$job$1;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.5OY  reason: invalid class name */
public final class AnonymousClass5OY {
    public AnonymousClass4C6 A00;
    public final AnonymousClass5Y0 A01;
    public final C104185Pz A02;
    public final AnonymousClass4FS A03;
    public final HashMap A04 = AnonymousClass001.A0t();
    public final AnonymousClass66R A05 = C154517dI.A01(new C119615xG(this));
    public final C73853gB A06;

    public AnonymousClass5OY(AnonymousClass5Y0 r2, C104185Pz r3, AnonymousClass4FS r4, C73853gB r5) {
        C18260x0.A0c(r4, r2, r5, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = r5;
        this.A02 = r3;
    }

    public final void A00(C157857j0 r14, EmojiImageView emojiImageView, Integer num, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("emoji_");
        long j2 = j;
        A0o.append(j2);
        A0o.append('/');
        C157857j0 r7 = r14;
        AnonymousClass5RP r8 = new AnonymousClass5RP(AnonymousClass000.A0R(r14, A0o));
        if (!C162457s7.A0P(emojiImageView.getTag(), r8)) {
            emojiImageView.A04 = null;
            emojiImageView.A02 = null;
            emojiImageView.A03 = false;
            emojiImageView.setContentDescription((CharSequence) null);
        }
        emojiImageView.setTag(r8);
        HashMap hashMap = this.A04;
        C85474Gj r0 = (C85474Gj) hashMap.remove(r8);
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        Integer num2 = num;
        C104775Sh r6 = new C104775Sh(r7, r8, num2, AnonymousClass0x9.A14(emojiImageView), j2);
        AnonymousClass4C6 r5 = this.A00;
        if (r5 == null) {
            Executor executor = (Executor) this.A05.getValue();
            C162457s7.A0D(executor);
            r5 = AnonymousClass349.A02(C616031m.A00(new AnonymousClass46P(executor), new AnonymousClass46U((C85474Gj) null)));
            this.A00 = r5;
        }
        if (num != null) {
            this.A02.A00(num2.intValue(), "emoji_image_loader_launch", (String) null);
        }
        hashMap.put(r8, C616131n.A02((C85494Gl) null, new EmojiImageViewLoader$loadEmoji$job$1(r6, this, (C84814Du) null), r5, (AnonymousClass20D) null, 3));
    }
}
