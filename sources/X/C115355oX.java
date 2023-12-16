package X;

import android.content.SharedPreferences;

/* renamed from: X.5oX  reason: invalid class name and case insensitive filesystem */
public class C115355oX implements C185738uA {
    public final C113895mA A00;
    public final AnonymousClass33p A01;

    public void Bm6() {
        C30721mu r0;
        C116095pj A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0N) != null) {
            A00(r0.A1L, A002.A01(), false);
        }
    }

    public void Bm7() {
        C30721mu r0;
        C116095pj A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0N) != null) {
            A00(r0.A1L, A002.A01(), true);
        }
    }

    public void Bn9(long j, int i) {
        A00(j, i, false);
    }

    public final void A00(long j, int i, boolean z) {
        AnonymousClass33p r2 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa-shared-prefs/setPttSavedPlaybackPosition ");
        A0o.append(j);
        A0o.append(" ");
        A0o.append(i);
        C18260x0.A1D(" ", A0o, z);
        SharedPreferences.Editor putInt = C18270x1.A03(r2).putInt(AnonymousClass000.A0Z("ptt_saved_playback_position_", AnonymousClass001.A0o(), j), i);
        if (z) {
            putInt.commit();
        } else {
            putInt.apply();
        }
    }

    public int BBm(long j) {
        return AnonymousClass0x2.A0F(this.A01).getInt(AnonymousClass000.A0Z("ptt_saved_playback_position_", AnonymousClass001.A0o(), j), -1);
    }

    public void BjM(long j) {
        AnonymousClass33p r2 = this.A01;
        C18260x0.A10("wa-shared-prefs/removePttSavedPlaybackPosition ", AnonymousClass001.A0o(), j);
        C18270x1.A0g(C18270x1.A03(r2), AnonymousClass000.A0Z("ptt_saved_playback_position_", AnonymousClass001.A0o(), j));
    }

    public C115355oX(C113895mA r1, AnonymousClass33p r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
