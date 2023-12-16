package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import java.io.File;

/* renamed from: X.5al  reason: invalid class name and case insensitive filesystem */
public class C107135al {
    public static void A02(C620733j r4, C30721mu r5, C183028pN r6, AudioPlayerView audioPlayerView) {
        int intValue;
        long j;
        Number A0p = AnonymousClass0x9.A0p(r5.A1J, C116095pj.A13);
        if (A0p == null) {
            intValue = 0;
        } else {
            intValue = A0p.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = 0;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r5.A0B * 1000);
        if (valueOf != null) {
            i = intValue;
        }
        audioPlayerView.setSeekbarProgress(i);
        if (valueOf != null) {
            j = (long) intValue;
        } else {
            j = 0;
        }
        audioPlayerView.setSeekbarContentDescription(j);
        r6.BYH(1, C107565bW.A0G(r4, r5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1.A0F == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View.OnClickListener r4, android.view.View.OnClickListener r5, android.view.View.OnClickListener r6, android.view.View.OnClickListener r7, X.C30721mu r8, X.C183048pP r9, com.whatsapp.search.views.itemviews.AudioPlayerView r10) {
        /*
            X.33C r1 = X.C30471mV.A00(r8)
            boolean r0 = X.C627636p.A0z(r8)
            r3 = 0
            if (r0 == 0) goto L_0x001a
            r0 = 4
            r10.setPlayButtonState(r0)
            r10.setOnControlButtonClickListener(r4)
            r10.setSeekbarProgress(r3)
            r0 = 1
            r9.BcJ(r0)
            return
        L_0x001a:
            boolean r0 = X.C627636p.A10(r8)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r8.A1x()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 == 0) goto L_0x0034
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.getName()
            r8.A06 = r0
        L_0x0034:
            android.content.Context r1 = r10.getContext()
            r0 = 2131101955(0x7f060903, float:1.7816334E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r10.setSeekbarColor(r0)
            r10.setOnControlButtonClickListener(r7)
        L_0x0045:
            r9.BcJ(r3)
            return
        L_0x0049:
            X.33C r1 = r8.A01
            X.2z0 r0 = r8.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            java.io.File r1 = r1.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r2 = 2
            r3 = 3
            if (r0 == 0) goto L_0x0072
            r10.setPlayButtonState(r2)
            r10.setOnControlButtonClickListener(r5)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101955(0x7f060903, float:1.7816334E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r10.setSeekbarColor(r0)
            goto L_0x0045
        L_0x0072:
            r10.setPlayButtonState(r3)
            r10.setOnControlButtonClickListener(r6)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101955(0x7f060903, float:1.7816334E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r10.setSeekbarColor(r0)
            r9.BcJ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107135al.A00(android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, X.1mu, X.8pP, com.whatsapp.search.views.itemviews.AudioPlayerView):void");
    }

    public static void A01(C1229466l r3, C113895mA r4, C620733j r5, C30721mu r6, C183028pN r7, AudioPlayerView audioPlayerView) {
        if (!r4.A0D(r6) || r4.A0C()) {
            A02(r5, r6, r7, audioPlayerView);
            return;
        }
        C116095pj A00 = r4.A00();
        if (A00 != null) {
            if (!A00.A0I()) {
                A02(r5, r6, r7, audioPlayerView);
            } else {
                audioPlayerView.setPlayButtonState(1);
                r7.BYH(0, C107565bW.A0A(r5, (long) (A00.A01() / 1000)));
            }
            audioPlayerView.setSeekbarContentDescription((long) A00.A01());
            A00.A0J = r3;
        }
    }

    public static boolean A03(Context context, C69263Wi r6, C30721mu r7, C183038pO r8, C105025Tg r9, C33141sV r10) {
        char c;
        File file;
        AnonymousClass33C r0;
        AnonymousClass33C A00 = C30471mV.A00(r7);
        AnonymousClass33C A002 = C30471mV.A00(r7);
        if (A002.A0c) {
            c = 0;
        } else {
            c = 1;
            if (A002.A07 != 1) {
                if (A002.A0R && (file = A002.A0F) != null) {
                    File A0a = C18310x6.A0a(Uri.fromFile(file));
                    if (!A0a.exists() || !A0a.canRead()) {
                        c = 2;
                    }
                }
                c = 3;
            }
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    File A0a2 = C18310x6.A0a(Uri.fromFile(A00.A0F));
                    if (!A0a2.exists() || !A0a2.canRead()) {
                        if (r7.A1J.A02 || (r0 = r7.A01) == null) {
                            C89654ea r02 = (C89654ea) C621633u.A01(context, C89654ea.class);
                            if (r02 != null) {
                                r9.A01(r02);
                                return false;
                            }
                        } else {
                            r0.A0Z = true;
                            r10.A0G(r7);
                            r8.BTQ();
                        }
                    }
                }
                return true;
            }
            r6.A0F(R.string.f11nameremoved, 1);
            return false;
        }
        return false;
    }
}
