package X;

import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.5NZ  reason: invalid class name */
public class AnonymousClass5NZ {
    public final AnonymousClass5RC A00;
    public final AnonymousClass33p A01;
    public final VoiceNoteProfileAvatarView A02;

    public void A00(C30721mu r7) {
        C116095pj r1;
        AnonymousClass5ZQ r0;
        C113895mA r12 = this.A00.A03;
        if (r12.A0D(r7)) {
            r1 = r12.A00();
            if (r1 != null) {
                r1.A09++;
            }
        } else {
            r1 = null;
        }
        int i = C116095pj.A12;
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 0;
                } else {
                    throw C86604Kt.A0h("fastPlaybackOnClick: Did not handle fastPlaybackPlayerState: ", AnonymousClass001.A0o(), i);
                }
            }
        }
        if (r1 == null || (r0 = r1.A0P) == null || !r0.A0F() || r1.A0J(i2)) {
            C116095pj.A12 = i2;
            AnonymousClass33p r2 = this.A01;
            C18260x0.A0w("wa-shared-prefs/setPttFastPlaybackPlayerState ", AnonymousClass001.A0o(), i2);
            C18270x1.A0h(C18270x1.A03(r2), "ptt_fast_playback_player_state", i2);
            AnonymousClass2z0 r02 = r7.A1J;
            boolean z = r02.A02;
            boolean A0K = C627336j.A0K(r02.A00);
            int i3 = 1;
            if (i2 != 0) {
                i3 = 2;
                if (i2 != 1) {
                    i3 = 3;
                }
            }
            this.A02.A04(i3, false, z, A0K);
        }
    }

    public AnonymousClass5NZ(AnonymousClass5RC r1, AnonymousClass33p r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = voiceNoteProfileAvatarView;
    }
}
