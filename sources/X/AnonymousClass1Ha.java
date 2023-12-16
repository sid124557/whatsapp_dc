package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$initializeViewModel$1;

/* renamed from: X.1Ha  reason: invalid class name */
public abstract class AnonymousClass1Ha extends C89654ea {
    public boolean A00 = false;

    private void A1s() {
        AnonymousClass4HY.A00(this, 4);
    }

    public static void A1t(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().setNavigationBarColor(AnonymousClass0Y8.A04(activity, R.color.f5nameremoved));
    }

    public static Point A1j(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    public static void A1v(Context context, TextView textView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new BulletSpan((int) context.getResources().getDimension(R.dimen.f6nameremoved)), 0, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }

    public static void A1w(Uri uri, C89644eZ r3) {
        r3.A00.A0A(r3, new Intent("android.intent.action.VIEW", uri));
    }

    public static void A1x(View view, Object obj, int i) {
        view.setOnClickListener(new C634039c(obj, i));
    }

    public static void A1y(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnPreDrawListener(new AnonymousClass4IZ(obj, i));
    }

    public static void A21(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new AnonymousClass4K2(r1, i));
    }

    public static void A22(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new AnonymousClass6C6(r1, i));
    }

    public static void A24(C64333Db r1, C89644eZ r2) {
        r2.A09 = (C51072jE) r1.ATh.get();
        C107435bJ.A08(r2, r1.Ajr());
    }

    public static boolean A26(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.A0R.A00(identityVerificationActivity.A0Q);
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C89644eZ r2 = (C89644eZ) this;
            C64333Db r1 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            AnonymousClass1Hf.A2G(r1, r2);
            C107695bk r0 = r1.A00;
            A23(r1, r0, r0, r2);
            A24(r1, r2);
        }
    }

    public AnonymousClass1Ha(int i) {
        super(i);
        AnonymousClass4HY.A00(this, 4);
    }

    public static int A1i(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static View A1k(C89704el r5, int i, int i2) {
        View findViewById = r5.findViewById(i);
        findViewById.setVisibility(0);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.settings_row_icon);
        imageView.setImageDrawable(new C131656dw(AnonymousClass0RP.A00(r5, R.drawable.ic_settings_help), r5.A00));
        C107335b8.A0E(imageView, i2);
        return findViewById;
    }

    public static AnonymousClass0R8 A1l(C009707r r0, int i) {
        r0.setTitle(i);
        return r0.getSupportActionBar();
    }

    public static AnonymousClass0R8 A1m(C89644eZ r0, int i) {
        r0.setContentView(i);
        AnonymousClass0R8 supportActionBar = r0.getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
        return supportActionBar;
    }

    public static WaTextView A1n(TextView textView, NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity, int i) {
        textView.setText(i);
        Object value = newsletterAppealsOutcomeActivity.A0A.getValue();
        C162457s7.A0D(value);
        return (WaTextView) value;
    }

    public static C30791n7 A1o(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        C66543Lv A74 = p2mLiteOrderDetailsActivity.A74();
        return (C30791n7) A74.A2D.A05(p2mLiteOrderDetailsActivity.A75().A09);
    }

    public static AnonymousClass5UY A1p(C009707r r0, int i) {
        return new AnonymousClass5UY(r0.findViewById(i));
    }

    public static String A1q(Activity activity) {
        return activity.getIntent().getStringExtra("search_result_key");
    }

    public static String A1r(Activity activity) {
        return activity.getIntent().getStringExtra("extra_fds_manager_id");
    }

    public static void A1u(Activity activity, Intent intent, String str, int i) {
        intent.putExtra(str, i);
        activity.setResult(-1, intent);
    }

    public static void A1z(C009707r r1) {
        AnonymousClass0R8 supportActionBar = r1.getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
    }

    public static void A20(C009707r r0, int i) {
        r0.findViewById(i).setVisibility(8);
    }

    public static void A23(C64333Db r1, C107695bk r2, C107695bk r3, C89644eZ r4) {
        r4.A0B = (AnonymousClass487) r2.A9c.get();
        r4.A06 = (C56612sH) r1.ASO.get();
        r4.A0B = (C105895Wv) r1.AHN.get();
        r4.A01 = (C56972sr) r1.AJW.get();
        r4.A05 = (AnonymousClass310) r1.A9r.get();
        r4.A07 = (C61072zf) r1.AXI.get();
        r4.A00 = (C111095hX) r1.A0a.get();
        r4.A03 = (AnonymousClass5X8) r1.Aac.get();
        r4.A04 = (C105275Ug) r1.A0q.get();
        C107435bJ.A02((C101625Fm) r3.A7s.get(), r4);
        C107435bJ.A0A(r4, (C29321id) r1.AUK.get());
    }

    public static void A25(NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity, AnonymousClass66R r5) {
        NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel = (NewsletterSuspensionInfoViewModel) r5.getValue();
        C95804uY r4 = (C95804uY) newsletterSuspensionInfoActivity.A07.getValue();
        C162457s7.A0J(r4, 0);
        C616131n.A02((C85494Gl) null, new NewsletterSuspensionInfoViewModel$initializeViewModel$1(r4, newsletterSuspensionInfoViewModel, (C84814Du) null), AnonymousClass0IV.A00(newsletterSuspensionInfoViewModel), (AnonymousClass20D) null, 3);
    }

    public AnonymousClass1Ha() {
        AnonymousClass4HY.A00(this, 4);
    }
}
