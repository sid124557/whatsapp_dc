package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.VideoTimelineView;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.4Kt  reason: invalid class name and case insensitive filesystem */
public final class C86604Kt {
    public static int A03(View view) {
        view.setVisibility(0);
        view.getLayoutParams().height = -2;
        if (view.getParent() == null) {
            return view.getWidth();
        }
        ViewParent parent = view.getParent();
        C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
        return ((View) parent).getWidth();
    }

    public static ValueAnimator A06(int i, int i2) {
        return ValueAnimator.ofInt(new int[]{i, i2});
    }

    public static Context A07(AnonymousClass66W r1) {
        C162457s7.A0J(r1, 0);
        return r1.getContext();
    }

    public static Intent A08(Context context, C64773Ex r2, C627736r r3, List list) {
        return r3.A1L(context, r2.A0A((C95814uZ) list.get(0)));
    }

    public static Paint A0B() {
        return new Paint(1);
    }

    public static View A0F(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null, false);
    }

    public static AlphaAnimation A0H() {
        return new AlphaAnimation(0.0f, 1.0f);
    }

    public static TranslateAnimation A0I(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) i, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(120);
        return translateAnimation;
    }

    public static C05550Ty A0K(C17190ui r1, Class cls) {
        C162457s7.A0J(cls, 1);
        return r1.Azr(cls);
    }

    public static String A0l(Context context, int i) {
        return context.getString(i, new Object[]{context.getString(R.string.f11nameremoved)});
    }

    public static String A0m(Context context, Object obj, int i) {
        return context.getString(i, new Object[]{obj});
    }

    public static String A0p(C620733j r5, int i, int i2) {
        return r5.A0L(new Object[]{Integer.valueOf(i)}, i2, (long) i);
    }

    public static String A0q(C620733j r4, int i, int i2, int i3) {
        Object[] objArr = new Object[1];
        objArr[i2] = Integer.valueOf(i);
        return r4.A0L(objArr, i3, (long) i);
    }

    public static void A17(Path path, View view, int i) {
        path.lineTo((float) i, (float) ((view.getHeight() * 9) / 10));
    }

    public static void A19(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1C(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1J(TextView textView) {
        textView.setAutoLinkMask(0);
        textView.setLinksClickable(false);
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    public static int[] A1b(FormItemEditText formItemEditText) {
        formItemEditText.A0G = null;
        formItemEditText.A0I = null;
        formItemEditText.A0H = null;
        formItemEditText.A06 = 0;
        formItemEditText.A00 = 24.0f;
        formItemEditText.A02 = 4.0f;
        formItemEditText.A03 = 8.0f;
        formItemEditText.A0D = new Rect();
        formItemEditText.A0K = false;
        formItemEditText.A0J = null;
        formItemEditText.A04 = 1.0f;
        formItemEditText.A05 = 2.0f;
        formItemEditText.A0M = false;
        formItemEditText.A0N = false;
        formItemEditText.A0R = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        return new int[4];
    }

    public static AlphaAnimation A0G() {
        return new AlphaAnimation(1.0f, 0.0f);
    }

    public static C05550Ty A0L(C15940sD r2, C181728nE r3, UserJid userJid) {
        return new AnonymousClass0XL((C17190ui) new AnonymousClass80O(r3, userJid), r2).A01(C87604Ty.class);
    }

    public static C64773Ex A0P(C64333Db r0) {
        return (C64773Ex) r0.A6O.get();
    }

    public static C29421in A0Q(C64333Db r0) {
        return (C29421in) r0.A6P.get();
    }

    public static AnonymousClass5ZU A0R(C64333Db r0) {
        return (AnonymousClass5ZU) r0.AaA.get();
    }

    public static C114015mM A0S(C64333Db r0) {
        return (C114015mM) r0.A6T.get();
    }

    public static C56612sH A0V(C64333Db r0) {
        return (C56612sH) r0.ASO.get();
    }

    public static C620733j A0W(C64333Db r0) {
        return (C620733j) r0.AbU.get();
    }

    public static AnonymousClass1VX A0Y(C64333Db r0) {
        return (AnonymousClass1VX) r0.A07.get();
    }

    public static AnonymousClass4FV A0Z(C64333Db r0) {
        return (AnonymousClass4FV) r0.ASY.get();
    }

    public static C95814uZ A0a(AnonymousClass3ZH r1) {
        Jid A0I = r1.A0I(C95814uZ.class);
        C626936e.A06(A0I);
        return (C95814uZ) A0I;
    }

    public static UserJid A0d(AnonymousClass3ZH r1) {
        Jid A0I = r1.A0I(UserJid.class);
        C626936e.A06(A0I);
        return (UserJid) A0I;
    }

    public static AnonymousClass4FS A0g(C64333Db r0) {
        return (AnonymousClass4FS) r0.AbX.get();
    }

    public static RuntimeException A0j() {
        C162457s7.A0M("viewModel");
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static List A0r(Intent intent) {
        return C627336j.A0B(C95814uZ.class, intent.getStringArrayListExtra("jids"));
    }

    public static void A0v(Animator.AnimatorListener animatorListener, ValueAnimator valueAnimator) {
        valueAnimator.setDuration(400);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(animatorListener);
    }

    public static void A0w(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C154177cj(obj, i));
    }

    public static void A14(SharedPreferences.Editor editor, SharedPreferences sharedPreferences, String str) {
        editor.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
    }

    public static void A1A(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A1H(View view, Animation animation) {
        animation.setDuration(300);
        view.startAnimation(animation);
    }

    public static void A1K(C004805c r1, int i) {
        r1.A5J(new AnonymousClass90H(r1, i));
    }

    public static void A1M(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new C1897492m(r1, i));
    }

    public static void A1N(C15910sA r1, C06270Wx r2, Object obj, int i) {
        r2.A0B(r1, new C1897492m(obj, i));
    }

    public static void A1O(C06270Wx r1, AnonymousClass08J r2, Object obj, int i) {
        r2.A0J(r1, new C1897492m(obj, i));
    }

    public static void A1Q(CircularRevealView circularRevealView) {
        if (!circularRevealView.A0A) {
            circularRevealView.A0A = true;
            circularRevealView.generatedComponent();
        }
        circularRevealView.A02 = 300;
        circularRevealView.A04 = new Paint(1);
        circularRevealView.A05 = new Path();
        circularRevealView.A06 = new RectF();
        circularRevealView.A07 = new C167057zh(circularRevealView);
        circularRevealView.A03 = new C188668zI(circularRevealView, 15);
    }

    public static void A1R(C117935sj r0) {
        if (r0 != null) {
            r0.A00.A01();
        }
    }

    public static void A1S(VideoTimelineView videoTimelineView) {
        videoTimelineView.A00 = 1.0f;
        videoTimelineView.A07 = -1;
        videoTimelineView.A05 = 12.0f;
        videoTimelineView.A0B = -1;
        videoTimelineView.A06 = 12.0f;
        videoTimelineView.A0C = -1;
        videoTimelineView.A08 = 855638016;
    }

    public static void A1T(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 22);
        C162457s7.A0J(obj2, 23);
        C162457s7.A0J(obj3, 24);
    }

    public static void A1U(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(' ');
    }

    public static boolean A1a(C56962sq r1, AnonymousClass3ZH r2) {
        return r1.A0P((UserJid) r2.A0I(UserJid.class));
    }

    public static float A00(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int A01(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).intValue();
    }

    public static int A02(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static int A04(View view, float f) {
        return (int) (f * ((float) (view.getResources().getDisplayMetrics().densityDpi / 160)));
    }

    public static int A05(C06270Wx r0) {
        return ((Number) r0.A07()).intValue();
    }

    public static Intent A09(C08310eF r0) {
        C003203q A0Q = r0.A0Q();
        if (A0Q != null) {
            return A0Q.getIntent();
        }
        return null;
    }

    public static Configuration A0A(C08310eF r0) {
        return r0.A0G().getResources().getConfiguration();
    }

    public static Pair A0C(int i, int i2) {
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static LayoutInflater A0D(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static LayoutInflater A0E(View view, int i) {
        C162457s7.A0J(view, i);
        return LayoutInflater.from(view.getContext());
    }

    public static ImageView A0J(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (ImageView) A02;
    }

    public static IObjectWrapper A0M(Parcel parcel, C163177tO r1, int i) {
        Parcel A01 = r1.A01(i, parcel);
        IObjectWrapper A02 = AnonymousClass6WL.A02(A01.readStrongBinder());
        A01.recycle();
        return A02;
    }

    public static C106175Xx A0N(C64333Db r0) {
        return (C106175Xx) r0.ARx.get();
    }

    public static WaTextView A0O(View view, int i) {
        View A02 = C06560Yg.A02(view, i);
        C162457s7.A0D(A02);
        return (WaTextView) A02;
    }

    public static C64223Cq A0T(C64333Db r0) {
        return (C64223Cq) r0.A6b.get();
    }

    public static C113895mA A0U(C64333Db r0) {
        return (C113895mA) r0.AKl.get();
    }

    public static C27821ej A0X(C64333Db r0) {
        return (C27821ej) r0.ATV.get();
    }

    public static C95814uZ A0b(Iterator it) {
        return ((AnonymousClass3ZH) it.next()).A0H;
    }

    public static C27991fJ A0c(Activity activity) {
        return C27991fJ.A01.A07(activity.getIntent().getStringExtra("quoted_group_jid"));
    }

    public static C66433Lk A0e(C64333Db r0) {
        return (C66433Lk) r0.AEu.get();
    }

    public static AnonymousClass30V A0f(C64333Db r0) {
        return (AnonymousClass30V) r0.ANL.get();
    }

    public static IllegalStateException A0h(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalStateException(sb.toString());
    }

    public static Object A0i(C64333Db r0) {
        return r0.A52.get();
    }

    public static String A0k() {
        String obj = UUID.randomUUID().toString();
        C162457s7.A0D(obj);
        return obj;
    }

    public static String A0n(SharedPreferences sharedPreferences, String str, StringBuilder sb) {
        sb.append(str);
        return sharedPreferences.getString(sb.toString(), (String) null);
    }

    public static String A0o(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static List A0s(C54292oU r0, int i) {
        String A08 = r0.A08(i);
        C162457s7.A0D(A08);
        List singletonList = Collections.singletonList(A08);
        C162457s7.A0D(singletonList);
        return singletonList;
    }

    public static Random A0t(VoiceParticipantAudioWave voiceParticipantAudioWave) {
        voiceParticipantAudioWave.A00();
        voiceParticipantAudioWave.A0E = new double[0];
        voiceParticipantAudioWave.A0G = new double[0];
        voiceParticipantAudioWave.A0F = new double[0];
        voiceParticipantAudioWave.A08 = new Paint(1);
        return new Random();
    }

    public static void A0u(int i, Paint paint) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A0x(Activity activity, Point point) {
        activity.getWindowManager().getDefaultDisplay().getSize(point);
    }

    public static void A0y(ProgressDialog progressDialog, CharSequence charSequence) {
        progressDialog.setMessage(charSequence);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
    }

    public static void A0z(Context context, View view, int i) {
        view.setBackgroundColor(AnonymousClass0Y8.A04(context, i));
    }

    public static void A10(Context context, ImageView imageView) {
        imageView.setImageDrawable(new ColorDrawable(AnonymousClass0Y8.A04(context, R.color.f5nameremoved)));
    }

    public static void A11(Context context, Toolbar toolbar, C620733j r3, int i) {
        toolbar.setNavigationIcon((Drawable) new C131666dx(AnonymousClass0RP.A00(context, i), r3));
    }

    public static void A12(Context context, C85244Fm r3, String str) {
        r3.BkW(context, Uri.parse(str), (C624134x) null);
    }

    public static void A13(Intent intent, Jid jid, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("jid", jid.getRawString());
    }

    public static void A15(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.edit().putInt(str, i).apply();
    }

    public static void A16(Canvas canvas, RectF rectF, float f) {
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
    }

    public static void A18(Bundle bundle, C08310eF r2, Jid jid, String str) {
        bundle.putString(str, jid.getRawString());
        r2.A0u(bundle);
    }

    public static void A1B(View view, int i) {
        C06560Yg.A02(view, i).setVisibility(8);
    }

    public static void A1D(View view, int i, int i2) {
        view.setPadding(i, i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A1E(View view, int i, int i2) {
        C06560Yg.A02(view, i).setVisibility(i2);
    }

    public static void A1F(View view, int i, int i2) {
        view.findViewById(i).setVisibility(i2);
    }

    public static void A1G(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A1I(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A1L(C009707r r0, int i) {
        r0.findViewById(i).setVisibility(8);
    }

    public static void A1P(AnonymousClass7Y4 r0, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A00);
        sb.append(" in ");
        sb.append(str2);
    }

    public static void A1V(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.hashCode());
        Log.d(sb.toString());
    }

    public static void A1W(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        sb.append("; host=");
    }

    public static void A1X(Object[] objArr, int i, int i2, int i3, int i4) {
        objArr[i2] = Integer.valueOf(i);
        objArr[i4] = Integer.valueOf(i3);
    }

    public static boolean A1Y(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static boolean A1Z(C06270Wx r0) {
        return ((Boolean) r0.A07()).booleanValue();
    }
}
