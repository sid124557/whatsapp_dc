package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4xJ  reason: invalid class name and case insensitive filesystem */
public final class C96954xJ extends C125676Iy {
    public final TextEmojiLabel A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final C105365Uq A03;
    public final AnonymousClass5UP A04;
    public final AnonymousClass5QQ A05;
    public final AnonymousClass5UY A06;
    public final WDSProfilePhoto A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96954xJ(View view, C105365Uq r5, AnonymousClass5UP r6, AnonymousClass5QQ r7, AnonymousClass4X6 r8) {
        super(view);
        C18260x0.A0b(r5, r7, r6, 3);
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(view, R.id.newsletter_name);
        this.A00 = textEmojiLabel;
        this.A02 = (WaTextView) C18290x4.A0M(view, R.id.newsletter_follow_count);
        WaImageView waImageView = (WaImageView) C18290x4.A0M(view, R.id.quick_follow_icon);
        this.A01 = waImageView;
        this.A07 = (WDSProfilePhoto) C18290x4.A0M(view, R.id.newsletter_directory_photo);
        this.A06 = C18290x4.A0X(view, R.id.quick_follow_progressBar_container);
        C18310x6.A19(view, r8, this, 43);
        C18310x6.A19(waImageView, this, r8, 44);
        C106905aM.A04(textEmojiLabel);
    }

    public /* bridge */ /* synthetic */ void A07(C1452374s r10) {
        C96934xH r102 = (C96934xH) r10;
        C162457s7.A0J(r102, 0);
        TextEmojiLabel textEmojiLabel = this.A00;
        AnonymousClass1RL r8 = r102.A02;
        textEmojiLabel.setText(r8.A0H);
        if (r8.A0L()) {
            boolean A0X = this.A04.A01.A0X(5276);
            int i = R.drawable.ic_verified;
            if (A0X) {
                i = R.drawable.ic_verified_blue;
            }
            textEmojiLabel.A0F(i, R.dimen.f6nameremoved);
        } else {
            textEmojiLabel.A0E();
        }
        long j = r8.A05;
        AnonymousClass5QQ r3 = this.A05;
        int A002 = r3.A00((int) j);
        String A012 = r3.A01(A002);
        C162457s7.A0J(A012, 1);
        WaTextView waTextView = this.A02;
        C86614Ku.A16(C18290x4.A0G(waTextView), waTextView, new Object[]{A012}, R.plurals.f9nameremoved, A002);
        this.A03.A08(this.A07, r102.A00);
        boolean z = r102.A01;
        AnonymousClass5UY r32 = this.A06;
        View A042 = r32.A04();
        C162457s7.A0D(A042);
        int i2 = 0;
        A042.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        WaImageView waImageView = this.A01;
        if (z) {
            i2 = 4;
        }
        waImageView.setVisibility(i2);
        waImageView.setSelected(!AnonymousClass000.A1Y(r8.A07, C372821q.GUEST));
        if (r8.A0K()) {
            r32.A06(8);
            waImageView.setVisibility(8);
        }
        boolean isSelected = waImageView.isSelected();
        Context context = waImageView.getContext();
        int i3 = R.string.f11nameremoved;
        if (isSelected) {
            i3 = R.string.f11nameremoved;
        }
        C86624Kv.A0h(context, waImageView, new Object[]{textEmojiLabel.getText()}, i3);
        C107295b4.A02(waImageView);
    }
}
