package X;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ku  reason: invalid class name and case insensitive filesystem */
public final class C86614Ku {
    public static int A01(int i) {
        return i != 0 ? 8 : 0;
    }

    public static AnimationSet A0G(Animation animation, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static String A0s(Context context, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        return context.getString(i, objArr);
    }

    public static String A0t(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return intent.getStringExtra(str);
    }

    public static void A1L(ImageView imageView, Object obj, Drawable[] drawableArr) {
        drawableArr[1] = obj;
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(150);
        imageView.setImageDrawable(transitionDrawable);
    }

    public static void A1M(C08310eF r2, C08270df r3, String str) {
        C08240dc r1 = new C08240dc(r3);
        r1.A0H = true;
        r1.A0E(r2, str, R.id.search_fragment_holder);
        r1.A0I(str);
        r1.A01();
        r3.A0K();
    }

    public static void A1Q(MediaProgressRing mediaProgressRing) {
        mediaProgressRing.A06 = false;
        mediaProgressRing.A03 = new C1897492m(mediaProgressRing, 191);
        mediaProgressRing.A01 = new Paint();
        mediaProgressRing.A02 = new RectF();
    }

    public static void A1R(AnonymousClass5ZM r1, AnonymousClass4FS r2) {
        r2.BkO(r1, new Void[0]);
    }

    public static void A1V(float[] fArr, Object[] objArr, float f) {
        fArr[0] = f;
        objArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        objArr[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f});
    }

    public static boolean A1Y(C56952sp r1) {
        C162457s7.A0J(r1, 0);
        return r1.A0X(3223);
    }

    public static float A00(C88654aX r0, int i) {
        return r0.A0p.getResources().getDimension(i);
    }

    public static int A08(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static int A09(boolean z) {
        return z ? 0 : 8;
    }

    public static C69263Wi A0K(C64333Db r0) {
        return (C69263Wi) r0.AG7.get();
    }

    public static C56972sr A0L(C64333Db r0) {
        return (C56972sr) r0.AJW.get();
    }

    public static AnonymousClass64J A0N(C64333Db r0) {
        return (AnonymousClass64J) r0.AEN.get();
    }

    public static AnonymousClass5UX A0Q(C64333Db r0) {
        return (AnonymousClass5UX) r0.A6K.get();
    }

    public static AnonymousClass5UX A0R(C64333Db r0) {
        return (AnonymousClass5UX) r0.A6K.get();
    }

    public static C29421in A0S(C64333Db r0) {
        return (C29421in) r0.A6P.get();
    }

    public static C56422rx A0T(C64333Db r0) {
        return (C56422rx) r0.AZn.get();
    }

    public static C54292oU A0U(C64333Db r0) {
        return (C54292oU) r0.AaB.get();
    }

    public static AnonymousClass5ZR A0V(C64333Db r0) {
        return (AnonymousClass5ZR) r0.Aag.get();
    }

    public static AnonymousClass33p A0W(C64333Db r0) {
        return (AnonymousClass33p) r0.Aaj.get();
    }

    public static C56982ss A0X(C64333Db r0) {
        return (C56982ss) r0.A5B.get();
    }

    public static AnonymousClass31C A0c(C64333Db r0) {
        return (AnonymousClass31C) r0.AKw.get();
    }

    public static C60152y5 A0g(C64333Db r0) {
        return (C60152y5) r0.AVn.get();
    }

    public static C187958y5 A0n(C64333Db r0) {
        return (C187958y5) r0.ASM.get();
    }

    public static C187958y5 A0o(C64333Db r0) {
        return (C187958y5) r0.ASM.get();
    }

    public static Object A0r(AnonymousClass36K r1, String[] strArr, int i) {
        return C626836d.A03(r1, new C1896292a(i), strArr);
    }

    public static Collator A0w(C620733j r0) {
        return Collator.getInstance(C620733j.A01(r0.A00));
    }

    public static ArrayList A0x(C009707r r2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r2.findViewById(R.id.fab));
        arrayList.add(r2.findViewById(R.id.fab_second));
        return arrayList;
    }

