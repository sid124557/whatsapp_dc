package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import java.util.List;

/* renamed from: X.4zX  reason: invalid class name */
public final class AnonymousClass4zX extends C98044zj {
    public C56972sr A00;
    public C64773Ex A01;
    public C114015mM A02;
    public AnonymousClass5RC A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) C18280x3.A0E(this, R.id.search_row_newsletter_audio_metadata));
    public C620733j A05;
    public C54602oz A06;
    public C182938pE A07;
    public AnonymousClass5NZ A08;
    public AudioPlayerView A09 = ((AudioPlayerView) C18280x3.A0E(this, R.id.search_row_newsletter_audio_controls));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C18280x3.A0E(this, R.id.search_row_newsletter_audio_preview));
    public C183538qC A0B;
    public boolean A0C;
    public boolean A0D;
    public final C105365Uq A0E;

    public static final void setUpViewBasedOnMessageState$lambda$3(AnonymousClass4zX r3) {
        List A002;
        C162457s7.A0J(r3, 0);
        AudioPlayerView audioPlayerView = r3.A09;
        if (audioPlayerView == null) {
            throw C18270x1.A0S("audioPlayerView");
        } else if (audioPlayerView.getTag() != null && C162457s7.A0P(r3.A09.A1J, audioPlayerView.getTag())) {
            C30721mu r0 = r3.A09;
            C162457s7.A0C(r0);
            C60072xx r02 = r0.A00;
            if (r02 != null && (A002 = r02.A00()) != null) {
                audioPlayerView.A03(A002);
            }
        }
    }

    public final void A04() {
        AnonymousClass6AA r2 = new AnonymousClass6AA(this, 2);
        C124306Bt r1 = new C124306Bt(this, 2);
        AudioPlayerView audioPlayerView = this.A09;
        if (audioPlayerView == null) {
            throw C18270x1.A0S("audioPlayerView");
        }
        AnonymousClass684 r3 = new AnonymousClass684(r2, r1, this, audioPlayerView);
        C30721mu r6 = this.A09;
        C106515Zh r7 = new C106515Zh(this, 1);
        C107135al.A01(r3, this.A03, getWhatsAppLocale(), r6, r7, audioPlayerView);
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setFMessageLazyDataManager(C54602oz r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setMessageAudioPlayerFactory(AnonymousClass5RC r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setPttFastPlaybackControllerFactory(C182938pE r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setPttSavedPlaybackPositionControllerLazy(C183538qC r2) {
        C162457s7.A0J(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C114015mM getContactPhotos() {
        C114015mM r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final C54602oz getFMessageLazyDataManager() {
        C54602oz r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("fMessageLazyDataManager");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final AnonymousClass5RC getMessageAudioPlayerFactory() {
        AnonymousClass5RC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("messageAudioPlayerFactory");
    }

    public final C182938pE getPttFastPlaybackControllerFactory() {
        C182938pE r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pttFastPlaybackControllerFactory");
    }

    public final C183538qC getPttSavedPlaybackPositionControllerLazy() {
        C183538qC r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pttSavedPlaybackPositionControllerLazy");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public AnonymousClass4zX(Context context) {
        super(context);
        A02();
        this.A0E = getContactPhotos().A05(context, "attachment-newsletter-audio-view");
        C86634Kw.A1H(this, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        AnonymousClass5Yj.A09(context, this);
        AnonymousClass68F r6 = new AnonymousClass68F(this, 2);
        AnonymousClass90O r5 = new AnonymousClass90O(this, 2);
        AudioPlayerView audioPlayerView = this.A09;
        if (audioPlayerView == null) {
            throw C18270x1.A0S("audioPlayerView");
        }
        C110295g0 r2 = new C110295g0(this.A03, audioPlayerView, r5, r6, getPttSavedPlaybackPositionControllerLazy());
        AudioPlayerView audioPlayerView2 = this.A09;
        if (audioPlayerView2 == null) {
            throw C18270x1.A0S("audioPlayerView");
        }
        audioPlayerView2.setPlaybackListener(r2);
        boolean A0X = this.A05.A0X(1316);
        this.A0D = A0X;
        if (A0X) {
            C182938pE pttFastPlaybackControllerFactory = getPttFastPlaybackControllerFactory();
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
            if (voiceNoteProfileAvatarView == null) {
                throw C18270x1.A0S("newsletterAudioProfileAvatarView");
            }
            this.A08 = pttFastPlaybackControllerFactory.B04(voiceNoteProfileAvatarView);
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView2 = this.A0A;
            if (voiceNoteProfileAvatarView2 == null) {
                throw C18270x1.A0S("newsletterAudioProfileAvatarView");
            }
            voiceNoteProfileAvatarView2.setOnFastPlaybackButtonClickListener(new C109745f7((Object) this, 40));
        }
    }
}
