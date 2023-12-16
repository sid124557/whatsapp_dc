package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.util.Log;

/* renamed from: X.5hz  reason: invalid class name and case insensitive filesystem */
public class C111375hz implements C85244Fm {
    public final C111095hX A00;
    public final AnonymousClass36Y A01;
    public final AnonymousClass1VX A02;
    public final NewsletterLinkLauncher A03;
    public final C56072rN A04;
    public final C183538qC A05;

    public void BkW(Context context, Uri uri, C624134x r4) {
        BkX(context, uri, r4, 0);
    }

    public void BkX(Context context, Uri uri, C624134x r9, int i) {
        BkY(context, uri, r9, i, 4);
    }

    public void BkY(Context context, Uri uri, C624134x r10, int i, int i2) {
        BkZ(context, uri, r10, i, i2, 5);
    }

    public void BkZ(Context context, Uri uri, C624134x r18, int i, int i2, int i3) {
        Intent intent;
        Integer valueOf;
        long j;
        Uri uri2 = uri;
        if (uri == null) {
            Log.e("linklauncher/start-activity/uri-is-null");
            return;
        }
        NewsletterLinkLauncher newsletterLinkLauncher = this.A03;
        AnonymousClass5Y8 r3 = newsletterLinkLauncher.A09;
        Context context2 = context;
        C624134x r2 = r18;
        int i4 = i2;
        if (r3.A05(uri2)) {
            String A022 = r3.A02(uri2);
            if (r3.A09(uri2, "create")) {
                newsletterLinkLauncher.A00(context2, uri2);
                return;
            } else if (r3.A09(uri2, "directory")) {
                newsletterLinkLauncher.A02(context2, uri2, false);
                return;
            } else if (!TextUtils.isEmpty(A022)) {
                if (r18 != null) {
                    valueOf = AnonymousClass36E.A06(r2.A1J.A00);
                } else {
                    int i5 = 3;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i5 = 1;
                        } else if (i4 != 3) {
                            i5 = 5;
                            if (i4 != 6) {
                                i5 = 0;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    valueOf = Integer.valueOf(i5);
                }
                Long A012 = r3.A01(uri2);
                if (A012 != null) {
                    j = A012.longValue();
                } else {
                    j = -1;
                }
                newsletterLinkLauncher.A01(context2, uri2, (C95804uY) null, AnonymousClass59N.IN_APP_LINK, A022, C18310x6.A06(valueOf), j);
                return;
            } else {
                Log.d("Uri is a valid newsletter link but not handled yet");
            }
        }
        String A002 = AnonymousClass27O.A00(uri2);
        if (!TextUtils.isEmpty(A002)) {
            Activity A023 = C111095hX.A02(context2);
            boolean A0X = this.A02.A0X(2749);
            if ((this.A04.A01() || A0X) && (A023 instanceof C009707r)) {
                AnonymousClass344.A01(JoinGroupBottomSheetFragment.A02(A002, i, false), ((C003203q) A023).getSupportFragmentManager());
                return;
            }
            intent = C18320x8.A07().setClassName(context2.getPackageName(), "com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity");
            intent.putExtra("code", A002);
        } else if (this.A01.A0B(uri2, (Uri) null) != 1) {
            intent = C627736r.A0G(context2, uri2);
            intent.putExtra("extra_entry_point", i4);
            intent.putExtra("qr_code_camera_source", i3);
        } else if (!((C183408pz) this.A05.get()).BF1(context2, uri2)) {
            this.A00.BkW(context2, uri2, r2);
            return;
        } else {
            return;
        }
        this.A00.A0A(context2, intent);
    }

    public C111375hz(C111095hX r1, AnonymousClass36Y r2, AnonymousClass1VX r3, NewsletterLinkLauncher newsletterLinkLauncher, C56072rN r5, C183538qC r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = newsletterLinkLauncher;
    }
}