    public static void A0y(Animator animator) {
        animator.setInterpolator(new DecelerateInterpolator());
    }

    public static void A0z(Animator animator, Object obj, int i) {
        animator.addListener(new C188668zI(obj, i));
    }

    public static void A13(Context context, ImagePreviewContentLayout imagePreviewContentLayout) {
        if (!imagePreviewContentLayout.A06) {
            imagePreviewContentLayout.A06 = true;
            imagePreviewContentLayout.generatedComponent();
        }
        imagePreviewContentLayout.A01 = new RectF();
        imagePreviewContentLayout.A00 = new Rect();
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, imagePreviewContentLayout, true);
        imagePreviewContentLayout.setWillNotDraw(false);
        C109255eK r0 = new C109255eK(imagePreviewContentLayout, new AnonymousClass5PQ(imagePreviewContentLayout));
        imagePreviewContentLayout.A04 = r0;
        r0.A0L = true;
    }

    public static void A1B(Drawable drawable, ImageView imageView, C620733j r3) {
        imageView.setImageDrawable(new C131666dx(drawable, r3));
    }

    public static void A1E(View view, int i, int i2) {
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i2));
    }

    public static void A1H(View view, Object obj, int i) {
        C06560Yg.A0O(view, new C1230767a(obj, i));
    }

    public static void A1J(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass92I(obj, i));
    }

    public static void A1O(C19340zH r1, Object obj, int i, int i2) {
        r1.A0Y(new C1891190b(obj, i), i2);
    }

    public static void A1U(List list, int i) {
        Collections.sort(list, new AnonymousClass91S(i));
    }

    public static int A02(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C162457s7.A0K(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Number) animatedValue).intValue();
    }

    public static int A03(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A04(Context context, int i) {
        return i == 0 ? AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved) : R.color.f5nameremoved;
    }

    public static int A05(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static int A06(C06270Wx r0) {
        return ((List) r0.A07()).size();
    }

    public static int A07(AbstractList abstractList, int i) {
        return ((Number) abstractList.get(i)).intValue();
    }

    public static Activity A0A(View view) {
        return C621633u.A01(view.getContext(), C89654ea.class);
    }

    public static Context A0B(View view) {
        Context context = view.getContext();
        C162457s7.A0D(context);
        return context;
    }

    public static Resources.Theme A0C(View view) {
        return view.getContext().getTheme();
    }

    public static Bundle A0D(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static DisplayMetrics A0E(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static View A0F(View view, int i) {
        return ((ViewStub) C06560Yg.A02(view, i)).inflate();
    }

    public static ImageView A0H(View view) {
        return new ImageView(view.getContext());
    }

    public static TextView A0I(View view) {
        return (TextView) view.findViewById(R.id.title);
    }

    public static C57012sv A0J(C64333Db r0) {
        return (C57012sv) r0.A0Z.get();
    }

    public static TextEmojiLabel A0M(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (TextEmojiLabel) A02;
    }

    public static C614930z A0O(C64333Db r0) {
        return (C614930z) r0.A0Q.get();
    }

    public static C44772Xk A0P(C64333Db r0) {
        return (C44772Xk) r0.A6I.get();
    }

    public static C28891hw A0Y(C64333Db r0) {
        return (C28891hw) r0.A6s.get();
    }

    public static C66543Lv A0Z(C64333Db r0) {
        return (C66543Lv) r0.A71.get();
    }

    public static C72303dV A0a(C64333Db r0) {
        return (C72303dV) r0.AMC.get();
    }

    public static C28071fd A0b(C64333Db r0) {
        return (C28071fd) r0.AJC.get();
    }

    public static WhatsAppLibLoader A0d(C64333Db r0) {
        return (WhatsAppLibLoader) r0.AbT.get();
    }

    public static C1907099n A0e(C64333Db r0) {
        return (C1907099n) r0.AQ8.get();
    }

    public static AnonymousClass9U4 A0f(C64333Db r0) {
        return (AnonymousClass9U4) r0.AQC.get();
    }

    public static AnonymousClass2z0 A0h(Iterator it) {
        return ((C624134x) it.next()).A1J;
    }

    public static AnonymousClass317 A0i(C64333Db r0) {
        return (AnonymousClass317) r0.ATf.get();
    }

    public static C105025Tg A0j(C64333Db r0) {
        return (C105025Tg) r0.AK5.get();
    }

    public static C105055Tk A0k(C64333Db r0) {
        return (C105055Tk) r0.A0b.get();
    }

    public static C106165Xw A0l(C64333Db r0) {
        return (C106165Xw) r0.A0c.get();
    }

    public static C989053r A0m(C64333Db r0) {
        return (C989053r) r0.AJl.get();
    }

    public static WDSButton A0p(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (WDSButton) A02;
    }

    public static Long A0q(SharedPreferences sharedPreferences, String str, long j) {
        return Long.valueOf(sharedPreferences.getLong(str, j));
    }

    public static String A0u(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0v(C620733j r1, int i, long j) {
        return new SimpleDateFormat(r1.A0A(i), C620733j.A01(r1.A00)).format(new Date(j));
    }

    public static void A10(Context context, Paint paint, int i) {
        paint.setColor(AnonymousClass0Y8.A04(context, i));
    }

    public static void A11(Context context, View view, int i) {
        view.setBackground(AnonymousClass0RP.A00(context, i));
    }

    public static void A12(Context context, TextView textView, C150477Qw r2) {
        textView.setText(r2.A00(context));
    }

    public static void A14(Intent intent, View view) {
        view.getContext().startActivity(intent);
    }

    public static void A15(Resources resources, View view, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static void A16(Resources resources, TextView textView, Object[] objArr, int i, int i2) {
        textView.setText(resources.getQuantityString(i, i2, objArr));
    }

    public static void A17(Bitmap bitmap, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(bitmap.getWidth());
    }

    public static void A18(Path path, View view) {
        path.lineTo((float) ((view.getWidth() * 9) / 10), (float) ((view.getHeight() * 3) / 4));
    }

    public static void A19(Path path, View view) {
        path.moveTo((float) ((view.getWidth() * 9) / 10), (float) ((view.getHeight() * 9) / 10));
    }

    public static void A1A(Path path, List list, int i) {
        path.lineTo(((PointF) list.get(i)).x, ((PointF) list.get(i)).y);
    }

    public static void A1C(TypedValue typedValue, View view) {
        view.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static void A1D(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void A1F(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1G(View view, WebPagePreviewView webPagePreviewView, int i) {
        view.setVisibility(i);
        if (webPagePreviewView.A0U.A0X(2652)) {
            webPagePreviewView.A0K.setVisibility(i);
        }
    }

    public static void A1I(ViewGroup viewGroup, ConversationAttachmentContentView conversationAttachmentContentView, int i, int i2) {
        C133366hE r0 = new C133366hE(conversationAttachmentContentView.getContext(), conversationAttachmentContentView);
        r0.A01 = i;
        r0.A00 = i2;
        viewGroup.addView(r0);
    }

    public static void A1K(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new DecelerateInterpolator());
    }

    public static void A1N(C158827kc r2, long j) {
        r2.A03(System.nanoTime() - j);
    }

    public static void A1P(C64773Ex r0, C95814uZ r1, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A0A(r1));
    }

    public static void A1S(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, i);
        C162457s7.A0J(obj2, 3);
    }

    public static void A1T(Object obj, AbstractCollection abstractCollection) {
        if (!abstractCollection.contains(obj)) {
            abstractCollection.add(obj);
        }
    }

    public static boolean A1W(C06270Wx r0, Object obj) {
        return obj.equals(r0.A07());
    }

    public static boolean A1X(C56962sq r1, Jid jid) {
        return r1.A0P(AnonymousClass32Y.A05(jid));
    }

    public static boolean A1Z(C30471mV r0) {
        return TextUtils.isEmpty(r0.A1w());
    }

    public static boolean A1a(AnonymousClass4C1 r0) {
        return ((Boolean) r0.get()).booleanValue();
    }

    public static boolean A1b(AnonymousClass66R r1) {
        return ((InAppBugReportingViewModel) r1.getValue()).A0A.A0X(4697);
    }
}
