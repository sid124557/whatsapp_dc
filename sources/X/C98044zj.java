package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.4zj  reason: invalid class name and case insensitive filesystem */
public abstract class C98044zj extends C87414Qt {
    public C69263Wi A00;
    public AnonymousClass5Ul A01;
    public C621033m A02;
    public C113895mA A03;
    public AnonymousClass5ZR A04;
    public AnonymousClass1VX A05;
    public C56232re A06;
    public C620133d A07;
    public C104295Qk A08;
    public C30721mu A09;
    public C105025Tg A0A;
    public C33141sV A0B;
    public C183538qC A0C;
    public final View.OnClickListener A0D = new C109745f7((Object) this, 42);
    public final C109665ez A0E = new C989653x(this, 34);
    public final C109665ez A0F = new C989653x(this, 32);
    public final C109665ez A0G = new C989653x(this, 33);

    public void A03() {
        C105365Uq r1;
        AnonymousClass3ZH A0A2;
        if (this instanceof C97924zW) {
            C97924zW r3 = (C97924zW) this;
            C30721mu r8 = r3.A09;
            AudioPlayerView audioPlayerView = r3.A09;
            C107135al.A00(r3.A0E, r3.A0G, r3.A0F, r3.A0D, r8, new C106455Zb(r3, 2), audioPlayerView);
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = r3.A0A;
            voiceNoteProfileAvatarView.setupIconBackgroundColor(AnonymousClass5Yj.A02(r3.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            AnonymousClass5YN.A02(r3.A09, audioPlayerView, voiceNoteProfileAvatarView);
            boolean z = r3.A0D;
            if (z) {
                C87414Qt.A01(r3, voiceNoteProfileAvatarView);
            }
            if (r3.A09.A24()) {
                voiceNoteProfileAvatarView.A06(true, 4);
            } else {
                voiceNoteProfileAvatarView.setIsForwardedByNonAuthorPttUi(false);
                ImageView imageView = voiceNoteProfileAvatarView.A05;
                AnonymousClass2z0 r12 = r3.A09.A1J;
                if (r12.A02) {
                    r1 = r3.A0E;
                    A0A2 = C86634Kw.A0V(r3.A00);
                } else {
                    ImageView imageView2 = voiceNoteProfileAvatarView.A03;
                    C95814uZ r4 = r12.A00;
                    C626936e.A06(r4);
                    C30721mu r2 = r3.A09;
                    if (AnonymousClass2z0.A0D(r2)) {
                        C95814uZ A0n = r2.A0n();
                        C626936e.A06(A0n);
                        imageView2.setVisibility(0);
                        imageView.setVisibility(8);
                        r3.A0E.A08(imageView2, r3.A01.A0A(A0n));
                    } else {
                        imageView2.setVisibility(8);
                        imageView.setVisibility(0);
                        r1 = r3.A0E;
                        A0A2 = r3.A01.A0A(r4);
                    }
                }
                r1.A08(imageView, A0A2);
            }
            int BBm = ((C185738uA) r3.A0B.get()).BBm(r3.A09.A1L);
            if (BBm >= 0) {
                audioPlayerView.setSeekbarProgress(BBm);
            }
            if (z) {
                C30721mu r13 = r3.A09;
                if (!r13.A1s(32768)) {
                    audioPlayerView.setTag((Object) null);
                    audioPlayerView.A00();
                    return;
                }
                audioPlayerView.setTag(r13.A1J);
                r3.A06.A03(r3.A09, new C71283br((Object) r3, 33));
            }
        } else if (this instanceof AnonymousClass4zX) {
            AnonymousClass4zX r42 = (AnonymousClass4zX) this;
            C30721mu r9 = r42.A09;
            AudioPlayerView audioPlayerView2 = r42.A09;
            if (audioPlayerView2 == null) {
                throw C18270x1.A0S("audioPlayerView");
            }
            C107135al.A00(r42.A0E, r42.A0G, r42.A0F, r42.A0D, r9, new C106455Zb(r42, 1), audioPlayerView2);
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView2 = r42.A0A;
            if (voiceNoteProfileAvatarView2 == null) {
                throw C18270x1.A0S("newsletterAudioProfileAvatarView");
            }
            voiceNoteProfileAvatarView2.setupIconBackgroundColor(AnonymousClass5Yj.A02(r42.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            AnonymousClass5YN.A02(r42.A09, audioPlayerView2, voiceNoteProfileAvatarView2);
            boolean z2 = r42.A0D;
            if (z2) {
                C87414Qt.A01(r42, voiceNoteProfileAvatarView2);
            }
            voiceNoteProfileAvatarView2.setIsNewsletterAudioOrPttUi(r42.A09);
            int i = 0;
            voiceNoteProfileAvatarView2.setIsForwardedByNonAuthorPttUi(false);
            ImageView imageView3 = voiceNoteProfileAvatarView2.A05;
            C162457s7.A0D(imageView3);
            ImageView imageView4 = voiceNoteProfileAvatarView2.A03;
            C162457s7.A0D(imageView4);
            C30721mu r0 = r42.A09;
            boolean A0D2 = AnonymousClass2z0.A0D(r0);
            ImageView imageView5 = imageView3;
            if (A0D2) {
                imageView5 = imageView4;
            }
            C53042mS A0z = r0.A0z();
            C95814uZ A002 = AnonymousClass2z0.A00(r42.A09);
            if (A0z != null) {
                A002 = A0z.A01;
                C626936e.A06(A002);
            }
            imageView4.setVisibility(AnonymousClass001.A08(A0D2 ? 1 : 0));
            if (A0D2) {
                i = 8;
            }
            imageView3.setVisibility(i);
            r42.A0E.A08(imageView5, r42.getContactManager().A0A(A002));
            int BBm2 = ((C185738uA) r42.getPttSavedPlaybackPositionControllerLazy().get()).BBm(r42.A09.A1L);
            if (BBm2 >= 0) {
                audioPlayerView2.setSeekbarProgress(BBm2);
            }
            if (z2) {
                C30721mu r14 = r42.A09;
                if (!r14.A1s(32768)) {
                    audioPlayerView2.setTag((Object) null);
                    audioPlayerView2.A00();
                    return;
                }
                audioPlayerView2.setTag(r14.A1J);
                C54602oz fMessageLazyDataManager = r42.getFMessageLazyDataManager();
                C30721mu r22 = r42.A09;
                C162457s7.A0C(r22);
                fMessageLazyDataManager.A03(r22, new C71283br((Object) r42, 32));
            }
        } else {
            AnonymousClass4zV r15 = (AnonymousClass4zV) this;
            C30721mu r6 = r15.A09;
            AudioPlayerView audioPlayerView3 = r15.A03;
            C107135al.A00(r15.A0E, r15.A0G, r15.A0F, r15.A0D, r6, new C106455Zb(r15, 0), audioPlayerView3);
            int BBm3 = ((C185738uA) r15.A04.get()).BBm(r15.A09.A1L);
            if (BBm3 >= 0) {
                audioPlayerView3.setSeekbarProgress(BBm3);
            }
        }
    }

    public C30721mu getFMessageAudio() {
        return this.A09;
    }

    public final void setAudioMessage(C30721mu r1) {
        this.A09 = r1;
        A03();
    }

    public C98044zj(Context context) {
        super(context);
    }
}
