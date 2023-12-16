package X;

/* renamed from: X.5ll  reason: invalid class name and case insensitive filesystem */
public class C113645ll implements AnonymousClass4E8 {
    public final AnonymousClass33p A00;
    public final AnonymousClass4FV A01;

    public String BDW() {
        return "PttEventLoggerDailyCron";
    }

    public void BQW() {
        C95214so r31 = new C95214so();
        AnonymousClass33p r14 = this.A00;
        C183538qC r32 = r14.A01;
        r31.A00 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_cancel_broadcast", 0);
        r31.A01 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_cancel_group", 0);
        r31.A02 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_cancel_individual", 0);
        r31.A03 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_draft_review_broadcast", 0);
        r31.A04 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_draft_review_group", 0);
        r31.A05 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_draft_review_individual", 0);
        r31.A06 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_fast_playback_broadcast", 0);
        r31.A07 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_fast_playback_group", 0);
        r31.A08 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_fast_playback_individual", 0);
        r31.A09 = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_lock_broadcast", 0);
        r31.A0A = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_lock_group", 0);
        r31.A0B = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_lock_individual", 0);
        r31.A0I = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_playback_broadcast", 0);
        r31.A0J = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_playback_group", 0);
        r31.A0K = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_playback_individual", 0);
        r31.A0L = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_record_broadcast", 0);
        r31.A0M = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_record_group", 0);
        r31.A0N = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_record_individual", 0);
        r31.A0O = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_send_broadcast", 0);
        r31.A0P = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_send_group", 0);
        r31.A0Q = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_send_individual", 0);
        r31.A0F = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_pause_tap_broadcast", 0);
        r31.A0G = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_pause_tap_group", 0);
        r31.A0H = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_pause_tap_individual", 0);
        r31.A0E = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_out_of_chat_individual", 0);
        r31.A0C = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_out_of_chat_broadcast", 0);
        r31.A0D = C86614Ku.A0q(C18300x5.A0B(r32), "ptt_out_of_chat_group", 0);
        this.A01.BhA(r31);
        A00(r14, "ptt_cancel_broadcast", "ptt_cancel_group", "ptt_cancel_individual");
        A00(r14, "ptt_draft_review_broadcast", "ptt_draft_review_group", "ptt_draft_review_individual");
        A00(r14, "ptt_playback_broadcast", "ptt_playback_group", "ptt_playback_individual");
        A00(r14, "ptt_lock_broadcast", "ptt_lock_group", "ptt_lock_individual");
        A00(r14, "ptt_fast_playback_broadcast", "ptt_fast_playback_group", "ptt_fast_playback_individual");
        A00(r14, "ptt_record_broadcast", "ptt_record_group", "ptt_record_individual");
        A00(r14, "ptt_send_broadcast", "ptt_send_group", "ptt_send_individual");
        A00(r14, "ptt_pause_tap_broadcast", "ptt_pause_tap_group", "ptt_pause_tap_individual");
        A00(r14, "ptt_out_of_chat_individual", "ptt_out_of_chat_broadcast", "ptt_out_of_chat_group");
    }

    public /* synthetic */ void BQX() {
    }

    public C113645ll(AnonymousClass33p r1, AnonymousClass4FV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(AnonymousClass33p r1, String str, String str2, String str3) {
        r1.A0U().remove(str).apply();
        r1.A0U().remove(str2).apply();
        r1.A0U().remove(str3).apply();
    }
}
