package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Q7  reason: invalid class name */
public final class AnonymousClass5Q7 {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C183538qC A02;

    public void A01(Context context, AnonymousClass21A r14, C181928na r15, AnonymousClass223 r16) {
        String str;
        C162457s7.A0J(r14, 1);
        AnonymousClass21A r0 = AnonymousClass21A.WA_CROSSPOST_STATUS_PRIVACY_SETTINGS;
        int i = R.id.crosspost_most_recent_action_runnable_key;
        if (r14 == r0) {
            i = R.id.crosspost_exit_linking_action_runnable_key;
        }
        List A12 = C18290x4.A12(new AnonymousClass5HC(new C117105rO(r15, 37), i));
        AnonymousClass5TE r3 = (AnonymousClass5TE) this.A02.get();
        C009707r r4 = (C009707r) C111095hX.A00(context);
        if (r14.ordinal() != 2) {
            str = "wa_crosspost_status_privacy_settings";
        } else {
            str = "wa_crosspost_new_status";
        }
        String A06 = C56972sr.A06(this.A01);
        AnonymousClass6A4 r5 = new AnonymousClass6A4(this, 0);
        C86614Ku.A1S(r4, 0, A06);
        AnonymousClass5H1 r6 = new AnonymousClass5H1();
        String valueOf = String.valueOf(r16.databaseValue);
        C162457s7.A0J(valueOf, 1);
        r6.A00.put("target_account_type", valueOf);
        r3.A01(r4, r5, r6, "com.bloks.www.fxcal.waffle.router.async", str, "debug", A06, A12);
    }

    public void A00(Context context, AnonymousClass21T r14) {
        AnonymousClass5H1 r6;
        AnonymousClass5TE r3 = (AnonymousClass5TE) this.A02.get();
        C009707r r4 = (C009707r) C111095hX.A00(context);
        String A06 = C56972sr.A06(this.A01);
        AnonymousClass6A4 r5 = new AnonymousClass6A4(this, 1);
        C18260x0.A0P(r4, A06);
        if (r14 != null) {
            r6 = new AnonymousClass5H1();
            String str = r14.description;
            C162457s7.A0J(str, 1);
            r6.A00.put("deeplink_destination", str);
        } else {
            r6 = null;
        }
        r3.A01(r4, r5, r6, "com.bloks.www.fxcal.settings.async", "wa_settings", "debug", A06, (List) null);
    }

    public AnonymousClass5Q7(C69263Wi r1, C56972sr r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
