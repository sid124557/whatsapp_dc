package X;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.whatsapp.R;
import com.whatsapp.service.BackgroundMediaControlService;
import com.whatsapp.util.Log;

/* renamed from: X.5TT  reason: invalid class name */
public class AnonymousClass5TT {
    public long A00;
    public C05610Ue A01;
    public C624134x A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C56972sr A07;
    public final AnonymousClass5UX A08;
    public final C64773Ex A09;
    public final AnonymousClass5ZU A0A;
    public final C114015mM A0B;
    public final C113895mA A0C;
    public final C620633i A0D;
    public final C54292oU A0E;
    public final AnonymousClass33T A0F;

    public void A00() {
        this.A06 = true;
        this.A0F.A05(14, "OngoingMediaNotification2");
    }

    public final void A01(RemoteViews remoteViews, boolean z) {
        int i;
        int i2;
        String str = this.A03;
        if (str != null) {
            remoteViews.setTextViewText(R.id.ongoing_media_text, str);
        }
        Context context = this.A0E.A00;
        Intent A082 = AnonymousClass0x9.A08(context, BackgroundMediaControlService.class);
        if (z) {
            A082.setAction("com.whatsapp.service.BackgroundMediaControlService.STOP");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_pause);
            i2 = R.string.f11nameremoved;
        } else {
            A082.setAction("com.whatsapp.service.BackgroundMediaControlService.START");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_play);
            i2 = R.string.f11nameremoved;
        }
        remoteViews.setContentDescription(i, context.getString(i2));
        this.A01.A0F(z);
        this.A05 = z;
        remoteViews.setOnClickPendingIntent(i, C624735e.A05(context, A082, 134217728));
        this.A01.A0E = remoteViews;
        Log.d("ongoingmedianotification/finishUpdateAndNotify");
        this.A0F.A04(14, this.A01.A01());
    }

    public AnonymousClass5TT(C56972sr r1, AnonymousClass5UX r2, C64773Ex r3, AnonymousClass5ZU r4, C114015mM r5, C113895mA r6, C620633i r7, C54292oU r8, AnonymousClass33T r9) {
        this.A0E = r8;
        this.A07 = r1;
        this.A0B = r5;
        this.A08 = r2;
        this.A09 = r3;
        this.A0D = r7;
        this.A0A = r4;
        this.A0F = r9;
        this.A0C = r6;
    }

    public void A02(C116095pj r8) {
        boolean A0I = r8.A0I();
        if (!this.A04) {
            RemoteViews remoteViews = new RemoteViews(this.A0E.A00.getPackageName(), R.layout.f8nameremoved);
            int A012 = r8.A01();
            remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, r8.A03, A012, false);
            remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (A012 / 1000)));
            A01(remoteViews, A0I);
            return;
        }
        boolean z = this.A05;
        if (!A0I ? !z : z) {
            if (!this.A06) {
                return;
            }
        }
        A01(new RemoteViews(this.A0E.A00.getPackageName(), R.layout.f8nameremoved), A0I);
        this.A06 = false;
    }
}
