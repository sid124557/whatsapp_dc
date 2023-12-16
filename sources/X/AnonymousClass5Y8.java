package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.List;

/* renamed from: X.5Y8  reason: invalid class name */
public final class AnonymousClass5Y8 {
    public final C50382i5 A00;
    public final AnonymousClass5UP A01;
    public final AnonymousClass66R A02 = C154517dI.A01(AnonymousClass8XU.A00);

    public final Long A01(Uri uri) {
        List<String> subList;
        if (uri == null || !this.A01.A01.A0X(5188)) {
            return null;
        }
        if (A08(uri)) {
            subList = uri.getPathSegments();
            C162457s7.A0D(subList);
        } else if (!A06(uri) && !A07(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        C162457s7.A0J(subList, 0);
        if (subList.size() == 1) {
            return null;
        }
        return C829745q.A07(AnonymousClass001.A0n(subList, 1));
    }

    public final String A02(Uri uri) {
        List<String> subList;
        if (A08(uri)) {
            subList = uri.getPathSegments();
            C162457s7.A0D(subList);
        } else if (!A06(uri) && !A07(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        C162457s7.A0J(subList, 0);
        int size = subList.size();
        if (size == 1 || size == 2) {
            return (String) C73723fy.A03(subList);
        }
        return null;
    }

    public final void A03(Context context, Uri uri, AnonymousClass582 r8, boolean z) {
        C89654ea r6;
        C89654ea r1;
        C89654ea r3;
        boolean A1a = C86654Ky.A1a(r8);
        AnonymousClass1VX r4 = this.A01.A01;
        if (r4.A0N(3877) == C999958z.DISABLED.value) {
            if ((context instanceof C89654ea) && (r3 = (C89654ea) context) != null) {
                this.A02.getValue();
                Intent A07 = C18320x8.A07();
                A07.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity");
                A07.putExtra("is_external_link", z);
                r3.BpY(A07, 555);
            }
        } else if (r4.A0X(3880)) {
            C18260x0.A1P(AnonymousClass001.A0o(), "Showing channels not available, action: ", r8);
            if (uri != null) {
                Activity A022 = C111095hX.A02(context);
                if (!(A022 instanceof C89654ea) || (r1 = (C89654ea) A022) == null || !AnonymousClass000.A1W(r1.A00)) {
                    this.A02.getValue();
                    Intent action = C18300x5.A07(context).setAction("com.whatsapp.intent.action.NEWSLETTER");
                    action.setAction("android.intent.action.VIEW");
                    action.setData(uri);
                    context.startActivity(action);
                    return;
                }
            }
            int ordinal = r8.ordinal();
            int i = R.string.f11nameremoved;
            if (ordinal == A1a) {
                i = R.string.f11nameremoved;
            }
            if ((context instanceof C89654ea) && (r6 = (C89654ea) context) != null) {
                r6.Bot(i);
            }
        } else {
            Intent intent = C111095hX.A02(context).getIntent();
            if ((intent == null || !intent.getBooleanExtra("is_wa", A1a)) && uri != null) {
                Intent A0D = C18310x6.A0D(uri);
                A0D.putExtra("is_wa", true);
                Intent createChooser = Intent.createChooser(A0D, context.getString(R.string.f11nameremoved));
                createChooser.putExtra("is_wa", true);
                context.startActivity(createChooser);
            }
        }
    }

    public final void A04(Context context, AnonymousClass582 r10) {
        C89654ea r2;
        Context context2 = context;
        C162457s7.A0J(r10, 1);
        if ((context instanceof C89654ea) && (r2 = (C89654ea) context2) != null) {
            C18260x0.A1P(AnonymousClass001.A0o(), "Showing update dialog for channels, action: ", r10);
            r2.A6Y(new C1234868p(r2, 1, this), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public final boolean A05(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (A00(uri)) {
            return A06(uri) || A07(uri);
        }
        return A08(uri);
    }

    public final boolean A09(Uri uri, String str) {
        if (uri == null) {
            return false;
        }
        if (A00(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C162457s7.A0D(pathSegments);
            if (!C162457s7.A0P(C73723fy.A04(pathSegments), "channel") || uri.getPathSegments().size() != 2) {
                return false;
            }
        } else if (!A08(uri) || uri.getPathSegments().size() != 1) {
            return false;
        }
        return C162457s7.A0P(uri.getLastPathSegment(), str);
    }

    public final boolean A08(Uri uri) {
        if (!SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(uri.getScheme()) || !AnonymousClass0x9.A1O(uri, "channel")) {
            return false;
        }
        return true;
    }

    public AnonymousClass5Y8(C50382i5 r2, AnonymousClass5UP r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final boolean A00(Uri uri) {
        if (C162457s7.A0P(uri.getScheme(), "http") || C162457s7.A0P(uri.getScheme(), "https")) {
            return true;
        }
        return false;
    }

    public final boolean A06(Uri uri) {
        if (("whatsapp.com".equals(uri.getHost()) || AnonymousClass0x9.A1O(uri, "www.whatsapp.com")) && A00(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C162457s7.A0D(pathSegments);
            if (!C162457s7.A0P(C73723fy.A04(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A07(Uri uri) {
        if (A00(uri) && "wa.me".equals(uri.getHost()) && A00(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C162457s7.A0D(pathSegments);
            if (!C162457s7.A0P(C73723fy.A04(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
