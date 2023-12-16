package X;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.7zJ  reason: invalid class name and case insensitive filesystem */
public abstract class C166817zJ implements View.OnClickListener {
    public long A00;

    public void onClick(View view) {
        C186478vP r5;
        long j;
        long j2;
        boolean A1V = AnonymousClass001.A1V(((SystemClock.elapsedRealtime() - this.A00) > 500 ? 1 : ((SystemClock.elapsedRealtime() - this.A00) == 500 ? 0 : -1)));
        this.A00 = SystemClock.elapsedRealtime();
        if (A1V) {
            C138096pl r1 = (C138096pl) this;
            int i = r1.A01;
            AnonymousClass561 r52 = (AnonymousClass561) r1.A00;
            if (i != 0) {
                C186478vP r0 = r52.A03;
                if (r0 == null || r0.B6W() != 0) {
                    AnonymousClass561.A00(r52.A0F);
                    if (!r52.A0G()) {
                        AlphaAnimation alphaAnimation = r52.A00;
                        if (alphaAnimation != null) {
                            alphaAnimation.cancel();
                        }
                        r52.A05();
                    }
                    r5 = r52.A03;
                    if (r5 != null) {
                        j = r5.B6W() - ((long) SearchActionVerificationClientService.NOTIFICATION_ID);
                        if (j < 0) {
                            j = 0;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                Long l = r52.A07;
                long j3 = 0;
                if (l != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 0;
                }
                C186478vP r02 = r52.A03;
                if (r02 != null) {
                    j3 = r02.B6W();
                }
                if (j3 < j2) {
                    AnonymousClass561.A00(r52.A0D);
                    if (!r52.A0G()) {
                        AlphaAnimation alphaAnimation2 = r52.A00;
                        if (alphaAnimation2 != null) {
                            alphaAnimation2.cancel();
                        }
                        r52.A05();
                    }
                    r5 = r52.A03;
                    if (r5 != null) {
                        j = r5.B6W() + ((long) SearchActionVerificationClientService.NOTIFICATION_ID);
                        long B7A = r5.B7A();
                        if (j > B7A) {
                            j = B7A;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.Bl2(j);
            return;
        }
        AnonymousClass561 r12 = (AnonymousClass561) ((C138096pl) this).A00;
        if (r12.A0G()) {
            r12.A04();
        } else {
            r12.A05();
        }
    }
}
