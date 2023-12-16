package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.Objects;

/* renamed from: X.2dU  reason: invalid class name and case insensitive filesystem */
public class C47582dU {
    public final Context A00;
    public final AnonymousClass7KB A01;
    public final AnonymousClass5XU A02;
    public final AnonymousClass338 A03;
    public final AnonymousClass4LX A04;
    public final C18510xn A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C620633i A08;
    public final AnonymousClass33T A09;
    public final AnonymousClass1VX A0A;
    public final C55602qc A0B;
    public final AnonymousClass33X A0C;
    public final C29321id A0D;
    public final C69253Wh A0E;
    public final AnonymousClass4FS A0F;
    public final C18470xT A0G;

    public final void A00() {
        Context context = this.A00;
        C620633i r5 = this.A08;
        C69253Wh r4 = this.A0E;
        C29321id r3 = this.A0D;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C154317cy.A01(C18520xo.A04, context, intentFilter, true);
        r4.BkS(new C70143a1(r3, 30, r5));
        new C117115rP(this.A04, 6).run();
        C55602qc r1 = this.A0B;
        Objects.requireNonNull(r1);
        C70003Zm.A00(r1, 41).run();
        C154317cy.A00(this.A0G, context, new IntentFilter("com.whatsapp.alarm.WEB_RENOTIFY"), (Handler) null, C58152un.A0C, false);
        C154317cy.A01(new AnonymousClass67N(this, 3), context, new IntentFilter("android.intent.action.TIME_SET"), true);
        C18320x8.A0x(new AnonymousClass67N(this, 4), context, "android.intent.action.TIMEZONE_CHANGED", true);
        C18320x8.A0x(new C85604Gx(this, 3), context, "android.intent.action.LOCALE_CHANGED", true);
        C18320x8.A0x(new C85604Gx(this.A06, 2), context, "android.intent.action.LOCALE_CHANGED", true);
        AnonymousClass338 r12 = this.A03;
        if (!r12.A00.A0Y()) {
            C18320x8.A0x(new C85604Gx(r12, 0), context, "android.intent.action.LOCALE_CHANGED", true);
        }
        AnonymousClass7KB r2 = this.A01;
        try {
            C18320x8.A0x(r2.A00, context, "android.media.AUDIO_BECOMING_NOISY", true);
        } catch (Exception e) {
            r2.A01.A09("AudioBecomingNoisyMonitor", e.getMessage(), e);
        }
    }

    public C47582dU(Context context, AnonymousClass7KB r3, AnonymousClass5XU r4, AnonymousClass338 r5, AnonymousClass4LX r6, C18510xn r7, C64773Ex r8, AnonymousClass5ZU r9, C620633i r10, AnonymousClass33T r11, AnonymousClass1VX r12, C55602qc r13, AnonymousClass33X r14, C29321id r15, C69253Wh r16, AnonymousClass4FS r17, C18470xT r18) {
        this.A00 = context;
        this.A0A = r12;
        this.A0F = r17;
        this.A02 = r4;
        this.A06 = r8;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r6;
        this.A0E = r16;
        this.A0B = r13;
        this.A0C = r14;
        this.A05 = r7;
        this.A09 = r11;
        this.A0D = r15;
        this.A01 = r3;
        this.A03 = r5;
        this.A0G = r18;
    }
}
