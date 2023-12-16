package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.BaseBundle;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4Kw  reason: invalid class name and case insensitive filesystem */
public final class C86634Kw {
    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.0f;
    }

    public static int A01(int i) {
        return i != 0 ? 0 : 4;
    }

    public static int A09(View view, int[] iArr) {
        return iArr[1] + view.getHeight();
    }

    public static ObjectAnimator A0A(Object obj, float f) {
        return ObjectAnimator.ofFloat(obj, View.ALPHA, new float[]{f});
    }

    public static Context A0B(View view, View view2) {
        view.setVisibility(0);
        return view2.getContext();
    }

    public static Intent A0D(Context context, C627736r r2, C95814uZ r3) {
        return r2.A1O(context, r3, 0);
    }

    public static MenuItem A0L(Menu menu) {
        return menu.add(0, R.id.menuitem_search, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_search);
    }

    public static ScaleAnimation A0Q(float f, float f2) {
        return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
    }

    public static String A0z(AnonymousClass36K r2, String str) {
        AnonymousClass36K A0l = r2.A0l(str);
        if (A0l != null) {
            return A0l.A0n();
        }
        return null;
    }

    public static void A1U(ArrayList arrayList, List list) {
        list.addAll(arrayList.subList(0, Math.min(arrayList.size(), 3 - list.size())));
    }

    public static void A1W(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public static int A02(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static Intent A0C(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.Settings");
        return intent;
    }

    public static ShapeDrawable A0H() {
        return new ShapeDrawable(new OvalShape());
    }

    public static C111095hX A0T(C64333Db r0) {
        return (C111095hX) r0.A0a.get();
    }

    public static C55682qk A0U(C64333Db r0) {
        return (C55682qk) r0.A75.get();
    }

    public static C620433g A0W(C64333Db r0) {
        return (C620433g) r0.A3v.get();
    }

    public static C1230066r A0X(C64333Db r0) {
        return (C1230066r) r0.A4Q.get();
    }

    public static C29301ib A0Y(C64333Db r0) {
        return (C29301ib) r0.A57.get();
    }

    public static C613330g A0a(C64333Db r0) {
        return (C613330g) r0.A6S.get();
    }

    public static AnonymousClass314 A0c(C64333Db r0) {
        return (AnonymousClass314) r0.A6v.get();
    }

    public static C66473Lo A0f(C64333Db r0) {
        return (C66473Lo) r0.A6p.get();
    }

    public static C29431io A0g(C64333Db r0) {
        return (C29431io) r0.ALT.get();
    }

    public static C620233e A0h(C64333Db r0) {
        return (C620233e) r0.AWq.get();
    }

    public static EmojiExpressionsViewModel A0i(EmojiExpressionsFragment emojiExpressionsFragment) {
        return (EmojiExpressionsViewModel) emojiExpressionsFragment.A0I.getValue();
    }

    public static C53202mi A0j(C64333Db r0) {
        return (C53202mi) r0.AXV.get();
    }

    public static C106685Zz A0m(C64333Db r0) {
        return (C106685Zz) r0.AJ4.get();
    }

    public static AnonymousClass5UP A0n(C64333Db r0) {
        return (AnonymousClass5UP) r0.ANe.get();
    }

    public static AnonymousClass1R1 A0p(C64333Db r0) {
        return (AnonymousClass1R1) r0.A56.get();
    }

    public static C113995mK A0q(C64333Db r0) {
        return (C113995mK) r0.AWt.get();
    }

    public static C56072rN A0r(C64333Db r0) {
        return (C56072rN) r0.AGN.get();
    }

    public static C104745Se A0s(C64333Db r0) {
        return (C104745Se) r0.Abv.get();
    }

    public static Iterator A11(ViewGroup viewGroup) {
        return new C13760nh(viewGroup).iterator();
    }

    public static void A15(Context context, AnonymousClass0R8 r4) {
        View view = new View(context);
        if (r4.A03() == null) {
            r4.A0H(view, new C001902e(-1, -1));
        }
    }

    public static void A17(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A18(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A1A(Pair pair, C72183dJ r2, Object obj) {
        r2.BQt(new AnonymousClass7H3(pair, obj));
    }

    public static void A1F(Window window) {
        window.requestFeature(12);
        window.requestFeature(13);
    }

    public static void A1G(Window window) {
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
    }

    public static void A1I(TextView textView) {
        textView.setText("");
    }

    public static void A1M(C06270Wx r3, String str, int i) {
        r3.A0G(new AnonymousClass7ZD(str, C72023d3.A00, new ArrayList(), i));
    }

    public static void A1Q(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C71573cK(obj, i, obj2));
    }

    public static void A1R(Object obj) {
        ((View) obj).setVisibility(8);
    }

    public static void A1S(Object obj, Object obj2) {
        C162457s7.A0J(obj, 10);
        C162457s7.A0J(obj2, 11);
    }

    public static boolean A1a(C56952sp r1) {
        return r1.A0X(450);
    }

    public static boolean A1b(C56952sp r1) {
        return r1.A0X(4023);
    }

    public static int A03(Context context) {
        return AnonymousClass0Y8.A04(context, AnonymousClass34K.A00(context));
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A05(Resources resources, TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelSize(i2, resources.getDimensionPixelSize(i));
    }

    public static int A06(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A07(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A08(View view, int i, int i2) {
        return Math.max((i - view.getMeasuredWidth()) / 2, i2);
    }

    public static Configuration A0E(View view) {
        return view.getResources().getConfiguration();
    }

    public static RectF A0F(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        conversationRowImage$RowImageView.A00();
        conversationRowImage$RowImageView.A0J = false;
        conversationRowImage$RowImageView.A0H = false;
        conversationRowImage$RowImageView.A01 = 0;
        conversationRowImage$RowImageView.A00 = 0;
        conversationRowImage$RowImageView.A0I = false;
        conversationRowImage$RowImageView.A03 = 0;
        conversationRowImage$RowImageView.A02 = 0;
        return new RectF();
    }

    public static Drawable A0G(Drawable drawable) {
        return C06130Wj.A01(drawable).mutate();
    }

    public static ForegroundColorSpan A0I(Context context, int i) {
        return new ForegroundColorSpan(AnonymousClass0Y8.A04(context, i));
    }

    public static DisplayMetrics A0J() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public static LayoutInflater A0K(C08310eF r0) {
        return r0.A0R().getLayoutInflater();
    }

    public static View A0M(ViewStub viewStub, int i) {
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static View A0N(Window window) {
        return window.getDecorView().findViewById(R.id.bot_embodiment_draggable_container);
    }

    public static ViewGroup.MarginLayoutParams A0O(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static ViewPropertyAnimator A0P(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f);
    }

    public static AnonymousClass0R8 A0R(C009707r r0) {
        AnonymousClass0R8 supportActionBar = r0.getSupportActionBar();
        C626936e.A06(supportActionBar);
        return supportActionBar;
    }

    public static C116985rC A0S(C64333Db r0) {
        return (C116985rC) r0.AOi.get();
    }

    public static AnonymousClass1RR A0V(C56972sr r0) {
        r0.A0P();
        AnonymousClass1RR r02 = r0.A01;
        C626936e.A06(r02);
        return r02;
    }

    public static AnonymousClass33U A0Z(C64333Db r0) {
        return (AnonymousClass33U) r0.A5h.get();
    }

    public static AnonymousClass67A A0b(View view) {
        return AnonymousClass31N.A01(view.getContext());
    }

    public static C53412n3 A0d(C64333Db r0) {
        return (C53412n3) r0.A93.get();
    }

    public static C56542sA A0e(C64333Db r0) {
        return (C56542sA) r0.A4v.get();
    }

    public static C27991fJ A0k(Intent intent, String str) {
        return C27991fJ.A01.A07(intent.getStringExtra(str));
    }

    public static UserJid A0l(BaseBundle baseBundle, String str) {
        return UserJid.Companion.A0E(baseBundle.getString(str));
    }

    public static C30191m3 A0o(C64333Db r0) {
        return (C30191m3) r0.ARj.get();
    }

    public static Integer A0t(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 20;
    }

    public static Integer A0u(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 21;
    }

    public static Object A0v(C06270Wx r0) {
        Object A07 = r0.A07();
        C162457s7.A0D(A07);
        return A07;
    }

    public static Object A0w(C06270Wx r0, int i) {
        return ((List) r0.A07()).get(i);
    }

    public static Object A0x(AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), (Object) null);
        return null;
    }

    public static String A0y(Context context, C150477Qw r1) {
        return r1.A00(context).toString();
    }

    public static String A10(String str, Locale locale, Object[] objArr, int i) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i));
        C162457s7.A0D(format);
        return format;
    }

    public static List A12(Intent intent, Class cls, String str) {
        return C627336j.A0B(cls, intent.getStringArrayListExtra(str));
    }

    public static void A13(Context context, Window window, int i) {
        window.setStatusBarColor(AnonymousClass0Y8.A04(context, i));
    }

    public static void A14(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(AnonymousClass0Y8.A04(context, i));
    }

    public static void A16(Context context, CreationModeBottomBar creationModeBottomBar) {
        creationModeBottomBar.A00();
        creationModeBottomBar.A0E = null;
        creationModeBottomBar.A00 = -1.0f;
        creationModeBottomBar.A04(context);
    }

    public static void A19(Transition transition) {
        transition.excludeTarget(16908335, true);
        transition.excludeTarget(16908336, true);
    }

    public static void A1B(View view, View view2, int i, int i2, int i3) {
        view2.setPadding(i, i2, i3, view.getPaddingBottom());
    }

    public static void A1C(View view, C05630Ug r1) {
        ((C002002f) view.getLayoutParams()).A01(r1);
    }

    public static void A1D(View view, C08310eF r2, int i) {
        view.setContentDescription(r2.A0X(i));
    }

    public static void A1E(ViewPropertyAnimator viewPropertyAnimator, long j) {
        viewPropertyAnimator.setDuration(j).start();
    }

    public static void A1H(LinearLayout linearLayout, int i) {
        linearLayout.setOrientation(i);
        linearLayout.setGravity(16);
    }

    public static void A1J(TextView textView, C620733j r2, long j) {
        textView.setText(AnonymousClass35V.A03(r2, j));
    }

    public static void A1K(TextView textView, NumberFormat numberFormat, long j) {
        textView.setText(numberFormat.format(j));
    }

    public static void A1L(C06270Wx r1) {
        r1.A0G(r1.A07());
    }

    public static void A1N(C153667bk r2, long j) {
        r2.A06(j);
        r2.A03(0.3f);
        r2.A05(0.1f);
        r2.A07(300);
    }

    public static void A1O(AnonymousClass6D7 r1) {
        r1.onStateChange(r1.getState());
    }

    public static void A1P(VoiceServiceEventCallback voiceServiceEventCallback, String str) {
        Log.i(str);
        voiceServiceEventCallback.voiceService.A0C();
    }

    public static void A1T(StringBuilder sb, int i) {
        sb.append(C379224o.A00(i));
    }

    public static void A1V(List list, int i) {
        list.add(Integer.valueOf(i));
    }

    public static boolean A1X(EditText editText) {
        return TextUtils.isEmpty(editText.getText());
    }

    public static boolean A1Y(C06270Wx r0) {
        return ((List) r0.A07()).isEmpty();
    }

    public static boolean A1Z(C1229466l r1, C116095pj r2) {
        return r1.B7W().A1J.equals(r2.A0N.A1J);
    }
}
